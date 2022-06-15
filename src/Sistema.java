import java.util.ArrayList;
import java.util.TreeSet;

public class Sistema {
	private String nombre;
	private ArrayList<Empleado>empleados;

	public Sistema (String nombre) {
		this.nombre = nombre;
		empleados = new ArrayList<Empleado>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarEmpleado(Empleado nuevo) {
		empleados.add(nuevo);
	}

	public Empleado llamarEmpleado(Integer numeroEmpleado) {
		return empleados.get(numeroEmpleado);
		
	}
	

	public TreeSet<Empleado> empleadosOrdenadosPorNombre() {
		TreeSet<Empleado>lista = new TreeSet<Empleado>();
		lista.addAll(empleados);
		return lista;
	}

}