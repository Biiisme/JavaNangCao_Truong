package BaoModal;

import java.sql.SQLException;
import java.util.ArrayList;

public class BaoBo {
	BaoDao bDao = new BaoDao();
	ArrayList<Bao> ds ;
	public ArrayList<Bao> getBao() throws ClassNotFoundException, SQLException{
		ds = bDao.getBao();
		return ds;
	}
	
	public ArrayList<Bao> timkiem(String keysearch) throws ClassNotFoundException, SQLException{
		ArrayList<Bao> temp = new ArrayList<Bao>();
		ds = bDao.getBao();
		for(Bao bao :ds) {
			if(bao.getTomtat().toLowerCase().trim().contains(keysearch.toLowerCase().trim()) || bao.getTieude().toLowerCase().trim().contains(keysearch.toLowerCase().trim()) ) {
				temp.add(bao);
			}
		}
		return temp;
	}
	
}
