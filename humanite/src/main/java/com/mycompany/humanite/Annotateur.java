/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.humanite;

/**
 *
 * @author 33616
 */
public class Annotateur {
    private String name;
    private EnsembleUnite unites;

    public Annotateur(String n){
        this.name = n;
        this.unites = new EnsembleUnite(this);
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the unites
     */
    public EnsembleUnite getUnites() {
        return unites;
    }

    /**
     * @param unites the unites to set
     */
    public void setUnites(EnsembleUnite unites) {
        this.unites = unites;
    }
    
    @Override
    public String toString(){
        String s = "";
        for(Unite u : this.getUnites().getUnites()){
            s += u.getCategorie() + "[" + u.getStart() + ";" + u.getEnd() +"]" + "\n";
        }
        return this.getName() + " : "+ "\n" + s + "\n" ;  
    }
    
    public Annotateur shuffle(int lentext){
        Annotateur a = new Annotateur(this.name);
        a.setUnites(this.getUnites().shuffle(lentext));
        return a;
    }
}
