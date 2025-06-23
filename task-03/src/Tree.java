
public class Tree {
	
	private String name;
	private int age;
    private boolean isAlive;
    
    private boolean defaultConstructorUsed = false;

    public Tree() {
    	defaultConstructorUsed = true;
//    	System.out.println("Default Ctor has been triggered");
    }
    
    public Tree(String name, int age) {
    	this.name = name;
        this.age = age;
        this.isAlive = true; 
    }
    
    public Tree(String name, int age, boolean isAlive) {
    	this.name = name;
    	this.age = age;
        this.isAlive = isAlive;
        
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean ifCtorPrint() {
    	return defaultConstructorUsed;
    }
    
}
