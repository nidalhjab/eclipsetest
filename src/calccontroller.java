package calc;
import java.awt.event.*;
import javax.swing.*;
public class calccontroller {
	private model md;
	private veiwercqlc vw;
	public calccontroller(model md,veiwercqlc vw) {
		this.vw=vw;
		this.md=md;
		this.vw.addlistener(new addlistener());
		
	}
	class addlistener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			int firstnum,secondnum;
			
			String oper;
			try {
				firstnum=vw.getnum();
				secondnum=vw.getnum3();
				oper=vw.getnum2();
				if(oper.equalsIgnoreCase("+")) {
					md.add(firstnum, secondnum);
					vw.setresult(md.getresult());
				}
				else 	if(oper.equalsIgnoreCase("-")) {
					md.sub(firstnum, secondnum);
					vw.setresult(md.getresult());
				}
				else 	if(oper.equalsIgnoreCase("*")) {
					md.mul(firstnum, secondnum);
					vw.setresult(md.getresult());
				}
				else 	if(oper.equalsIgnoreCase("/")) {
					md.div(firstnum, secondnum);
					vw.setresult(md.getresult());
				}
				else 	if(oper.equalsIgnoreCase("%")) {
					md.mod(firstnum, secondnum);
					vw.setresult(md.getresult());
				}
				else 	if(oper.equalsIgnoreCase("sqrt")) {
					md.sqrt(firstnum);
					vw.setresult(md.getresult());
				}
				else 
					JOptionPane.showMessageDialog(null, 
                            "wrong input", 
                            "WARNING!!", 
                            JOptionPane.WARNING_MESSAGE);
			}
			catch(NumberFormatException exp) {
				System.out.println("wrong input");
				
			}
		}
	}

}
