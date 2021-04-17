//dDatabase class holds arrays for each of the diseases
public class Database {

	boolean[] covid = {true, true, true, false, false};
	boolean[] flu = {true, true, false, false, false};
	boolean[] strepThroat = {true, false, false, true, true};
	boolean[] commonCold = {false, true, false, true, false};
	
	public Database() {
		
	}//empty argument constructor 
	
	public Database(boolean[] covid, boolean[] flu, boolean[] strepThroat, boolean[] commonCold){
		this.covid = covid;
		this.flu = flu;
		this.strepThroat = strepThroat;
		this.commonCold = commonCold;
	}//preferred constructor

	
	//getters and setters
	public boolean[] getCovid() {
		return covid;
	}
	public void setCovid(boolean[] covid) {
		this.covid = covid;
	}
	public boolean[] getFlu() {
		return flu;
	}
	public void setFlu(boolean[] flu) {
		this.flu = flu;
	}
	public boolean[] getStrepThroat() {
		return strepThroat;
	}
	public void setStrepThroat(boolean[] strepThroat) {
		this.strepThroat = strepThroat;
	}
	public boolean[] getCommonCold() {
		return commonCold;
	}
	public void setCommonCold(boolean[] commonCold) {
		this.commonCold = commonCold;
	}
	
}//end class 
