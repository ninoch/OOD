package graphics;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ChangePass extends JPanel {
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	
	public ChangePass() {
		this.setLayout(null);
		
		JLabel label = new JLabel("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631 \u0641\u0639\u0644\u06CC:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(318, 21, 122, 14);
		add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(299, 46, 141, 20);
		add(passwordField);
		
		JLabel label_1 = new JLabel("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631 \u062C\u062F\u06CC\u062F:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(318, 77, 122, 14);
		add(label_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(299, 102, 141, 20);
		add(passwordField_1);
		
		JLabel label_2 = new JLabel("\u062A\u06A9\u0631\u0627\u0631 \u0631\u0645\u0632 \u0639\u0628\u0648\u0631 \u062C\u062F\u06CC\u062F:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(318, 133, 122, 14);
		add(label_2);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(299, 158, 141, 20);
		add(passwordField_2);
		
		JButton button = new JButton("\u062B\u0628\u062A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
				
			}
		});
		button.setBounds(10, 266, 89, 23);
		add(button);

	}
}
