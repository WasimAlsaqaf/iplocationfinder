package org.ws.examples;
import net.webservicex.*;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length == 1) {
			String ip = args[0];
			GeoIPService geo = new GeoIPService();
			GeoIPServiceSoap geoSoap = geo.getGeoIPServiceSoap();
			
			GeoIP country = geoSoap.getGeoIP(ip);
			String countryName = country.getCountryName();
			
			System.out.println(countryName);
			
			
		}
		else
			System.out.println("Geen geldige ip adres is opgegeven");

	}

}
