package com.origamisoftware.teach.advanced.util;

import org.junit.Test;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.Statement;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *  Tests for the DatabaseUtils class
 */
public class DatabaseUtilsTest {
	
	@Test
    public void testGetSessionFactory() throws Exception {
        SessionFactory sessionFactory = DatabaseUtils.getSessionFactory();
        assertNotNull("able to get session factory", sessionFactory);
    }

    @Test
    public void testGoodInitFile() throws Exception {
        DatabaseUtils.initializeDatabase(DatabaseUtils.initializationFile);
    }

    @Test(expected = DatabaseInitializationException.class)
    public void testBadInitFile() throws Exception {
        DatabaseUtils.initializeDatabase("  ");
    }

    @Test
    public void testGetConnection() throws Exception{
        Connection connection = DatabaseUtils.getConnection();
        assertNotNull("Connection made",connection);
    }

    @Test
    public void testGetConnectionWorks() throws Exception{
        Connection connection = DatabaseUtils.getConnection();
        Statement statement = connection.createStatement();
        boolean execute = statement.execute("select * from quotes");
        assertTrue("verify that we can execute a statement",execute);
    }

}
