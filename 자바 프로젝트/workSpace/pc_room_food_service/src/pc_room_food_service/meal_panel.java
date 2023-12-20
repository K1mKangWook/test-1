package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class meal_panel extends JPanel {
	ImageIcon kimchi_rice_image = new ImageIcon("images/kimchi_rice.jpg");
	ImageIcon chicken_mayo_image = new ImageIcon("images/chicken_mayo.jpg");
	ImageIcon Nakgbibimbab_image = new ImageIcon("images/Nakgbibimbab.jpg");
	JLabel kimchi_rice = new JLabel();
	JLabel chicken_mayo = new JLabel();
	JLabel Nakgbibimbab = new JLabel();
	
	GoodsOrder goodsOrder;
	
	public meal_panel(GoodsOrder goodsOrder) {
		this.goodsOrder = goodsOrder;
		
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		 kimchi_rice.setText("Kimchi Rice 6000won");
		 kimchi_rice.setIcon(kimchi_rice_image);
		 kimchi_rice.setHorizontalTextPosition(SwingConstants.CENTER);
		 kimchi_rice.setVerticalTextPosition(SwingConstants.BOTTOM);
		 kimchi_rice.addMouseListener(goodsOrder.orderList);
		
		 chicken_mayo.setText("Chicken Mayo 6000won");
		 chicken_mayo.setIcon(chicken_mayo_image);
		 chicken_mayo.setHorizontalTextPosition(SwingConstants.CENTER);
		 chicken_mayo.setVerticalTextPosition(SwingConstants.BOTTOM);
		 chicken_mayo.addMouseListener(goodsOrder.orderList);
		 
		 Nakgbibimbab.setText("NakgiBibimbab 8000won");
		 Nakgbibimbab.setIcon(Nakgbibimbab_image);
		 Nakgbibimbab.setHorizontalTextPosition(SwingConstants.CENTER);
		 Nakgbibimbab.setVerticalTextPosition(SwingConstants.BOTTOM);
		 Nakgbibimbab.addMouseListener(goodsOrder.orderList);
		
	
		 add(kimchi_rice);
		 add(chicken_mayo);
		 add(Nakgbibimbab);
		
		setBackground(Color.white);
		setSize(1100,850);
	}

}
