package org.demo.core.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name ="comptecourant")

public class Courant extends Compte {

    //private static final long serialVersionUID = 1L;

    //constructeur par défaut
    public Courant(){
    }

    //constructeur avec paramètres
    public Courant(String id, Date date, Long mont, Long plaf, String login)
    {
        super(id , mont , plaf, date, login);
    }

    public String toString(){
        return String.format("Courant[%s]",super.toString());
    }
}