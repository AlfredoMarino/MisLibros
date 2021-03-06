package com.alfredomarino.mybooks.core.controller;

import com.alfredomarino.mybooks.core.model.Person;
import com.alfredomarino.mybooks.core.model.User;
import com.alfredomarino.mybooks.core.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * UserController
 */
@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<User> getUser(
        @RequestParam(value="username") String username,
        @RequestParam(value="password") String password) {
        return new ResponseEntity<>(this.userService.getUserByUsernameAndPassword(username, password), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        Person person = user.getPerson();
        person.setUser(user);
        return new ResponseEntity<>(this.userService.createUser(user), HttpStatus.CREATED);
    }
    
}