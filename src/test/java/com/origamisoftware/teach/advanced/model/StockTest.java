package com.origamisoftware.teach.advanced.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class StockTest {

    private int id;
    private String companyName;
    private String symbol;
    private Stock stock;

    @Before
    public void setUp() throws Exception {
        companyName = "Tractor Supply";
        symbol = "TSCO";
        stock = new Stock(companyName, symbol);
    }

    @Test
    public void testStock() throws Exception {
		assertNotNull("Stock created", stock);}

    @Test
    public void testGetId() throws Exception { 
		assertEquals("Id get correct", id, stock.getId()); }

    @Test
    public void testSetId() throws Exception {
        stock.setId(1);
        assertEquals("Id set correct", 1, stock.getId());
    }
    @Test
    public void testGetCompanyName() throws Exception {
		assertEquals("Company get correct", companyName, stock.getCompanyName()); }

    @Test
    public void testSetCompanyName() throws Exception {
        stock.setCompanyName("Tractor Supply");
        assertEquals("Company name set correct", "Tractor Supply", stock.getCompanyName());
    }

    @Test
    public void testGetSymbol() throws Exception { 
		assertEquals("Symbol get correct", "TSCO", stock.getSymbol()); }

    @Test
    public void testSetSymbol() throws Exception {
        stock.setSymbol("INTC");
        assertEquals("Symbol set correct", "INTC", stock.getSymbol());
    }
}