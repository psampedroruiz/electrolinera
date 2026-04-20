package com.psampedro.petrolinera.controller;

import com.psampedro.petrolinera.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
class AdminController {

    private final AdminService adminServ;

    public AdminController(AdminService adminServ){
        this.adminServ = adminServ;
    }

    @GetMapping("/mainMenu")
    public String getPetrolineras(Model model)
    {
        model.addAttribute("electrolineras",adminServ.getInfoElectrolineras());
        return "admin/mainMenu";
    }

    @GetMapping("/electrolineraMenu")
    public String getElectrolinera(@RequestParam(name="nombre") String name,
                                   Model model)
    {
        model.addAttribute("puntosCarga",adminServ.getInfoElectrolinera(name));
        model.addAttribute("tiposCarga",adminServ.getAllChargerLevels());
        System.out.println(adminServ.getAllChargerLevels());
        return "admin/electrolineraMenu";
    }
}
