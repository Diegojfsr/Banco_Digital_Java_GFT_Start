package BancoDigitalJava;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
	


}
