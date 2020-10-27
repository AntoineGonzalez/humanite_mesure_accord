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
public class Main {
    public static void main(String[] args){
        Unite u1 = new Unite("TD", 1, 10, "antoine");
        Unite u2 = new Unite("TH", 12, 20, "antoine");
        Unite u3 = new Unite("SH", 15, 40, "antoine");
        Unite v1 = new Unite("TH", 1, 10, "kevin");
        Unite v2 = new Unite("TD", 16, 20, "kevin");
        Unite v3 = new Unite("SD", 40, 45, "kevin");
        
        TexteAnnote t = new TexteAnnote(50);
        t.addAnnotation(u1);
        t.addAnnotation(u2);
        t.addAnnotation(u3);
        t.addAnnotation(v1);
        t.addAnnotation(v2);
        t.addAnnotation(v3);
        TexteAnnote tshuffle3 = t.shuffle();
        TexteAnnote tshuffle2 = t.shuffle();
        TexteAnnote tshuffle = t.shuffle();
        MainVue vue1  = new MainVue(t);
        MainVue vue2  = new MainVue(tshuffle);
        MainVue vue3  = new MainVue(tshuffle2);
        MainVue vue4  = new MainVue(tshuffle3);
       
    }
}
