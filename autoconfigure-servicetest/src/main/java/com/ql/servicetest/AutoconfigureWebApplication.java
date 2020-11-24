package com.ql.servicetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import com.ql.servicetest.conditionDemo.PersonConfigure;

@SpringBootApplication(exclude = {})
@ComponentScan(
    excludeFilters =
        @ComponentScan.Filter(
            type = FilterType.ASSIGNABLE_TYPE,
            classes = {PersonConfigure.class}))
public class AutoconfigureWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(AutoconfigureWebApplication.class, args);
  }
}
