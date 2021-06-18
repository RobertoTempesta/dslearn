package com.roberto.dslearnbds.services;

import java.util.Optional;

import com.roberto.dslearnbds.entities.User;
import com.roberto.dslearnbds.entities.dto.UserDTO;
import com.roberto.dslearnbds.repositories.UserRepository;
import com.roberto.dslearnbds.services.exceptions.ResourceNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        Optional<User> entity = repository.findById(id);
        entity.orElseThrow(() -> new ResourceNotFoundException("Entity not found!!"));
        return new UserDTO(entity.get());
    }
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByEmail(username);
        if (user == null) {
            logger.error("User not found: " + username);
            throw new UsernameNotFoundException("Email not found");
        }

        logger.info("User found: " + username);

        return user;
    }
}
