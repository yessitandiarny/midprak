import java.util.Scanner;

class luasPersegi {
	public static void main(String args[]) {
	Double  hasil, sisi;
	
	rumusLuasPersegi rumus = new rumusLuasPersegi();
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Menghitung Luas Persegi");
	System.out.println();
	System.out.print("Masukkan sisi(cm) : ");
	sisi = input.nextDouble();
	System.out.println();
	
	rumus.tampil();
	rumus.hitung(sisi);

}
}