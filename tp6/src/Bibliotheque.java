public class Bibliotheque {
    private Document[] listDoc;
    private int nbdocuments;
    private int capacite;
    public Bibliotheque(int capacite) {
        this.listDoc = new Document[capacite];
        this.capacite = capacite;
    }
    public int getCapacite() {
        return capacite;
    }
    void AjoutDoc(Document d) {
        if(nbdocuments>capacite){
            System.out.println("Bibliotheque pleine");
            return;
        }
        else if (nbdocuments==0) {
            listDoc[0]=d;
            nbdocuments++;
            return;
        }
        else {
            int i=0;
            while(i<nbdocuments && listDoc[i].id<d.id){
                i++;
            }
            for(int j=nbdocuments;j>i;j--) {
                listDoc[j]=listDoc[j-1];
            }
            listDoc[i]=d;
            nbdocuments++;
        }
    }
    public void SuppDoc(int num){
        for  (int i=0; i<nbdocuments; i++){
            if (num==listDoc[i].id){
                for (int j=i; j<nbdocuments; j++){
                    listDoc[j]=listDoc[j+1];
                }
                listDoc[nbdocuments-1]=null;
                nbdocuments--;
            }
        }
    }
    public void InventaireDoc(){
        for  (int i=0; i<nbdocuments; i++){
            System.out.println(listDoc[i].toString());
        }
    }
    public int getNbdocuments(){
        return nbdocuments;
    }
    public Bibliotheque listlivre(){
        Bibliotheque b1 = new Bibliotheque(capacite);
        for  (int i=0; i<nbdocuments; i++){
            if (listDoc[i] instanceof Livre){
                b1.AjoutDoc(listDoc[i]);
            }
        }
        return b1;
    }
    public Bibliotheque listarticle(){
        Bibliotheque b2 = new Bibliotheque(capacite);
        for  (int i=0; i<nbdocuments; i++){
            if (listDoc[i] instanceof Article){
                b2.AjoutDoc(listDoc[i]);
            }
        }
        return b2;
    }
    public Bibliotheque listdocssimples(){
        Bibliotheque b3 = new Bibliotheque(capacite);
        for  (int i=0; i<nbdocuments; i++){
            if (listDoc[i] instanceof Document){
                b3.AjoutDoc(listDoc[i]);
            }
        }
        return b3;
    }
    public Bibliotheque listperiodique(){
        Bibliotheque b4 = new Bibliotheque(capacite);
        for  (int i=0; i<nbdocuments; i++){
            if (listDoc[i] instanceof Périodique){
                b4.AjoutDoc(listDoc[i]);
            }
        }
        return b4;
    }
}
