package org.partner.minsa.acs.service;


import org.partner.minsa.acs.domain.User;
import org.partner.minsa.acs.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.common.exceptions.UnauthorizedUserException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

import javax.annotation.Resource;

@Service
@Transactional
public class UserService implements UserDetailsService {

	  @Resource(name = "userMapper")
	    private UserMapper userMapper;

	    @Override
	    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
	        User user = userMapper.findByUsername(s);

	        if (user == null) {
	            throw new UnauthorizedUserException("User doesn't exist!");
	        }
	       UserDetails f= new org.springframework.security.core.userdetails.User(user.getUsername(),
	                user.getPassword(),
	                Arrays.asList(new SimpleGrantedAuthority(user.getRole())));
	        
	        return f;
	    }
}
