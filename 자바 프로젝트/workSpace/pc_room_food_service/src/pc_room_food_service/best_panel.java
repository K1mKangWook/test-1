package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
public class best_panel extends JPanel {
	
	ImageIcon buldak_image = new ImageIcon("images/buldak.jpg");
	ImageIcon Nakgbibimbab_image = new ImageIcon("images/Nakgbibimbab.jpg");
	ImageIcon Mandoo_image = new ImageIcon("images/mandoo.jpg");
	JLabel buldak = new JLabel();
	JLabel Nakgbibimbab = new JLabel();
	JLabel mandoo = new JLabel();
	
	private GoodsOrder goodsOrder;
	
	public best_panel(GoodsOrder goodsOrder) {
		goodsOrder = goodsOrder;
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		buldak.setText("Buldak 3000won");
		buldak.setIcon(buldak_image);
		buldak.setHorizontalTextPosition(SwingConstants.CENTER);
		buldak.setVerticalTextPosition(SwingConstants.BOTTOM);
		buldak.addMouseListener(goodsOrder.orderList);
		
		Nakgbibimbab.setText("NakgBibimBab 8000won");
		Nakgbibimbab.setIcon(Nakgbibimbab_image);
		Nakgbibimbab.setHorizontalTextPosition(SwingConstants.CENTER);
		Nakgbibimbab.setVerticalTextPosition(SwingConstants.BOTTOM);
		Nakgbibimbab.addMouseListener(goodsOrder.orderList);
			
		 mandoo.setText("Mandoo 3000won");
		 mandoo.setIcon(Mandoo_image);
		 mandoo.setHorizontalTextPosition(SwingConstants.CENTER);
		 mandoo.setVerticalTextPosition(SwingConstants.BOTTOM);
		 mandoo.addMouseListener(goodsOrder.orderList);
		 
		 add(buldak);
		 add(Nakgbibimbab);
		 add(mandoo);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
