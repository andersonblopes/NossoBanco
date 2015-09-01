class Exercicio03{
	public static void main(String [] args){
		int numerosImpares = 0;		
		for(int i = 10;i<=50;i++){
			if(!(i%2==0)){
				numerosImpares++;
			}			

		}
		System.out.println("Quantidade de numeros impares "+numerosImpares);
	}
}
