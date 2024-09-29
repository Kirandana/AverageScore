package javaExercise;

import java.util.Scanner;

public class AverageScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int SiswaPertama, SiswaKedua, SiswaKetiga;
		
		System.out.print("NILAI TEST PERTAMA: ");
		SiswaPertama = input.nextInt();
		
		System.out.print("NILAI TEST KEDUA: ");
		SiswaKedua = input.nextInt();
		
		System.out.print("NILAI TEST KETIGA: ");
		SiswaKetiga = input.nextInt();
		
		double Sum = (SiswaPertama + SiswaKedua + SiswaKetiga);
		double hasilSum = (Sum / 3);
		
		if (hasilSum >= 95) {
			System.out.println("Selamat!");
		}
		
		System.out.println("Nilai rata-rata anda adalah: " + hasilSum);
		
		input.close();
	}
}
