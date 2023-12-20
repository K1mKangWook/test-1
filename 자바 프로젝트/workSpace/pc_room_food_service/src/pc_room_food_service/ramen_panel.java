package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class ramen_panel extends JPanel {
	ImageIcon jin_ramen_image = new ImageIcon("images/jin_ramen.jpg");
	ImageIcon sin_ramen_image = new ImageIcon("images/sin_ramen.jpg");
	ImageIcon buldak_image = new ImageIcon("images/buldak.jpg");
	JLabel jin_ramen = new JLabel();
	JLabel sin_ramen = new JLabel();
	JLabel buldak = new JLabel();
	GoodsOrder goodsOrder;
	public ramen_panel(GoodsOrder goodsOrder) {
		this.goodsOrder = goodsOrder;
		
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		jin_ramen.setText("Jin Ramen 3000won");
		jin_ramen.setIcon(jin_ramen_image);
		jin_ramen.setHorizontalTextPosition(SwingConstants.CENTER);
		jin_ramen.setVerticalTextPosition(SwingConstants.BOTTOM);
		jin_ramen.addMouseListener(goodsOrder.orderList);
		
		sin_ramen.setText("Sin Ramen 3000won");
		sin_ramen.setIcon(sin_ramen_image);
		sin_ramen.setHorizontalTextPosition(SwingConstants.CENTER);
		sin_ramen.setVerticalTextPosition(SwingConstants.BOTTOM);
		sin_ramen.addMouseListener(goodsOrder.orderList);
		
		buldak.setText("Buldak 3000won");
		buldak.setIcon(buldak_image);
		buldak.setHorizontalTextPosition(SwingConstants.CENTER);
		buldak.setVerticalTextPosition(SwingConstants.BOTTOM);
		buldak.addMouseListener(goodsOrder.orderList);
		
	
		 add(jin_ramen);
		 add(sin_ramen);
		 add(buldak);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
