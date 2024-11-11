package com.project.expensetracker.service;

import com.project.expensetracker.entity.User;
import com.project.expensetracker.entity.UserModel;

public interface UserService {

    User createUser(UserModel user);

    User readUser();

    User updateUser(UserModel user);

    void deleteUser();

    User getLoggedInUser();
}
