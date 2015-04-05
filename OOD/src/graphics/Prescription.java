package graphics;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Prescription extends JPanel {
	private JTable table;
	private JTextField drugName;
	private JTextField dose;
	private JTextField date;
	private JTextField pIp;

	public Prescription() {
		this.setSize(new Dimension(480, 400));
		this.setLayout(null);
		
		DefaultTableModel model = new DefaultTableModel(); 
		table = new JTable(model); 
		// Create a couple of columns 
		model.addColumn("Dose"); 
		model.addColumn("Drug Name"); 
         
        table.setRowHeight( 32 );

	    JScrollPane pane = new JScrollPane(table);
	    pane.setSize(460, 200);
	    pane.setLocation(10, 10);
	    pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    pane.setMinimumSize(new Dimension(460, 200));
	    pane.setMaximumSize(new Dimension(460, 200));
	    pane.setPreferredSize(new Dimension(460, 200));
	    this.add( pane );
	    
		drugName = new JTextField();
		drugName.setBounds(304, 250, 166, 20);
		add(drugName);
		drugName.setColumns(10);
		
		JLabel label = new JLabel("نام دارو:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(424, 229, 46, 14);
		add(label);
		
		JLabel label_1 = new JLabel("دوز:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(250, 229, 44, 14);
		add(label_1);
		
		dose = new JTextField();
		dose.setColumns(10);
		dose.setBounds(128, 250, 166, 20);
		add(dose);
		
		JButton add = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addRow(new Object[]{dose.getText(), drugName.getText()});
			}
		});
		add.setBounds(29, 249, 89, 23);
		add(add);
		
		JLabel label_2 = new JLabel("\u062A\u0627\u0631\u06CC\u062E:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(424, 337, 46, 14);
		add(label_2);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(304, 358, 166, 20);
		add(date);
		
		JLabel label_3 = new JLabel("\u0641\u0631\u0645\u062A \u062F\u0631\u0633\u062A \u0648\u0631\u0648\u062F\u06CC: 1394/01/13");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(128, 361, 166, 14);
		add(label_3);
		
		JButton addAll = new JButton("\u062B\u0628\u062A");
		addAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		addAll.setBounds(29, 355, 89, 23);
		add(addAll);
		
		JLabel ds = new JLabel("شماره بیمه بیمار:");
		ds.setHorizontalAlignment(SwingConstants.RIGHT);
		ds.setBounds(314, 285, 156, 14);
		add(ds);
		
		pIp = new JTextField();
		pIp.setColumns(10);
		pIp.setBounds(304, 306, 166, 20);
		add(pIp);
	}

}
