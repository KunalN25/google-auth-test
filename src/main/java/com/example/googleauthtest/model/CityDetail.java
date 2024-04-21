package com.example.googleauthtest.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("test")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CityDetail {
    @Id
    private int id;
    @Field("city_name")
    private String cityName;
    private String country, language;

}
