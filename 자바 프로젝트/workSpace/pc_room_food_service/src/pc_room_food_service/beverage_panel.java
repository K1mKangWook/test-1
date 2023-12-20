package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class beverage_panel extends JPanel {
	ImageIcon coke_image = new ImageIcon("images/coke.jpg");
	ImageIcon soda_image = new ImageIcon("images/soda.jpg");
	ImageIcon fanta_image = new ImageIcon("images/fanta.jpg");
	JLabel coke = new JLabel();
	JLabel soda = new JLabel();
	JLabel fanta = new JLabel();
	
	GoodsOrder goodsOrder;
	
	public beverage_panel(GoodsOrder goodsOrder) {
		this.goodsOrder = goodsOrder;
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		coke.setText("Coke 2000won");
		coke.setIcon(coke_image);
		coke.setHorizontalTextPosition(SwingConstants.CENTER);
		coke.setVerticalTextPosition(SwingConstants.BOTTOM);
		coke.addMouseListener(goodsOrder.orderList);
		
		soda.setText("Soda 2000won");
		soda.setIcon(soda_image);
		soda.setHorizontalTextPosition(SwingConstants.CENTER);
		soda.setVerticalTextPosition(SwingConstants.BOTTOM);
		soda.addMouseListener(goodsOrder.orderList);
		
		fanta.setText("Fanta 2000won");
		fanta.setIcon(fanta_image);
		fanta.setHorizontalTextPosition(SwingConstants.CENTER);
		fanta.setVerticalTextPosition(SwingConstants.BOTTOM);
		fanta.addMouseListener(goodsOrder.orderList);
		
	
		 add(coke);
		 add(soda);
		 add(fanta);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
