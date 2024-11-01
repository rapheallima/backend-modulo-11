package Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Pessoa {

	private String name;
	private String sexo;

	public Pessoa() {
	}

	public Pessoa(String name, String sexo) {
		super();
		this.name = name;
		this.sexo = sexo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(name, other.name) && Objects.equals(sexo, other.sexo);
	}

	@Override
	public String toString() {
		return "nome: " + name + ", sexo: " + sexo;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Pessoa> Homens = new ArrayList<>() {
		};

		List<Pessoa> Mulheres = new ArrayList<>() {
		};

		System.out.println("Quantas pessoas você deseja cadastrar? ");
		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			System.out.println("Digite o nome da pessoa #" + (i + 1) + ": ");
			String name = sc.nextLine();

			System.out.println("Digite o sexo da pessoa #" + (i + 1) + ": ");
			String sexo = sc.nextLine();

			Pessoa pessoa = new Pessoa(name, sexo);
			if (sexo.equalsIgnoreCase("Masculino")) {
				Homens.add(pessoa);
			} else if (sexo.equalsIgnoreCase("Feminino")) {
				Mulheres.add(pessoa);
			} else {
				System.out.println("Sexo inválido, por favor, digite 'Masculino' ou 'Feminino'.");
			}
		}

		System.out.println("\nLista de Homens:");
		for (Pessoa homem : Homens) {
			System.out.println(homem);
		}

		System.out.println("\nLista de Mulheres:");
		for (Pessoa mulher : Mulheres) {
			System.out.println(mulher);
		}

	}
}