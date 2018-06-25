package com.up.clinica;

import com.up.clinica.dal.TipoAnimalDAO;

public class Main {
	public static void main(String[] args) {
		System.out.println("Olá Mundo");
		try {
			TipoAnimalDAO tipoAnimalDAO = new TipoAnimalDAO();
			tipoAnimalDAO.removerComRelacionamentos("CAO");
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fim!");	
	}
}