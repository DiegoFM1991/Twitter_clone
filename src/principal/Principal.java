package principal;

import java.util.ArrayList;
import java.util.Iterator;
import entidade.Usuario;
import entidade.Administrador;
import entidade.Pruu;

public class Principal {
	
	public static void main(String[] args) {
		
		Administrador moderador = new Administrador ("Moderador", "moderador@pombo.com", "123546789-00");
		Usuario joao = new Usuario("João", "joao@pombo.com", "123456789-11");
		Usuario antonio = new Usuario ("Antônio", "antonio@pombo.com", "123456789-22");
		
		ArrayList <Pruu> pruuModerador =  new ArrayList<Pruu>();
		adm.setPruus(pruuModerador);
		Pruu pruuModerador1 = new Pruu("Primeiro teste");
		Pruu pruuModerador2 = new Pruu("Segundo teste");
		pruuAdministrador.add(pruuModerador1);
		pruuAdministrador.add(pruuModerador2);
		
		ArrayList <Pruu> pruuJoao =  new ArrayList<Pruu>();
		joao.setPruus(pruuJoao);
		Pruu pruuJoao1 = new Pruu("Terceiro teste");
		Pruu pruuJoao2 = new Pruu("Quarto teste");
		pruuJoao.add(pruuJoao1);
		pruuJoao.add(pruuJoao2);
		
		ArrayList <Pruu> pruuAntonio =  new ArrayList<Pruu>();
		antonio.setPruus(pruuAntonio);
		Pruu pruuAntonio1 = new Pruu("Quinto teste");
		Pruu pruuAntonio2 = new Pruu("Sexto teste");
		pruuAntonio.add(pruuAntonio1);
		pruuAntonio.add(pruuAntonio2);
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios.add(moderador);
		listaUsuarios.add(joao);
		listaUsuarios.add(antonio);
		
		listarPruus(listaUsuarios);
		int quantidadePruusJoao = joao.getPruus().size();
		System.out.print("Nome: " + joao.getNome());
		for (int i = 0; i < quantidadePruusJoao; i++) {
			System.out.println(joao.getPruus().get(i).toString());
		}
		
		antonio.darLike(pruuJoao1);
		joao.darLike(pruuModerador2);
		moderador.bloquearPruu(pruuAntonio2);
		listarPruus(listaUsuarios);
	}

	private static void listarPruus(ArrayList<Usuario> listaUsuarios) {
		for (int i = 0; i < listaUsuarios.size(); i++) {
			int quantidadePruus = listaUsuarios.get(i).getPruus().size();
			System.out.print("Nome: " + listaUsuarios.get(i).getNome());
				for (int j = 0; j < quantidadePruus; j++) {
				System.out.println(listaUsuarios.get(i).getPruus().get(j).toString());	
				}
			}
		}
}