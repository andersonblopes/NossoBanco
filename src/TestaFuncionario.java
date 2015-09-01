class TestaFuncionario{
	public static void main(String [] args){
		Funcionario f1 = new Funcionario();
		f1.setFuncionario("Anderson");
		f1.setSalario(1000);
		f1.bonifica(200);
		f1.exibirSalario();
		f1.exibirGanhoaAnual();

		Funcionario f2 = f1;
		//Funcionario f2 = new Funcionario();
		//f2.nome = "Lopes";
		//f2.salario = 5000;

		if (f1==f2){
			System.out.println("Iguais");
		} else{
			System.out.println("Diferentes");
		}

	}
}
