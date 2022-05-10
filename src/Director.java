import java.time.LocalDate;

public class Director extends Gerente {
	private Integer salarioExtra;
	public Director(String nombre, Integer salario, LocalDate cumpleaños,Cochera cochera, Integer salarioExtra) {
		super(nombre, salario, cumpleaños, cochera);
		setSalario(getSalario()+salarioExtra);
	}
	public Integer getSalarioExtra() {
		return salarioExtra;
	}
	public void setSalarioExtra(Integer salarioExtra) {
		this.salarioExtra = salarioExtra;
	}
	
}
