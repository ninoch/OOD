package graphics;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

@SuppressWarnings("serial")
public abstract class Users extends JPanel {

	protected int uNum;
	protected JRadioButton[] users;
	protected DefaultListModel<JRadioButton> model;
	
	public Users() {
		this.setLayout(new CardLayout());
		this.setSize(new Dimension(480, 400));
		
		JPanel select = new JPanel();
		select.setLayout(null);
		select.setSize(new Dimension(480, 400));
		
		this.add(select, "default");
		
		make_users();

        CardLayout cl = (CardLayout)(this.getLayout());
        cl.show(this, "default");
        
		// Make Select
		JPanel panel = new JPanel();
		ButtonGroup bg = new ButtonGroup();
	    
	    for (int i = 0; i < uNum; i++)
	    {
			bg.add(users[i]);
			panel.add(users[i]);
	    }
	    if(uNum > 0)
	    	users[0].setSelected(true);
	    
	    JScrollPane pane = new JScrollPane(panel);
	    pane.setSize(360, 380);
	    pane.setLocation(10, 10);
	    panel.setLayout(new GridLayout(uNum, 1));
	    pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    
	    JButton show = new JButton("\u0645\u0634\u0627\u0647\u062F\u0647");
	    show.setSize(90, 30);
	    show.setLocation(380, 360);
	    show.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int ind = 0;
	    		for(int i = 1; i < uNum; i++)
	    			if(users[i].isSelected())
	    			{
	    				ind = i;
	    				break;
	    			}
	    		// TODO
	    		cl.show(Users.this, "#" + ind);
	    	}
	    });
	    select.add(pane);
	    select.add(show);
	}

	protected abstract void make_users();

}
