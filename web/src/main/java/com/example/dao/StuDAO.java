package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.EnrollVO;

public interface StuDAO {
	public List<HashMap<String, Object>> list();
	public List<HashMap<String, Object>> liEnroll(String scode);
	public int check(EnrollVO vo);
	public void inEnroll(EnrollVO vo);
	public void deEnroll(EnrollVO vo);
}
