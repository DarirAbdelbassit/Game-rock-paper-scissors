class Joueur  {
    private String nom;
    private int score;
    private Strategy saStrategie;
    public Joueur(String n, Strategy s){
        nom = n ;
        saStrategie = s;
    }
    public Coup JouerCoup(){
        return saStrategie.determinerCoup();
    }
    public String getNom() {
        return nom;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    

}