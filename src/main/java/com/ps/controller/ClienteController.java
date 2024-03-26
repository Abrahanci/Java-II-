package com.ps.controller;

import com.ps.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ps.services.IClienteService;


@RestController
@RequestMapping("/clientes")

public class ClienteController
{
    @Autowired
    public IClienteService iClienteService;



    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        Cliente cliente = iClienteService.getClienteById(id);
        return ResponseEntity.ok(cliente);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente createdCliente =iClienteService.createCliente(cliente);
        return new ResponseEntity<>(createdCliente, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Cliente> updateCliente( @RequestBody Cliente cliente) {
        Cliente updatedCliente = iClienteService.updateCliente(cliente);
        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        iClienteService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }
}
