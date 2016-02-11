package dirosa.clemente.casestudy.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import com.google.maps.PendingResult;
import com.google.maps.model.GeocodingResult;

public class Main {
	public static void main(String[] args){
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		
		
		//togliere chiave
		
		
	
		try{
			
			 fr = new FileReader("attivita_comm_media_grande_distrib.csv");
			 br = new BufferedReader(fr);
		
			
			
			
			
			// ciclo while finche str == null
			 Integer i = 0;
			String str = br.readLine();
			List<Integer> in = new ArrayList<Integer>();
			
			Map<Address, List<Integer>> miamappa = new  HashMap<Address, List<Integer>>();
			while(str != null){
				
				String[] items = str.split(";");
				Address ind = new Address(i,items[2],items[3],items[4], items[5]);
				List<Integer> t = new ArrayList<Integer>();
				t = miamappa.get(ind);
				t.add(i);
				miamappa.put(ind, t);
				
				i++;
				str += br.readLine();
			}
			
			// split
			
			
			
			// seleziono i campi dell'indirizzo + l'id (ovvero n. riga)
			// indirizzo sono i campi ALZ 	NAVIGLIO GRANDE	98
			// creo oggetto con questi campi address, l'id su list di integer
			
			// salvo su 
	
			//indirizzoAttivita
			// {address1: [id1, id2], address2: [id3, id4]}
			
			// chiamo google maps per ogni address
			
			Set<Address> indirizzi = miamappa.keySet();
			Address a = indirizzi.iterator().next();
			//lavorare su indirizzi
			String all = a.getAll();
			
			// pre prova usare sync
			
			// togliere key ed inserire args[0]
			GeoApiContext context = new GeoApiContext().setApiKey(args[0]);
			GeocodingResult[] results =  GeocodingApi.geocode(context,
			    all).await();
			
			// progetto finale: usare async
			br.close();
			System.out.println(results[0]);
			//codifica finale ? 
			
			int x = Integer.parseInt(args[1]) - 1;
			int y = Integer.parseInt(args[2]) - 1;
	
			
			/*
			System.out.println(results[0].formattedAddress);
			System.out.println(results[0].geometry.location.lat);
			System.out.println(results[0].geometry.location.lng);*/
			
			
			// salvo lat/lng + addressname
			
			
			fw = new FileWriter("conversione.csv");
				
		
			//per ogni key e ogni id della map
			pw = new PrintWriter(fw);
			
			pw.println("id1;lat;lng;address_di_google");
		}catch(Exception e){
			
		}finally{
		/*	try {
				//br.close();
				//pw.close();
				
			} catch (IOException e) {
			
			}*/
		}
	}
}
