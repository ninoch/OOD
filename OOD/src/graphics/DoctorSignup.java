package graphics;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;

@SuppressWarnings("serial")
public class DoctorSignup extends JPanel {
	private JTextField DQ;
	private JTextField DA;
	private JPasswordField pass;
	private JPasswordField pass2;

	public DoctorSignup() {
		this.setLayout(null);
		this.setSize(new Dimension(480, 400));

		JTextField name;
		JLabel label_1;
		JTextField familyName;
		JLabel label_2;
		JTextField id;
		JLabel label_3;
		JTextField tell;
		
		name = new JTextField();
		name.setBounds(323, 29, 147, 20);
		this.add(name);
		name.setColumns(10);
		
		JLabel label = new JLabel("\u0646\u0627\u0645:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(371, 11, 99, 20);
		this.add(label);
		
		label_1 = new JLabel("\u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(371, 60, 99, 20);
		this.add(label_1);
		
		familyName = new JTextField();
		familyName.setColumns(10);
		familyName.setBounds(323, 79, 147, 20);
		this.add(familyName);
		
		label_2 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u0646\u0638\u0627\u0645 \u067E\u0632\u0634\u06A9\u06CC:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(371, 110, 99, 20);
		this.add(label_2);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(323, 128, 147, 20);
		this.add(id);
		
		label_3 = new JLabel("\u062A\u0644\u0641\u0646 \u062A\u0645\u0627\u0633 \u0645\u0637\u0628:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(96, 179, 99, 20);
		this.add(label_3);
		
		tell = new JTextField();
		tell.setColumns(10);
		tell.setBounds(48, 198, 147, 20);
		this.add(tell);
		
		JButton add = new JButton("\u062B\u0628\u062A");
		add.setBounds(10, 332, 89, 23);
		this.add(add);
		
		JButton back = new JButton("\u0628\u0627\u0632\u06AF\u0634\u062A");
		back.setBounds(10, 366, 89, 23);
		this.add(back);
		
		JTextArea address = new JTextArea();
		address.setBounds(215, 202, 255, 52);
		this.add(address);
		
		JLabel label_4 = new JLabel("\u0622\u062F\u0631\u0633 \u0645\u0637\u0628:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(371, 179, 99, 20);
		this.add(label_4);
		
		JLabel label_5 = new JLabel("\u0633\u0648\u0627\u0644 \u0627\u0645\u0646\u06CC\u062A\u06CC:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(371, 265, 99, 20);
		add(label_5);
		
		DQ = new JTextField();
		DQ.setColumns(10);
		DQ.setBounds(215, 283, 255, 20);
		add(DQ);
		
		JLabel label_6 = new JLabel("\u067E\u0627\u0633\u062E \u0627\u0645\u0646\u06CC\u062A\u06CC:");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(371, 317, 99, 20);
		add(label_6);
		
		DA = new JTextField();
		DA.setColumns(10);
		DA.setBounds(215, 335, 255, 20);
		add(DA);
		
		JLabel label_7 = new JLabel("\u06A9\u0644\u0645\u0647 \u0639\u0628\u0648\u0631:");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(96, 11, 99, 20);
		add(label_7);
		
		JLabel label_8 = new JLabel("\u062A\u06A9\u0631\u0627\u0631 \u06A9\u0644\u0645\u0647 \u0639\u0628\u0648\u0631:");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(96, 60, 99, 20);
		add(label_8);
		
		pass = new JPasswordField();
		pass.setBounds(48, 29, 147, 20);
		add(pass);
		
		pass2 = new JPasswordField();
		pass2.setBounds(48, 79, 147, 20);
		add(pass2);
		
		JLabel warning = new JLabel("\u062E\u0637\u0627 \u062F\u0631 \u062B\u0628\u062A \u0646\u0627\u0645!");
		warning.setForeground(Color.RED);
		warning.setBounds(109, 370, 138, 14);
		warning.setVisible(false);
		add(warning);
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// DO SOMTHING HERE TODO
				warning.setVisible(false);
				if(name.getText().equals("warning"))
					warning.setVisible(true);
				else
					DoctorSignup.this.setVisible(false);
				
			}
		});
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DoctorSignup.this.setVisible(false);
				// TODO
			}
		});
	}

}
