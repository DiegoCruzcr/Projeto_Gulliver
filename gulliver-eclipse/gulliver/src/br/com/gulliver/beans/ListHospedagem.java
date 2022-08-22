package br.com.gulliver.beans;

import java.util.ArrayList;

public class ListHospedagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Paulista");
		list.add("Ibirapuera");
		list.add("Itaim Bibi");
		Hospedagem p2 = new Hospedagem(1, "Anhembi", "Ibis Styles", "Quartos, Piscina etc", 0, 0, list);
		System.out.println(p2.getLocalizacaoList());
		Usuario user = new Usuario(2, "nome", "sobre", 18, "email", null, p2);
		System.out.println(user.getHospedagem());
	}

}
