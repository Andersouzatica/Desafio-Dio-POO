package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descricao curso Java para Iniciantes");
		curso1.setCargaHoraria(8);		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Spring Boot");
		curso2.setDescricao("Descricao curso Spring Boot para Iniciantes");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoriaJava = new Mentoria();
		mentoriaJava.setTitulo("Mentoria Java");
		mentoriaJava.setDescricao("Descricao mentoria Java");
		mentoriaJava.setData(LocalDate.now());
		
		Mentoria mentoriaSpringBoot = new Mentoria();
		mentoriaSpringBoot.setTitulo("Mentoria Spring Boot");
		mentoriaSpringBoot.setDescricao("Descricao mentoria Spring Boot");
		mentoriaSpringBoot.setData(LocalDate.now());
				
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java para Desenvolvedor Junior");
		bootcamp.setDescricao("Descricao Bootcamp Java para Desenvolvedor Junior");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoriaJava);
		bootcamp.getConteudos().add(mentoriaSpringBoot);
		
		Dev devAnderson = new Dev();
		devAnderson.setNome("Anderson");
		devAnderson.inscreverBootcampo(bootcamp);
		System.out.println("Conteudos Inscritos Anderson: " + devAnderson.getConteudosIncritos());
		devAnderson.progredir();
		devAnderson.progredir();
		devAnderson.progredir();
		devAnderson.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Anderson: " + devAnderson.getConteudosIncritos());
		System.out.println("Conteudos Concluidos Anderson: " + devAnderson.getConteudosConcluidos());
		System.out.println("XP: " + devAnderson.calcularTotalXp());
		
		System.out.println("----------");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcampo(bootcamp);		
		System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosIncritos());
		devCamila.progredir();
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosIncritos());
		System.out.println("Conteudos Concluidos Camila: " + devAnderson.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());

	}

}
