package com.sha.springbootvideocontentmanager.repository;

import com.sha.springbootvideocontentmanager.model.Role;
import com.sha.springbootvideocontentmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);


    @Modifying
    @Query("update User set role =:role where username = :username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}
