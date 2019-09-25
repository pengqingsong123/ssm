package cn.ali.controller;

import cn.ali.bean.User;
import cn.ali.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    @ResponseBody
    public User toUsers(long id) {
        User user = userService.queryUserById(id);
        return user;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addUsers(long id) {
        try {
            userService.addUser(id);
            return "ok";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "error";
        }

    }
}
