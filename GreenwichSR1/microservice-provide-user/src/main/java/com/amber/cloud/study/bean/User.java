package com.amber.cloud.study.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
}
