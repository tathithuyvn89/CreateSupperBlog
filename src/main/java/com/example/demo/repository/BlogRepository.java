package com.example.demo.repository;

import com.example.demo.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<Blog,Long> {
    Blog findByUrl(String url);
    @Query("select b from Blog b left join fetch b.category where b.shortName=?1")
    Blog findByShortName(String shortName);

}
