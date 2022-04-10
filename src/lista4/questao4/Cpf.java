package lista4.questao4;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Cpf {

    public void formatarCpf(String cpfNaoFormatado){
        final String CPF_FORMAT = "###.###.###-##";
        System.out.println(formatar(CPF_FORMAT, cpfNaoFormatado));
    }

    public static String formatar(String formatoMask, Object valor){
        MaskFormatter mask;
        try{
            mask = new MaskFormatter(formatoMask);
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(valor);
        } catch (ParseException e ){
            throw new RuntimeException(e);
        }
    }
}
