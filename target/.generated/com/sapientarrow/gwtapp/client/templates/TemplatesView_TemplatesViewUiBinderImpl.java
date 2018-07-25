package com.sapientarrow.gwtapp.client.templates;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class TemplatesView_TemplatesViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.templates.TemplatesView>, com.sapientarrow.gwtapp.client.templates.TemplatesView.TemplatesViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Templates")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.templates.TemplatesView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.templates.TemplatesView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.templates.TemplatesView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.templates.TemplatesView_TemplatesViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.templates.TemplatesView_TemplatesViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.templates.TemplatesView_TemplatesViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.templates.TemplatesView_TemplatesViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.templates.TemplatesView_TemplatesViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.templates.TemplatesView_TemplatesViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.templates.TemplatesView_TemplatesViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.templates.TemplatesView_TemplatesViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord129 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord129.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_Row2(), get_domId0Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for f_Row2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row2() {
      return build_f_Row2();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row2 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row2.add(get_f_Column3());
      f_Row2.add(get_f_Column4());
      f_Row2.add(get_f_Column5());


      return f_Row2;
    }

    /**
     * Getter for f_Column3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column3() {
      return build_f_Column3();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column3 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_8,MD_9,LG_9");
      // Setup section.
      f_Column3.add(get_typeStepMessage());


      return f_Column3;
    }

    /**
     * Getter for typeStepMessage called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Legend get_typeStepMessage() {
      return build_typeStepMessage();
    }
    private org.gwtbootstrap3.client.ui.Legend build_typeStepMessage() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Legend typeStepMessage = (org.gwtbootstrap3.client.ui.Legend) GWT.create(org.gwtbootstrap3.client.ui.Legend.class);
      // Setup section.
      typeStepMessage.setHTML(template_html1().asString());
      typeStepMessage.setStyleName("" + get_style().graycolor() + "");


      return typeStepMessage;
    }

    /**
     * Getter for f_Column4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column4() {
      return build_f_Column4();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column4 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_5,MD_5,LG_5");
      // Setup section.
      f_Column4.add(get_templateGreenPreview());


      return f_Column4;
    }

    /**
     * Getter for templateGreenPreview called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sapientarrow.gwtapp.client.templates.previews.TemplateGreenPreview get_templateGreenPreview() {
      return build_templateGreenPreview();
    }
    private com.sapientarrow.gwtapp.client.templates.previews.TemplateGreenPreview build_templateGreenPreview() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.templates.previews.TemplateGreenPreview templateGreenPreview = (com.sapientarrow.gwtapp.client.templates.previews.TemplateGreenPreview) GWT.create(com.sapientarrow.gwtapp.client.templates.previews.TemplateGreenPreview.class);
      // Setup section.


      this.owner.templateGreenPreview = templateGreenPreview;

      return templateGreenPreview;
    }

    /**
     * Getter for f_Column5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column5() {
      return build_f_Column5();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column5 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_5,MD_5,LG_5");
      // Setup section.
      f_Column5.add(get_templateMetroPreview());


      return f_Column5;
    }

    /**
     * Getter for templateMetroPreview called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sapientarrow.gwtapp.client.templates.previews.TemplateMetroPreview get_templateMetroPreview() {
      return build_templateMetroPreview();
    }
    private com.sapientarrow.gwtapp.client.templates.previews.TemplateMetroPreview build_templateMetroPreview() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.templates.previews.TemplateMetroPreview templateMetroPreview = (com.sapientarrow.gwtapp.client.templates.previews.TemplateMetroPreview) GWT.create(com.sapientarrow.gwtapp.client.templates.previews.TemplateMetroPreview.class);
      // Setup section.


      this.owner.templateMetroPreview = templateMetroPreview;

      return templateMetroPreview;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }
  }
}
