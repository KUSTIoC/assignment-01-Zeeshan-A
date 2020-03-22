import java.util.Scanner;
public class Papertest
	{
		public static void main(String[] args)
		{
			Paper obj1=new Paper ("Java Basics","CS213","Mid Term","Sir Ali Zeb","KUST university", false,65);
			Paper obj2=new Paper ("Islamyat","CS101","Mid Term","Sir Saqib Ali","KUST university", false,65);
			Paper obj3=new Paper ("English","CS313","Mid Term","Sir Nasar Khan","KUST university", false,65);
			
			Course C1=new Course("Java Fundamentals", "CS213", "BS CS", "Fall 2019 2nd Semester");
			Course C2=new Course("Islamyat", "CS101", "BS CS", "Fall 2019 2nd Semester");

			date ob1=new date("null","null");
			Scanner input=new Scanner(System.in);
			System.out.println("please Enter Date and Time for JavaPaper");
			String Date;
			String Time;
			Date=input.nextLine();System.out.println("Time Please:");
			Time=input.nextLine();
			ob1.putDA(Date);
			ob1.putTi(Time);
			

			date ob2=new date("null","null");
			Scanner input1=new Scanner(System.in);
			System.out.println("please Enter Date and Time for Islamyat Paper");
			Date=input1.nextLine();System.out.println("Time Please:");
			Time=input.nextLine();
			ob2.putDA(Date);
			ob2.putTi(Time);			
	
			date ob3=new date("null","null");
			Scanner input2=new Scanner(System.in);
			System.out.println("please Enter Date and Time for English Paper");
			Date=input2.nextLine();System.out.println("Time Please:");
			Time=input2.nextLine();
			ob3.putDA(Date);
			ob3.putTi(Time);

			System.out.println("--------------------------------------"+C1);
			ob1.getDate();
			System.out.println(obj1+"\n--------------------------------------"+C2);
			ob2.getDate();
			System.out.println(obj2+"\n--------------------------------------");
			ob3.getDate();
			System.out.println(obj3);
			

			
		}
	}