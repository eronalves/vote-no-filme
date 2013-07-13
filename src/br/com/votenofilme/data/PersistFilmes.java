package br.com.votenofilme.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.votenofilme.model.FilmeTO;

public class PersistFilmes implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public static List<FilmeTO> persistFilmes(){
		FilmeTO filmeOne = new FilmeTO();
		filmeOne.setTitulo("Blade Runner");
		filmeOne.setSinopse("O filme descreve um futuro em que a humanidade inicia a coloniza��o espacial, " +
				"para o que cria seres geneticamente alterados - replicantes - utilizados em tarefas pesadas, " +
				"perigosas ou degradantes nas novas col�nias [...]");
		filmeOne.setImagem("bladerunner.jpg");
		filmeOne.setAno(1982);
		filmeOne.setDiretor("Ridley Scott");		
		
		FilmeTO filmeTwo = new FilmeTO();
		filmeTwo.setTitulo("Star Wars - Return of the Jedi");
		filmeTwo.setSinopse("O imperador (Ian McDiarmid) est� supervisionando a constru��o de uma nova " +
				"Estrela da Morte. Enquanto isso Luke Skywalker (Mark Hamill) liberta Hans Solo " +
				"(Harrison Ford) e a Princesa Leia (Carrie Fisher) das m�os de Jaba [...]");
		filmeTwo.setImagem("starwars-returnofthejedi.jpg");
		filmeTwo.setAno(1983);
		filmeTwo.setDiretor("Richard Marquand");
		
		FilmeTO filmeThree = new FilmeTO();
		filmeThree.setTitulo("Metropolis");
		filmeThree.setSinopse("Metropolis, ano 2026. Os poderosos ficam na superf�cie, onde h� o Jardim dos Prazeres," +
				" destinado aos filhos dos mestres. Os oper�rios, em regime de escravid�o, " +
				"trabalham bem abaixo da superf�cie, na Cidade dos Trabalhadores [...]");
		filmeThree.setImagem("metropolis.jpg");
		filmeThree.setAno(1927);
		filmeThree.setDiretor("Fritz Lang");
		
		FilmeTO filmeFour = new FilmeTO();
		filmeFour.setTitulo("2001: A Space Odyssey");
		filmeFour.setSinopse("Desde a 'Aurora do Homem' (a pr�-hist�ria), um misterioso monolito negro parece" +
				" emitir sinais de outra civiliza��o interferindo no nosso planeta. Quatro milh�es de anos" +
				" depois, no s�culo XXI, uma equipe de astronautas [...]");
		filmeFour.setImagem("spaceodyssey.jpg");
		filmeFour.setAno(1968);
		filmeFour.setDiretor("Stanley Kubrick");
		
		FilmeTO filmeFive = new FilmeTO();
		filmeFive.setTitulo("Back to the Future");
		filmeFive.setSinopse("Um jovem (Michael J. Fox) aciona acidentalmente uma m�quina do tempo constru�da " +
				"por um cientista (Christopher Lloyd) em um Delorean, retornando aos anos 50." +
				" L� conhece sua m�e (Lea Thompson) [...]");
		filmeFive.setImagem("backtothefuture.jpg");
		filmeFive.setAno(1985);
		filmeFive.setDiretor("Robert Zemeckis");
		
		List<FilmeTO> filmes = new ArrayList<FilmeTO>();
		filmes.add(filmeOne);
		filmes.add(filmeTwo);
		filmes.add(filmeThree);
		filmes.add(filmeFour);
		filmes.add(filmeFive);
		
		return filmes;
	}

}
