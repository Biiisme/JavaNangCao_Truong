package KetNoiModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoi {
	public Connection cn;
	public void ketnoi() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url="jdbc:sqlserver://BII:1433;databaseName=BaoChi;user=sa; password=19022003";
		cn=DriverManager.getConnection(url);
		System.out.print("Connectted!!");
	}
}
