package Lee;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InfoChangePopup extends JDialog {

	private final JPanel Panel = new JPanel();
	private JTextField pwText;
	private JTextField nickText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InfoChangePopup dialog = new InfoChangePopup();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InfoChangePopup() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel, BorderLayout.CENTER);
		Panel.setLayout(null);
		
		// 1. 컴포넌트 추가
		// 1-1. 닉네임 레이블 /텍스트필드
		JLabel nicknameLbl = new JLabel("닉네임 : ");
		nicknameLbl.setBounds(114, 79, 67, 15);
		Panel.add(nicknameLbl);
		
		nickText = new JTextField();
		nickText.setBounds(210, 76, 118, 21);
		Panel.add(nickText);
		nickText.setColumns(10);
		
		// 1-2. 비밀번호 레이블/텍스트필드
		JLabel passwordLbl = new JLabel("비밀번호 : ");
		passwordLbl.setBounds(114, 113, 75, 15);
		Panel.add(passwordLbl);
		
		pwText = new JTextField();
		pwText.setBounds(210, 110, 118, 21);
		Panel.add(pwText);
		pwText.setColumns(10);
		
		// 1-3. 확인 버튼
		JButton confirmBtn = new JButton("확   인");
		confirmBtn.setBounds(114, 180, 97, 23);
		Panel.add(confirmBtn);
		
		// 1-4. 취소 버튼
		JButton cancelBtn = new JButton("취   소");
		cancelBtn.setBounds(230, 180, 97, 23);
		Panel.add(cancelBtn);
		
		
		// 2. 이벤트 추가
		// 2-1. 확인 버튼 이벤트
		confirmBtn.addActionListener(new ActionListener() {	 //★★★★★★★★★★
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		// 2-2. 취소 버튼 이벤트
		cancelBtn.addActionListener(new ActionListener() {	//★★★★★★★★★★
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		
	}

}
