/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Damien
 */
public class Employe extends Personnel{
    float tauxHoraire;
    float nbHeures;

    public Employe(String nomPers, String numTel,float tauxHoraire, float nbHeures) {
        super(nomPers,numTel);
        this.tauxHoraire = tauxHoraire;
        this.nbHeures = nbHeures;
    }

    public float getTauxHoraire() {
        return tauxHoraire;
    }

    public float getNbHeures() {
        return nbHeures;
    }
    @Override
    public float calculPaie()
    {
        return nbHeures*tauxHoraire;
    }
}
