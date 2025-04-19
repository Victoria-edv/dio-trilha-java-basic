public class metodos {
	
	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO

		 return num2;
	}
	 public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN POIS NÃO SERÁ RETORNADO NENHUM RESULTADO (int, long, double, string etc)
	}
	// throws Exception : indica que o método ao ser utilizado poderá gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception{
		return 0;}
	
	// este método não pode ser visto por outras classes no projeto
	private void metodoPrivado(){}
	
	//alguns equívocos estruturais
	public void validar(){
		//este método deveria retornar algum valor -> no caso boolean (true ou false)
	}
	public void calcularEnviar(){
		//um método deve representar uma única responsabilidade, errado por ter duas: calcular e enviar
	}
	public void gravarCliente(String nome, String cpf, Integer telefone){
		//este método tem a finalidade de gravar informações de um cliente, por que não criar um objeto cliente e passar como parâmetro ? veja abaixo
	}
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
}


/*
- somar(int n1, int n2){}

- abrirConexao(){}

- concluirProcessamento() {}

- findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

- calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade */
