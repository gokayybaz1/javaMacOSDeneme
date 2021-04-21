package javaMacOSDeneme;

public class JavaMacOSDenemeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Hello Mac OS");
		
		
		String[] user = {"Gökay","Halide","Mustafa"};
		for (String i : user) {
			System.out.println(i);
		}
		
		int[] sayiList = {1,5,9,8,5};
		
		System.out.println("Hello Java Kampı");		
		for (int i : sayiList) {
			System.out.println(i);
		}
		
		boolean girisYapmisMi = false;
		
		if(girisYapmisMi == true) {
			System.out.println("Sisteme giriş yapılmış");
		}else {
			System.out.println("Sisteme giriş yapılmamış");
		}

	}

}
