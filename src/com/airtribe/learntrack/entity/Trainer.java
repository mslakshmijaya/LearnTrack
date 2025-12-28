package com.airtribe.learntrack.entity;

public class Trainer extends Person{
    public Trainer(String firstname,String lastName,String email){
        super(firstname,lastName,email);

    }
    @Override
    public void getDisplayName(String name) {
        System.out.println("Student Name: "+name);
    }
}
