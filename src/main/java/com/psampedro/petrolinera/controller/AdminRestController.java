package com.psampedro.petrolinera.controller;

import com.psampedro.petrolinera.model.ChargePoint;
import com.psampedro.petrolinera.model.ChargePointDTO;
import com.psampedro.petrolinera.repository.ChargePointInfo;
import com.psampedro.petrolinera.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
class AdminRestController {

    private final AdminService adminServ;

    public AdminRestController(AdminService adminServ){this.adminServ = adminServ;}

    @PutMapping("/updateChargePoint")
    public ResponseEntity<?> updateChargePoint(@RequestBody ChargePointDTO cp)
    {
        Boolean result = adminServ.modifyChargePointById(cp);
        return result ? ResponseEntity.notFound().build() : ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteChargePoint")
    public ResponseEntity<?> deleteChargePoint(@RequestParam(name="id") Integer id){
        adminServ.deleteChargePointById(id);
        return ResponseEntity.ok().build();
    }
}
