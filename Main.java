/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mouhamadkhalil.accov;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mouhamad
 */
public class Main {
 
    
    static Couleur [] c = {
        new Couleur(Couleur.ListeCouleur.Bleu),
        new Couleur(Couleur.ListeCouleur.Jaune),
        new Couleur(Couleur.ListeCouleur.Rouge),
        new Couleur(Couleur.ListeCouleur.Jaune),
        new Couleur(Couleur.ListeCouleur.Bleu),
        new Couleur(Couleur.ListeCouleur.Rouge)
    };
        /**
     * @param args 
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException{

        int chameneosNb = c.length; 
        if(chameneosNb > 0)
            {
                Chameneos[] fileChameneos = new Chameneos[chameneosNb];
                Piste piste = new Piste();
                for (int i = 0; i < chameneosNb; i++){
                    fileChameneos[i]= new Chameneos(i, piste);
                }
                for (int i = 0; i < chameneosNb; i++){
                    fileChameneos[i].start();
                }
            }

}
    
    
}
