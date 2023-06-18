package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    @GetMapping("/book")
    public String getBook(){klsdmflkasmdf
        System.out.println();
        return "Kolobok";
    }
}
