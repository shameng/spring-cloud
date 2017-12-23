package com.meng.helloribbon.controller;

import com.alibaba.fastjson.JSON;
import com.meng.helloribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author meng
 * @create 2017-12-15 13:20
 **/
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon-consumer")
    public String helloConsumer() {
        // return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
        User user = new User();
        user.setId(1);
        user.setName("xindemeng");
        Map<String, Object> map = new HashMap<>(2);
        map.put("id", 1);
        map.put("name", "xindemeng");
        User u = restTemplate.postForObject("http://HELLO-SERVICE/hello", map, User.class);
        System.out.println(u);

        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());

        HttpEntity<String> entity = new HttpEntity<String>(JSON.toJSONString(user), headers);
        return restTemplate.postForObject("http://HELLO-SERVICE/hello", entity, String.class);
    }
}
