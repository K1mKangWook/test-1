package pc_room_food_service;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

/*
 * this class is operated when you click the menu
 * if you click the menu, background color of menu change to gray
 * when your mouse is on the menu, border color of menu change to blue
 */
public class OnTheMenu extends MouseAdapter {
	private GoodsOrder goodsOrder;
	private JLabel origin; //define JLabel value, To save origin component 
	
	/*
	 * Define Panel
	 */
	public best_panel best_panel;
	public setMenu_panel setMenu_panel;
	public snack_panel snack_panel;
	public ramen_panel ramen_panel;
	public meal_panel meal_panel;
	public beverage_panel beverage_panel;
	public all_panel all_panel;
	public addtion_panel addition_panel;
	
	public OnTheMenu(GoodsOrder goodsOrder) { 
		this.origin = null; 
		this.goodsOrder = goodsOrder;
	}
	
	/*
	 * when your mouse is on the menu, border color of menu change to blue
	 */
	public void mouseEntered(MouseEvent e) {
		JLabel c = (JLabel)e.getSource(); 
		LineBorder border = new LineBorder(Color.blue,3);
		c.setBorder(border);
		
	}
	
	/*
	 * when your mouse is out of the menu, border color of menu change to white
	 */
	public void mouseExited(MouseEvent e) {
		JLabel c = (JLabel)e.getSource();
		
		LineBorder border = new LineBorder(Color.black,2);
		c.setBorder(border);	
	}

	/*
	 * when you click the menu, background color of menu change to gray 
	 */
	public void mouseClicked(MouseEvent e) {
		JLabel c = (JLabel)e.getSource();
		Container contain = (Container)e.getSource();
		
		c.setBackground(Color.gray);
		
		if(origin != null) {
			origin.setBackground(Color.white);
		}
		origin = c; //why origin = c? -> if another menu is clicked, origin menu come white color
		
		
		//if you click the menu bar, change the menu panel
		if (c.getText().equals("SetMenu")) {
			removeCurrentPanel();
			setMenu_panel = new setMenu_panel(goodsOrder);
			setMenu_panel.setLocation(0,50);
			goodsOrder.getContainer().add(setMenu_panel);
			
		}
		else if (c.getText().equals("Best")) {
			removeCurrentPanel();
			best_panel = new best_panel(goodsOrder);
			best_panel.setLocation(0,50);
			goodsOrder.getContainer().add(best_panel);
		}
		else if (c.getText().equals("Meal")) {
			removeCurrentPanel();
			meal_panel = new meal_panel(goodsOrder);
			meal_panel.setLocation(0,50);
			goodsOrder.getContainer().add(meal_panel);
		}
		else if (c.getText().equals("Ramen")) {
			removeCurrentPanel();
			ramen_panel = new ramen_panel(goodsOrder);
			ramen_panel.setLocation(0,50);
			goodsOrder.getContainer().add(ramen_panel);
		}
		else if (c.getText().equals("Beverage")) {
			removeCurrentPanel();
			beverage_panel = new beverage_panel(goodsOrder);
			beverage_panel.setLocation(0,50);
			goodsOrder.getContainer().add(beverage_panel);
		}
		else if (c.getText().equals("Snack")) {
			removeCurrentPanel();
			snack_panel = new snack_panel(goodsOrder);
			snack_panel.setLocation(0,50);
			goodsOrder.getContainer().add(snack_panel);
		}
		else if (c.getText().equals("Addition")) {
			removeCurrentPanel();
			addition_panel = new addtion_panel(goodsOrder);
			addition_panel.setLocation(0,50);
			goodsOrder.getContainer().add(addition_panel);	
		}
		else if (c.getText().equals("All")) {
			removeCurrentPanel();
			all_panel = new all_panel(goodsOrder);
			all_panel.setLocation(0,50);
			goodsOrder.getContainer().add(all_panel);
		}
		
		
		goodsOrder.getContainer().revalidate();
        goodsOrder.getContainer().repaint();
		
	}
	
	private void removeCurrentPanel() {
		Component[] components = goodsOrder.getContainer().getComponents();
        for (Component comp : components) {
            if (comp instanceof best_panel || comp instanceof setMenu_panel 
            		|| comp instanceof snack_panel || comp instanceof ramen_panel 
            		|| comp instanceof meal_panel || comp instanceof beverage_panel 
            		|| comp instanceof all_panel || comp instanceof addtion_panel) {
            	goodsOrder.getContainer().remove(comp);
                break;
            }
        }
	}

}
