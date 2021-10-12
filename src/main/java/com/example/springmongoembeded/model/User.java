package com.example.springmongoembeded.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "order_DB")
@AllArgsConstructor
public class User
{
    @Id
    private int id;
    private String name;
    private String gender;
    private List<Product> products;
    private Address address;
}
