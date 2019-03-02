package com.origamisoftware.teach.advanced.services;

import com.origamisoftware.teach.advanced.model.StockQuote;
import com.origamisoftware.teach.advanced.util.DatabaseInitializationException;
import com.origamisoftware.teach.advanced.util.DatabaseUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the DatabaseStockService
 */
public class DatabaseStockServiceTest {

    private DatabaseStockService databaseStockService;

    @Before
    public void setUp() throws DatabaseInitializationException {
        DatabaseUtils.initializeDatabase(DatabaseUtils.initializationFile);
        databaseStockService = new DatabaseStockService();
    }

    @Test
    public void testGetQuote() throws Exception {
        String symbol = "AAPL";
        StockQuote stockQuote = databaseStockService.getQuote(symbol);
        assertNotNull("Verify we can get a stock quote from the db", stockQuote);
        assertEquals("Make sure the symbols match", symbol, stockQuote.getSymbol());
    }

}