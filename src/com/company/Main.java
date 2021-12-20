package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen doğduğunuz ayı yazınız :");
		String ay = input.nextLine();

		System.out.print("Lütfen doğduğunuz günü yazınız :");
		int gun = input.nextInt();

		String burc = "";

		if (ay.equalsIgnoreCase("Ocak")) {
			if (gun >=1 && gun <=31)
			if (gun > 22)
				burc = "Kova";
			else
				burc = "Oğlak";
			else {
				System.out.print("1 ile 31 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Şubat")) {
			if (gun >=1 && gun <=28)
			if (gun > 20)
				burc = "Balık";
			else
				burc = "Kova";
			else {
				System.out.print("1 ile 28 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Mart")) {
			if (gun >=1 && gun <=31)
			if (gun > 21)
				burc = "Koç";
			else
				burc = "Balık";
			else {
				System.out.print("1 ile 31 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Nisan")) {
			if (gun >=1 && gun <=30)
			if (gun > 21)
				burc = "Boğa";
			else
				burc = "Koç";
			else {
				System.out.print("1 ile 30 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Mayıs")) {
			if (gun >=1 && gun <=31)
			if (gun > 22)
				burc = "İkizler";
			else
				burc = "Boğa";
			else {
				System.out.print("1 ile 31 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Haziran")) {
			if (gun >=1 && gun <=30)
			if (gun > 23)
				burc = "Yengeç";
			else
				burc = "İkizler";
			else {
				System.out.print("1 ile 30 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Temmuz")) {
			if (gun >=1 && gun <=31)
			if (gun > 23)
				burc = "Aslan";
			else
				burc = "Yengeç";
			else {
				System.out.print("1 ile 31 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Ağustos")) {
			if (gun >=1 && gun <=31)
			if (gun > 23)
				burc = "Başak";
			else
				burc = "Aslan";
			else {
				System.out.print("1 ile 31 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Eylül")) {
			if (gun >=1 && gun <=30)
			if (gun > 23)
				burc = "Terazi";
			else
				burc = "Başak";
			else {
				System.out.print("1 ile 30 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Ekim")) {
			if (gun >=1 && gun <=31)
			if (gun > 23)
				burc = "Akrep";
			else
				burc = "Terazi";
			else {
				System.out.print("1 ile 31 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Kasım")) {
			if (gun >=1 && gun <=30)
			if (gun > 22)
				burc = "Yay";
			else
				burc = "Akrep";
			else {
				System.out.print("1 ile 30 arasında bir sayı giriniz");
				return;
			}
		}

		if (ay.equalsIgnoreCase("Aralık")) {
			if (gun >=1 && gun <=31)
			if (gun > 22)
				burc = "Oğlak";
			else
				burc = "Yay";
			else {
				System.out.print("1 ile 31 arasında bir sayı giriniz");
				return;
			}
		}
		System.out.println("Burcunuz "+burc+"");
	}
}


