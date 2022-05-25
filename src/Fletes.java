
public class Fletes extends Transporte{
	private double _costoAcompa�ante;
	private double _cantidadAcompa�antes;

	Fletes(String id, double cargaMax, double capacidad, double costoKM, int cantAcompaniantes, double costoPorAcompaniante) {
		super(id, cargaMax, false, costoKM, 0);
		set_costoAcompa�ante(costoPorAcompaniante);
		set_cantidadAcompa�antes(cantAcompaniantes);
	}

	public double get_costoAcompa�ante() {
		return _costoAcompa�ante;
	}

	public void set_costoAcompa�ante(double _costoAcompa�ante) {
		this._costoAcompa�ante = _costoAcompa�ante;
	}

	public double get_cantidadAcompa�antes() {
		return _cantidadAcompa�antes;
	}

	public void set_cantidadAcompa�antes(double _cantidadAcompa�antes) {
		this._cantidadAcompa�antes = _cantidadAcompa�antes;
	}
	
}
