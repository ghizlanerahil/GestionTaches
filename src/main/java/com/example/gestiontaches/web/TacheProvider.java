package com.example.gestiontaches.web;

import com.example.gestiontaches.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/Gtache/GestionTaches")
public class TacheProvider {
    @Autowired
    private TacheService tacheService;

}