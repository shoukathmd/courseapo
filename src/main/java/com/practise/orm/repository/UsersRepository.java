package com.practise.orm.repository;

import com.practise.orm.entity.Users;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 27/12/17.
 */

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {


    Users findByUsername(String username);




}
