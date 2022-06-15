import java.time.LocalDate;

public class Empleado implements Comparable <Empleado> {
	private String nombre;
	private Integer salario;
	private LocalDate cumpleaños;

	public Empleado (String nombre, Integer salario ,LocalDate cumpleaños) {
		this.nombre  = nombre;
		this.salario = salario;
		this.cumpleaños = cumpleaños;
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

	public LocalDate getCumpleaños() {
		return cumpleaños;
	}

	public void setCumpleaños(LocalDate cumpleaños) {
		this.cumpleaños = cumpleaños;
	}

	@Override
	public int compareTo(Empleado o) {
		if(nombre.compareTo(o.getNombre()) == 0){
			salario.compareTo(o.getSalario());
		}
		return nombre.compareTo(o.getNombre());
	}
}