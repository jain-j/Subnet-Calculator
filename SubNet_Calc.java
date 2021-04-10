import javax.swing.*;
import java.awt.event.*;

class SubNet_Calc extends JFrame{
	
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

	SubNet_Calc(){
		init_Calc();
		setTitle("SubNet Calculator");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(new java.awt.Dimension(642, 345));
        setLocationRelativeTo(null);
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
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18));
        
        ip1=new JTextField(3);
        ip2=new JTextField(3);
        ip3=new JTextField(3);
        ip4=new JTextField(3);

        networkClass=new JTextField();
        subnetMask=new JTextField();
        networkAddress=new JTextField();
        broadcastAddress=new JTextField();
        noSubnets=new JTextField();
        hostsPSubnet=new JTextField();
        cidrValue = new JTextField(2);

        calcBtn=new JButton("Calculate");
        calcBtn.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent evt){
        			calcBtnActionPerformed(evt);
        		}
        });

        resetBtn=new JButton("Reset");
        resetBtn.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent evt){
        			resetBtnActionPerformed(evt);
        		}
        });

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);

		layout.setHorizontalGroup(
			layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(57, 57, 57)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
							.addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jLabel6, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(subnetMask)
                            .addComponent(networkAddress)
                            .addComponent(broadcastAddress)
                            .addComponent(noSubnets)
                            .addComponent(hostsPSubnet, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calcBtn, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(resetBtn, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(networkClass, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ip1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ip2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ip3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ip4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cidrValue, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
        )	)	)	)	)	);
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(ip1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ip2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ip3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ip4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addComponent(cidrValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkClass, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(subnetMask, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkAddress, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(broadcastAddress, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(noSubnets, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostsPSubnet, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );
	}

	private void calcBtnActionPerformed(ActionEvent evt){
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
		}else{
			JOptionPane.showMessageDialog(null,"Please enter missing value!!!");
		}
	}

	private void resetBtnActionPerformed(ActionEvent evt){
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

	public static void main(String a[]){

		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run(){
				new SubNet_Calc();
			}
		});
	}
}