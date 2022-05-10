import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private Integer salario;
	private LocalDate cumplea�os;

	public Empleado (String nombre, Integer salario ,LocalDate cumplea�os) {
		this.nombre  = nombre;
		this.salario = salario;
		this.cumplea�os = cumplea�os;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public LocalDate getCumplea�os() {
		return cumplea�os;
	}

	public void setCumplea�os(LocalDate cumplea�os) {
		this.cumplea�os = cumplea�os;
	}
}