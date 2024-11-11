package BaoModal;

public class Bao {
	private String mabao;
	private String tieude;
	private String ngay;
	private String tomtat;
	private String noidung;
	private String maloai;
	public String getMabao() {
		return mabao;
	}
	public void setMabao(String mabao) {
		this.mabao = mabao;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getNgay() {
		return ngay;
	}
	public void setNgay(String ngay) {
		this.ngay = ngay;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	
	public Bao(String mabao, String tieude, String ngay, String tomtat, String noidung, String maloai) {
		super();
		this.mabao = mabao;
		this.tieude = tieude;
		this.ngay = ngay;
		this.tomtat = tomtat;
		this.noidung = noidung;
		this.maloai = maloai;
	}
	public String getTomtat() {
		return tomtat;
	}
	public void setTomtat(String tomtat) {
		this.tomtat = tomtat;
	}
	public Bao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
