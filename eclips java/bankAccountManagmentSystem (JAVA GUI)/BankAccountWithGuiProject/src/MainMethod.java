import java.util.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;



public class MainMethod extends JFrame {/////////////////////////////////////////////////class starts

	static Scanner scan;
	static Container c;
	static JButton ButWithdrawNEXT,ButDeposit,ButWithdraw,ButBalance ,ButLoginpageLOG, ButGotoHomePage,ButNext,ButLOG,ButNEW_BANK_ACCOUNT,ButSavingAccount,ButCurrentAccount,ButStudentAccount;
	static MainMethod frame;/////////////////   frame 
	static Font fWithdraw,fAfterLogInPage,fLogPage,fLogUserId,fGHP,fleb3,fLOG,fNEW_BANK,fleb1,fAcc,fNext,fleb2;
	static JLabel LebFinalStatus2,LebFinalStatus1,LebMinLim,lebSavingAccountMaaxLimxLim,lebStudentAccountM,lebSuccessful,LebWithdraw,lebLogPass,lebLogUserId,lebWrong,lebFillForm,leb1,leb2,leb3,lebtf1,lebtf2,lebtf3,lebtf4,lebtf5,lebtf6,lebtf7;
	static JTextField tfWithdraw,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tfLogUserId,tfLogPage,tfAfterLogInPage;
	static JPasswordField pass2,pass3,pass1;
	static String newUserId;
	static App getPrintObj ;
	static BankAccountAbstractClass A;

	////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {/////////////////////////////////////////////////main starts
		getPrintObj=new App();
		getPrintObj.getObjectBack();
		frame=new MainMethod();
		frame.homePage();

		////////////////////////////////////      Action
		ButNEW_BANK_ACCOUNT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().removeAll();
				frame.repaint();
				frame.newBankAccountpage();

				ButSavingAccount.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame.getContentPane().removeAll();
						frame.repaint();
						frame.savingAccountPage();
						frame.textFieldCreation();
						ButNext.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								boolean i=false;
								i=frame.checkValidity("SavingAccount");
								if(i) {

									frame.getContentPane().removeAll();
									frame.repaint();
									frame.suuAccountCrePage();
								}

								//								ButGotoHomePage.addActionListener(new ActionListener() {
								//
								//									@Override
								//									public void actionPerformed(ActionEvent arg0) {
								//									
								//									    frame.getContentPane().removeAll();
								//										frame.repaint();
								//										//frame.homePage();
								//										
								//										
								//										
								//									}
								//								});///////////////////////GotoHomePage  button end


							}
						});////////////////////////////////// button Next end

					}
				});////////////////////////////End of saving Account Button
				ButCurrentAccount.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame.getContentPane().removeAll();
						frame.repaint();
						frame.currentAccountPage();
						frame.textFieldCreation();
						ButNext.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								boolean i=false;
								i=frame.checkValidity("CurrentAccount");
								if(i) {
									frame.getContentPane().removeAll();
									frame.repaint();
									frame.suuAccountCrePage();

								}

								//								ButGotoHomePage.addActionListener(new ActionListener() {
								//
								//									@Override
								//									public void actionPerformed(ActionEvent arg0) {
								//									
								//									    frame.getContentPane().removeAll();
								//										frame.repaint();
								//										frame.homePage();
								//										
								//										
								//									}
								//								});///////////////////////GotoHomePage  button end


							}
						});////////////////////////////////// button Next end

					}
				});////////////////////////////End of current Account Button

				ButStudentAccount.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame.getContentPane().removeAll();
						frame.repaint();
						frame.studentAccountPage();
						frame.textFieldCreation();
						ButNext.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								boolean i=false;
								i=frame.checkValidity("StudentAccount");
								if(i) {
									frame.getContentPane().removeAll();
									frame.repaint();
									frame.suuAccountCrePage();
								}

								//								ButGotoHomePage.addActionListener(new ActionListener() {
								//
								//									@Override
								//									public void actionPerformed(ActionEvent arg0) {
								//									
								//									    frame.getContentPane().removeAll();
								//										frame.repaint();
								//										frame.homePage();
								//										
								//										
								//									}
								//								});///////////////////////GotoHomePage  button end

							}
						});////////////////////////////////// button Next end

					}
				});////////////////////////////End of Student Account Button


			}
		});/////////////////////////////////////end of New Bank Account button

		ButLOG.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {



				frame.getContentPane().removeAll();
				frame.repaint();
				frame.logInPage();
				ButLoginpageLOG.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {

						A=getPrintObj.getObject(tfLogUserId.getText());
						try {
							if(A!=null)
							{
								if(A.password.equals(pass1.getText())) {
									frame.getContentPane().removeAll();
									frame.repaint();
									frame.afterLogin();





									ButBalance.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent arg0) {
											tfAfterLogInPage.setText("                                             "+A.accountBalance);

										}
									});/////////////////////////////////////////ButBalance end
										
									
									
									
									
									
									
									
									ButDeposit.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent arg0) {
											frame.getContentPane().removeAll();
											frame.repaint();
											frame.depositPage();
											
											ButWithdrawNEXT.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent arg0) {
													double temp=Double.parseDouble(tfWithdraw.getText());
													A.deposit(temp);
													
													
														frame.getContentPane().removeAll();
														frame.repaint();
														LebFinalStatus1=new JLabel( "Your Present Balance is : "+A.accountBalance);
														LebFinalStatus1.setBounds(100,150,599,40);
														LebFinalStatus1.setFont(fLogUserId);
														frame.add(LebFinalStatus1);
														
														LebFinalStatus2=new JLabel( "Thank You");
														LebFinalStatus2.setBounds(100,250,150,40);
														LebFinalStatus2.setFont(fLogUserId);
														frame.add(LebFinalStatus2);
														
														
														
													
													
												}
											});

										}
									});//////////////////////////////////////////  ButDeposit   end
									
									
									
									
									
									
									
									
									
									
									


									ButWithdraw.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent arg0) {
											frame.getContentPane().removeAll();
											frame.repaint();
											frame.withdrawPage();
											
											ButWithdrawNEXT.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent arg0) {
													double temp=Double.parseDouble(tfWithdraw.getText());
													String result=A.withdraw(temp);
													
													if(result.length()==0)
													{
														frame.getContentPane().removeAll();
														frame.repaint();
														LebFinalStatus1=new JLabel( "Your Present Balance is : "+A.accountBalance);
														LebFinalStatus1.setBounds(100,150,599,40);
														LebFinalStatus1.setFont(fLogUserId);
														frame.add(LebFinalStatus1);
														
														LebFinalStatus2=new JLabel( "Thank You");
														LebFinalStatus2.setBounds(100,250,150,40);
														LebFinalStatus2.setFont(fLogUserId);
														frame.add(LebFinalStatus2);
														
														
														
													}
													else {
														tfAfterLogInPage.setText("Error :"+result);
													}
													
												}
											});

										}
									});/////////////////////////////////////////       Withdraw  end





								}
								else {
									throw new Exception("");
								}

							}
							else {
								throw new Exception("");
							}
						}
						catch(Exception e)
						{
							tfLogPage.setText("Wrong User ID And Password");
						}

					}
				});/////////////////////////////////ButLoginpageLOG end


			}
		});////////////////////////////////////////////////////////////ButLOG end

		frame.addWindowListener(new java.awt.event.WindowAdapter()
		{
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				getPrintObj.printAllAtFile();
			}
		}
				);

		////////////////////////////////////Action


		frame.setVisible(true);

	}/////////////////////////////////////////////////main Ends


	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////



	void homePage()
	{

		fleb1=new Font("Arial",Font.BOLD,40);

		leb1=new JLabel( " UAP BANK ");
		leb1.setBounds(182,100,300,100);
		leb1.setFont(fleb1);
		frame.add(leb1);

		fLOG=new Font("Arial",Font.BOLD,15);
		ButLOG=new JButton("LOG IN");/////////
		ButLOG.setBounds(50,300,200,45);
		ButLOG.setFont(fLOG);
		frame.add(ButLOG);
		fNEW_BANK=new Font("Arial",Font.BOLD,15);
		ButNEW_BANK_ACCOUNT=new JButton("NEW BANK ACCOUNT");/////////
		ButNEW_BANK_ACCOUNT.setBounds(320,300,200,45);
		ButNEW_BANK_ACCOUNT.setFont(fNEW_BANK);
		frame.add(ButNEW_BANK_ACCOUNT);
	}



	void newBankAccountpage(){

		fleb1=new Font("Arial",Font.BOLD,40);
		leb1=new JLabel( " UAP BANK ");
		leb1.setBounds(182,10,300,100);
		leb1.setFont(fleb1);
		frame.add(leb1);
		fleb2=new Font("Arial",Font.BOLD,20);
		leb2=new JLabel( " Select Account type ");
		leb2.setBounds(196,100,400,100);
		leb2.setFont(fleb2);
		frame.add(leb2);

		fAcc=new Font("Arial",Font.BOLD,25);
		ButSavingAccount=new JButton("Saving Account");/////////
		ButSavingAccount.setBounds(150,230,300,50);
		ButSavingAccount.setFont(fAcc);
		frame.add(ButSavingAccount);

		ButStudentAccount=new JButton("Student Account");/////////
		ButStudentAccount.setBounds(150,310,300,50);
		ButStudentAccount.setFont(fAcc);
		frame.add(ButStudentAccount);

		ButCurrentAccount=new JButton("Current Account");/////////
		ButCurrentAccount.setBounds(150,390,300,50);
		ButCurrentAccount.setFont(fAcc);
		frame.add(ButCurrentAccount);

	}

	void  savingAccountPage() {

		lebFillForm =new JLabel( " Fill the form Corrently ");
		lebFillForm.setBounds(2,2,200,20);
		frame.add(lebFillForm);


		fNext=new Font("Arial",Font.BOLD,25);
		ButNext=new JButton("Next");/////////
		ButNext.setBounds(250,500,100,45);
		ButNext.setFont(fNext);
		frame.add(ButNext);

	}

	void  studentAccountPage() {

		lebFillForm =new JLabel( " Fill the form Corrently ");
		lebFillForm.setBounds(2,2,200,20);
		frame.add(lebFillForm);


		fNext=new Font("Arial",Font.BOLD,25);
		ButNext=new JButton("Next");/////////
		ButNext.setBounds(250,500,100,45);
		ButNext.setFont(fNext);
		frame.add(ButNext);

	}
	void  currentAccountPage() {


		lebFillForm =new JLabel( " Fill the form Corrently ");
		lebFillForm.setBounds(2,2,200,20);
		frame.add(lebFillForm);

		fNext=new Font("Arial",Font.BOLD,25);
		ButNext=new JButton("Next");/////////
		ButNext.setBounds(250,500,100,45);
		ButNext.setFont(fNext);
		frame.add(ButNext);

	}

	void textFieldCreation() {
		lebtf1 =new JLabel( "Enter You Full Name :");
		lebtf1.setBounds(15,80,200,30);
		frame.add(lebtf1);
		tf1=new JTextField(100);	
		tf1.setBounds(200,80,350,30);
		frame.add(tf1); 


		lebtf2 =new JLabel( "Enter A Password :");
		lebtf2.setBounds(15,150,200,30);
		frame.add(lebtf2);
		pass2=new JPasswordField(100)	;
		pass2.setBounds(200,150,350,30);
		frame.add(pass2);

		lebtf3 =new JLabel( "Again Enter The Password:");
		lebtf3.setBounds(15,220,200,30);
		frame.add(lebtf3);
		pass3=new JPasswordField(100)	;
		pass3.setBounds(200,220,350,30);
		frame.add(pass3);


		lebtf4 =new JLabel( "Enter Balance : ");
		lebtf4.setBounds(15,300,200,30);
		frame.add(lebtf4);
		tf4=new JTextField(100);	
		tf4.setBounds(200,300,350,30);
		frame.add(tf4);


		lebtf5 =new JLabel( "Enter Address : ");
		lebtf5.setBounds(15,380,200,30);
		frame.add(lebtf5);
		tf5=new JTextField(100);	
		tf5.setBounds(200,380,350,30);
		frame.add(tf5);

		tf6=new JTextField(100);	
		tf6.setBounds(0,450,600,25);
		tf6.setEnabled( false );
		frame.add(tf6);

	}





	public MainMethod() {
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("BANK");
		setResizable(false);

	}



	void suuAccountCrePage() {
		fleb3=new Font("Arial",Font.BOLD,30);
		leb3=new JLabel( "Account Creation Successful");
		leb3.setBounds(87,150,500,40);
		leb3.setFont(fleb3);
		frame.add(leb3);
		lebtf6=new JLabel( "Keep Safe Your User ID.");
		lebtf6.setBounds(40,220,590,40);
		lebtf6.setFont(fleb3);
		frame.add(lebtf6);
		lebtf7=new JLabel( "Your Id:"+newUserId);
		lebtf7.setBounds(40,300,500,40);
		lebtf7.setFont(fleb3);
		frame.add(lebtf7);



		//		fGHP=new Font("Arial",Font.BOLD,20);
		//		ButGotoHomePage=new JButton("Go to Home Page");/////////
		//		ButGotoHomePage.setBounds(180,300,250,45);
		//		ButGotoHomePage.setFont(fGHP);
		//		frame.add(ButGotoHomePage);
	}

	boolean checkValidity(String temp){
		try {
			String fil1=tf1.getText();
			String fil2=pass2.getText();
			String fil3=pass3.getText();
			double fil4=Double.parseDouble(tf4.getText());
			String fil5=tf5.getText();
			if(fil4<=100.0)
			{
				throw new Exception("Low Balance , Increase Your Balance and Try Again. minimum Balance 100");
			}
			else if(!fil2.equals(fil3))
			{
				throw new Exception("Password Not Matched");	 
			}
			BankAccountAbstractClass user;
			if(temp.equals("SavingAccount"))
			{
				user=new SavingAccount(fil1,"Saving Account",fil2,fil4,fil5);

				getPrintObj.NewAccount(user);
				newUserId=user.id;
			}
			else if(temp.equals("CurrentAccount"))
			{
				user=new CurrentAccount(fil1,"Current Account",fil2,fil4,fil5);

				getPrintObj.NewAccount(user);
				newUserId=user.id;
			}
			else if(temp.equals("StudentAccount"))
			{
				user=new StudentAccount(fil1,"Student Account",fil2,fil4,fil5);

				getPrintObj.NewAccount(user);
				newUserId=user.id;
			}


			return true;
		}

		catch(Exception e)
		{
			if(e.getMessage().equals("empty String"))
			{
				tf6.setText("                                                                                           Empty Fill");
				return false;
			}

			tf6.setText("                     "+e.getMessage());
			return false;
		}
	}
	void logInPage() {

		fLogUserId=new Font("Arial",Font.BOLD,18);
		lebLogUserId=new JLabel( "Enter User ID:");
		lebLogUserId.setBounds(10,150,150,40);
		lebLogUserId.setFont(fLogUserId);
		frame.add(lebLogUserId);
		tfLogUserId=new JTextField(100);	
		tfLogUserId.setBounds(180,150,380,40);
		frame.add(tfLogUserId); 

		lebLogPass=new JLabel( "Enter Password:");
		lebLogPass.setBounds(10,250,150,40);
		lebLogPass.setFont(fLogUserId);
		frame.add(lebLogPass);
		pass1=new JPasswordField(100)	;
		pass1.setBounds(180,250,380,40);
		frame.add(pass1);

		fLOG=new Font("Arial",Font.BOLD,15);
		ButLoginpageLOG=new JButton("LOG IN");/////////
		ButLoginpageLOG.setBounds(50,300,200,45);
		ButLoginpageLOG.setFont(fLOG);
		frame.add(ButLoginpageLOG);
		fLogPage=new Font("Arial",Font.BOLD,20);
		tfLogPage=new JTextField(100);	
		tfLogPage.setBounds(0,500,600,50);
		tfLogPage.setFont(fLogPage);
		frame.add(tfLogPage); 

	}
	void afterLogin() {
		fAfterLogInPage=new Font("Arial",Font.BOLD,15);
		ButDeposit=new JButton("Deposit Money");/////////
		ButDeposit.setBounds(200,100,200,45);
		ButDeposit.setFont(fAfterLogInPage);
		frame.add(ButDeposit);

		ButWithdraw=new JButton("Withdraw Money");/////////
		ButWithdraw.setBounds(200,220,200,45);
		ButWithdraw.setFont(fAfterLogInPage);
		frame.add(ButWithdraw);
		ButBalance=new JButton("Account Balance");/////////
		ButBalance.setBounds(200,340,200,45);
		ButBalance.setFont(fAfterLogInPage);
		frame.add(ButBalance);
		tfAfterLogInPage=new JTextField(100);	
		tfAfterLogInPage.setBounds(0,500,600,50);
		tfAfterLogInPage.setFont(fLogPage);
		tfAfterLogInPage.setEnabled( false );
		frame.add(tfAfterLogInPage); 
	}
	void withdrawPage(){
		fWithdraw=new Font("Arial",Font.BOLD,15);
		ButWithdrawNEXT=new JButton("Next");/////////
		ButWithdrawNEXT.setBounds(200,300,200,45);
		ButWithdrawNEXT.setFont(fWithdraw);
		frame.add(ButWithdrawNEXT);

		LebWithdraw=new JLabel( "Enter Amount");
		LebWithdraw.setBounds(240,180,200,40);
		LebWithdraw.setFont(fLogUserId);
		frame.add(LebWithdraw);

		tfWithdraw=new JTextField(100);	
		tfWithdraw.setBounds(200,210,200,50);
		tfWithdraw.setFont(fLogPage);
		frame.add(tfWithdraw); 

		frame.add(tfAfterLogInPage); ////////////////Wrong Fill
		
		LebMinLim=new JLabel( "You Must Keep Minimum 100 tk in Your Account");
		LebMinLim.setBounds(2,2,400,40);
		frame.add(LebMinLim);
		
		lebSavingAccountMaaxLimxLim=new JLabel( "For Saving Account, Max Limit of Withdraw is : 40000");
		lebSavingAccountMaaxLimxLim.setBounds(2,18,400,40);
		frame.add(lebSavingAccountMaaxLimxLim);
		
		lebStudentAccountM=new JLabel( "For Student Account, Max Limit of Withdraw is : 10000");
		lebStudentAccountM.setBounds(2,34,400,40);
		frame.add(lebStudentAccountM);
		
	}

	
	
	
	
	
	void depositPage(){
		fWithdraw=new Font("Arial",Font.BOLD,15);
		ButWithdrawNEXT=new JButton("Next");/////////
		ButWithdrawNEXT.setBounds(200,300,200,45);
		ButWithdrawNEXT.setFont(fWithdraw);
		frame.add(ButWithdrawNEXT);

		LebWithdraw=new JLabel( "Enter Amount");
		LebWithdraw.setBounds(240,180,200,40);
		LebWithdraw.setFont(fLogUserId);
		frame.add(LebWithdraw);

		tfWithdraw=new JTextField(100);	
		tfWithdraw.setBounds(200,210,200,50);
		tfWithdraw.setFont(fLogPage);
		frame.add(tfWithdraw); 

		frame.add(tfAfterLogInPage); ////////////////Wrong Fill
		
		
		
	}
	
	
	
	
	


}//////////////////////////////////////////////////////////////////class Ends
