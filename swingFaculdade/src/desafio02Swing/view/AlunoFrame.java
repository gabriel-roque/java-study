package desafio02Swing.view;

import desafio02Swing.controller.Controlador;
import desafio02Swing.model.Aluno;

import javax.swing.*;

public class AlunoFrame{

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
