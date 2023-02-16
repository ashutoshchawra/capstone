package com.collebra.capstone.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.collebra.capstone.entity.Admin;

public interface AdminService {

	public List<Admin> getAdmin();

	public Admin saveAdmin(Admin admin);

	public HttpStatus delete(Integer id);
}
