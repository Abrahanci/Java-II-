package com.ps.services;

import com.ps.model.Cliente;

public interface IClienteService {

    default Cliente getClienteById(Long id) {
        return null;
    }

    default Cliente createCliente(Cliente cliente) {
        return cliente;
    }

    default Cliente updateCliente(Cliente cliente) {
        return cliente;
    }

    default void deleteCliente(Long id) {
    }
}
