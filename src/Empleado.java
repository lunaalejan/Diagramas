public class Empleado {
    public String nombre;
    public String puesto;
    public int salario;
    public String fechaIngreso;

    public Empleado() {
    }

    public Empleado(String nombre, String puesto, int salario, String fechaIngreso) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

}