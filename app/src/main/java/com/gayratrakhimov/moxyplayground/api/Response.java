package com.gayratrakhimov.moxyplayground.api;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("Pro!")
	private String pro;

	@SerializedName("ip")
	private String ip;

	@SerializedName("about")
	private String about;

	@SerializedName("reject-fascism")
	private String rejectFascism;

	public void setPro(String pro){
		this.pro = pro;
	}

	public String getPro(){
		return pro;
	}

	public void setIp(String ip){
		this.ip = ip;
	}

	public String getIp(){
		return ip;
	}

	public void setAbout(String about){
		this.about = about;
	}

	public String getAbout(){
		return about;
	}

	public void setRejectFascism(String rejectFascism){
		this.rejectFascism = rejectFascism;
	}

	public String getRejectFascism(){
		return rejectFascism;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"pro! = '" + pro + '\'' + 
			",ip = '" + ip + '\'' + 
			",about = '" + about + '\'' + 
			",reject-fascism = '" + rejectFascism + '\'' + 
			"}";
		}
}