import java.time.LocalDate;

public class Gerente extends Empleado {

	Cochera cochera;

	public Gerente(String nombreEmpleado, Integer salario, LocalDate fechaCumpleaņos, Cochera cochera) {
		super(nombreEmpleado,salario,fechaCumpleaņos);
		this.cochera = cochera;
	}

}
