package com.example.springmongoembeded.repository;

import com.example.springmongoembeded.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface FlipkartRepository extends MongoRepository<User,Integer>
{
    List<User> findByName(String name);

    @Query("{'Address.city':?0}")

    List<User> findByCity(String city);

}
