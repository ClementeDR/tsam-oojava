package dirosa.clemente.casestudy.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class MainIndirizzoAttivita {
	public static void main(String[] args){

		try{
					
			
			//FileWriter fw = null;
			//PrintWriter pw = null;
			FileReader fr  = new FileReader("src/dirosa/clemente/casestudy/base/attivita_comm_media_grande_distrib.csv");
			BufferedReader br =  new BufferedReader(fr);
		
			System.out.println("1");
			
			Address ind = new Address();
			IndirizzoAttivita indirizzoAttivita = new IndirizzoAttivita();
			
			 List<Integer> t = new ArrayList<Integer>();
			 String[] items = new String[18];
			
			// ciclo while finche str =! null
			 Integer i = 0;
			String str = br.readLine();
		
		
			
			
			Set<IndirizzoAttivita> miamappa = new HashSmartSet<IndirizzoAttivita>();
			
			
			while( (str = br.readLine()) != null){
				
				ind = new Address(items[2],items[3],items[4], items[5]);
				
				
				while(controllo(str, ';') < 17){
					str = str.concat(br.readLine());
				}
				items = str.split(";");
				
				if(items[2].length() > 0 && items[3].length() > 0 && items[4].length() > 0){
					
					indirizzoAttivita.setIndirizzo(ind);
					
					if (miamappa.contains(indirizzoAttivita)) {
						t = indirizzoAttivita.getLista();
						
					}else{
						
						indirizzoAttivita.setIndirizzo(ind);
						
					}
					
					
					t.add(i);
					indirizzoAttivita.setLista(t);				
					
					miamappa.add(indirizzoAttivita);
										
					i++;
					
					

				}
				
				
			}
			
			System.out.println(miamappa);
			
			br.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static int controllo(String str, char c){
		int i = 0;
		for(int j = 0; j<str.length(); ++j){
			if(str.charAt(j) == c)
				++i;
		}
		return i;
	}
}
