package calc;

public class simplecalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
veiwercqlc veiw=new veiwercqlc();
model modl=new model();
calccontroller controller=new calccontroller(modl,veiw);
veiw.setVisible(true);



}

}
