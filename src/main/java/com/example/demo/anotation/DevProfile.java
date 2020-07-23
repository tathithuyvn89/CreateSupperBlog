package com.example.demo.anotation;

import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Profile("dev")
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE,ElementType.METHOD})
public @interface DevProfile {
}
