package com.example.springmongoembeded.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
@AllArgsConstructor
public class Product
{
    @Id
    private String name;
    private int quantity;
    private int price;

}
