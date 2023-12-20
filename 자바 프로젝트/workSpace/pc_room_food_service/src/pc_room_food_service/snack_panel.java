package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class snack_panel extends JPanel {
	ImageIcon hotbar_image = new ImageIcon("images/hotbar.jpg");
	ImageIcon nugget_image = new ImageIcon("images/nugget.jpg");
	ImageIcon mandoo_image = new ImageIcon("images/mandoo.jpg");
	JLabel hotbar = new JLabel();
	JLabel nugget = new JLabel();
	JLabel mandoo = new JLabel();
	GoodsOrder goodsOrder;
	public snack_panel(GoodsOrder goodsOrder) {
		this.goodsOrder = goodsOrder;
		
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		hotbar.setText("Hotbar 2000won");
		hotbar.setIcon(hotbar_image);
		hotbar.setHorizontalTextPosition(SwingConstants.CENTER);
		hotbar.setVerticalTextPosition(SwingConstants.BOTTOM);
		hotbar.addMouseListener(goodsOrder.orderList);
		
		nugget.setText("Nugget 3000won");
		nugget.setIcon(nugget_image);
		nugget.setHorizontalTextPosition(SwingConstants.CENTER);
		nugget.setVerticalTextPosition(SwingConstants.BOTTOM);
		nugget.addMouseListener(goodsOrder.orderList);
		
		mandoo.setText("Mandoo 3000won");
		mandoo.setIcon(mandoo_image);
		mandoo.setHorizontalTextPosition(SwingConstants.CENTER);
		mandoo.setVerticalTextPosition(SwingConstants.BOTTOM);
		mandoo.addMouseListener(goodsOrder.orderList);
		
	
		 add(hotbar);
		 add(nugget);
		 add(mandoo);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
