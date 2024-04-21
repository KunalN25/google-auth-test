package com.example.googleauthtest.service;

import com.example.googleauthtest.model.CityDetail;
import com.example.googleauthtest.model.UserProfile;
import com.example.googleauthtest.repository.CityRepository;
import com.example.googleauthtest.repository.UserRepository;
import com.example.googleauthtest.utils.auth.CurrentAuthContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class MainService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    CityRepository cityRepository;

    public UserProfile getUserProfile(String email) {
         UserProfile userProfile = userRepository.findByEmail(email);
         return userProfile;
    }

    public void addProfile() throws Exception{
        UserProfile userProfile = new UserProfile();
        userProfile.setId(UUID.randomUUID().toString());
        userProfile.setName(CurrentAuthContext.getUserName());
        userProfile.setEmail(CurrentAuthContext.getUserEmail());
        userRepository.save(userProfile);
    }

    public CityDetail getCity(int id) throws Exception {
       Optional<CityDetail> cityDetail = cityRepository.findById(id);
       if(cityDetail.isEmpty()) throw new Exception("City does not exist");
       return cityDetail.get();
    }


}
