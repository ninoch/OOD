package graphics;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PatientSelectDoctor extends JPanel {
	private JTextField name;
	private JTextField dId;
	private JRadioButton[] doctors;
	int dnum = 3;

	public PatientSelectDoctor() {
		this.setLayout(null);
		this.setSize(new Dimension(480, 400));
		
		JLabel label = new JLabel("\u0646\u0627\u0645 \u067E\u0632\u0634\u06A9:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(406, 11, 64, 14);
		add(label);
		
		name = new JTextField();
		name.setBounds(264, 8, 151, 20);
		add(name);
		name.setColumns(10);
		
		JLabel label_1 = new JLabel("\u067E\u0631\u0648\u0627\u0646\u0647 \u0646\u0638\u0627\u0645 \u067E\u0632\u0634\u06A9\u06CC:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(162, 11, 97, 14);
		add(label_1);
		
		dId = new JTextField();
		dId.setColumns(10);
		dId.setBounds(10, 8, 151, 20);
		add(dId);
		

		JPanel panel = new JPanel();
		ButtonGroup bg = new ButtonGroup();

		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(150, 77, 320, 312);
		scrollPane.setVisible(false);
		this.add(scrollPane);
		
		JButton send = new JButton("\u0627\u0631\u0633\u0627\u0644 \u062F\u0631\u062E\u0648\u0627\u0633\u062A");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		send.setBounds(10, 366, 109, 23);
		send.setVisible(false);
		add(send);
		
		JButton search = new JButton("\u062C\u0633\u062A\u062C\u0648");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doctors = new JRadioButton[dnum];
				scrollPane.setVisible(false);
				send.setVisible(false);
			    panel.setLayout(new GridLayout(dnum, 1));
			    for (int i = 0; i < dnum; i++)
			    {
			    	doctors[i] = new JRadioButton("doctor #" + ( i + 1 ));
					bg.add(doctors[i]);
					panel.add(doctors[i]);
			    }		
				scrollPane.setVisible(true);
				send.setVisible(true);
			}
		});
		search.setBounds(10, 39, 89, 23);
		add(search);
		

	}
}
