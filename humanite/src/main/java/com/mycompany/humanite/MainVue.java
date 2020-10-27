/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.humanite;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

/**
 *
 * @author 33616
 */
public class MainVue extends JFrame{
    public MainVue(TexteAnnote t){
      setTitle("Visualisation window");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setPreferredSize(new Dimension(500, 500));
      setLocation(100, 100);
      VueTexteAnnote v = new VueTexteAnnote(t);
      this.add(v);
      pack();
      setVisible(true);
   }
    
}
