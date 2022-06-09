package com.example.gson_list;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {

    @SerializedName("role")
    private  String mRole;
    @SerializedName("age")
    private Integer mAge;

    public  FamilyMember(String role, Integer age){
        mRole = role;
        mAge = age;
    }
}
