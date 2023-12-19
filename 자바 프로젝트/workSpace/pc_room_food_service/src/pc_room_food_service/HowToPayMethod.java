package pc_room_food_service;
import javax.swing.*;

import java.awt.Container;
import java.awt.event.*;

/*
 * this class operate for how to pay
 * if you check the Credit, It shows Credit pay way
 * If you check the Cash, It shows Cash pay way 
 */
/*
public class HowToPayMethod implements ItemListener {
	
	ButtonGroup cash_group = new ButtonGroup(); //How to pay Group
	JRadioButton howmuch[] = new JRadioButton[4]; //How to pay with JRadioButton
	String money[] = {"5000" , "10000" , "50000", "According to the amount"}; //set Button name
	
	public HowToPayMethod() {
		initialButton();
	}
	
	public void initialButton() {
		for (int i = 0; i < 4; i++) {
			howmuch[i] = new JRadioButton(money[i]);
			cash_group.add(howmuch[i]);
		} 
		
		howmuch[0].setBounds(1120, 550,100,50);
		howmuch[1].setBounds(1220,550,100,50);
		howmuch[2].setBounds(1120, 650,100,50);
		howmuch[3].setBounds(1220,650,100,50);
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.DESELECTED) {
			return;
		}
		JRadioButton radio = (JRadioButton)e.getSource();
		
		if(radio.isSelected()) {
			if (radio.getText().equals("Credit")) {
				
			}
			else if (radio.getText().equals("Cash")) {
				Container c = (Container)e.getSource();
				for (int i = 0; i < 4; i++) {
					c.add(howmuch[i]);
				}
			}
 		}
	}
}
*/