package 二;

/**
 *  电子相册
 */

import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;
 
public class MyImg extends JFrame{
	TestPanel tp=null;
	JPanel jp=null;
	JButton jb1,jb2,jb3,jb4;
	public static void main(String[] args) {
		MyImg img=new MyImg();
	}
	public MyImg(){
		tp=new TestPanel(6, 1);//设置相夹大小，并默认显示第一张照片
		
		jp=new JPanel();//JPanel默认流式布局
		jb1=new JButton("首页");
		jp.add(jb1);
		jb2=new JButton("上一页");
		jp.add(jb2);
		jb3=new JButton("下一页");
		jp.add(jb3);
		jb4=new JButton("尾页");
		jp.add(jb4);
		
		//注册监听
		jb1.addActionListener(tp);
		jb1.setActionCommand("first");
		jb2.addActionListener(tp);
		jb2.setActionCommand("prev");
		jb3.addActionListener(tp);
		jb3.setActionCommand("next");
		jb4.addActionListener(tp);
		jb4.setActionCommand("last");
		
		this.add(tp);//JFrame默认边框布局
		this.add(jp,BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
 
}
class TestPanel extends JPanel implements ActionListener{
	int i,size;
	String imgPath,srcPath="/myTest/";//相片路径
	String imgSuffix=".jpg";//图片后缀名
	public TestPanel(int size,int i){
		this.size=size;
		this.i=i;
		imgPath=srcPath+i+imgSuffix;
	}
	public void paint(Graphics g){
		super.paint(g);
		Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource(imgPath));
		g.drawImage(im, 90, 45, 200, 150,this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("first")){
			i=1;
			this.imgPath=srcPath+i+imgSuffix;
		}else if(e.getActionCommand().equals("prev")){
			if(i>1){//判断是否越界
				--i;
				this.imgPath=srcPath+i+imgSuffix;
			}
		}else if(e.getActionCommand().equals("next")){
			if(i<size){//判断是否越界
				++i;
				this.imgPath=srcPath+i+imgSuffix;
			}
		}else if(e.getActionCommand().equals("last")){
			i=size;
			this.imgPath=srcPath+i+imgSuffix;
		}
		//System.out.println(imgPath);
		this.repaint();//TestPanel重绘
	}
	
}