package studentmanager.modules;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import studentmanager.dao.AccountDao;
import studentmanager.dao.UserDao;
import studentmanager.pojo.User;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JProgressBar;


public class Login extends JFrame{

	private JPanel panelLogin;
	private JTextField textFieldUserName;
	private JPasswordField passwordField;
	private JLabel errorLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		panelLogin = new JPanel();
		panelLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelLogin);
		
		JLabel lblNewLabel = new JLabel("UserName");
		
		textFieldUserName = new JTextField();
		textFieldUserName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PassWord");
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonLoginTapped();
			}
		});
		
		passwordField = new JPasswordField();
		
		errorLabel = new JLabel("Invalid UserName or PassWord");
		errorLabel.setForeground(Color.RED);
		GroupLayout gl_panelLogin = new GroupLayout(panelLogin);
		gl_panelLogin.setHorizontalGroup(
			gl_panelLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panelLogin.createParallelGroup(Alignment.LEADING)
						.addComponent(errorLabel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldUserName, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel)
						.addGroup(gl_panelLogin.createSequentialGroup()
							.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(20))
		);
		gl_panelLogin.setVerticalGroup(
			gl_panelLogin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLogin.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel)
					.addGap(10)
					.addComponent(textFieldUserName, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(lblNewLabel_1)
					.addGap(10)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(errorLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		panelLogin.setLayout(gl_panelLogin);
		errorLabel.setVisible(false);
	}
	
	private void buttonLoginTapped() {
		String userName = textFieldUserName.getText();
		String passWord = String.valueOf(passwordField.getPassword());
		AccountDao dao = new AccountDao();
		User user = dao.getUserByUserName(userName);
		if (user != null) {
			dao.saveUserToLocal(user);
			//show main menu
			GiaoVu studentView = new GiaoVu();
			this.setVisible(false);
			studentView.setVisible(true);
		}else {
			errorLabel.setVisible(true);
			errorLabel.setText("Invalid UserName or Password");
		}
	}
}
