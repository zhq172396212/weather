import com.xt.weather.ArrayOfString;
import com.xt.weather.WeatherWS;
import com.xt.weather.WeatherWSSoap;

import java.util.List;

public class CallWeatherws<list> {
    public static void main(String[] args){
    WeatherWS factory = new WeatherWS();
    WeatherWSSoap weather = factory.getWeatherWSSoap();
    ArrayOfString as =   weather.getWeather("咸宁", null);
    List<String> list = as.getString();
	        for(String str:list) {
        System.out.println(str);
    }

    ArrayOfString regionProvince = weather.getRegionProvince();
    List<String> string = regionProvince.getString();
	        for (int i = 0; i < string.size(); i++) {
        System.out.println(string);
    }
}
}
