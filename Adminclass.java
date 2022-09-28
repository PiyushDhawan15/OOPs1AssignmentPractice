package greatlearning.department.Admin;

import greatlearning.department.Super.SuperClass;

public class Adminclass extends SuperClass{
     

	public Adminclass(String departmentName, String todaysWork, String workDeadline, String isTodayAHoliday) {
		super(departmentName, todaysWork, workDeadline, isTodayAHoliday);
		// TODO Auto-generated constructor stub
	}
	public String departmentName() {
		System.out.println("Welocme to Admin Department ");
    	 return departmentName;
    			 
     };
    public String TodaysWork() {
    	System.out.println ("Complete your document submission ");
    	return TodaysWork;
    };
   public  String  WorkDeadline() {
    	System.out.println(" Complete by EOD");
    	return WorkDeadline;
    }

	
	};

