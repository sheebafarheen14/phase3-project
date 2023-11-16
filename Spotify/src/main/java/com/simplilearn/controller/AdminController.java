package com.simplilearn.controller;



import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import javax.management.relation.RelationService;

@Controller
public class AdminController {

    private final RelationService adminService = null;

    @SuppressWarnings("unchecked")
	@GetMapping("/admin/list")
    public String listAdmins(Model model) {
        List<Admin> list2 = (List<Admin>) ((Object) adminService);
		List<Admin> list = list2;
		List<Admin> admins = list;
        model.addAttribute("admins", admins);
        return "admin/list";
    }

    

}
