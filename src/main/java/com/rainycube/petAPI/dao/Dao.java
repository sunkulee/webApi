package com.rainycube.petAPI.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rainycube.petAPI.vo.VO;

@Repository
public class Dao {
	@Autowired
	private JdbcTemplate template;
	public int add(VO vo){
		String q = "insert into pet(pet_name, pet_type, pet_gender, pet_imgUrl, trade_location) values(?,?,?,?,?)";
		return template.update(q, 
				vo.getPetName(), 
				vo.getPetType(),
				vo.getPetGender(),
				vo.getPetImgurl(),
				vo.getTradeLocation()
				);
	}
	public List<VO> list(){
		String q = "select * from pet";
		return template.query(q, new BeanPropertyRowMapper(VO.class));
	}
	public VO get(Integer petId){
		String q = "select * from pet where pet_id = ?";
		return (VO)template.queryForObject(q, new Object[] { petId }, new BeanPropertyRowMapper(VO.class));
	}
}
