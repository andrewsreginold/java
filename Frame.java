package com.gui;
import javax.swing.*;
	public class Frame extends JFrame{
       
	
		JMenuBar bar;
		
		JMenu file,edit,window;
		JMenuItem New,Save,Saveas,cut,copy,paste;
		JTabbedPane jtb;
		JLabel jl;
		JTextField jf1,jf2;
		JTextArea ja;
		JCheckBox jc1,jc2;
		JRadioButton jb1,jb2;
		JList jli1,jli2,jli3;
		DefaultListModel dlm;
		JComboBox jco1;
		JButton jbu,jbu1,jbu2,jbu3;
		JOptionPane jop;
		
		public Frame ()
		{
			//bar 
	 bar=new JMenuBar();
	 JPanel jp=new JPanel();  
	 add(jp);
	 //menu
	    file=new JMenu("file");
	    edit=new JMenu("edit");
	    window=new JMenu("window");
	   
	    //tabbedpane
	 	   
	    //menu
	    bar.add(file);
	    bar.add(edit);
	    bar.add(window);
	    
	    //menuitem
	    New=new JMenuItem("New");
	    Save=new JMenuItem("save");
	    Saveas=new JMenuItem("saveas");
	    cut=new JMenuItem("cut");
	    copy=new JMenuItem("copy");
	    paste=new JMenuItem("paste");
	    file.add(New);
	    file.add(Save);
	    file.add(Saveas);
	    edit.add(cut);
	    edit.add(copy);
	    edit.add(paste);
	    
	    jl=new JLabel("welcome to interface");
	   jp.add(jl); 
	  
	   jf1=new JTextField("enter text1");
	   jf2=new JTextField("enter your password");
	   System.out.println();
	   jp.add(jf1);
	   jp.add(jf2);
	   
	   
	   ja=new JTextArea(3,20);
	   jp.add(ja);
	   ja.setText("");
	   
	   jc1=new JCheckBox("checkbox1");
	   jc2=new JCheckBox("checkbox2");
	   jp.add(jc1);
	   jp.add(jc2);
	   
	   
	   jb1=new JRadioButton("radiobutton1");
	   jb2=new JRadioButton("radiobutton2");
	   jp.add(jb1);
	   jp.add(jb2);
	   
	   
	   jli1=new JList();
	   dlm=new DefaultListModel();
	   dlm.addElement("list1");
	   dlm.addElement("list2");
	   dlm.addElement("list3");
	   dlm.addElement("list4");
	   jli1.setModel(dlm);
	   jp.add(jli1);
	   
	   
	   
	   jtb=new JTabbedPane(JTabbedPane.BOTTOM);
	    jp.add(jtb);
	   
	    jtb.add("tab1",null);
	    jtb.add("tab2",null);
	    jtb.setSize(100, 100);


		  jco1=new JComboBox();
		   jco1.addItem("apple");
		   jco1.addItem("orange");
		   jco1.addItem("pineapple");
		   jco1.addItem("grapes");
		   
		   jp.add(jco1);
		   
		 setJMenuBar(bar);
	    setTitle("welcome");
	    setSize(300,300);
	    setVisible(true);
	    
	    
	    jbu=new JButton("apple");
	    jbu1=new JButton("orange");
	    jbu2=new JButton("fruit");
	    jbu3=new JButton("vegetable");
	    jp.add(jbu);
	    jp.add(jbu1);
	    jp.add(jbu2);
	    jp.add(jbu3);
	    		
	    
	 		 jop=new JOptionPane ();
	 		 jop.showConfirmDialog(this, "Do you want to exit","Shutting down...",jop.YES_NO_CANCEL_OPTION,jop.WARNING_MESSAGE);
	 		 //jp.add(jop);
	 		   
		}
		
		
		
		
		public static void main(String []args)
		{
			Frame i=new Frame();
			
			
		}
	}

