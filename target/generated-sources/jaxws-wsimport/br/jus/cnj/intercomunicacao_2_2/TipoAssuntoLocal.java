
package br.jus.cnj.intercomunicacao_2_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoAssuntoLocal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoAssuntoLocal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assuntoLocalPai" type="{http://www.cnj.jus.br/intercomunicacao-2.2.2}tipoAssuntoLocal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="codigoPaiNacional" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="codigoAssunto" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoAssuntoLocal", propOrder = {
    "assuntoLocalPai"
})
public class TipoAssuntoLocal {

    protected TipoAssuntoLocal assuntoLocalPai;
    @XmlAttribute(name = "descricao")
    protected String descricao;
    @XmlAttribute(name = "codigoPaiNacional", required = true)
    protected int codigoPaiNacional;
    @XmlAttribute(name = "codigoAssunto", required = true)
    protected int codigoAssunto;

    /**
     * Obtém o valor da propriedade assuntoLocalPai.
     * 
     * @return
     *     possible object is
     *     {@link TipoAssuntoLocal }
     *     
     */
    public TipoAssuntoLocal getAssuntoLocalPai() {
        return assuntoLocalPai;
    }

    /**
     * Define o valor da propriedade assuntoLocalPai.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAssuntoLocal }
     *     
     */
    public void setAssuntoLocalPai(TipoAssuntoLocal value) {
        this.assuntoLocalPai = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade codigoPaiNacional.
     * 
     */
    public int getCodigoPaiNacional() {
        return codigoPaiNacional;
    }

    /**
     * Define o valor da propriedade codigoPaiNacional.
     * 
     */
    public void setCodigoPaiNacional(int value) {
        this.codigoPaiNacional = value;
    }

    /**
     * Obtém o valor da propriedade codigoAssunto.
     * 
     */
    public int getCodigoAssunto() {
        return codigoAssunto;
    }

    /**
     * Define o valor da propriedade codigoAssunto.
     * 
     */
    public void setCodigoAssunto(int value) {
        this.codigoAssunto = value;
    }

}
