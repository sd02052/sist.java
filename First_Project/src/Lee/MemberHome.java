package Lee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

import DTO.MemberDAO;

public class MemberHome {

	private JFrame frame;
	private static JLabel imageLbl; // 광고이미지 Label
	private static int ChangeCount = 2; // 광고이미지 카운트 변수
	private JLabel mainLbl; // 환영합니다 Label
	private JLabel nicknameLbl; // 고객님! Label
	private JLabel mainLbl2; // 사용가능 포인트 Label
	private JLabel pointLbl; // p(포인트) Label
	private JLabel lblNewLabel;

	// 광고 이미지 변환 메서드
	private static void mChangeImage(int Value) {
		ImageIcon Path = null;

		if (Value == 1) {
			Path = new ImageIcon("Image\\banner1.png");
		} else if (Value == 2) {
			Path = new ImageIcon("Image\\banner2.png");
		} else if (Value == 3) {
			Path = new ImageIcon("Image\\banner3.png");
		} else if (Value == 4) {
			Path = new ImageIcon("Image\\banner4.jpg");
		} else if (Value == 5) {
			Path = new ImageIcon("Image\\banner5.jpg");
		}

		Image img1 = Path.getImage();
		Image changeImg1 = img1.getScaledInstance(360, 360, Image.SCALE_SMOOTH);
		ImageIcon changeIcon1 = new ImageIcon(changeImg1);

		imageLbl.setIcon(changeIcon1);
	}

	public MemberHome() {

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

		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(15, 159, 78));
		frame.setLocationRelativeTo(null);

		// 메인 text
		// 환영합니다 text
		mainLbl = new JLabel("환영합니다");
		mainLbl.setHorizontalAlignment(SwingConstants.CENTER);
		mainLbl.setForeground(Color.WHITE);
		mainLbl.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		mainLbl.setBounds(121, 92, 223, 28);
		frame.getContentPane().add(mainLbl);

		// 로그인한 손님 이름출력
		lblNewLabel = new JLabel(MemberLogin.member.getName());
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel.setBackground(new Color(0, 98, 60));
		lblNewLabel.setBounds(117, 136, 114, 28);
		frame.getContentPane().add(lblNewLabel);

		// 고객님! text
		nicknameLbl = new JLabel("고객님!");
		nicknameLbl.setForeground(Color.WHITE);
		nicknameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		nicknameLbl.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		nicknameLbl.setBounds(221, 130, 114, 28);
		frame.getContentPane().add(nicknameLbl);

		// 사용가능 포인트 text
		mainLbl2 = new JLabel("사용 가능 포인트");
		mainLbl2.setHorizontalAlignment(SwingConstants.CENTER);
		mainLbl2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		mainLbl2.setForeground(Color.WHITE);
		mainLbl2.setBounds(121, 188, 223, 33);
		frame.getContentPane().add(mainLbl2);

		// p(포인트) text
		int mileage = 0; // 마일리지 변수선언
		pointLbl = new JLabel(MemberLogin.member.getMileage() + "p");
		pointLbl.setHorizontalAlignment(SwingConstants.CENTER);
		pointLbl.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		pointLbl.setForeground(Color.WHITE);
		pointLbl.setBounds(121, 220, 223, 22);
		frame.getContentPane().add(pointLbl);

		// 광고 이미지
		ImageIcon banner1 = new ImageIcon("Image\\banner1.png");
		imageLbl = new JLabel(banner1);
		imageLbl.setBounds(523, 92, 360, 360);
		frame.getContentPane().add(imageLbl);

		// 정보수정 버튼
		JButton infoChangeBtn = new JButton("정보수정");
		infoChangeBtn.setForeground(new Color(255, 255, 255));
		infoChangeBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		infoChangeBtn.setBounds(121, 289, 223, 38);
		frame.getContentPane().add(infoChangeBtn);
		infoChangeBtn.setBackground(new Color(0, 98, 60));
		infoChangeBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 회원탈퇴 버튼
		JButton deleteBtn = new JButton("회원탈퇴");
		deleteBtn.setForeground(new Color(255, 255, 255));
		deleteBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		deleteBtn.setBounds(121, 352, 223, 38);
		frame.getContentPane().add(deleteBtn);
		deleteBtn.setBackground(new Color(0, 98, 60));
		deleteBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 로그아웃버튼
		JButton logoutBtn = new JButton("로그아웃");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					new MemberLogin();
					frame.dispose();
				}
			}
		});
		logoutBtn.setForeground(new Color(255, 255, 255));
		logoutBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		logoutBtn.setBounds(121, 416, 223, 38);
		frame.getContentPane().add(logoutBtn);
		logoutBtn.setBackground(new Color(0, 98, 60));
		logoutBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 주문 버튼
		JButton orderBtn = new JButton("주문");
		orderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_win();
				frame.dispose();

			}
		});
		orderBtn.setForeground(new Color(255, 255, 255));
		orderBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		orderBtn.setBounds(640, 470, 130, 38);
		frame.getContentPane().add(orderBtn);
		orderBtn.setBackground(new Color(0, 98, 60));
		orderBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));

		// 이벤트
		// 정보수정 버튼 이벤트
		infoChangeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new InfoChangePopup();

			}
		});

		// 회원탈퇴 버튼 이벤트
		deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(null, "정말 탈퇴하시겠습니까?", "탈퇴", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					delete();
					frame.dispose();
					new MemberLogin();
					MemberLogin.member = null;
				}
			}
		});

		frame.setVisible(true);
	}

	// 회원탈퇴 메서드
	private void delete() {

		try {
			String sql = "delete from member where mem_no = ?";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			Main.db.pstmt.setInt(1, MemberLogin.member.getNo()); // ★

			int result = Main.db.pstmt.executeUpdate();

			if (result > 0) {
				JOptionPane.showMessageDialog(null, "회원 탈퇴 되었습니다.");
			} else {
				JOptionPane.showMessageDialog(null, "회원 탈퇴에 실패하였습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
