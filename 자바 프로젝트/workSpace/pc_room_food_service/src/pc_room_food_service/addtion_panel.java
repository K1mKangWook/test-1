package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class addtion_panel  extends JPanel{
	ImageIcon kimchi_image = new ImageIcon("images/kimchi.jpg");
	ImageIcon danmooji_image = new ImageIcon("images/danmooji.jpg");
	JLabel kimchi = new JLabel();
	JLabel danmooji = new JLabel();
	GoodsOrder goodsOrder;
	public addtion_panel(GoodsOrder goodsOrder) {
		this.goodsOrder = goodsOrder;
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		kimchi.setText("Kimchi Free");
		kimchi.setIcon(kimchi_image);
		kimchi.setHorizontalTextPosition(SwingConstants.CENTER);
		kimchi.setVerticalTextPosition(SwingConstants.BOTTOM);
		kimchi.addMouseListener(goodsOrder.orderList);
		
		danmooji.setText("Danmooji Free");
		danmooji.setIcon(danmooji_image);
		danmooji.setHorizontalTextPosition(SwingConstants.CENTER);
		danmooji.setVerticalTextPosition(SwingConstants.BOTTOM);
		danmooji.addMouseListener(goodsOrder.orderList);
	
		add(kimchi);
		add(danmooji);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
