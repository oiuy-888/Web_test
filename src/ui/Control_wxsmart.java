package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Control_wxsmart extends Control{

	public Control_wxsmart(){
		final JFrame jframe = new JFrame("万象智慧");
		jframe.setBounds(305, 0, 700, 600);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		JPanel pane = new JPanel();
		JLabel[] casename = new JLabel[src6.length];
		final JTextField[] casetime = new JTextField[src6.length];
		GridLayout gridLayout = new GridLayout(100, 2, 300, 0);
		pane.setLayout(gridLayout);
		for(int i=0;i<src6.length;i++){
			//case名称
			casename[i] = new JLabel("case"+casedesc[i+45]);
			pane.add(casename[i]);
			//case次数
			casetime[i] = new JTextField("1");
			casetime[i].setEditable(true);
			casetime[i].setText(String.valueOf(wxsmart[i]));
			pane.add(casetime[i]);
		}
		
		JButton button1=new JButton(new AbstractAction("全部归零") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<src6.length;i++){
					wxsmart[i]=0;
					casetime[i].setText("0");
				}
			}
		});
		pane.add(button1);
		
		JButton button2=new JButton(new AbstractAction("全部置一") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<src6.length;i++){
					wxsmart[i]=1;
					casetime[i].setText("1");
				}
			}
		});
		pane.add(button2);
		
		JButton button=new JButton(new AbstractAction("确定") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<src6.length;i++){
					wxsmart[i]=Integer.parseInt(casetime[i].getText());
				}
				jframe.dispose();
			}
		});
		button.setBounds(100, 550, 100, 30);
		pane.add(button);
		JScrollPane scroll = new JScrollPane(pane);
		jframe.add(scroll);
	}
}
