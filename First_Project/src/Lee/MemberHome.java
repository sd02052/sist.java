package Lee;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MemberHome {

	private JFrame frame;
	private static JLabel lb1;
	private static int ChangeCount = 2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// 광고 이미지 타이머 메서드
		Timer tmr = new Timer();
		TimerTask tTask = new TimerTask() {

			@Override
			public void run() {
				mChangeImage(ChangeCount);

				ChangeCount++;

				if (ChangeCount == 6)
					ChangeCount = 1;
			}
		};

		tmr.schedule(tTask, 3000, 3000);
		//

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberHome window = new MemberHome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// 광고 이미지 메서드
	private static void mChangeImage(int Value) {
		ImageIcon Path = null;

		if (Value == 1) {
			Path = new ImageIcon("C:\\Users\\sist\\git\\sist.java\\First_Project\\Image\\banner1.jpg");
		} else if (Value == 2) {
			Path = new ImageIcon("C:\\Users\\sist\\git\\sist.java\\First_Project\\Image\\banner2.jpg");
		} else if (Value == 3) {
			Path = new ImageIcon("C:\\Users\\sist\\git\\sist.java\\First_Project\\Image\\banner3.jpg");
		} else if (Value == 4) {
			Path = new ImageIcon("C:\\Users\\sist\\git\\sist.java\\First_Project\\Image\\banner4.jpg");
		} else if (Value == 5) {
			Path = new ImageIcon("C:\\Users\\sist\\git\\sist.java\\First_Project\\Image\\banner5.jpg");
		}

		Image img1 = Path.getImage();
		Image changeImg1 = img1.getScaledInstance(300, 400, Image.SCALE_SMOOTH);
		ImageIcon changeIcon1 = new ImageIcon(changeImg1);

		lb1.setIcon(changeIcon1);
	}
	//

	/**
	 * Create the application.
	 */
	public MemberHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// 메인홈 버튼
		JButton mainMemberHomeBtn = new JButton("홈");
		mainMemberHomeBtn.setBounds(30, 30, 122, 35);
		frame.getContentPane().add(mainMemberHomeBtn);

		// 주문 버튼
		JButton orderBtn = new JButton("주문");
		orderBtn.setBounds(164, 30, 122, 35);
		frame.getContentPane().add(orderBtn);

		// 홈 버튼
		JButton MemberHomeBtn = new JButton("홈");
		MemberHomeBtn.setBounds(765, 30, 90, 35);
		frame.getContentPane().add(MemberHomeBtn);

		// 로그아웃버튼
		JButton logoutBtn = new JButton("로그아웃");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberLogin();
				frame.dispose();
			}
		});
		logoutBtn.setBounds(867, 30, 90, 35);
		frame.getContentPane().add(logoutBtn);

		// 메인 TextArea
		JTextArea mainText = new JTextArea();
		mainText.setFont(new Font("Monospaced", Font.BOLD, 18));
		String nickname = "";
		int mileage = 0;
		mainText.setText("\n\n" + nickname + "님 환영합니다.\n" + "\n현재 마일리지는 " + mileage + "p 입니다.");
		mainText.setBounds(30, 147, 454, 201);
		frame.getContentPane().add(mainText);

		// 광고 이미지
		ImageIcon banner1 = new ImageIcon("C:\\Users\\sist\\git\\sist.java\\First_Project\\Image//banner1.jpg");
		lb1 = new JLabel(banner1);
		lb1.setBounds(631, 112, 300, 400);
		frame.getContentPane().add(lb1);

		// 정보수정 버튼
		JButton infoChangeBtn = new JButton("정보수정");
		infoChangeBtn.setBounds(30, 438, 196, 42);
		frame.getContentPane().add(infoChangeBtn);

		// 정보수정 버튼 이벤트
		infoChangeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InfoChangePopup infoChange = new InfoChangePopup();
				infoChange.setLocationRelativeTo(null);
				infoChange.setVisible(true);
			}
		});

		// 회원탈퇴 버튼
		JButton deleteBtn = new JButton("회원탈퇴");
		deleteBtn.setBounds(288, 438, 196, 42);
		frame.getContentPane().add(deleteBtn);

		// 회원탈퇴 버튼 이벤트
		deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // ★★★★★★★★★★
				int result = JOptionPane.showConfirmDialog(null, "정말 탈퇴하시겠습니까?", "탈퇴", JOptionPane.YES_NO_OPTION);
			}
		});

		frame.setVisible(true);
	}

}