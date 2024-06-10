package com.examen.Lp1.service.impl;

import com.examen.Lp1.model.Ciudadano;
import com.examen.Lp1.repository.ICiudadanoRepository;
import com.examen.Lp1.service.ICiudadanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadanoService implements ICiudadanoService {

    ICiudadanoRepository _ciudadanoRepository;
    @Autowired
    public CiudadanoService(ICiudadanoRepository ciudadanoRepository) {
        _ciudadanoRepository = ciudadanoRepository;
    }


    @Override
    public List<Ciudadano> GetAllCiudadanos() {
        return _ciudadanoRepository.findAll();
    }

    @Override
    public Ciudadano SaveCiudadano(Ciudadano entity) {
        Ciudadano CiudadanoSaved = _ciudadanoRepository.save(entity);
        return CiudadanoSaved;
    }

    @Override
    public Ciudadano FindCiudadanoById(int id) {
        Optional<Ciudadano> rowInDB = _ciudadanoRepository.findById(id);
        if (rowInDB.isPresent())
            return rowInDB.get();
        else
            return new Ciudadano();
    }

    @Override
    public List<Ciudadano> SearchCiudadano(String name) {
        return null;
    }

    @Override
    public Ciudadano updateCiudadano(Ciudadano entity) {
        Ciudadano ciudadanoUpdate = _ciudadanoRepository.save(entity);
        return ciudadanoUpdate;
    }

    @Override
    public void deleteCiudadano(Integer id) {
        _ciudadanoRepository.deleteById(id);
    }

}
