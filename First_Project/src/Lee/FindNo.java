package Lee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FindNo extends JFrame {

	private JFrame frame;
	private JTextField tfEnter;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FindNo window = new FindNo();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
//	public FindNo() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public FindNo(int x, int y) {
		frame = new JFrame();
		frame.setBounds(x, y, 300, 200);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lbTitle = new JLabel("회원번호를 입력하세요.");
		panel.add(lbTitle);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);

		tfEnter = new JTextField();
		panel_1.add(tfEnter);
		tfEnter.setColumns(10);

		JButton btnFind = new JButton("찾기");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String target = tfEnter.getText();

			}
		});
		panel_1.add(btnFind);

		JButton btnClose = new JButton("닫기");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		panel_1.add(btnClose);

		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(6, 2, 0, 0));

		JLabel lbNo = new JLabel("회원번호 : ");
		lbNo.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbNo);

		JLabel lbNo1 = new JLabel("New label");
		lbNo1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbNo1);

		JLabel lbName = new JLabel("이름 : ");
		lbName.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbName);

		JLabel lbName1 = new JLabel("New label");
		lbName1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbName1);

		JLabel lbId = new JLabel("아이디 : ");
		lbId.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbId);

		JLabel lbId1 = new JLabel("New label");
		lbId1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbId1);

		JLabel lbNickname = new JLabel("닉네임 : ");
		lbNickname.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbNickname);

		JLabel lbNickname1 = new JLabel("New label");
		lbNickname1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbNickname1);

		JLabel lbPass = new JLabel("비밀번호 : ");
		lbPass.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lbPass);

		JLabel lbPass1 = new JLabel("New label");
		lbPass1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lbPass1);

		frame.setVisible(true);
	}

}
