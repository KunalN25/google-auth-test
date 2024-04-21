package com.example.googleauthtest.repository;

import com.example.googleauthtest.model.CityDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityRepository extends MongoRepository<CityDetail, Integer> {

}
