import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteEx {

	private final static String SQL = "delete from users where id = ?";
	private static Connection conn;
	
	private static PreparedStatement pstm;
	
	public static void main(String[] args) {
		conn = DBConnection.getconConnection();
		try {
			
			pstm = conn.prepareStatement(SQL);
			
			pstm.setInt(1, 2);
			
			pstm.executeUpdate();
			
			
			System.out.println("DELETE 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DELETE 실패");
		}
		
	}
}
