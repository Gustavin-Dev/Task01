package lista01;

public class Exerc17 {

	public static void main(String[] args) {
		int a=1;
		int b=10;
		if(a>10 || a+b==20 ) {
			System.out.println("numero valido");
		}else {
			if(a==b) {
				System.out.println("a==b");
			}
			if((a!=10 && b!=10) && a<10) {
				System.out.println("a e menor que 10");
			}else {
				System.out.println("numero nao valido");
			}
		}

	}

}
