/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.humanite;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author 33616
 */
public class VueTexteAnnote extends JPanel{
    public final static int DIM = 100;
    public final static int OFFSET = 10;
    
    private TexteAnnote t;
    
    public VueTexteAnnote(TexteAnnote t){
        this.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        this.t = t;
    }
    
    @Override
    public void paintComponent(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        int i = 1;
        for(Annotateur a : t.getAnnotateurs()){
            String id = a.getName();
            g.drawLine(OFFSET,DIM*i, this.getWidth()- OFFSET, DIM*i);
            g.drawString(id,OFFSET, DIM*i-10);
            
            
            for(Unite u : a.getUnites().getUnites()){
                g.setColor(this.t.getColorMap().get(u.getCategorie()));
                int ll = this.getWidth()-2*OFFSET;
                double sl = (double) u.getStart()* (double) ll / (double)this.t.getLenText();
                double el = (double) u.getEnd()* (double) ll / (double)this.t.getLenText();
                g2d.fillRect(OFFSET + (int)sl, DIM*i-4, (int)el - (int)sl, 8 );
                g2d.setColor(Color.black);
            }
            
            
            i += 1;
        }
    }
}
