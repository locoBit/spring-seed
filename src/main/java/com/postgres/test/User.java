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
    private String firstName;

    protected User() {}

    public User(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
      return String.format(
          "User[id=%id], firstName='%s",
          id, firstName
        );
    }
}
