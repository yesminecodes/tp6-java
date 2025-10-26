public class TestBibliotheque {
    public static void main(String[] args) {
        Document d1 = new Document("journal",1,3);
        Document d2 = new Document("aya abdelkhalek",1,3);
        Article a1= new Article("Yesmine",5,20,"Ghodhbane");
        Livre l1= new Livre ("Nadia limam",3,200,"nadia limam","nadia limam");
        Livre l2= new Livre("rimeh bensalah",7,1000,"rimeh bensalah","rimeh bensalah");
        Périodique p1= new Périodique("adem",8,45,"Mensuel");

        Bibliotheque b= new Bibliotheque(10);

        b.AjoutDoc(d1);
        b.AjoutDoc(d2);
        b.AjoutDoc(a1);
        b.AjoutDoc(l1);
        b.AjoutDoc(l2);
        b.AjoutDoc(p1);

        b.SuppDoc(d2.id);

        b.InventaireDoc();
        System.out.println("******************");
        Bibliotheque d= b.listlivre();
        d.InventaireDoc();



    }
}
