package br.unesp.rc.webservicesoap.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Lucas
 */
@Embeddable
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Acesso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "acesso_usuario", unique = true)
    private String usuario;

    @Column(name = "acesso_senha")
    private String senha;

    public Acesso() {
    }
}
