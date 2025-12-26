// Arquivo: TesteImposto.java

import java.util.ArrayList;
import java.util.Scanner;

public class MainPrincipalImposto {
    public static void main(String[] args) {
        double valorBase;
        Scanner lerTeclado = new Scanner(System.in);

        System.out.println("Informe o valor base R$: ");
        valorBase = lerTeclado.nextDouble();

        ArrayList<Imposto> impostos = new ArrayList<Imposto>();

        ImpostoFederal impostoFederal = new ImpostoFederal();
        ImpostoMunicipal impostoMunicipal = new ImpostoMunicipal();
        ImpostoEstadual impostoEstadual = new ImpostoEstadual();

        impostos.add(impostoFederal);
        impostos.add(impostoMunicipal);
        impostos.add(impostoEstadual);


        for(Imposto imposto : impostos){
            imposto.exibirInformacoes(valorBase);
        }

        lerTeclado.close();
    }
}
