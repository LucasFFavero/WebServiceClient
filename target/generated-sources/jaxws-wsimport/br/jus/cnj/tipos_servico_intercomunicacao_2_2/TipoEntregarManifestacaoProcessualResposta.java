
package br.jus.cnj.tipos_servico_intercomunicacao_2_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.jus.cnj.intercomunicacao_2_2.TipoParametro;


/**
 * <p>Classe Java de tipoEntregarManifestacaoProcessualResposta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoEntregarManifestacaoProcessualResposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sucesso" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="protocoloRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recibo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="parametro" type="{http://www.cnj.jus.br/intercomunicacao-2.2.2}tipoParametro" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntregarManifestacaoProcessualResposta", propOrder = {
    "sucesso",
    "mensagem",
    "protocoloRecebimento",
    "dataOperacao",
    "recibo",
    "parametro"
})
public class TipoEntregarManifestacaoProcessualResposta {

    protected boolean sucesso;
    protected String mensagem;
    protected String protocoloRecebimento;
    protected String dataOperacao;
    protected byte[] recibo;
    protected List<TipoParametro> parametro;

    /**
     * Obtém o valor da propriedade sucesso.
     * 
     */
    public boolean isSucesso() {
        return sucesso;
    }

    /**
     * Define o valor da propriedade sucesso.
     * 
     */
    public void setSucesso(boolean value) {
        this.sucesso = value;
    }

    /**
     * Obtém o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Obtém o valor da propriedade protocoloRecebimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocoloRecebimento() {
        return protocoloRecebimento;
    }

    /**
     * Define o valor da propriedade protocoloRecebimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocoloRecebimento(String value) {
        this.protocoloRecebimento = value;
    }

    /**
     * Obtém o valor da propriedade dataOperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOperacao() {
        return dataOperacao;
    }

    /**
     * Define o valor da propriedade dataOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOperacao(String value) {
        this.dataOperacao = value;
    }

    /**
     * Obtém o valor da propriedade recibo.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRecibo() {
        return recibo;
    }

    /**
     * Define o valor da propriedade recibo.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRecibo(byte[] value) {
        this.recibo = value;
    }

    /**
     * Gets the value of the parametro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoParametro }
     * 
     * 
     */
    public List<TipoParametro> getParametro() {
        if (parametro == null) {
            parametro = new ArrayList<TipoParametro>();
        }
        return this.parametro;
    }

}
