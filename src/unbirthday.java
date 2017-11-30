import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		
		String birthday=JOptionPane.showInputDialog("When's your birthday");
		if(birthday.equals("11/29")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}	
		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
		}
	}
}
