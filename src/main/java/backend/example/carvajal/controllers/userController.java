package backend.example.carvajal.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.example.carvajal.exceptions.ValidationException;
import backend.example.carvajal.models.User;
import backend.example.carvajal.services.userService;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    userService userService;

    @GetMapping()
    public ArrayList<User> getUSers() {
        return userService.getAllUsers();
    }

    @PostMapping()
    public User saveUser(@RequestBody User user) {
        try {
            return userService.saveUser(user);
            
        } catch (Exception e) {
            throw new ValidationException(e.toString());
        }
    }

}
