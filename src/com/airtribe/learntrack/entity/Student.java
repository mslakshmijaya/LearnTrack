package com.airtribe.learntrack.entity;

import java.util.Objects;

public class Student extends Person {

    private String batch;
    private boolean active;

    public Student(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
        this.active = true;
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
    public void printDisplayName(String name) {
        System.out.println("Student Name: " + name);
    }
}

