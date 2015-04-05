package graphics;

import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class AdminAllPharmacies extends Users {
	

	public AdminAllPharmacies() {

	}
	
	@Override
	protected void make_users() {
		uNum = 10;
		users = new JRadioButton[uNum];
		for(int i = 0; i < uNum; i++)
		{
	    	users[i] = new JRadioButton("Pharmacy #" + ( i + 1));
			this.add(new PharmacyProfile(), "#" + i);
		}
	}
}
