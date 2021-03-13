package Examples;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GMath;
import acm.gui.IntField;
import acm.gui.TableLayout;
import acm.program.ConsoleProgram;
import acm.program.Program;

public class ActionListeners extends Program{
	
	private IntField farenField;
	private IntField celcField;
	
	public void init() {
		setLayout(new TableLayout(2, 3));
		
		farenField = new IntField(32);
		farenField.setActionCommand("F -> C");
		farenField.addActionListener(this);
		
		celcField = new IntField(0);
		celcField.setActionCommand("C -> F");
		celcField.addActionListener(this);
		
		add(new JLabel("Degrees Fahrenheit"));
		add(farenField);
		add(new JButton("F -> C"));
		
		add(new JLabel("Degrees Celcius"));
		add(celcField);
		add(new JButton("C -> F"));
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == farenField) {
			int f = farenField.getValue();
			int c = GMath.round((5.0 / 9.0) * (f - 32));
			celcField.setValue(c);
		} else if (e.getSource() == celcField) {
			int c = celcField.getValue();
			int f = GMath.round((9.0 / 5.0) * c + 32);
			farenField.setValue(f);
		}
	}
}
