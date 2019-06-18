package com.gecko.hibernate.model;

import java.io.Serializable;

public class SocialMedia implements Serializable{

	private long idSocialMedia;
	private String name;
	private String icon;
	
	public SocialMedia(String name,String icon){
		super();
		this.name = name;
		this.icon = icon;
	}
	
	public SocialMedia(){}
	
	public long getIdSocialMedia() {
		return idSocialMedia;
	}
	public void setIdSocialMedia(long idSocialMedia) {
		this.idSocialMedia = idSocialMedia;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
}
