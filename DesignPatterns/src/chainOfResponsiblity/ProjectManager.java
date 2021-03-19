package chainOfResponsiblity;

public class ProjectManager implements LeaveRequestHandler{
	
	private LeaveRequestHandler NextHandler;
	
	public void HandleRequest(LeaveRequest leaverequest) {
		int leavedays=leaverequest.getLeaveDays();
		if(leavedays>3 && leavedays<=5)
		System.out.println("Request handled by project Manager");
		else
			NextHandler.HandleRequest(leaverequest);
	}

	@Override
	public void setNextHandler(LeaveRequestHandler NextHandler) {
		// TODO Auto-generated method stub
		this.NextHandler=NextHandler;
		
	}
}
