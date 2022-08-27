package com.devsuperior.dslearnbds.controllers;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deliveries")
public class DeliverController {

    @Autowired
    private DeliverService deliverService;

    @PutMapping("/{id}")
    public ResponseEntity<Void> saveDeliverRevison(@PathVariable Long id,
                                                   @RequestBody DeliverRevisionDTO deliverRevisionDTO) {
        deliverService.save(id, deliverRevisionDTO);
        return ResponseEntity.status(200).build();
    }
}