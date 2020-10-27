/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.humanite;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author 33616
 */
public class TexteAnnote {
    private HashMap<String, Color> colorMap;
    private HashMap<String, Annotateur> m;
    private ArrayList<Annotateur> annotateurs;
    private int lenText;
    
    public TexteAnnote(int l){
        this.colorMap = new HashMap<String, Color>();
        this.m = new HashMap<String, Annotateur>();
        this.annotateurs = new ArrayList<Annotateur>();
        this.lenText = l;
        this.colorMap.put("TD", new Color((float) 0,(float) 0.8,(float)0, (float)0.3));
        this.colorMap.put("TH", new Color((float) 0.8,(float) 0.5,(float)0, (float)0.3));
        this.colorMap.put("SD", new Color((float) 0.2,(float) 0,(float)1, (float)0.3));
        this.colorMap.put("SH", new Color((float) 1,(float) 0,(float)0.9, (float)0.3));
    }
    
    public TexteAnnote shuffle(){
        TexteAnnote clone = new TexteAnnote(this.getLenText());
        clone.setColorMap(this.getColorMap());
        ArrayList<Annotateur> annotateurs = new ArrayList<Annotateur>();
        HashMap m = new HashMap<String, Annotateur>();
        for (Map.Entry mapentry : this.getM().entrySet()) {
            Annotateur a = (Annotateur) mapentry.getValue();
            Annotateur annotateurClone = a.shuffle(this.lenText);
            m.put((String) mapentry.getKey(), annotateurClone);
            annotateurs.add(annotateurClone);
        }
        clone.setAnnotateurs(annotateurs);
        clone.setM(m);
       
        return clone;
    }
    
    public void addAnnotation(Unite u){
        Annotateur a = getM().get(u.getIdAnnotateur()); 
        if(a == null){
            a = new Annotateur(u.getIdAnnotateur());    
            this.getM().put(u.getIdAnnotateur(), a);
            this.getAnnotateurs().add(a);
        }
        a.getUnites().addUnit(u);
        
    }

    public String toString(){
        String s = "";
        for(Annotateur a : this.getAnnotateurs()){
            s += a;
        }
        return s;
    } 

    /**
     * @return the m
     */
    public HashMap<String, Annotateur> getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(HashMap<String, Annotateur> m) {
        this.m = m;
    }

    /**
     * @return the annotateurs
     */
    public ArrayList<Annotateur> getAnnotateurs() {
        return annotateurs;
    }

    /**
     * @param annotateurs the annotateurs to set
     */
    public void setAnnotateurs(ArrayList<Annotateur> annotateurs) {
        this.annotateurs = annotateurs;
    }
    
     /**
     * @return the lenText
     */
    public int getLenText() {
        return lenText;
    }

    /**
     * @param lenText the lenText to set
     */
    public void setLenText(int lenText) {
        this.lenText = lenText;
    }

    /**
     * @return the colorMap
     */
    public HashMap<String, Color> getColorMap() {
        return colorMap;
    }

    /**
     * @param colorMap the colorMap to set
     */
    public void setColorMap(HashMap<String, Color> colorMap) {
        this.colorMap = colorMap;
    }
}
