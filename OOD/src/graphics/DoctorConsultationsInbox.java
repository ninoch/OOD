package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class DoctorConsultationsInbox extends Inbox {

	public DoctorConsultationsInbox() {
		
		JButton profile = new JButton("\u0645\u0634\u0627\u0647\u062F\u0647 \u067E\u0631\u0648\u0641\u0627\u06CC\u0644");
	    profile.setLocation(345, 280);
	    profile.setSize(130, 30);
	    profile.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int ind = 0;
	    		for(int i = 1; i < mnum; i++)
	    			if(messages[i].isSelected())
	    			{
	    				ind = i;
	    				break;
	    			}
	    		// TODO
	    		cl.show(DoctorConsultationsInbox.this, "#" + ind);
	    	}
	    });
	    select.add(profile);
	    
	    JButton remove = new JButton("حذف بیمار");
	    remove.setLocation(345, 320);
	    remove.setSize(130, 30);
	    remove.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// TODO remove patient from list
	    	}
	    });
	    select.add(remove);
	    
	    JButton add = new JButton("پذیرش");
	    add.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// TODO add patient to doctor
	    		
	    	}
	    });
	    

	}

	@Override
	protected void make_messages() {
		
		show.setText("پذیرش");
	    show.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// TODO add patient to doctor
	    	}
	    });
	    
		mnum = 20;
		messages = new JRadioButton[mnum];
		
		read = new boolean[mnum];
		// TODO making read array
		for(int i = 0; i < mnum; i++)
			read[i] = (i < 5);
		// TODO making message title
		for(int i = 0; i < mnum; i++)
		{
			messages[i] = new JRadioButton("patient # " + ( i  + 1));
			this.add(new PatientProfile(), "#" + i);
		}
	}

}
