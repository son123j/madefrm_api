package madefrm;

import javax.swing.*;

public class madefrm {
    
    public static JFrame frm;
    
    public static void made_frm_name(String frm_name) {
    
    
    
    }
    
    public static void made_frm(String name, int x, int y) {
        
         frm = new JFrame(name);
        
        frm.setSize(x, y);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
