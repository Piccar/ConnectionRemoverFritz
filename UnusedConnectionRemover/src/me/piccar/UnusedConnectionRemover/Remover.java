package me.piccar.UnusedConnectionRemover;

import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

public class Remover {
String adress;
String password;
String username;
FritzBoxController fbc;

	public Remover(String adress, String username, String password) {
		this.adress=adress;
		this.username=username;
		this.password=password;
		
		
	}
	public void Terminator() {
		System.out.println("Baue Verbindung auf...");
		try {
			fbc = new FritzBoxController(adress, username, password);
		} catch (ParserConfigurationException | URISyntaxException e) {
			e.printStackTrace();
		}
		fbc.Cleanup();
		
		
		
		
	}
}
