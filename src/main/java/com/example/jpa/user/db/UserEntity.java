package com.example.jpa.user.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "user") // user 테이블과 매핑시키겠다
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id가 어떤식으로 생성될 것인지 / mysql - identity
    private Long id;
    private String name;
    private Integer age;
    private String email;

}
