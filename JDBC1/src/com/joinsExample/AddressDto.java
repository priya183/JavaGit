package com.joinsExample;

public class AddressDto {
	
	private Integer aid;
	private String address;
	private EmployeeDto empDto;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public EmployeeDto getEmpDto() {
		return empDto;
	}
	public void setEmpDto(EmployeeDto empDto) {
		this.empDto = empDto;
	}
	public AddressDto(Integer aid, String address, EmployeeDto empDto) {
		super();
		this.aid = aid;
		this.address = address;
		this.empDto = empDto;
	}
	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddressDto [aid=" + aid + ", address=" + address + ", empDto=" + empDto + "]";
	}

}
