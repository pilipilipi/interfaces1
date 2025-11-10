package factura;

public class FacturaClase {

	private String asunto;
	private int dia, mes, anyo;
	private double cantidad;
	private String tipo;
	private String fecha;

	public FacturaClase(String asunto, int dia, int mes, int anyo, double cantidad, String tipo) {
		this.asunto = asunto;
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.fecha = this.dia + "/" + this.mes + "/" + this.anyo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		FacturaClase other = (FacturaClase) obj;
		return this.asunto.equals(other.asunto) && this.dia == other.dia && this.mes == other.mes
				&& this.anyo == other.anyo && this.tipo.equals(other.tipo);
	}

	@Override
	public String toString() {
		return asunto + ":" + tipo + ":" + cantidad + ":" + fecha;
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

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
