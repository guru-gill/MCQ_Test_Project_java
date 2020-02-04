package student;

import java.util.Scanner;

import admin.Admin_main_class;

public class Input_validation_class {
	String usertype1;
Store_Edit_data sed[];
	Fix_message_class message=new Fix_message_class();//class used for print messages.
	public String validation(String selected_option_number ,String usertype,Store_Edit_data sed[])
	//receive user input number and check it is valid or not and return selected menu name.
	{
		this.usertype1=usertype;
		this.sed=sed;
		if(selected_option_number.equals("1"))
		{
			message.message4("1.  Art");
			return "1.  Art";
		}
		else if(selected_option_number.equals("2"))
		{
			message.message4("2.  Food");
			return "2.  Food";
		}
		else if(selected_option_number.equals("3"))
		{
			message.message4("3.  History");
			return "3.  History";
		}
		else if(selected_option_number.equals("4"))
		{
			message.message4("4.  Java");
			return "4.  Java";
		}
		else if(selected_option_number.equals("5"))
		{
			message.message4("5.  Sport");
			return "5.  Sport";
		}
		else if(selected_option_number.equals("6"))
		{
			message.message4("6.  Movie");
			return "6.  Movie";
		}
		else if(selected_option_number.equals("7"))
		{
			message.message4("7.  Animal");
			return "7.  Animal";
		}
		else if(selected_option_number.equals("8"))
		{
			message.message4("8.  Computer");
			return "8.  Computer";
		}
		else if(selected_option_number.equals("9"))
		{
			message.message4("9.  Geography");
			return "9.  Geography";
		}
		else if(selected_option_number.equals("10"))
		{
			message.message4("10. Exit the application with Confirmation");
            // check user want to close application or not
			valid_input();
			 
			return "10. Exit the application with Confirmation";
		}
		else
		{
			message.message5();//print error message.
			Student_main_class smc=new Student_main_class();
			
		
			 smc.student(usertype1,sed);
			//smc.student(usertype,sed);//if user enter invalid number then student() function to again print menu list.
			return "no";
			
			
		}
	}
	public void valid_input() {
		System.out.println("Are you sure to close this Application if Yes then Press Y or if no then Press N"); 
		 Scanner inputans=new Scanner(System.in);
		 String answer=inputans.nextLine();
		 if(answer.equalsIgnoreCase("Y"))
		 {
			 // application will be closed when user press y.
			 System.out.println("Bye Bye");
			 System.out.println("This Application is Closed");
			 inputans.close();
		 }else if (answer.equalsIgnoreCase("N"))
		 { 
			 // if user press N .then check user type is admin or student .if user type is admin then control jump to 
			 // Admin_main_class or if user is then jump to Student main class
			 message.message7();
			 if(usertype1.equalsIgnoreCase("A"))
			 {
				Admin_main_class amc = new Admin_main_class();
				
				amc.Admin_fun(usertype1,sed);
				 
			 }else
			 {
				 Student_main_class smc=new Student_main_class();
			
			
				 smc.student(usertype1,sed);
			 }
			
		 }
		 else
		 {
			 message.message10();
			 valid_input();
			 //if user enter invalid input then this function again call.
		 }
	}

}
