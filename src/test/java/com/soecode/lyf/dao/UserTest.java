package com.soecode.lyf.dao;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.dto.Result;
import com.soecode.lyf.entity.User;
import com.soecode.lyf.utils.GsonUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Jalen on 17/1/15.
 */
public class UserTest extends BaseTest {
    @Autowired
    UserDao mUserDao;

    @Test
    public void testInserUser() throws Exception {
        mUserDao.insertUser(1, "杨哲", "1234");
    }

    @Test
    public void testUpdateUser() {

    }

    @Test
    public void testDeleteUser() {

    }

    @Test
    public void testQueryUserById() {
        User user = mUserDao.queryUserById(1);
        Result<User> userResult = new Result<User>(200, user);
        System.out.printf("返回的结果为：  " + GsonUtil.GsonString(userResult));
    }

    @Test
    public void testQueryAllUser() {
        List<User> list = mUserDao.queryAllUser(0, 10);
        Result<List<User>> result = new Result<List<User>>(200, list, "success");
        System.out.printf("返回结果为： " + GsonUtil.GsonString(result));
    }
}
