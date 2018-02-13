package calc;
import java.math.*;
public class model {
	private int result;
	public void add(int first,int second) {
		result = first+second;
	}
	public void sub(int first,int second) {
		result = first-second;
	}
	public void mul(int first,int second) {
		result = first*second;
	}
	public void div(int first,int second) {
		result = first/second;
	}
	public void mod(int first,int second) {
		result = first%second;
	}
	public void sqrt(int first) {
	double a=	Math.sqrt(first);
	}
	
	public int getresult () {
		return result;
	}

}
