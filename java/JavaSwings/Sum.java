import javax.swing.*;
import java.awt.event.*;


public class Sum {
    
 public static void main(String[] args) {
   JFrame fr= new JFrame();
  JTextField tf1 = new JTextField();
  JTextField tf2 = new JTextField();
  JTextField tf3 = new JTextField();
  JLabel l1= new JLabel("NUM1");
  JLabel l2= new JLabel("NUM2");
  JLabel l3= new JLabel("Result");
  JButton b1= new JButton("Add");
  JButton b2 = new JButton("Subtract");

  l1.setBounds(30,50,100,50);
  l2.setBounds(30,100,100,50);
  l3.setBounds(30,150,100,50);



   tf1.setBounds(80,50,100,50);
   tf2.setBounds(80,100,100,50);
   tf3.setBounds(80,150,100,50);
   
  tf3.setEditable(false);

   b1.setBounds(50,250,100,50);
   b2.setBounds(200,250,100,50);

   fr.add(tf1);
   fr.add(tf2);
   fr.add(tf3);
   fr.add(b1);
   fr.add(b2);
   fr.add(l1);
   fr.add(l2);
   fr.add(l3);


   fr.setSize(500,500);
   fr.setLayout(null);
   fr.setVisible(true);


   b1.addActionListener(new ActionListener(){
  
    public void actionPerformed(ActionEvent e){
   
        
      String  s1= tf1.getText();
      String  s2= tf2.getText();
       
       int num1=Integer.parseInt(s1);
       int num2=Integer.parseInt(s2);
      int c =num1+num2;
      String res= Integer.toString(c) ;

      tf3.setText(res);
    }

 });
 b2.addActionListener(new ActionListener(){
  
    public void actionPerformed(ActionEvent e){
   
        
      String  s1= tf1.getText();
      String  s2= tf2.getText();
       
       int num1=Integer.parseInt(s1);
       int num2=Integer.parseInt(s2);
       int c =num1-num2;
       String res= Integer.toString(c) ;
      tf3.setText(res);
    }

 });

 }




}
