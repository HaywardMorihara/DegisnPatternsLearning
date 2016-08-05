public class HeatIndexDisplay implements Observer, DisplayElement {
	
	float temp;
	float humidity;

	Subject weatherData;

	public HeatIndexDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}	

	public void display() {
		System.out.println("Displaying the heat index which does something with the temperature: "+temp+" and the humidity: "+humidity);
	}
}
