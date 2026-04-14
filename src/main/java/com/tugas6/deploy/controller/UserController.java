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

    // halaman login
    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    // validasi login
    @PostMapping("/login")
    public String loginProcess(@RequestParam String username, @RequestParam String password) {
        if (username.equals("fannandya") && password.equals("20240140033")) {
            return "redirect:/home";
        } else {
            return "redirect:/?error";
        }
    }

    // halaman home
    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("listMhs", mahasiswaList);
        return "home";
    }

    // halaman form input
    @GetMapping("/form")
    public String formPage(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    // simpan data ke list
    @PostMapping("/save")
    public String saveUser(@ModelAttribute User user) {
        mahasiswaList.add(user);
        return "redirect:/home";
    }

}
