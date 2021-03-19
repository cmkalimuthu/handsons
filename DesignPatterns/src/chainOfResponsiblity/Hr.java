package chainOfResponsiblity;

public class Hr implements LeaveRequestHandler{
	
	private LeaveRequestHandler NextHandler;
	public void HandleRequest(LeaveRequest leaverequest) {
		int leavedays=leaverequest.getLeaveDays();
		if(leavedays>5)
		System.out.println("Request handled by  Hr");
		else
			System.out.println("Leave request denied");
	}

	@Override
	public void setNextHandler(LeaveRequestHandler NextHandler) {
		// TODO Auto-generated method stub
		this.NextHandler=NextHandler;
		
	}
}
