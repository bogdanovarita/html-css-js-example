package ru.example.bookdiscount.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {
    @GetMapping("/discount")
    public ResponseEntity<Integer> getDiscount() {
        return new ResponseEntity<>(20, HttpStatus.OK);
    }
}
