package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		// Criar um objeto do tipo Paciente
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria";
		p1.cpf = "999.888.666-77";
		p1.altura = 1.63;
		p1.peso = 75.490;
		p1.telefone = "(11)96523-8888";
		p1.dataNascimento = LocalDate.of(2003, 8, 16);
		
		
		Paciente p2 = new Paciente();
		p2.nome = "Matheus";
		p2.cpf = "553.639.782-87";
		p2.altura = 1.78;
		p2.peso = 110.0;
		p2.telefone = "(11)96523-8888";
		p2.dataNascimento = LocalDate.of(2006, 3, 31);
		
		p1.mostrarDados();
		p2.mostrarDados();
		
		
	}

}
