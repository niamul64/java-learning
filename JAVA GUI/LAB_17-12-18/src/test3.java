import javax.swing.*;

import com.sun.java.accessibility.util.AccessibilityListenerList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class test3 {
	static JTextField tf;
	static int num=0;
	public static void main(String[] args) {
		JFrame f=new JFrame("My first GUI");
		f.setSize(400,300);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		//Adding Components
		JLabel leb=new JLabel("counter");
		f.add(leb);

		tf= new JTextField("0",25);

		f.add(tf);

		JButton b =new JButton("count up");
		f.add(b);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {


				String x =tf.getText();
				int n=Integer.parseInt(x);
				if(n<100)
					n++;
				x=""+n;

				tf.setText(x);

			}
		});


		JButton c =new JButton("count down");
		f.add(c);
		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String x =tf.getText();
				int n=Integer.parseInt(x);
				if(n>0)
					n--;
				x=""+n;

				tf.setText(x);



			}
		});
		JButton d =new JButton("Reset");
		f.add(d);
		d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				

				tf.setText("0");



			}
		});







		f.setVisible(true);

	}

}
