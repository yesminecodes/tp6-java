public class Livre extends Article{
    private String nomEditeur;
    public Livre(String titre,int id,int nbPages,String nomAuteur,String nomEditeur){
        super(titre,id,nbPages,nomAuteur);
        this.nomEditeur=nomEditeur;
    }
    public String toString() {
        return ("Ce livre est: "+titre+" de id: "+id+" et de: "+nbPages+ " et le nom de l'auteur est: "+nomAuteur+" et le nom de l'editeur est: "+nomEditeur);
    }
    public String getNomEditeur() {
        return nomEditeur;
    }
    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }
}
