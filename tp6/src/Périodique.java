public class Périodique extends Document{
    private String frequence;
    public Périodique(String titre, int id,int nbPages, String frequence) {
        super(titre, id, nbPages);
        this.frequence=frequence;
    }
    public String toString() {
        return ("le périodique est: "+titre+" de id: "+id+" et de: "+nbPages+" et de fréquence de parution de: "+frequence);
    }
    public String getFrequence(){
        return frequence;
    }
    public void setFrequence(String frequence){
        this.frequence=frequence;
    }
}
