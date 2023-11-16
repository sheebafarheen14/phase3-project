package com.simplilearn.controller;

import java.util.List;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String search(@RequestParam(name = "keyword", required = false) String keyword, Model model) {
        if (keyword != null) {
            List<User> searchResults = ProductService.searchUsers(keyword);
            model.addAttribute("searchResults", searchResults);
        }
        return "search";
    }
}
