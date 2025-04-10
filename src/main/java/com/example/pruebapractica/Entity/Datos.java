package com.example.pruebapractica.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "datos")
public class Datos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "external_id")
    private String externalId;

    @Column(name = "first_name")
    private String firstName;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setPhone_number(String phone_number) {
        this.phoneNumber = phone_number;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public void setExternal_id(String external_id) {
        this.externalId = external_id;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public Integer getId() {
        return id;
    }

    public String getPhone_number() {
        return phoneNumber;
    }

    public String getLast_name() {
        return lastName;
    }

    public String getExternal_id() {
        return externalId;
    }

    public String getFirst_name() {
        return firstName;
    }
}
