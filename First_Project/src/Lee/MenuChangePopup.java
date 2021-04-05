package Lee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MenuChangePopup extends JDialog {

	private final JPanel Panel = new JPanel();
	private JTextField menuText;
	private JTextField priceText;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			MenuChangePopup dialog = new MenuChangePopup();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public MenuChangePopup() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel, BorderLayout.CENTER);
		Panel.setLayout(null);
		Panel.setBackground(new Color(15, 159, 78));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		// 컴포넌트
		// 수정 메뉴 레이블 /텍스트필드
		JLabel menuLabel = new JLabel("수정 메뉴 : ");
		menuLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		menuLabel.setForeground(Color.WHITE);
		menuLabel.setBounds(114, 79, 67, 15);
		Panel.add(menuLabel);

		menuText = new JTextField();
		menuText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		menuText.setBounds(210, 76, 118, 21);
		Panel.add(menuText);
		menuText.setColumns(10);

		// 수정 가격 레이블/텍스트필드
		JLabel priceLabel = new JLabel("수정 가격 : ");
		priceLabel.setForeground(Color.WHITE);
		priceLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		priceLabel.setBounds(114, 113, 75, 15);
		Panel.add(priceLabel);

		priceText = new JTextField();
		priceText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		priceText.setBounds(210, 110, 118, 21);
		Panel.add(priceText);
		priceText.setColumns(10);

		// 확인 버튼
		JButton confirmButton = new JButton("확   인");
		confirmButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		confirmButton.setForeground(Color.WHITE);
		confirmButton.setBounds(114, 180, 97, 23);
		confirmButton.setBackground(new Color(0, 98, 60));
		confirmButton.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		Panel.add(confirmButton);

		// 취소 버튼
		JButton cancelButton = new JButton("취   소");
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		cancelButton.setBounds(230, 180, 97, 23);
		cancelButton.setBackground(new Color(0, 98, 60));
		cancelButton.setBorder(BorderFactory.createLineBorder(Color.decode("#00623C")));
		Panel.add(cancelButton);

		// 이벤트
		// 확인 버튼 이벤트
		confirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		// 취소 버튼 이벤트
		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});

	}

}
