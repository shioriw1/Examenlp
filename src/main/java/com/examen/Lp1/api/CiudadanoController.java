package com.examen.Lp1.api;


import com.examen.Lp1.model.Ciudadano;
import com.examen.Lp1.service.ICiudadanoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/ciudadano")
public class CiudadanoController {

    private final ICiudadanoService ciudadanoServices;

    @GetMapping
    public List<Ciudadano> getAll() {
        return ciudadanoServices.GetAllCiudadanos();
    }

    @GetMapping("/{id}")
    public Ciudadano getAll(@PathVariable int id) {
        return ciudadanoServices.FindCiudadanoById(id);
    }

    @PostMapping
    public Ciudadano saveCiudadano(@RequestBody Ciudadano entity) {
        return ciudadanoServices.SaveCiudadano(entity);
    }

    @PutMapping
    public Ciudadano updateCiudadano(@RequestBody Ciudadano entity){
        return ciudadanoServices.updateCiudadano(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteCiudadano(@PathVariable Integer id){
        ciudadanoServices.deleteCiudadano(id);
    }

}
