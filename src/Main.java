public class Main {
    public static void main(String[] args) {

        int idadeMinima = 15;

        System.out.println("----------Ninja1----------");

        //Ninja 1
        String nome1 = "Naruto Uzumaki";
        int idade1 = 12;
        String missao1 = "Entregar um pergaminho no País do Som";
        String dificuldade1 = "c";
        boolean completouOuNao1;


        System.out.println("NOME: "+nome1);
        System.out.println("IDADE: "+idade1);
        System.out.println("Missao: "+missao1);
        System.out.println("Dificuldade: "+dificuldade1);

        if ((idade1 < idadeMinima  && (dificuldade1.equalsIgnoreCase("C") || dificuldade1.equalsIgnoreCase("D"))) || idade1>idadeMinima){
            System.out.println("Ninja autorizado para realizar essa missao.");
            completouOuNao1 = true;
            String mensagem = completouOuNao1 ? "Concluida" : "Não concluida";
            System.out.println("Status da missao: "+mensagem);
        } else{
            System.out.println("Ninja não autorizado a realizar essa missao, idade minima incompleta... idade minima: "+idadeMinima);
        }

        System.out.println("----------Ninja2----------");

        //Ninja2
        String nome2 = "Tsunade Senju";
        int idade2 =34;
        String missao2 = "Se tornar Hokage";
        String dificuldade2 = "SS+";
        boolean completouOuNao2 ;

        System.out.println("NOME: "+nome2);
        System.out.println("IDADE: "+idade2);
        System.out.println("Missao: "+missao2);
        System.out.println("Dificuldade: "+dificuldade2);

        if ((idade2 < idadeMinima  && (dificuldade2.equalsIgnoreCase("C") || dificuldade1.equalsIgnoreCase("D"))) || idade2 > idadeMinima){
            System.out.println("Ninja autorizado para realizar essa missao.");
            completouOuNao2 = true;
            String mensagem = completouOuNao2 ? "Concluida" : "Não concluida";
            System.out.println("Status da missao: "+mensagem);
        }else{
            System.out.println("Ninja não autorizado a realizar essa missao, idade minima incompleta... idade minima: "+idadeMinima);
        }

        System.out.println("----------Ninja3----------");

        //Ninja3
        String nome3 = "Ino Yamanaka";
        int idade3 = 14;
        String missao3 = "Buscar Recursos na vila da areia";
        String dificuldade3 = "A";
        boolean completouOuNao3 ;

        System.out.println("NOME: "+nome3);
        System.out.println("IDADE: "+idade3);
        System.out.println("Missao: "+missao3);
        System.out.println("Dificuldade: "+dificuldade3);

        if ((idade3 < idadeMinima  && (dificuldade3.equalsIgnoreCase("C") || dificuldade1.equalsIgnoreCase("D"))) || idade3 > idadeMinima){
            System.out.println("Ninja autorizado para realizar essa missao.");
            completouOuNao3 = true;
            String mensagem = completouOuNao3 ? "Concluida" : "Não concluida";
            System.out.println("Status da missao: "+mensagem);
        }else{
            System.out.println("Ninja não autorizado a realizar essa missao, idade minima incompleta... idade minima: "+idadeMinima);
        }


    }
}
