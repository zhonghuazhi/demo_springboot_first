package net.cc.demo_springboot_first.web;

import net.cc.demo_springboot_first.domain.User;
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

    @RequestMapping("/hello")
    public User hello() {
        return new User();
    }
}