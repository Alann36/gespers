
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Damien
 */
public class Etudiant implements Serializable{
    private String numEtudiant;
    private String nomEtudiant;
    private int ageEtudiant;

    public Etudiant() {
        
    }

    public Etudiant(String numEtudiant, String nomEtudiant, int ageEtudiant) {
        this.numEtudiant = numEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.ageEtudiant = ageEtudiant;
    }

    public String getNumEtudiant() {
        return numEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public int getAgeEtudiant() {
        return ageEtudiant;
    }

    public void setNumEtudiant(String numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public void setAgeEtudiant(int ageEtudiant) {
        this.ageEtudiant = ageEtudiant;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "numEtudiant=" + numEtudiant + ", nomEtudiant=" + nomEtudiant + ", ageEtudiant=" + ageEtudiant + '}';
    }
    
    
}
