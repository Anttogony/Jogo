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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 1: Qual dos aspectos da escrita abaixo � abordado pela disciplina?\n\n1 - Escrita como tecnologia\n2 - Escrita como ferramenta de comunica��o\n3 - Escrita como mecanismo de aprendizado\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 2: A leitura tem v�rios aspectos. Nesta disciplina ela ir� ser abordada como:\n\n1 - Processo de interrelacionamente\n2 - Processo de semiotiza��o\n\n3 - Processo de forma��o\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 3: Qual dos temas abaixo est� na ementa da disciplia?\n\n1 - Discurso\n2 - Palestra\n3 - Valida��o\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 4: Qual dos temas abaixo est� na ementa da disciplia?\n\n1 - Imagem\n2 - Fala\n3 - texto\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 5: A linguagem ser� abordada como dimens�es...\n\n1 - interrelacionadas\n2 - agregadas\n3 - interpretativas\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 1*****\n\nPergunta 1: Escolha a forma correta do verbo to be no Presente Simples do ingl�s do pronome: It ___\n\n1 - are\n1 - is\n3 - am\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 1*****\n\nPergunta 2: Escolha a forma correta do verbo to be no Presente Simples do ingl�s do pronome: She ___\n\n1 - are\n2 - is\n3 - amn\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 1*****\n\nPergunta 3: Escolha a forma correta do verbo to be no Presente Simples do ingl�s do pronome: They ___\n\n1 - are\n2 - is\n3 - am\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 1*****\n\nPergunta 4: Escolha a forma correta do verbo to be no Presente Simples do ingl�s do pronome: You ___\n\n1 - am\n2 - is\n3 - are\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 1*****\n\nPergunta 5: Escolha a forma correta do verbo to be no Presente Simples do ingl�s do pronome: We ___\n\n1 - is\n2 - are\n3 - am\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}
		}

		if (s == 5) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 2*****\n\nPergunta 1: O termo discurso admite quantos significas?\n\n1 - 1\n2 - 2\n3 - V�rios\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 2*****\n\nPergunta 2: O significado mais conhecido sobre o termo discurso �:\n\n1 - exposi��o oral sobre determinado conte�do\n2 - exposi��o met�dica sobre determinado assunto\n3 - exposi�ao met�dica sobre v�rios assunto\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 2*****\n\nPergunta 3: O discurso tamb�m pode ser um conjunto de ideias organizadas por meio da linguagem de forma a influir no(a)...\n\n1 -raciocinio\n2 - aprendizagem\n3 - interpreta��o\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 2*****\n\nPergunta 4: Qual dos temas abaixo est� ne ementa da disciplia?\n\n1 - Texto\n2 - Imagem\n3 - Fala\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 2*****\n\nPergunta 5: A coes�o se manisfesta localmente. Isso quer dizer que:\n\n1 - Est� presente na superficie textual, sendo respons�vel pelas conex�es das frases\n2 - Est� presente na superficie textual, sendo respons�vel pelo encadeamento dos componentes textuais\n3 - Est� presente somente em alguns locais do texto\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}
		}
		
		if (s == 6) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 2*****\n\nPergunta 1: A frase `O computador est� funcionando` em ingl�s ficaria:\n\n1 - Working is the computer\n2 - The computer is working\n3 - Is the working the computer\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 2*****\n\nPergunta 2: Qual a tradu��o mais correta da frase` Anna and Brian are operating system` ?\n\n1 - Anna e Brian est�o estragando o sistema\n2 - Anna e Brian est�o consertando o sistema\n3 - Anna e Brian est�o operando o sistema\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 2*****\n\nPergunta 3: A negativa mais correta da frase 'My keyboard is broken' �:\n\n1 - My keyboard broken is not\n2 - Is not broken my Keyboard\n3 - My keyboard is not broken\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 2*****\n\nPergunta 4: A tradu��o da frase 'Jonathan is tired.' �:\n\n1 - Jonathan est� inpaciente\n2 - Jonathan � policial\n3 - Jonathan est� cansado\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 2*****\n\nPergunta 5: Qual das frases abaixo n�o est� em ingl�s?\n\n1 - Jeu denfant\n2 - The computer is good\n3 - Child's play\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 3*****\n\nPergunta 1: Qual o objetivo da carta de apresenta��o?\n\n1 - Expor historias sobre a vida do escrevente\n2 - Comseguir um emprego, est�gio, etc\n3 - Detalhar sua esperi�ncias profissional anterior.\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 3*****\n\nPergunta 2: O que o escrevente relata na carta?\n\n1 - Um pedido de emprego\n2 - Uma hist�ria sobre sua vida\n3 - Situa�oes reais da sua carreira acad�mica\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 3*****\n\nPergunta 3: Qual o genero da carta de apresenta��o\n\n1 - descritivo\n2 - apresentavivo\n3 - discursivo\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 3*****\n\nPergunta 4: O que � a paragrafa��o?\n\n1 - Um meio para dividir um texto em pequenas pro��es de informa��o\n2 - Um m�todo de dividir um par�grafo coerentemente\n3 - Um recurso para padronizar os par�grafos de um texto\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 3*****\n\nPergunta 5: Para que serve a paragrafa��o ?\n\n1 - Deixar o texto visualmente mais bonito\n2 - Auxiliar na organiza��o do texto\n3 - Distribuir de forma coerente as palavras em um par�grafo\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}
		}
		
		if (s == 11) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 3*****\n\nPergunta 1 : De acordo com a frase 'Maria's cell phone is blocked' tem algo que pertence a Maria bloqueado. O que �?\n\n1 - Celular\n2 - Notebook\n3 - Tablet\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia*3*****\n\nPergunta 2: Na frase 'John was at home when it started to rain and his computer got wet from a drip'.O que aconteceu com o computador de John?\n\n1 - Caiu\n2 - Molhou\n3 - Foi arranhado\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 3*****\n\nPergunta 3: 'Roberta's computer clock is late'. De acordo com esta frase, qual o problema de Roberta?\n\n1 - O rel�gio do seu computador est� atrasado\n2 - O seu cachorro n�o late\n3 - O rel�gio do seu computador est� adiantado\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 3*****\n\nPergunta 4: De acordo com a frase 'UFRN set up a Memory Management Council' o que a UFRN instalou?\n\n1 - Uma mem�ria de condendimentos\n2 - Um programa de gerenciamento de conselhos\n3 - Um conselho gestor da mem�ria\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGL�S*********************************************\n\n*****Dia 3*****\n\nPergunta 5: Five times seven:\n\n1 - 35\n2 - 11\n3 - Telefone\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
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
