package com.example.pruebapractica.model;

public class Objetos {
    private String[] phoneNumbers;

    private String lastName;

    private String externalId;

    private String firstName;


    public Objetos() {
    }

    public Objetos(String[] phone_numbers, String last_name, String external_id, String first_name) {
        this.phoneNumbers = phone_numbers;
        this.lastName = last_name;
        this.externalId = external_id;
        this.firstName = first_name;
    }

    public String[] getPhone_numbers() {
        return phoneNumbers;
    }

    public void setPhone_numbers(String[] phone_numbers) {
        this.phoneNumbers = phone_numbers;
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
