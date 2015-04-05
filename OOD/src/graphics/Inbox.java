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
public abstract class Inbox extends JPanel {
	protected int mnum;
	protected JRadioButton[] messages;
	protected boolean[] read;
	protected JPanel select;
	protected  CardLayout cl;
	protected JButton show;
	
	
	public Inbox() {
		this.setLayout(new CardLayout());
		this.setSize(new Dimension(480, 400));
		
		select = new JPanel();
		this.add(select, "default");
		// Messages Make in child inbox
	    cl = (CardLayout)(this.getLayout());
	    cl.show(this, "default");
		
		// Making Select
		select.setLayout(null);
		
		JPanel panel = new JPanel();
		ButtonGroup bg = new ButtonGroup();
	   
	    JScrollPane pane = new JScrollPane(panel);
	    pane.setLocation(10, 10);
	    pane.setSize(320, 380);
	    panel.setLayout(new GridLayout(mnum, 1));
	    pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    
	    show = new JButton("\u0645\u0634\u0627\u0647\u062F\u0647 \u067E\u06CC\u0627\u0645");
	    show.setLocation(345, 360);
	    show.setSize(130, 30);
	    show.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int ind = 0;
	    		for(int i = 1; i < mnum; i++)
	    			if(messages[i].isSelected())
	    			{
	    				ind = i;
	    				break;
	    			}
	    		// TODO
	    		cl.show(Inbox.this, "#" + ind);
	    	}
	    });
	    
	    make_messages();
	    for (int i = 0; i < mnum; i++)
	    {
			bg.add(messages[i]);
			panel.add(messages[i]);
	    }
	    if(mnum > 0)
	    	messages[0].setSelected(true);
	    
	    select.add(pane);
	    select.add(show);
	}
	
	abstract protected void make_messages();

}
