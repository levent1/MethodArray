package com.levent;

public class Arac {
	private int id;
	private String aracMarka;
	private String aracModel;
	private String aracKm;
	private String kazaDurumu;
	private String tipi;
	private int	fiyat;
	
	public Arac(int id,  String aracMarka, String aracModel, String aracKm, String kazaDurumu, String tipi,int fiyat) {
		super();
		this.id=id;
		this.aracMarka = aracMarka;
		this.aracModel = aracModel;
		this.aracKm = aracKm;
		this.kazaDurumu = kazaDurumu;
		this.tipi = tipi;
		this.fiyat=fiyat;
	}

	public String getAracMarka() {
		return aracMarka;
	}

	public void setAracMarka(String aracMarka) {
		this.aracMarka = aracMarka;
	}

	public String getAracModel() {
		return aracModel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAracModel(String aracModel) {
		this.aracModel = aracModel;
	}

	public String getAracKm() {
		return aracKm;
	}

	public void setAracKm(String aracKm) {
		this.aracKm = aracKm;
	}

	public String getKazaDurumu() {
		return kazaDurumu;
	}

	public void setKazaDurumu(String kazaDurumu) {
		this.kazaDurumu = kazaDurumu;
	}

	public String getTipi() {
		return tipi;
	}

	public void setTipi(String tipi) {
		this.tipi = tipi;
	}
	
	public Arac() {
		super();
	}

	public int getFiyat() {
		return fiyat;
	}

	@Override
	public String toString() {
		return "Arac [id=" + id + ", aracMarka=" + aracMarka + ", aracModel=" + aracModel + ", aracKm=" + aracKm
				+ ", kazaDurumu=" + kazaDurumu + ", tipi=" + tipi + ", fiyat=" + fiyat + "]";
	}

	

	
	
	

	
}
