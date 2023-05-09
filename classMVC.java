// 클론 코딩입니다
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class classMVC extends JFrame {
	
	private JTextField inputSpace;
	
	private String num = "";
	
	private ArrayList<String> equation = new ArrayList<String>();
	
	public classMVC() {
		
		super();
		setLayout(null);
		
		inputSpace=new JTextField();
		inputSpace.setEditable(false);
		inputSpace.setBackground(Color.WHITE);
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
		inputSpace.setBounds(8, 10, 270, 70);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
		buttonPanel.setBounds(8, 90, 270, 235);
		
		String button_names[] = { "C", "÷", "×", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0" };
		JButton buttons[] = new JButton[button_names.length];
		
		for (int i = 0; i < button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
			buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
			if (button_names[i] == "C") buttons[i].setBackground(Color.white);
			else if ((i >= 4 && i <= 6) || (i >= 8 && i <= 10) || (i >= 12 && i <= 14)) buttons[i].setBackground(Color.BLACK);
			else buttons[i].setBackground(Color.black);
			buttons[i].setForeground(Color.WHITE);
			buttons[i].setBorderPainted(false);
			buttonPanel.add(buttons[i]);
		}
		
		add(inputSpace);
		add(buttonPanel);
		
		setTitle("계산기입니다");
		setVisible(true);
		setSize(300,370);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class PadActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			String operation = e.getActionCommand();
			if (operation.equals("C")) {
				inputSpace.setText("");
				num = "";
				equation.clear();
			} else if (operation.equals("=")) {
				if(!num.equals("")) {
					equation.add(num);
				}
				double result = Double.parseDouble(equation.get(0));
				for (int i = 1; i < equation.size(); i += 2) {
					String operator = equation.get(i);
					double operand = Double.parseDouble(equation.get(i+1));
					if(operator.equals("+")) {
						result += operand;
					} else if(operator.equals("-")) {
						result -= operand;
					} else if(operator.equals("×")) {
						result *= operand;
					} else if(operator.equals("÷")) {
						result /= operand;
					}
				}
				inputSpace.setText(Double.toString(result));
				num = "";
				equation.clear();
				equation.add(Double.toString(result));
			} else {
				num += operation;
				inputSpace.setText(inputSpace.getText() + operation);
				if(operation.equals("+") || operation.equals("-") || operation.equals("×") || operation.equals("÷")) {
					equation.add(num);
					equation.add(operation);
					num = "";
				}
			}
		}
		private void fullTextParsing(String inputText) {
			equation.clear();
			
			
		}
	}

	
	public static void main(String[] args) {
		new classMVC();
	}
}

