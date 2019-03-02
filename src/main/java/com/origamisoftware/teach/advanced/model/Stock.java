package com.origamisoftware.teach.advanced.model;

import javax.persistence.*;

/**
 * stocks entity
 */
@Entity
@Table(name="stocks")
public class Stock {

    private int id;
    private String companyName;
    private String symbol;

    /**
     * default constuctor 
     */
    public Stock() {}

    /**
     * Create a stock object
     * @param companyName string
     * @param symbol string
     */
    public Stock(String companyName, String symbol) {
        this.companyName = companyName;
        this.symbol = symbol;
    }

    /**
     * property accessors
     *
     * @return a unique integer value
     */
    @Id
    @Column(name = "ID", nullable = false) 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    /**
     * Set the ID for a row in the stocks table
     *
     * @param id a unique value.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return the company's name
     */
    @Basic
    @Column(name = "company_name", nullable = false, insertable = true, updatable = true, length = 256)
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName a String value for the stock's associated company name
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     *
     * @return the company's symbol
     */
    @Basic
    @Column(name = "symbol", nullable = false, insertable = true, updatable = true, length = 256)
    public String getSymbol() {
        return symbol;
    }
	
	/**
     * @param symbol a String value for the stock's symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
