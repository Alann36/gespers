
import java.util.TreeMap;

public class Test {

    public static void main(String argv[]) throws Exception {
        // définition du conteneur
        Conteneur<String, Personnel> listePersonnel = new Conteneur<>(new TreeMap<String, Personnel>());
        try
        {
            listePersonnel.charger("test.txt");
        } catch (Exception ex){ 
            System.out.println(ex.getMessage());
        }
//        Employe a= new Employe("Pierre","00998", 78, 8);
//        Employe b= new Employe("Paul","00998", 78, 8);
//        Employe c= new Employe("Jack","00998", 78, 8);
//        Commercial d= new Commercial("Bidule","00998", 78, 8);
//        Commercial e= new Commercial("Toto","00998", 78, 8);
//        listePersonnel.ajouter(a.getNumPers(), a);
//        listePersonnel.ajouter(b.getNumPers(), b);
//        listePersonnel.ajouter(c.getNumPers(), c);
//        listePersonnel.ajouter(d.getNumPers(), d);
//        listePersonnel.ajouter(e.getNumPers(), e);
//        //instanciation de la fenetre
        LaFenetre fenetrePrincipal = new LaFenetre(listePersonnel);
        fenetrePrincipal.setVisible(true);
//        int calcul=1000+Integer.valueOf(3);
//        String temp = "M"+Integer.toString(calcul);
//       // System.out.println(temp);
//        boolean test=listePersonnel.positionner(temp);
//        String toto="1";
//        
//        System.out.println(test + "          ." + listePersonnel.cleCourante());
//        test=listePersonnel.positionner(toto);
//         System.out.println(test + "          ." + listePersonnel.cleCourante());
//         toto=listePersonnel.cleCourante();
//         System.out.println(toto + "          ." + listePersonnel.cleCourante());
//         listePersonnel.dernier();
//         System.out.println(toto + "          ." + listePersonnel.cleCourante());
//        test= listePersonnel.positionner(toto);
//         System.out.println("toto : "+ toto + "          test"+test+"" + listePersonnel.cleCourante());
//         test= listePersonnel.positionner("M1002");
//         System.out.println( "test   "+test+"   " + listePersonnel.cleCourante()); 
//         int test1=toto.compareTo("M1001");
//         System.out.println(test1);
//         
//         
//        

//        String testCle;
//        
//        
//        listeEtudiant.premier();
//        testCle=(String)listeEtudiant.cleCourante();
//        System.out.println(testCle);
//        
//        
//        listeEtudiant.suivant();
//        testCle=(String)listeEtudiant.cleCourante();
//        System.out.println(testCle);
//        
//        
//        listeEtudiant.precedent();
//        testCle=(String)listeEtudiant.cleCourante();
//        System.out.println(testCle);
//        
//        
//        int nbElement;
//        nbElement=listeEtudiant.nbElements();
//        System.out.println(nbElement);
//        
//        
//        boolean test;
//        test=listeEtudiant.existe("002");    //NE MARCHE PAS 
//        System.out.println(test);
//        
//        
//        listeEtudiant.dernier();
//        testCle=(String)listeEtudiant.cleCourante();
//        System.out.println(testCle);
//        
//        
//        testCle=(String)listeEtudiant.cleMin();
//        System.out.println(testCle);
//        
//        
//        testCle=(String)listeEtudiant.cleMax();
//        System.out.println(testCle);
//        
//        
//        test=listeEtudiant.estVide();
//        System.out.println(test);
//        
//        
//        D=(Etudiant) listeEtudiant.obtenir("003");
//        testCle=D.toString();
//        System.out.println(testCle);
//        
//        
//        listeEtudiant.premier();
//        test=listeEtudiant.positionner("002");
//        System.out.println(test);
//        
//        
//        test=listeEtudiant.supprimer("002");
//        System.out.println(test);  // ne marche pas 
//        
//        test=listeEtudiant.existe("002");
//        System.out.println(test);
//        
//        listeEtudiant.sauvegarder("test.txt");
//        listeEtudiant.vider();
//       
//        test=listeEtudiant.existe("001");
//        System.out.println(test);
//        
//        listeEtudiant.charger("test.txt");
//        listeEtudiant.premier();
//        testCle=(String)listeEtudiant.cleCourante();
//        System.out.println(testCle);
//        
    }
}
