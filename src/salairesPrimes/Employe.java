package salairesPrimes;

abstract class Employe {
 //propriétés
	protected String nom;
	protected String prenom;
	protected int age;
	//protected date;
	
 //constructeur
	public Employe(){
		nom ="";
		prenom ="";
		age = 0;
	}
	
	public Employe(String nom, String prenom, int age){
		this.nom= nom;
		this.prenom = prenom;
		this.age = age;
	}
// accesseurs et mutateurs
	public String getNom(){
		return nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public String getPrenom(){
		return prenom;
	}
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
//méthodes abstraites
	abstract void calculerSalaire();
	
//méthodes
	public String getNom1(){
		String str = "Le nom de l'employé(e) "+this.getNom()+" et son prénom "+this.getPrenom();
		return str;
	}
}
