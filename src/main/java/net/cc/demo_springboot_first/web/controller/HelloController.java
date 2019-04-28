package net.cc.demo_springboot_first.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname HelloController
 * @author: zhonghua.zhi
 * @date: 2019-04-28 15:31
 * @version: 1.0
 * @description: TODO
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {


    /**
     * 功能描述:
     * 从URL地址中绑定参数
     *
     * @param firstName
     * @param lastName
     * @return: java.lang.String
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-04-28 15:54
     */
    @RequestMapping(value = "/{firstName}/{lastName}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("firstName") String firstName,
                           @PathVariable("lastName") String lastName) {

        return String.format("Hello fistName : %s , lastName : %s", firstName, lastName);
    }
}