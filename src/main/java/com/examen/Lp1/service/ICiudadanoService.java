package com.examen.Lp1.service;

import com.examen.Lp1.model.Ciudadano;

import java.util.List;

public interface ICiudadanoService {
    List<Ciudadano> GetAllCiudadanos();
    Ciudadano SaveCiudadano(Ciudadano entity);
    Ciudadano FindCiudadanoById(int id);
    List<Ciudadano> SearchCiudadano(String name);
    Ciudadano updateCiudadano(Ciudadano entity);
    void deleteCiudadano(Integer id);


}
