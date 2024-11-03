/**
 * Classe que representa um controle de TV com funcionalidades básicas como
 * ligar, desligar, aumentar e diminuir o volume.
 */
public class ControleTv {

    private String ligarTv;
    private String desligarTv;
    private String aumentarVolume;
    private String diminuirVolume;

    /**
     * Retorna uma mensagem indicando que a televisão foi ligada.
     *
     * @return String - Mensagem de status ao ligar a televisão.
     */
    public String getLigarTv() {
        return "A televisão ligou";
    }

    /**
     * Define o status de ligar a televisão.
     *
     * @param ligarTv String representando o status de ligar a televisão.
     */
    public void setLigarTv(String ligarTv) {
        this.ligarTv = ligarTv;
    }

    /**
     * Retorna uma mensagem indicando que a televisão foi desligada.
     *
     * @return String - Mensagem de status ao desligar a televisão.
     */
    public String getDesligarTv() {
        return "A televisão desligou";
    }

    /**
     * Define o status de desligar a televisão.
     *
     * @param desligarTv String representando o status de desligar a televisão.
     */
    public void setDesligarTv(String desligarTv) {
        this.desligarTv = desligarTv;
    }

    /**
     * Retorna uma mensagem indicando que o volume foi aumentado em 1.
     *
     * @return String - Mensagem de status ao aumentar o volume.
     */
    public String getAumentarVolume() {
        return "A televisão subiu 1 de volume";
    }

    /**
     * Define o status de aumento de volume.
     *
     * @param aumentarVolume String representando o status de aumento de volume.
     */
    public void setAumentarVolume(String aumentarVolume) {
        this.aumentarVolume = aumentarVolume;
    }

    /**
     * Retorna uma mensagem indicando que o volume foi diminuído em 1.
     *
     * @return String - Mensagem de status ao diminuir o volume.
     */
    public String getDiminuirVolume() {
        return "A televisão desceu 1 de volume";
    }

    /**
     * Define o status de diminuição de volume.
     *
     * @param diminuirVolume String representando o status de diminuição de volume.
     */
    public void setDiminuirVolume(String diminuirVolume) {
        this.diminuirVolume = diminuirVolume;
    }
}

/**
 * Classe principal que executa a aplicação do controle de TV.
 */