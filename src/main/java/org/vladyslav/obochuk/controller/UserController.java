package org.vladyslav.obochuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vladyslav.obochuk.domain.User;
import org.vladyslav.obochuk.service.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/{id}")
    public User getById(@PathVariable int id) {
        return userService.getById(id);
    }
}
