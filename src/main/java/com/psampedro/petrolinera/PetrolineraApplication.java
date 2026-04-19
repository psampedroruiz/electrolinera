package com.psampedro.petrolinera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.psampedro.petrolinera.service.AdminService;

@SpringBootApplication
@Controller
public class PetrolineraApplication {

    private final AdminService adminServ;

    public PetrolineraApplication(AdminService adminServ){
        this.adminServ = adminServ;
    }

    public static void main(String[] args) {
        SpringApplication.run(PetrolineraApplication.class, args);
    }

    @GetMapping("/admin/mainMenu")
    public String getPetrolineras(Model model)
    {
        model.addAttribute("electrolineras",adminServ.getInfoElectrolineras());
        return "admin/mainMenu";
    }

    @GetMapping("/admin/electrolineraMenu")
    public String getElectrolinera(@RequestParam(name="nombre") String name,
        Model model)
    {
        model.addAttribute("puntosCarga",adminServ.getInfoElectrolinera(name));
        return "admin/electrolineraMenu";
    }
}
