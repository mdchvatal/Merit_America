package Examples;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GCanvas;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;

public class TextAndGraphics extends ConsoleProgram{
	private GCanvas leftCanvas;
	private GCanvas rightCanvas;
	private JTextField textField;
	
	private double leftY = 10;
	private double rightY = 10;
	
	private final int SPACER = 10;
	
	public void init() {
		setLayout(new GridLayout(1, 3));
		
		leftCanvas = new GCanvas();
		add(leftCanvas);
		
		rightCanvas = new GCanvas();
		add(rightCanvas);
		
		textField = new JTextField(10);
		add(new JLabel("Some Text"), SOUTH);
		add(textField, SOUTH);
		textField.addActionListener(this);
		
		add(new JButton("Draw Left"), SOUTH);
		add(new JButton("Draw Right"), SOUTH);
		
		addActionListeners();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == textField) {
			println(textField.getText());
		}
		
		String cmd = e.getActionCommand();
		if (cmd.equals("Draw Left")) {
			leftCanvas.add(createFilledRect(), 20, leftY);
			leftY += SPACER;
		} else if (cmd.equals("Draw Right")) {
			rightCanvas.add(createFilledRect(), 20, rightY);
			rightY += SPACER;
		}
		
	}
	
	private GRect createFilledRect() {
		GRect rect = new GRect(50, 20);
		rect.setFilled(true);
		return rect;
	}
}
