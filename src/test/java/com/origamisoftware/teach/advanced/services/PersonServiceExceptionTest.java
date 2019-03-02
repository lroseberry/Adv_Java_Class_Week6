package com.origamisoftware.teach.advanced.services;

import org.junit.Test;
import java.sql.SQLException;
import static org.junit.Assert.assertNotNull;

public class PersonServiceExceptionTest {

    @Test
    public void testDatabaseInitializationExceptionTest() {

        assertNotNull(new PersonServiceException("There is an error with the PersonService: ", new SQLException()));
    }
}