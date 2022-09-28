package greatlearning.department.Tech;

import greatlearning.department.Super.SuperClass;

public class TechClass extends SuperClass{

	private static final String TechStackinformation  = null;
	public TechClass(String departmentName, String todaysWork, String workDeadline, String isTodayAHoliday) {
		super(departmentName, todaysWork, workDeadline, isTodayAHoliday);
		// TODO Auto-generated constructor stub
		
//	public String TechStackinformation() {
		//	this.getTechStackinformation = "Java core";
			
		
	}
	public String departmentName() {
		System.out.println("Welocme to Tech  Department ");
    	 return departmentName;
    			 
     };
    public String TodaysWork() {
    	System.out.println ("Complete coding of Module 1 ");
    	return TodaysWork;
    };
   public  String  WorkDeadline() {
    	System.out.println(" Complete by EOD");
    	return WorkDeadline;
    }
    public String TechStackinformation( ) {
    	System.out.println ("Core Java");
    	return TechStackinformation ;
    }
}
