package Lee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MenuAddPopup extends JDialog {

	private final JPanel Panel = new JPanel();
	private JTextField menuText;
	private JTextField priceText;

	public MenuAddPopup() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel, BorderLayout.CENTER);
		Panel.setLayout(null);
		Panel.setBackground(new Color(15, 159, 78));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		// 컴포넌트
		// 추가 메뉴 레이블 /텍스트필드
		JLabel menuLabel = new JLabel("추가 메뉴 : ");
		menuLabel.setForeground(Color.WHITE);
		menuLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		menuLabel.setBounds(114, 79, 67, 15);
		Panel.add(menuLabel);

		menuText = new JTextField();
		menuText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		menuText.setBounds(210, 76, 118, 21);
		Panel.add(menuText);
		menuText.setColumns(10);

		// 수정 가격 레이블/텍스트필드
		JLabel priceLabel = new JLabel("추가 가격 : ");
		priceLabel.setForeground(Color.WHITE);
		priceLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		priceLabel.setBounds(114, 113, 67, 15);
		Panel.add(priceLabel);

		priceText = new JTextField();
		priceText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		priceText.setBounds(210, 110, 118, 21);
		Panel.add(priceText);
		priceText.setColumns(10);

		// 확인 버튼
		JButton confirmButton = new JButton("확   인");
		confirmButton.setForeground(Color.WHITE);
		confirmButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		confirmButton.setBounds(114, 180, 97, 23);
		confirmButton.setBackground(new Color(0, 98, 60));
		confirmButton.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		Panel.add(confirmButton);

		// 취소 버튼
		JButton cancelButton = new JButton("취   소");
		cancelButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setBounds(230, 180, 97, 23);
		cancelButton.setBackground(new Color(0, 98, 60));
		cancelButton.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		Panel.add(cancelButton);

		// 이벤트
		// 확인 버튼 이벤트
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add();
				MenuChange.model.setRowCount(0);
				select();
				dispose();
			}
		});

		// 취소 버튼 이벤트
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		setVisible(true);
	}

	// 테이블에 메뉴리스트 보여주는 메서드
	public void select() {

		try {
			String sql = "select * from menu";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			Main.db.rs = Main.db.pstmt.executeQuery();

			while (Main.db.rs.next()) {
				String menuName = Main.db.rs.getString("menu_name");
				int menuPrice = Main.db.rs.getInt("menu_price");

				Object[] data = { menuName, menuPrice };

				MenuChange.model.addRow(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 메뉴추가 메서드
	private void add() {

		try {
			String sql = "insert into menu values(?, ?)";

			Main.db.pstmt = Main.db.con.prepareStatement(sql);

			String menuName = menuText.getText();
			int menuPrice = Integer.parseInt(priceText.getText());

			Main.db.pstmt.setString(1, menuName);
			Main.db.pstmt.setInt(2, menuPrice);

			int result = Main.db.pstmt.executeUpdate();

			if (result > 0) {
				JOptionPane.showMessageDialog(null, "메뉴를 추가하였습니다.");
			} else {
				JOptionPane.showConfirmDialog(null, "메뉴 추가에 실패하였습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
