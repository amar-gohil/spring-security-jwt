package com.security.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service(value = "userDetailsService")

public class UserDetailsServiceImpl implements UserDetailsService {

	
	
	@Override
	public UserDetails loadUserByUsername(String input) {
		
		User user = new User();
//		user = userRepository.findByEmail(input);	
		user.setEmail("admin@gmail.com");
		user.setPassword("admin");
		if (user == null)
		throw new UsernameNotFoundException("Incorrect username, password or admin id.");
		List<GrantedAuthority> authorities = new ArrayList<>();        
        authorities.add(new SimpleGrantedAuthority("ROLE"));            
        UserDetails userDetails = new org.springframework.security.core.userdetails.
                User(user.getEmail(), user.getPassword(), authorities);
		return userDetails;
	}
	
	

}