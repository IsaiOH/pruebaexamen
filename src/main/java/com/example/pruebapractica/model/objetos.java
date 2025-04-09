package com.example.pruebapractica.model;

public class objetos {
    private String[] phone_numbers;

    private String last_name;

    private String external_id;

    private String first_name;


    public objetos() {
    }

    public objetos(String[] phone_numbers, String last_name, String external_id, String first_name) {
        this.phone_numbers = phone_numbers;
        this.last_name = last_name;
        this.external_id = external_id;
        this.first_name = first_name;
    }

    public String[] getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(String[] phone_numbers) {
        this.phone_numbers = phone_numbers;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
