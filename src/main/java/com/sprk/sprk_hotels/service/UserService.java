package com.sprk.sprk_hotels.service;


import com.sprk.sprk_hotels.model.UserModel;

public interface UserService {
    UserModel getUserByEmail(String email);

    UserModel saveUserModel(UserModel userModel);
}
