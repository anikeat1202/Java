import javax.swing.*;
import java.awt.event.*;

public class Example1 {
    
public static void main(String[] args) {
    JFrame fr = new JFrame();


    JButton btntext = new JButton();
    JTextField tf= new JTextField();

     tf.setBounds(50,50,200,50);
     fr.add(tf);  

    btntext.setText("Click");
    btntext.setBounds(50,100,95,30);
    btntext.setEnabled(true);
    btntext.addActionListener(new ActionListener(){
  
       public void actionPerformed(ActionEvent e){
   
    tf.setText("Welcome");
       }

    });
    
    fr.add(btntext);
    fr.setSize(400,500);
    fr.setLayout(null);
    fr.setVisible(true);
    
    
        
}
    
}
