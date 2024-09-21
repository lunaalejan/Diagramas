public class Pedido {
    public int numeroPedido;
    public String fecha;
    public String estado;
    public String cliente;

    public Pedido(){
    }

    public Pedido(int numeroPedido, String fecha, String estado, String cliente) {
        this.numeroPedido = numeroPedido;
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", fecha='" + fecha + '\'' +
                ", estado=" + estado +
                ", cliente='" + cliente + '\'' +
                '}';
    }

}
