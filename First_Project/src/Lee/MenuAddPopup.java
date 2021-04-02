package Lee;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class MenuAddPopup extends JDialog {

	private final JPanel Panel = new JPanel();
	private JTextField menuText;
	private JTextField priceText;
	private JTextField textField;

//	private JFileChooser fileComponent = new JFileChooser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MenuAddPopup dialog = new MenuAddPopup();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MenuAddPopup() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Panel, BorderLayout.CENTER);
		Panel.setLayout(null);

		// 1. 컴포넌트 추가
		// 1-1. 추가 메뉴 레이블 /텍스트필드
		JLabel menuLabel = new JLabel("추가 메뉴 : ");
		menuLabel.setBounds(114, 79, 67, 15);
		Panel.add(menuLabel);

		menuText = new JTextField();
		menuText.setBounds(210, 76, 118, 21);
		Panel.add(menuText);
		menuText.setColumns(10);

		// 1-2. 수정 가격 레이블/텍스트필드
		JLabel priceLabel = new JLabel("추가 가격 : ");
		priceLabel.setBounds(114, 113, 67, 15);
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

//		textField = new JTextField();
//		textField.setBounds(114, 28, 116, 21);
//		Panel.add(textField);
//		textField.setColumns(10);
//
//		JButton btnNewButton = new JButton("파일찾기");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String folderPath = "";
//
//				JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); // 디렉토리
//																												// 설정
//				chooser.setCurrentDirectory(new File("/")); // 현재 사용 디렉토리를 지정
//				chooser.setAcceptAllFileFilterUsed(true); // Fileter 모든 파일 적용
//				chooser.setDialogTitle("타이틀"); // 창의 제목
//				chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // 파일 선택 모드
//
//				FileNameExtensionFilter filter = new FileNameExtensionFilter("Binary File", "cd11"); // filter 확장자 추가
//				chooser.setFileFilter(filter); // 파일 필터를 추가
//
//				int returnVal = chooser.showOpenDialog(null); // 열기용 창 오픈
//
//				if (returnVal == JFileChooser.APPROVE_OPTION) { // 열기를 클릭
//					folderPath = chooser.getSelectedFile().toString();
//				} else if (returnVal == JFileChooser.CANCEL_OPTION) { // 취소를 클릭
//					System.out.println("cancel");
//					folderPath = "";
//				}
//				System.out.println(folderPath);
//			}
//		});
//		btnNewButton.setBounds(242, 27, 97, 23);
//		Panel.add(btnNewButton);

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
