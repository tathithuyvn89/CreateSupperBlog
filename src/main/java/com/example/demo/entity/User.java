package com.example.demo.entity;

import com.example.demo.anotation.UniqueUsername;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Data
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3, message = "Name must be at least 3 characters!")
    @Column(unique = true)
    @UniqueUsername(message = "Such username already exists!")
    private String name;
    @Size(min = 1,message = "Invalid email address!")
    @Email(message = "Invalid email address!")
    private String email;
    @Size(min = 5,message = "Password must be at least 5 characters!")
    private String password;
    private boolean enabled;
    @ManyToMany
    @JoinTable(name = "app_user_role")
    private List<Role> roles;
    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
    private List<Blog> blogs;


}