package com.example.springmongoembeded.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Address
{
    @Id
    private String city;
    private String state;
    private String pinCode;
}
