import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertEx {

	private static final String SQL = "insert into users values(?,?,?,?)";
	private static Connection conn;

	private static PreparedStatement pstm;

	public static void main(String[] args) {

		// 1. DB����
		conn = DBConnection.getconConnection();
		try {
			// 2. Query �ۼ�
			pstm = conn.prepareStatement(SQL);
			// 3. Query �ϼ�
			// id name email password
			pstm.setInt(1, 2);
			pstm.setString(2, "ȫ�浿");
			pstm.setString(3, "hong@nate.com");
			pstm.setString(4, "1234");

			// 4. Query ����
			pstm.executeUpdate();
			System.out.println("Insert ����");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Insert ����");
		}

	}

}
