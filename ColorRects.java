import javax.swing.*;
import java.awt.*;
	
public class ColorRects extends JPanel {
	private static final long serialVersionUID = 1L;
	Color red_=new Color(0, 0, 0);
	Color green_=new Color(0, 0, 0);
	Color blue_=new Color(0, 0, 0);
	Color color_=new Color(0, 0, 0);
	
	void setColor (int r_, int g_, int b_) {
		this.red_=new Color(r_, 0, 0);
		this.green_=new Color(0, g_, 0);
		this.blue_=new Color(0, 0, b_);
		this.color_=new Color(r_, g_, b_);
	}
	
	@Override
	public void paintComponent(Graphics g){
		//super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D) g;
	    g2.setColor(color_);
	    g2.fillRect(200,25,200,200);
	    g2.setColor(red_);
	    g2.fillRect(75,275,100,50);
	    g2.setColor(green_);
	    g2.fillRect(250,275,100,50);
	    g2.setColor(blue_);
	    g2.fillRect(425,275,100,50);
	} 
}
