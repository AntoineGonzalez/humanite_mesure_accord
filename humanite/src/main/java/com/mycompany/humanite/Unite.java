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
public class Unite {
    private String categorie;
    private int start;
    private int end;
    private String idAnnotateur;
    public Unite(String c, int s, int e, String idU){
        this.categorie = c;
        this.start = s;
        this.end = e;
        this.idAnnotateur = idU;
    }

    /**
     * @return the categorie
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    /**
     * @return the start
     */
    public int getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * @return the end
     */
    public int getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(int end) {
        this.end = end;
    }

    /**
     * @return the idAnnotateur
     */
    public String getIdAnnotateur() {
        return idAnnotateur;
    }

    /**
     * @param idAnnotateur the idAnnotateur to set
     */
    public void setIdAnnotateur(String idAnnotateur) {
        this.idAnnotateur = idAnnotateur;
    }
    
    
}
