package desafio02Swing;

import javax.swing.*;

public class AlunoFrame extends Controlador{

    private JTextField nomeTextFiled;
    private JButton okButtun;
    private JButton cancelarButton;
    private JTextField notaTextFiled;
    private Controlador controlador;
    private Aluno aluno;
    private boolean editando;


    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }


    private void thisWindowClosing(){
        //
    }

    private void cancelarButtonActionPeformed(){
        //
    }

    private void cancalar(){
        //
    }

    private void carregarDados(){
        //
    }

}
