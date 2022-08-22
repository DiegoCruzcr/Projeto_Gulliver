package br.com.gulliver.beans;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		PontoTuristico p1 = new PontoTuristico(1, "dddd", list);
		System.out.println(p1.getEndereco());
		Usuario user = new Usuario(1, "nome", "sobre", 18, "email", p1, null);
		System.out.println(user.getPontoTuristico());
	}

}
