package graphics;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Admin extends Base {
	
	public Admin() {
		setTitle("\u0645\u062F\u06CC\u0631\u06CC\u062A");
		
		// Adding contents
		JPanel AP = new AdminProfile();
		JPanel Phars = new AdminAllPharmacies();
		JPanel pic = new BackGroundImage("C:\\Users\\Ninochika\\workspace\\3\\OOD\\img\\admin.jpg");
		JPanel docs = new AdminAllDoctors();
		JPanel patis = new AdminAllPatients();
		
		content.add(pic, "default");
		content.add(AP, "profile");
		content.add(Phars, "phars");
		content.add(docs, "docs");
		content.add(patis, "patis");
		
		// Making Admin Menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 490, 30);
		menu.add(menuBar);
		
		JMenu users = new JMenu("\u06A9\u0627\u0631\u0628\u0631\u0627\u0646");
		menuBar.add(users);
		
		JMenuItem drugs = new JMenuItem("\u062F\u0627\u0631\u0648\u062E\u0627\u0646\u0647 \u0647\u0627");
		drugs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cl.show(content, "phars");
			}
		});
		users.add(drugs);
		
		JMenuItem patients = new JMenuItem("\u0628\u06CC\u0645\u0627\u0631\u0627\u0646");
		patients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "patis");
			}
		});
		users.add(patients);
		
		JMenuItem doctors = new JMenuItem("\u067E\u0632\u0634\u06A9\u0627\u0646");
		doctors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(content, "docs");
			}
		});
		users.add(doctors);
		
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
				Admin.this.dispose();
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		manage.add(logout);
		
	}

}
