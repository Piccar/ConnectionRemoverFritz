package me.piccar.UnusedConnectionRemover;

import java.util.Scanner;

public class Main {
	static Remover remover;
	static String adress;
	static String password;
	static String username;
	
	public static void main(String[] args) {
		adress = new String();
		password =new String();
		username = new String();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    System.out.println("Unused Connection Removertool by Piccar /n Ist die Fritzbox mal wieder langsam? Der login will nicht aufhoeren zuladen? Dann ist mal wieder zuviel im Netzwerk los!");
	    System.out.println("Mit diesem Tool werden alle Verbindungen aus der Fritzbox geloescht welche grade nicht Verbunden sind! ACHTUNG: Geraete werden dabei nicht gesperrt. Diese können sich wieder normal einwaehlen");
	    System.out.println("Um die bereinigung zu beginnen bestaetigen Sie die nachfolgenden Fragen:");
	    System.out.println("Wie ist die Adresse der Fritzbox?");
	    adress = input.next();
	    System.out.println("Hat die Fritzbox einen eigenen Usernamen? Y/N");
	    username = input.next();
	    if (username.equalsIgnoreCase("y")) {
	    	System.out.println("Wie ist der Username?");
		    username = input.next();
	    }
	    else {
	    	username = null;
	    	
	    }
	    System.out.println("Wie ist das Password der Fritzbox?");
	    password = input.next();
	    remover =new Remover(adress, username, password);
	    remover.Terminator();
	  
	    
	}

}
