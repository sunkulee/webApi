package com.rainycube.petbuddy.vo;
/*create table pet(pet_id int(10) not null auto_increment primary key,
pet_name varchar(50) not null,
pet_type varchar(50) not null,
pet_gender varchar(10) not null,
pet_imgUrl varchar(250),
trade_location varchar(200) not null);*/
public class PetVO {
	private Integer petId;
	private String petName;
	private String petType;
	private String petGender;
	private String petImgurl;
	private String tradeLocation;
	public Integer getPetId() {
		return petId;
	}
	public void setPetId(Integer petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getPetGender() {
		return petGender;
	}
	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}
	public String getPetImgurl() {
		return petImgurl;
	}
	public void setPetImgurl(String petImgurl) {
		this.petImgurl = petImgurl;
	}
	public String getTradeLocation() {
		return tradeLocation;
	}
	public void setTradeLocation(String tradeLocation) {
		this.tradeLocation = tradeLocation;
	}
	
}
