package 一.布局与日历;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class CalendarFrame extends JFrame implements ActionListener{
	JLabel labelDay[]=new JLabel[42];
	JButton titleName[]=new JButton[7];
	String name[]= {"日","一","二","三","四","五","六"};
	JTextField textOne;
	JButton nextMonth,previousMonth,enter;
	CalendarBean calendar;
	JLabel showMessage=new JLabel("",JLabel.CENTER);
	Label lab1;
	int year=2011,month=2;
	public CalendarFrame() {
		textOne=new JTextField(5);
		JPanel pCenter=new JPanel();
		pCenter.setLayout(new GridLayout(7,7));
		for(int i=0;i<7;i++) {
			titleName[i]=new JButton(name[i]);
			titleName[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
			pCenter.add(titleName[i]);
		}
		for(int i=0;i<42;i++) {
			labelDay[i]=new JLabel("",JLabel.CENTER);
			labelDay[i].setBorder(new SoftBevelBorder(BevelBorder.RAISED));
			pCenter.add(labelDay[i]);
		}
		calendar=new CalendarBean();
		lab1=new Label("年份");
		nextMonth=new JButton("下月");
		previousMonth=new JButton("上月");
		enter=new JButton("确定");
		nextMonth.addActionListener(this);
		previousMonth.addActionListener(this);
		enter.addActionListener(this);
		JPanel pNorth=new JPanel(),pSouth=new JPanel();
		pNorth.add(previousMonth);
		pNorth.add(nextMonth);
		pNorth.add(lab1);
		pNorth.add(textOne);
		pNorth.add(enter);
		pSouth.add(showMessage);
		add(pCenter,BorderLayout.CENTER);
		add(pNorth,BorderLayout.NORTH);
		add(pSouth,BorderLayout.SOUTH);
		setYearAndMonth(year,month);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
	public void setYearAndMonth(int y,int m) {
		calendar.setYear(y);
		calendar.setMonth(m);
		String day[]=calendar.getCalendar();
		for(int i=0;i<42;i++)
			labelDay[i].setText(day[i]);
		showMessage.setText("日历："+calendar.getYear()+"年"+calendar.getMonth()+"月");
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==nextMonth) {
			month=month+1;
			if(month>12)
				month=1;
			calendar.setMonth(month);
			String day[]=calendar.getCalendar();
			for(int i=0;i<42;i++) {
				labelDay[i].setText(day[i]);
			}
		}
		else if(e.getSource()==previousMonth) {
			month=month-1;
			if(month<1)
				month=12;
			calendar.setMonth(month);
			String day[]=calendar.getCalendar();
			for(int i=0;i<42;i++)
				labelDay[i].setText(day[i]);
		}
		else {
			String yea = textOne.getText();
			try {
				year = Integer.parseInt(yea); //把string转成int类型
				calendar.setYear(year);
			} catch (NumberFormatException ee) {
				JOptionPane.showMessageDialog(null, "请输入正确的年份");
			}
		}
		showMessage.setText("日历:"+calendar.getYear()+"年"+calendar.getMonth()+"月");

	}
}