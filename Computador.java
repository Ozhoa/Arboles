public class Computador {
    private int codigo;
    private String marca;
    private String procesador;
    private int ram; //en gigas

    public Computador(int codigo, String marca, String procesador, int ram) {
        this.codigo = codigo;
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Computador " +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                ", procesador='" + procesador + '\'' +
                ", ram=" + ram+"\n";
    }
}
