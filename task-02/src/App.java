
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		
		Calculator calc = new Calculator();
		
		System.out.println("Sum of int: " + calc.sum(0, 0));
		System.out.println("Sum of int: " + calc.sum(2, 5));
		
		System.out.println("Subtract int: " + calc.subtract(1, 2));
		System.out.println("Subtract int: " + calc.subtract(0, 2));
		
		System.out.println("Multiply long: " + calc.multiply(1L, 2L));
		System.out.println("Multiply long: " + calc.multiply(1L, 0L));
		System.out.println("Multiply long: " + calc.multiply(0L, 1L));
		
		System.out.println("Divide int: " + calc.divide(4, 4));
		System.out.println("Divide double: " + calc.divide(0L, 2L));
		System.out.println("Divide double: " + calc.divide(2.0, 0));
		
		// 2
		
		Book book1 = new Book();
		System.out.println(book1);
		
		Book book2 = new Book("1984", "George Orwell", 328, 14.99, 1949);
		System.out.println(book2);
		
		book1.setTitle("Clean Code");
        book1.setAuthor("Robert Martin");
        book1.setPages(464);
        book1.setPrice(39.99);
        book1.setYear(2008);
        System.out.println(book1);
        
        book2.setTitle("Brave New World");
        book2.setAuthor("Aldous Huxley");
        book2.setPages(311);
        book2.setPrice(15.99);
        book2.setYear(1932);
        System.out.println(book2);
	}

}
