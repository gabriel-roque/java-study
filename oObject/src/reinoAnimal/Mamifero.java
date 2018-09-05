package reinoAnimal;

import javax.swing.*;

public class Mamifero {
    public String nome;
    private String raca;
    private String pelagem;
    protected int idade;

    Mamifero(String nome, String raca, String pelagem, int idade){
        this.nome = nome;
        this.raca = raca;
        this.pelagem = pelagem;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void statusAnimal(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome());
        JOptionPane.showMessageDialog(null, "Raca: " + this.getRaca());
        JOptionPane.showMessageDialog(null, "Pelagem: " + this.getPelagem());
        JOptionPane.showMessageDialog(null, "Idade: " + this.getIdade());
    }

}
