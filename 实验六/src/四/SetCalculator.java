package 四;
import java.awt.*;
import java.awt.event.*;
public class SetCalculator extends Frame implements ActionListener {
    static SetCalculator frm = new SetCalculator();
    static Button btn1,btn2,btn3,btn4;
    static TextField txt1,txt2,txt3;
    public static void main(String[] args) {
        frm.setTitle("计算器");
        frm.setBounds(900,600,240,200);
        frm.setLayout(new FlowLayout());
        frm.setVisible(true);
        btn1 = new Button("加");
        btn2 = new Button("减");
        btn3 = new Button("乘");
        btn4 = new Button("除");
        btn1.addActionListener(frm);
        btn2.addActionListener(frm);
        btn3.addActionListener(frm);
        btn4.addActionListener(frm);
        txt1 = new TextField(10);
        txt2 = new TextField(10);
        txt3 = new TextField(10);
        txt3.setEditable(false);
        frm.add(txt1);
        frm.add(txt2);
        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.add(btn4);
        frm.add(txt3);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1) {
            int sum;
            sum=Integer.parseInt(txt1.getText())+Integer.parseInt(txt2.getText());
            String Sum=String.valueOf(sum);
            txt3.setText(Sum);
             
            }
        if(e.getSource()==btn2) {
            int sum;
            sum=Integer.parseInt(txt1.getText())-Integer.parseInt(txt2.getText());
            String Sum=String.valueOf(sum);
            txt3.setText(Sum);
             
            }
        if(e.getSource()==btn3) {
            int sum;
            sum=Integer.parseInt(txt1.getText())*Integer.parseInt(txt2.getText());
            String Sum=String.valueOf(sum);
            txt3.setText(Sum);
             
            }
        if(e.getSource()==btn4) {
            int sum;
            sum=Integer.parseInt(txt1.getText())/Integer.parseInt(txt2.getText());
            String Sum=String.valueOf(sum);
            txt3.setText(Sum);
             
            }
    }
 
}