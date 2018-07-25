package com.sapientarrow.gwtapp.client.registration;

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

public class RegistrationView_RegistrationViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.registration.RegistrationView>, com.sapientarrow.gwtapp.client.registration.RegistrationView.RegistrationViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div style='padding:5px'> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2);
     
    @Template("<div style='padding:5px'> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> </div>")
    SafeHtml html2(String arg0, String arg1, String arg2);
     
    @Template("<div style='padding:5px'> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> </div>")
    SafeHtml html3(String arg0, String arg1, String arg2);
     
    @Template("<div style='padding:5px'> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> </div>")
    SafeHtml html4(String arg0, String arg1, String arg2);
     
    @Template("<div style='padding:5px'> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> </div>")
    SafeHtml html5(String arg0, String arg1, String arg2);
     
    @Template("<div style='padding:5px'> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> </div>")
    SafeHtml html6(String arg0, String arg1, String arg2);
     
    @Template("Submit")
    SafeHtml html7();
     
    @Template("Close Account")
    SafeHtml html8();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html9(String arg0);
     
    @Template("<div style='padding-left:40%'> <h4 class='text-light blue'>Create/Update Account</h4> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span> <span id='{4}'></span> <span id='{5}'></span> <div> <span id='{6}'></span> </div> <div> <span id='{7}'></span> </div> <div style='padding-left:350px; padding-top:5px'> <span id='{8}'></span> </div> <div style='padding-left:60%; padding-top:20px'> <span id='{9}'></span> </div> </div>")
    SafeHtml html10(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.registration.RegistrationView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.registration.RegistrationView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.registration.RegistrationView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId11();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId13();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId14();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId15();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId17();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId18();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId19();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId21();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId22();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId23();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId28();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId12();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId16();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId20();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId24();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId25();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId26();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId27();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId10Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId11Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId13Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId14Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId15Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId17Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId18Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId19Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId21Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId22Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId23Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId28Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId12Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId16Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId20Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId24Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId25Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId26Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId27Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId1(), get_domId2(), get_domId3());
    }
    SafeHtml template_html2() {
      return template.html2(get_domId5(), get_domId6(), get_domId7());
    }
    SafeHtml template_html3() {
      return template.html3(get_domId9(), get_domId10(), get_domId11());
    }
    SafeHtml template_html4() {
      return template.html4(get_domId13(), get_domId14(), get_domId15());
    }
    SafeHtml template_html5() {
      return template.html5(get_domId17(), get_domId18(), get_domId19());
    }
    SafeHtml template_html6() {
      return template.html6(get_domId21(), get_domId22(), get_domId23());
    }
    SafeHtml template_html7() {
      return template.html7();
    }
    SafeHtml template_html8() {
      return template.html8();
    }
    SafeHtml template_html9() {
      return template.html9(get_domId28());
    }
    SafeHtml template_html10() {
      return template.html10(get_domId0(), get_domId4(), get_domId8(), get_domId12(), get_domId16(), get_domId20(), get_domId24(), get_domId25(), get_domId26(), get_domId27());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.registration.RegistrationView_RegistrationViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.registration.RegistrationView_RegistrationViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.registration.RegistrationView_RegistrationViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.registration.RegistrationView_RegistrationViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.registration.RegistrationView_RegistrationViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.registration.RegistrationView_RegistrationViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.registration.RegistrationView_RegistrationViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.registration.RegistrationView_RegistrationViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html10().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord94 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId4Element().get();
      get_domId8Element().get();
      get_domId12Element().get();
      get_domId16Element().get();
      get_domId20Element().get();
      get_domId24Element().get();
      get_domId25Element().get();
      get_domId26Element().get();
      get_domId27Element().get();

      // Detach section.
      attachRecord94.detach();
      f_HTMLPanel1.addAndReplaceElement(get_panelName(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_panelEmail(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_panelUserName(), get_domId8Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_panelRegisteredTo(), get_domId12Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_panelPassword(), get_domId16Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_panelConfirmPassword(), get_domId20Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_container(), get_domId24Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_captchaError(), get_domId25Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnSubmit(), get_domId26Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_panelCloseAccount(), get_domId27Element().get());

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
     * Getter for panelName called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panelName() {
      return build_panelName();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panelName() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panelName = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord95 = UiBinderUtil.attachToDom(panelName.getElement());
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();

      // Detach section.
      attachRecord95.detach();
      panelName.addAndReplaceElement(get_f_Label2(), get_domId1Element().get());
      panelName.addAndReplaceElement(get_name(), get_domId2Element().get());
      panelName.addAndReplaceElement(get_nameError(), get_domId3Element().get());

      this.owner.panelName = panelName;

      return panelName;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for f_Label2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label2() {
      return build_f_Label2();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label2() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label2.setText("Name");
      f_Label2.setStyleName("inLine");
      f_Label2.setWidth("200px");


      return f_Label2;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for name called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_name() {
      return build_name();
    }
    private com.google.gwt.user.client.ui.TextBox build_name() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox name = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      name.setStyleName("inLine textBoxStyle");


      this.owner.name = name;

      return name;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for nameError called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_nameError() {
      return build_nameError();
    }
    private com.google.gwt.user.client.ui.Label build_nameError() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label nameError = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      nameError.setStyleName("inLine error");
      nameError.setWidth("200px");


      this.owner.nameError = nameError;

      return nameError;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for panelEmail called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panelEmail() {
      return build_panelEmail();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panelEmail() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panelEmail = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord96 = UiBinderUtil.attachToDom(panelEmail.getElement());
      get_domId5Element().get();
      get_domId6Element().get();
      get_domId7Element().get();

      // Detach section.
      attachRecord96.detach();
      panelEmail.addAndReplaceElement(get_f_Label3(), get_domId5Element().get());
      panelEmail.addAndReplaceElement(get_email(), get_domId6Element().get());
      panelEmail.addAndReplaceElement(get_emailError(), get_domId7Element().get());

      this.owner.panelEmail = panelEmail;

      return panelEmail;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setText("Email");
      f_Label3.setStyleName("inLine");
      f_Label3.setWidth("200px");


      return f_Label3;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 3.
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

    /**
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId6;
    private java.lang.String get_domId6() {
      return domId6;
    }
    private java.lang.String build_domId6() {
      // Creation section.
      domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId6;
    }

    /**
     * Getter for email called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_email() {
      return build_email();
    }
    private com.google.gwt.user.client.ui.TextBox build_email() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox email = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      email.setStyleName("inLine textBoxStyle");


      this.owner.email = email;

      return email;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId6Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId6Element() {
      return domId6Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId6Element() {
      // Creation section.
      domId6Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId6());
      // Setup section.


      return domId6Element;
    }

    /**
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId7;
    private java.lang.String get_domId7() {
      return domId7;
    }
    private java.lang.String build_domId7() {
      // Creation section.
      domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId7;
    }

    /**
     * Getter for emailError called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_emailError() {
      return build_emailError();
    }
    private com.google.gwt.user.client.ui.Label build_emailError() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label emailError = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      emailError.setStyleName("inLine error");
      emailError.setWidth("200px");


      this.owner.emailError = emailError;

      return emailError;
    }

    /**
     * Getter for domId7Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId7Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId7Element() {
      return domId7Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId7Element() {
      // Creation section.
      domId7Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId7());
      // Setup section.


      return domId7Element;
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
     * Getter for domId8 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId8;
    private java.lang.String get_domId8() {
      return domId8;
    }
    private java.lang.String build_domId8() {
      // Creation section.
      domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId8;
    }

    /**
     * Getter for panelUserName called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panelUserName() {
      return build_panelUserName();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panelUserName() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panelUserName = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord97 = UiBinderUtil.attachToDom(panelUserName.getElement());
      get_domId9Element().get();
      get_domId10Element().get();
      get_domId11Element().get();

      // Detach section.
      attachRecord97.detach();
      panelUserName.addAndReplaceElement(get_f_Label4(), get_domId9Element().get());
      panelUserName.addAndReplaceElement(get_userName(), get_domId10Element().get());
      panelUserName.addAndReplaceElement(get_userNameError(), get_domId11Element().get());

      this.owner.panelUserName = panelUserName;

      return panelUserName;
    }

    /**
     * Getter for domId9 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId9;
    private java.lang.String get_domId9() {
      return domId9;
    }
    private java.lang.String build_domId9() {
      // Creation section.
      domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId9;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setText("Username");
      f_Label4.setStyleName("inLine");
      f_Label4.setWidth("200px");


      return f_Label4;
    }

    /**
     * Getter for domId9Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId9Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId9Element() {
      return domId9Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId9Element() {
      // Creation section.
      domId9Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId9());
      // Setup section.


      return domId9Element;
    }

    /**
     * Getter for domId10 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId10;
    private java.lang.String get_domId10() {
      return domId10;
    }
    private java.lang.String build_domId10() {
      // Creation section.
      domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId10;
    }

    /**
     * Getter for userName called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_userName() {
      return build_userName();
    }
    private com.google.gwt.user.client.ui.TextBox build_userName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox userName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      userName.setStyleName("inLine textBoxStyle");


      this.owner.userName = userName;

      return userName;
    }

    /**
     * Getter for domId10Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId10Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId10Element() {
      return domId10Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId10Element() {
      // Creation section.
      domId10Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId10());
      // Setup section.


      return domId10Element;
    }

    /**
     * Getter for domId11 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId11;
    private java.lang.String get_domId11() {
      return domId11;
    }
    private java.lang.String build_domId11() {
      // Creation section.
      domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId11;
    }

    /**
     * Getter for userNameError called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_userNameError() {
      return build_userNameError();
    }
    private com.google.gwt.user.client.ui.Label build_userNameError() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label userNameError = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      userNameError.setStyleName("inLine error");
      userNameError.setWidth("200px");


      this.owner.userNameError = userNameError;

      return userNameError;
    }

    /**
     * Getter for domId11Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId11Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId11Element() {
      return domId11Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId11Element() {
      // Creation section.
      domId11Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId11());
      // Setup section.


      return domId11Element;
    }

    /**
     * Getter for domId8Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId8Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId8Element() {
      return domId8Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId8Element() {
      // Creation section.
      domId8Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId8());
      // Setup section.


      return domId8Element;
    }

    /**
     * Getter for domId12 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId12;
    private java.lang.String get_domId12() {
      return domId12;
    }
    private java.lang.String build_domId12() {
      // Creation section.
      domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId12;
    }

    /**
     * Getter for panelRegisteredTo called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panelRegisteredTo() {
      return build_panelRegisteredTo();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panelRegisteredTo() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panelRegisteredTo = new com.google.gwt.user.client.ui.HTMLPanel(template_html4().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord98 = UiBinderUtil.attachToDom(panelRegisteredTo.getElement());
      get_domId13Element().get();
      get_domId14Element().get();
      get_domId15Element().get();

      // Detach section.
      attachRecord98.detach();
      panelRegisteredTo.addAndReplaceElement(get_f_Label5(), get_domId13Element().get());
      panelRegisteredTo.addAndReplaceElement(get_registeredTo(), get_domId14Element().get());
      panelRegisteredTo.addAndReplaceElement(get_registedToError(), get_domId15Element().get());

      this.owner.panelRegisteredTo = panelRegisteredTo;

      return panelRegisteredTo;
    }

    /**
     * Getter for domId13 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId13;
    private java.lang.String get_domId13() {
      return domId13;
    }
    private java.lang.String build_domId13() {
      // Creation section.
      domId13 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId13;
    }

    /**
     * Getter for f_Label5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label5() {
      return build_f_Label5();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label5() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label5.setText("Registered to");
      f_Label5.setStyleName("inLine");
      f_Label5.setWidth("200px");


      return f_Label5;
    }

    /**
     * Getter for domId13Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId13Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId13Element() {
      return domId13Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId13Element() {
      // Creation section.
      domId13Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId13());
      // Setup section.


      return domId13Element;
    }

    /**
     * Getter for domId14 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId14;
    private java.lang.String get_domId14() {
      return domId14;
    }
    private java.lang.String build_domId14() {
      // Creation section.
      domId14 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId14;
    }

    /**
     * Getter for registeredTo called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_registeredTo() {
      return build_registeredTo();
    }
    private com.google.gwt.user.client.ui.TextBox build_registeredTo() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox registeredTo = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      registeredTo.setStyleName("inLine textBoxStyle");


      this.owner.registeredTo = registeredTo;

      return registeredTo;
    }

    /**
     * Getter for domId14Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId14Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId14Element() {
      return domId14Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId14Element() {
      // Creation section.
      domId14Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId14());
      // Setup section.


      return domId14Element;
    }

    /**
     * Getter for domId15 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId15;
    private java.lang.String get_domId15() {
      return domId15;
    }
    private java.lang.String build_domId15() {
      // Creation section.
      domId15 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId15;
    }

    /**
     * Getter for registedToError called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_registedToError() {
      return build_registedToError();
    }
    private com.google.gwt.user.client.ui.Label build_registedToError() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label registedToError = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      registedToError.setStyleName("inLine error");
      registedToError.setWidth("200px");


      this.owner.registedToError = registedToError;

      return registedToError;
    }

    /**
     * Getter for domId15Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId15Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId15Element() {
      return domId15Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId15Element() {
      // Creation section.
      domId15Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId15());
      // Setup section.


      return domId15Element;
    }

    /**
     * Getter for domId12Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId12Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId12Element() {
      return domId12Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId12Element() {
      // Creation section.
      domId12Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId12());
      // Setup section.


      return domId12Element;
    }

    /**
     * Getter for domId16 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId16;
    private java.lang.String get_domId16() {
      return domId16;
    }
    private java.lang.String build_domId16() {
      // Creation section.
      domId16 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId16;
    }

    /**
     * Getter for panelPassword called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panelPassword() {
      return build_panelPassword();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panelPassword() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panelPassword = new com.google.gwt.user.client.ui.HTMLPanel(template_html5().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord99 = UiBinderUtil.attachToDom(panelPassword.getElement());
      get_domId17Element().get();
      get_domId18Element().get();
      get_domId19Element().get();

      // Detach section.
      attachRecord99.detach();
      panelPassword.addAndReplaceElement(get_f_Label6(), get_domId17Element().get());
      panelPassword.addAndReplaceElement(get_password(), get_domId18Element().get());
      panelPassword.addAndReplaceElement(get_passwordError(), get_domId19Element().get());

      this.owner.panelPassword = panelPassword;

      return panelPassword;
    }

    /**
     * Getter for domId17 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId17;
    private java.lang.String get_domId17() {
      return domId17;
    }
    private java.lang.String build_domId17() {
      // Creation section.
      domId17 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId17;
    }

    /**
     * Getter for f_Label6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label6() {
      return build_f_Label6();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label6() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label6.setText("Password");
      f_Label6.setStyleName("inLine");
      f_Label6.setWidth("200px");


      return f_Label6;
    }

    /**
     * Getter for domId17Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId17Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId17Element() {
      return domId17Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId17Element() {
      // Creation section.
      domId17Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId17());
      // Setup section.


      return domId17Element;
    }

    /**
     * Getter for domId18 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId18;
    private java.lang.String get_domId18() {
      return domId18;
    }
    private java.lang.String build_domId18() {
      // Creation section.
      domId18 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId18;
    }

    /**
     * Getter for password called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.PasswordTextBox get_password() {
      return build_password();
    }
    private com.google.gwt.user.client.ui.PasswordTextBox build_password() {
      // Creation section.
      final com.google.gwt.user.client.ui.PasswordTextBox password = (com.google.gwt.user.client.ui.PasswordTextBox) GWT.create(com.google.gwt.user.client.ui.PasswordTextBox.class);
      // Setup section.
      password.setStyleName("inLine textBoxStyle");


      this.owner.password = password;

      return password;
    }

    /**
     * Getter for domId18Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId18Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId18Element() {
      return domId18Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId18Element() {
      // Creation section.
      domId18Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId18());
      // Setup section.


      return domId18Element;
    }

    /**
     * Getter for domId19 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId19;
    private java.lang.String get_domId19() {
      return domId19;
    }
    private java.lang.String build_domId19() {
      // Creation section.
      domId19 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId19;
    }

    /**
     * Getter for passwordError called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_passwordError() {
      return build_passwordError();
    }
    private com.google.gwt.user.client.ui.Label build_passwordError() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label passwordError = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      passwordError.setStyleName("inLine error");
      passwordError.setWidth("200px");


      this.owner.passwordError = passwordError;

      return passwordError;
    }

    /**
     * Getter for domId19Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId19Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId19Element() {
      return domId19Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId19Element() {
      // Creation section.
      domId19Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId19());
      // Setup section.


      return domId19Element;
    }

    /**
     * Getter for domId16Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId16Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId16Element() {
      return domId16Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId16Element() {
      // Creation section.
      domId16Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId16());
      // Setup section.


      return domId16Element;
    }

    /**
     * Getter for domId20 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId20;
    private java.lang.String get_domId20() {
      return domId20;
    }
    private java.lang.String build_domId20() {
      // Creation section.
      domId20 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId20;
    }

    /**
     * Getter for panelConfirmPassword called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panelConfirmPassword() {
      return build_panelConfirmPassword();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panelConfirmPassword() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panelConfirmPassword = new com.google.gwt.user.client.ui.HTMLPanel(template_html6().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord100 = UiBinderUtil.attachToDom(panelConfirmPassword.getElement());
      get_domId21Element().get();
      get_domId22Element().get();
      get_domId23Element().get();

      // Detach section.
      attachRecord100.detach();
      panelConfirmPassword.addAndReplaceElement(get_f_Label7(), get_domId21Element().get());
      panelConfirmPassword.addAndReplaceElement(get_confirmPassword(), get_domId22Element().get());
      panelConfirmPassword.addAndReplaceElement(get_confirmPasswordError(), get_domId23Element().get());

      this.owner.panelConfirmPassword = panelConfirmPassword;

      return panelConfirmPassword;
    }

    /**
     * Getter for domId21 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId21;
    private java.lang.String get_domId21() {
      return domId21;
    }
    private java.lang.String build_domId21() {
      // Creation section.
      domId21 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId21;
    }

    /**
     * Getter for f_Label7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label7() {
      return build_f_Label7();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label7() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label7.setText("Confirm Password");
      f_Label7.setStyleName("inLine");
      f_Label7.setWidth("200px");


      return f_Label7;
    }

    /**
     * Getter for domId21Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId21Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId21Element() {
      return domId21Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId21Element() {
      // Creation section.
      domId21Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId21());
      // Setup section.


      return domId21Element;
    }

    /**
     * Getter for domId22 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId22;
    private java.lang.String get_domId22() {
      return domId22;
    }
    private java.lang.String build_domId22() {
      // Creation section.
      domId22 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId22;
    }

    /**
     * Getter for confirmPassword called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.PasswordTextBox get_confirmPassword() {
      return build_confirmPassword();
    }
    private com.google.gwt.user.client.ui.PasswordTextBox build_confirmPassword() {
      // Creation section.
      final com.google.gwt.user.client.ui.PasswordTextBox confirmPassword = (com.google.gwt.user.client.ui.PasswordTextBox) GWT.create(com.google.gwt.user.client.ui.PasswordTextBox.class);
      // Setup section.
      confirmPassword.setStyleName("inLine textBoxStyle");


      this.owner.confirmPassword = confirmPassword;

      return confirmPassword;
    }

    /**
     * Getter for domId22Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId22Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId22Element() {
      return domId22Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId22Element() {
      // Creation section.
      domId22Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId22());
      // Setup section.


      return domId22Element;
    }

    /**
     * Getter for domId23 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId23;
    private java.lang.String get_domId23() {
      return domId23;
    }
    private java.lang.String build_domId23() {
      // Creation section.
      domId23 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId23;
    }

    /**
     * Getter for confirmPasswordError called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_confirmPasswordError() {
      return build_confirmPasswordError();
    }
    private com.google.gwt.user.client.ui.Label build_confirmPasswordError() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label confirmPasswordError = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      confirmPasswordError.setStyleName("inLine error");
      confirmPasswordError.setWidth("200px");


      this.owner.confirmPasswordError = confirmPasswordError;

      return confirmPasswordError;
    }

    /**
     * Getter for domId23Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId23Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId23Element() {
      return domId23Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId23Element() {
      // Creation section.
      domId23Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId23());
      // Setup section.


      return domId23Element;
    }

    /**
     * Getter for domId20Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId20Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId20Element() {
      return domId20Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId20Element() {
      // Creation section.
      domId20Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId20());
      // Setup section.


      return domId20Element;
    }

    /**
     * Getter for domId24 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId24;
    private java.lang.String get_domId24() {
      return domId24;
    }
    private java.lang.String build_domId24() {
      // Creation section.
      domId24 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId24;
    }

    /**
     * Getter for container called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_container() {
      return build_container();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_container() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel container = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.


      this.owner.container = container;

      return container;
    }

    /**
     * Getter for domId24Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId24Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId24Element() {
      return domId24Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId24Element() {
      // Creation section.
      domId24Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId24());
      // Setup section.


      return domId24Element;
    }

    /**
     * Getter for domId25 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId25;
    private java.lang.String get_domId25() {
      return domId25;
    }
    private java.lang.String build_domId25() {
      // Creation section.
      domId25 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId25;
    }

    /**
     * Getter for captchaError called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_captchaError() {
      return build_captchaError();
    }
    private com.google.gwt.user.client.ui.Label build_captchaError() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label captchaError = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      captchaError.setStyleName("inLine error");
      captchaError.setWidth("200px");


      this.owner.captchaError = captchaError;

      return captchaError;
    }

    /**
     * Getter for domId25Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId25Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId25Element() {
      return domId25Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId25Element() {
      // Creation section.
      domId25Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId25());
      // Setup section.


      return domId25Element;
    }

    /**
     * Getter for domId26 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId26;
    private java.lang.String get_domId26() {
      return domId26;
    }
    private java.lang.String build_domId26() {
      // Creation section.
      domId26 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId26;
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
      btnSubmit.setHTML(template_html7().asString());
      btnSubmit.setStyleName("inLine  button primary");
      btnSubmit.setWidth("100px");


      this.owner.btnSubmit = btnSubmit;

      return btnSubmit;
    }

    /**
     * Getter for domId26Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId26Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId26Element() {
      return domId26Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId26Element() {
      // Creation section.
      domId26Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId26());
      // Setup section.


      return domId26Element;
    }

    /**
     * Getter for domId27 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId27;
    private java.lang.String get_domId27() {
      return domId27;
    }
    private java.lang.String build_domId27() {
      // Creation section.
      domId27 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId27;
    }

    /**
     * Getter for panelCloseAccount called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_panelCloseAccount() {
      return build_panelCloseAccount();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_panelCloseAccount() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel panelCloseAccount = new com.google.gwt.user.client.ui.HTMLPanel(template_html9().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord101 = UiBinderUtil.attachToDom(panelCloseAccount.getElement());
      get_domId28Element().get();

      // Detach section.
      attachRecord101.detach();
      panelCloseAccount.addAndReplaceElement(get_btnCloseAccount(), get_domId28Element().get());

      this.owner.panelCloseAccount = panelCloseAccount;

      return panelCloseAccount;
    }

    /**
     * Getter for domId28 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId28;
    private java.lang.String get_domId28() {
      return domId28;
    }
    private java.lang.String build_domId28() {
      // Creation section.
      domId28 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId28;
    }

    /**
     * Getter for btnCloseAccount called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Button get_btnCloseAccount() {
      return build_btnCloseAccount();
    }
    private com.google.gwt.user.client.ui.Button build_btnCloseAccount() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnCloseAccount = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnCloseAccount.setHTML(template_html8().asString());
      btnCloseAccount.setStyleName("button danger");


      this.owner.btnCloseAccount = btnCloseAccount;

      return btnCloseAccount;
    }

    /**
     * Getter for domId28Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId28Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId28Element() {
      return domId28Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId28Element() {
      // Creation section.
      domId28Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId28());
      // Setup section.


      return domId28Element;
    }

    /**
     * Getter for domId27Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId27Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId27Element() {
      return domId27Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId27Element() {
      // Creation section.
      domId27Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId27());
      // Setup section.


      return domId27Element;
    }
  }
}
