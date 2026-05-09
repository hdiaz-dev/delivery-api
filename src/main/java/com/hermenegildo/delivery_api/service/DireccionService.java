package com.hermenegildo.delivery_api.service;

import com.hermenegildo.delivery_api.model.Direccion;
import com.hermenegildo.delivery_api.repository.DireccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionService {

    private final DireccionRepository direccionRepository;

    public DireccionService(DireccionRepository direccionRepository) {
        this.direccionRepository = direccionRepository;
    }

    public List<Direccion> findAll() {
        return direccionRepository.findAll();
    }

    public Direccion findById(Long id) {
        return direccionRepository.findById(id).orElse(null);
    }

    public Direccion save(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    public void deleteById(Long id) {
        direccionRepository.deleteById(id);
    }
}
