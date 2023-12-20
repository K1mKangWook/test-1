package pc_room_food_service;
import javax.swing.*;
import java.awt.event.*;

public class OrderList extends MouseAdapter {
	
	GoodsOrder goodsOrder;
	int price;
	//SumofOrder sumofOrder;
	
	OrderList(GoodsOrder goodsOrder) {
		this.goodsOrder = goodsOrder;
		//this.sumofOrder = new SumofOrder();
	}
	
	/*
	 * click the food -> the name and price will be on OrderList 
	 */
	public void mouseClicked(MouseEvent e) {
		JLabel la = (JLabel)e.getSource();
		goodsOrder.getTextArea().append(la.getText() + "\n");
		
		if (la.getText().equals("Kimchi Rice 6000won")) {
			price = 6000;
		}
		else if (la.getText().equals("Chicken Mayo 6000won")) {
			price = 6000;
		}
		else if (la.getText().equals("NakgiBibimbab 8000won")) {
			price = 8000;
		}
		else if (la.getText().equals("Jin Ramen 3000won")) {
			price = 3000;
		}
		else if (la.getText().equals("Sin Ramen 3000won")) {
			price = 3000;
		}
		else if (la.getText().equals("Buldak 3000won")) {
			price = 3000;
		}
		else if (la.getText().equals("Coke 2000won")) {
			price = 2000;
		}
		else if (la.getText().equals("Soda 2000won")) {
			price = 2000;
		}
		else if (la.getText().equals("Fanta 2000won")) {
			price = 2000;
		}
		else if (la.getText().equals("Hotbar 2000won")) {
			price = 2000;
		}
		else if (la.getText().equals("Nugget 3000won")) {
			price = 3000;
		}
		else if (la.getText().equals("Mandoo 3000won")) {
			price = 3000;
		}
		else if (la.getText().equals("Ramen + Coke 6000won")) {
			price = 6000;
		}
		else if (la.getText().equals("Ramen + Coke + Rice 7000won")) {
			price = 7000;
		}

		goodsOrder.getSumofOrder().addsum(price);
		goodsOrder.getSum().setText("Sum of Price : " + goodsOrder.getSumofOrder().getSum());	
	}
}
