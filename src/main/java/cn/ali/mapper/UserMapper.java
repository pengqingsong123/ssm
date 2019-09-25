package cn.ali.mapper;

import cn.ali.bean.User;

public interface UserMapper {
    User queryUserById(Long id);

    void addUser(User user);
}
