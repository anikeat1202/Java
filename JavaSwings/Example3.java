import javax.swing.*;
import java.awt.event.*;

public class Example3 {
    
public static void main(String []args){
  JFrame fr = new JFrame();
  ImageIcon icon= new ImageIcon("E:\\fb.png");
    JLabel j1= new JLabel(icon);

    
   j1.setBounds(50,100,200,300);  

   fr.add(j1);
    fr.setSize(300,300);

   fr.setLayout(null);
   fr.setVisible(true);

}

}
