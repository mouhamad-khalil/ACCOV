/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mouhamadkhalil.accov;

import java.util.Random;

/**
 *
 * @author mouhamad
 */
public class Couleur{
    public int couleurInterne;
    
    public enum ListeCouleur
    {
        Rouge,Bleu,Jaune;
    };
    
    public Couleur(ListeCouleur nomCouleur)
    {
        switch(nomCouleur)
        {
            case Rouge:
                couleurInterne = 0;
                break;
            case Bleu:
                couleurInterne = 1;
                break;
            case Jaune:
                couleurInterne = 2;
                break;
        }
    }
    
    public Couleur(){
        couleurInterne = ChoisirCouleur() ;
    }
    
    private Couleur(int couleur){
       couleurInterne = couleur ;
    }
    
    public Couleur CouleurComplementaire(Couleur C){
        if (couleurInterne == C.couleurInterne)
            return new Couleur(couleurInterne);
        else
            return new Couleur(3 - couleurInterne - C.couleurInterne);
    }
    
    public int ChoisirCouleur()
    {
        return new Random().nextInt(2) ;
    }
    
    @Override
    public String toString (){
        switch (couleurInterne) {
            case 0:
                return "Rouge";
            case 1:
                return "Bleu";
            case 2:
                return "Jaune";
        }
        return "Rouge";
    }
}

