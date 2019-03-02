package com.origamisoftware.teach.advanced.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Person entity

 */
@Entity
@Table(name="person")
public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private Timestamp birthDate;

    /**
     * default constuctor 
     */
    public Person() {
    }

    public Person(String firstName, String lastName, Timestamp birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    /**
     * property accessors
     *
     * @return a unique integer value
     */
	@Id
    @Column(name = "ID", unique=true, nullable = false) 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    /**
     * Set the ID for one row in the person table
     *
     * @param id a unique value
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the person's first name
     */
    @Basic
    @Column(name = "first_name", nullable = false, insertable = true, updatable = true, length = 256)
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName a String value for a person's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return the person's last name
     */
    @Basic
    @Column(name = "last_name", nullable = false, insertable = true, updatable = true, length = 256)
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName a String value for a person's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return the person's date of birth
     */
    @Basic
    @Column(name = "birth_date", nullable = false, insertable = true, updatable = true)
    public Timestamp getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate  a timestamp for a person's date of birth
     */
    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

}
