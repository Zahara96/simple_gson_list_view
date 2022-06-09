package com.example.gson_list;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {

    private  String firstName;
    private  int age;
    private String mail;

    public Employee(String firstName, int age, String mail){
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
    }
/*
    @SerializedName("address")
    private  Address mAddress;

    @SerializedName("family")
    private List<FamilyMember> mFamily;

    public Employee(String firstName, int age, String mail, Address address, List<FamilyMember> family){
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        mAddress = address;
        mFamily = family;
    }

 */

}
