import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class subnet_calc extends JFrame implements ActionListener{
	
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JTextField ip1;
	private JTextField ip2;
	private JTextField ip3;
	private JTextField ip4;
	private JTextField broadcastAddress;
	private JTextField cidrValue;
	private JTextField hostsPSubnet;
	private JTextField networkAddress;
	private JTextField networkClass;
	private JTextField noSubnets;
	private JTextField subnetMask;
	private JButton resetBtn;
	private JButton calcBtn;

	subnet_calc(){
		init_Calc();
		setTitle("SubNet Calculator");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(new java.awt.Dimension(642, 345));
		setVisible(true);
	}

	private void init_Calc(){

		jLabel1=new JLabel("IP Address");
		jLabel2=new JLabel("CIDR values        /");
		jLabel3=new JLabel("Subnet Mask");
		jLabel4=new JLabel("Network Address");
		jLabel5=new JLabel("Broadcast Address");
		jLabel6=new JLabel("Number of Subnets");
		jLabel7=new JLabel("Hosts Per Subnet");
		jLabel8=new JLabel("Network Class");
		jLabel9=new JLabel("SubNet Calculator");
		jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24));

        ip1=new JTextField(3);
        ip2=new JTextField(3);
        ip3=new JTextField(3);
        ip4=new JTextField(3);

        networkClass=new JTextField(3);
        subnetMask=new JTextField(18);
        networkAddress=new JTextField(18);
        broadcastAddress=new JTextField(18);
        noSubnets=new JTextField(18);
        hostsPSubnet=new JTextField(18);
        cidrValue = new JTextField(2);

        calcBtn=new JButton("Calculate");
        calcBtn.addActionListener(this);

        resetBtn=new JButton("Reset");
        resetBtn.addActionListener(this);


		JPanel north=new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel center=new JPanel(new GridLayout(4,2));
		JPanel south=new JPanel(new FlowLayout(FlowLayout.CENTER,50,5));

		north.add(jLabel9);

		JPanel center11=new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		center11.add(jLabel1);
		center11.add(ip1);
		center11.add(ip2);
		center11.add(ip3);
		center11.add(ip4);

		JPanel center12=new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		center12.add(jLabel2);
		center12.add(cidrValue);

		JPanel center21=new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		center21.add(jLabel3);
		center21.add(subnetMask);

		JPanel center22=new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		center22.add(jLabel8);
		center22.add(networkClass);

		JPanel center31=new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		center31.add(jLabel4);
		center31.add(networkAddress);

		JPanel center32=new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		center32.add(jLabel6);
		center32.add(noSubnets);

		JPanel center41=new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		center41.add(jLabel5);
		center41.add(broadcastAddress);

		JPanel center42=new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		center42.add(jLabel7);
		center42.add(hostsPSubnet);
		
		center.add(center11);
		center.add(center12);
		center.add(center21);
		center.add(center22);
		center.add(center31);
		center.add(center32);
		center.add(center41);
		center.add(center42);

		south.add(calcBtn);
		south.add(resetBtn);


		setLayout(new BorderLayout());
		add(new JPanel(new FlowLayout(FlowLayout.CENTER,20,5)),BorderLayout.EAST);
		add(north,BorderLayout.NORTH);
		add(center,BorderLayout.CENTER);
		add(south,BorderLayout.SOUTH);
		add(new JPanel(new FlowLayout(FlowLayout.CENTER,20,5)),BorderLayout.WEST);
	}

	public void actionPerformed(ActionEvent evt){
		if (evt.getSource()==calcBtn){
			int ip1_int = Integer.parseInt(ip1.getText().toString());
			int ip2_int = Integer.parseInt(ip2.getText().toString());
			int ip3_int = Integer.parseInt(ip3.getText().toString());
			int ip4_int = Integer.parseInt(ip4.getText().toString());

			if(ip1_int>=0 && ip1_int<256 && ip2_int>=0 && ip2_int<256 && ip3_int>=0 && ip3_int<256 && ip4_int>=0 && ip4_int<256){

				int cidr_int = Integer.parseInt(cidrValue.getText().toString());

				String s="";

				switch(cidr_int){
					case 1:		s="128.0.0.0";	break;
					case 2:		s="192.0.0.0";	break;
					case 3:		s="224.0.0.0";	break;
					case 4:		s="240.0.0.0";	break;
					case 5:		s="248.0.0.0";	break;
					case 6:		s="252.0.0.0";	break;
					case 7:		s="254.0.0.0";	break;
					case 8:		s="255.0.0.0";	break;
					case 9:		s="255.128.0.0";	break;
					case 10:	s="255.192.0.0";	break;
					case 11:	s="255.224.0.0";	break;
					case 12:	s="255.240.0.0";	break;
					case 13:	s="255.248.0.0";	break;
					case 14:	s="255.252.0.0";	break;
					case 15:	s="255.254.0.0";	break;
					case 16:	s="255.255.0.0";	break;
					case 17:	s="255.255.128.0";	break;
					case 18:	s="255.255.192.0";	break;
					case 19:	s="255.255.224.0";	break;
					case 20:	s="255.255.240.0";	break;
					case 21:	s="255.255.248.0";	break;
					case 22:	s="255.255.252.0";	break;
					case 23:	s="255.255.254.0";	break;
					case 24:	s="255.255.255.0";	break;
					case 25:	s="255.255.255.128";	break;
					case 26:	s="255.255.255.192";	break;
					case 27:	s="255.255.255.224";	break;
					case 28:	s="255.255.255.240";	break;
					case 29:	s="255.255.255.248";	break;
					case 30:	s="255.255.255.252";	break;
					case 31:	s="255.255.255.254";	break;
					case 32:	s="255.255.255.255";	break;
					default:	cidrValue.setText("Invalid");
				}
				subnetMask.setText(s);

				if(ip1_int>=0 && ip1_int <128){
					networkClass.setText("A");
					networkAddress.setText(ip1.getText()+".0.0.0");
				}
				if(ip1_int>=128 && ip1_int <192){
					networkClass.setText("B");
					networkAddress.setText(ip1.getText()+"."+ip2.getText()+".0.0");
				}
				if(ip1_int>=192 && ip1_int <224){
					networkClass.setText("C");
					networkAddress.setText(ip1.getText()+"."+ip2.getText()+"."+ip3.getText()+".0");
				}
				if(ip1_int>=224 && ip1_int <240)	networkClass.setText("D");
				if(ip1_int>=240 && ip1_int <255)	networkClass.setText("E");

				broadcastAddress.setText(ip1.getText()+"."+ip2.getText()+"."+ip3.getText()+".255");

				int op=(int) Math.pow(2,(32-cidr_int));
				hostsPSubnet.setText(""+op);

				noSubnets.setText(""+(op/cidr_int));
			}
			else 	JOptionPane.showMessageDialog(null,"Please enter missing value!!!");
		}
		else if(evt.getSource()==resetBtn){
			ip1.setText("");
			ip2.setText("");
			ip3.setText("");
			ip4.setText("");

			cidrValue.setText("");
			subnetMask.setText("");
			networkAddress.setText("");
			networkClass.setText("");
			broadcastAddress.setText("");
			noSubnets.setText("");
			hostsPSubnet.setText("");
		}
	}

	public static void main(String a[]){
		subnet_calc s=new subnet_calc();
	}
}