
package br.jus.cnj.intercomunicacao_2_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoRelacionamentoPessoal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoRelacionamentoPessoal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pessoa" type="{http://www.cnj.jus.br/intercomunicacao-2.2.2}tipoPessoa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="modalidadeRelacionamento" type="{http://www.cnj.jus.br/intercomunicacao-2.2.2}modalidadesRelacionamentoPessoal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRelacionamentoPessoal", propOrder = {
    "pessoa"
})
public class TipoRelacionamentoPessoal {

    protected TipoPessoa pessoa;
    @XmlAttribute(name = "modalidadeRelacionamento")
    protected ModalidadesRelacionamentoPessoal modalidadeRelacionamento;

    /**
     * Obtém o valor da propriedade pessoa.
     * 
     * @return
     *     possible object is
     *     {@link TipoPessoa }
     *     
     */
    public TipoPessoa getPessoa() {
        return pessoa;
    }

    /**
     * Define o valor da propriedade pessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPessoa }
     *     
     */
    public void setPessoa(TipoPessoa value) {
        this.pessoa = value;
    }

    /**
     * Obtém o valor da propriedade modalidadeRelacionamento.
     * 
     * @return
     *     possible object is
     *     {@link ModalidadesRelacionamentoPessoal }
     *     
     */
    public ModalidadesRelacionamentoPessoal getModalidadeRelacionamento() {
        return modalidadeRelacionamento;
    }

    /**
     * Define o valor da propriedade modalidadeRelacionamento.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalidadesRelacionamentoPessoal }
     *     
     */
    public void setModalidadeRelacionamento(ModalidadesRelacionamentoPessoal value) {
        this.modalidadeRelacionamento = value;
    }

}
