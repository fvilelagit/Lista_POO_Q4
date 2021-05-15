package model.entities;

public class Elevador {

	private Integer capacidadeTotal;
	private Integer pessoasDentro= 0;
	private Integer andarAtual = 0;
	private Integer todosOsAndares;
	
	public Elevador(Integer capacidadeTotal, Integer pessoasDentro, Integer andarAtual, Integer todosOsAndares) {
		super();
		this.capacidadeTotal = capacidadeTotal;
		this.pessoasDentro = pessoasDentro;
		this.andarAtual = andarAtual;
		this.todosOsAndares = todosOsAndares;
	}

	public Integer getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(Integer capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public Integer getPessoasDentro() {
		return pessoasDentro;
	}

	public void setPessoasDentro(Integer pessoasDentro) {
		this.pessoasDentro = pessoasDentro;
	}

	public Integer getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(Integer andarAtual) {
		this.andarAtual = andarAtual;
	}

	public Integer getTodosOsAndares() {
		return todosOsAndares;
	}

	public void setTodosOsAndares(Integer todosOsAndares) {
		this.todosOsAndares = todosOsAndares;
	}
	
	
	public void inicializar(Integer capacidadeTotal2, Integer todosOsAndares) {
		setAndarAtual(0);
		setPessoasDentro(0);
		System.out.printf("Start." + "\n");
		System.out.println(toString());
	}
	
	public void entrar(Integer pessoasDentro) {
		if (pessoasDentro <= capacidadeTotal) {
			setPessoasDentro(pessoasDentro + 1);
			System.out.println(toString());
		}
		else {
			System.out.printf("Já atingimos a capacidade total.");
			
		}
		
	}
	
	public void sair(Integer pessoasDentro) {
		if (pessoasDentro > 0) {
			setPessoasDentro(pessoasDentro - 1);
			System.out.println("Saiu um cidadão.");
		}
		else {
			System.out.println("O elevador está vazio e gasparzinho não está aqui.");
		}
		System.out.println(toString());
	}
	
	public void subir(Integer andarAtual) {
		
		if (andarAtual <= getTodosOsAndares()) {
			setAndarAtual(andarAtual + 1);
			System.out.println(toString());
		}
		else {
			System.out.printf("O elevador só vai até o %.d º andar", todosOsAndares);
			System.out.println("");
		}
	
		System.out.println(toString());
	}
	
	public void descer(Integer andarAtual) {
		if (andarAtual>0) {
			setAndarAtual(andarAtual - 1);
			System.out.println(toString());
		}
		else {
			System.out.println("Do chão ainda não passa.");
		}
	
		System.out.println(toString());
			
	
	}
	
	@Override
	public String toString() {
		return "Status do Elevador" + "[Capacidade Total = " + capacidadeTotal + ", Pessoas no Elevador =" + pessoasDentro + ", Andar atual="
				+ andarAtual + ", Andares totais no prédio = " + todosOsAndares + "]";
	}
	
}
