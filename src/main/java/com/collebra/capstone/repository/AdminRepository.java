package com.collebra.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collebra.capstone.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
