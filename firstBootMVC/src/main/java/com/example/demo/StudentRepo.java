package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepo extends JpaRepository<StudentModel,Integer> {
  @Query("select * from Student_Model where name = :name")
	List<StudentModel> byName(@Param("name") String name);
}
