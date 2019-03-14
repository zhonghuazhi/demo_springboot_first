package net.cc.demo_springboot_first.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @classname User
 * @author: zhonghua.zhi
 * @date: 2019-03-14 10:05
 * @version: 1.0
 * @description: TODO
 */
@Component
public class User {

    @Value("${users.age}")
    private int age;

    @Value("${users.name}")
    private String name;


    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
