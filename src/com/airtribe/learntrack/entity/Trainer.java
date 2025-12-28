package com.airtribe.learntrack.entity;

public class Trainer extends Person{
    public Trainer(String firstName,String lastName,String email){
        super(firstName,lastName,email);

    }
    @Override
    public void printDisplayName(String name) {
        System.out.println("Trainer Name: "+name);
    }
}
