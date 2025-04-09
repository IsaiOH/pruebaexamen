package com.example.pruebapractica.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

public class Numbers {

    private String[] phone_numbers;

    private String last_name;

    private String external_id;

    private String first_name;

    public Numbers(String[] numbers, String last_name, String external_id, String first_name) {
        this.phone_numbers = numbers;
        this.last_name = last_name;
        this.external_id = external_id;
        this.first_name = first_name;
    }

    public Numbers() {
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

    public String[] getNumbers() {
        return phone_numbers;
    }

    public void setNumbers(String[] numbers) {
        this.phone_numbers = numbers;
    }
}
