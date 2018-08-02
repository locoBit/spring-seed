package com.postgres.test;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

  List<User> findByfirstName(String first_name);
}
