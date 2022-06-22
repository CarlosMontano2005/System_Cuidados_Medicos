/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import sun.java2d.pipe.RenderingEngine;
/**
 *
 * @author pc
 */
public class BorderTextField extends JTextField{
    private Color backgroundColor = Color.DARK_GRAY;
    
    public BorderTextField(){
//        setBackground(new Color(255, 255, 255, 0));
//        setOpaque(false);
//        setBorder(new EmptyBorder(10, 10, 10, 50));
//        setFont(new java.awt.Font("sansserif", 0, 14));
//        setSelectionColor(new Color(80, 199, 255));
//        setHorizontalAlignment(CENTER);
        setBackground(new Color(227, 245, 255));
        setOpaque(false);
        setBorder(new EmptyBorder(10, 10, 10, 50));
        setFont(new java.awt.Font("sansserif", 0, 14));
        setSelectionColor(new Color(80, 199, 255));
        setHorizontalAlignment(CENTER);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, width, height, height, height);
        super.paintComponent(grphcs); 
    }
}
