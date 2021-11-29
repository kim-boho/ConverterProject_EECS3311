package view;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * This class is for menu bar interface.
 * @author Boho Kim
 *
 */
@SuppressWarnings("serial")
public class ConverterMenuBar extends JMenuBar{

	/**
	 * Constructor to create menu bar in user interface.
	 * @param menubarListener controller to handle menu bar command from user.
	 */
	public ConverterMenuBar(ActionListener menubarListener) {
		super();
		JMenu converterMenu = new JMenu("Update model");
		converterMenu.add(createMenuItem("Save input centimeters", "SAVE", KeyEvent.VK_F, KeyEvent.ALT_DOWN_MASK, menubarListener));
		super.add(converterMenu);
	}
	
	/**
	 * This method creates menu bar item which is added in menu bar and receives command from user.
	 * @param text menu bar item name
	 * @param actionCommand command name that user wants to do
	 * @param accelerator1 key stroke that user presses for the command
	 * @param accelerator2 key stroke that user presses for the command
	 * @param listener action listener to handle the command
	 * @return JmenuItem listed in menu bar
	 */
	private JMenuItem createMenuItem(String text, String actionCommand, int accelerator1, int accelerator2, ActionListener listener) {
		JMenuItem menuItem = new JMenuItem(text);
		menuItem.setActionCommand(actionCommand);
		menuItem.addActionListener(listener);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator1, accelerator2));
		return menuItem;
	}
}
