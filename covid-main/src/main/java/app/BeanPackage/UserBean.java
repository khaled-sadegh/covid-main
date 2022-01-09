package app.BeanPackage;

public class UserBean {
    private int id;
    private String nom;
    private String prenom;
    private String rang;
    private String password;
    private String login;
    private String dateNaissance;
    private boolean infecte;
    private Arraylist<User> lesAmis;

    public UserBean(){
        this.infecte = false;
        this.lesAmis = new Arraylist<>;
    }

    public void supprimerAmi(UserBean user){
        lesAmis.remove(user);
    }

    public void ajouterAmi(UserBean user){
        lesAmis.add(user);
    }

    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getPassword() {
        return this.password;
    }

    public String getLogin() {
        return this.login;
    }

    public String getRang() {
        return this.rang;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }

    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public void setLogin( String login ) {
        this.login = login;
    }

    public void setRang( String rang ) {
        this.rang = rang;
    }

    public boolean estInfecte(){
        return this.infecte;
    }
}
