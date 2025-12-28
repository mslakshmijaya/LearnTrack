package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.entity.Person;

import java.util.Objects;

public class Student extends Person {

   private String  batch;
   private  boolean active;

   public Student(String firstname,String lastName,String email){
       super(firstname,lastName,email);
              this.active=true;
   }
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void getDisplayName(String name) {
        System.out.println("Student Name: "+name);
    }
}