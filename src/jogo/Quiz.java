package jogo;

import javax.swing.JOptionPane;

public class Quiz {

	public class Perguntas {

	}

	public int perguntar(int s) {

		int nota = 0;

		if (s == 0) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 1*****\n\nPergunta 1: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 1*****\n\nPergunta 2: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 1*****\n\nPergunta 3: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 1*****\n\nPergunta 4: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 1*****\n\nPergunta 5: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}
		
		if (s == 1) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 1*****\n\nPergunta 1: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 1*****\n\nPergunta 2: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 1*****\n\nPergunta 3: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 1*****\n\nPergunta 4: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 1*****\n\nPergunta 5: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}

		if (s == 5) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORTUGUES*****\n\n*****Dia 2*****\n\nPergunta 1: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 2*****\n\nPergunta 2: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 2*****\n\nPergunta 3: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 2*****\n\nPergunta 4: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 2*****\n\nPergunta 5: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}
		
		if (s == 6) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 2*****\n\nPergunta 1: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 2*****\n\nPergunta 2: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 2*****\n\nPergunta 3: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 2*****\n\nPergunta 4: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 2*****\n\nPergunta 5: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}
		
		if (s == 10) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORTUGUES*****\n\n*****Dia 3*****\n\nPergunta 1: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 3*****\n\nPergunta 2: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 3*****\n\nPergunta 3: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 3*****\n\nPergunta 4: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*****\n\n*****Dia 3*****\n\nPergunta 5: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}
		
		if (s == 11) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 3*****\n\nPergunta 1: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 3*****\n\nPergunta 2: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 3*****\n\nPergunta 3: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 3*****\n\nPergunta 4: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*****PRATICAS DE LEITURA E ESCRITA EM INGLES*****\n\n*****Dia 3*****\n\nPergunta 5: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}

		return nota;
	}

}
