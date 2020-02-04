package admin;

import java.util.Scanner;

import student.Alter_Question_class;
import student.Fix_message_class;
import student.Input_validation_class;
import student.Question_class;
import student.Store_Edit_data;
import student.Student_main_class;
import student.static_array_class;

public class Admin_main_class {
	String[] main_menu_list;
	String input_menu_number,menu_data,admin_number,usertype;
	Scanner input = new Scanner(System.in);
	Fix_message_class message;
	static_array_class sac;
	Alter_Question_class aqc;
	Store_Edit_data sed[];

	public void Admin_fun(String usertype,Store_Edit_data sed[])
	{
		this.sed=sed;
		
		this.usertype=usertype;
		aqc=new Alter_Question_class();//this class help to enter new question.
	    message=new Fix_message_class();//store all messages in the form of functions.
		message.message9();// print a message.
	    sac=new static_array_class();//this class is use for get the data of array.example menu list.
		main_menu_list=sac.array1();//get array String array and assign it to another String array.
		for(int i=0;i<main_menu_list.length;i++)
		 {
			 message.main_list(i,main_menu_list);//print menu list.
		 }
		message.message3();//print message.
		Input_validation_class ivc=new Input_validation_class();//this class is use for check the user input number valid or not.
		 input_menu_number= input.nextLine();
		 menu_data=ivc.validation(input_menu_number,usertype,sed);//call validation function to check entered number valid or not.
		 message.message12();
		 Admin_options();
	
	}
	 public void Admin_options()
	 {
		 String[] admin_option_list=sac.array2();// to access menu list that list use by admin. 
		 for(int i=0;i<admin_option_list.length;i++)//this loop is used for to print admin menu list.
		 {
			 message.main_list(i,admin_option_list);
		 }
		 message.message3();// print message.
		 admin_number=input.nextLine();
		 if(admin_number.equalsIgnoreCase("1"))//add new question.
		 {
			 
			 aqc.add_new_Question(input_menu_number,sed);//call this function to add new question.
		 }else if(admin_number.equalsIgnoreCase("2"))//modify question.
		 {
			 aqc.modifyq(input_menu_number,sed);
		 }else if(admin_number.equalsIgnoreCase("3"))//delete question.
		 {
			aqc.deleteq(input_menu_number,sed);
			 
		 }else if(admin_number.equalsIgnoreCase("4"))//exit
		 {
			 valid_input();
			 
		 }else
		 {
			 System.out.println("Your Selected Option is Wrong Please Try Again\n "); 
			 Admin_options();
		 }
	 }
	 public void valid_input() {
			System.out.println("Are you close this Application if Yes then Press Y or not then Press N"); 
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
				 Admin_options(); 
				
			 }
			 else
			 {
				 message.message10();
				 valid_input();
				 //if user enter invalid input then this function again call.
			 }
		}
	
}
