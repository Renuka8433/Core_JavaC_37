//program to  demonstrate the multilevel inheritance
package daysix;

public class City extends State 
{
	private String cityName;
	private String area;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getCityName()=" + getCityName() + ", getArea()="
				+ getArea() + ", getStateName()=" + getStateName() + ", getLanguage()=" + getLanguage()
				+ ", toString()=" + super.toString() + ", getCountryName()=" + getCountryName() + ", getCapital()="
				+ getCapital() + "]";
	}
	
	

}
