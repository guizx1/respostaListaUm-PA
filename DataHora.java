

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String imprimirData() {
		return dia + "/" + mes + "/" + ano;
	}
}

public class Hora {
	private int hora;
	private int minutos;
	
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public String imprimirDA() {
		return hora + ":" + minutos;
	}
	
}

public class DataHora {
	Data data;
	Hora hora;
	
	public DataHora (Data data, Hora hora) {
	this.data = data;
	this.hora = hora;
	}
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public String toString () {
		return "DATA: " + data.imprimirData() + "\nHORA: " + hora.imprimirHora();
	}
	
}
