package com.example.gestiontaches.service;

import com.example.gestiontaches.bean.Responsable;
import com.example.gestiontaches.dao.ResponsableDao;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class ResponsabeService {
    @Autowired
    private ResponsableDao respondableDao;

    public List<Responsable> findAll() {
        return respondableDao.findAll();
    }

    public <S extends Responsable> List<S> saveAll(Iterable<S> entities) {
        return respondableDao.saveAll(entities);
    }

    public void deleteById(Long aLong) {
        respondableDao.deleteById(aLong);
    }

    public void deleteAll() {
        respondableDao.deleteAll();
    }
}
