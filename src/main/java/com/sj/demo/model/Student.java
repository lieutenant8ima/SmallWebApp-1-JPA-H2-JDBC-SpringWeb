package com.sj.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int sid;
	private String sname;
	private String lang;
	public int getSid() 
	{
		return sid;
	}
	public void setSid(int sid) 
	{
		this.sid = sid;
	}
	public String getSname() 
	{
		return sname;
	}
	public void setSname(String sname) 
	{
		this.sname = sname;
	}
	public String getLang() 
	{
		return lang;
	}
	public void setLang(String lang) 
	{
		this.lang = lang;
	}
	@Override
	public String toString() 
	{
		return "Student [sid=" + sid + ", sname=" + sname + ", lang=" + lang +"]";
	}
	

}
