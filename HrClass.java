package greatlearning.department.Hr;

import greatlearning.department.Super.SuperClass;

public class HrClass extends SuperClass {

	public HrClass(String departmentName, String todaysWork, String workDeadline, String isTodayAHoliday) {
		super(departmentName, todaysWork, workDeadline, isTodayAHoliday);
		// TODO Auto-generated constructor stub
	}
		public String departmentName() 
		{
			System.out.println("Welocme to HR department ");
			
			return departmentName;
			
		}
		public String doActivity()
		{
			System.out.println("Team Lunch");
		return TodaysWork;
		}
		
		public String TodaysWork()
		{
		System.out.println("Fill today's timesheet and mark your attendance");
		return TodaysWork;
		}
	

      public String Workdeadline () {
      System.out.println("Complete by EOD");
      return WorkDeadline;
      
		
	}
      public String doActivity () {
      System.out.println("team Lunch ");
      return doActivity();
}
      }
