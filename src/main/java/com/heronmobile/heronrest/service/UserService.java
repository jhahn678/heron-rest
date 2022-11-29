package com.heronmobile.heronrest.service;

import com.heronmobile.heronrest.model.User;
import com.heronmobile.heronrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    };

    public User getUser(Integer id){
        return userRepository.findById(id).get();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(Integer id, User userDetails){
        User user = userRepository.findById(id).get();

        String firstname = userDetails.getFirstname();
        String lastname = userDetails.getLastname();
        String city = userDetails.getCity();
        String state = userDetails.getState();
        String bio = userDetails.getBio();
        String email = userDetails.getEmail();
        Integer phone = userDetails.getPhone();
        String username = userDetails.getUsername();
        String googleId = userDetails.getGoogleId();
        String facebookId = userDetails.getFacebookId();
        String appleId = userDetails.getAppleId();
        String avatar = userDetails.getAvatar();

        if(firstname != null) user.setFirstname(firstname);
        if(lastname != null) user.setLastname(lastname);
        if(city != null) user.setCity(city);
        if(state != null) user.setState(state);
        if(bio != null) user.setBio(bio);
        if(email != null) user.setEmail(email);
        if(phone != null) user.setPhone(phone);
        if(username != null) user.setUsername(username);
        if(googleId != null) user.setGoogleId(googleId);
        if(facebookId != null) user.setFacebookId(facebookId);
        if(appleId != null) user.setAppleId(appleId);
        if(avatar != null) user.setAvatar(avatar);

        return userRepository.save(user);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
