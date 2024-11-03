public class App {

    /**
     * Método principal que cria uma instância de ControleTv e exibe o status da TV.
     *
     * @param args Argumentos de linha de comando (não utilizado).
     * @throws Exception Exceção lançada em caso de erro.
     */
    public static void main(String[] args) throws Exception {
        ControleTv controle = new ControleTv();

        System.out.println(controle.getLigarTv());
        System.out.println(controle.getAumentarVolume());
        System.out.println(controle.getDiminuirVolume());
        System.out.println(controle.getDesligarTv());
    }
}