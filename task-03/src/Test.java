
public class Test {

	// private field
	private String name;

	// auto Ctor
	public Test(String name) {
		super();
		this.name = name;
	}

	// auto getter
	public String getName() {
		return name;
	}

	// auto setter
	public void setName(String name) {
		this.name = name;
	}

	// auto method
	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}
}
