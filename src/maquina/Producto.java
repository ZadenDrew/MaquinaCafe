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
/**
 * 
 * @param nome
 * @param precio 
 */
    public Producto(String nome, float precio) {
        this.nome = nome;
        this.precio = precio;
    }
/**
 * 
 * @return 
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return 
 */
    public float getPrecio() {
        return precio;
    }
/**
 * 
 * @param precio 
 */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
/**
 * 
 * @return 
 */
    @Override
    public String toString() {
        return ("Producto ->" + "nome=" + nome + ", precio=" + precio + "euros");
    }

}