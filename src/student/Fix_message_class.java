package student;



public class Fix_message_class {//this class used for access all predefine message and initialised questions.
	public void message1() {
		System.out.println("\nWell Come To Trivia Application\n"); 
		 System.out.println("Are You Admin or Student if You are Admin Then Press 'A' or if You are Student Then Press 'S'\n");
	}
	public void message2() {
//		System.out.println("\nWell Come To Trivia Application\n"); 
		 System.out.println("To Start Trivia Application Please Select At Least One Following Option\n");
	}
	public void main_list(int i,String list[]) {
		System.out.println(list[i]); 
		 
	}
	public void message3() {
		System.out.println("\nEnter Your Choice_"); 

	}
	public void message4(String inputnumber) {
		System.out.println("Your Selected Option is "+inputnumber+"\n"); 

	}
	public void message5() {
		System.out.println("Your Selected Option is Wrong Please Try Again "); 
	}
	public void message6(String cat) {
		System.out.println("Your WelCome In Catagory "+cat+" Type Questions !!! Please Select one Correct Option from Four Alternative Options And Give the Answers of Questions one by one\n\n" ); 

	}
	public void message7() {
		System.out.println("\nWell Come Again in Trivia Application\n"); 
		 System.out.println("To Start Trivia Application Please Select At Least One Following Option\n");
	}
	public void message8() {
		System.out.println("\nPlease Enter Your Special code(232) :\n"); 
		
	}
	public void message9() {
		System.out.println("\nSelect one Option to Manage a Trivia Apptication Category\n"); 
		
	}
	public void message10() {
		System.out.println("\nPlease Enter Right Option Try Again \n"); 
		
	}
	public void message11() {
		System.out.println("\nYou Enter Worng Code Please Try Again.... \n"); 
		
	}
	public void message12() {
		System.out.println("Enter One Option to: \n"); 
		
	}
	public void message13() {
		System.out.println("You choose a wrong option Please Enter Options like This : a,b,c,d"); 
		
	}
	public void message14(int score,int length) {
		System.out.println("You got "+score+"/"+length ); 
		 System.out.println("Correct Answers are :");  
		
	}
	public void message15() {
		System.out.println("\nDo you want to continue this Application then press Y otherwise press N"); 
		
	}
	public void message16() {
		System.out.println("Please Enter Right Options like This : a,b,c,d"); 
		
	}
	public void message17() {
		System.out.println("\nWell Come Again in Trivia Application\n"); 
		 System.out.println("Are You Admin or Student if You are Admin Then Press 'A' or if You are Student Then Press 'S'\n");
	}

	public Question_class[] java_questions() { //this function used for initialised questions.
		String j0,j1,j2,j3,j4,j5,j6,j7,j8,j9;
		
		j0=" A process that involves recognizing and focusing on the important characteristics of a situation or object is known as:"
				+"\n\n(a) Encapsulation\n(b) Polymorphism\n(c) Abstraction \n(d) Inheritance";
		j1=" Which statement is true regarding an object?"
				+ "\n\n(a) An object is what classes instantiated are from\n(b) An object is an instance of a class\n(c) An object is a variable\n(d) An object is a reference to an attribute";
		j2=" The wrapping up of data and functions into a single unit is called"
				+ "\n\n(a) Encapsulation\n(b) Abstraction\n(c) Data Hiding\n(d) Polymorphism";
		j3=" What is the error in the following class definitions?\n\nAbstract class xy\n{\nabstract sum (int x, int y) { }\n}"
				+ "\n\n(a) Class header is not defined properly\n(b) Constructor is not defined\n(c) Method is not defined properly\n(d) Method is defined properly";
		j4=" Which of these operators is used to allocate memory to array variable in Java?"
					+ "\n\n(a) malloc\n(b) alloc \n(c) new \n(d) new malloc ";
		j5=" Which of these is an incorrect array declaration?"
					+ "\n\n(a) int arr[] = new int[5] \n(b) int [] arr = new int[5] \n(c) int arr[] = new int[5] \n(d) int arr[] = int [5] new ";
		j6=" Which of these is necessary to specify at time of array initialization?"
					+ "\n\n(a) Row \n(b) Column \n(c) Both Row and Column \n(d) None of the mentioned ";
		j7=" Which of these are selection statements in Java? "
					+ "\n\n(a) if() \n(b) for() \n(c) continue \n(d) break ";
		j8=" Which of the following is not OOPS concept in Java? "
					+ "\n\n(a) Inheritance\n(b) Encapsulation \n(c) Polymorphism \n(d) Compilation ";
		j9="When does method overloading is determined?"
					+ "\n\n(a) At run time \n(b) At compile time \n(c) At coding time \n(d) At execution time ";

		Question_class Qc[]= {
		new Question_class(j0,"c"," (c) "),
	    new Question_class(j1,"b"," (b) "),
	    new Question_class(j2,"a"," (a) "),
	    new Question_class(j3,"c"," (c) "),
	    new Question_class(j4,"c"," (c) "),
	    new Question_class(j5,"d"," (d) "),
	    new Question_class(j6,"a"," (a) "),
	    new Question_class(j7,"a"," (a) "),
	    new Question_class(j8,"d"," (d) "),
	    new Question_class(j9,"b","(b) "),
		};
		return Qc;
		}
	public Question_class[] sport_questions() {
		String s0,s1,s2,s3,s4,s5,s6,s7,s8,s9;
		s0=" The Arab country which will host the 23rd edition of the World Corporate Games 2019."
				+"\n\n(a) Morocco\n(b) Saudi Arabia\n(c) Qatar \n(d) Jordan\n";
		s1=" Which team get the overall champions of 1st edition of North East Olympic Games 2018?"
				+"\n\n(a) Tripura\n(b) Nagaland\n(c) Manipur \n(d) Sikkim\n";
		s2=" Who won the 2018 Formula One driver's world championship?"
				+"\n\n(a) Kimi Raikkonen\n(b) Max Verstappen\n(c) Lewis Hamilton \n(d) Sebastian Vettel\n";
		s3=" Sultan Azlan Shah Cup is related to which among the following Sports?"
				+"\n\n(a) Badminton\n(b) Hockey\n(c) Table Tennis \n(d) Golf\n";
		s4=" Sachin Tendulkar hit his 100th international century against which among the following team?"
				+"\n\n(a) Sri Lanka\n(b) Bangladesh\n(c) Pakistan \n(d) South Africa\n";
		s5=" The word “Agricultural shot” is known to be used sometimes in which among the following sports?"
				+"\n\n(a) Cricket\n(b) Hockey\n(c) Golf \n(d) Polo\n";
		s6=" THE WORLD BENEATH HIS FEET is a Biography of?"
				+"\n\n(a) Pulela Gopichand\n(b) Nawab Pataudi\n(c) Ajit Wadekar \n(d) Sachin Tendulkar\n";
		s7=" Which among the following country is the host of 2018 Commonwealth Games?"
				+"\n\n(a) Canada\n(b) England\n(c) Australia \n(d) India\n";
		s8=" Murugappa Gold Cup is related to which among the following sports?"
				+"\n\n(a) Football\n(b) Hockey\n(c) Cricket \n(d) Table Tennis\n";
		s9=" On which among the following courts, Chennai Open is played ?"
				+"\n\n(a) Clay court\n(b) Grass Court\n(c) Hard Court \n(d) Carpet Court\n";
		Question_class Qc[]= {
				new Question_class(s0,"c"," (c) "),
			    new Question_class(s1,"c"," (c) "),
			    new Question_class(s2,"c"," (c) "),
			    new Question_class(s3,"b"," (b) "),
			    new Question_class(s4,"b"," (b) "),
			    new Question_class(s5,"a"," (a) "),
			    new Question_class(s6,"a"," (a) "),
			    new Question_class(s7,"c"," (c) "),
			    new Question_class(s8,"b"," (b) "),
			    new Question_class(s9,"c","(c) "),
				};
				return Qc;
	}
	public Question_class[] movie_questions() {
		String m0,m1,m2,m3,m4,m5,m6,m7,m8,m9;
		m0=" In this film's story, America is plagued by crime and overcrowded prisons. So, citizens are allowed to act out their murderous impulses for 12 hours once a year ?"
				+"\n\n(a) Scream \n(b) The Purge\n(c) The Devil�s Rejects  \n(d) Hostel\n";
		m1=" What was Dorothy's last name in The Wizard of OZ ?"
				+ "\n\n(a) Doll \n(b) Guild\n(c) Wolf\n(d) Gale\n";
		m2=" Which movie is famous for the line Say hello to my little friend ?"
				+ "\n\n(a) Scarface \n(b) The Godfather\n(c) American Gangster\n(d) PBugsy";
		
		m3=" After all, tomorrow is another day!\" was the last line in which Oscar-winning Best Picture?"
				+ "\n\n(a) Gone With the Wind \n(b) Great Expectations \n(c) Harold and Maude \n(d) The Matrix \n";
		m4=" Who is the only person to win an Oscar for Best Director for the only movie he ever directed?"
				+ "\n\n(a) Bob Fosse \n(b) Frank Borzage \n(c) Leo McCarey \n(d) Jerome Robbins\n";
		m5=" Who is the most nominated actor in Academy history?"
				+ "\n\n(a) Jack Nicholson \n(b) Laurence Olivier \n(c) Spencer Tracy \n(d) Paul Newman \n";
		m6=" What was the first Western to win the Academy Award for Best Picture?"
				+ "\n\n(a) Brokeback Mountain (2005) \n(b) Cimarron (1930/31) \n(c) The Last Wagon (1956) \n(d) Stagecoach (1939) \n";
		m7=" What was the first film to receive an Academy Award nomination in each of the performance categories?"
				+ "\n\n(a) A Streetcar Named Desire (1951) \n(b) The Color Purple (1985) \n(c) My Man Godfrey (1936) \n(d) The Turning Point (1997) \n";
		m8=" Which movie ends with this final line of dialogue: \"Why, she wouldn't even harm a fly\"?"
				+ "\n\n(a) Diabolique (1996) \n(b) Psycho (1960) \n(c) To Die For (1995) \n(d) Monster (2004) \n";
		m9=" The Loverliest Motion Picture of Them All\" was the tagline to which popular movie?"
				+ "\n\n(a) A Star Is Born (1954) \n(b) Les Girls (1957)\n(c) Let's Make Love (1960) \n(d) My Fair Lady (1964) \n";
		Question_class Qc[]= {
		new Question_class(m0,"b"," (b) "),
	    new Question_class(m1,"d"," (d) "),
	    new Question_class(m2,"a"," (a)  "),
	    new Question_class(m3,"a"," (a) "),
	    new Question_class(m4,"d"," (d)  "),
	    new Question_class(m5,"a"," (a) "),
	    new Question_class(m6,"b"," (b) "),
	    new Question_class(m7,"c"," (c) "),
	    new Question_class(m8,"b"," (b)  "),
	    new Question_class(m9,"d","(d)  "),
		};
		return Qc;
   }
	public Question_class[] Art_questions() {
		String a0,a1,a2,a3,a4,a5,a6,a7,a8,a9;
		a0=" Which one of these is an element of art?  "
				+"\n\n(a) Line \n(b) Rectangle \n(c) Painting   \n(d) None of these ";
		a1=" The three major categories of the visual arts are "
				+ "\n\n(a) painting, drawing, and photography.  \n(b) painting, drawing, and sculpture. \n(c) painting, sculpture, and architecture. \n(d) pictures, sculptures, and architecture. ";
		a2=" A picture of myself is called_ "
				+ "\n\n(a) Brush  \n(b) Me \n(c) Portrait \n(d) Selfportrait";
		a3=" Rainbow color order is:"
				+ "\n\n(a) ROYGBV   \n(b) RYOBGV \n(c) ROBGYV \n(d) RBYGOV ";
		a4=" I can cut and paste paper to make a  "
				+ "\n\n(a) collage   \n(b) college  \n(c) paper \n(d) papier";
		a5=" What is red? "
				+ "\n\n(a) line  \n(b) idk \n(c) color  \n(d) my favorite";
		a6=" What do you call a statue? "
				+ "\n\n(a) ugly  \n(b) sculpture \n(c) pretty \n(d) painting";
		a7=" Mixing the colors blue and red in equal proportion will produce which of the following hues? "
				+ "\n\n(a) maroon  \n(b) violet \n(c) orange \n(d) brown";
		a8=" Definitions of art in the twentieth and twenty-first centuries have gradually devalued primarily which of the following concepts or ideas? "
				+ "\n\n(a) technical skill  \n(b) artist agency \n(c) abstraction \n(d) beauty";
		a9=" Traditionally art has been defined as "
				+ "\n\n(a) wealth   \n(b) utility \n(c) representation  \n(d) well being";
		Question_class Qc[]= {
		new Question_class(a0,"a"," (a) "),
	    new Question_class(a1,"d"," (d) "),
	    new Question_class(a2,"d"," (d)   "),
	    new Question_class(a3,"a"," (a)    "),
	    new Question_class(a4,"a"," (a)  "),
	    new Question_class(a5,"c"," (c)   "),
	    new Question_class(a6,"b"," (b)   "),
	    new Question_class(a7,"b"," (b)   "),
	    new Question_class(a8,"d"," (d)   "),
	    new Question_class(a9,"c","(c)   "),
		};
		return Qc;
   }
	public Question_class[] Food_questions() {
		String f0,f1,f2,f3,f4,f5,f6,f7,f8,f9;
		f0=" A substance needed by the body for growth, energy, repair and maintenance iscalled a "
				+"\n\n(a) nutrient \n(b) carbohydrate \n(c) calorie  \n(d) fatty acid \n";
		f1=" Food passes through the stomach directly by"
				+ "\n\n(a) the large intestine \n(b) the small intestine \n(c) the heart \n(d) the pancreas \n";
		f2=" About half of your diet should be made up of ?"
				+ "\n\n(a) grains and vegetables \n(b) fruits and milk\n(c) milk and cheese\n(d) fats and sugars";
		
		f3=" Your body needs vitamins and minerals because  "
				+"\n\n(a) they give the body energy \n(b) they help carry out metabolic reactions \n(c) they insulate the body’s organs  \n(d) they withdraw heat from the body \n";
		f4=" A mineral that the body needs to work properly is"
				+ "\n\n(a) calcium \n(b) silver \n(c) gold \n(d) lead \n";
		f5=" About half of your diet should be made up of ?"
				+ "\n\n(a) grains and vegetables \n(b) fruits and milk\n(c) milk and cheese\n(d) fats and sugars";
		f6=" Which of these is NOT considered a nutrient?"
				+ "\n\n(a) vitamins \n(b) minerals \n(c) fiber \n(d) fats";
		f7=" Citrus fruits are an excellent source of"
				+ "\n\n(a) calcium \n(b) vitamin c \n(c) vitamin B \n(d) calories";
		f8=" The milk, cheese & yogurt group are important for "
				+ "\n\n(a) strong bones \n(b) teeth \n(c) muscles \n(d) all of the above";
		f9=" How many servings of vegetables do we need each day"
				+ "\n\n(a) 6-11 \n(b) 2-3 \n(c) 3-5 \n(d) 1-2";
		Question_class Qc[]= {
		new Question_class(f0,"a"," (a) "),
	    new Question_class(f1,"b"," (b) "),
	    new Question_class(f2,"a"," (a)  "),
	    new Question_class(f3,"b"," (b)  "),
	    new Question_class(f4,"a"," (a) "),
	    new Question_class(f5,"a"," (a) "),
	    new Question_class(f6,"c"," (c) "),
	    new Question_class(f7,"b"," (b) "),
	    new Question_class(f8,"d"," (d) "),
	    new Question_class(f9,"c","(c) "),
		};
		return Qc;
   }
	public Question_class[] History_questions() {
		String h0,h1,h2,h3,h4,h5,h6,h7,h8,h9;
		h0="  The longest balloon in the Macy's Thanksgiving Day Parade is:"
				+"\n\n(a) Spiderman \n(b) Superman \n(c) Wonder Woman  \n(d) Barney the Dinosaur \n";
		h1=" Wild turkeys can fly at speeds of up to "
				+ "\n\n(a) 10 mph \n(b) 25 mph \n(c) 55 mph \n(d) 70 mph \n";
		h2=" The first department store to hold a Thanksgiving parade was"
				+ "\n\n(a) Macy's \n(b) Montgomery Wards \n(c) J.C. Penny's \n(d) Gimbel's \n";
		h3=" Which president declared Thanksgiving a National Holiday?"
				+ "\n\n(a) George Washington \n(b) Abe Lincoln \n(c) J.C. Andrew Jackson \n(d) Ulysses S. Grant \n";
		h4=" How many places in the United States are named Turkey?"
				+ "\n\n(a) 2 \n(b) 3 \n(c) 4 \n(d) 5 \n";
	    h5=" Where was the first Thanksgiving celebrated?"
				+ "\n\n(a) Dover \n(b) New York \n(c) Plymouth \n(d) Boston \n";
		h6=" How long did the first Thanksgiving last?"
				+ "\n\n(a) 2 days \n(b) 1 day \n(c) 3 days \n(d) 1 month \n";
		h7=" Canada's birthday is on:"
				+ "\n\n(a) July 1st \n(b) July 4th \n(c) July 6th \n(d) July 8th \n";
		
		h8=" The population of Canada in 2015 was almost:"
				+ "\n\n(a) almost 16 million \n(b) almost 26 million \n(c) almost 36 million \n(d) almost 46 million \n";
		h9=" The capital city of Canada is:"
				+ "\n\n(a) Montreal \n(b) Ottawa \n(c) Toronto \n(d) Vancouver \n";
		Question_class Qc[]= {
		new Question_class(h0,"b"," (b) "),
	    new Question_class(h1,"c"," (c) "),
	    new Question_class(h2,"d"," (d)  "),
	    new Question_class(h3,"b"," (b)  "),
	    new Question_class(h4,"c"," (c) "),
	    new Question_class(h5,"c"," (c) "),
	    new Question_class(h6,"c"," (c) "),
	    new Question_class(h7,"a"," (a)  "),
	    new Question_class(h8,"c"," (c)  "),
	    new Question_class(h9,"b","(b)  "),
		};
		return Qc;
   }
	public Question_class[] Animal_questions() {
		String h0,h1,h2,h3,h4,h5,h6,h7,h8,h9;
		h0=" What color are zebras?"
				+"\n\n(a) White with black stripes \n(b) Black with white stripes. \n(c) Both of the above.s  \n(d)  None of the above.\n";
		h1=" What is the fastest water animal?"
				+ "\n\n(a) Porpoise \n(b) Sailfish \n(c) Flying fish \n(d) Tuna \n";
		h2=" What are female elephants called?"
				+ "\n\n(a) Mares \n(b) Sows \n(c) Cows \n(d) Dams ";
		h3=" What pets do more families own?"
				+ "\n\n(a) Birds \n(b) Cats \n(c) Dogs \n(d) Horses ";
		h4=" Which animal eats meat?"
				+ "\n\n(a) Rabbit \n(b) Ant \n(c) Lion \n(d) Panda ";
	    h5=" Animals which hunt at night and can see in dark nights are"
				+ "\n\n(a) cats \n(b) owl \n(c) fox \n(d) all of them ";
		h6=" Animals which are active in night time are called"
				+ "\n\n(a) wild animals \n(b) pets \n(c) nocturnal animals \n(d) tame animals ";
	    h7=" Turtle can swim in water by its"
				+ "\n\n(a) shell \n(b) body \n(c) flippers \n(d) mouth ";
		h8=" Aquatic animals breath in water through their"
				+ "\n\n(a) lungs \n(b) gills \n(c) nostrils \n(d) nose ";
		h9=" Which living bird lays the world's smallest egg?"
				+ "\n\n(a) Hornbill \n(b) Bee Humming Bird  \n(c) Gulls \n(d) Woodpecker ";
		Question_class Qc[]= {
		new Question_class(h0,"b"," (b) "),
	    new Question_class(h1,"b"," (b) "),
	    new Question_class(h2,"c"," (c)  "),
	    new Question_class(h3,"b"," (b) "),
	    new Question_class(h4,"c"," (c)  "),
	    new Question_class(h5,"d"," (d) "),
	    new Question_class(h6,"c"," (c)  "),
	    new Question_class(h7,"c"," (c) "),
	    new Question_class(h8,"b"," (b)  "),
	    new Question_class(h9,"b","(b)  "),
		};
		return Qc;
   }
	public Question_class[] computer_questions() {
		String h0,h1,h2,h3,h4,h5,h6,h7,h8,h9;
		h0=" Which is most common language used in web designing ?"
				+"\n\n(a) C \n(b) HTML \n(c) C++ \n(d) PHP \n";
		h1=" Who is also known as Father of Computer ?"
				+ "\n\n(a) Vint Cerf \n(b) Tim Berner Lee \n(c) Charles Babbage \n(d) Steve Jobs \n";
		h2=" Which among following is commonly used language in Android applications ?"
				+ "\n\n(a) PHP \n(b) C\n(c) C++\n(d) Java";
		h3=" Where are saved files stored in computer ?"
				+ "\n\n(a) RAM \n(b) Hard Disk \n(c) Cache \n(d) All of Above";
		h4=" Which operations are performed by RAM ?"
				+ "\n\n(a) Read \n(b) Write \n(c) Read and Write \n(d) Depends on computer";
		h5=" Which among following is secondary storage device ?"
				+ "\n\n(a) Hard Disk \n(b) RAM \n(c) Diode \n(d) Semi Conductor";
		h6=" USB is which type of storage device ?"
				+ "\n\n(a) Primay \n(b) Secondary \n(c) Tertiary \n(d) None of above ";
		
		h7=" MPG is an file extension of which type of files ?"
				+ "\n\n(a) Audio \n(b) Image \n(c) Video \n(d) Flash";
		h8=" What is used to make computer chips ?"
				+ "\n\n(a) Copper \n(b) Steel \n(c) Silicon \n(d) Iron";
		h9=" Which component of computer is also considered as it Heart ?"
				+ "\n\n(a) Monitor \n(b) Keyboard \n(c) Scanner \n(d) Microprocessor";
		Question_class Qc[]= {
		new Question_class(h0,"b"," (b) "),
	    new Question_class(h1,"c"," (c)  "),
	    new Question_class(h2,"d"," (d)  "),
	    new Question_class(h3,"b"," (b)  "),
	    new Question_class(h4,"c"," (c) "),
	    new Question_class(h5,"a"," (a)  "),
	    new Question_class(h6,"c"," (c)  "),
	    new Question_class(h7,"c"," (c)  "),
	    new Question_class(h8,"c"," (c)  "),
	    new Question_class(h9,"d","(d)  "),
		};
		return Qc;
   }
	public Question_class[] geo_questions() {
		String h0,h1,h2,h3,h4,h5,h6,h7,h8,h9;
		h0=" How many Canadian provinces do not have marine coastlines?"
				+"\n\n(a) 1 \n(b) 2\n(c) 3  \n(d) 4 \n";
		h1=" The glacial feature in northwestern Manitoba is a"
				+ "\n\n(a) Esker \n(b) Drumlin \n(c) End moraine \n(d) cirque \n";
		h2=" Île René-Levasseur, a Québec island which can be seen from space, is located in"
				+ "\n\n(a) St. Lawrence Seaway \n(b) Manicouagan Reservoir \n(c) Ungava Bay \n(d) James Bay ";
	    h3=" Which of the following elements is not mined in Canada"
				+"\n\n(a) Aluminum \n(b) Copper \n(c) Molybdenum  \n(d) zinc \n";
		h4=" The border between Alberta and Saskatchewan follows which line of longitude?"
				+"\n\n(a) 49W \n(b) 60W \n(c) 230W  \n(d) 110W \n";
		h5=" Which Canadian province does not adopt Daylight Saving Time?"
				+"\n\n(a) Newfoundland and Labrador \n(b) New Brunswick \n(c) Manitoba  \n(d) Saskatchewan \n";
	    h6=" Skunks are not native to any part of:"
				+"\n\n(a) Newfoundland and Labrador \n(b) British Columbia \n(c) Northwest Territories  \n(d) Saskatchewan \n";
	    h7=" Environment Canada requires a blizzard to have sustained wind speeds of at least:"
				+"\n\n(a) 100 km/hr \n(b) 75 km/hr \n(c) 20 km/hr  \n(d) 40 km/hr \n";
	    h8=" What is the name of Canada's capital?"
				+"\n\n(a) Vancouver \n(b) Manitoba \n(c) Ottawa  \n(d) Ontario \n";
		h9=" What two colors are in the Canadian flag?"
				+"\n\n(a) White And Red  \n(b) Black And White \n(c) White  \n(d) Red \n";
		Question_class Qc[]= {
		new Question_class(h0,"b"," (b) "),
	    new Question_class(h1,"a"," (a) "),
	    new Question_class(h2,"b"," (b)  "),
	    new Question_class(h3,"a"," (a) "),
	    new Question_class(h4,"d"," (d) "),
	    new Question_class(h5,"d"," (d) "),
	    new Question_class(h6,"a"," (a) "),
	    new Question_class(h7,"d"," (d) "),
	    new Question_class(h8,"c"," (c) "),
	    new Question_class(h9,"a","(a) "),
		};
		return Qc;
	}
}
