package org.demo.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "client")
public class Client {
	
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)  // Optionnel
    @Column(name = "login")
    private String login;

    /* l'attribut "name" pour l'annotation
    @Table existe pour le package javax.persistence, pas pour l'annotation du package d'hibernate.
    Donc dans un premier temps, pense à cliquer sur la popup en haut à droite de ton screenshot
    "Enable Auto Import" pour maven (ça te ramènera les dépendences maven automatiquement sans avoir à refaire un
    click droit sur ton projet > Maven > Reimport)
    Dans un deuxième temps, enlève ton import sur org.hibernate.annotations.Table et import plutôt
    "javax.persistence.Table", l'attribut name sera détecté (si tu fais F3 avec la keymap eclipse sur cette annotation,
    tu trouveras l'attribut "name" dans l'implementation, si tu n'arrives pas à récupérer les sources, voilà la preuve via
    la source de cette annotation*/

    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "mail")
    private String mail;

     /*   @OneToMany(fetch = FetchType.LAZY) //(mappedBy="client")
        @JoinColumn(name="id_compte")
        private Set<Compte> comptes;*/

        //constructeur par défaut
        public Client() {
        }


        
        //toString pour que springboot lise le contenue des lignes de la BDD en lancant DataBdd2Application
    
        @Override
    public String toString() {
        return String.format("Client[login='%s', nom='%s', prenom='%s', mail='%s', adresse='%s']", login, nom, prenom, mail, adresse); //Indispensable pour utiliser la méthode findAll()
    }

        //getters et setters pour lire le contenue des objet en lancant le controller2
        
        public String getNom()
        {
        	return this.nom;
        }
        
        public String getPrenom()
        {
        	return this.prenom;
        }
        
        public String getAdresse()
        {
        	return this.adresse;
        }
        
        public String getMail()
        {
        	return this.mail;
        }
        
        public String getLogin(){
        	return this.login;
        }



		public void setLogin(String login) {
			this.login = login;
		}



		public void setNom(String nom) {
			this.nom = nom;
		}



		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}



		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}



		public void setMail(String mail) {
			this.mail = mail;
		}
        
        
        
        
        
        
        
}
