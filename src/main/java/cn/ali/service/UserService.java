package cn.ali.service;

import cn.ali.bean.User;

public interface UserService {
    User queryUserById(long id);

    void addUser(long id);
}
