package pruebasTDDconCuenta;

public class Cuenta {

	private int saldo;

	public Cuenta(int saldo) {
		if(saldo<0)
			this.saldo = 0;
		else
			this.saldo = saldo;
	}

	int getSaldo() {
		return saldo;
	}

	public void ingreso(int saldo) {
		if(saldo<0)
			this.saldo = getSaldo();
		else
			this.saldo += saldo;
	}

	public void transferencia(int saldo, Cuenta cuentaDestino) {
		if (saldo<0)
			return;
		if (getSaldo()<saldo)
			return;
		if (cuentaDestino == null)
			return;
		this.saldo -= saldo;
		cuentaDestino.setSaldo(cuentaDestino.getSaldo()+saldo);
	}

	private void setSaldo(int i) {
		this.saldo = i;
	}

	public void reintegro(int saldo) {
		if (saldo<0)
			return;
		if (getSaldo()<saldo)
			return;
		this.saldo -= saldo;
	}
}
