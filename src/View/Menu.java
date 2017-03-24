package View;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.javafx.geom.AreaOp.AddOp;

import View.GerirExposicao;
import Controller.GestaoExposicao;

public class Menu {
		public Menu(){
		int op;
	Scanner esc = new Scanner(System.in);
	System.out.println("  -  Menu  -  ");
	System.out.println(" 1- Inserir Exposição ");
	op= esc.nextInt();
	
	
	switch (op){
		case 1:
			new GerirExposicao();
			break;
	
	}
}
}
