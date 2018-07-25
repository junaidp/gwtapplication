package com.sapientarrow.gwtapp.client.dashboard.accordion;

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

public class DashboardAccordion_DashboardAccordionUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion>, com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion.DashboardAccordionUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div> <span id='{0}'></span> </div>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion owner;


    public Widgets(final com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion_DashboardAccordionUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion_DashboardAccordionUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion_DashboardAccordionUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion_DashboardAccordionUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion_DashboardAccordionUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion_DashboardAccordionUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion_DashboardAccordionUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.accordion.DashboardAccordion_DashboardAccordionUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord103 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord103.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_StackLayoutPanel2(), get_domId0Element().get());

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
     * Getter for f_StackLayoutPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.StackLayoutPanel get_f_StackLayoutPanel2() {
      return build_f_StackLayoutPanel2();
    }
    private com.google.gwt.user.client.ui.StackLayoutPanel build_f_StackLayoutPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.StackLayoutPanel f_StackLayoutPanel2 = new com.google.gwt.user.client.ui.StackLayoutPanel(com.google.gwt.dom.client.Style.Unit.PX);
      // Setup section.
      f_StackLayoutPanel2.add(get_myAccount(), get_f_Label3(), 33);
      f_StackLayoutPanel2.add(get_f_ConfigurationView4(), get_f_Label5(), 33);
      f_StackLayoutPanel2.add(get_f_RunTimeView6(), get_f_Label7(), 33);
      f_StackLayoutPanel2.add(get_f_ReportsView8(), get_f_Label9(), 33);
      f_StackLayoutPanel2.setWidth("410px");
      f_StackLayoutPanel2.setHeight("440px");


      return f_StackLayoutPanel2;
    }

    /**
     * Getter for myAccount called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountPanel get_myAccount() {
      return build_myAccount();
    }
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountPanel build_myAccount() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountPanel myAccount = (com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountPanel) GWT.create(com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountPanel.class);
      // Setup section.


      this.owner.myAccount = myAccount;

      return myAccount;
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
      f_Label3.setText("My Account");
      f_Label3.setStyleName("controlPanelHeadings");


      return f_Label3;
    }

    /**
     * Getter for f_ConfigurationView4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ConfigurationView get_f_ConfigurationView4() {
      return build_f_ConfigurationView4();
    }
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ConfigurationView build_f_ConfigurationView4() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ConfigurationView f_ConfigurationView4 = (com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ConfigurationView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ConfigurationView.class);
      // Setup section.


      return f_ConfigurationView4;
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
      f_Label5.setText("Configuration");
      f_Label5.setStyleName("controlPanelHeadings");


      return f_Label5;
    }

    /**
     * Getter for f_RunTimeView6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView get_f_RunTimeView6() {
      return build_f_RunTimeView6();
    }
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView build_f_RunTimeView6() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView f_RunTimeView6 = (com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView.class);
      // Setup section.


      return f_RunTimeView6;
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
      f_Label7.setText("Run Time");
      f_Label7.setStyleName("controlPanelHeadings");


      return f_Label7;
    }

    /**
     * Getter for f_ReportsView8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ReportsView get_f_ReportsView8() {
      return build_f_ReportsView8();
    }
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ReportsView build_f_ReportsView8() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ReportsView f_ReportsView8 = (com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ReportsView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ReportsView.class);
      // Setup section.


      return f_ReportsView8;
    }

    /**
     * Getter for f_Label9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label9() {
      return build_f_Label9();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label9() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label9.setText("Reports");
      f_Label9.setStyleName("controlPanelHeadings");


      return f_Label9;
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
