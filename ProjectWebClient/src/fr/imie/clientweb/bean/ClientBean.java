package fr.imie.clientweb.bean;

public class ClientBean {
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private String mdp;
	private String err="";
	

	public ClientBean() {
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public boolean isConnecter(String email1, String mdp1){
/*		if (this.email.equals(email1)&& this.mdp.equals(mdp1))return true;
		else return false;*/
		return true;
		
	}
	public String getErr() {
		return err;
	}
	public void setErr(String err) {
		this.err = err;
	}
	
	public void testModifcation(){
		
	}

}
