package com.xiaoshu.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class StudentVo extends Student{
	private String aname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sBirth1;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sBirth2;


	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Date getsBirth1() {
		return sBirth1;
	}

	public void setsBirth1(Date sBirth1) {
		this.sBirth1 = sBirth1;
	}

	public Date getsBirth2() {
		return sBirth2;
	}

	public void setsBirth2(Date sBirth2) {
		this.sBirth2 = sBirth2;
	}
	
	
}
