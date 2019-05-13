package com.company;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
public class HTMLEncodedStatement {
    public static void tester(String statement){
        try {
            JFrame frame = new JFrame();
            JTextPane pane = new JTextPane();
            ;
            JButton button = new JButton("Button");

            pane.setContentType("text/html");
            pane.setText("<html><body><h3>"+statement+"</h3></body></html>"); //Your whole html here..

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pane.setPreferredSize(new Dimension(500, 500));
            frame.getContentPane().add(pane, BorderLayout.CENTER);
            frame.setVisible(true);
        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}
