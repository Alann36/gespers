/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Damien
 */
public class Commercial extends Personnel {
    float pourcentage;
    float ventes;

    public Commercial(String nomPers, String numTel,float pourcentage, float ventes) {
        super(nomPers, numTel);
        this.pourcentage = pourcentage;
        this.ventes = ventes;
    }
    @Override
    public float calculPaie()
    {
        return ventes*pourcentage;
    }

    public float getPourcentage() {
        return pourcentage;
    }

    public float getVentes() {
        return ventes;
    }
    
}
