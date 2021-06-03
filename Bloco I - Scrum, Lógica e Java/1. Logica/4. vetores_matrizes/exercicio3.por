programa
{
	
	funcao inicio()
	{
	/*Enunciado:
	 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

	 */
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6], l, c, op

		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("\nEntre com um valor de N1: ")
				leia(N1[l][c])
				escreva("\nEntre com um valor de N2: ")
				leia(N2[l][c])

				M1[l][c] = N1[l][c] + N2[l][c]
				M2[l][c] = N1[l][c] - N2[l][c]
			}
		}
		escreva("\n\t\tMenu de opções")
		escreva("\n1-Soma das matrizes\n2-Diferença das matrizes")
		escreva("\nDigite sua opção: ")
		leia(op)
		escolha(op)
		{
			caso 1:
			para(l=0;l<4;l++)
			{
				para(c=0;c<6;c++)
				{
					escreva("\nSoma: ",M1[l][c])
				}
			}
			pare
			caso 2:
			para(l=0;l<4;l++)
			{
				para(c=0;c<6;c++)
				{
					escreva("\nDiferença: ",M2[l][c])
				}
			}
			pare
			caso contrario:
			escreva("\nOpção inválida!")	
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1097; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */