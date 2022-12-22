class Partie {
    private int nbTours;
    private Joueur joueur1;
    private Joueur joueur2;
    public Partie(int nbTours, String j1,String j2,Strategy strat1, Strategy strat2 ){
        this.nbTours = nbTours;
        this.joueur1 = new Joueur(j1,strat1);
        this.joueur2 = new Joueur(j2,strat2);
    }
    public void afficher(){
        System.out.println(" joueur : "+this.joueur1.getNom()+" Score :"+this.joueur1.getScore());
        System.out.println(" joueur : "+this.joueur2.getNom()+" Score : "+this.joueur2.getScore());
    }
    public void lancerPartie(){
        for(int i = 1; i<=this.nbTours;i++){
            jouerTour(i);
        }
        determinerGagnant();
    }
    public void comparerCoup(Coup c1, Coup c2){
        if(c1==Coup.CISEAUX && c2==Coup.PAPIER){
            this.joueur1.setScore(this.joueur1.getScore()+1);
        }
        else if(c1==Coup.PIERRE && c2==Coup.CISEAUX){
            this.joueur1.setScore(this.joueur1.getScore()+1);
        }
        else if(c1==Coup.PAPIER && c2==Coup.PIERRE){
            this.joueur1.setScore(this.joueur1.getScore()+1);
        }
        else if(c1==c2){}
        else {
            this.joueur2.setScore(this.joueur2.getScore()+1);
        }
    }
    public String determinerGagnant(){
        if(this.joueur1.getScore() >this.joueur2.getScore()){
            System.out.println("Le Gagnant est : "+joueur1.getNom());
        } else if(this.joueur1.getScore() <this.joueur2.getScore()){
            System.out.println("Le Gagnant est : "+joueur2.getNom());
        }
        else{
            System.out.println("match null");
        }
        return null ;
    }
    public boolean jouerTour(int leNumTour ){
        Coup c1 = this.joueur1.JouerCoup();
        Coup c2 = this.joueur2.JouerCoup();
        comparerCoup(c1, c2);
        afficher();
        return true;
    }
}