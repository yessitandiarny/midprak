import java.util.Scanner;

class rumusluasPersegi {
	public static void main(String args[]) {
	Double  hasil, sisi;
	
	rumusluasPersegi rumus = new rumusluasPersegi();
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Menghitung Luas Persegi");
	System.out.println();
	System.out.print("Masukkan sisi(cm) : ");
	sisi = input.nextDouble();
	System.out.println();
	
	rumusluasPersegi.tampil();
	rumusluasPersegi.hitung(sisi);

}
}