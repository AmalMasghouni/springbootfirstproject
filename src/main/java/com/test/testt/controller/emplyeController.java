package com.test.testt.controller;


import com.test.testt.entity.employe;
import com.test.testt.service.userserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employe")
public class emplyeController {

    @Autowired
    userserviceImp userService;
    @GetMapping("/retive-all-client")
    @ResponseBody
    public List<employe> getAllEmplye(){
        List<employe> clients = userService.getAllEmplye();
        return clients;
    }
    @PostMapping("/ajout")
    @ResponseBody
    public employe addEmplye(@RequestBody employe c){
        employe client = userService.AjouterEmploye(c);
        return client;
    }
    @DeleteMapping("/deleteEmploye/{id}")
    @ResponseBody
    public void deleteClient(@PathVariable("id") Integer id){userService.DeleteEmplye(id);
    }

}
