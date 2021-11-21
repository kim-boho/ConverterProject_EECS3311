package view;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class ConverterMenuBar extends JMenuBar{

	public ConverterMenuBar(ActionListener menubarListener) {
		super();
		JMenu converterMenu = new JMenu("Update model");
		converterMenu.add(createMenuItem("Save input centimeters", "SAVE", KeyEvent.VK_F, KeyEvent.ALT_DOWN_MASK, menubarListener));
		super.add(converterMenu);
	}
	
	private JMenuItem createMenuItem(String text, String actionCommand, int accelerator1, int accelerator2, ActionListener listener) {
		JMenuItem menuItem = new JMenuItem(text);
		menuItem.setActionCommand(actionCommand);
		menuItem.addActionListener(listener);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator1, accelerator2));
		return menuItem;
	}
}
