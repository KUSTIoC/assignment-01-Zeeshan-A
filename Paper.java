public class Paper
	{
			private String Papertitle;
			private String Paperid;
			private String Exametype;
			private String Invigilator;
			private String Location;
			private boolean isCollected;
			private int Numberofstudents;
			
				
	Paper(String Papertitle,String Paperid,String Exametype,String Invigilator,
		String Location,boolean isCollected,int Numberofstudents)
			{
				this.Papertitle=Papertitle;
				this.Paperid=Paperid;
				this.Exametype=Exametype;
				this.Invigilator=Invigilator;
				this.Location=Location;
				this.isCollected=isCollected;
				this.Numberofstudents=Numberofstudents;
				
			}
			public String getPT()
				{
					return Papertitle;
				}
			
			public String getPI()
				{
					return Paperid;
				}
			
			
			public String getET()
				{
					return Exametype;
				}

			public String getInv()
				{
					return Invigilator;
				}

			public String getLoc()
				{
					return Location;
				}

			public void setIsCollected(boolean x)
				{
					isCollected=x;
				}

			public boolean getIsCollected()
				{
					return isCollected;
				}

			public int getNoS()
				{
					return Numberofstudents;
				}

			public String toString()
			
				{
					return "Paper Titel:\t"+ Papertitle 
					+ "\nPaper ID:\t"+ Paperid 
					+ "\nExam Type:\t" + Exametype 
					+ "\nInvigilator:\t" + Invigilator 
					+ "\nPaper Location:\t" +Location 
					+ "\nPaper Collected:\t" + isCollected
					+ "\nNumber of Students:\t" + Numberofstudents; 
				}
				
		 	
	}
