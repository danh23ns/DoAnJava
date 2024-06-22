
package menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class menu implements ActionListener{
    static JFrame f = new JFrame();
    
    menu(){
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0,0,0));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        f.add(p1);
    }
    
    public static void main(String[] args){
        new menu();
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
