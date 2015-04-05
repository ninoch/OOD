package graphics;

import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class AdminAllDoctors extends Users {
	
	public AdminAllDoctors() {

	}
	
	@Override
	protected void make_users() {
		uNum = 10;
		users = new JRadioButton[uNum];
		for(int i = 0; i < uNum; i++)
		{
	    	users[i] = new JRadioButton("Doctor #" + ( i + 1));
			this.add(new DoctorProfile(), "#" + i);
		}
	}

}
