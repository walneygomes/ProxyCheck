
public class ProxyCheck implements PayMent {
	PayMent myProxy;

	public ProxyCheck(double tipo) {
		this.myProxy = new Cartao(tipo);
	}

	public void amount() {
		myProxy.amount();

	}

	public double calcularJuros() {
		// TODO Auto-generated method stub
		return myProxy.calcularJuros();
	}

}
