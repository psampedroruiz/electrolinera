package com.psampedro.petrolinera;

import com.psampedro.petrolinera.model.ChargePoint;
import com.psampedro.petrolinera.repository.ChargePointInfo;
import org.apache.coyote.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.psampedro.petrolinera.service.AdminService;

@SpringBootApplication
public class PetrolineraApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetrolineraApplication.class, args);
    }


}
