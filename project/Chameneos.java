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
public class Chameneos extends Thread {
    private final Piste piste;
    private final int id;
    private Couleur monCouleur, autreCouleur;
    
    public Chameneos (int id, Piste p){
        this.piste = p;
        this.id = id;
        Couleur couleur = new Couleur();
        this.monCouleur = couleur;
    }
    public Chameneos (int id, Piste p, Couleur c){
        this.piste = p;
        this.id = id;
        this.monCouleur = c;
    }
    
    
    
    private void Affiche(String Message){
        System.out.println("ID: " + id + " ,Couleur: " + monCouleur.toString() + " ,Message: " + Message);     
    }
    
    private void AllerAuMail(){
        Affiche("aller au 'mail'");
    }
    private void SubirMutation(){
        Affiche ("Je vais une mutation");
        autreCouleur = piste.Cooperer(id, monCouleur);
        monCouleur = monCouleur.CouleurComplementaire(autreCouleur);
        Affiche ("J'ai déjà fait une mutation");
    }
    private void Manger(){
        Affiche("manger");
    }
    
    @Override
    public void run(){
        while(true){
            Manger();
            AllerAuMail();
            SubirMutation();
        }
}
}
