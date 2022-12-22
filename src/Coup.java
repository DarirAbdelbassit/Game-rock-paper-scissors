public enum Coup {
    PIERRE, CISEAUX, PAPIER;
    private String  nomCoup;
    private Coup() {    }
    private Coup(String nomCoup) {
        this.nomCoup = nomCoup;
    }
    public static Coup fromString(String str){
        for(Coup c: Coup.values())
            if(c.name() == str)
                return c;
        return null;
    }
    public static boolean isValide(String str){
        for(Coup c: Coup.values()){
            if(c.name().toLowerCase().equals(str.toLowerCase())){
                return true;
            }
        }
        return false;
    }
}