public class Document {
    protected String titre;
    protected int id;
    protected int nbPages;
    public Document(String titre, int id, int nbPages) {
        this.titre = titre;
        this.id = id;
        this.nbPages = nbPages;
    }
    public String toString() {
        return ("Ce document est: "+titre+" de id: "+id+" et de: "+nbPages);
    }
}
