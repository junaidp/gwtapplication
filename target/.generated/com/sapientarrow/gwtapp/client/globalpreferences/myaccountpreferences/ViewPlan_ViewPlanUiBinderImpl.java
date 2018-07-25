package com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences;

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

public class ViewPlan_ViewPlanUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan>, com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan.ViewPlanUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Show this panel")
    SafeHtml html1();
     
    @Template("Payment Details")
    SafeHtml html2();
     
    @Template("<div style='padding-left:40%'> <h4 class='text-light blue'>View Plan</h4> <span id='{0}'></span> </div> <div style='padding-left:5px; padding-top:5px'> <span id='{1}'></span> </div> <div style='padding-left:20px; padding-top:5px'> <span id='{2}'></span> </div> <div style='padding-left:20px; padding-top:5px'> <span id='{3}'></span> </div> <div style='padding-left:20px; padding-top:5px'> <span id='{4}'></span> </div> <div style='padding:4px'> <span id='{5}'></span> </div>")
    SafeHtml html3(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan owner;


    public Widgets(final com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan owner) {
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
      return template.html3(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan_ViewPlanUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan_ViewPlanUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan_ViewPlanUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan_ViewPlanUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan_ViewPlanUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan_ViewPlanUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan_ViewPlanUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.globalpreferences.myaccountpreferences.ViewPlan_ViewPlanUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      UiBinderUtil.TempAttachment attachRecord177 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId5Element().get();

      // Detach section.
      attachRecord177.detach();
      f_HTMLPanel1.addAndReplaceElement(get_checkShowThisPanel(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_checkBoxPaymentPlan(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_checkBoxMonthly(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_checkBoxQuaterly(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_checkBoxYearly(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_paymentDetails(), get_domId5Element().get());

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
     * Getter for checkShowThisPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.CheckBox get_checkShowThisPanel() {
      return build_checkShowThisPanel();
    }
    private com.google.gwt.user.client.ui.CheckBox build_checkShowThisPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.CheckBox checkShowThisPanel = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.
      checkShowThisPanel.setHTML(template_html1().asString());


      this.owner.checkShowThisPanel = checkShowThisPanel;

      return checkShowThisPanel;
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
     * Getter for checkBoxPaymentPlan called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.CheckBox get_checkBoxPaymentPlan() {
      return build_checkBoxPaymentPlan();
    }
    private com.google.gwt.user.client.ui.CheckBox build_checkBoxPaymentPlan() {
      // Creation section.
      final com.google.gwt.user.client.ui.CheckBox checkBoxPaymentPlan = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.
      checkBoxPaymentPlan.setStyleName("inLine");
      checkBoxPaymentPlan.setText("Payment Plan");


      this.owner.checkBoxPaymentPlan = checkBoxPaymentPlan;

      return checkBoxPaymentPlan;
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
     * Getter for checkBoxMonthly called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.CheckBox get_checkBoxMonthly() {
      return build_checkBoxMonthly();
    }
    private com.google.gwt.user.client.ui.CheckBox build_checkBoxMonthly() {
      // Creation section.
      final com.google.gwt.user.client.ui.CheckBox checkBoxMonthly = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.
      checkBoxMonthly.setText("Monthly");


      this.owner.checkBoxMonthly = checkBoxMonthly;

      return checkBoxMonthly;
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
     * Getter for checkBoxQuaterly called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.CheckBox get_checkBoxQuaterly() {
      return build_checkBoxQuaterly();
    }
    private com.google.gwt.user.client.ui.CheckBox build_checkBoxQuaterly() {
      // Creation section.
      final com.google.gwt.user.client.ui.CheckBox checkBoxQuaterly = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.
      checkBoxQuaterly.setText("Quartely");


      this.owner.checkBoxQuaterly = checkBoxQuaterly;

      return checkBoxQuaterly;
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
     * Getter for checkBoxYearly called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.CheckBox get_checkBoxYearly() {
      return build_checkBoxYearly();
    }
    private com.google.gwt.user.client.ui.CheckBox build_checkBoxYearly() {
      // Creation section.
      final com.google.gwt.user.client.ui.CheckBox checkBoxYearly = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.
      checkBoxYearly.setText("Yearly");


      this.owner.checkBoxYearly = checkBoxYearly;

      return checkBoxYearly;
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
     * Getter for paymentDetails called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.CheckBox get_paymentDetails() {
      return build_paymentDetails();
    }
    private com.google.gwt.user.client.ui.CheckBox build_paymentDetails() {
      // Creation section.
      final com.google.gwt.user.client.ui.CheckBox paymentDetails = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.
      paymentDetails.setHTML(template_html2().asString());


      this.owner.paymentDetails = paymentDetails;

      return paymentDetails;
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
