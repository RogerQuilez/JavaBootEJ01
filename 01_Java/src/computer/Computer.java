package computer;

import java.util.List;

public class Computer {
	
	private static int countId;
	private int id;
	private String marca;
	private double precio;
	private List<Ram> listaRam;
	private Procesador procesador;
	private List<TarjetaGrafica> listTarjetaGrafica;
	private List<Periferico> listPerifericos;
	private PlacaBase placaBase;
	
	public Computer() {
		this.id = ++Computer.countId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public List<Ram> getListaRam() {
		return listaRam;
	}
	
	public void setListaRam(List<Ram> listaRam) {
		this.listaRam = listaRam;
	}
	
	public Procesador getProcesador() {
		return procesador;
	}
	
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	
	public List<TarjetaGrafica> getListTarjetaGrafica() {
		return listTarjetaGrafica;
	}
	
	public void setListTarjetaGrafica(List<TarjetaGrafica> listTarjetaGrafica) {
		this.listTarjetaGrafica = listTarjetaGrafica;
	}
	
	public List<Periferico> getListPerifericos() {
		return listPerifericos;
	}
	
	public void setListPerifericos(List<Periferico> listPerifericos) {
		this.listPerifericos = listPerifericos;
	}
	
	public PlacaBase getPlacaBase() {
		return placaBase;
	}
	
	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", marca=" + marca + ", precio=" + precio + "� \n \t - Rams=" + listaRam
				+ "\n \t - Procesador=" + procesador + "\n \t - Tarjetas Graficas=" + listTarjetaGrafica 
				+ "\n \t - Perifericos=" + listPerifericos + "\n \t - PlacaBase=" + placaBase + "]";
	}
	
	
	public double getTotalPriceComponents() {
		
		return this.getPlacaBase().getPrecio() + this.getProcesador().getPrecio()
				+ this.getPerifericsPrice() + this.getRamsPrice() + this.getGraphicTargetsPrice();
	}
	
	public double getPerifericsPrice() {
		double perifericsPrice = 0;
		for (Periferico per: this.getListPerifericos()) perifericsPrice+= per.getPrecio();
		return perifericsPrice;
	}
	
	public double getRamsPrice() {
		double ramsPrice = 0;
		for (Ram ram: this.getListaRam()) ramsPrice+= ram.getPrecio();
		return ramsPrice;
	}
	
	public double getGraphicTargetsPrice() {
		double targetsPrice = 0;
		for (TarjetaGrafica targ: this.getListTarjetaGrafica()) targetsPrice += targ.getPrecio();
		return targetsPrice;
	}
		
}
