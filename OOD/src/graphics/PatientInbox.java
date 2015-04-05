package graphics;

import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class PatientInbox extends Inbox {
	
	public PatientInbox() {
	}

	@Override
	protected void make_messages()
	{
		mnum = 30;
		messages = new JRadioButton[mnum];
		
		read = new boolean[mnum];
		// TODO making read array
		for(int i = 0; i < mnum; i++)
			read[i] = (i < 5);
		// TODO making message title
		for(int i = 0; i < mnum; i++)
		{
			messages[i] = new JRadioButton("message from doctor # " + ( i  + 1));
			this.add(new PatientMessage(), "#" + i);
		}
	}

}
