package com.tap.stockingsoftware.repository;
import com.tap.stockingsoftware.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Table will interact with database. Using entity Users
@Repository
public interface UserRepository extends JpaRepository <Users, Long>{

    Users findByFirstName(String firstName);
}