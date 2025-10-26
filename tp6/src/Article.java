public class Article extends Document{
    protected String nomAuteur;
    public Article(String titre,int id,int nbPages,String nomAuteur) {
        super(titre, id, nbPages);
        this.nomAuteur = nomAuteur;
    }
    public String toString() {
        return ("Cet article est: "+titre+" de id: "+id+" et de: "+nbPages+ " et le nom de l'auteur est: "+nomAuteur);
    }
}
