package LoaiModal;

import java.sql.SQLException;
import java.util.ArrayList;

public class LoaiBo {
	LoaiDao lDao = new LoaiDao();
	ArrayList<Loai>ds;
	public ArrayList<Loai> getLoai() throws ClassNotFoundException, SQLException{
		ds = lDao.getLoai();
		return ds;
	}
}
