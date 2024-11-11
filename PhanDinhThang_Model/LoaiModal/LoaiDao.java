package LoaiModal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import KetNoiModel.KetNoi;



public class LoaiDao {
	public ArrayList<Loai> getLoai() throws SQLException, ClassNotFoundException {
	    ArrayList<Loai> ds = new ArrayList<Loai>();
	    KetNoi kn = new KetNoi();
	    kn.ketnoi();

	    // Truy vấn SQL mới để lấy số lượng tin theo từng loại
	    String sql = "SELECT maloai, COUNT(*) AS tinCount FROM Bao GROUP BY maloai";
	    PreparedStatement cmd = kn.cn.prepareStatement(sql);
	    ResultSet rs = cmd.executeQuery();

	    while (rs.next()) {
	        // Lấy mã loại (maloai) và số lượng tin (tinCount)
	        String maloai = rs.getString("maloai");
	        int tinCount = rs.getInt("tinCount");

	        // Giả sử lớp Loai có constructor để nhận cả maloai và tinCount
	        ds.add(new Loai(maloai, tinCount));
	    }

	    rs.close();
	    kn.cn.close();
	    return ds;
	}

}
