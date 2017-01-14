package com.soecode.lyf.service;

import com.soecode.lyf.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by Jalen on 17/1/15.
 */
@Service
public interface UserService {

    public void insertUser(User user);
}
