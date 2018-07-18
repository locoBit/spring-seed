package com.postgres.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String first_name;

    protected User() {}

    public User(String first_name) {
        this.first_name = first_name;
    }

    @Override
    public String toString() {
      return String.format(
          "User[id=%id], first_name='%s",
          id, first_name
        );
    }
}
