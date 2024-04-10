package com.example.demo.controller;

import com.example.demo.dto.BookDto;
import com.example.demo.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Todo 1. Complete headers to set url path "/book" and set as controller

public class BookController {

    //Todo 2. complete the instances required to complete the API


    //Todo 3. Generate the endpoints to create a Book and list books which receives 3 Optional Request Params:
    // (page: long, sizePage: long and orderedTitle: boolean) the default values for each are: 1, 50 and false
    // Hint: There is a Book Dto and a Book model
    // Hint 2: in case is not possible to create a book provide an Internal Server Error

}
