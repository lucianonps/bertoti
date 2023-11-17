package com.example.lab3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab3.entitties.Carro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Carros")
public class CarroController {

    private List<Carro> carros = new ArrayList<>();

    @GetMapping
    public List<Carro> findAll() {
        return carros;
    }

    @GetMapping("/{id}")
    public Carro findById(@PathVariable Long id) {
        Optional<Carro> carroOptional = carros.stream().filter(carro -> carro.getId().equals(id)).findFirst();
        return carroOptional.orElse(null);
    }

    @PostMapping
    public Carro insert(@RequestBody Carro carro) {
        carros.add(carro);
        return carro;
    }

    /*@PutMapping("/{id}")
    public Carro update(@PathVariable Long id, @RequestBody Carro carro) {
        Optional<Carro> carroOptional = carros.stream().filter(c -> c.getId().equals(id)).findFirst();
        if (carroOptional.isPresent()) {
            Carro existingCarro = carroOptional.get();
            existingCarro.set(carro.getModelo());  // Atualize outros campos conforme necessário
            return existingCarro;
        }
        return null;
    }*/

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        carros.removeIf(carro -> carro.getId().equals(id));
    }
}
