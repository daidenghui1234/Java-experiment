package 一.英语单词拼写训练;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Game extends JFrame implements FocusListener, KeyListener {
	TextField tf;
	JPanel pane1, pane2, pane3;
	JLabel lab1, lab2, lab3;
	JButton bu, temp;
	JButton[] bx = new JButton[10];
	String str, st;
	int n = 0;
	char c;
	char[] s;

	Game() {
		tf = new TextField(10);
		lab1 = new JLabel("请输入一个英文单词");
		lab2 = new JLabel("用鼠标单击字母，按左右箭头交换字母，将其排列成所输入的单词");
		bu = new JButton("确定");
		bu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change1(e);
			}
		});
		pane1 = new JPanel();
		pane1.add(lab1);
		pane1.add(tf);
		pane1.add(bu);
		add(pane1, BorderLayout.NORTH);
		pane2 = new JPanel();
		pane2.add(lab2);
		add(pane2, BorderLayout.SOUTH);
	}

	public void change1(ActionEvent e) {
		str = tf.getText();
		n = str.length();
		if (e.getActionCommand().equals("确定")) {
			pane3 = new JPanel();

			// 打乱顺序
			for (int i = 1; i < n; i++) {
				int[] p = new int[n];
				for (i = 0; i < n; i++)
					p[i] = i + 1;
				for (i = 0; i < n; i++) {
					int r = (int) (Math.random() * n);
					int tmp = p[r];
					p[r] = p[i];
					p[i] = tmp;

				}
				Font font = new Font(str, Font.PLAIN, 46);
				for (i = 0; i < n; i++) {
					char c = str.charAt(p[i] - 1);// 取随机字符
					bx[i] = new JButton("" + c);
					bx[i].setPreferredSize(new Dimension(80, 80));// 设置按钮大小
					bx[i].setFont(font);// 设置字体大小
					bx[i].setForeground(Color.black);// 设置字体颜色
					bx[i].addFocusListener(this);
					bx[i].addKeyListener(this);
					pane3.add(bx[i]);
					add(pane3, BorderLayout.CENTER);
				}
			}
			tf.setText(null);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.setBounds(300, 200, 900, 250);
		game.setResizable(false);
		game.setVisible(true);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	// 焦点监听
	public void focusGained(FocusEvent e) {
		for (int i = 0; i < str.length(); i++) {
			if (bx[i] == (JButton) e.getSource()) {
				bx[i].setForeground(Color.red);
			}
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		for (int i = 0; i < str.length(); i++) {
			if (bx[i] == (JButton) e.getSource()) {
				bx[i].setForeground(Color.black);
			}
		}
	}

	public void keyPressed(KeyEvent e) {
		for (int i = 0; i < str.length(); i++) {
			if (bx[i] == (JButton) e.getSource()) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					go(i, "left");
					char[] str2 = new char[n];
					for (int k = 0; k < n; k++) {
						str2[k] = bx[k].getText().charAt(0);
					}
					String s1 = new String(str2);
					if (s1.equals(str)) {
						lab2.setText("恭喜你，你成功了！");
						for (int p = 0; p < n; p++) {
							bx[p].setForeground(Color.green);
						}
					}
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					go(i, "right");

					char[] str2 = new char[n];
					for (int k = 0; k < n; k++) {
						str2[k] = bx[k].getText().charAt(0);
					}
					String s1 = new String(str2);
					if (s1.equals(str)) {
						lab2.setText("恭喜你，你成功了！");
						for (int p = 0; p < n; p++) {
							bx[p].setForeground(Color.green);
						}
					}
				}

			}
		}
	}

	void go(int i, String st1) {
		if (st1.equals("left") && i >= 1) {
			String temp = bx[i].getText();
			String temp1 = bx[i - 1].getText();
			bx[i].setText(temp1);
			bx[i - 1].setText(temp);
		} else if (st1.equals("right") && i <= n - 2) {
			String temp = bx[i].getText();
			String temp1 = bx[i + 1].getText();
			bx[i].setText(temp1);
			bx[i + 1].setText(temp);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}