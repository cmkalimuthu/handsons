package interfaceSeg;

public class ProcessOrderClass implements ProcessOrder{

	@Override
	public void printorder(String modelname) {
			System.out.println("order accepted "+modelname);
	}
		
}
