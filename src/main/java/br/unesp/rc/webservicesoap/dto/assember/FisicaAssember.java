package br.unesp.rc.webservicesoap.dto.assember;

import br.unesp.rc.webservicesoap.dto.EnderecoDTO;
import br.unesp.rc.webservicesoap.dto.FisicaDTO;
import br.unesp.rc.webservicesoap.entity.Acesso;
import br.unesp.rc.webservicesoap.entity.Contato;
import br.unesp.rc.webservicesoap.entity.Endereco;
import br.unesp.rc.webservicesoap.entity.Fisica;

/**
 *
 * @author Lucas
 */
public class FisicaAssember {

    private FisicaAssember() {

    }

    public static Fisica dtoToEntityModel(FisicaDTO dto) {
        Fisica fisica = new Fisica();

        fisica.setCpf(dto.getCpf());
        fisica.setDataNascimento(dto.getDataNascimento());
        fisica.setNome(dto.getNome());

        Acesso a = new Acesso();
        a.setUsuario(dto.getUsuario());
        a.setSenha(dto.getSenha());
        fisica.setAcesso(a);

        Contato c = new Contato();
        c.setTelefoneResidencial(dto.getTelefoneResidencial());
        c.setTelefoneComercial(dto.getTelefoneComercial());
        c.setCelular(dto.getCelular());
        c.setEmail(dto.getEmail());
        fisica.setContato(c);

        for (EnderecoDTO edto : dto.getEndereco()) {
            Endereco e = new Endereco();
            e.setRua(edto.getRua());
            e.setNumero(edto.getNumero());
            e.setBairro(edto.getBairro());
            e.setCep(edto.getCep());
            e.setCidade(edto.getCidade());
            e.setEstado(edto.getEstado());
            fisica.setEndereco(e);
        }

        return fisica;
    }
}
