package com.levent;

public class Uye {
	
	private int id;
	private String uyeAdi;
	private String eMail;
	private String sifre;
	private String tel;
	public int length;
	
	public Uye(int id, String uyeAdi, String eMail, String sifre, String tel) {
		super();
		this.id = id;
		this.uyeAdi = uyeAdi;
		this.eMail = eMail;
		this.sifre = sifre;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUyeAdi() {
		return uyeAdi;
	}

	public void setUyeAdi(String uyeAdi) {
		this.uyeAdi = uyeAdi;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Uye [id=" + id + ", uyeAdi=" + uyeAdi + ", eMail=" + eMail + ", sifre=" + sifre + ", tel=" + tel + "]";
	}
	
	
	
	
	
	
}
