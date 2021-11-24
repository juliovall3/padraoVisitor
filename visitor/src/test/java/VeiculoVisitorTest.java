public class VeiculoVisitorTest {

    @Test
    void ExibeCarro() {
        Carro carro = new Carro("Fiat", "Toro");
        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Carro" 'Fiat' 'Toro', visitor.exibir(carro));
    }

    @Test
    void ExibeAcessorios() {
        Acessorios acessorios = new Acessorios("black", "Pionner");
        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Acessorios" 'black' 'Pionner', visitor.exibir(acessorios));
    }
}
