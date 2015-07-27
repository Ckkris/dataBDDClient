package org.demo.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name ="transaction")
public class Transaction {
	
	  @ManyToOne//(fetch = FetchType.LAZY) --> On enlève car impossibilité d'utilisé getcompte() à partir d'un objet transaction
	  @JoinColumn(name = "id_compte_fk_e")//meme nom que dans la table transaction et non celui de la table compte !!
	  private Courant courantE;
	  
	  @ManyToOne//(fetch = FetchType.LAZY) --> On enlève car impossibilité d'utilisé getcompte() à partir d'un objet transaction
	  @JoinColumn(name = "id_compte_fk_r")//meme nom que dans la table transaction et non celui de la table compte !!
	  private Courant courantR;
	  
  
  //clé primaire
  //@Column(name = "id_compte", unique=true, insertable = true, updatable= true)
	   @Id
	   @Column(name = "id_trans")
	   private String id_trans;
	   @Column(name ="montant_trans")
	   private String montant_trans;
	   @Column(name ="date_trans")
	   private String date_trans;
	   //Clé étrangère
	   @Column (name = "id_compte_fk_e", insertable=false ,updatable=false) 
	   private String idcomptefkemeteur;
	   //Clé étrangère
	   @Column (name = "id_compte_fk_r", insertable=false ,updatable=false) 
	   private String idcomptefkrecepteur; 

	   //constructeur par défaut //INDISPENSABLE
       public Transaction() {
       }
   
	    public Transaction(String idcomptefkemeteur, String idcommptefkrecepteur,
				String id_trans, String montant_trans, String date_trans) {
			super();
			this.idcomptefkemeteur = idcomptefkemeteur;
			this.idcomptefkrecepteur = idcommptefkrecepteur;
			this.id_trans = id_trans;
			this.montant_trans = montant_trans;
			this.date_trans = date_trans;
		}
	    
	    @Override
	    public String toString() {
	        return String.format("Transaction[id='%s', idcomptefkemeteur='%s', idcomptefkrecepteur='%s', montant='%s', dae='%s']", id_trans, idcomptefkemeteur, idcomptefkrecepteur, montant_trans, date_trans); //Indispensable pour utiliser la méthode findAll()
	    }
	    
	    //Geters / Seters
		public Courant getCourantE() {
			return courantE;
		}
		public Courant getCourantR() {
			return courantR;
		}
		
		public String getIdcomptefk_Emeteur() {
			return idcomptefkemeteur;
		}
		public void setIdcomptefk_Emeteur(String idcomptefkemeteur) {
			this.idcomptefkemeteur = idcomptefkemeteur;
		}
		public String getIdcomptefk_Recepteur() {
			return idcomptefkrecepteur;
		}
		public void setIdcomptefk_Recepteur(String idcompptefkrecepteur) {
			this.idcomptefkrecepteur = idcompptefkrecepteur;
		}
		public String getId_trans() {
			return id_trans;
		}
		public void setId_trans(String id_trans) {
			this.id_trans = id_trans;
		}
		public String getMontant_trans() {
			return montant_trans;
		}
		public void setMontant_trans(String montant_trans) {
			this.montant_trans = montant_trans;
		}
		public String getDate_trans() {
			return date_trans;
		}
		public void setDate_trans(String date_trans) {
			this.date_trans = date_trans;
		}



//Classe pour lemode composite primary key_____________________________________________

//@Entity
//@Table( name ="transaction")
//public class Transaction {
//    @EmbeddedId
//    private TransactionPK id;
//    @Column(name ="montant_trans")
//	private String montant_trans;
//	@Column(name ="date_trans")
//	private String date_trans;
//
//
//	//constructeur par défaut
//	public Transaction() {
//	}
//
//
//	public TransactionPK getId() {
//		return id;
//	}
//	
//	public String getCompteE(){
//		return id.getidcomptefkemeteur();
//	}
//
//
//	public void setId(TransactionPK id) {
//		this.id = id;
//	}
//
//
//	public String getMontant_trans() {
//		return montant_trans;
//	}
//
//
//	public void setMontant_trans(String montant_trans) {
//		this.montant_trans = montant_trans;
//	}
//
//
//	public String getDate_trans() {
//		return date_trans;
//	}
//
//
//	public void setDate_trans(String date_trans) {
//		this.date_trans = date_trans;
//	}
	
	
}
