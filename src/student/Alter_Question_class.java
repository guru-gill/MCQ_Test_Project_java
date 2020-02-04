package student;

import java.util.Scanner;

import student.*;


public class Alter_Question_class {
	Question_class qc[],qc1[],m;
	
	Question_class qc3[];
	Fix_message_class message=new Fix_message_class();
	Scanner input = new Scanner(System.in);
	String q,a1,a2,a3,a4,a;int pos1;
	int m_no=0;
	Store_Edit_data sed[];
	public void add_new_Question(String Qtype,Store_Edit_data sed[])
	//this statements check which question type is selected by admin for enter new question.
	{
		this.sed=sed;//Assign the value to the global variable
		if(Qtype.equals("1"))//check which type of menu number user entered
		{
			qc=sed[0].qc;//access stored question array and assign it to question class array
			m_no=0;
			addnew();//call function
			
		}
		else if(Qtype.equals("2"))
		{
			qc=sed[1].qc;
			m_no=1;
			addnew();
			
		}
		else if(Qtype.equals("3"))
		{
			qc=sed[2].qc;
			m_no=2;
			addnew();
		}
		else if(Qtype.equals("4"))
		{
			qc=sed[3].qc;
			m_no=3;
			addnew();
		}
		else if(Qtype.equals("5"))
		{
			qc=sed[4].qc;
			m_no=4;
			addnew();
		}
		else if(Qtype.equals("6"))
		{
			qc=sed[5].qc;
			m_no=5;
			addnew();
		}
		else if(Qtype.equals("7"))
		{
			qc=sed[6].qc;
			m_no=6;
			addnew();
		}
		else if(Qtype.equals("8"))
		{
			qc=sed[7].qc;
			m_no=7;
			addnew();
		}
		else if(Qtype.equals("9"))
		{
			qc=sed[8].qc;
			m_no=8;
			addnew();
		}
	}
	public void addnew() {
		Question_class qc1[]=new Question_class[qc.length+1];//use new array with length greater the old array
		                                                     //because add new question oldarray.length+1`index.
		this.qc1=qc1;
		System.out.println("Already Exist Questions\n"); 
		for(int i=0;i<qc.length;i++)//print already exist questions.
		{
			System.out.println((i+1)+")"+qc[i].Q+"\n"); 
			
		}
		System.out.println("\nEnter new Question ........\n");
		enterq();
	}
		
		public void enterq() //this function use for enter new question.
		{
			q=input.nextLine();
			if(q.equalsIgnoreCase("")) {
				System.out.println("Please Enter The Question \n");
				enterq();
			}
			else
			{
				entera();
			}
		}
			public void entera() {//for enter option A
				System.out.println("Enter Option A ..\n");
				a1=input.nextLine();
				if(a1.equalsIgnoreCase("")) {
					//System.out.println("Please Enter Option A \n");
					entera();
				}else
				{
					enterb();
				}
			}
				public void enterb() {//for enter option B
					System.out.println("Enter Option B ..\n");
					a2=input.nextLine();
					if(a2.equalsIgnoreCase("")) {
						//System.out.println("Please Enter Option B \n");
						enterb();
					}else
					{
						enterc();
					}
				}
					public void enterc() {//for enter option C
						System.out.println("Enter Option C ..\n");
						a3=input.nextLine();
						if(a3.equalsIgnoreCase("")) {
							//System.out.println("Please Enter Option C \n");
							enterc();
						}else
						{
							enterd();
						}
					}
						public void enterd() {//for enter option D

							System.out.println("Enter Option D ..\n");
							a4=input.nextLine();
							if(a4.equalsIgnoreCase("")) {
								//System.out.println("Please Enter Option D \n");
								enterd();
							}else
							{
								System.out.println("Enter Right Option ..\n");
								enteras();
							}
						}
							public void enteras() {//for enter right option.
								
								a=input.nextLine();
								if(a.equalsIgnoreCase("")) {
									System.out.println("Enter Right Option ..\n");
									enteras();
								}else
								{
									if(!(a.equals("a")||a.equals("b")||a.equals("c")||a.equals("d")))
									{
										
										message.message16();	
										enteras();
										}else
										{
									//M is Question_class object .it store new question and option.
									 m=   new Question_class(q+"\n\n(a)"+a1+"\n(b)"+a2+"\n(c)"+a3+"\n(d)"+a4,a,"("+a+")");
										for(int i=0;i<qc1.length;i++)//this run for new array length.
										{
											if(i==(qc1.length-1))
											{
												qc1[i]=m;//add new question. 
											}else
											{
												qc1[i]=qc[i];//copy old array into new array.
											}
											
											
											System.out.println((i+1)+")"+qc1[i].Q+"\n");  //print new array.
										}
										
										input_valid(qc1);
										
									
								}
								}
		}
							public void deleteq(String Qtype,Store_Edit_data sed[])
							{
								this.sed=sed;
								if(Qtype.equals("1"))
								{
									qc=sed[0].qc;
									m_no=0;
									delete();
								}
								else if(Qtype.equals("2"))
								{
									qc=sed[1].qc;
									m_no=1;
									delete();
								}
								else if(Qtype.equals("3"))
								{
									qc=sed[2].qc;
									m_no=2;
									delete();
								}
								else if(Qtype.equals("4"))
								{
									qc=sed[3].qc;
									m_no=3;
									delete();
								}
								else if(Qtype.equals("5"))
								{
									qc=sed[4].qc;
								m_no=4;
								delete();
								}
								else if(Qtype.equals("6"))
								{
									qc=sed[5].qc;
									m_no=5;
									delete();
								}
								else if(Qtype.equals("7"))
								{
									qc=sed[6].qc;
									m_no=6;
									delete();
								}
								else if(Qtype.equals("8"))
								{
									qc=sed[7].qc;
									m_no=7;
									delete();
								}
								else if(Qtype.equals("9"))
								{
									qc=sed[8].qc;
								m_no=8;
								delete();
								}
							

								 
							}
							public void delete() {
								System.out.println("Already Exist Questions\n"); 
								for(int i=0;i<qc.length;i++)//print already exist questions.
								{
									System.out.println((i+1)+")"+qc[i].Q+"\n");
									
								}
								System.out.println("Please Enter Question number that you want to delete\n ");
								dprint();
					
							}
							public void dprint() {
								qc3=new Question_class[qc.length-1];
								String pos =input.nextLine();
								if(pos.equalsIgnoreCase("1")||pos.equalsIgnoreCase("2")||pos.equalsIgnoreCase("3")||pos.equalsIgnoreCase("4")||pos.equalsIgnoreCase("5")||pos.equalsIgnoreCase("6")||pos.equalsIgnoreCase("7")||pos.equalsIgnoreCase("8")||pos.equalsIgnoreCase("9")||pos.equalsIgnoreCase("10")||pos.equalsIgnoreCase("11")||pos.equalsIgnoreCase("12")||pos.equalsIgnoreCase("13")||pos.equalsIgnoreCase("14")||pos.equalsIgnoreCase("15"))
								{
									int postion=Integer.parseInt(pos);	
									 if(postion<=qc.length)//this loop helps to delete given number of question
									 {
										 postion--;
										 for(int j=postion;j<qc.length-1;j++)
										 {
											 qc[j]=qc[j+1];
										
										 } 
										 for(int i=0;i<qc.length-1;i++)//print  questions.
											{
											 qc3[i]=qc[i];
											 System.out.println((i+1)+")"+qc[i].Q+"\n");
									 }
									 
										 input_valid(qc3);
											
										}
									 else
									 {
										 System.out.println("Please Enter right Question number that you want to delete\n ");
										 dprint();
									 }
								}else
								{
									 System.out.println("Please Enter right Question number that you want to delete\n ");
									 dprint();
								}
								 
								 
							}
							public void modifyq(String Qtype,Store_Edit_data sed[]) {//modify the given number of question
								this.sed=sed;
								if(Qtype.equals("1"))
								{
									qc=sed[0].qc;
									m_no=0;
									modiquestion();
								}
								else if(Qtype.equals("2"))
								{
									qc=sed[1].qc;
									m_no=1;
									modiquestion();
								}
								else if(Qtype.equals("3"))
								{
									qc=sed[2].qc;
									m_no=2;
									modiquestion();
								}
								else if(Qtype.equals("4"))
								{
									qc=sed[3].qc;
									m_no=3;
									modiquestion();
								}
								else if(Qtype.equals("5"))
								{
									qc=sed[4].qc;
									m_no=4;
									modiquestion();
								}
								else if(Qtype.equals("6"))
								{
									qc=sed[5].qc;
									m_no=5;
									modiquestion();
								}
								else if(Qtype.equals("7"))
								{
									qc=sed[6].qc;
									m_no=6;
									modiquestion();
								}
								else if(Qtype.equals("8"))
								{
									qc=sed[7].qc;
									m_no=7;
									modiquestion();
								}
								else if(Qtype.equals("9"))
								{
									qc=sed[8].qc;
									m_no=8;
									modiquestion();
								}
							
							}
							public void modiquestion() {
								System.out.println("Already Exist Questions\n"); 
								for(int i=0;i<qc.length;i++)//print already exist questions.
								{
									System.out.println((i+1)+")"+qc[i].Q+"\n");
									
								}
								System.out.println("Please Enter Question number that you want to Modify\n ");
								mprint();
					
							}
							public void mprint() {
								String pos =input.nextLine();
								if(pos.equalsIgnoreCase("1")||pos.equalsIgnoreCase("2")||pos.equalsIgnoreCase("3")||pos.equalsIgnoreCase("4")||pos.equalsIgnoreCase("5")||pos.equalsIgnoreCase("6")||pos.equalsIgnoreCase("7")||pos.equalsIgnoreCase("8")||pos.equalsIgnoreCase("9")||pos.equalsIgnoreCase("10")||pos.equalsIgnoreCase("11")||pos.equalsIgnoreCase("12")||pos.equalsIgnoreCase("13")||pos.equalsIgnoreCase("14")||pos.equalsIgnoreCase("15"))
								{
								  pos1=Integer.parseInt(pos);	
								  
								 if(pos1<=qc.length)//for entering modified question
								 {
								 System.out.println("\nEnter Modified Question ........\n");
									 enterm();
								 
										
									}
								 else
								 {
									 System.out.println("Please Enter right Question number that you want to Modify\n ");
									 mprint();
								 
								 }}
								 else
								 {
									 System.out.println("Please Enter right Question number that you want to Modify\n ");
									 mprint();
								 }
							}
							public void enterm() //this function use for enter new question.
							{
								q=input.nextLine();
								if(q.equalsIgnoreCase("")) {
									System.out.println("Please Enter The Modified Question \n");
									enterm();
								}
								else
								{
									enteram();
								}
							}
							public void enteram() {//for enter option A
								System.out.println("Enter Option A ..\n");
								a1=input.nextLine();
								if(a1.equalsIgnoreCase("")) {
									//System.out.println("Please Enter Option A \n");
									enteram();
								}else
								{
									enterbm();
								}
							}
								public void enterbm() {//for enter option B
									System.out.println("Enter Option B ..\n");
									a2=input.nextLine();
									if(a2.equalsIgnoreCase("")) {
										//System.out.println("Please Enter Option B \n");
										enterbm();
									}else
									{
										entercm();
									}
								}
									public void entercm() {//for enter option C
										System.out.println("Enter Option C ..\n");
										a3=input.nextLine();
										if(a3.equalsIgnoreCase("")) {
//											System.out.println("Please Enter Option C \n");
											entercm();
										}else
										{
											enterdm();
										}
									}
										public void enterdm() {//for enter option D

											System.out.println("Enter Option D ..\n");
											a4=input.nextLine();
											if(a4.equalsIgnoreCase("")) {
												//System.out.println("Please Enter Option D \n");
												enterdm();
											}else
											{
												enterasm();
											}
										}
											public void enterasm() {//for enter right option.
												System.out.println("Enter Right Answer ..\n");
												a=input.nextLine();
												if(a.equalsIgnoreCase("")) {
													enteras();
												}else
												{

													if(!(a.equals("a")||a.equals("b")||a.equals("c")||a.equals("d")||a.equals("e")))
													{
														
														message.message16();	
														enterasm();
														}else
														{
													pos1--;
													 m=   new Question_class(q+"\n\n(a)"+a1+"\n(b)"+a2+"\n(c)"+a3+"\n(d)"+a4,a,"("+a+")");
													 qc[pos1]=m;
													 //assign modified question to previous question location
														for(int i=0;i<qc.length;i++)//print  questions.
														{
															System.out.println((i+1)+")"+qc[i].Q+"\n");
															
														}
												}
												input_valid(qc);
												
												}
											}
											public void input_valid(Question_class qc3[]) {
												System.out.println("Do you want to save Changes then press S or close application then press E..\n");
												Scanner inputans=new Scanner(System.in);
												String conti= inputans.nextLine();
												if(conti.equalsIgnoreCase("S"))
												{
														
													
													Main_class mc=new Main_class();//show again menu .jump the control to main class
													sed[m_no]=new Store_Edit_data(qc3);
												    message.message17();
													mc.mainfun(sed);
													 
												}else if(conti.equalsIgnoreCase("E"))//close application
												{
													System.out.println("Bye Bye");
													 System.out.println("This Application is Closed");
													 inputans.close();
												}else
												{
													Fix_message_class ex=new Fix_message_class();
													ex.message10();
													input_valid(qc3);//this function again call when user enter wrong keyword. 
												}
											}
	}

