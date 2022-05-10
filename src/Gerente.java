import java.time.LocalDate;

public class Gerente extends Empleado {

	Cochera cochera;

	public Gerente(String nombreEmpleado, Integer salario, LocalDate fechaCumpleaños, Cochera cochera) {
		super(nombreEmpleado,salario,fechaCumpleaños);
		this.cochera = cochera;
	}

}
