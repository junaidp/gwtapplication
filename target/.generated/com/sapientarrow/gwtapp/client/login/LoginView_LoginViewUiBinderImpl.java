package com.sapientarrow.gwtapp.client.login;

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

public class LoginView_LoginViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.login.LoginView>, com.sapientarrow.gwtapp.client.login.LoginView.LoginViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Login")
    SafeHtml html1();
     
    @Template("Forgot Password")
    SafeHtml html2();
     
    @Template("Forgot Username")
    SafeHtml html3();
     
    @Template("<head> <link href='Metro-UI-CSS-master/build/css/metro.css' rel='stylesheet'> <link href='Metro-UI-CSS-master/build/css/metro.min.css' rel='stylesheet'> <link href='Metro-UI-CSS-master/build/css/metro.responsive' rel='stylesheet'> <link href='Metro-UI-CSS-master/build/css/metro.schemes' rel='stylesheet'> <link href='Metro-UI-CSS-master/build/css/metro.icons' rel='stylesheet'> <script src='jquery.js'></script> <script src='Metro-UI-CSS-master/build/js/metro.js'></script> </head> <body class='metro'> <div style='padding-left:25%; padding-top:5%'> <div class='shadowDiv'> <div style='paddi ng-left:35px'> <h4 class='text-light blue'>Sign In</h4> <form> <div> <span id='{0}'></span> </div> <div> <span id='{1}'></span> </div> <div> <span class='mif-lock prepend-icon'></span> <span id='{2}'></span> </div> <div style='padding-left:40px'> <span id='{3}'></span> </div> <div style='padding-left:50px;padding-top:15px'> <span id='{4}'></span> </div> <div style='padding-left:50px;padding-top:5px'> <span id='{5}'></span> </div> </form> </div> </div> </div> </body>")
    SafeHtml html4(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.login.LoginView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.login.LoginView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.login.LoginView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html4().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord92 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId5Element().get();

      // Detach section.
      attachRecord92.detach();
      f_HTMLPanel1.addAndReplaceElement(get_lblError(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_txtUserName(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_txtPassword(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnSubmit(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnForgotPassword(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnForgotUsername(), get_domId5Element().get());

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
     * Getter for txtUserName called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_txtUserName() {
      return build_txtUserName();
    }
    private com.google.gwt.user.client.ui.TextBox build_txtUserName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txtUserName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      txtUserName.setStyleName("input-control text userIcon");
      txtUserName.setText("user1");


      this.owner.txtUserName = txtUserName;

      return txtUserName;
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
     * Getter for txtPassword called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.PasswordTextBox get_txtPassword() {
      return build_txtPassword();
    }
    private com.google.gwt.user.client.ui.PasswordTextBox build_txtPassword() {
      // Creation section.
      final com.google.gwt.user.client.ui.PasswordTextBox txtPassword = (com.google.gwt.user.client.ui.PasswordTextBox) GWT.create(com.google.gwt.user.client.ui.PasswordTextBox.class);
      // Setup section.
      txtPassword.setStyleName("input-control text passwordIcon");
      txtPassword.setText("user1");


      this.owner.txtPassword = txtPassword;

      return txtPassword;
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

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId3;
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
      btnSubmit.setWidth("120px");


      this.owner.btnSubmit = btnSubmit;

      return btnSubmit;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.


      return domId3Element;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId4;
    }

    /**
     * Getter for btnForgotPassword called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Anchor get_btnForgotPassword() {
      return build_btnForgotPassword();
    }
    private com.google.gwt.user.client.ui.Anchor build_btnForgotPassword() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor btnForgotPassword = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      btnForgotPassword.setHTML(template_html2().asString());
      btnForgotPassword.setStyleName("hover");


      this.owner.btnForgotPassword = btnForgotPassword;

      return btnForgotPassword;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.


      return domId4Element;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId5;
    private java.lang.String get_domId5() {
      return domId5;
    }
    private java.lang.String build_domId5() {
      // Creation section.
      domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId5;
    }

    /**
     * Getter for btnForgotUsername called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Anchor get_btnForgotUsername() {
      return build_btnForgotUsername();
    }
    private com.google.gwt.user.client.ui.Anchor build_btnForgotUsername() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor btnForgotUsername = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      btnForgotUsername.setHTML(template_html3().asString());
      btnForgotUsername.setStyleName("hover");


      this.owner.btnForgotUsername = btnForgotUsername;

      return btnForgotUsername;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId5Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId5Element() {
      return domId5Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId5Element() {
      // Creation section.
      domId5Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId5());
      // Setup section.


      return domId5Element;
    }
  }
}
