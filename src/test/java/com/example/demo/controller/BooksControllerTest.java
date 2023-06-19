package com.example.demo.controller;

import com.example.demo.DataBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class BooksControllerTest {

    @Mock
    private DataBase dataBase;

    private BooksController booksController;

    @BeforeEach
    public void setUp() {
        dataBase = Mockito.mock(DataBase.class);
        booksController = new BooksController(dataBase);
    }

    @Test
    void userTest() {
        //given
        Mockito.when(dataBase.getUserName()).thenReturn("Kolobok");

        //when
        final String bookName = booksController.getBook();

        //then
        Assertions.assertEquals("Kolobok", bookName);
    }

}