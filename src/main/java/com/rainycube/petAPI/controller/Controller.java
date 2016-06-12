package com.rainycube.petAPI.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.rainycube.petAPI.dao.Dao;
import com.rainycube.petAPI.vo.VO;
@RestController
public class Controller {
	private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    @Autowired
    private Dao dao;
	@RequestMapping("/list")
	public List<VO> list(){
		return dao.list();	
	}
	@RequestMapping("/add/{petName}")
    public String add(
    		//http://localhost:8090/add/%EC%98%A4%EC%9B%94%EC%9D%B4?petType=%EB%A7%90%ED%8B%B0%EC%A6%88&petGender=%EC%88%98%EC%BB%B7&petImgurl=mypet2.jpg&tradeLocation=%EC%9C%99%EC%8A%A4%ED%84%B0%EB%94%94
    		@PathVariable String petName,
    		@RequestParam(value="petType")String petType,
    		@RequestParam(value="petGender")String petGender,
    		@RequestParam(value="petImgurl")String petImgurl,
    		@RequestParam(value="tradeLocation")String tradeLocation
    		) {
		VO vo = new VO();
		vo.setPetName(petName);
		vo.setPetType(petType);
		vo.setPetGender(petGender);
		vo.setPetImgurl(petImgurl);
		vo.setTradeLocation(tradeLocation);
		int cnt = dao.add(vo);
		if(cnt>0){
			return "성공";
		}else{
			return "실패";
		}
    }
	@RequestMapping("/get/{petId}")
	public VO get(@PathVariable Integer petId){
		return dao.get(petId);
	}
}
