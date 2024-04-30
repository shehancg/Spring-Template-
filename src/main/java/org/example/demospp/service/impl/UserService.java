package org.example.demospp.service.impl;

import org.example.demospp.dto.UserDto;
import org.example.demospp.entity.User;
import org.example.demospp.repository.UserRepository;
import org.example.demospp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserDto userDto){
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setAge(userDto.getAge());
        return userRepository.save(user);
    }

    @Override
    public String getUsernameById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            return user.getUsername();
        } else {
            return null;
        }
    }
}
