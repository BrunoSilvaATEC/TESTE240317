package View;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import Controller.GestaoExposicao;
import View.Menu;

public class GerirExposicao {
	
	public  void GerirExposicao(String nomeEx, String dataInicio, String dataFim, int quantVisitantes, int preco, String obras ){
		 String nomeEx1 ;
		 String dataInicio1;
		 String dataFim1;
		 int quantVisitantes1;
		 int preco1;
		 String obras1;
		 ArrayList<GestaoExposicao> b = null ;
		 GestaoExposicao b=new Exposicao (b);
		Scanner a = new Scanner(System.in);
		
		System.out.println(" - INSIRA O NOME DA EXPOSIÇÃO: ");
		nomeEx1 = a.nextLine();
		System.out.println(" - INSIRA A DATA DE INCIO: ");
		dataInicio1 = a.nextLine();
		System.out.println(" - INSIRA A DATA DE FIM: ");
		dataFim1 = a.nextLine();
		System.out.println(" - INSIRA A QUANTIDADE DE VISITANTES: ");
		quantVisitantes1 = a.nextInt();
		System.out.println(" - INSIRA O PREÇO ");
		preco1 = a.nextInt();
		System.out.println(" - INSIRA O NOME DA OBRA: ");
		obras1 = a.nextLine();
			
		b.add(nomeEx1,dataInicio1,dataFim1,quantVisitantes1,preco1,obras1);
		
		for (int i=0;i<=1;i++)
		{
		GerirExposicao(nomeEx1,dataInicio1,dataFim1,quantVisitantes1,preco1,obras1);
		}

	}

	

}