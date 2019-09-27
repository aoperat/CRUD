import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateEx {

	private static final String SQL = "update users set name  = ? where id = ?";
	private static Connection conn;
	private static PreparedStatement pstm;

	public static void main(String[] args) {

		conn = DBConnection.getconConnection();

		try {
			pstm = conn.prepareStatement(SQL);
			pstm.setString(1, "mos");
			pstm.setInt(2, 1);

			pstm.executeUpdate();

			System.out.println("업데이트 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("업데이트 실패");
		}

	}
}
