package com.jefersontecnologia.helpdesk.controllers;


import com.jefersontecnologia.helpdesk.models.Role;
import com.jefersontecnologia.helpdesk.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;
    public RoleController(RoleService roleService){
        this.roleService = roleService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("list", this.roleService.findAll());

        return "roles/index";
    }
    @GetMapping("/new")
    public String create(Model model){
        model.addAttribute("role", new Role());
        return "roles/create";
    }
    @PostMapping("{id}")
    public String save(@Valid @ModelAttribute("role") Role role, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "roles/create";
        }

        Role roleCreated = this.roleService.create(role);

        return "redirect:/roles";
    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") Long id, Model model) {
        this.roleService.delete(id);

        return "redirect:/roles";
    }
}
