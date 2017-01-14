package com.soecode.lyf.dao;

import com.soecode.lyf.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Jalen on 17/1/15.
 */
public interface UserDao {
    int insertUser(@Param("userId") int userId, @Param("userName") String userName, @Param("userPassword") String userPassword);

    List<User> queryAllUser(@Param("offset") int offset, @Param("limit") int limit);

    User queryUserById(long userId);
}
