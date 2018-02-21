package maquina;

/**
 *
 * @author acabezaslopez
 */
public class Producto {

    String nome;
    float precio;

    public Producto() {
    }

    public Producto(String nome, float precio) {
        this.nome = nome;
        this.precio = precio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return ("Producto ->" + "nome=" + nome + ", precio=" + precio + "euros");
    }

}