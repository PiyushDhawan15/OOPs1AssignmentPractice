package greatlearning.department.Super;
import java.util.Scanner;

import greatlearning.department.Admin.Adminclass;
import greatlearning.department.Hr.HrClass;
import greatlearning.department.Tech.TechClass;

public class SuperClass {
	public String departmentName;
    public SuperClass(String departmentName, String todaysWork, String workDeadline, String isTodayAHoliday) {
		super();
		this.departmentName = departmentName;
		TodaysWork = todaysWork;
		WorkDeadline = workDeadline;
		this.isTodayAHoliday = isTodayAHoliday;
	}
	
		// TODO Auto-generated constructor stub
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getTodaysWork() {
		return TodaysWork;
	}
	public void setTodaysWork(String todaysWork) {
		TodaysWork = todaysWork;
	}
	public String getWorkDeadline() {
		return WorkDeadline;
	}
	public void setWorkDeadline(String workDeadline) {
		WorkDeadline = workDeadline;
	}
	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}
	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}
	public String TodaysWork;
    public String WorkDeadline;
    public String isTodayAHoliday;
    

public static void main (String arg[]) {
	SuperClass Super  = new SuperClass("SuperDepartment ","No Work as of now ","Nil","Today is not a holiday ");
	Scanner input= new Scanner(System.in);
	Super.getDepartmentName();
	System.out.println ("SuperDepartment");
	
	Adminclass adminclass = new Adminclass(null, null, null, null);
	adminclass.departmentName();
	adminclass.TodaysWork();
	adminclass.WorkDeadline();
	
	HrClass hrclass = new HrClass (null,null,null,null);
	hrclass.departmentName();
	hrclass.TodaysWork();
	hrclass.Workdeadline();
	hrclass.doActivity();
    
	TechClass Techclass = new TechClass (null, null,null,null);
	Techclass.departmentName();
	Techclass.TodaysWork();
	Techclass.WorkDeadline();
	Techclass.TechStackinformation ();
	
	

};
}

