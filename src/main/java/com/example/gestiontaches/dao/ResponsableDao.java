package com.example.gestiontaches.dao;

import com.example.gestiontaches.bean.Responsable;
import com.example.gestiontaches.bean.tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsableDao extends JpaRepository<responsable,Long>{
}
