
public class ElectricityBill {
	private String ConsumerNumber;
	private String ConsumerAddress;
	private String ConsumerName;
	private int UnitsConsumed;
	private double BillAmount;
	public String getConsumerNumber() {
		return ConsumerNumber;
	}
	public void setConsumerNumber(String consumerNumber) {
		ConsumerNumber = consumerNumber;
	}
	public String getConsumerAddress() {
		return ConsumerAddress;
	}
	public void setConsumerAddress(String consumerAddress) {
		ConsumerAddress = consumerAddress;
	}
	public int getUnitsConsumed() {
		return UnitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		UnitsConsumed = unitsConsumed;
	}
	public double getBillAmount() {
		return BillAmount;
	}
	public void setBillAmount(double billAmount) {
		BillAmount = billAmount;
	}
	
	public String getConsumerName() {
		return ConsumerName;
	}
	public void setConsumerName(String consumerName) {
		ConsumerName = consumerName;
	}
	public void calculateBillAmount() {
		BillAmount=0;
		int tempUnits=UnitsConsumed;
		
		if(tempUnits>100) {
			tempUnits-=100;
			if(tempUnits>200) {
				tempUnits-=200;
				BillAmount+=200*1.5;
				if(tempUnits>300) {
					tempUnits-=300;
					BillAmount+=300*3.5;
					if(tempUnits>400) {
						tempUnits-=400;
						BillAmount+=400*5.5;
						BillAmount+=400*5.5;
						BillAmount+=tempUnits*7.5;
					}
					else {
						BillAmount+=tempUnits*5.5;
					}
					
				}
				else {
					BillAmount+=tempUnits*3.5;
				}
			}
			else {
				BillAmount+=tempUnits*1.5;
			}
			
		}
		else {
			BillAmount+=tempUnits*1.20;
		}
		
		
		
	}
	

}
