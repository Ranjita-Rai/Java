
package practice.practice2;

    import javax.swing.*;//package for swing component
import java.awt.*;//awt component
import java.awt.event.*;//to handle event
class UserForm extends JFrame{
 JLabel l1,l2,l3;
 JTextField t1,t2;
 JButton b1,b2,b3;
 public void setForm(){
 l1 = new JLabel("Enter First Number");
 l2 = new JLabel("Enter Second Number");
 t1 = new JTextField(20);
 t2 = new JTextField(20);
 b1 = new JButton("Sum");
 b2 = new JButton("Diff");
 b3 = new JButton("Multiply");
 l3 = new JLabel("Result");
 //adding swing controls to window
 add(l1);add(t1);
 add(l2);add(t2);
 add(b1);add(b2);add(b3);
 add(l3);
 //settting windows properties
 setVisible(true);//to show window
 setLayout(new FlowLayout());//layout
 setSize(400,400);//to set size of JFrame
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 //handling actionevent
 b1.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){
 int num1= Integer.parseInt(t1.getText());
 int num2= Integer.parseInt(t2.getText());
 int sum = num1+num2;
 l3.setText("sum is "+sum);
 }
 });
 //for b2
 b2.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){
 int num1= Integer.parseInt(t1.getText());
 int num2= Integer.parseInt(t2.getText());
 int diff = num1-num2;
 l3.setText("diff is "+diff);
 }
});
 //for b3->multiply
 b3.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){
 int num1= Integer.parseInt(t1.getText());
 int num2= Integer.parseInt(t2.getText());
 int mul = num1*num2;
 l3.setText("multiply is "+mul);
 }
 }
);
 }
}
public class SwingUserInputDemo {
 public static void main(String[] args) {
 UserForm uf = new UserForm();
 uf.setForm();
 }
}
