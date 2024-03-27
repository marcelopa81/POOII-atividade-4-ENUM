package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Projeto p1 = new Projeto("Construção da loja XYZ", df.parse("01/01/2020"), df.parse("31/12/2021"));
		
		Funcionario f1 = new Funcionario("Dory", TipoDeDocumento.CPF, "999.999.999-00");
		Funcionario f2 = new Funcionario("Carline", TipoDeDocumento.CPF, "111.111.111-11");
		
		Contratacao c1 = new Contratacao(p1, f1, Cargo.DIRETOR, df.parse("01/01/2020"));
		Contratacao c2 = new Contratacao(p1, f2, Cargo.ADMINISTRATIVO, df.parse("11/10/2020"));
		
				
		p1.adicionarContratacao(c1);
		p1.adicionarContratacao(c2);
		
		p1.listarContratacao();
		
	}
	


}
