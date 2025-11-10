package factura;

public class FacturaClase {

	private String asunto;
	private int dia, mes, anyo;
	private String tipo;
	private String fecha;

	public FacturaClase(String asunto, int dia, int mes, int anyo, String tipo) {
		this.asunto = asunto;
		this.tipo = tipo;
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
		this.fecha = this.dia + "/" + this.mes + "/" + this.anyo;
	}

	@Override
	public String toString() {
		return asunto + ":" + tipo + ":" + fecha;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
