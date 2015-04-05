package graphics;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class PatientMessage extends JPanel {

	public PatientMessage() {
		this.setLayout(null);
		this.setSize(new Dimension(480, 400));
		
		JLabel label = new JLabel("\u0641\u0631\u0633\u062A\u0646\u062F\u0647:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(396, 11, 74, 14);
		add(label);
		
		JLabel doctorName = new JLabel("Your Doctor Name Here");
		doctorName.setHorizontalAlignment(SwingConstants.RIGHT);
		doctorName.setBounds(182, 11, 238, 14);
		add(doctorName);
		
		JTextArea message = new JTextArea();
		message.setFont(new Font("Tahoma", Font.PLAIN, 12));
		message.setText("\u067E\u06CC\u063A\u0627\u0645 \u062F\u06A9\u062A\u0631 \u0634\u0645\u0627 \u062F\u0631 \u0627\u06CC\u0646\u062C\u0627 \u0646\u0645\u0627\u06CC\u0634 \u062F\u0627\u062F\u0647 \u0645\u06CC\u0634\u0648\u062F.\r\n\r\n\u0627\u06CC\u0646 \u0642\u0633\u0645\u062A \u0642\u0627\u0628\u0644 \u0648\u06CC\u0631\u0627\u06CC\u0634 \u0646\u06CC\u0633\u062A!");
		message.setEditable(false);
		message.setBounds(10, 67, 460, 288);
		add(message);
		
		JButton back = new JButton("\u0628\u0627\u0632\u06AF\u0634\u062A");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		back.setBounds(10, 366, 74, 23);
		add(back);
		
		JLabel label_1 = new JLabel("\u0639\u0646\u0648\u0627\u0646:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(424, 36, 46, 14);
		add(label_1);
		
		JLabel lblMessageTitleHere = new JLabel("Message Title Here");
		lblMessageTitleHere.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMessageTitleHere.setBounds(182, 36, 238, 14);
		add(lblMessageTitleHere);

	}
}
