package dirosa.clemente.casestudy.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class TreeMap {
	public static void main(String[] args){

		try{
					
			
			FileWriter fw = null;
			PrintWriter pw = null;
			FileReader fr  = new FileReader("src/dirosa/clemente/casestudy/base/attivita_comm_media_grande_distrib.csv");
			BufferedReader br =  new BufferedReader(fr);
		
			System.out.println("1");
			
			TreeAddress ind = new TreeAddress();
			
			 List<Integer> t = new ArrayList<Integer>();
			 String[] items = new String[18];
			
			// ciclo while finche str =! null
			 Integer i = 0;
			String str = br.readLine();
		
		
			
			
			Map<TreeAddress, List<Integer>> miamappa = new java.util.TreeMap<TreeAddress, List<Integer>>();
			while( (str = br.readLine()) != null){
				
				ind = new TreeAddress(items[2],items[3],items[4], items[5]);
				
				
				while(controllo(str, ';') < 17){
					str = str.concat(br.readLine());
				}
				items = str.split(";");
				
				if(items[2].length() > 0 && items[3].length() > 0 && items[4].length() > 0){
				
					
					
					
					t = miamappa.get(ind);
					
					if(t == null){
						t = new ArrayList<Integer>();
						t.add(i);
						miamappa.put(ind, t);
					}else{
						t.add(i);
						miamappa.put(ind, t);
					}
					
					i++;

				}
				for(TreeAddress s: miamappa.keySet()) {				
					System.out.println(s.getAll());
				}	
				
			}
			
	
			
			// chiamo google maps per ogni address
			System.out.println("duee");
		//	Set<Address> indirizzi = miamappa.keySet();
		//	Address a = indirizzi.iterator().next();
			//lavorare su indirizzi
			//String all = a.getAll();
			System.out.println("treee");
			
			fw = new FileWriter("src/dirosa/clemente/casestudy/base/conversione.csv");
				
			
			System.out.println("quatt");
		
			//per ogni key e ogni id della map
			pw = new PrintWriter(fw);
			
			
			System.out.println("cing");
			
			
			
			// pre prova usare sync
			/*
			System.out.println("sejj");
			
			GeoApiContext context = null;
			GeocodingResult[] results = null;
			// togliere key ed inserire args[0]
			
		
			System.out.println("settt");
			// progetto finale: usare async
			int con = 0;
		
			pw.println("id1;latitudine;longitudine;address_di_google;ListInteger");
			for(Address ad: miamappa.keySet()) {
			 
			        if(con < 10){
			        	//per inserire la lista di ID
			        	for(Integer ite : miamappa.get(ad)){
					        context = new GeoApiContext().setApiKey(args[0]);
							results =  GeocodingApi.geocode(context,
									"Milano " + ad.getAll()).await();
							//System.out.println(results[con].formattedAddress);
							
								pw.println(ite + ";" + results[0].geometry.location.lat + ";" 
								+ results[0].geometry.location.lng + ";"
										+ results[0].formattedAddress + " ; " + miamappa.get(ad));
							
			        		}
			        	}
			        
			        	
			        con++;
		    }
			
			
			*/
			
			
			/*
			System.out.println(results[0].formattedAddress);
			System.out.println(results[1] + " " + results[2]);
			//codifica finale ? 
			*/
			
			
			br.close();
			pw.close();/*
			int x = Integer.parseInt(args[1]) - 1;
			int y = Integer.parseInt(args[2]) - 1;*/
	
			
			/*
			System.out.println(results[0].formattedAddress);
			System.out.println(results[0].geometry.location.lat);
			System.out.println(results[0].geometry.location.lng);*/
			
			System.out.println("Fine");
			// salvo lat/lng + addressname
			
		
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
