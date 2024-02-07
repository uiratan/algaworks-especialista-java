import java.util.Objects;

public class Televisor {

    Integer volume = 20;
    Integer canal = 130;

    void mudarCanal(Integer novoCanal) {
        Objects.requireNonNull(novoCanal, "Novo canal deve ser informado");

//        if (canal == novoCanal) {
//        if (novoCanal.equals(canal)) {
        if (canal.intValue() == novoCanal.intValue()) {
            System.out.println("Novo canal é também o canal atual.");
            return;
        }


        canal = novoCanal;
        System.out.println("Canal alterado para " + canal);

    }

    void mudarVolume(Integer novoVolume) {
        Objects.requireNonNull(novoVolume, "Novo volume deve ser informado");

        if (novoVolume.intValue() == volume.intValue()) {
            System.out.println("Novo volume é também o volume atual.");
            return;
        }
        volume = Integer.valueOf(novoVolume.byteValue());
        System.out.println("Volume alterado para " + volume);

    }
}
