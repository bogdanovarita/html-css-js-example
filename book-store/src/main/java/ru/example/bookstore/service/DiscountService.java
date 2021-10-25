package ru.example.bookstore.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DiscountService {

    public Integer getDiscount() {
        ResponseEntity<Integer> responseEntity = new RestTemplate().getForEntity
                ("http://localhost:8081/discount", Integer.class);
       return responseEntity.getBody();
    }
}
