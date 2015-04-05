package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Doctor extends Base {

	public Doctor() {
		setTitle("\u0645\u062F\u06CC\u0631\u06CC\u062A \u0628\u06CC\u0645\u0627\u0631");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pic = new BackGroundImage("C:\\Users\\Ninochika\\workspace\\3\\OOD\\img\\doctor.jpg");
		JPanel dp = new DoctorProfile();
		JPanel pinb = new DoctorInbox();
		JPanel coninb = new DoctorConsultationsInbox();
		JPanel dsearch = new DoctorsPatientSearch();
		JPanel allP = new DoctorsSearchResault(30);
		JPanel topat = new DoctorToPatient();
		JPanel sendp = new DoctorToDoctor(); 
		JPanel addi = new Illness();
		JPanel addh = new Health();
		JPanel addp = new Prescription();
		
		content.add(pic, "default");
		content.add(dp, "profile");
		content.add(pinb, "patientsInbox");
		content.add(coninb, "consultationsInbox");
		content.add(dsearch, "psearch");
		content.add(allP, "showall");
		content.add(topat, "messageToPatient");
		content.add(sendp, "sendPatient");
		content.add(addi, "illness");
		content.add(addh, "health");
		content.add(addp, "prescription");
		
		// Making Patient menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 490, 30);
		menu.add(menuBar);
		
		JMenu menu = new JMenu("\u0628\u06CC\u0645\u0627\u0631\u0627\u0646");
		menuBar.add(menu);
		
		JMenuItem search = new JMenuItem("\u062C\u0633\u062A\u062C\u0648");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "psearch");
			}
		});
		menu.add(search);
		
		JMenuItem showAll = new JMenuItem("\u062A\u0645\u0627\u0645 \u0628\u06CC\u0645\u0627\u0631\u0627\u0646");
		showAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "showall");
			}
		});
		menu.add(showAll);
		
		JMenu add = new JMenu("\u062B\u0628\u062A");
		menuBar.add(add);
		
		JMenuItem health = new JMenuItem("\u062B\u0628\u062A \u0648\u0636\u0639\u06CC\u062A \u0628\u062F\u0646\u06CC \u0648 \u0622\u0632\u0645\u0627\u06CC\u0634");
		health.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "health");
			}
		});
		add.add(health);
		
		JMenuItem illness = new JMenuItem("\u062B\u0628\u062A \u0628\u06CC\u0645\u0627\u0631\u06CC");
		illness.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "illness");
			}
		});
		add.add(illness);
		
		JMenuItem prescription = new JMenuItem("\u062B\u0628\u062A \u0646\u0633\u062E\u0647");
		prescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "prescription");
			}
		});
		add.add(prescription);
		
		JMenu manage = new JMenu("\u0645\u062F\u06CC\u0631\u06CC\u062A");
		menuBar.add(manage);
		
		JMenuItem profile = new JMenuItem("\u067E\u0631\u0648\u0641\u0627\u06CC\u0644");
		profile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "profile");
			}
		});
		manage.add(profile);
		
		JMenuItem logout = new JMenuItem("\u062E\u0631\u0648\u062C");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doctor.this.dispose();
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JMenu inbox = new JMenu("\u0635\u0646\u062F\u0648\u0642");
		manage.add(inbox);
		
		JMenuItem consultationMessages = new JMenuItem("\u062F\u0631\u062E\u0648\u0627\u0633\u062A \u067E\u0630\u06CC\u0631\u0634");
		consultationMessages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "consultationsInbox");
			}
		});
		inbox.add(consultationMessages);
		
		JMenuItem patientsMessage = new JMenuItem("\u062F\u0631\u062E\u0648\u0627\u0633\u062A \u0645\u0634\u0627\u0648\u0631\u0647");
		patientsMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "patientsInbox");
			}
		});
		inbox.add(patientsMessage);
		
		JMenu menu_1 = new JMenu("\u0627\u0631\u0633\u0627\u0644");
		manage.add(menu_1);
		
		JMenuItem sendPatient = new JMenuItem("\u0627\u0631\u062C\u0627\u0639 \u0628\u06CC\u0645\u0627\u0631 \u0628\u0647 \u067E\u0632\u0634\u06A9");
		sendPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "sendPatient");
			}
		});
		menu_1.add(sendPatient);
		manage.add(logout);
	}

}
