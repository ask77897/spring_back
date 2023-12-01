package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CouDAOImpl implements CouDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.CouMapper";
	
	@Override
	public List<HashMap<String, Object>> list() {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list");
	}

	@Override
	public void upPersons(String lcode, int amount) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();
		map.put("lcode", lcode);
		map.put("amount", amount);
		session.update(namespace + ".upPersons", map);
	}
}
