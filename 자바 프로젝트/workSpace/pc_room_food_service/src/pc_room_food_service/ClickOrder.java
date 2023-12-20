package pc_room_food_service;
import java.awt.event.*;
import javax.swing.*;


public class ClickOrder extends MouseAdapter {
	
	GoodsOrder goodsOrder;
	ClickOrder(GoodsOrder goodsOrder) {
		this.goodsOrder = goodsOrder;
	}
	
	public void mouseClicked(MouseEvent e) {
		int result = JOptionPane.showConfirmDialog(null,  "Would you like to process your order?","Order",JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Your order has been completed.", "Completed", JOptionPane.NO_OPTION);
			goodsOrder.getTextArea().setText("");
			goodsOrder.getTextArea().append("You can check the product you ordered.\n");
			goodsOrder.getSum().setText("");
			
			goodsOrder.getSumofOrder().sum = 0;
		}
	}
}
