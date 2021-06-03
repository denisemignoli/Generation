programa
{
	 
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
/*Enunciado:
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário; 
	d) percentual de pessoas com salário até R$100,00.  
*/
		real salario, somaS=0.0, mediaS, maiorS=0.0, H, porcS, mediaF
		inteiro filhos, somaF=0, cont=0

		//	somaS = soma salário	mediaS = media salário 	maiorS = maior salário	cont=quantd, pessoas que recebem até 100
		//	H = Habitante	numH = numero de habitantes 	filhos = Numero de filhos	somaF = soma filhos		porcS = porcento salario	
		

		para(H=1;H<=20;H++)
		{
			escreva("\nEntre com o seu salário: ")
			leia(salario)
			escreva("\nEntre com a quantidade de filhos: ")
			leia(filhos)

			somaS = (somaS + salario)
			somaF = (somaF + filhos)

			se(maiorS<salario)
			{
				maiorS = salario
			}

			se(salario<=100)
			{
				cont++
			}
		}
		mediaS = somaS / 20 // as médias ficam pra fora do laço pq queremos 1 média só
		mediaF = somaF / 20
		porcS = (cont * 100)/20

		escreva("\nA média do salário da população é de R$ : ", mediaS)
		escreva("\nA média do número de filhos é: ", mediaF)
		escreva("\nO maior salário é de R$ ", maiorS)
		escreva("\nO percentual de pessoas com salário até R$100,00 é de ", porcS)
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 797; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */