package Lee;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MenuChangePopup extends JDialog {

	private final JPanel Panel = new JPanel();
	private JTextField name;
	private JTextField textField_1;
	private JTextField menuText;
	private JTextField priceText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MenuChangePopup dialog = new MenuChangePopup();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MenuChangePopup() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel, BorderLayout.CENTER);
		Panel.setLayout(null);
		
		
		// 1. 컴포넌트 추가
		// 1-1. 수정 메뉴 레이블 /텍스트필드
		JLabel menuLabel = new JLabel("수정 메뉴 : ");
		menuLabel.setBounds(114, 79, 67, 15);
		Panel.add(menuLabel);
		
		menuText = new JTextField();
		menuText.setBounds(210, 76, 118, 21);
		Panel.add(menuText);
		menuText.setColumns(10);
		
		// 1-2. 수정 가격 레이블/텍스트필드
		JLabel priceLabel = new JLabel("수정 가격 : ");
		priceLabel.setBounds(114, 113, 75, 15);
		Panel.add(priceLabel);
		
		priceText = new JTextField();
		priceText.setBounds(210, 110, 118, 21);
		Panel.add(priceText);
		priceText.setColumns(10);
		
		// 1-3. 확인 버튼
		JButton confirmButton = new JButton("확   인");
		confirmButton.setBounds(114, 180, 97, 23);
		Panel.add(confirmButton);
		
		// 1-4. 취소 버튼
		JButton cancelButton = new JButton("취   소");
		cancelButton.setBounds(230, 180, 97, 23);
		Panel.add(cancelButton);
		
		
		// 2. 이벤트 추가
		// 2-1. 확인 버튼 이벤트
		confirmButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		// 2-2. 취소 버튼 이벤트
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		
	}

}
