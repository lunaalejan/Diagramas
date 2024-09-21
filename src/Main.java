import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Empleado>lstEmpleado=new ArrayList<>();

        Empleado emp1 = new Empleado("Carlos Perez","Gerente",3225000,"13/05/2018");
        Empleado emp2 = new Empleado("Marina Torres","Secretaria",1850000,"28/03/2022");
        Empleado emp3 = new Empleado("Antonio Bernal","Supervisor",2500000,"15/09/2019");

        List<Pelicula>lstPelicula=new ArrayList<>();

        Pelicula pel1 = new Pelicula("Bajo La Misma Estrella","Josh Boone","Romance",126);
        Pelicula pel2 = new Pelicula("Intensamente","Kelsey Mann","Infantil",96);
        Pelicula pel3 = new Pelicula("A Dos Metros De Ti","Justin Baldoni","Romance",117);

        List<Pedido>lstPedido=new ArrayList<>();

        Pedido pe1 = new Pedido(451,"19/09/2024","Disponible","Jose Martinez");
        Pedido pe2 = new Pedido(298,"28/08/2024","No Disponible","Erika Gonzalez");
        Pedido pe3 = new Pedido(590,"21/09/2024","Disponible","Jackson Ruiz");
    }
}