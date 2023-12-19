package pc_room_food_service;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class ClickOrder extends MouseAdapter {
	
	public void mouseClicked(MouseEvent e) {
		int result = JOptionPane.showConfirmDialog(null,  "Would you like to process your order?","Order",JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your order has been completed.", "Completed", JOptionPane.NO_OPTION);
		}
	}
}
