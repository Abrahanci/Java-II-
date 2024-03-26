package com.ps.controller;

import com.ps.model.Prestamo;
import com.ps.services.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ps.services.IPrestamoService;
@RequiredArgsConstructor
@RestController
@RequestMapping("/prestamos")
public class PrestamoController{

    @Autowired
    public IPrestamoService iPrestamoService;
    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> getPrestamoById(@PathVariable Long id) {
        Prestamo cliente = iPrestamoService.getPrestamoById(id);
        return ResponseEntity.ok(cliente);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Prestamo> createPrestamo(@RequestBody Prestamo cliente) {
        Prestamo createdCliente = iPrestamoService.createPrestamo(cliente);
        return new ResponseEntity<>(createdCliente, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Prestamo> updatePrestamo( @RequestBody Prestamo cliente) {
        Prestamo updatedCliente = iPrestamoService.updatePrestamo(cliente);
        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestamo(@PathVariable Long id) {
        iPrestamoService.deletePrestamo(id);
        return ResponseEntity.noContent().build();
    }
}
