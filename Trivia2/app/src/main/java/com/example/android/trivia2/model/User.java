package com.example.android.trivia2.model;

import android.util.Log;

public class User {

    private int idStudent;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String gender; // 1-female, 2-male
    private String sexuality; // 1-hetero, 2-homo
    private String preference; // 1-female, 2-male
    private String department;
    private String phoneNumber;
    private String points;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", sexuality='" + sexuality + '\'' +
                ", preference='" + preference + '\'' +
                ", department='" + department + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", points='" + points + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(int idStudent, String name, String surname, int age, String email, String gender, String sexuality, String preference, String department, String phoneNumber, String points, String password) {
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

    public User(){

    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSexuality() {
        return sexuality;
    }

    public void setSexuality(String sexuality) {
        this.sexuality = sexuality;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
