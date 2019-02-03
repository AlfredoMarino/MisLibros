package com.alfredomarino.mislibros.core.business.services;

import java.util.List;

import com.alfredomarino.mislibros.core.model.Pais;
import com.alfredomarino.mislibros.core.business.repository.PaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PaisService
 */
@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> findAll(){
        return this.paisRepository.findAll();
    }
    
}