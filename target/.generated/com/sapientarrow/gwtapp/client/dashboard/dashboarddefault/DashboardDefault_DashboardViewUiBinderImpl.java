package com.sapientarrow.gwtapp.client.dashboard.dashboarddefault;

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

public class DashboardDefault_DashboardViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault>, com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault.DashboardViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div> <div style='overflow: hidden'> <div style='float: left; padding:2px'> <span id='{0}'></span> </div> <div style='float: left; padding:2px'> <span id='{1}'></span> </div> <div style='float: left; padding:2px'> <span id='{2}'></span> </div> <div style='float: left; padding:2px'> <span id='{3}'></span> </div> </div> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault owner;


    public Widgets(final com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault_DashboardViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault_DashboardViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault_DashboardViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault_DashboardViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault_DashboardViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault_DashboardViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault_DashboardViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.dashboarddefault.DashboardDefault_DashboardViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      UiBinderUtil.TempAttachment attachRecord102 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();

      // Detach section.
      attachRecord102.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_ConfigurationView2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_RunTimeView3(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_myAccount(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_ReportsView4(), get_domId3Element().get());

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
     * Getter for f_ConfigurationView2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ConfigurationView get_f_ConfigurationView2() {
      return build_f_ConfigurationView2();
    }
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ConfigurationView build_f_ConfigurationView2() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ConfigurationView f_ConfigurationView2 = (com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ConfigurationView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ConfigurationView.class);
      // Setup section.


      return f_ConfigurationView2;
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
     * Getter for f_RunTimeView3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView get_f_RunTimeView3() {
      return build_f_RunTimeView3();
    }
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView build_f_RunTimeView3() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView f_RunTimeView3 = (com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView.class);
      // Setup section.


      return f_RunTimeView3;
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
     * Getter for myAccount called 1 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for f_ReportsView4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ReportsView get_f_ReportsView4() {
      return build_f_ReportsView4();
    }
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ReportsView build_f_ReportsView4() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ReportsView f_ReportsView4 = (com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ReportsView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.MyDashboard.ReportsView.class);
      // Setup section.


      return f_ReportsView4;
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
  }
}
