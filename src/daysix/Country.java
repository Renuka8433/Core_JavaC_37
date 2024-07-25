//program to demonstrate the multilevel inheritance
package daysix;

public class Country 
{
	private String countryName;
	private String capital;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + "]";
	}
	
	
	
}
