
import java.io.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *S
 * @author Damien
 */
abstract class Personnel implements Serializable {
    String numPers;
    String nomPers;
    String numTel;
    static int dernierNum = 1;

    public Personnel(String nomPers, String numTel) {
        this.numPers= "M"+String.valueOf(getDernierNum() +1000);
        this.nomPers = nomPers;
        this.numTel = numTel;
        dernierNum++;
    }

    public Personnel() {
    }

    public static int getDernierNum() {
        return dernierNum;
    }

    public String getNumPers() {
        return numPers;
    }

    public String getNomPers() {
        return nomPers;
    }

    public String getNumTel() {
        return numTel;
    }

    abstract float calculPaie();

  
    
}
