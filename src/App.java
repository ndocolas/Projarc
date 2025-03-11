public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, new TanqueCombustivel(TipoCombustivel.GASOLINA, 55), 10);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, new TanqueCombustivel(TipoCombustivel.GASOLINA, 45), 6);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, new TanqueCombustivel(TipoCombustivel.DIESEL, 70), 5);
        Carro suv = new Carro("SUV", TipoCombustivel.GASOLINA, new TanqueCombustivel(TipoCombustivel.FLEX, 55), 8);
        
        System.out.println("Tipos de veiculos:");
        System.out.println(basico);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);
    }
}
