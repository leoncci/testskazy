package com.exemple.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity   
@Entity
// defining class name as Table name
@Table
public class baoloc {
    // mark id as primary key
    @Id
    // defining id as column name
    @Column
    private int id;
    // defining name as column name
    @Column
    private String combinaison;
    // defining result as column name
    @Column
    private int result;
    // defining email as column name

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcombinaison() {
        return combinaison;
    }

    public void setcombinaison(String combinaison) {
        this.combinaison = combinaison;
    }

    public int getresult() {
        return result;
    }

    public void setresult(int result) {
        this.result = result;
    }

}