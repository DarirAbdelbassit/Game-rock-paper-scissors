import java.util.Random;

class StratCoupAleatoire  implements Strategy {
    public static  Random numberGenerator = new Random();
    private static Coup[] tousLesCoups = Coup.values();
    public static Coup randomElement(Coup[] ele) {
       return ele[numberGenerator.nextInt(ele.length)];
    }
    public Coup determinerCoup(){
        return randomElement(tousLesCoups);
    } 
    public static Coup CoupAleatoire(){
        return randomElement(tousLesCoups);
    }
}