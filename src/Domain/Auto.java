package Domain;

public class Auto {
    private String denumire;   //necesar
    private String tip;        //necesar (benzina, electric, hybrid)
    private int stocInitial;   //necesar
    private int pretUnitar;    //necesar
    private int vandute;       //optional
    						   //constructori
    public Auto(String denumire, String tip, int stocInitial, int pretUnitar) {
    	this(denumire,tip,stocInitial,pretUnitar,0);
    }
    public Auto(String denumire,String tip, int stocInitial, int pretUnitar,int vandute) {
    	this.denumire=denumire;
    	this.tip=tip;
    	this.stocInitial=stocInitial;
    	this.pretUnitar=pretUnitar;
    	this.vandute=vandute;
    }
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public int getStocInitial() {
		return stocInitial;
	}
	public void setStocInitial(int stocInitial) {
		this.stocInitial = stocInitial;
	}
	public int getPretUnitar() {
		return pretUnitar;
	}
	public void setPretUnitar(int pretUnitar) {
		this.pretUnitar = pretUnitar;
	}
	public int getVandute() {
		return vandute;
	}
	public void setVandute(int vandute) {
		this.vandute = vandute;
	}
    
	
}
