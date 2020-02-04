package student;

public class static_array_class {//this class use for assign menu to array.
	String[] main_list=new String[10];
	String[] admin_option_list=new String[4];
public String[] array1() {
	main_list[0]="1.  Art";
	main_list[1]="2.  Food";
	main_list[2]="3.  History";
	main_list[3]="4.  Java";
	main_list[4]="5.  Sport";
	main_list[5]="6.  Movie";
	main_list[6]="7.  Animal";
	main_list[7]="8.  Computer";
	main_list[8]="9.  Geography";
	main_list[9]="10. Exit the application with confirmation";
	return main_list;
}
public String[] array2() {
	admin_option_list[0]="1.  Add New Question and Answer for The (Selected Trivia Category)";
	admin_option_list[1]="2.  Modify Question and Answer for The (Selected Trivia Category)";
	admin_option_list[2]="3.  Delete Question and Answer for The (Selected Trivia Category)";
	admin_option_list[3]="4.  Exit This Section With Confirmation ";
	return admin_option_list;
}
}
