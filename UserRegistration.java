
package practice.practice2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Registration extends JFrame{
    JLabel a1,a2,a3,a4,a5,a6,a7;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1,r2,r3;
    JCheckBox c1,c2,c3,c4;
    JComboBox cb1;
    JButton b1;
    public void setRegistration(){
        a1=new JLabel("Username");
        a2=new JLabel("Password");
        a3=new JLabel("RePassword");
        a4=new JLabel("Gender");
        a5=new JLabel("Subject");
        a6=new JLabel("Country");
        a7=new JLabel("Result");
        t1=new JTextField(20);
        p1=new JPasswordField(20);
        p2=new JPasswordField(20);
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        r3=new JRadioButton("Other");
        c1=new JCheckBox("C");
        c2=new JCheckBox("Python");
        c3=new JCheckBox("Java");
        c4=new JCheckBox("C++");
        //for radio button
        ButtonGroup bg =new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        
        //for combobox
        String[]country={"Nepal","India","USA","Other"};
        cb1=new JComboBox(country);
        b1=new JButton("Submit");
        setLayout(null);
        
        a1.setBounds(10,10,100,15);
        t1.setBounds(90,10,200,20);
        a2.setBounds(10,30,100,15);
        p1.setBounds(90,30,200,20);
        a3.setBounds(10,50,100,15);
        p2.setBounds(90,50,200,20);
        a4.setBounds(10,70,100,15);
        r1.setBounds(90,70,100,15);
        r2.setBounds(190,70,100,15);
        r3.setBounds(300,70,100,15);
        a5.setBounds(10,90,100,15);
        c1.setBounds(90,90,100,15);
        c2.setBounds(190,90,100,15);
        c3.setBounds(300,90,100,15);
        c4.setBounds(410,90,100,15);
        a6.setBounds(10,110,100,15);
        cb1.setBounds(90,110,100,20);
        b1.setBounds(10,130,100,15);
        a7.setBounds(10,150,900,15);

        add(a1);add(t1);
        add(a2);add(p1);
        add(a3);add(p2);
        add(a4);add(r1);add(r2);add(r3);
        add(a5);add(c1);add(c2);add(c3);add(c4);
        add(a6);add(cb1);
        add(b1);add(a7);
        setVisible(true);
        
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                String uname=t1.getText();
                String pass=p1.getText();
                String repass=p1.getText();
                String gender="";
                if(r1.isSelected()){
                    gender=r1.getText();
                }else if(r2.isSelected()){
                    gender=r2.getText();
                }else{
                    gender=r3.getText();
                }
                String course="";
                if(c1.isSelected()){
                    course+=c1.getText()+"";
                }
                if(c2.isSelected()){
                    course+=c2.getText()+"";
                }
                if(c3.isSelected()){
                    course+=c3.getText()+"";
                }
                if(c4.isSelected()){
                    course+=c4.getText()+"";
                }
                String country =(String)cb1.getSelectedItem();
                
                
               a7.setText("Username is "+uname+" Password is " + pass +" Confirm Password is "+repass+" Gender is "+gender+" Course is "+course+" Country is "+country);


            }
            
        });
    }
}

public class UserRegistration {
    public static void main(String[] args){
        Registration R=new Registration();
        R.setRegistration();
    }
    
}
