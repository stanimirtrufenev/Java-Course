
public class Town {
	private String name;
	private String country;
	private long population;
	
	public Town(String name, String country, int population) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	
	 @Override
		public int hashCode() {
			 return (this.name + this.country + this.population).hashCode();
	     }
		 
		 @Override
		 public boolean equals(Object o){
		    if(o == null){
		    	return false;
		    }
		    
		    if(!(o instanceof Town)){
		    	return false;
		    }

		    Town name1 = (Town) o;
		    return this.hashCode() == name1.hashCode();
		  }
		 
		 @Override
		 public String toString() {
			 return this.name + " " + this.country + " " + this.population;
	     }
}


