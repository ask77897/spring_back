package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.StuDAO;
import com.example.domain.EnrollVO;
import com.example.service.StuService;

@RestController
@RequestMapping("/stu")
public class StuRestController {
	@Autowired
	StuDAO dao;
	@Autowired
	StuService service;
	
	@GetMapping("/list.json")
	public List<HashMap<String, Object>> list(){
		return dao.list();
	}
	@GetMapping("/enroll/list.json/{scode}")
	public List<HashMap<String, Object>> liEnroll(@PathVariable("scode") String scode){
		return dao.liEnroll(scode);
	}
	@GetMapping("/enroll/check")
	public int check(EnrollVO vo){
		return dao.check(vo);
	}
	
	@PostMapping("/enroll/insert")
	public void inEnroll(@RequestBody EnrollVO vo) {
		service.inEnroll(vo);
	}
	
	@PostMapping("/enroll/delete")
	public void deEnroll(@RequestBody EnrollVO vo) {
		service.deEnroll(vo);
	}
}
