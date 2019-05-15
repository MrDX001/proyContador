/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *Clase que va a implementar contador;
 * @version 0.1
 */
public class Contador {
    private int valor;
    /**
     *Metodo que retorna el valor del cronometro;
     * @return el valor del contador
     */
    public int getValor() {
        return valor;
    }
    /**
     *Metodo que establece el valor del cronometro;
     * @param valor: entero que se setea en el atributo de la clase
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Contador(){
        this.valor=0;
    }
    /**
     *Metodo que avanza el valor del cronometro;
     */
    public void avanzar(){
        this.valor+=1;
    }
    /**
     *Metodo que retrocede el valor del contador;
     */
    public void retroceder(){
        this.valor-=1;
    }
    /**
     *Metodo que reinicia el valor del contador;
     */
    public void borrar(){
        this.valor= 0;
    }
}
