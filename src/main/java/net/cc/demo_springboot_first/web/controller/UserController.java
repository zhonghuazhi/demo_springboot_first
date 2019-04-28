package net.cc.demo_springboot_first.web.controller;

import net.cc.demo_springboot_first.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname UserController
 * @author: zhonghua.zhi
 * @date: 2019-03-14 10:09
 * @version: 1.0
 * @description: TODO
 */
@RestController
public class UserController {

    @Autowired
    private User user;

    @RequestMapping("/user")
    public User hello() {
        System.out.println(user.toString());
        //return user;
        throw new RuntimeException("abcde ....");
    }


    /**
     * 功能描述:
     * 当前Controller出现的异常均可以捕获并处理
     *
     * @param e
     * @return: java.lang.String
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-04-23 15:55
     */
    @ExceptionHandler
    public String handlerException(Exception e) {

        System.out.println("[ERROR] " + e.getMessage());
        return "ERROR.";
    }
}