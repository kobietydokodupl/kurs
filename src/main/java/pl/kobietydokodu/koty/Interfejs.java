package pl.kobietydokodu.koty;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import pl.kobietydokodu.koty.domain.Kot;


public class Interfejs {
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String [] args) {
	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd");
		Kot kotek=new Kot();
		
        System.out.println("Podaj imi� kota:");
        kotek.setImie(getUserInput());

        System.out.println("Podaj imi� opiekuna:");
        kotek.setImieOpiekuna(getUserInput());
        

        do {
        System.out.println("Podaj dat�:");
        try {
        kotek.setData(sdf.parse(getUserInput()));
        }
        catch(Exception e) {}
        }while(kotek.getData()==null);
        
        do {
        System.out.println("Podaj wag�:");
        try {
        kotek.setWaga(Float.valueOf(getUserInput()));
        }
        catch(Exception e) {}
		}while(kotek.getWaga()==null);
	
        System.out.print(kotek);
	}
	
	public static String getUserInput() {
		return scanner.nextLine().trim();
	}

}