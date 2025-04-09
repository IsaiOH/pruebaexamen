package com.example.pruebapractica.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "datos")
public class datos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "external_id")
    private String external_id;

    @Column(name = "first_name")
    private String first_name;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Integer getId() {
        return id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getExternal_id() {
        return external_id;
    }

    public String getFirst_name() {
        return first_name;
    }
}
