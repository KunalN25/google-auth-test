package com.example.googleauthtest.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@Document("users")
public class UserProfile {
    @Id
    private String id;

    private String name;
    private String email;
}
