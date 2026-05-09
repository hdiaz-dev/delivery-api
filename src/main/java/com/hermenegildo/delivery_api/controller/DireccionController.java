package com.hermenegildo.delivery_api.controller;

import com.hermenegildo.delivery_api.model.Direccion;
import com.hermenegildo.delivery_api.service.DireccionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/direcciones")
public class DireccionController {

    private final DireccionService direccionService;

    public DireccionController(DireccionService direccionService) {
        this.direccionService = direccionService;
    }

    @GetMapping
    public ResponseEntity<List<Direccion>> findAll() {
        return ResponseEntity.ok(direccionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Direccion> findById(@PathVariable Long id) {
        return ResponseEntity.ok(direccionService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Direccion> save(@RequestBody Direccion direccion) {
        return ResponseEntity.ok(direccionService.save(direccion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        direccionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
