import java.util.Date;

public class Sistema {
    public static void main(String [] args) {
        //ETAPA CADASTROS DO ESTABELECIMENTO
        Estabelecimento fastClean = new Estabelecimento();
        fastClean.cpfCnpj = "123871823787";
        fastClean.nome = "FAST CLEAN LAVA RAPIDO";
        fastClean.id = 133;
        fastClean.telefone = 11965438760L;

        Servico lavagemAuto = new Servico();
        lavagemAuto.id = 1;
        lavagemAuto.descricao="LAVAGEM CARRO COMPLETA";
        lavagemAuto.valor = 45.0;

        //ETAPA CADASTRANDO OS CLIENTES POR DEDEMANDA
        Cliente gleyson = new Cliente();
        gleyson.cpfCnpj = "81231763";
        gleyson.nome = "GLEYSON SAMPAIO";
        gleyson.id = 98;
        gleyson.telefone = 11956780987L;


        Equipamento jeep = new Equipamento();
        jeep.id = "NOJ-3348";
        jeep.descricao = "JEEP RENEGADE CINZA";
        jeep.tipo = "VEICULO";


        //GERANDO A ORDEM DE SERVIÇO
        OrdemServico os = new OrdemServico();
        os.id = 987;
        os.dataHoraAbertura = new Date();
        os.valorTotal = 45.0;
        os.estabelecimento = fastClean;
        os.cliente = gleyson;
        os.servico = lavagemAuto;
        os.equipamento = jeep;

        GeradoraMensagem geradoraMensagem = new GeradoraMensagem();
        String mensagemGeradaPelaGeradora = geradoraMensagem.gerarMensagem(os);

        System.out.println(mensagemGeradaPelaGeradora);
        /*
        Sr(a) {NOME_CLIENTE}, informamos que  foi finalizado o serviço de {DESCRICAO_SERVICO} no(a) {TIPO_EQUIPAMENTO}
        de identificação {ID_EQUIPAMENTO} referente à um(a) {DESCRICAO_EQUIPAMENTO}.
        Aproveitamos também para informar que o valor final do serviço foi de {VALOR_SERVICO} e
        que aceitamos todas as formas de pagamento.

        Fast Clean, {DATA_HORA}
         */
    }
}
