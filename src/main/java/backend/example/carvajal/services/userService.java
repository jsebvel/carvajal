package backend.example.carvajal.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.example.carvajal.models.User;
import backend.example.carvajal.repositories.UserRepository;

@Service
public class userService {
    @Autowired
    UserRepository userRepo;

    public ArrayList<User> getAllUsers() {
        return (ArrayList<User>) userRepo.findAll();
    }

    public User saveUser(User user) {
        return userRepo.save(user);
    }

}
