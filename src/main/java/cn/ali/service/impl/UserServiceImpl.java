package cn.ali.service.impl;

import cn.ali.bean.User;
import cn.ali.mapper.UserMapper;
import cn.ali.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(long id) {
        long i = 1 / id;
        User user = userMapper.queryUserById(id);
        return user;
    }

    public void addUser(long id) {
        User user = new User();
        user.setName("aa");
        user.setAge(12);
        userMapper.addUser(user);
        long i=1/id;
    }
}
