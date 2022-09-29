
package br.jus.cnj.tipos_servico_intercomunicacao_2_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.jus.cnj.tipos_servico_intercomunicacao_2_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TipoConsultarProcessoDocumento_QNAME = new QName("http://www.cnj.jus.br/tipos-servico-intercomunicacao-2.2.2", "documento");
    private final static QName _TipoConsultarProcessoIncluirDocumentos_QNAME = new QName("http://www.cnj.jus.br/tipos-servico-intercomunicacao-2.2.2", "incluirDocumentos");
    private final static QName _TipoConsultarProcessoIncluirCabecalho_QNAME = new QName("http://www.cnj.jus.br/tipos-servico-intercomunicacao-2.2.2", "incluirCabecalho");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.jus.cnj.tipos_servico_intercomunicacao_2_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoConsultarAvisosPendentes }
     * 
     */
    public TipoConsultarAvisosPendentes createTipoConsultarAvisosPendentes() {
        return new TipoConsultarAvisosPendentes();
    }

    /**
     * Create an instance of {@link TipoConsultarAvisosPendentesResposta }
     * 
     */
    public TipoConsultarAvisosPendentesResposta createTipoConsultarAvisosPendentesResposta() {
        return new TipoConsultarAvisosPendentesResposta();
    }

    /**
     * Create an instance of {@link TipoConsultarTeorComunicacao }
     * 
     */
    public TipoConsultarTeorComunicacao createTipoConsultarTeorComunicacao() {
        return new TipoConsultarTeorComunicacao();
    }

    /**
     * Create an instance of {@link TipoConsultarTeorComunicacaoResposta }
     * 
     */
    public TipoConsultarTeorComunicacaoResposta createTipoConsultarTeorComunicacaoResposta() {
        return new TipoConsultarTeorComunicacaoResposta();
    }

    /**
     * Create an instance of {@link TipoConsultarProcesso }
     * 
     */
    public TipoConsultarProcesso createTipoConsultarProcesso() {
        return new TipoConsultarProcesso();
    }

    /**
     * Create an instance of {@link TipoConsultarProcessoResposta }
     * 
     */
    public TipoConsultarProcessoResposta createTipoConsultarProcessoResposta() {
        return new TipoConsultarProcessoResposta();
    }

    /**
     * Create an instance of {@link TipoEntregarManifestacaoProcessual }
     * 
     */
    public TipoEntregarManifestacaoProcessual createTipoEntregarManifestacaoProcessual() {
        return new TipoEntregarManifestacaoProcessual();
    }

    /**
     * Create an instance of {@link TipoEntregarManifestacaoProcessualResposta }
     * 
     */
    public TipoEntregarManifestacaoProcessualResposta createTipoEntregarManifestacaoProcessualResposta() {
        return new TipoEntregarManifestacaoProcessualResposta();
    }

    /**
     * Create an instance of {@link TipoConsultarAlteracao }
     * 
     */
    public TipoConsultarAlteracao createTipoConsultarAlteracao() {
        return new TipoConsultarAlteracao();
    }

    /**
     * Create an instance of {@link TipoConsultarAlteracaoResposta }
     * 
     */
    public TipoConsultarAlteracaoResposta createTipoConsultarAlteracaoResposta() {
        return new TipoConsultarAlteracaoResposta();
    }

    /**
     * Create an instance of {@link TipoConfirmarRecebimento }
     * 
     */
    public TipoConfirmarRecebimento createTipoConfirmarRecebimento() {
        return new TipoConfirmarRecebimento();
    }

    /**
     * Create an instance of {@link TipoConfirmarRecebimentoResposta }
     * 
     */
    public TipoConfirmarRecebimentoResposta createTipoConfirmarRecebimentoResposta() {
        return new TipoConfirmarRecebimentoResposta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.cnj.jus.br/tipos-servico-intercomunicacao-2.2.2", name = "documento", scope = TipoConsultarProcesso.class)
    public JAXBElement<String> createTipoConsultarProcessoDocumento(String value) {
        return new JAXBElement<String>(_TipoConsultarProcessoDocumento_QNAME, String.class, TipoConsultarProcesso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.cnj.jus.br/tipos-servico-intercomunicacao-2.2.2", name = "incluirDocumentos", scope = TipoConsultarProcesso.class)
    public JAXBElement<Boolean> createTipoConsultarProcessoIncluirDocumentos(Boolean value) {
        return new JAXBElement<Boolean>(_TipoConsultarProcessoIncluirDocumentos_QNAME, Boolean.class, TipoConsultarProcesso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.cnj.jus.br/tipos-servico-intercomunicacao-2.2.2", name = "incluirCabecalho", scope = TipoConsultarProcesso.class)
    public JAXBElement<Boolean> createTipoConsultarProcessoIncluirCabecalho(Boolean value) {
        return new JAXBElement<Boolean>(_TipoConsultarProcessoIncluirCabecalho_QNAME, Boolean.class, TipoConsultarProcesso.class, value);
    }

}
