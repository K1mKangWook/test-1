package pc_room_food_service;
import java.awt.event.*;

public class ClickReset extends MouseAdapter {
	GoodsOrder goodsOrder;
	ClickReset(GoodsOrder goodsOrder) {
		this.goodsOrder = goodsOrder;
	}
	
	public void mouseClicked(MouseEvent e) {
		goodsOrder.getTextArea().setText("");
		goodsOrder.getTextArea().append("You can check the product you ordered.\n");
		goodsOrder.getSum().setText("");
	}
}
