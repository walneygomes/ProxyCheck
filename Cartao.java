
public class Cartao implements PayMent {

	private static final int JURO = 2;
	private double salario;

	public Cartao(double salario) {
		this.salario = salario;
	}

	public void amount() {

	}

	public double calcularJuros() {

		return JURO * this.salario;
	}

}
