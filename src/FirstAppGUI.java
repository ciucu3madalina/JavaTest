import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class FirstAppGUI {

	private static class FirstDisplay extends JPanel{
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("Deadly Fatal ERROR!", 20, 35);
		}
		
	}
	private static class ButtonHandler implements ActionListener{
			
		public void actionPerformed(ActionEvent ev){


			JOptionPane.showInputDialog(null, "HI!", "Hey, sexy:>",0);
		}
	}
		
	public static void main(String [] args){
		FirstDisplay fd = new FirstDisplay();
			
		JButton button = new JButton("Push me!");
			
		ButtonHandler bh = new ButtonHandler();
			
		button.addActionListener(bh);
		
		JPanel content = new JPanel();
		
		content.setLayout(new BorderLayout());
		content.add(fd, BorderLayout.CENTER);
		content.add(button, BorderLayout.SOUTH);
		
		JFrame win = new JFrame("Miau!");
		win.setContentPane(content);
		win.setSize(250, 100);
		win.setVisible(true);
	}
	
}
