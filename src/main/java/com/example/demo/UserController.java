package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1/user")
public class UserController {
    @GetMapping("/list")
    public ResponseEntity<List<String>> getUserList(){
        List<String> userList = new ArrayList<>();
        userList.add("name1");
        userList.add("name2");
        userList.add("name3");
        return ResponseEntity.ok().body(userList);
    }
}
