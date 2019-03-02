package com.origamisoftware.teach.advanced.model;

import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonStockTest {

    private int id;
    private Person person;
    private Stock stock;
    private PersonStock personStock;

    @Before
    public void setUp() throws Exception {
        id = 1;
        person = new Person("Linda", "Smith", new Timestamp(1970,10,8,0,0,0,0));
        stock = new Stock("Apple", "AAPL");
        personStock = new PersonStock(person, stock);
        personStock.setId(id);
    }

    @Test
    public void testPersonStock() throws Exception {assertNotNull("PersonStock created", personStock);}

    @Test
    public void testGetId() throws Exception { assertEquals("Id get is correct", id, personStock.getId()); }

    @Test
    public void testSetId() throws Exception {
        personStock.setId(25);
        assertEquals("id set is correct", 25, personStock.getId());
    }

    @Test
    public void testGetPerson() throws Exception { assertEquals("person get is correct", person, personStock.getPerson()); }

    @Test
    public void testSetPerson() throws Exception {
        Person person2 = new Person("John", "Smith", new Timestamp(1967,3,23,0,0,0,0));
        personStock.setPerson(person2);
        assertEquals("person set is correct", person2, personStock.getPerson());
    }

    @Test
    public void testGetStock() throws Exception { assertEquals("stock get is correct", stock, personStock.getStock()); }

    @Test
    public void testSetStock() throws Exception {
        Stock stock2 = new Stock("Nike", "NKE ");
        personStock.setStock(stock2);
        assertEquals("stock set correct", stock2, personStock.getStock());
    }
}