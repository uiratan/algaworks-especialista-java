public class Principal {
    public static void main(String[] args) {
        Cachorro cachorroUiratan = new Cachorro();
        cachorroUiratan.nome = "Ringo";
        cachorroUiratan.raca = "mistureba";
        cachorroUiratan.sexo = 'M';
        cachorroUiratan.idade = 10;

        Cachorro cachorroMeinha = new Cachorro();
        cachorroMeinha.nome = "Fenix";
        cachorroMeinha.raca = "Vira-lata";
        cachorroMeinha.sexo = 'M';
        cachorroMeinha.idade = 17;

        System.out.println(cachorroUiratan.nome);
        System.out.println(cachorroMeinha.nome);

    }
}
