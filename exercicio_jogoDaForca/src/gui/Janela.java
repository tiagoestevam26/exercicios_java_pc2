package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dominio.Jogo;

public class Janela extends JFrame {

	private Jogo game;

	private String[] aux = { "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P",
			"A", "S", "D", "F", "G", "H", "J", "K", "L", "Ç",
			"Z", "X", "C", "V", "B", "N", "M" };

	private JButton newgameButton;
	private JButton verifyButton;
	private JButton exitButton;

	private JButton[] charButtons;

	private JTextField[] charWords;

	private javax.swing.JLabel textTop;
	private JLabel textBottom;

	private JPanel southBottom;
	private JPanel southBar;
	private JPanel center;
	private JPanel keyboard;
	private JPanel line1Char;
	private JPanel line2Char;
	private JPanel line3Char;

	private JPanel linhaPalavra;

	public Janela() {
		super("Jogo da forca!");
		game = new Jogo("palavras7letras");
		game.sorteiaPalavre();
		setLayout(new BorderLayout());
		instanceAttributes();
		adicionarComponentes();
		eventHandler();
	}

	private void instanceAttributes() {

		newgameButton = new JButton("Novo Jogo");
		verifyButton = new JButton("Conferir");
		exitButton = new JButton("Sair");

		charButtons = new JButton[26];

		charWords = new JTextField[7];

		charButtons = new JButton[27];
		for (int i = 0; i < charButtons.length; i++) {
			charButtons[i] = new JButton(aux[i]);
		}

		charWords = new JTextField[7];
		for (int i = 0; i < charWords.length; i++) {
			charWords[i] = new JTextField(" ");
		}

		textTop = new JLabel(" Adivinhe a palavra");

		textBottom = new JLabel(" Você tem 15 tentativas ");

		southBottom = new JPanel();
		southBar = new JPanel();
		center = new JPanel();
		keyboard = new JPanel();
		linhaPalavra = new JPanel();
		line1Char = new JPanel();
		line2Char = new JPanel();
		line3Char = new JPanel();
	}

	private void adicionarComponentes() {
		add(southBar, BorderLayout.SOUTH);
		southBar.setLayout(new GridLayout(2, 1));

		southBar.add(southBottom);
		southBar.add(textBottom);
		southBottom.setLayout(new GridLayout(1, 3));
		southBottom.add(newgameButton);
		southBottom.add(verifyButton);
		southBottom.add(exitButton);

		add(textTop, BorderLayout.NORTH);

		center.setLayout(new GridLayout(2, 1));
		add(center, BorderLayout.CENTER);

		center.add(linhaPalavra);
		center.add(keyboard);

		linhaPalavra.setLayout(new GridLayout(1, 7));
		for (JTextField campo : charWords)
			linhaPalavra.add(campo);
		keyboard.setLayout(new GridLayout(3, 1));
		keyboard.add(line1Char);
		keyboard.add(line2Char);
		keyboard.add(line3Char);

		line1Char.setLayout(new GridLayout(1, 10));
		line2Char.setLayout(new GridLayout(1, 10));
		line3Char.setLayout(new GridLayout(1, 7));

		for (int i = 0; i < 10; i++) {
			line1Char.add(charButtons[i]);
		}
		for (int i = 10; i < 20; i++) {
			line2Char.add(charButtons[i]);
		}
		for (int i = 20; i < 27; i++) {
			line3Char.add(charButtons[i]);
		}
	}

	private void eventHandler() {
		newgameButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				game = new Jogo("palavras7letras");
				game.sorteiaPalavre();

				for (int i = 0; i < charButtons.length; i++) {
					charButtons[i].setBackground(null);
				}

				for (int i = 0; i < charWords.length; i++) {
					charWords[i].setText("");
				}

				textTop.setText("Adivinhe a palavra");
				textBottom.setText("Você possui 15 tentativas!");
			}
		});

		exitButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.exit(1);
			}
		});

		verifyButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				String finalWord = "";

				for (int i = 0; i < charWords.length; i++) {
					finalWord += charWords[i].getText();
				}

				if (game.verificaFimJogo(finalWord)) {
					textTop.setText("Parabéns você venceu!");
				} else {
					textTop.setText("Poxa, não foi dessa vez - A palavra era: " + game.getPalavra());
				}

			}
		});

		for (int i = 0; i < charButtons.length; i++) {
			charButtons[i].addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {

					Object source = evt.getSource();

					if (source instanceof JButton && game.getNumTentativas() > 0) {
						JButton btn = (JButton) source;
						String charString = btn.getText();

						ArrayList<Integer> charIndex = game.verificaLetra(charString);

						btn.setBackground((charIndex.size() > 0) ? new Color(185, 217, 196) : new Color(240,128,128));

						for (Integer integer : charIndex) {
							charWords[integer].setText(charString);
						}

						textBottom.setText("Você possui " + game.getNumTentativas() + " tentativas!");
					} else {
						textBottom.setText("Você não possui mais tentativas! A palavra era: " + game.getPalavra()
								+ "! Comece um novo jogo.");
					}

				}
			});
		}

	}
}