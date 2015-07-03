package org.demo.core.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name ="comptepel")

public class PEL extends Compte {

    //private static final long serialVersionUID = 1L;

    //constructeur par défaut
    public PEL(){
    }

    //constructeur avec paramètres
    public PEL(String id, String date, String mont, String plaf, String login)
    {
        super(id , mont , plaf, date, login);
    }

    public String toString(){
        return String.format("PEL[%s]",super.toString());
    }
}



