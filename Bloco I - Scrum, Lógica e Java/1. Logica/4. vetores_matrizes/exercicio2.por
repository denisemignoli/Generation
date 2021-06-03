programa
{
	
	funcao inicio()
	{
	/*Enunciado:
	* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	* A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	*/

		inteiro valores[10], x, total=0, maiorvalor=0, quantidade=0, media

		para(x=0;x<10;x++)
		{				
				escreva("\nValor dado após o lançamento: ")
				leia(valores[x])
			
				se (valores[x]<=6)
				{
					total = total + valores[x]
				}
    			
   				senao
   				{
   					escreva ("impossivel, o dado só tem 6 lados")
   				}

   		para(x=0;x<10;x++)
   		{
   			se(maiorvalor==valores[x])
   			{
   				quantidade++
   				maiorvalor = valores[x]
   			}
   		}
		}
		total=total/10
		escreva("\nA média dos dados lançados é ", total, "e o maior valor foi de ",maiorvalor)	
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */