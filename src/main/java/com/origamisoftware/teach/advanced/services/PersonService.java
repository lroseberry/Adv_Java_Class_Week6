package com.origamisoftware.teach.advanced.services;

import com.origamisoftware.teach.advanced.model.Person;
import com.origamisoftware.teach.advanced.model.Stock;

import java.util.List;

/**
 *
 */
public interface PersonService {

    /**
     * Get a list of persons
     *
     * @return a list of person instances
     * @throws PersonServiceException 
     */
    List<Person> getPerson() throws PersonServiceException;

    /**
     * Add/update person 
     *
     * @param person a person object 
     * @throws PersonServiceException 
     */
    void addOrUpdatePerson(Person person) throws PersonServiceException;

    /**
     * Get a list of a person's stocks
     *
     * @return a list of stock instances for a person
     * @throws PersonServiceException 
     */
    List<Stock> getStocks(Person person) throws PersonServiceException;

    /**
     * Assign a stock to a person
     *
     * @param stock  The stock to assign to a person
     * @param person The person the stock should be assigned to 
     * @throws PersonServiceException 
     */
    public void addStockToPerson(Stock stock, Person person) throws PersonServiceException;

}
