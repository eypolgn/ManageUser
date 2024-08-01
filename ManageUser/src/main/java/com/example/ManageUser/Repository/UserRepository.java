package com.example.ManageUser.Repository;

import com.example.ManageUser.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
