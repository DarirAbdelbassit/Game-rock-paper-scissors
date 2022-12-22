class StartCoupCyclique implements Strategy {
    private Coup coupPercedent;

    public Coup determinerCoup(){
        if(Coup.PIERRE == coupPercedent){
            coupPercedent = Coup.CISEAUX;
            return coupPercedent;
        }else if(Coup.CISEAUX == coupPercedent){
            coupPercedent = Coup.PAPIER;
            return coupPercedent;
        }else if (Coup.PAPIER == coupPercedent){
            coupPercedent = Coup.PIERRE;
            return coupPercedent;
        }else {
            coupPercedent = Coup.PIERRE;
            return coupPercedent;
        }
    } 
}