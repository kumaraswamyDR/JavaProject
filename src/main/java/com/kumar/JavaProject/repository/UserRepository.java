package com.kumar.JavaProject.repository;

import com.kumar.JavaProject.com.kumar.JavaProject.User.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by kumaraswamyDR on 01/03/17.
 */

@Transactional
public interface UserRepository extends CrudRepository<User,String> {
}
