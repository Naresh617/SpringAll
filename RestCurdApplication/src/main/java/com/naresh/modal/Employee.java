package com.naresh.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="emptable")
@EntityListeners(AuditingEntityListener.class)
public class Employee 
{
	@Id
	@GeneratedValue(generator="empgen")
	@GenericGenerator(name="empgen",strategy="increment")
	@Column(name="eid")
	private Long empId;
	
	@Column(name="ename")
	@NotBlank
	private String empName;
		
	@Column(name="esal")
	@Digits(integer=10,fraction=3)
	private Double empSal;

	@Column(name="ecdate")
	@CreatedDate
	private Date createDate;
	
	@Column(name="eudate")
	@LastModifiedDate
	private Date updatedDate;
	public Employee()
	{
		
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", createDate=" + createDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
}
