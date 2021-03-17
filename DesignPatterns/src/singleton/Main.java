package singleton;

public class Main {
	public static void main(String[] args) {
		
		DBconn db=DBconn.getInstance();
		System.out.println(db);
		
	
     }
	
}
