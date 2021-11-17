/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

/**
 *
 * @author Artur Francisco Pereira Carvalho, Deivison Oliveira Costa, Johnattan Silva Ferreira
 */
// Importando componente JFrame do toolkit Swing
import javax.swing.JFrame;

// Criando classe que defini a janela de execução
// e suas propriedades
public class GameFrame extends JFrame {
    GameFrame(){
        this.add(new GamePanel());
	this.setTitle("Jogo da Cobrinha");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.pack();
	this.setVisible(true);
	this.setLocationRelativeTo(null);
    }
}