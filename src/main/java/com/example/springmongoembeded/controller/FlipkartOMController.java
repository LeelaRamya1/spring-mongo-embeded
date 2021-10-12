package com.example.springmongoembeded.controller;

import com.example.springmongoembeded.model.User;
import com.example.springmongoembeded.repository.FlipkartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-service")
public class FlipkartOMController
{
    @Autowired
    private FlipkartRepository repository;

    @PostMapping("/placeOrderNow")
    public String placeOrder(@RequestBody User user)
    {
        repository.save(user);
        return "Order placed successfully";
    }

    @GetMapping("/getUserByName/{name}")
    public List<User> getUserByName(@PathVariable String name)
    {
        return repository.findByName(name);
    }

    @GetMapping("/getUserByAddress/{city}")
    public List<User> getUserByAddress(@PathVariable String city)
    {
        return repository.findByCity(city);
    }

}
