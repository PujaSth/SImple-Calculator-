package swingPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class Calculator {

	private JFrame frame;
	private JTextField textFieldBlank;
			
	double firstNum;
	double secondNum;
	double result;
	String operation;
	String answer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 276, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldBlank = new JTextField();
		textFieldBlank.setBounds(10, 11, 240, 42);
		frame.getContentPane().add(textFieldBlank);
		textFieldBlank.setColumns(10);
//-----------------row first------------------------------------------------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(textFieldBlank.getText()+btn7.getText());
				textFieldBlank.setText(String.valueOf(x));	
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 64, 53, 48);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(textFieldBlank.getText()+btn8.getText());
				textFieldBlank.setText(String.valueOf(x));

          //	String x = textFieldBlank.getText()+btn8.getText();
         //		textFieldBlank.setText(x);
			}
		});
		btn8.setBounds(73, 64, 53, 48);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String x = textFieldBlank.getText()+btn9.getText();
//				textFieldBlank.setText(x);
				int x = Integer.parseInt(textFieldBlank.getText()+btn9.getText());
				textFieldBlank.setText(String.valueOf(x));

			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(136, 64, 53, 48);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textFieldBlank.getText());
//				textFieldBlank.setText(String.valueOf(firstNum));
				textFieldBlank.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(199, 64, 53, 48);
		frame.getContentPane().add(btnPlus);
		
		//-----------------row second-----------------------------
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String x = textFieldBlank.getText()+btn4.getText();
						textFieldBlank.setText(x);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(10, 123, 53, 48);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String x = textFieldBlank.getText()+btn5.getText();
						textFieldBlank.setText(x);
					}
				});
				btn5.setBounds(73, 123, 53, 48);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String x = textFieldBlank.getText()+btn6.getText();
						textFieldBlank.setText(x);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBounds(136, 123, 53, 48);
				frame.getContentPane().add(btn6);
				
				JButton btnMinus = new JButton("-");
				btnMinus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum = Double.parseDouble(textFieldBlank.getText());
						textFieldBlank.setText("");
						operation = "-";
					}
				});
				btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMinus.setBounds(199, 123, 53, 48);
				frame.getContentPane().add(btnMinus);
	// ---------------------------- row 3 ---------------------
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String x = textFieldBlank.getText()+btn1.getText();
						textFieldBlank.setText(x);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(10, 182, 53, 48);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String x = textFieldBlank.getText()+btn2.getText();
						textFieldBlank.setText(x);
					}
				});
				btn2.setBounds(73, 182, 53, 48);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String x = textFieldBlank.getText()+btn3.getText();
						textFieldBlank.setText(x);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(136, 182, 53, 48);
				frame.getContentPane().add(btn3);
				
				JButton btnMultiply = new JButton("*");
				btnMultiply.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum = Double.parseDouble(textFieldBlank.getText());
						textFieldBlank.setText("");
						operation = "*";
					}
				});
				btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMultiply.setBounds(199, 182, 53, 48);
				frame.getContentPane().add(btnMultiply);
				
				
				// ---------------------------- row 4 ---------------------
				JButton btnPeriod = new JButton(".");
				btnPeriod.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String x = textFieldBlank.getText()+btnPeriod.getText();
						textFieldBlank.setText(x);
					}
				});
				btnPeriod.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPeriod.setBounds(10, 241, 53, 48);
				frame.getContentPane().add(btnPeriod);
				
				JButton btn0 = new JButton("0");
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String x = textFieldBlank.getText()+btn0.getText();
						textFieldBlank.setText(x);
					}
				});
				btn0.setBounds(73, 241, 53, 48);
				frame.getContentPane().add(btn0);				
				
				JButton btnDivide = new JButton("/");
				btnDivide.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNum = Double.parseDouble(textFieldBlank.getText());
						textFieldBlank.setText("");
						operation = "/";
					}
				});
				btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDivide.setBounds(136, 241, 53, 48);
				frame.getContentPane().add(btnDivide);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						secondNum = Double.parseDouble(textFieldBlank.getText());
						if(operation == "+")
						{
							result = firstNum +secondNum;
							answer = String.format("%.2f", result);
							textFieldBlank.setText(answer);
						}
						else if(operation == "-")
						{
							result = firstNum -secondNum;
							answer = String.format("%.2f", result);
							textFieldBlank.setText(answer);
						}
						else if(operation == "*")
						{
							result = firstNum * secondNum;
							answer = String.format("%.2f", result);
							textFieldBlank.setText(answer);
						}
						else if(operation == "/")
						{
							result = firstNum/secondNum;
							answer = String.format("%.2f", result);
							textFieldBlank.setText(answer);
						}
					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEqual.setBounds(197, 241, 53, 48);
				frame.getContentPane().add(btnEqual);
				
			
	//-------------------- row 5--------------------------
				
				JButton btnClear = new JButton("C");
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textFieldBlank.setText(null);
					}
				});
				btnClear.setBounds(99, 300, 66, 48);
				btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
				frame.getContentPane().add(btnClear);
				
				
				
	}
	
}
