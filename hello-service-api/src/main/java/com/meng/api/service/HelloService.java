package com.meng.api.service;

import com.meng.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author meng
 * @create 2017-12-20 13:40
 **/
public interface HelloService {

    //@RequestParam与@RequestHeader等注解要指定value值，否则会报错
    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello4(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello5(@RequestHeader("name") String name, @RequestHeader("id") Integer id);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    String hello6(@RequestBody User user);
}
