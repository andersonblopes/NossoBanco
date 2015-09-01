class TestaEmpresa{
	public static void main(String [] args){
		
		Empresa empresa = new Empresa();

		Funcionario f1 = new Funcionario();
		f1.setSalario(500);
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.setSalario(9000);
		empresa.adiciona(f2);

		Funcionario f3 = new Funcionario();
		f3.setSalario(900);
		empresa.adiciona(f3);

		/*for (int i = 0; i<5;i++){
			Funconario f = new Funionario();
			f.salario = 100 + i * 10;
			empresa.adiciona(f);
		}*/
		empresa.mostraFuncionario();
	}
}
