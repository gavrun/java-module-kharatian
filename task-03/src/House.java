import java.time.Year;

public class House {
	
	
    private String name;
    private int floors;
    private int yearBuilt;

    public String getName() {
        return name;
    }
    
    public int getFloors() {
        return floors;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }
    
    public void setPropsAll(String name, int floors, int yearBuilt) {
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }
    
    public int getAgeBuilt() {
        int currentYear = Year.now().getValue();
        return currentYear - yearBuilt;
    }
    
}
