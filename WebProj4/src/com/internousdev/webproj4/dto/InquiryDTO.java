package com.internousdev.webproj4.dto;

public class InquiryDTO {
	private String name;
	private String qtype;
	private String body;
	public String setName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String setQtype(){
		return qtype;
	}
	public void setQtype(String qtype){
		this.qtype=qtype;
	}
	public String setBody(){
		return body;
	}
	public void setBody(String body){
		this.body=body;
	}



}