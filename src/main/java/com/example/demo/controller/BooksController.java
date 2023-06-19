package com.example.demo.controller;

import com.example.demo.DataBase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    private DataBase dataBase;

    public BooksController(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @GetMapping("/book")
    public String getBook(){
       return dataBase.getUserName();
    }
}
