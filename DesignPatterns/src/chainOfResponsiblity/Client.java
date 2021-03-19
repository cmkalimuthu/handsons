package chainOfResponsiblity;

public class Client {

	public static void main(String[] args) {

		LeaveRequest r=new LeaveRequest();
		r.setEmployeeName("kali");
		r.setLeaveDays(6);
		LeaveRequestHandler supervisor=new Supervisor();
		LeaveRequestHandler projectmanager=new ProjectManager();
		LeaveRequestHandler Hr=new Hr();
		
		supervisor.setNextHandler(projectmanager);
		projectmanager.setNextHandler(Hr);
		
		supervisor.HandleRequest(r);
		
	
		
	}

}
