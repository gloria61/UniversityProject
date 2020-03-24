package com.example.demo;

import com.example.demo.DemoModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DemoRepo extends JpaRepository<DemoModel, Long> {

}
