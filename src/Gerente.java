import java.time.LocalDate;

public class Gerente extends Empleado {

	Cochera cochera;

	public Gerente(String nombreEmpleado, Integer salario, LocalDate fechaCumplea�os, Cochera cochera) {
		super(nombreEmpleado,salario,fechaCumplea�os);
		this.cochera = cochera;
	}

}
