package 一.算数测试;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComputerFrame extends JFrame {
	JMenuBar menubar;
	JMenu choiceGrade;
	JMenuItem grade1, grade2;
	JTextField textOne, textTwo, textResult;
	JButton getProblem, giveAnswer;
	JLabel operatorLabel, message;
	Teacher teacherzhang;

	ComputerFrame() {
		teacherzhang = new Teacher();
		teacherzhang.setMaxInteger(20);
		setLayout(new FlowLayout());
		menubar = new JMenuBar();
		choiceGrade = new JMenu("选择级别");
		grade1 = new JMenuItem("幼儿级别");
		grade2 = new JMenuItem("儿童级别");
		grade1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherzhang.setMaxInteger(10);
			}
		});
		grade2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherzhang.setMaxInteger(50);
			}
		});
		choiceGrade.add(grade1);
		choiceGrade.add(grade2);
		menubar.add(choiceGrade);
		setJMenuBar(menubar);
		textOne = new JTextField(5);
		textTwo = new JTextField(5);
		textResult = new JTextField(5);
		operatorLabel = new JLabel("+");
		operatorLabel.setFont(new Font("Arial", Font.BOLD, 20));
		message = new JLabel("你还没有回答");
		getProblem = new JButton("获取题目");
		giveAnswer = new JButton("确认答案");
		add(textOne);
		add(operatorLabel);
		add(textTwo);
		add(new JLabel("="));
		add(textResult);
		add(giveAnswer);
		add(message);
		add(getProblem);
		textResult.requestFocus();
		textOne.setEditable(false);
		textTwo.setEditable(false);
		getProblem.setActionCommand("getProblem");
		textResult.setActionCommand("answer");
		giveAnswer.setActionCommand("answer");
		teacherzhang.setJTextField(textOne, textTwo, textResult);
		teacherzhang.setJLabel(operatorLabel, message);
		getProblem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherzhang.actionPerformed(e);
			}
		});
		giveAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherzhang.actionPerformed(e);
			}
		});
		textResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherzhang.actionPerformed(e);
			}
		});
		setVisible(true);
		validate();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

}