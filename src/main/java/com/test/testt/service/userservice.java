package com.test.testt.service;

import com.test.testt.entity.employe;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface userservice {
    employe AjouterEmploye (employe em);
    void DeleteEmploye (employe em);
    void DeleteEmplye (Integer id);
    List<employe> getAllEmplye();


}
