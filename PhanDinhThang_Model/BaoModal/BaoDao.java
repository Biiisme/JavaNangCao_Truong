package BaoModal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import KetNoiModel.KetNoi;


public class BaoDao {
	public ArrayList<Bao> 	getBao() throws ClassNotFoundException, SQLException{
		ArrayList<Bao> ds = new ArrayList<Bao>();
		KetNoi kn = new KetNoi();
		kn.ketnoi();
		String sql = "select * from Bao";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs =cmd.executeQuery();
		while(rs.next()) {
			ds.add(new Bao(rs.getString("matin"),rs.getString("tieude"),rs.getString("ngayduatin"), rs.getString("Tomtat"), rs.getString("noidung"),rs.getString("maloai")));
		}
		rs.close();
		kn.cn.close();
		return ds;
		
	} 
}
