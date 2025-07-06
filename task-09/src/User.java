
public class User {
	private String name;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	// Auto-generated constructor
	public User(String name) {
		super();
		this.name = name;
	}

	// Auto-generated getter
	public String getName() {
		return name;
	}

	// Auto-generated setter
	public void setName(String name) {
		this.name = name;
	}
	
	// toString override
	@Override
	public String toString() {
		return "User [name: " + this.name + "]";
	}
	
	// equals override (to support key by value for Map<T>)
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof User)) {
			return false;
		}
		User user = (User) o;
		return (name != null && name.equals(user.name));
	}
	
	// hashCode override
	public int hashCode() {
		return (name != null ? name.hashCode() : 0);
//		return {
//				if (!= null) {
//					name.hashCode()
//				} else {
//					0
//				}
//		}; not supported
	}

}
