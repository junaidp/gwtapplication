package com.sapientarrow.gwtapp.client.templates.templateGreen;

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

public class HeaderView_HeaderViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView>, com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView.HeaderViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("SAPIENT ARROW GREEN")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView owner) {
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
    private com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenCss_style style;
    private com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      f_HTMLPanel1.setStyleName("" + get_style().mainPanelMargin() + " " + get_style().mainPanelColor() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord149 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord149.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_Navbar2(), get_domId0Element().get());

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
     * Getter for f_Navbar2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Navbar get_f_Navbar2() {
      return build_f_Navbar2();
    }
    private org.gwtbootstrap3.client.ui.Navbar build_f_Navbar2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Navbar f_Navbar2 = (org.gwtbootstrap3.client.ui.Navbar) GWT.create(org.gwtbootstrap3.client.ui.Navbar.class);
      // Setup section.
      f_Navbar2.add(get_f_NavbarHeader3());
      f_Navbar2.add(get_f_NavbarCollapse8());


      return f_Navbar2;
    }

    /**
     * Getter for f_NavbarHeader3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.NavbarHeader get_f_NavbarHeader3() {
      return build_f_NavbarHeader3();
    }
    private org.gwtbootstrap3.client.ui.NavbarHeader build_f_NavbarHeader3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarHeader f_NavbarHeader3 = (org.gwtbootstrap3.client.ui.NavbarHeader) GWT.create(org.gwtbootstrap3.client.ui.NavbarHeader.class);
      // Setup section.
      f_NavbarHeader3.add(get_f_NavbarBrand4());
      f_NavbarHeader3.add(get_f_NavbarCollapseButton5());
      f_NavbarHeader3.add(get_f_NavbarForm6());


      return f_NavbarHeader3;
    }

    /**
     * Getter for f_NavbarBrand4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand4() {
      return build_f_NavbarBrand4();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand4 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand4.setHTML(template_html1().asString());
      f_NavbarBrand4.setStyleName("" + get_style().heading() + "");


      return f_NavbarBrand4;
    }

    /**
     * Getter for f_NavbarCollapseButton5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.NavbarCollapseButton get_f_NavbarCollapseButton5() {
      return build_f_NavbarCollapseButton5();
    }
    private org.gwtbootstrap3.client.ui.NavbarCollapseButton build_f_NavbarCollapseButton5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarCollapseButton f_NavbarCollapseButton5 = (org.gwtbootstrap3.client.ui.NavbarCollapseButton) GWT.create(org.gwtbootstrap3.client.ui.NavbarCollapseButton.class);
      // Setup section.
      f_NavbarCollapseButton5.setDataTarget("#navbar-collapse");


      return f_NavbarCollapseButton5;
    }

    /**
     * Getter for f_NavbarForm6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.NavbarForm get_f_NavbarForm6() {
      return build_f_NavbarForm6();
    }
    private org.gwtbootstrap3.client.ui.NavbarForm build_f_NavbarForm6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarForm f_NavbarForm6 = (org.gwtbootstrap3.client.ui.NavbarForm) GWT.create(org.gwtbootstrap3.client.ui.NavbarForm.class);
      // Setup section.
      f_NavbarForm6.add(get_f_TextBox7());
      f_NavbarForm6.setPull(org.gwtbootstrap3.client.ui.constants.Pull.RIGHT);


      return f_NavbarForm6;
    }

    /**
     * Getter for f_TextBox7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox7() {
      return build_f_TextBox7();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox7 = (org.gwtbootstrap3.client.ui.TextBox) GWT.create(org.gwtbootstrap3.client.ui.TextBox.class);
      // Setup section.
      f_TextBox7.addStyleName("col-lg-8");
      f_TextBox7.setPlaceholder("Search");


      return f_TextBox7;
    }

    /**
     * Getter for f_NavbarCollapse8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.NavbarCollapse get_f_NavbarCollapse8() {
      return build_f_NavbarCollapse8();
    }
    private org.gwtbootstrap3.client.ui.NavbarCollapse build_f_NavbarCollapse8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarCollapse f_NavbarCollapse8 = (org.gwtbootstrap3.client.ui.NavbarCollapse) GWT.create(org.gwtbootstrap3.client.ui.NavbarCollapse.class);
      // Setup section.
      f_NavbarCollapse8.add(get_f_NavbarNav9());
      f_NavbarCollapse8.setId("navbar-collapse");


      return f_NavbarCollapse8;
    }

    /**
     * Getter for f_NavbarNav9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.NavbarNav get_f_NavbarNav9() {
      return build_f_NavbarNav9();
    }
    private org.gwtbootstrap3.client.ui.NavbarNav build_f_NavbarNav9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarNav f_NavbarNav9 = (org.gwtbootstrap3.client.ui.NavbarNav) GWT.create(org.gwtbootstrap3.client.ui.NavbarNav.class);
      // Setup section.
      f_NavbarNav9.add(get_f_AnchorListItem10());
      f_NavbarNav9.add(get_f_AnchorListItem11());
      f_NavbarNav9.add(get_f_AnchorListItem12());
      f_NavbarNav9.add(get_f_AnchorListItem13());
      f_NavbarNav9.setPull(org.gwtbootstrap3.client.ui.constants.Pull.RIGHT);


      return f_NavbarNav9;
    }

    /**
     * Getter for f_AnchorListItem10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem10() {
      return build_f_AnchorListItem10();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem10 = (org.gwtbootstrap3.client.ui.AnchorListItem) GWT.create(org.gwtbootstrap3.client.ui.AnchorListItem.class);
      // Setup section.
      f_AnchorListItem10.setText("HOME");
      f_AnchorListItem10.setActive(true);


      return f_AnchorListItem10;
    }

    /**
     * Getter for f_AnchorListItem11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem11() {
      return build_f_AnchorListItem11();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem11 = (org.gwtbootstrap3.client.ui.AnchorListItem) GWT.create(org.gwtbootstrap3.client.ui.AnchorListItem.class);
      // Setup section.
      f_AnchorListItem11.setText("SERVICE");


      return f_AnchorListItem11;
    }

    /**
     * Getter for f_AnchorListItem12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem12() {
      return build_f_AnchorListItem12();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem12 = (org.gwtbootstrap3.client.ui.AnchorListItem) GWT.create(org.gwtbootstrap3.client.ui.AnchorListItem.class);
      // Setup section.
      f_AnchorListItem12.setText("BLOG");


      return f_AnchorListItem12;
    }

    /**
     * Getter for f_AnchorListItem13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem13() {
      return build_f_AnchorListItem13();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem13 = (org.gwtbootstrap3.client.ui.AnchorListItem) GWT.create(org.gwtbootstrap3.client.ui.AnchorListItem.class);
      // Setup section.
      f_AnchorListItem13.setText("CONTACT");


      return f_AnchorListItem13;
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
