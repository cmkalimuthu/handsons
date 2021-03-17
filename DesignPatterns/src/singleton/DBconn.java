package singleton;
public class DBconn {

		private static DBconn con=new DBconn();
		/*no matter how many objects of the class are created,
		 *  there is only one copy of the static member*/
        private DBconn() {
        	
        }
        /*constructor wont be accessible outside of your class 
        so other classes wont be able to call it*/
	  
		public static DBconn getInstance()  {
	
	     /*clone method to create a copy of object without new operator*/
	     return con;	
		}
		
		
	}

