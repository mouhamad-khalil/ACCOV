/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mouhamadkhalil.accov;

/**
 *
 * @author mouhamad
 */
public class Piste {
    private Couleur couleur1, couleur2;
    private boolean premierAppel= true;
    private boolean attendre ;
    
    public synchronized Couleur Cooperer(int id, Couleur couleur){
        Couleur resultat ;
            while (attendre){
                // il faut attendre
                try{
                    wait ();
                }
                catch( InterruptedException e) {}
            }
            if ( premierAppel ){
                // le premier chameneos
                couleur1 = couleur;
                premierAppel = false ;
                while ( ! premierAppel ){
                    try{
                        // il faut attendre le deuxieme chameneos
                        wait ();}
                    catch( InterruptedException e){}
                }
                attendre = false ;
                resultat = couleur2;
                notifyAll (); 
            }
            else{
                // c'est le 2eme chameneos
                couleur2 = couleur;
                resultat = couleur1;
                premierAppel = true;
                attendre = true;
                notifyAll ();
            }
            return resultat;
    }
}
