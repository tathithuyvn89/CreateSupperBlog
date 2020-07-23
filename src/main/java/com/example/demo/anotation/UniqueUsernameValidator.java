package com.example.demo.anotation;

import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueBlog,String> {
   @Autowired
   private BlogRepository blogRepository;

    @Override
    public void initialize(UniqueBlog constraintAnnotation) {

    }

    @Override
    public boolean isValid(String url, ConstraintValidatorContext context) {
        if(blogRepository==null){
            return true;
        }
        //Chua tao phuong thuc findByUrl for BlogService
        return false;
    }
}