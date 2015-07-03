package org.demo.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Compte {
    //private static final Long serialVersionUID = 1L;

    @ManyToOne//(fetch = FetchType.LAZY) --> On enlève car impossibilité d'utilisé getclient() à partir d'un objet compte
    @JoinColumn(name = "login_fk")//meme nom que dans la table compte et non celui de la table client !!
    private Client client;

    //Clé étrangère
    @Column (name = "login_fk", insertable=false ,updatable=false) // ajouté
    private String loginfk;

    //clé primaire
    //@Column(name = "id_compte", unique=true, insertable = true, updatable= true)
    @Id
    @Column(name = "id_compte")
    private String id_compte;
    @Column(name ="plafond")
    private String plafond;
    @Column(name ="montant")
    private String montant;
    @Column( name = "datecreation")
    private String dateCreation;

    //constructeur par defaut
    public Compte(){
    }
    //constructeur par paramètre
    public Compte(String id, String plaf, String mont, String date, String loginfk){
        this.id_compte=id;
        this.plafond=plaf;
        this.montant=mont;
        this.dateCreation=date;
        this.loginfk=loginfk;
    }
    
    public Client getClient() {
		return client;
	}
    
	public void setClient(Client client) {
		this.client = client;
	}
	
	public String getLogin_fk() {
		return loginfk;
	}
	
	public void setLogin_fk(String loginfk) {
		this.loginfk = loginfk;
	}
	
	public String getId_compte() {
		return id_compte;
	}
	
	public void setId_compte(String id_compte) {
		this.id_compte = id_compte;
	}
	
	public String getPlafond() {
		return plafond;
	}
	
	public void setPlafond(String plafond) {
		this.plafond = plafond;
	}
	
	public String getMontant() {
		return montant;
	}
	
	public void setMontant(String montant) {
		this.montant = montant;
	}
	
	public String getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	//new SimpleDateFormat("dd/MM/yyyy").format(dateCreation)  %1$td-%1$tm-%1$tY
    public String toString() {
        return String.format("Compte[%s, %s, %s, %s, %s]", id_compte, plafond, montant, dateCreation, loginfk);//Il faut que les paramètre soient présent dans les champs @Column
    }
    
    //getters et setters
  
    
}