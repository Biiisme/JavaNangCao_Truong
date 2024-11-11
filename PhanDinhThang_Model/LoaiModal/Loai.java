package LoaiModal;

public class Loai {
	private String maloai;
    private int tinCount;

	public int getTinCount() {
		return tinCount;
	}

	public void setTinCount(int tinCount) {
		this.tinCount = tinCount;
	}

	public String getMaloai() {
		return maloai;
	}

	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}

	public Loai(String maloai , int tincount) {
		super();
		this.maloai = maloai;
		this.tinCount=tincount;
	}

	public Loai() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
