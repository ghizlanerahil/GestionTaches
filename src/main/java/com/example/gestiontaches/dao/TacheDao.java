package com.example.gestiontaches.dao;

import com.example.gestiontaches.bean.tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheDao extends JpaRepository<tache,Long> {
}
