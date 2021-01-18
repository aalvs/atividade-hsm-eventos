package main;

import java.time.LocalTime;
import java.util.Calendar;

import models.Evento;
import models.Palestra;
import models.Palestrante;
import models.Responsavel;

public class EventManagerApplication {

	public static void main(String[] args) {
		Responsavel responsavel = new Responsavel("André Alves", "997791016", 89.00);
		Palestrante palestrante1 = new Palestrante("Enzo Alves", "997791016", 200.99);
		Palestrante palestrante2 = new Palestrante("Helena Alves", "997791016", 150.99);
		Palestrante palestrante3 = new Palestrante("Francisco Alves", "997791016", 180.99);
		
		Palestra[] palestras = new Palestra[4];
		palestras[0] = new Palestra("Programação Funcional", "Ensinar como programar funcional", LocalTime.now(), 4, palestrante1);
		palestras[1]  = new Palestra("API Rest com Spring", "Como desenvolver APIs com Spring", LocalTime.now(), 3, palestrante2);
		palestras[2]  = new Palestra("Banco de Dados com Postgress", "Como criar banco de dados relacionais com Postgress SQL", LocalTime.now(), 5, palestrante3);
		palestras[3]  = new Palestra("UX/UI Design", "Design de de expriência focado no usuário", LocalTime.now(), 2, palestrante1); 
		
		Evento evento = new Evento("DoWhile 2021", Calendar.getInstance(), Calendar.getInstance(), 20, palestras, responsavel);
		
		System.out.println("O evento "+evento.getNome()+" teve o gasto de "+evento.calculaValorGastoResponsavel()+ " com o responsável "+ evento.getResponsavel().getNomeCompleto());
		System.out.println("O evento "+evento.getNome()+" teve um gasto total com palestra de "+evento.calculaValorGastoPalestras());
		System.out.println("O evento "+evento.getNome()+" teve um gasto com a palestra "+ evento.getPalestra()[1].getTitulo() +" o valor de "+evento.calculaValorGastoPalestra(1));
		System.out.println("O evento "+evento.getNome()+" teve o menor gasto com o palestrante "+ evento.calculaPalestranteComMenorValor().getNomeCompleto());
		System.out.println("O evento "+evento.getNome()+" teve o maior gasto com o palestrante "+ evento.calculaPalestranteComMaiorValor().getNomeCompleto());

	}

}
