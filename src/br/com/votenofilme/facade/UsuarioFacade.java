package br.com.votenofilme.facade;

import java.io.Serializable;

import br.com.caelum.vraptor.ioc.Component;
import br.com.votenofilme.dao.UsuarioDAO;
import br.com.votenofilme.exception.VotacaoException;
import br.com.votenofilme.model.UsuarioTO;

@Component
public class UsuarioFacade implements Serializable {
	private static final long serialVersionUID = 1L;

	private UsuarioDAO dao;
	
	public UsuarioFacade(UsuarioDAO dao){
		this.dao = dao; 
	}
	
	public UsuarioTO create(UsuarioTO usuario) throws Exception{
		if(findByEmail(usuario.getEmail()) != null){
			throw new VotacaoException("Foi realizada uma vota��o anterior com o E-mail informado! Voc� quer mesmo que seu filme ven�a!");
		}
		
		dao.save(usuario);
		
		return usuario;
	}	
	
	public UsuarioTO findByEmail(String email){
		return dao.findByEmail(email);		
	}
}
