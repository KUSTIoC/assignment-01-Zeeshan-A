public class Course

	{
		private static String Coursename;
		private String Cousrecode;
		private String Programname;
		private String Semester;
		
	Course(String Coursename, String Cousrecode,String Programname, String Semester)
		{
			this.Coursename=Coursename;
			this.Cousrecode=Cousrecode;
			this.Programname=Programname;
			this.Semester=Semester;
		}
	
			public String getCName()
			{
				return Coursename;
			}
			
			public void setCC(String a)
			{
				Cousrecode=a;
			}
			public String getCC()
			{
				return Cousrecode;
			}
		

			public String toString()
			{
				return "\nCourse Name:\t" + Coursename 
				+ "\nCourse Code:\t" + Cousrecode
				+ "\nProgram Name:\t" + Programname
				+ "\nSemester: \t" + Semester;
			}
		}