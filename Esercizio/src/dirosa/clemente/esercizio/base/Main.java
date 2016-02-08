package dirosa.clemente.esercizio.base;

import java.util.Arrays;
import java.util.HashMap;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		// creazione persone;
		
		

		Person ph1 = new Person("pippo");
		
		Person ph2 = new Person("pluto");
		
		

		Person ph3 = new Person("pippo");
		
		Person ph4 = new Person("gigi");
		
		

		
		
		
		
		List<Person> persone = Arrays.asList(
				ph1,
				ph2,
				ph3,
				ph4
				
		);
		
		
		Map<Person, Integer> hash = new HashMap<Person, Integer>() {
			

			@Override
			public Integer put(Person chiave, Integer val) {
				if(this.isEmpty())
					return super.put(chiave, 1);
				else if(this.containsKey(chiave))
					return super.put(chiave, this.get(chiave) + 1);
				else
					return super.put(chiave, val);
			}
		};
		
		Iterator<Person> iter = persone.iterator();
		while(iter.hasNext()) {
			Person pt = iter.next();
			hash.put(pt, 1);
		}
		
		for(Person p : hash.keySet()){
			System.out.println(p.getName() + " : " + hash.get(p));
		}
		
		
		
		//System.out.println(lp.isEmpty());

		
		
		
		
		
		//persone.stream().;
		
		
		/*
		for(PersonHash p: sph) {
			System.out.println(p.getName());
		}
		
		*/
		
		
		
		
		
		

		/*
		for(PersonTree p: spt) {
			System.out.println(p.getName());
		}
		*/
	}

}
