package com.greatlearning.student.registrations.service.impl;

import com.greatlearning.student.registrations.entity.User;
import com.greatlearning.student.registrations.model.MyUserDetails;
import com.greatlearning.student.registrations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if(Objects.isNull(user)){
            throw new UsernameNotFoundException("User does not exist");
        }
        return new MyUserDetails(user);
    }
}
