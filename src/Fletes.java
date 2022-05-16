
public class Fletes extends Transporte{
	private boolean _acompa�ante;
	private Integer _costoAcompa�ante;
	private Integer _cantidadAcompa�antes;

	Fletes(Integer identificaci�n, Integer cargaMaxima, Integer capacidadMaxima, Integer costoKM,boolean acompa�ante, Integer costoAcompa�ante) {
		super(identificaci�n, cargaMaxima, capacidadMaxima, false, costoKM);
		set_acompa�ante(acompa�ante);
		set_costoAcompa�ante(costoAcompa�ante);
	}

	public boolean is_acompa�ante() {
		return _acompa�ante;
	}

	public void set_acompa�ante(boolean _acompa�ante) {
		this._acompa�ante = _acompa�ante;
	}

	public Integer get_costoAcompa�ante() {
		return _costoAcompa�ante;
	}

	public void set_costoAcompa�ante(Integer _costoAcompa�ante) {
		this._costoAcompa�ante = _costoAcompa�ante;
	}

	public Integer get_cantidadAcompa�antes() {
		return _cantidadAcompa�antes;
	}

	public void set_cantidadAcompa�antes(Integer _cantidadAcompa�antes) {
		this._cantidadAcompa�antes = _cantidadAcompa�antes;
	}
	
}
