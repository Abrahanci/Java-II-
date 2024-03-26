package com.ps.services;

import com.ps.model.Prestamo;

public interface IPrestamoService {
    public default Prestamo getPrestamoById(Long id) {
        return null;
    }

     default Prestamo createPrestamo(Prestamo prestamo) {
        return prestamo;
    }

     default Prestamo updatePrestamo(Prestamo prestamo) {
        return prestamo;
    }

     default void deletePrestamo(Long id) {
    }
}
