import java.util.Scanner;

class HitLing {
	public static void main(String args[]) {
	Double  hasil;
	int jari;
	
	Rumus rumus = new Rumus();
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Menghitung Luas Lingkaran");
	System.out.println();
	System.out.print("Masukkan jari-jari : ");
	jari = input.nextInt();
	System.out.println();
	
	rumus.radius(jari);
	rumus.tampil();
	rumus.hitung(jari);

	}	
}