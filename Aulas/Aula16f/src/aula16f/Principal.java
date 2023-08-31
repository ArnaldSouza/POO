
package aula16f;

public class Principal {

    public class Paciente {

        private String nome;
        private int idade;

        public Paciente(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

    }

    public class Historico {

    }

    public interface IHistoricoPaciente {

        public Historico getHistorico();
    }

    public interface IDadosPaciente {

        public Paciente getDados();
    }

    public abstract class SistemaHospitalar implements IHistoricoPaciente, IDadosPaciente {

        public abstract Historico getHistorico();

        public abstract Paciente getDados();

    }

    public class UnidadeProntoAtendimento extends SistemaHospitalar {

        private Paciente paciente;
        private Historico historico;

        public Paciente getDados() {
            return this.paciente;
        }

        public Historico getHistorico() {
            return this.historico;
        }

    }

    public Principal() {

    }

    public static void main(String[] args) {

    }

}
