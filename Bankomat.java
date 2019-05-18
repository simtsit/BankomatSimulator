import java.awt.GridLayout;
import java.awt.BorderLayout;

// import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextArea;

class Bankomat extends JFrame {
	private JButton btnNum0;
	private JButton btnNum1;
	private JButton btnNum2;
	private JButton btnNum3;
	private JButton btnNum4;
	private JButton btnNum5;
	private JButton btnNum6;
	private JButton btnNum7;
	private JButton btnNum8;
	private JButton btnNum9;
	private JButton btnOptionCancel;
	private JButton btnOptionChange;
	private JButton btnOptionClear;
	private JButton btnOptionEnter;

	private JTextArea txtAreaMonitor;

	private JButton btnRestart;
	private JButton btnExit;

	Bankomat(){ 
		setTitle("Bankomat Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		txtAreaMonitor = new JTextArea(14,3);
		add(txtAreaMonitor, BorderLayout.NORTH);
		
		// Create the elements;

		JPanel numPane = new JPanel();
		GridLayout buttonAreaPatternLayout = new GridLayout(4,3);
		numPane.setLayout(buttonAreaPatternLayout);

		btnNum1 = new JButton("1");
		btnNum2 = new JButton("2");
		btnNum3 = new JButton("3");
		btnNum4 = new JButton("4");
		btnNum5 = new JButton("5");
		btnNum6 = new JButton("6");
		btnNum7 = new JButton("7");
		btnNum8 = new JButton("8");
		btnNum9 = new JButton("9");
		btnNum0 = new JButton("0");
		btnRestart = new JButton("Restart");
		btnExit = new JButton("Exit");

		numPane.add(btnNum1);
		numPane.add(btnNum2);
		numPane.add(btnNum3);
		numPane.add(btnNum4);
		numPane.add(btnNum5);
		numPane.add(btnNum6);
		numPane.add(btnNum7);
		numPane.add(btnNum8);
		numPane.add(btnNum9);
		numPane.add(btnRestart);
		numPane.add(btnNum0);
		numPane.add(btnExit);
		add(numPane, BorderLayout.CENTER);



		JPanel optionPane = new JPanel();
		GridLayout optionAreaPatternLayout = new GridLayout(4,1);
		optionPane.setLayout(optionAreaPatternLayout);

		btnOptionCancel = new JButton("Cancel");
		btnOptionClear = new JButton("Clear");
		btnOptionEnter = new JButton("Enter");
		btnOptionChange = new JButton("Change");

		optionPane.add(btnOptionCancel);
		optionPane.add(btnOptionChange);
		optionPane.add(btnOptionClear);
		optionPane.add(btnOptionEnter);

		add(optionPane, BorderLayout.EAST);		

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Bankomat();
	}
}
