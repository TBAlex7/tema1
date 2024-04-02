package Repository;

import java.io.BufferedReader;
import java.io.FileReader;

import Domain.Auto;

public class AutoRepository {

  public static Auto[] citireFisier() {
	try {
	   BufferedReader fisIn = 
	   new BufferedReader(new FileReader("C:\\Users\\btimicer\\IdeaProjects\\Autoturisme (1)\\src\\Repository\\Autoturism.txt"));
	   String s;
	   s=fisIn.readLine();
	   int n=Integer.parseInt(s);		//n=numarul de linii
	   System.out.println(n);
	   Auto [] auto=new Auto[n];        
	
	   for(int i=0;i<n; i++){
		  s = fisIn.readLine();
		  String comp[]=s.split(",");   //tabloul comp contine elementele unei linii din fisier
		  auto[i]=new Auto(comp[0],comp[1], Integer.parseInt(comp[2]),Integer.parseInt(comp[3]),Integer.parseInt(comp[4]));
	   }
	  return auto;
	}
	catch(Exception e) {
	     System.out.println(e.getMessage());
	     e.printStackTrace();
	     return null;
	   } // catch	
  }
}
