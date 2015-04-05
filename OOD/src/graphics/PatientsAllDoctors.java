package graphics;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

@SuppressWarnings("serial")
public class PatientsAllDoctors extends JPanel {

	int dnum = 3;
	JRadioButton[] doctors;
	
	public PatientsAllDoctors() {
		this.setLayout(new CardLayout());
		this.setSize(new Dimension(480, 400));

		
		JPanel select = new JPanel();
		this.add(select, "default");

		
		 doctors = new JRadioButton[dnum];
		 // TODO making message title
		 for(int i = 0; i < dnum; i++)
		 {
			 doctors[i] = new JRadioButton("doctor # " + (i  + 1));
			 // this.add(new DoctorProfile(), "#" + i);
		 }
	     CardLayout cl = (CardLayout)(this.getLayout());
	     cl.show(this, "default");
		
		// Making Select
		select.setLayout(null);
		
		JPanel panel = new JPanel();
		ButtonGroup bg = new ButtonGroup();
	    
	    for (int i = 0; i < dnum; i++)
	    {
			bg.add(doctors[i]);
			panel.add(doctors[i]);
	    }
	    if(dnum > 0)
	    	doctors[0].setSelected(true);
	    
	    JScrollPane pane = new JScrollPane(panel);
	    pane.setLocation(10, 10);
	    pane.setSize(320, 380);
	    panel.setLayout(new GridLayout(dnum, 1));
	    pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    
	    JButton show = new JButton("\u0645\u0634\u0627\u0647\u062F\u0647 \u067E\u0631\u0648\u0641\u0627\u06CC\u0644");
	    show.setLocation(354, 360);
	    show.setSize(116, 30);
	    show.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int ind = 0;
	    		for(int i = 1; i < dnum; i++)
	    			if(doctors[i].isSelected())
	    			{
	    				ind = i;
	    				break;
	    			}
	    		// TODO
	    		cl.show(PatientsAllDoctors.this, "#" + ind);
	    	}
	    });
	    select.add(pane);
	    select.add(show);
	}

}
