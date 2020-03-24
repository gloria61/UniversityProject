package com.example.Web.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Web.Service.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
