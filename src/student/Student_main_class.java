package student;

import java.util.Scanner;

public class Student_main_class {
	
	public void student(String usertype,Store_Edit_data sed[])//receive user type. 
	{
		String[] main_menu_list;
		String input_menu_number=" ",menu_data=" ";
		Scanner input = new Scanner(System.in);
		static_array_class sac=new static_array_class();//this class is use for get the data of array.example menu list.
		Fix_message_class message= new Fix_message_class();//this class is use for print messages.
		main_menu_list=sac.array1();//get array String array and assign it to another String array.
		for(int i=0;i<main_menu_list.length;i++)
		 {
			 message.main_list(i,main_menu_list);//print menu list.
		 }
		message.message3();//print message.
		Input_validation_class ivc=new Input_validation_class();//this class is use for check the user input number valid or not.
		 input_menu_number= input.nextLine();
		 menu_data=ivc.validation(input_menu_number,usertype,sed);//call validation function to check entered number valid or not.
			if(!(menu_data.equals("no")||menu_data.equals("10. Exit the application with Confirmation")))
				// check if both of return type get then program stop or not execute next .
			 {
				
				Print_Questions qp=new Print_Questions();//jump the control to print_question class for printing questions.
				qp.question_print(menu_data, message,sed);
				
			
			 }
		 
	}
}
