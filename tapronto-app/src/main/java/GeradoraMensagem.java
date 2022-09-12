import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradoraMensagem {

    String gerarMensagem(OrdemServico ordemServico){
         /*
        Sr(a) {NOME_CLIENTE}, informamos que  foi finalizado o serviço de {DESCRICAO_SERVICO} no(a)
         {TIPO_EQUIPAMENTO}
        de identificação {ID_EQUIPAMENTO} referente à um(a) {DESCRICAO_EQUIPAMENTO}.
        Aproveitamos também para informar que o valor final do serviço foi de {VALOR_SERVICO} e
        que aceitamos todas as formas de pagamento.

        Fast Clean, {DATA_HORA}
         */

        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Sr(a) " + ordemServico.cliente.nome + ", ");
        mensagem.append("informamos que foi finalizado o serviço de " + ordemServico.servico.descricao );
        mensagem.append(" no(a) " + ordemServico.equipamento.tipo);
        mensagem.append(" de identificação " + ordemServico.equipamento.id);
        mensagem.append(" referente à um(a) " + ordemServico.equipamento.descricao + ".\n");

        String valorFormatador = NumberFormat.getCurrencyInstance().format(ordemServico.valorTotal);
        mensagem.append("Aproveitamos também para informar que o valor final do serviço foi de " + valorFormatador);
        mensagem.append(" e que aceitamos todas as formas de pagamento.\n\n");

        Date dataHora = new Date();
        SimpleDateFormat formatadoraData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataHoraFormatada = formatadoraData.format(dataHora);
        mensagem.append("Fast Clean " +  dataHoraFormatada);
        return mensagem.toString();
    }
    /*
       Pesquisem em outras fontes sobre : Exemplos
        * StringBuilder
        * DateFormat \ SimpleDateFormat
        * NumberFormat \ DecimalFormat
     */

}
