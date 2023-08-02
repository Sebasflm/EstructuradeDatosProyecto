import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechayhorallegada;
    private int pasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechayhorallegada, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechayhorallegada = fechayhorallegada;
        this.pasajeros = pasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechayhorallegada() {
        return fechayhorallegada;
    }

    public void setFechayhorallegada(Date fechayhorallegada) {
        this.fechayhorallegada = fechayhorallegada;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechayhorallegada=" + fechayhorallegada +
                ", pasajeros=" + pasajeros +
                '}';
    }
}
