package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private UserRepo repo;
	
	@Autowired
	private PasswordEncoder pEncoder;
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String password = authentication.getCredentials().toString();
		List<Users> users = repo.findByName(username);
		if (users.size() > 0) {
			if (pEncoder.matches(password, users.get(0).getPassword())) {
				List<GrantedAuthority> authorities = new ArrayList<>();
				authorities.add(new SimpleGrantedAuthority(users.get(0).getRole()));
				return new UsernamePasswordAuthenticationToken(username, password, authorities);
			}else  {
				throw new BadCredentialsException("Invalid password");
			}
		} else {
			throw new BadCredentialsException("No user registered with this details");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

	
}
