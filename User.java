package com.example.userproject;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import jakarta.persistence.*;
@Entity
@Table(name="user")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="userId")
    private int userId;
    @Column(name="userName")
    private String userName;
    @Column(name="userEmail")
    private  String userEmail;
    @Column(name="age")
    private int age;
    @Column(name="gender")
    private String gender;
    @Column(name="nationally")
    private String nationally;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationally() {
        return nationally;
    }

    public void setNationally(String nationally) {
        this.nationally = nationally;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nationally='" + nationally + '\'' +
                '}';
    }
}
