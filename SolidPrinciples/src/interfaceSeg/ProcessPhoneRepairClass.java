package interfaceSeg;

public class ProcessPhoneRepairClass implements ProcessPhoneRepair {

	@Override
	public void printphone(String modelname) {
		System.out.println("Repair accepted "+modelname);
	}
	
}
