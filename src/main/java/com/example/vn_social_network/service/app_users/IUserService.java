package com.example.vn_social_network.service.app_users;

import com.example.vn_social_network.model.app_users.AppUsers;

import com.example.vn_social_network.service.IGeneralService;

import java.util.Optional;

public interface IUserService extends IGeneralService<AppUsers> {

    Boolean existsByUserName(String name);
}



