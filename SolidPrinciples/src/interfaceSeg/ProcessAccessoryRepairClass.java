package interfaceSeg;

public class ProcessAccessoryRepairClass implements ProcessAccessoryRepair{

	@Override
	public void printaccessory(String accesstype) {
		System.out.println("Accessory Repair accepted "+accesstype);
	}

}
