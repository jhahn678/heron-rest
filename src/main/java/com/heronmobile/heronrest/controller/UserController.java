package com.heronmobile.heronrest.controller;

import com.heronmobile.heronrest.model.Catch;
import com.heronmobile.heronrest.model.User;
import com.heronmobile.heronrest.service.CatchService;
import com.heronmobile.heronrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    CatchService catchService;

    @GetMapping
    public List<User> getUser(){
        return userService.getUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User userDetails){
        return userService.createUser(userDetails);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable(value = "id") Integer id){
        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable(value = "id") Integer id, @RequestBody User userDetails){
        return userService.updateUser(id, userDetails);
    }

    @GetMapping("/{id}/catch")
    public List<Catch> getUserCatches(@PathVariable(value = "id") Integer id){
        return catchService.getUserCatches(id);
    }

}
