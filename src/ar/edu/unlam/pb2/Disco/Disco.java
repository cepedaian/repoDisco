package ar.edu.unlam.pb2.Disco;

public class Disco {

	private Double radioInterior;
	private Double radioExterior;
	
	public Disco(Double rInterior, Double rExterior) {
		this.radioInterior = rInterior;
		this.radioExterior = rExterior;
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	private Double calcularArea(Double radio) {

		return Math.PI * Math.pow(radio, 2);
	}

	public Double calcularSuperficie() {

		return calcularArea(this.radioExterior) - calcularArea(this.radioInterior);
	}

	public Double calcularPerimetroInterior() {
		return 2 * Math.PI * this.radioInterior;
	}

	public Double calcularPerimetroExterior() {
		return 2 * Math.PI * this.radioExterior;

	}

}
