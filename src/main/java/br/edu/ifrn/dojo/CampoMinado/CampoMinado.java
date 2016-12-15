package br.edu.ifrn.dojo.CampoMinado;

import java.util.Random;

public class CampoMinado {


  private Random r1;

  private int[][] valores;
  private int[][] estados;


  public CampoMinado(int linhaEColuna, int qtdBombas) {
    this.valores = new int[linhaEColuna][linhaEColuna]();
    this.estados = new int[linhaEColuna][linhaEColuna]();
  }


  private void atribui(int linha, int coluna, int valor) {
    this.valores[linha][coluna] = valor;
  }

  private int pegue(int linha, int coluna) {
    return this.valores[linha][coluna];
  }
}

private void posicionarMinas( ){

  r1 = new Random();
  qtd =0;
  int linha, coluna, qtd=0;

  while((qtd<valor)){
    linha = r1.nextInt(campo[][].length);
    coluna = r1.nextInt(campo[].length);

    if(campo[linha][coluna]!=null){
      continue;
    }else{
      campo[linha][coluna] = -1;
      qtd++;
    }
  }
}
