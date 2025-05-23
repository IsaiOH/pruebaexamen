package com.example.pruebapractica.response;

import jakarta.persistence.Column;





public class Numbers {

    private String[] phoneNumbers;

    private String lastName;

    private String externalId;

    private String firstName;

    public Numbers(String[] numbers, String last_name, String external_id, String first_name) {
        this.phoneNumbers = numbers;
        this.lastName = last_name;
        this.externalId = external_id;
        this.firstName = first_name;
    }

    public Numbers() {
    }
    public String[] getNumbers() {
        return phoneNumbers;
    }

    public void setNumbers(String[] numbers) {
        this.phoneNumbers = numbers;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public String getExternal_id() {
        return externalId;
    }

    public void setExternal_id(String external_id) {
        this.externalId = external_id;
    }

    public String getFirst_name() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }


}
