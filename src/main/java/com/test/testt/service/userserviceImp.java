package com.test.testt.service;

import com.test.testt.entity.employe;
import com.test.testt.repositry.employerepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userserviceImp implements userservice{


    @Autowired
    employerepositry RepEmp;
    @Override
    public employe AjouterEmploye(employe em) {
        RepEmp.save(em);
        return null;
    }

    @Override
    public void DeleteEmploye(employe em) {
        RepEmp.delete(em);

    }

    @Override
    public void DeleteEmplye(Integer id) {
        RepEmp.deleteById(id);

    }

    @Override
    public List<employe> getAllEmplye() {
        return (List<employe>) RepEmp.findAll();
    }
    }
