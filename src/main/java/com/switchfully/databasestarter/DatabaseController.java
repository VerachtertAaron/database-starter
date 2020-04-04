package com.switchfully.databasestarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/database")
public class DatabaseController {
    ApplicationContext context;

    @Autowired
    public DatabaseController(ApplicationContext context) {
        this.context = context;
    }

    @GetMapping public String[] getInfo(){
        return context.getBeanDefinitionNames();
    }
}
