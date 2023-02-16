package com.collebra.capstone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.collebra.capstone.entity.Admin;
import com.collebra.capstone.repository.AdminRepository;
import com.collebra.capstone.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	public List<Admin> getAdmin() {
		System.out.println(adminRepository.findAll());
		return adminRepository.findAll();
	}

	@Override
	public Admin saveAdmin(Admin m) {
		return adminRepository.save(m);
	}

	@Override
	public HttpStatus delete(Integer id) {
		adminRepository.deleteById(id);
		return HttpStatus.ACCEPTED;
	}
}
