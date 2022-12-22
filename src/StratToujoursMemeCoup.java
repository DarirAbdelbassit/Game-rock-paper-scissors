class StratToujoursMemeCoup  implements Strategy {
    private Coup leCoup;
    public Coup determinerCoup(){
        if(leCoup==null)
            leCoup = StratCoupAleatoire.CoupAleatoire();
        return leCoup;
    } 
} 