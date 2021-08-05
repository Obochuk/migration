package org.vladyslav.obochuk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vladyslav.obochuk.domain.User;
import org.vladyslav.obochuk.repository.UserRepository;
import org.vladyslav.obochuk.service.UserService;

import java.util.NoSuchElementException;

@Service
public class DefaultUserService implements UserService {
    private UserRepository userRepository;

    @Autowired
    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getById(int id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
