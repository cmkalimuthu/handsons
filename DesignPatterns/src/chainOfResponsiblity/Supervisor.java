package chainOfResponsiblity;

public class Supervisor implements LeaveRequestHandler{
	
	private LeaveRequestHandler NextHandler;

	public void HandleRequest(LeaveRequest leaverequest) {
		int leavedays=leaverequest.getLeaveDays();
		if(leavedays>=1 && leavedays<3)
		System.out.println("Request handled by Supervisor");
		else
			NextHandler.HandleRequest(leaverequest);
	}

	@Override
	public void setNextHandler(LeaveRequestHandler NextHandler) {
		// TODO Auto-generated method stub
		this.NextHandler=NextHandler;
		
	}
}
