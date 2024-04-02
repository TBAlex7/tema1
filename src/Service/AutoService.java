package Service;
import Domain.Auto;
import UserInterface.*;

public class AutoService {
	public static void afisCaract(char c, int n) {
		for(int i=0;i<n;i++)
			System.out.print(c);
		System.out.println();
	}
	
	public static void afisMarfa(Auto t[]) {
		afisCaract('=',52);
		System.out.println("| Denumire |    Tip   | StocInit |Vandute |  Pret  |");
		afisCaract('-',52);
		for(int i=0;i<t.length;i++)
			System.out.format("|%-10s|%-10s|%10d|%8d|%8d|\n",
					t[i].getDenumire(),t[i].getTip(), 
					t[i].getStocInitial(),t[i].getVandute(),t[i].getPretUnitar());
		afisCaract('=',52);
	}
	public static void afisDisponibile(Auto t[]) {
		afisCaract('*',63);
		System.out.println("| Denumire |    Tip   | StocInit | Ramase |  Pret  | Val.Dispo|");
		afisCaract('-',63);
		for(int i=0;i<t.length;i++)
			if(t[i].getStocInitial()!=t[i].getVandute()) {
			   int dif=	t[i].getStocInitial()-t[i].getVandute();
			   int val=dif*t[i].getPretUnitar();
			
			System.out.format("|%-10s|%-10s|%10d|%8d|%8d|%10d|\n",
					t[i].getDenumire(),t[i].getTip(), 
					t[i].getStocInitial(),dif,t[i].getPretUnitar(),val);
			}
		afisCaract('=',63);
	}
	public static void afisSlabVanduta(Auto t[]) {
		
		int proc=UI.citIntreg("da procent:");
			
		System.out.println("Marfa vanduta  sub "+proc+ " procente");
		afisCaract('=',52);
		System.out.println("| Denumire |    Tip   | StocInit |Vandute |  Pret  |");
		afisCaract('-',52);
		for(int i=0;i<t.length;i++) { 
		    int vandutePrag=t[i].getStocInitial()*proc/100;
	        if(t[i].getVandute()<vandutePrag) 	
			    System.out.format("|%-10s|%-10s|%10d|%8d|%8d|\n",
					t[i].getDenumire(),t[i].getTip(), 
					t[i].getStocInitial(),t[i].getVandute(),t[i].getPretUnitar());
		}	
		afisCaract('=',52);
	}
	public static void afisComparata(Auto t[]) {
		String den1="porsche";		//numele trebuie citite de la tastatura
		String den2="toyota";
		int stocInit1=0, vand1=0;	//pentru porsche
		int stocInit2=0, vand2=0;   //pentru toyota
		
		for (int i=0;i<t.length;i++) {
			if(t[i].getDenumire().toLowerCase().equals(den1.toLowerCase())) {
				stocInit1+=t[i].getStocInitial(); //"PorSche" == "porsche"
				vand1+=t[i].getVandute();		  //aduna stocirile si vandutele
			}
			if(t[i].getDenumire().toLowerCase().equals(den2.toLowerCase())) {
			    stocInit2+=t[i].getStocInitial(); //"ToYota"=="toyota"
				vand2+=t[i].getVandute();		  // aduna stocirile si vandutele
			}
		}
		System.out.println(den1+": "+stocInit1+ " vandute:"+vand1);
		System.out.println(den2+": "+stocInit2+ " vandute:"+vand2);
	}
}

