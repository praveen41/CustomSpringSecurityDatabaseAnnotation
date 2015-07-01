package com.pasm.users.dao;

import com.pasm.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}