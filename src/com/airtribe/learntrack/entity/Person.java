package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.util.IdGenerator;

public abstract class Person {
    private String firstName, lastName,email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    public Person(String firstname,String lastName){
        this.id = IdGenerator.getNextStudentId();
        this.firstName = firstname;
        this.lastName = lastName;

    }
    public Person(String firstname,String lastName,String email){
        this.id = IdGenerator.getNextStudentId();
        this.firstName = firstname;
        this.lastName = lastName;
        this.email = email;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   public abstract void getDisplayName(String name);

}
