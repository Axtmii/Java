import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class SimpleMax extends Frame implements ActionListener
{
 TextField t1,t2,t3,result;
 Button btn;
 SimpleMax()
 {
  setLayout(new FlowLayout());
  Label l1=new Label("Enter 1st number:");
  t1=new TextField(10);
  add(l1);
  add(t1);
  Label l2=new Label("Enter 2nd number:");
  t2=new TextField(10);
  add(l2);
  add(t2);
  Label l3=new Label("Enter 3rd number:");
  t3=new TextField(10);
  add(l3);
  add(t3);
  btn=new Button("Find max");
  add(btn);
  result=new TextField(20);
  result.setEditable(false);
  add(result);
  btn.addActionListener(this);
  setTitle("Max of 3 numbers");
  setSize(250,200);
  setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  int num1=Integer.parseInt(t1.getText());
  int num2=Integer.parseInt(t2.getText());
  int num3=Integer.parseInt(t3.getText());
  int max=Math.max(num1,Math.max(num2,num3));
  result.setText("Maximum:" +max);
 }
 public static void main(String args[])
 {
  SimpleMax app=new SimpleMax();
 }
}
