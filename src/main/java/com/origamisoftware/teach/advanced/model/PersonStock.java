package com.origamisoftware.teach.advanced.model;

import javax.persistence.*;

/**
 * PersonStock entity 
 */
@Entity
@Table(name = "person_stock")
public class PersonStock {
    private int id;
    private Person person;
    private Stock stock;

    /**
     * Default constuctor 
     */
    public PersonStock() {
    }

    /**
     * Create a PersonStock
     *
     * @param person the person to assign the stock to
     * @param stock  the stock to associate to the person 
     */
    public PersonStock(Person person, Stock stock) {
        setStock(stock);
        setPerson(person);
    }

    /**
     * Propert accessors
     *
     * @return a unique integer value
     */
    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    /**
     * Set the ID for a row in the person_stock table
     *
     * @param id a unique value.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return get the Person associated with this Stock
     */
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "ID", nullable = false)
    public Person getPerson() {
        return person;
    }

    /**
     *
     * @param person a person instance
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * @return get the Stock for this Person
     */
    @ManyToOne
    @JoinColumn(name = "stock_id", referencedColumnName = "ID", nullable = false)
    public Stock getStock() {
        return stock;
    }

    /**
     *
     * @param stock a stock instance
     */
    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
