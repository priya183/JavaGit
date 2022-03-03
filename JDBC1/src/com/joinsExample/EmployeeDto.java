package com.joinsExample;

public class EmployeeDto {
	
	private Integer eid;
	private String ename;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public EmployeeDto(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDto [eid=" + eid + ", ename=" + ename + "]";
	}
	

}
