package com.kumar.JavaProject.com.kumar.JavaProject.User;

import ch.qos.logback.classic.db.names.ColumnName;

import javax.persistence.*;

/**
 * Created by kumaraswamyDR on 01/03/17.
 */

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int user_id;

    private String name;
    private String emailId;
    private String gender;
    private String age;

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int userId) {
        this.user_id = userId;
    }

    public User(int user_id, String name, String emailId, String gender, String age) {
        this.user_id = user_id;
        this.name = name;
        this.emailId = emailId;
        this.gender = gender;
        this.age = age;
    }

    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

