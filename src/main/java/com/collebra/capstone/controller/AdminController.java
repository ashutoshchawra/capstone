package com.collebra.capstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collebra.capstone.entity.Admin;
import com.collebra.capstone.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/getuser")
	public List<Admin> getAdmin() {
		System.out.print(adminService.getAdmin().toString());
		return adminService.getAdmin();
	}

	@PostMapping("/saveuser")
	public HttpStatus saveAdmin(@RequestBody Admin admin) {
		adminService.saveAdmin(admin);
		return HttpStatus.CREATED;
	}

	@PutMapping("/updateuser")
	public HttpStatus updateAdmin(@RequestBody Admin admin) {
		adminService.saveAdmin(admin);
		return HttpStatus.CREATED;
	}

	@DeleteMapping("/deleteuser/{id}")
	public HttpStatus deleteAdmin(@PathVariable("id") Integer id) {
		adminService.delete(id);
		return HttpStatus.CREATED;
	}

}
