
import javax.swing.JOptionPane;
public class SortIntegers {
	public static void main(String[] args){
		int n1, n2, n3, temp;
		String x1 = JOptionPane.showInputDialog(null, "Enter the first integer:");
		n1 = Integer.parseInt(x1);
		String x2 = JOptionPane.showInputDialog(null, "Enter the second integer:");
		n2 = Integer.parseInt(x2);
		String x3 = JOptionPane.showInputDialog(null, "Enter the third integer:");
		n3 = Integer.parseInt(x3);
		if(n1 < n2){
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if(n1 < n3){
			temp = n1;
			n1 = n3;
			n3 = temp;
		}
		if(n2 < n3){
			temp = n2;
			n2 = n3;
			n3 = temp;
		}
		JOptionPane.showMessageDialog(null, "The numbers you entered were " + n1 + ", " + n2 + ", and " + n3);
		
	}

}
