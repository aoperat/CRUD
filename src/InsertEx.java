import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertEx {

	private static final String SQL = "insert into users values(?,?,?,?)";
	private static Connection conn;

	private static PreparedStatement pstm;

	public static void main(String[] args) {

		// 1. DB연결
		conn = DBConnection.getconConnection();
		try {
			// 2. Query 작성
			pstm = conn.prepareStatement(SQL);
			// 3. Query 완성
			// id name email password
			pstm.setInt(1, 2);
			pstm.setString(2, "홍길동");
			pstm.setString(3, "hong@nate.com");
			pstm.setString(4, "1234");

			// 4. Query 실행
			pstm.executeUpdate();
			System.out.println("Insert 성공");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Insert 실패");
		}

	}

}
