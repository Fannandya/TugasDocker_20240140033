package com.tugas6.deploy.controller;

import com.tugas6.deploy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@controller
public class UserController {
    private static List<User> mahasiswaList = new ArrayList<>();

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }





}
