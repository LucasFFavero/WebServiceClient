
package br.jus.cnj.tipos_servico_intercomunicacao_2_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoConsultarProcesso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoConsultarProcesso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idConsultante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senhaConsultante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroProcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="movimentos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="incluirDocumentos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *           &lt;element name="incluirCabecalho" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoConsultarProcesso", propOrder = {
    "idConsultante",
    "senhaConsultante",
    "numeroProcesso",
    "dataReferencia",
    "movimentos",
    "documentoOrIncluirDocumentosOrIncluirCabecalho"
})
public class TipoConsultarProcesso {

    protected String idConsultante;
    protected String senhaConsultante;
    protected String numeroProcesso;
    protected String dataReferencia;
    protected Boolean movimentos;
    @XmlElementRefs({
        @XmlElementRef(name = "documento", namespace = "http://www.cnj.jus.br/tipos-servico-intercomunicacao-2.2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "incluirDocumentos", namespace = "http://www.cnj.jus.br/tipos-servico-intercomunicacao-2.2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "incluirCabecalho", namespace = "http://www.cnj.jus.br/tipos-servico-intercomunicacao-2.2.2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> documentoOrIncluirDocumentosOrIncluirCabecalho;

    /**
     * Obtém o valor da propriedade idConsultante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdConsultante() {
        return idConsultante;
    }

    /**
     * Define o valor da propriedade idConsultante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdConsultante(String value) {
        this.idConsultante = value;
    }

    /**
     * Obtém o valor da propriedade senhaConsultante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaConsultante() {
        return senhaConsultante;
    }

    /**
     * Define o valor da propriedade senhaConsultante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaConsultante(String value) {
        this.senhaConsultante = value;
    }

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
     * Obtém o valor da propriedade dataReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataReferencia() {
        return dataReferencia;
    }

    /**
     * Define o valor da propriedade dataReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataReferencia(String value) {
        this.dataReferencia = value;
    }

    /**
     * Obtém o valor da propriedade movimentos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMovimentos() {
        return movimentos;
    }

    /**
     * Define o valor da propriedade movimentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMovimentos(Boolean value) {
        this.movimentos = value;
    }

    /**
     * Gets the value of the documentoOrIncluirDocumentosOrIncluirCabecalho property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoOrIncluirDocumentosOrIncluirCabecalho property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoOrIncluirDocumentosOrIncluirCabecalho().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getDocumentoOrIncluirDocumentosOrIncluirCabecalho() {
        if (documentoOrIncluirDocumentosOrIncluirCabecalho == null) {
            documentoOrIncluirDocumentosOrIncluirCabecalho = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.documentoOrIncluirDocumentosOrIncluirCabecalho;
    }

}
