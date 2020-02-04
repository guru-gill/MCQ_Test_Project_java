package student;

import java.util.Scanner;
public class Print_Questions {
	Fix_message_class message1;
	Store_Edit_data sed[];
	public void question_print(String menu_data,Fix_message_class message,Store_Edit_data sed[])
	//this function print the questions one by one with question type.
	{
		message.message6(menu_data);
		this.message1=message;
		this.sed=sed;
		Question_class qc[];//create Question_class type array for store the Questions with options and right answers.
		
		
		if(menu_data.equals("1.  Art") ){//this condition is use to printing a particular questions type And compares with question Type number that user entered
			qc=sed[0].qc;//access previous stored questions and assign it to qc array. 
			calculate(qc);
			
	}else if(menu_data.equals("2.  Food") )
	{
		qc=sed[1].qc;
		calculate(qc);
		
	}else if(menu_data.equals("3.  History") )
	{
		qc=sed[2].qc;
		calculate(qc);
	}else if(menu_data.equals("4.  Java") ){
		qc=sed[3].qc;
		calculate(qc);
			
			
	}else if(menu_data.equals("5.  Sport") )
	{qc=sed[4].qc;
	calculate(qc);
	}else if(menu_data.equals("6.  Movie") )
	{qc=sed[5].qc;
	calculate(qc);
	}
	else if(menu_data.equals("7.  Animal") )
	{
		qc=sed[6].qc;
		calculate(qc);
	}
	else if(menu_data.equals("8.  Computer") )
	{
		qc=sed[7].qc;
		calculate(qc);
	}
	else if(menu_data.equals("9.  Geography") )
	{
		qc=sed[8].qc;
		calculate(qc);
	}
	

}
	public void calculate(Question_class qc[]) 
	//this function calculate the score of student.
	{
		Store_result sr[]=new Store_result[20];
		int score=0;
		int a;
		 
		 Scanner inputans=new Scanner(System.in);
		 for(a=0;a<qc.length;a++)//this loop print question one by one after entering user input .
		 {
			 System.out.println((a+1)+")"+qc[a].Q); 
			String answer=inputans.nextLine();
			// check user select right option or not.
				if(!(answer.equals("a")||answer.equals("b")||answer.equals("c")||answer.equals("d")||answer.equals("e")))
				{
					a--;
					message1.message13();	
					}
			
			
			if(a==-1)
			{
				
			}else
			{
				if(answer.equals(qc[a].A))
				{
					sr[a]=new Store_result(qc[a].A,1);
					score++;//increment user score.
				}else
				{
					sr[a]=new Store_result(answer,0);
				}
			}
			}
		 // print user score.
		 message1.message14(score,qc.length );
		 //print all right answers.
		 for(int i=0;i<qc.length;i++)
		 {
			 if(sr[i].status==1)
			 {
				 System.out.println((i+1)+") ("+sr[i].answer+") Right"); 
			 }else if(sr[i].status==0)
			 {
				 System.out.println((i+1)+") ("+sr[i].answer+") Wrong, Right Answer is "+qc[i].mA); 
				
			 }
//			 {
//				 System.out.println((i+1)+")"+sr[i].answer+" Wrong, Right Answer is "+qc[i].mA); 
//			 }
			
		 }
		 // to show menu list again.
		 message1.message15();
		 input_valid();
				
	}
	public void input_valid() {
		Scanner inputans=new Scanner(System.in);
		String conti= inputans.nextLine();
		if(conti.equalsIgnoreCase("Y"))//again show menu list to user
		{
			message1.message17();	
			Main_class mc=new Main_class();
			mc.mainfun(sed);
		}else if(conti.equalsIgnoreCase("N"))//close application.
		{
			System.out.println("Bye Bye");
			 System.out.println("This Application is Closed");
			 inputans.close();
		}else
		{
			message1.message10();
			input_valid();//this function again call when user enter wrong keyword. 
		}
	}
}
