package chainOfResponsiblity;

public interface LeaveRequestHandler {	
	public void HandleRequest(LeaveRequest leaverequest);
	public void setNextHandler(LeaveRequestHandler nextHandler);
	      

}
