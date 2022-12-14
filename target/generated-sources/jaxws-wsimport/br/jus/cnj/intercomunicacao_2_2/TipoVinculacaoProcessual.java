
package br.jus.cnj.intercomunicacao_2_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoVinculacaoProcessual complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoVinculacaoProcessual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="numeroProcesso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vinculo" use="required" type="{http://www.cnj.jus.br/intercomunicacao-2.2.2}modalidadeVinculacaoProcesso" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoVinculacaoProcessual")
public class TipoVinculacaoProcessual {

    @XmlAttribute(name = "numeroProcesso")
    protected String numeroProcesso;
    @XmlAttribute(name = "vinculo", required = true)
    protected ModalidadeVinculacaoProcesso vinculo;

    /**
     * Obtém o valor da propriedade numeroProcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    /**
     * Define o valor da propriedade numeroProcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProcesso(String value) {
        this.numeroProcesso = value;
    }

    /**
     * Obtém o valor da propriedade vinculo.
     * 
     * @return
     *     possible object is
     *     {@link ModalidadeVinculacaoProcesso }
     *     
     */
    public ModalidadeVinculacaoProcesso getVinculo() {
        return vinculo;
    }

    /**
     * Define o valor da propriedade vinculo.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalidadeVinculacaoProcesso }
     *     
     */
    public void setVinculo(ModalidadeVinculacaoProcesso value) {
        this.vinculo = value;
    }

}
