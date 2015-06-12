package org.demo.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "compte")
public class Compte {
	
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)  // Optionnel
    @Column(name = "id_compte")
    private String id_compte;

    /* l'attribut "name" pour l'annotation
    @Table existe pour le package javax.persistence, pas pour l'annotation du package d'hibernate.
    Donc dans un premier temps, pense à cliquer sur la popup en haut à droite de ton screenshot
    "Enable Auto Import" pour maven (ça te ramènera les dépendences maven automatiquement sans avoir à refaire un
    click droit sur ton projet > Maven > Reimport)
    Dans un deuxième temps, enlève ton import sur org.hibernate.annotations.Table et import plutôt
    "javax.persistence.Table", l'attribut name sera détecté (si tu fais F3 avec la keymap eclipse sur cette annotation,
    tu trouveras l'attribut "name" dans l'implementation, si tu n'arrives pas à récupérer les sources, voilà la preuve via
    la source de cette annotation*/

    @Column(name = "plafond")
    private String plafond;
    @Column(name = "montant")
    private String montant;
    @Column(name = "datecreation")
    private String datecreation;
    

     /*   @OneToMany(fetch = FetchType.LAZY) //(mappedBy="client")
        @JoinColumn(name="id_compte")
        private Set<Compte> comptes;*/

        //constructeur par défaut
        public Compte() {
        }


        
        //toString pour que springboot lise le contenue des lignes de la BDD en lancant DataBdd2Application
    
        @Override
    public String toString() {
        return String.format("Compte[id_compte='%s', plafond='%s', montant='%s', datecreation='%s']", id_compte, plafond, montant, datecreation); //Indispensable pour utiliser la méthode findAll()
    }

        //getters et setters pour lire le contenue des objet en lancant le controller2
        
        public String getplafond()
        {
        	return this.plafond;
        }
        
        public String getmontant()
        {
        	return this.montant;
        }
        
        public String getdatecreation()
        {
        	return this.datecreation;
        }
        
        
        public String getid_compte(){
        	return this.id_compte;
        }



		public void setid_compte(String id_compte) {
			this.id_compte = id_compte;
		}



		public void setplafond(String plafond) {
			this.plafond = plafond;
		}



		public void setmontant(String montant) {
			this.montant = montant;
		}



		public void setdatecreation(String datecreation) {
			this.datecreation = datecreation;
		}


        
        
        
        
        
        
        
}
