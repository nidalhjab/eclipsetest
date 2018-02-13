package calc;
import java.awt.event.ActionListener;
import javax.swing.*;
public class veiwercqlc extends JFrame {
 private JTextField text1= new JTextField(10);
 private JTextField text2= new JTextField(10);
 private JTextField text3= new JTextField(10);
 private JButton butt= new JButton("calculate");
private JTextField area= new JTextField(10);
 veiwercqlc(){
	 JPanel panel= new JPanel();
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setSize(600,300);
	 area.setEditable(false);
	 area.setHorizontalAlignment(area.CENTER);
	 panel.add(text1);
	 panel.add(text2);
	 panel.add(text3);
	 panel.add(butt);
	 panel.add(area);
	 this.add(panel);
	 
 }
 
 public int getnum(){
	 
	 return Integer.parseInt(text1.getText());
 }
 public int getnum3(){
	 
	 return Integer.parseInt(text3.getText());
 }
 public String getnum2(){
	 
	 return (text2.getText());
 }
 public int getnum4(){
	 
	 return Integer.parseInt(area.getText());
 }
 public void setresult(int res) {
	 area.setText(Integer.toString( res));
	 
 }

 
 void addlistener(ActionListener e) {
	 butt.addActionListener(e);
 }
 
  
 
 
 
 
 
 

}
