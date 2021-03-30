import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException{

		ElectricityBoard eb=new ElectricityBoard();
		List<ElectricityBill> billList=eb.generateBill("ElectricityBill1.txt");
		System.out.println("Bills parsed from file");
		for(ElectricityBill bill:billList) {
			System.out.println(
					bill.getConsumerNumber()+" "+bill.getConsumerName()+" "+bill.getConsumerAddress()+" "+bill.getUnitsConsumed());
		}

		eb.addBill(billList);
		try {
			DBHandler db=new DBHandler(); 
			Connection con=db.establishConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select* from ElectricityBill");
			while(rs.next()) {
				String ConsumerNumber=rs.getString(1);
				String ConsumerName=rs.getString(2);
				String ConsumerAddress=rs.getString(3);
				int ConsumedUnits=rs.getInt(4);
				float billAmount=rs.getFloat(5);
				System.out.println(String.format("id: %s, name: %s, address: %s, units: %d, bill: %f",
						ConsumerNumber,ConsumerName,ConsumerAddress,ConsumedUnits,billAmount));
			}
				
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
