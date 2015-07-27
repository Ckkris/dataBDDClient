package org.demo.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TransactionPK implements Serializable {
 
	@Column(name = "id_trans")
	private String id_trans;
	//Clé étrangère
	@Column (name = "id_compte_fk_e", insertable=false ,updatable=false) 
	private String idcomptefkemeteur;
	//Clé étrangère
	@Column (name = "id_compte_fk_r", insertable=false ,updatable=false) 
	private String idcomptefkrecepteur; 
	
    public TransactionPK(){
        // Your class must have a no-arq constructor
    }
 
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof TransactionPK){
            TransactionPK TransactionPK = (TransactionPK) obj;
 
            if(!TransactionPK.getid_trans().equals(id_trans)){
                return false;
            }
 
            if(!TransactionPK.getidcomptefkemeteur().equals(idcomptefkemeteur)){
                return false;
            }
            
           
            return true;
        }
 
        return false;
    }
 
    @Override
    public int hashCode() {
        return id_trans.hashCode() + idcomptefkemeteur.hashCode();
    }
 
    public String getid_trans() {
        return id_trans;
    }
 
    public void setid_trans(String id_trans) {
        this.id_trans = id_trans;
    }
 
    public String getidcomptefkemeteur() {
        return idcomptefkemeteur;
    }
 
    public void setidcomptefkemeteur(String idcomptefkemeteur) {
        this.idcomptefkemeteur = idcomptefkemeteur;
    } {

}

	public String getId_trans() {
		return id_trans;
	}

	public void setId_trans(String id_trans) {
		this.id_trans = id_trans;
	}

	public String getIdcomptefkemeteur() {
		return idcomptefkemeteur;
	}

	public void setIdcomptefkemeteur(String idcomptefkemeteur) {
		this.idcomptefkemeteur = idcomptefkemeteur;
	}
	
	
	
}

	

	
