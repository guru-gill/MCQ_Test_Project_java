package student;

import java.util.Scanner;

import admin.Admin_main_class;



public class Main_class {
	String usertype;
	Store_Edit_data sed[];
	public void mainfun(Store_Edit_data sed[]) {
		this.sed=sed;
		Scanner input = new Scanner(System.in);
		 Fix_message_class fxmsg=new Fix_message_class();
		
		 usertype=input.nextLine();
		 if(usertype.equalsIgnoreCase("A"))// check user type admin or student.
		 {
			 fxmsg.message8();//print message for entering special code .this message is get for fix message class.
		   codecheck();// call this function for check admin special code.
		
		 }else if(usertype.equalsIgnoreCase("S"))// check user type admin or student.
		 {
			 fxmsg.message2(); //print message.
			 Student_main_class smc=new Student_main_class();//jump the control to Student main class when user type is student.
		    	smc.student(usertype,sed); 
		 }
		 else
		 {
			 fxmsg.message10();
			 //print error message. 
		
			 mainfun(sed);//again call mainfun() function.
		 }
		
	    
	}
	 public static void main(String args[]) 
	    { 
		 Main_class mc=new Main_class();
		
		 // control start from here so firstly get all types of predefine questions list to array. 
		 Fix_message_class fxmsg = new Fix_message_class() ;
		 //initialization of default questions
		 Store_Edit_data sed[]= {//this array hold all types of questions.
				// new Store_Edit_data(fxmsg .Art_questions()),
				 new Store_Edit_data(fxmsg .Art_questions()),//access art types questions and store it into Store_Edit_data object.
				 new Store_Edit_data(fxmsg .Food_questions()),
				 new Store_Edit_data(fxmsg .History_questions()),
				 new Store_Edit_data(fxmsg .java_questions()),
				 new Store_Edit_data(fxmsg .sport_questions()),
				 new Store_Edit_data(fxmsg .movie_questions()),
				 new Store_Edit_data(fxmsg .Animal_questions()),
				 new Store_Edit_data(fxmsg .computer_questions()),
				 new Store_Edit_data(fxmsg .geo_questions())
				 
		 };
		
		 fxmsg.message1();//use this class to get message.that are print on the screen when project is run.
		 mc.mainfun(sed);// call mainfun() function 1st time.

	    }
	 public void codecheck() {//check given admin code is right or not.
			Scanner input = new Scanner(System.in);
			 String specialcode =input.nextLine();
			 if(specialcode.equalsIgnoreCase("232"))
			 {
				 Admin_main_class amc=new Admin_main_class();//jump the control to admin class
				
				 amc.Admin_fun(usertype,sed);
			 }else
			 {
				 Fix_message_class fxmsg=new Fix_message_class();
				 fxmsg.message11();
				 codecheck();//this function is again called when user enter wrong code.
			 }
		}
}
