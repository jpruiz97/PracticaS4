package com.cibertec.ciber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.ciber.entity.Producto;
import com.cibertec.ciber.repository.ProductoRepository;

@Service

public class ProductoServicelmpl implements ProductoService{

    @Autowired
    private ProductoRepository repository;
    
    @Override
    public List<Producto> listaTodo(){
        return repository.findAll();
    }
}
