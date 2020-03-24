package com.example.Web.Service;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class UserModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;
	
	private String name;	
	private String surname;
	private int age;
	private String email;
	private int gender; // 1-female, 2-male
	private int sexuality; // 1-hetero, 2-homo
	private int preference; // 1-female, 2-male
	private String department;
	private int phoneNumber;
	private double points;
	private String password;

	public Long getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getSexuality() {
		return sexuality;
	}

	public void setSexuality(int sexuality) {
		this.sexuality = sexuality;
	}

	public int getPreference() {
		return preference;
	}

	public void setPreference(int preference) {
		this.preference = preference;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public UserModel(Long idStudent, String name, String surname, int age, String email, int gender, int sexuality,
			int preference, String department, int phoneNumber, double points, String password) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.email = email;
		this.gender = gender;
		this.sexuality = sexuality;
		this.preference = preference;
		this.department = department;
		this.phoneNumber = phoneNumber;
		this.points = points;
		this.password = password;
	}
	
	public UserModel() {
		
	}
}
