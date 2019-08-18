/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jtextarea;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author kaal
 */
public class frame extends JFrame{
    JTextArea text=new JTextArea();
    public frame(){
        
       
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
       add(text);
     
     }
}
