/**
 * 
 */
package com.client.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import com.client.business.resourceManager.ResourceManager;
import com.client.business.uiManager.ComboBoxRenderer;
import com.client.business.uiManager.Register;
import com.common.UserInfoBean;


/**
 * @author lenovo
 *
 */
public class JRegisterFrm extends JFrame implements ActionListener,ItemListener{

	 BackgroundPanel contentPanel = new BackgroundPanel();

	JButton btn_OK;
	JButton btn_Cancel;
	JFrame frame;
	JTextField name;
	JTextArea sign;
	JRadioButton sex_man,sex_woman;
	JComboBox year,month,day;  //生日
	JComboBox constellation; //星座
	JTextField bloodType;  //血型
	JTextField diploma;  //学历
	JTextField telephone;  //电话
	JTextField email;  //电子邮箱
	JTextField address; //地址
	JPasswordField password;
	JPasswordField resure_password;
	UserInfoBean user= new UserInfoBean();
	//标签
	
	JLabel l_name;
	JLabel l_password;
	JLabel l_repassword;
	JLabel l_sex;
	JLabel l_bir;
	JLabel l_xz;
	JLabel l_pho;
	JLabel l_bloodType;
	JLabel l_email;
	JLabel l_adr;
	JLabel l_xl;
	JLabel l_icon;
	JLabel l_qq;
	JTextField qq;
	
	JButton btn_min,btn_close;
	
	JButton btn_findpwd;
	
	JComboBox comboBox_icon;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	/*	try {
			JRegisterFrm dialog = new JRegisterFrm();
			dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

	/**
	 * Create the dialog.
	 */
	public JRegisterFrm(JFrame frame) {
		this.frame=frame;
		
		setUndecorated(true);
		setResizable(false);
		setBounds(500, 50, 500, 524);
		{
			l_icon=new JLabel("头像");
			l_icon.setFont(new java.awt.Font("楷体",0,18));
			l_icon.setBounds(40,130,100,20);
			l_icon.setVisible(true);
			contentPanel.add(l_icon);
		}
		{
			Map<String,ImageIcon> content=new LinkedHashMap<String,ImageIcon>();
			int num=0;int n=0;;
			for(int i=1;i<100;i++){
				String str_headicon="image/Head/"+i+".gif";
				content.put(""+i, new ImageIcon(str_headicon));
			//	System.out.println(str_headicon);
				
			}
			comboBox_icon=new JComboBox(content.keySet().toArray());
			comboBox_icon.setBounds(5, 150, 120, 100);
			comboBox_icon.setOpaque(false);
			ComboBoxRenderer renderer=new ComboBoxRenderer(content);
			comboBox_icon.setRenderer(renderer);
			comboBox_icon.setMaximumRowCount(3);
			contentPanel.add(comboBox_icon);
			
		}
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			l_qq=new JLabel("  QQ号码:");
			l_qq.setFont(new java.awt.Font("楷体",0,18));
			l_qq.setBounds(140, 150,100,20);
			l_qq.setVisible(false);
			contentPanel.add(l_qq);
		}
		{//qq号码编辑框
			qq = new JTextField();
			qq.setBounds(230,145,200,30);
			qq.setForeground(Color.green);
			qq.setFont(new Font("楷体",2,22));
			qq.setVisible(false);
			
			qq.addKeyListener(new KeyListener(){

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					int keyChar=e.getKeyChar();
					if (keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9) {
						
					} else {
						e.consume();  
					}
				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			
			contentPanel.add(qq);
			
		}
		{//找回密码按钮
			btn_findpwd = new JButton();
			btn_findpwd.setFont(new java.awt.Font("楷体",1,18));
			btn_findpwd.setBounds(223, 464,181,49);
			btn_findpwd.setContentAreaFilled(false);;
			contentPanel.add(btn_findpwd);
			btn_findpwd.setVisible(false);
			btn_findpwd.addActionListener(this); //添加事件处理
		}
		
		
		
		
		
		{//用户名标签
		
			String str_gm = "    昵称:";
			l_name = new JLabel(str_gm);
			l_name.setFont(new java.awt.Font("楷体",0,18));
			l_name.setBounds(140, 80,100,20);
			contentPanel.add(l_name);
		}
		{//密码标签
			
			String str_gm = "    密码:";
			l_password = new JLabel(str_gm);
			l_password.setFont(new java.awt.Font("楷体",0,18));
			l_password.setBounds(140,115,100,20);
			contentPanel.add(l_password);
		}

		{//确认密码标签
			
			String str_gm = "确认密码:";
			l_repassword = new JLabel(str_gm);
			l_repassword.setFont(new java.awt.Font("楷体",0,18));
			l_repassword.setBounds(140,150,100,20);
			contentPanel.add(l_repassword);
		}
		
		
		{//性别标签
			l_sex= new JLabel("    性别:");
			l_sex.setFont(new java.awt.Font("楷体",0,18));
			l_sex.setBounds(140,185,100,20);
			contentPanel.add(l_sex);
		}
		{//生日标签
			l_bir=new JLabel("    生日:");
			l_bir.setFont(new java.awt.Font("楷体",0,18));
			l_bir.setBounds(140,220,100,20);
			contentPanel.add(l_bir);
		}
		
		{//星座标签
			l_xz = new JLabel("    星座:");
			l_xz.setFont(new java.awt.Font("楷体",0,18));
			l_xz.setBounds(140,255,100,20);
			contentPanel.add(l_xz);
		}
		{//学历标签
			l_xl= new JLabel("    学历:");
			l_xl.setFont(new java.awt.Font("楷体",0,18));
			l_xl.setBounds(140,290,100,20);
			contentPanel.add(l_xl);
		}
		{//血型
			l_bloodType = new JLabel("    血型:");
			l_bloodType.setFont(new java.awt.Font("楷体",0,18));
			l_bloodType.setBounds(140,325,100,20);
			contentPanel.add(l_bloodType);
		}
		{//电话标签
			l_pho= new JLabel("    电话:");
			l_pho.setFont(new java.awt.Font("楷体",0,18));
			l_pho.setBounds(140,360,100,20);
			contentPanel.add(l_pho);
		}
		
		
		{//电子邮箱标签
			l_email = new JLabel("电子邮箱:");
			l_email.setFont(new java.awt.Font("楷体",0,18));
			l_email.setBounds(140,395,100,20);
			contentPanel.add(l_email);
		}
		{//所在地标签
			l_adr= new JLabel("  所在地:");
			l_adr.setFont(new java.awt.Font("楷体",0,18));
			l_adr.setBounds(140,420,100,20);
			contentPanel.add(l_adr);
		}
			
		{//用户名输入框			
			name = new JTextField();
			name.setBounds(230,75,200,30);
			name.setForeground(Color.green);
			name.setFont(new Font("楷体",2,22));
			contentPanel.add(name);
		}
		
		{//密码输入框			
			password = new JPasswordField();
			password.setBounds(230,110,200,30);	
			password.setFont(new Font("宋体",0,14));
			contentPanel.add(password);
		}
			{//密码输入框			
			resure_password = new JPasswordField();
			resure_password.setBounds(230,145,200,30);	
			resure_password.setFont(new Font("宋体",0,14));
			contentPanel.add(resure_password);
		}
		{//性别
			sex_man = new JRadioButton("男");
			sex_woman= new JRadioButton("女");
			sex_man.setOpaque(false);
			sex_woman.setOpaque(false);
			sex_man.setFont(new Font("楷体",0,16));
			sex_woman.setFont(new Font("楷体",0,16));
			sex_man.setBounds(230,180,60,30);
			sex_woman.setBounds(305,180,60,30);
			sex_man.addActionListener(this);
			sex_woman.addActionListener(this);
			contentPanel.add(sex_man);
			contentPanel.add(sex_woman);
			
			sex_man.setSelected(true);
			user.setSex("男");
		}
		{//生日	
			int i;
			year = new JComboBox();
			for(i=2014;i>1894;i--){
				year.addItem(""+i+"年");
			}
			year.setBounds(230,215,70,30);
			year.setOpaque(false);
			year.setFont(new Font("楷体",0,14));
			month = new JComboBox();
			for(i=1;i<13;i++){
				month.addItem(""+i+"月");
			}
			month.setBounds(310,215,55,30);
			month.setOpaque(false);
			month.setFont(new Font("楷体",0,14));
			day = new JComboBox();
			for(i=1;i<32;i++){
				day.addItem(""+i+"日");
			}
			day.setBounds(375,215,55,30);
			day.setOpaque(false);
			day.setFont(new Font("楷体",0,14));
			contentPanel.add(year);
			contentPanel.add(month);
			contentPanel.add(day);
			}
		{//星座
			constellation= new JComboBox();
			constellation.addItem("白羊座(3.21-4.19)");
			constellation.addItem("金牛座(4.20-5.20)");
			constellation.addItem("双子座(5.21-6.21)");
			constellation.addItem("巨蟹座(6.21-7.22)");
			constellation.addItem("狮子座(7.23-8.22)");
			constellation.addItem("处女座(8.23-9.22)");
			constellation.addItem("天秤座(9.23-10.23)");
			constellation.addItem("天蝎座(10.24-11.22)");
			constellation.addItem("射手座(11.23-12.21)");
			constellation.addItem("魔蝎座(12.22-1.19)");
			constellation.addItem("水瓶座(1.20-2.18)");
			constellation.addItem("双鱼座(2.21-3.20)");
			constellation.setFont(new Font("楷体",0,14));
			constellation.setBounds(230,250,200,30);
			contentPanel.add(constellation);
		}
		{//学历
			diploma = new JTextField();
			diploma.setBounds(230,285,200,30);
			diploma.setFont(new Font("楷体",0,14));
			contentPanel.add(diploma);
		}
		{
			bloodType = new JTextField();
			bloodType.setBounds(230,320,200,30);
			bloodType.setFont(new Font("楷体",0,14));
			contentPanel.add(bloodType);
		}
		{
			telephone = new JTextField();
			telephone.setBounds(230,355,200,30);
			telephone.setFont(new Font("楷体",0,14));
			telephone.addKeyListener(new KeyListener(){

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					int keyChar=e.getKeyChar();
					if (keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9) {
						
					} else {
						e.consume();  
					}
				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			contentPanel.add(telephone);
			
		}
		{
			email= new JTextField();
			email.setBounds(230,390,200,30);
			email.setFont(new Font("楷体",0,14));
			contentPanel.add(email);
		}
		{
			address= new JTextField();
			address.setBounds(230,430,200,30);
			address.setFont(new Font("楷体",0,14));
			contentPanel.add(address);
		}
			/*	*/
		
		{//登录按钮
			btn_OK = new JButton();
			btn_OK.setFont(new java.awt.Font("楷体",1,18));
			btn_OK.setBounds(223, 464,181,49);
			btn_OK.setContentAreaFilled(false);;
			contentPanel.add(btn_OK);
			btn_OK.addActionListener(this); //添加事件处理
		}
		
	/*	{//取消按钮
		    btn_Cancel = new JButton("取消");
		    btn_Cancel.setFont(new java.awt.Font("楷体",1,18));
		    btn_Cancel.setBounds(270,350,80,40);
			contentPanel.add(btn_Cancel);	
			btn_Cancel.addActionListener(this);//添加事件处理
		}
		*/
	//	setContentPane(contentPanel);
		//contentPanel.setLayout(new BorderLayout());
		
		
		
		
		{//最小化
			btn_min=new JButton();
			btn_min.setBounds(425,0,35,28);
			btn_min.setContentAreaFilled(false);
			contentPanel.add(btn_min);	
			btn_min.addActionListener(this);//添加事件处理
			
		}
		{//关闭窗体
			btn_close=new JButton();
			btn_close.setBounds(460,0,35,28);
			btn_close.setContentAreaFilled(false);
			contentPanel.add(btn_close);	
			btn_close.addActionListener(this);//添加事件处理
			
		}
		
		contentPanel.setLayout(null);
		contentPanel.addMouseMotionListener(new MouseAdapter() {
		    private Point draggingAnchor = null;
            @Override
            public void mouseMoved(MouseEvent e) {
            	draggingAnchor = new Point(e.getX() + contentPanel.getX(), e.getY() + contentPanel.getY());
            	
           
            }
            
            @Override
            public void mouseDragged(MouseEvent e) {
            	setLocation(e.getLocationOnScreen().x - draggingAnchor.x, e.getLocationOnScreen().y - draggingAnchor.y);
            }
	});
	
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(false);
	}
	public void closeWindows(){
		frame.setVisible(true);
		this.dispose();
	}
	//按钮响应事件
		public void actionPerformed(ActionEvent e){
			Object source = e.getSource();
			if(source == btn_OK){  
				if(name.getText().compareTo("")==0){
					JOptionPane.showMessageDialog(null, "昵称不能为空");
					
				}else if(password.getText().compareTo("")==0&&resure_password.getText().compareTo("")==0){
					JOptionPane.showMessageDialog(null, "密码不能为空");
					System.out.println(password.getPassword());
				}else if(!Arrays.equals(password.getPassword(), resure_password.getPassword())){
					JOptionPane.showMessageDialog(null, "两次密码不一样");
				}else{
					user.setNickName(name.getText());
					String pwd = new String(password.getPassword());
					user.setPwd(pwd);
					//获取生日
					StringBuffer sb_day= new StringBuffer(day.getSelectedItem().toString());
					sb_day.deleteCharAt(sb_day.length()-1);
					StringBuffer sb_year=new StringBuffer(year.getSelectedItem().toString());
					StringBuffer sb_month = new StringBuffer(month.getSelectedItem().toString());
					sb_month.deleteCharAt(sb_month.length()-1);
;					sb_year.deleteCharAt(sb_year.length()-1);
					String bir=sb_year+"-"+sb_month+"-"+sb_day;
					user.setBirthday(bir);
					System.out.println(bir);
					
					//
					user.setBloodType(bloodType.getText().trim());
					user.setDiploma(diploma.getText().trim());
					user.setConstellation(constellation.getSelectedItem().toString());
					user.setAddress(address.getText().trim());
					user.setTelephone(telephone.getText().trim());
					user.setEmail(email.getText().trim());
					user.setSign("我刚申请了QQ,欢迎大家加我QQ!");
					user.setPhotoID(comboBox_icon.getSelectedIndex()+1);
					
					String str = user.getNickName() + ":"
							+ user.getPwd()+ ":"
							+ user.getBirthday()+":"
							+ user.getSex()+":"
							+ user.getDiploma()+":"
							+ user.getBloodType()+":"
							+ user.getConstellation()+":"
							+ user.getEmail()+":"
							+ user.getAddress();
					System.out.println(str);
					
					JGetBackPwdFrm jGBP = new JGetBackPwdFrm(user,false,this);					
					
				}
			}
			else if(source == btn_Cancel){    //退出主窗口，并释放资源	
				frame.setVisible(true);
				this.dispose();
			}else if(source == btn_close){
				frame.setVisible(true);
				this.dispose();
			}else if(source == btn_min){
				setExtendedState(JFrame.ICONIFIED);
			}else if(source==sex_man){
				sex_woman.setSelected(false);
				user.setSex("男");
			}else if(source==sex_woman){
				sex_man.setSelected(false);
				user.setSex("女");
			}else if(source==btn_findpwd){
				UserInfoBean user1= new UserInfoBean();
				
			}
		}
		class BackgroundPanel extends JPanel
		{

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			public String knight ; //要加载的图片资源的文件名
			public BackgroundPanel(){
				knight= "register";
			}
			public void setbk()
			{
				
			}
			//重写绘制组件方法
			public void paintComponent(Graphics g)
			{
			int x = 0,y = 0;
			
			//调用资源管理类中的加载图片资源方法，来加载背景图片
			ResourceManager imageResource = new ResourceManager();
			ImageIcon icon = new ImageIcon();
			icon = imageResource.GetImage(knight);
			//绘制窗口
			g.drawImage(icon.getImage(),x,y,icon.getIconWidth(),icon.getIconHeight(),this);
			}
			
		}
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
		}	
}
