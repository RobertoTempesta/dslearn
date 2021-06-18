package com.roberto.dslearnbds.services;

import com.roberto.dslearnbds.entities.User;
import com.roberto.dslearnbds.repositories.UserRepository;
import com.roberto.dslearnbds.services.exceptions.ForbiddenException;
import com.roberto.dslearnbds.services.exceptions.UnauthorizedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public User authenticated() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return repository.findByEmail(username);
        } catch (Exception err) {
            throw new UnauthorizedException("Invalid user");
        }
    }
    
    public void validateSelfOrAdmin(Long userId) {
        User user = authenticated();
        if (!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")) {
            throw new ForbiddenException("Access denied");
        }
    }
}
