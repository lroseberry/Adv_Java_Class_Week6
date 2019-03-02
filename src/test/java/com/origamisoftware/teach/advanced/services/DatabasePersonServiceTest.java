package com.origamisoftware.teach.advanced.services;

import com.origamisoftware.teach.advanced.model.Person;
import com.origamisoftware.teach.advanced.model.Stock;
import com.origamisoftware.teach.advanced.util.DatabaseUtils;
import org.junit.Before;
import org.junit.Test;

import java.security.Timestamp;

import static org.junit.Assert.*;

public class DatabasePersonServiceTest {

    private DatabaseStockService databaseStockService;
    private PersonService personService;
    private Person person;
    private Stock stock;

    @Before
    public void setUp() throws Exception {
        DatabaseUtils.initializeDatabase(DatabaseUtils.initializationFile);
        personService = ServiceFactory.getPersonServiceInstance();
        person = new Person("Matthew", "Regan", new java.sql.Timestamp(2003,4,30,0,0,0,0));
        stock = new Stock("Netflix", "NFLX");
    }

    @Test
    public void testGetPerson() throws Exception {
        assertNotNull("Got person's from db", personService.getPerson());
    }

    @Test
    public void testAddOrUpdatePerson() throws Exception {
        String placeHolder = "no error thrown";
        personService.addOrUpdatePerson(person);
        assertNotNull("Call update person method", placeHolder);
    }

    @Test
    public void testGetStocks() throws Exception {
        assertNotNull("Get stocks drom db", personService.getStocks(person));
    }

    @Test
    public void testAddStockToPerson() throws Exception {
        String placeHolder = "no error thrown";
        personService.addStockToPerson(stock, person);
        assertNotNull("update stock with person", placeHolder);
    }
}