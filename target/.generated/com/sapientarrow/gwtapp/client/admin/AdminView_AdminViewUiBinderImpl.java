package com.sapientarrow.gwtapp.client.admin;

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

public class AdminView_AdminViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.admin.AdminView>, com.sapientarrow.gwtapp.client.admin.AdminView.AdminViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Global Preferences")
    SafeHtml html1();
     
    @Template("Manage Users")
    SafeHtml html2();
     
    @Template("<div style='padding-left:20px'> <span id='{0}'></span> </div> <div style='padding-left:20px;padding-top:10px'> <span id='{1}'></span> </div>")
    SafeHtml html3(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.admin.AdminView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.admin.AdminView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.admin.AdminView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.admin.AdminView_AdminViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.admin.AdminView_AdminViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.admin.AdminView_AdminViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.admin.AdminView_AdminViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.admin.AdminView_AdminViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.admin.AdminView_AdminViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.admin.AdminView_AdminViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.admin.AdminView_AdminViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord118 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();

      // Detach section.
      attachRecord118.detach();
      f_HTMLPanel1.addAndReplaceElement(get_anchorGlobalPreferences(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_anchorEditUser(), get_domId1Element().get());

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
     * Getter for anchorGlobalPreferences called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Anchor get_anchorGlobalPreferences() {
      return build_anchorGlobalPreferences();
    }
    private com.google.gwt.user.client.ui.Anchor build_anchorGlobalPreferences() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor anchorGlobalPreferences = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      anchorGlobalPreferences.setHTML(template_html1().asString());
      anchorGlobalPreferences.setStyleName("hover");


      this.owner.anchorGlobalPreferences = anchorGlobalPreferences;

      return anchorGlobalPreferences;
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
     * Getter for anchorEditUser called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Anchor get_anchorEditUser() {
      return build_anchorEditUser();
    }
    private com.google.gwt.user.client.ui.Anchor build_anchorEditUser() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor anchorEditUser = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      anchorEditUser.setHTML(template_html2().asString());
      anchorEditUser.setStyleName("hover");


      this.owner.anchorEditUser = anchorEditUser;

      return anchorEditUser;
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
  }
}