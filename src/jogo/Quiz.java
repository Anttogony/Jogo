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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 1: Qual dos aspectos da escrita abaixo é abordado pela disciplina?\n\n1 - Escrita como tecnologia\n2 - Escrita como ferramenta de comunicação\n3 - Escrita como mecanismo de aprendizado\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\\n\\n*****Dia 1*****\\n\\nPergunta 2: A leitura tem vários aspectos. Nesta disciplina ela irá ser abordada como:\\n\\n1 - Processo de semiotização\\n2 - Processo de interrelacionamente\\n3 - Processo de formação\\n\\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\\n\\n*****Dia 1*****\\n\\nPergunta 3: Qual dos temas abaixo está na ementa da disciplia?\\n\\n1 - Discurso\\n2 - Palestra\\n3 - Validação\\n\\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\\n\\n*****Dia 1*****\\n\\nPergunta 4: Qual dos temas abaixo está na ementa da disciplia?\\n\\n1 - texto\\n2 - Imagem\\n3 - Fala\\n\\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\\n\\n*****Dia 1*****\\n\\nPergunta 5: A linguagem será abordada como dimensões...\\n\\n1 - interrelacionadas\\n2 - agregadas\\n3 - interpretativas\\n\\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\\n\\n*****Dia 2*****\\n\\nPergunta 1: O termo discurso admite quantos significas?\\n\\n1 - vários\n2 - 1\n3 - 2\\n\\n**Digite o valor correspondente a sua resposta:");
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
