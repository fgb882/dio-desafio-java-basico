
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
        ArrayList<String> candidatosAprovados = selecaoCandidatos();
        imprimirSelecionados(candidatosAprovados);
        for (String candidato : candidatosAprovados) {
            ligarCandidato(candidato);
        }
    }

    static ArrayList selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Júlia", "Paulo", "Monica", "Augusto", "Fabrício", "Mirela", "Daniela", "Jorge"};
        ArrayList<String> candidatosAprovados = new ArrayList<String>();
        double salarioBase = 2000.0;
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido + " de salário.");
            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosAprovados.add(candidato);
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado.");
            }
            candidatosAtual++;
        }

        return candidatosAprovados;
    }

    static void imprimirSelecionados(ArrayList<String> candidatos) {
        ArrayList<String> candidatosAprovados = candidatos;

        System.out.println("Imprimindo a lista de candidatos.");
        for (String candidato : candidatosAprovados) {

            System.out.println("Imprimindo " + candidato);

        }

    }

    static void ligarCandidato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu == true) {
            System.out.println("Contato com " + candidato + " realizado com sucesso na tentativa " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ".");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o Candidato com contra-proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

}
