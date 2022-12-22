public class App {
    public static void main(String[] args){
        //Partie(int nbTours, String j1,String j2,Strategy strat1, Strategy strat2 ){
            Partie p = new Partie(2, "player1", "player2", new StratClavier(), new StratCoupAleatoire());
            p.lancerPartie();
    }
}