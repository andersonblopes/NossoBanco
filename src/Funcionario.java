abstract class Funcionario{
	private double salario;
	private String nome;
	private String cpf;
	private double saldo;
	
	Funcionario(){
	}

	Funcionario(String nome){
		setFuncionario(nome);
	}
	
	public boolean autentica(int senha){
		return false;
		
	}

	public void setFuncionario(String nome){
		this.nome=nome;
	}

	String getFuncionario(){
		return nome;
	}

	public void setSalario(double salario){
		this.salario=salario;
	}

	public double getSalario(){
		return salario;
	}
	
	public void bonifica(double valor){
		salario += valor;
	}

	public double calculaGanhoAnual(){
		return salario*12;
	}
	
	public void exibirSalario(){
		System.out.println("Salario atual: "+salario);
	}

	public void exibirGanhoaAnual(){
		System.out.println("Ganho anual: "+calculaGanhoAnual());
	}
	
	abstract public double getBonificacao();

}
