package dirosa.clemente.esercizio.base;


class Person {
	private String name;
	

	Person(String p){
		this.name = p;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object o) {	
		if (!(o instanceof Person))
			return false;
		
		Person p = (Person)o;
		
		if (this.name == null)
			return p.name == null;
					
		return this.name.equals(p.name);
	}
	
	
}
