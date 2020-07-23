package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
  public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @Column(name = "short_name")
  private String shortName;
  @OneToMany(mappedBy = "category")
  private List<Blog> blogs;
  @Transient
  private int blogCount;

}