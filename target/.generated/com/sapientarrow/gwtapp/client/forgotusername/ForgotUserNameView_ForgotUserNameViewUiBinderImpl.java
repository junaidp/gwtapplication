package com.sapientarrow.gwtapp.client.forgotusername;

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

public class ForgotUserNameView_ForgotUserNameViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView>, com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView.ForgotUserNameViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Submit")
    SafeHtml html1();
     
    @Template("<head> <link href='Metro-UI-CSS-master/build/css/metro.css' rel='stylesheet'> </head> <body class='metro'> <div style='padding-left:40%; padding-top:10%'> <div class='padding20'> <form> <h4 class='text-light blue'>Forgot Username</h4> <div> <span id='{0}'></span> </div> <div> <span class='mif-user prepend-icon'></span> <span id='{1}'></span> </div> <div class='form-actions'> <span id='{2}'></span> </div>  </form> </div> </div> </body>")
    SafeHtml html2(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId0(), get_domId1(), get_domId2());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView_ForgotUserNameViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView_ForgotUserNameViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView_ForgotUserNameViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView_ForgotUserNameViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView_ForgotUserNameViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView_ForgotUserNameViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView_ForgotUserNameViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.forgotusername.ForgotUserNameView_ForgotUserNameViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      UiBinderUtil.TempAttachment attachRecord121 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();

      // Detach section.
      attachRecord121.detach();
      f_HTMLPanel1.addAndReplaceElement(get_lblError(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_txtEmail(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnSubmit(), get_domId2Element().get());

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
     * Getter for lblError called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_lblError() {
      return build_lblError();
    }
    private com.google.gwt.user.client.ui.Label build_lblError() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lblError = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lblError.setStyleName("error");


      this.owner.lblError = lblError;

      return lblError;
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

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId1;
    }

    /**
     * Getter for txtEmail called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_txtEmail() {
      return build_txtEmail();
    }
    private com.google.gwt.user.client.ui.TextBox build_txtEmail() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txtEmail = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      txtEmail.setStyleName("input-control text");


      this.owner.txtEmail = txtEmail;

      return txtEmail;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.


      return domId1Element;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId2;
    }

    /**
     * Getter for btnSubmit called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnSubmit() {
      return build_btnSubmit();
    }
    private com.google.gwt.user.client.ui.Button build_btnSubmit() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnSubmit = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnSubmit.setHTML(template_html1().asString());
      btnSubmit.setStyleName("button primary");
      btnSubmit.setWidth("100px");


      this.owner.btnSubmit = btnSubmit;

      return btnSubmit;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.


      return domId2Element;
    }
  }
}