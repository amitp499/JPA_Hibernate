package com.jp.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMP_OTO")
public class Employee implements Serializable{
	
private static final long serialVersionUID = 7052158927302718379L;
	
	@Id
	@Column(name="EMP_ID")
	private Long empId;
	
	
	@Column(name="EMP_NAME")
	private String empName;

	@Column(name="EMP_SAL")
	private Double empSal;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="employee")	
	@JoinColumn(name="address_id")
	private Address address;
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", address=" + address
				+ "]";
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
	

}
