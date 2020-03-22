public class date
	{
		private String Date;
		private String Time;
	
	date(String d,String t)
		{
			this.Date=Date;
			this.Time=Time;
		
		}
		
		public void putDA(String a)
			{
				Date=a;
			}
		public void putTi(String a)
			{
				Time=a;
			}
		
		public void getDate()
			{
				System.out.println("Paper Date:\t" + Date);
				System.out.println("Paper Time:\t" + Time );
			}
		}