/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.humanite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/**
 *
 * @author 33616
 */
public class EnsembleUnite {
    private Annotateur annotateur;
    private ArrayList<Unite> unites;
    
    public EnsembleUnite(Annotateur a){
        this.annotateur = a;
        this.unites = new ArrayList<Unite>();
    }
    
    public EnsembleUnite(EnsembleUnite ens){
        this.annotateur = ens.getAnnotateur();
        this.unites = new ArrayList<Unite>();
        for(Unite u : ens.getUnites()){
            Unite cloneUnite = new Unite(u.getCategorie(), u.getStart(), u.getEnd(), u.getIdAnnotateur());
            this.unites.add(cloneUnite);
        }
    }
    
    public void addUnit(Unite u){
        this.unites.add(u);
    }
    
    public void removeUnit(Unite u){
        this.unites.remove(u);
    }

    /**
     * @return the annotateur
     */
    public Annotateur getAnnotateur() {
        return annotateur;
    }

    /**
     * @param annotateur the annotateur to set
     */
    public void setAnnotateur(Annotateur annotateur) {
        this.annotateur = annotateur;
    }

    /**
     * @return the unites
     */
    public ArrayList<Unite> getUnites() {
        return unites;
    }

    /**
     * @param unites the unites to set
     */
    public void setUnites(ArrayList<Unite> unites) {
        this.unites = unites;
    }
    
    public EnsembleUnite shuffle(int textlength){
        EnsembleUnite clone = new EnsembleUnite(this);
        Random random = new Random();
        int cutPos = random.nextInt(textlength);
        
        System.out.println(cutPos);
        Iterator it = clone.getUnites().iterator();
        while(it.hasNext()){
            Unite u = (Unite) it.next();
            if(u.getStart() <= cutPos && u.getEnd() >= cutPos){
                it.remove();
            }else{
                if(u.getStart() < cutPos){
                    u.setStart(u.getStart()+(textlength - cutPos));
                    u.setEnd(u.getEnd()+(textlength - cutPos));
                }else{
                    u.setStart(u.getStart()-cutPos);
                    u.setEnd(u.getEnd()-cutPos);
                }
            }    
        }
        return clone;
    }
}
