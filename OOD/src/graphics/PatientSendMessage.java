package graphics;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PatientSendMessage extends JPanel {
	private JTextField title;
	int dnum = 3;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PatientSendMessage() {
		this.setLayout(null);
		this.setSize(new Dimension(480, 400));
		String[] doctorsList = new String[] {"\u067E\u0632\u0634\u06A9 \u0639\u0645\u0648\u0645\u06CC", "\u067E\u0632\u0634\u06A9 \u0645\u062A\u062E\u0635\u0635 1", "\u067E\u0632\u0634\u06A9 \u0645\u062A\u062E\u0635\u0635 2"};
		
		JComboBox to = new JComboBox();
		to.setBounds(169, 11, 211, 20);
		this.add(to);
		
		for(int i = 0; i < dnum; i++)
			to.addItem(doctorsList[i]);
		
		JLabel lblNewLabel = new JLabel("\u0627\u0646\u062A\u062E\u0627\u0628 \u067E\u0632\u0634\u06A9:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(390, 14, 80, 14);
		add(lblNewLabel);
		
		title = new JTextField();
		title.setBounds(169, 42, 211, 20);
		add(title);
		title.setColumns(10);
		
		JLabel label = new JLabel("\u0639\u0646\u0648\u0627\u0646 \u067E\u06CC\u0627\u0645:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(390, 39, 80, 14);
		add(label);
		
		JLabel label_1 = new JLabel("\u0645\u062A\u0646 \u067E\u06CC\u0627\u0645:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(390, 77, 80, 14);
		add(label_1);
		
		JTextArea message = new JTextArea();
		message.setBounds(10, 102, 460, 215);
		add(message);
		
		JButton back = new JButton("\u0628\u0627\u0632\u06AF\u0634\u062A");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		back.setBounds(10, 366, 89, 23);
		add(back);
		
		JButton send = new JButton("\u0627\u0631\u0633\u0627\u0644");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// int ind = to.getSelectedIndex();
				// System.err.println(to.getSelectedItem() + " is selected");
				// TODO
			}
		});
		send.setBounds(10, 328, 89, 23);
		add(send);
	}
}
