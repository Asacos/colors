import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SimpleGUI extends JFrame {	
	private static final long serialVersionUID = 1L;
	private JLabel blank_=new JLabel("");
	private JLabel blank2_=new JLabel("");
	private JLabel red_=new JLabel("Red:");
	private JLabel green_=new JLabel("Green:");
	private JLabel blue_=new JLabel("Blue:");
	private JTextField r_txt=new JTextField("", 5);
	private JTextField g_txt=new JTextField("", 5);
	private JTextField b_txt=new JTextField("", 5);
	private JButton create=new JButton("Create");
	String Rstr;
	String Gstr;
	String Bstr;
	
	public SimpleGUI() {
		super("Set Color");
		this.setBounds(0, 375, 600, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container=this.getContentPane();
		container.setLayout(new GridLayout(3, 3, 2, 2));
		container.add(red_);
		container.add(green_);
		container.add(blue_);
		container.add(r_txt);
		container.add(g_txt);
		container.add(b_txt);
		container.add(blank_);
		container.add(blank2_);
	    container.add(create);
	    this.Rstr=r_txt.getText();
		this.Gstr=g_txt.getText();
		this.Bstr=b_txt.getText();
	    create.addActionListener(new ListenerAction());
	}    
	
	boolean colorCheck (int a) {
		if((a>=0)&&(a<256)) {
			return true;
		}		
		return false;
	}
	
	public class ListenerAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			SimpleGUI sg=new SimpleGUI();
			sg.Rstr=r_txt.getText();
			sg.Gstr=g_txt.getText();
			sg.Bstr=b_txt.getText();
			int redInt=-1;
		    int greenInt=-1;
		    int blueInt=-1;
		    try {
		    	redInt=Integer.parseInt(sg.Rstr);
		    	greenInt=Integer.parseInt(sg.Gstr);
		    	blueInt=Integer.parseInt(sg.Bstr);
		    } catch(NumberFormatException nfe) {
		    	System.out.println("Format error");
		    }
		    
			if (((sg.colorCheck(redInt))&&(sg.colorCheck(greenInt))&&(sg.colorCheck(blueInt)))==true) {
			    	JFrame f=new JFrame();
			    	ColorRects p=new ColorRects();  
			    	p.setColor(redInt, greenInt, blueInt);
			    	f.setSize(600, 375);
			    	f.setVisible(true);
			    	Container c = f.getContentPane();    
			    	c.setLayout(new BorderLayout());               
			    	c.add(p);
			 } else {
				 System.out.println("Wrong number");
			 }
		}   

	}

}

