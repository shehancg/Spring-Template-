package org.example.demospp.service;

import org.example.demospp.dto.UserDto;
import org.example.demospp.entity.User;

public interface IUserService {
    User createUser(UserDto userDto);
    String getUsernameById(Long id);
}
