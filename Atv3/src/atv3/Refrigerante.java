/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv3;

/**
 *
 * @author igorl
 */
public class Refrigerante {
    private String Nome;
    private float preco;
    
    public void alteraValor(float val){
        this.preco = val;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public Refrigerante(String nome, float valor){
        this.Nome = nome;
        this.preco = valor;
    }
}
