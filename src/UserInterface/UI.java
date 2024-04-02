package UserInterface;

import java.util.Scanner;

import Domain.*;
import Repository.AutoRepository;
import Service.*;
public class UI {
    
	public static int citIntreg(String sir){
		try{
			System.out.print(sir);
			Scanner S= new Scanner(System.in);
			int I=S.nextInt();
			return I;			
		}
		catch(Exception E){
			System.out.println("Ai gresit, mai incearca");
			return citIntreg(sir);
		}	
	}
	
	public static void afis(String string) {
		System.out.println(string);
	}
	    
	public static int meniu() {
		afis("");
		afis("1.Citire date din fisier");
		afis("2.Citire date de la tastatura");
		afis("3.Tabel cu toata marfa");
		afis("4.Tabel cu marfa disponibila");
		afis("5.Tabel cu marfa slab vanduta (sub p procente)");
		afis("6.Tabel cu marfa vanduta pt. doua denumiri");
		afis("0.terminare program");
		return citIntreg("alege optiune:");
	}
	
	public static void run() {
	  int opt=meniu();
	  Auto tabel[]=null;
	  
	  while	(opt!=0) {
		
		switch(opt) {
		  case 1: 
			  tabel= AutoRepository.citireFisier();
			  break;
		  case 2:
		      //citire de la tastatura
		      break;
		  case 3:    
		      AutoService.afisMarfa(tabel);
			  break;
		  case 4:    
		      AutoService.afisDisponibile(tabel);
			  break;		 
		  case 5:    
		      AutoService.afisSlabVanduta(tabel);//afisare marfa slab vanduta
			  break;
		  case 6:   
		      AutoService.afisComparata(tabel);
			  break;
		  default:
			  afis("fii atent la optiuni, mai incearca"); 
		}
      opt=meniu();
	}
	afis("program terminat");  
  }
}
