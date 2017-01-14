package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.UserDao;
import com.soecode.lyf.entity.User;
import com.soecode.lyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Jalen on 17/1/15.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao mUserDao;

    public void insertUser(User user) {
        mUserDao.insertUser(user.getId(), user.getUsername(), user.getPassword());
    }
}
