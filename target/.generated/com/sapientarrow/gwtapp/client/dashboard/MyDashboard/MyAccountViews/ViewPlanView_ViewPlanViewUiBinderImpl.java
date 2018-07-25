package com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews;

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

public class ViewPlanView_ViewPlanViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView>, com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView.ViewPlanViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div style='padding:4px'> <span id='{0}'></span> </div> <div style='padding-left:4px'> <span id='{1}'></span> </div>")
    SafeHtml html1(String arg0, String arg1);
     
    @Template("Monthly")
    SafeHtml html2();
     
    @Template("Quarterly")
    SafeHtml html3();
     
    @Template("Yearly")
    SafeHtml html4();
     
    @Template("<div style='padding:4px'> <span id='{0}'></span> </div> <div style='padding-left:4px'> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span> <span id='{4}'></span> <span id='{5}'></span> </div>")
    SafeHtml html5(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5);
     
    @Template("update")
    SafeHtml html6();
     
    @Template("<div style='padding-left:40%'> <h4 class='text-light blue'>View Plan</h4> <span id='{0}'></span> <span id='{1}'></span>  <div style='padding:5px'> <span id='{2}'></span> </div> </div>")
    SafeHtml html7(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId10Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId1(), get_domId2());
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4();
    }
    SafeHtml template_html5() {
      return template.html5(get_domId4(), get_domId5(), get_domId6(), get_domId7(), get_domId8(), get_domId9());
    }
    SafeHtml template_html6() {
      return template.html6();
    }
    SafeHtml template_html7() {
      return template.html7(get_domId0(), get_domId3(), get_domId10());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView_ViewPlanViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView_ViewPlanViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView_ViewPlanViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView_ViewPlanViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView_ViewPlanViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView_ViewPlanViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView_ViewPlanViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.MyDashboard.MyAccountViews.ViewPlanView_ViewPlanViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html7().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord109 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId3Element().get();
      get_domId10Element().get();

      // Detach section.
      attachRecord109.detach();
      f_HTMLPanel1.addAndReplaceElement(get_planTypePanel(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_paymentDetailsPanel(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnUpdate(), get_domId10Element().get());

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
     * Getter for planTypePanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_planTypePanel() {
      return build_planTypePanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_planTypePanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel planTypePanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      planTypePanel.add(get_f_HTMLPanel2());


      this.owner.planTypePanel = planTypePanel;

      return planTypePanel;
    }

    /**
     * Getter for f_HTMLPanel2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel2() {
      return build_f_HTMLPanel2();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord110 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
      get_domId1Element().get();
      get_domId2Element().get();

      // Detach section.
      attachRecord110.detach();
      f_HTMLPanel2.addAndReplaceElement(get_f_Label3(), get_domId1Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_Label4(), get_domId2Element().get());

      return f_HTMLPanel2;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setText("Plan Type");
      f_Label3.setStyleName("centerPanelHeadings");


      return f_Label3;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setText("User specific Plan Type Details here");


      return f_Label4;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for paymentDetailsPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_paymentDetailsPanel() {
      return build_paymentDetailsPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_paymentDetailsPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel paymentDetailsPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      paymentDetailsPanel.add(get_f_HTMLPanel5());


      this.owner.paymentDetailsPanel = paymentDetailsPanel;

      return paymentDetailsPanel;
    }

    /**
     * Getter for f_HTMLPanel5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel5() {
      return build_f_HTMLPanel5();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel5 = new com.google.gwt.user.client.ui.HTMLPanel(template_html5().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord111 = UiBinderUtil.attachToDom(f_HTMLPanel5.getElement());
      get_domId4Element().get();
      get_domId5Element().get();
      get_domId6Element().get();
      get_domId7Element().get();
      get_domId8Element().get();
      get_domId9Element().get();

      // Detach section.
      attachRecord111.detach();
      f_HTMLPanel5.addAndReplaceElement(get_f_Label6(), get_domId4Element().get());
      f_HTMLPanel5.addAndReplaceElement(get_panelPaymentTerms(), get_domId5Element().get());
      f_HTMLPanel5.addAndReplaceElement(get_lblPaymentTerms(), get_domId6Element().get());
      f_HTMLPanel5.addAndReplaceElement(get_radioMonthlyPayments(), get_domId7Element().get());
      f_HTMLPanel5.addAndReplaceElement(get_radioQuarterlyPayments(), get_domId8Element().get());
      f_HTMLPanel5.addAndReplaceElement(get_radioYearlyPayments(), get_domId9Element().get());

      return f_HTMLPanel5;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for f_Label6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label6() {
      return build_f_Label6();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label6() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label6.setText("Payment Details");
      f_Label6.setStyleName("centerPanelHeadings");


      return f_Label6;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for panelPaymentTerms called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_panelPaymentTerms() {
      return build_panelPaymentTerms();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_panelPaymentTerms() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel panelPaymentTerms = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.


      this.owner.panelPaymentTerms = panelPaymentTerms;

      return panelPaymentTerms;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for lblPaymentTerms called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_lblPaymentTerms() {
      return build_lblPaymentTerms();
    }
    private com.google.gwt.user.client.ui.Label build_lblPaymentTerms() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lblPaymentTerms = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lblPaymentTerms.setText("Payment Terms");
      lblPaymentTerms.setStyleName("blue");


      this.owner.lblPaymentTerms = lblPaymentTerms;

      return lblPaymentTerms;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for radioMonthlyPayments called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.RadioButton get_radioMonthlyPayments() {
      return build_radioMonthlyPayments();
    }
    private com.google.gwt.user.client.ui.RadioButton build_radioMonthlyPayments() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton radioMonthlyPayments = new com.google.gwt.user.client.ui.RadioButton("paymentsGroup");
      // Setup section.
      radioMonthlyPayments.setHTML(template_html2().asString());


      this.owner.radioMonthlyPayments = radioMonthlyPayments;

      return radioMonthlyPayments;
    }

    /**
     * Getter for domId7Element called 2 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for domId8 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for radioQuarterlyPayments called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.RadioButton get_radioQuarterlyPayments() {
      return build_radioQuarterlyPayments();
    }
    private com.google.gwt.user.client.ui.RadioButton build_radioQuarterlyPayments() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton radioQuarterlyPayments = new com.google.gwt.user.client.ui.RadioButton("paymentsGroup");
      // Setup section.
      radioQuarterlyPayments.setHTML(template_html3().asString());


      this.owner.radioQuarterlyPayments = radioQuarterlyPayments;

      return radioQuarterlyPayments;
    }

    /**
     * Getter for domId8Element called 2 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for domId9 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for radioYearlyPayments called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.RadioButton get_radioYearlyPayments() {
      return build_radioYearlyPayments();
    }
    private com.google.gwt.user.client.ui.RadioButton build_radioYearlyPayments() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton radioYearlyPayments = new com.google.gwt.user.client.ui.RadioButton("paymentsGroup");
      // Setup section.
      radioYearlyPayments.setHTML(template_html4().asString());


      this.owner.radioYearlyPayments = radioYearlyPayments;

      return radioYearlyPayments;
    }

    /**
     * Getter for domId9Element called 2 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for domId10 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for btnUpdate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnUpdate() {
      return build_btnUpdate();
    }
    private com.google.gwt.user.client.ui.Button build_btnUpdate() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnUpdate = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnUpdate.setHTML(template_html6().asString());
      btnUpdate.setStyleName("button primary");
      btnUpdate.setWidth("80px");


      this.owner.btnUpdate = btnUpdate;

      return btnUpdate;
    }

    /**
     * Getter for domId10Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
  }
}
