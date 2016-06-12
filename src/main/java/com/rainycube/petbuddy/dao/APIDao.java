package com.rainycube.petbuddy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rainycube.petbuddy.vo.PetVO;

@Repository
public class APIDao {
	@Autowired
	private JdbcTemplate template;
	public int add(PetVO vo){
		String q = "insert into pet(pet_name, pet_type, pet_gender, pet_imgUrl, trade_location) values(?,?,?,?,?)";
		return template.update(q, 
				vo.getPetName(), 
				vo.getPetType(),
				vo.getPetGender(),
				vo.getPetImgurl(),
				vo.getTradeLocation()
				);
	}
	public List<PetVO> list(){
		String q = "select * from pet";
		return template.query(q, new BeanPropertyRowMapper(PetVO.class));
	}
	public PetVO get(Integer petId){
		String q = "select * from pet where pet_id = ?";
		return (PetVO)template.queryForObject(q, new Object[] { petId }, new BeanPropertyRowMapper(PetVO.class));
	}
}
