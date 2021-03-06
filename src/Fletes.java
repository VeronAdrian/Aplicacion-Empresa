
public class Fletes extends Transporte{
	private double _costoAcompaņante;
	private double _cantidadAcompaņantes;

	Fletes(String id, double cargaMax, double capacidad, double costoKM, int cantAcompaniantes, double costoPorAcompaniante) {
		super(id, cargaMax, false, costoKM, 0);
		set_costoAcompaņante(costoPorAcompaniante);
		set_cantidadAcompaņantes(cantAcompaniantes);
	}

	public double get_costoAcompaņante() {
		return _costoAcompaņante;
	}

	public void set_costoAcompaņante(double _costoAcompaņante) {
		this._costoAcompaņante = _costoAcompaņante;
	}

	public double get_cantidadAcompaņantes() {
		return _cantidadAcompaņantes;
	}

	public void set_cantidadAcompaņantes(double _cantidadAcompaņantes) {
		this._cantidadAcompaņantes = _cantidadAcompaņantes;
	}
	
}
