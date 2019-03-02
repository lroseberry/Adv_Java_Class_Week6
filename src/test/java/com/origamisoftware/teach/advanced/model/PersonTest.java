package com.origamisoftware.teach.advanced.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Timestamp;

public class PersonTest {

    private int id;
    private String firstName;
    private String lastName;
    private Timestamp birthDate;
    private Person person;

    @Before
    public void setUp() throws Exception {
        id = 45;
        firstName = "Erica";
        lastName = "Regan";
        birthDate = new Timestamp(2000,9,28,0,0,0,0);
        person = new Person(firstName,lastName, birthDate);
        person.setId(id);
    }

    @Test
    public void testPerson() throws Exception { assertNotNull("Person created correctly", person);}

    @Test
    public void testGetId() throws Exception { assertEquals("ID is correct", id, person.getId()); }

    @Test
    public void testSetId() throws Exception {
        person.setId(1);
        assertEquals("ID set correctly", 1, person.getId()); }

    @Test
    public void testGetFirstName() throws Exception { assertEquals("Name is correct", firstName, person.getFirstName()); }

    @Test
    public void testSetFirstName() throws Exception {
        person.setFirstName("Erica");
        assertEquals("FirstName set", "Erica", person.getFirstName()); }

    @Test
    public void testGetLastName() throws Exception { assertEquals("Last name is correct", lastName, person.getLastName()); }

    @Test
    public void testSetLastName() throws Exception {
        person.setLastName("Smith");
        assertEquals("LastName set correctly", "Smith", person.getLastName()); }

    @Test
    public void testGetBirthDate() throws Exception { assertEquals("Birthdate is correct", birthDate, person.getBirthDate()); }

    @Test
    public void testSetBirthDate() throws Exception {
        Timestamp birthDate2 = new Timestamp(2003,04,30,0,0,0,0);
        person.setBirthDate(birthDate2);
        assertEquals("BirthDate set correctly", birthDate2, person.getBirthDate()); }

}