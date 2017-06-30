/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shyboy;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ShyBoy extends Applet implements ActionListener {

    public ShyBoy() {

    }

//    public void initComponents(){
//       
//setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//setTitle("Test Window");
//setAlwaysOnTop(true);
//javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//getContentPane().setLayout(layout);
//
//layout.setHorizontalGroup(
//layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//.addGap(0, 251, Short.MAX_VALUE)
//);
//layout.setVerticalGroup(
//layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//.addGap(0, 189, Short.MAX_VALUE)
//        
//
////
//);
//}
    TextField text1,text2,text3,text4,text5;
    Button button1;
    Button l1, l2, l3, l4, l5, l6;
    Label Title;
    Panel NavigationLayout, Body;
    
    public void init() {
        // TODO code application logic here
        setLayout(new GridLayout(1,2));
        
        l1 = new Button("Dashboard");
        l2 = new Button("Contact");
        l3 = new Button("Item");
        l4 = new Button("Sale");
        l5 = new Button("Purchase");
        l6 = new Button("GeneralExpense");
        
        NavigationLayout = new Panel();
        NavigationLayout.setLayout(new GridLayout(6,1));
        NavigationLayout.add(l1);
        NavigationLayout.add(l2);
        NavigationLayout.add(l3);
        NavigationLayout.add(l4);
        NavigationLayout.add(l5);
        NavigationLayout.add(l6);
        
        
        Body = new Panel();
        Title = new Label("Dashboard");
        Body.add(Title);
        
        add(NavigationLayout);
        add(Body);

       
    }

    public void actionPerformed(ActionEvent event) {
        String msg = "Hello";

        if (event.getSource() == button1) {
            text1.setText(msg);
        }
    }

}
