package com.example.gestiontaches.service;

import com.example.gestiontaches.bean.tache;
import com.example.gestiontaches.dao.TacheDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TacheService {
    @Autowired
    private TacheDao tacheDao;

    public List<tache> findAll() {
        return tacheDao.findAll();
    }

    public <S extends tache> S save(S entity) {
        return tacheDao.save(entity);
    }

    public Optional<tache> findById(Long aLong) {
        return tacheDao.findById(aLong);
    }
}
