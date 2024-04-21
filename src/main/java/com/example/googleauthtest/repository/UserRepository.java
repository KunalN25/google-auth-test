package com.example.googleauthtest.repository;

import com.example.googleauthtest.model.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserProfile, String> {
    public UserProfile findByEmail(String email);
}
