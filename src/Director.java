import java.time.LocalDate;

public class Director extends Gerente {
	private Integer salarioExtra;
	public Director(String nombre, Integer salario, LocalDate cumplea�os,Cochera cochera, Integer salarioExtra) {
		super(nombre, salario, cumplea�os, cochera);
		setSalario(getSalario()+salarioExtra);
	}
	public Integer getSalarioExtra() {
		return salarioExtra;
	}
	public void setSalarioExtra(Integer salarioExtra) {
		this.salarioExtra = salarioExtra;
	}
	
}
