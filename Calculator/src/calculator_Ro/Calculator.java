//Daniel Kenny 22/08/19
//A very basic calculator project based on a tutorial
package calculator_Ro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textDisplay;
	
	String operations;
	String answer;
	double firstNum;
	double secondNum;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	//////////////////////////////////////////////////////////////////////////////////
		//Error catching for the custom UI
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	/////////////////////////////////////////////////////////////////////////////
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setBounds(10, 11, 248, 46);
		contentPane.add(textDisplay);
		textDisplay.setColumns(10);
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btn_backSpace = new JButton("\uF0D5");
		
		btn_backSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backSpace = null; //set an empty string variable that will hold the string after char delete
				
				//Check to see if display is blank before trying to remove a char
				if(textDisplay.getText().length() > 0) {
					//Create a string builder to get current text from display
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					//Delete the last character in the char array
					strB.deleteCharAt(textDisplay.getText().length()-1);
					//set our backSpace variable equal to strB and set that as the textDispaly
					backSpace = strB.toString();
					textDisplay.setText(backSpace);
				}
			}
		});
	
		btn_backSpace.setFont(new Font("Wingdings", Font.BOLD, 20));
		btn_backSpace.setBounds(10, 68, 60, 60);
		contentPane.add(btn_backSpace);
///////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Clear the text display
				textDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(71, 68, 60, 60);
		contentPane.add(btnClear);
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton button_mod = new JButton("%");
		button_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "%";
			}
		});
		button_mod.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_mod.setBounds(136, 68, 60, 60);
		contentPane.add(button_mod);
	//////////////////////////////////////////////////////////////////////////////////////////////////////////	
		JButton button_add = new JButton("+");
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "+";
			}
		});
		button_add.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_add.setBounds(197, 68, 60, 60);
		contentPane.add(button_add);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		JButton button_num7 = new JButton("7");
		button_num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Create a string that's equal to the current display and append num 7
				String EnterNum = textDisplay.getText() + button_num7.getText();
				textDisplay.setText(EnterNum);
			}
		});
		button_num7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_num7.setBounds(10, 133, 60, 60);
		contentPane.add(button_num7);
	///////////////////////////////////////////////////////////////////////////////////////////////////////////	
		JButton button_num8 = new JButton("8");
		button_num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Create a string that's equal to the current display and append num 8
				String EnterNum = textDisplay.getText() + button_num8.getText();
				textDisplay.setText(EnterNum);
			}
		});
		button_num8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_num8.setBounds(71, 133, 60, 60);
		contentPane.add(button_num8);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		JButton button_num9 = new JButton("9");
		button_num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Create a string that's equal to the current display and append num 9
				String EnterNum = textDisplay.getText() + button_num9.getText();
				textDisplay.setText(EnterNum);
			}
		});
		button_num9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_num9.setBounds(136, 133, 60, 60);
		contentPane.add(button_num9);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		JButton button_sub = new JButton("-");
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "-";
			}
		});
		button_sub.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_sub.setBounds(197, 133, 60, 60);
		contentPane.add(button_sub);
	///////////////////////////////////////////////////////////////////////////////////////////////////////////	
		JButton button_num4 = new JButton("4");
		button_num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Create a string that's equal to the current display and append num 4
				String EnterNum = textDisplay.getText() + button_num4.getText();
				textDisplay.setText(EnterNum);
			}
		});
		button_num4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_num4.setBounds(10, 198, 60, 60);
		contentPane.add(button_num4);
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton button_num5 = new JButton("5");
		button_num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Create a string that's equal to the current display and append num 5
				String EnterNum = textDisplay.getText() + button_num5.getText();
				textDisplay.setText(EnterNum);
			}
		});
		button_num5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_num5.setBounds(71, 198, 60, 60);
		contentPane.add(button_num5);
	/////////////////////////////////////////////////////////////////////////////////////////////////////////	
		JButton button_num6 = new JButton("6");
		button_num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Create a string that's equal to the current display and append num 6
				String EnterNum = textDisplay.getText() + button_num6.getText();
				textDisplay.setText(EnterNum);
			}
		});
		button_num6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_num6.setBounds(136, 198, 60, 60);
		contentPane.add(button_num6);
	////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton button_multi = new JButton("*");
		button_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "*";
			}
		});
		button_multi.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_multi.setBounds(197, 198, 60, 60);
		contentPane.add(button_multi);
	//////////////////////////////////////////////////////////////////////////////////////////////////////////	
		JButton button_num1 = new JButton("1");
		button_num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Create a string that's equal to the current display and append num 1
				String EnterNum = textDisplay.getText() + button_num1.getText();
				textDisplay.setText(EnterNum);
			}
		});
		button_num1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_num1.setBounds(10, 263, 60, 60);
		contentPane.add(button_num1);
	////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton button_num2 = new JButton("2");
		button_num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Create a string that's equal to the current display and append num 2
				String EnterNum = textDisplay.getText() + button_num2.getText();
				textDisplay.setText(EnterNum);
			}
		});
		button_num2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_num2.setBounds(71, 263, 60, 60);
		contentPane.add(button_num2);
	///////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton button_num3 = new JButton("3");
		button_num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Create a string that's equal to the current display and append num 3
				String EnterNum = textDisplay.getText() + button_num3.getText();
				textDisplay.setText(EnterNum);
			}
		});
		button_num3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_num3.setBounds(136, 263, 60, 60);
		contentPane.add(button_num3);
	////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton button_devide = new JButton("/");
		button_devide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "/";
			}
		});
		button_devide.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_devide.setBounds(197, 263, 60, 60);
		contentPane.add(button_devide);
	/////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton button_num0 = new JButton("0");
		button_num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Create a string that's equal to the current display and append num 0
				String EnterNum = textDisplay.getText() + button_num0.getText();
				textDisplay.setText(EnterNum);
			}
		});
		button_num0.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_num0.setBounds(11, 326, 60, 60);
		contentPane.add(button_num0);
	///////////////////////////////////////////////////////////////////////////////////////////////	
		JButton button_dec = new JButton(".");
		button_dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! textDisplay.getText().contains(".")) {
					textDisplay.setText(textDisplay.getText() + button_dec.getText());
				}
			}
		});
		button_dec.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_dec.setBounds(72, 326, 60, 60);
		contentPane.add(button_dec);
	////////////////////////////////////////////////////////////////////////////////////////////////
		JButton button_pluseNeg = new JButton("\u00B1");
		button_pluseNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double plusNeg = Double.parseDouble(String.valueOf(textDisplay.getText()));
				plusNeg = plusNeg * (-1);
				textDisplay.setText(String.valueOf(plusNeg));
			}
		});
		button_pluseNeg.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_pluseNeg.setBounds(137, 326, 60, 60);
		contentPane.add(button_pluseNeg);
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		JButton button_ans = new JButton("=");
		button_ans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondNum = Double.parseDouble(textDisplay.getText());
				
				if(operations == "+") 
				{
					result = firstNum + secondNum;
					answer = String.format("%.4f", result);
					textDisplay.setText(answer);
				}
				else if(operations == "-") 
				{
					result = firstNum - secondNum;
					answer = String.format("%.4f", result);
					textDisplay.setText(answer);
				}
				else if(operations == "*") 
				{
					result = firstNum * secondNum;
					answer = String.format("%.4f", result);
					textDisplay.setText(answer);
				}
				else if(operations == "/") 
				{
					result = firstNum / secondNum;
					answer = String.format("%.4f", result);
					textDisplay.setText(answer);
				}
				else if(operations == "%") 
				{
					result = firstNum % secondNum;
					answer = String.format("%.4f", result);
					textDisplay.setText(answer);
				}
			}
		});
		button_ans.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_ans.setBounds(198, 326, 60, 60);
		contentPane.add(button_ans);
	}
}
