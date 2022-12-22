import java.util.Scanner;

class StratClavier implements Strategy {
    public Coup determinerCoup(){
        String txt;
        Scanner s = new Scanner(System.in);
        System.out.print("Entrer un Coup : ");
        txt = s.nextLine();
        while(!Coup.isValide(txt)){
            System.out.print("Entrer un Coup valide : ");
            txt = s.nextLine();
        }
        return Coup.fromString(txt);
    } 
}