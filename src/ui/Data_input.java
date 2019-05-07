package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import config.Datainput;

public class Data_input  extends Datainput {
	
	
	public Data_input() throws Exception{
		final JFrame jframe = new JFrame("数据输入(以空格做分隔)");
		jframe.setBounds(305, 0, 800, 600);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		JPanel pane = new JPanel();
		writehashmap();
		JLabel[] casename = new JLabel[m];
		final JTextField[] casepara = new JTextField[m];
		GridLayout gridLayout = new GridLayout(0, 1, 0, 0);
		pane.setLayout(gridLayout);
		for(int i=1;i<m;i++){
			//case名称
			casename[i] = new JLabel("case"+casedesc[i]);
			pane.add(casename[i]);
			//case次数
			casepara[i] = new JTextField();
			casepara[i].setEditable(true);
			String ss ="";
			for(int x=0;x<secondmap.get(i).length;x++){
				ss =ss + String.valueOf(secondmap.get(i)[x])+" ";
				casepara[i].setText(ss);
			}
			pane.add(casepara[i]);
		}
		
		
		JButton button=new JButton(new AbstractAction("确定") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=1;i<m;i++){
					firstmap.put(i, casepara[i].getText().split(" "));
					try {
						readhashmap();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				jframe.dispose();
			}
		});
		pane.add(button);
		JScrollPane scroll = new JScrollPane(pane);
		jframe.add(scroll);
	}

}
