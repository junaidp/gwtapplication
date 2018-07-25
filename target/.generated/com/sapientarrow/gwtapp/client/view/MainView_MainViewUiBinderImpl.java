package com.sapientarrow.gwtapp.client.view;

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

public class MainView_MainViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.view.MainView>, com.sapientarrow.gwtapp.client.view.MainView.MainViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("File Upload")
    SafeHtml html1();
     
    @Template("JavaBean Editor")
    SafeHtml html2();
     
    @Template("DynBean Editor")
    SafeHtml html3();
     
    @Template("Bean Data Screen")
    SafeHtml html4();
     
    @Template("DynBean Data Screen")
    SafeHtml html5();
     
    @Template("Download Json")
    SafeHtml html6();
     
    @Template("Global Preferences")
    SafeHtml html7();
     
    @Template("Bindings")
    SafeHtml html8();
     
    @Template("<div style='padding-left:90%'> <span id='{0}'></span> </div> <div style='padding:5px'> <span id='{1}'></span> </div> <div style='padding:5px'> <span id='{2}'></span> </div>")
    SafeHtml html9(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.view.MainView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.view.MainView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.view.MainView owner) {
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
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4();
    }
    SafeHtml template_html5() {
      return template.html5();
    }
    SafeHtml template_html6() {
      return template.html6();
    }
    SafeHtml template_html7() {
      return template.html7();
    }
    SafeHtml template_html8() {
      return template.html8();
    }
    SafeHtml template_html9() {
      return template.html9(get_domId0(), get_domId1(), get_domId2());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.view.MainView_MainViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.view.MainView_MainViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.view.MainView_MainViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.view.MainView_MainViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.view.MainView_MainViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.view.MainView_MainViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.view.MainView_MainViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.view.MainView_MainViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html9().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord93 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();

      // Detach section.
      attachRecord93.detach();
      f_HTMLPanel1.addAndReplaceElement(get_discPanel(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_controlPanelContainer(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_center(), get_domId2Element().get());

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
     * Getter for discPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel get_discPanel() {
      return build_discPanel();
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_discPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.DisclosurePanel discPanel = (com.google.gwt.user.client.ui.DisclosurePanel) GWT.create(com.google.gwt.user.client.ui.DisclosurePanel.class);
      // Setup section.
      discPanel.add(get_discPanelContainer());
      discPanel.setHeader(get_lblWelcome());
      discPanel.setVisible(false);


      this.owner.discPanel = discPanel;

      return discPanel;
    }

    /**
     * Getter for discPanelContainer called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_discPanelContainer() {
      return build_discPanelContainer();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_discPanelContainer() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel discPanelContainer = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      discPanelContainer.add(get_ancFileUpload());
      discPanelContainer.add(get_ancJavaBeanEditor());
      discPanelContainer.add(get_ancDynamicBeanEditor());
      discPanelContainer.add(get_ancBeanData());
      discPanelContainer.add(get_ancDynamicBeanData());
      discPanelContainer.add(get_ancDownloadJson());
      discPanelContainer.add(get_ancGlobalPreferences());
      discPanelContainer.add(get_ancBindings());


      return discPanelContainer;
    }

    /**
     * Getter for ancFileUpload called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancFileUpload() {
      return build_ancFileUpload();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancFileUpload() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancFileUpload = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancFileUpload.setHTML(template_html1().asString());
      ancFileUpload.setStyleName("hover");
      ancFileUpload.setWordWrap(false);


      this.owner.ancFileUpload = ancFileUpload;

      return ancFileUpload;
    }

    /**
     * Getter for ancJavaBeanEditor called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancJavaBeanEditor() {
      return build_ancJavaBeanEditor();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancJavaBeanEditor() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancJavaBeanEditor = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancJavaBeanEditor.setHTML(template_html2().asString());
      ancJavaBeanEditor.setStyleName("hover");
      ancJavaBeanEditor.setWordWrap(false);


      this.owner.ancJavaBeanEditor = ancJavaBeanEditor;

      return ancJavaBeanEditor;
    }

    /**
     * Getter for ancDynamicBeanEditor called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancDynamicBeanEditor() {
      return build_ancDynamicBeanEditor();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancDynamicBeanEditor() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancDynamicBeanEditor = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancDynamicBeanEditor.setHTML(template_html3().asString());
      ancDynamicBeanEditor.setStyleName("hover");
      ancDynamicBeanEditor.setWordWrap(false);


      this.owner.ancDynamicBeanEditor = ancDynamicBeanEditor;

      return ancDynamicBeanEditor;
    }

    /**
     * Getter for ancBeanData called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancBeanData() {
      return build_ancBeanData();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancBeanData() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancBeanData = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancBeanData.setHTML(template_html4().asString());
      ancBeanData.setStyleName("hover");
      ancBeanData.setWordWrap(false);


      this.owner.ancBeanData = ancBeanData;

      return ancBeanData;
    }

    /**
     * Getter for ancDynamicBeanData called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancDynamicBeanData() {
      return build_ancDynamicBeanData();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancDynamicBeanData() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancDynamicBeanData = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancDynamicBeanData.setHTML(template_html5().asString());
      ancDynamicBeanData.setStyleName("hover");
      ancDynamicBeanData.setWordWrap(false);


      this.owner.ancDynamicBeanData = ancDynamicBeanData;

      return ancDynamicBeanData;
    }

    /**
     * Getter for ancDownloadJson called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancDownloadJson() {
      return build_ancDownloadJson();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancDownloadJson() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancDownloadJson = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancDownloadJson.setHTML(template_html6().asString());
      ancDownloadJson.setStyleName("hover");
      ancDownloadJson.setWordWrap(false);


      this.owner.ancDownloadJson = ancDownloadJson;

      return ancDownloadJson;
    }

    /**
     * Getter for ancGlobalPreferences called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancGlobalPreferences() {
      return build_ancGlobalPreferences();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancGlobalPreferences() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancGlobalPreferences = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancGlobalPreferences.setHTML(template_html7().asString());
      ancGlobalPreferences.setStyleName("hover");
      ancGlobalPreferences.setWordWrap(false);


      this.owner.ancGlobalPreferences = ancGlobalPreferences;

      return ancGlobalPreferences;
    }

    /**
     * Getter for ancBindings called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancBindings() {
      return build_ancBindings();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancBindings() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancBindings = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancBindings.setHTML(template_html8().asString());
      ancBindings.setStyleName("hover");
      ancBindings.setWordWrap(false);


      this.owner.ancBindings = ancBindings;

      return ancBindings;
    }

    /**
     * Getter for lblWelcome called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_lblWelcome() {
      return build_lblWelcome();
    }
    private com.google.gwt.user.client.ui.Label build_lblWelcome() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lblWelcome = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lblWelcome.setStyleName("labelStyle hover");


      this.owner.lblWelcome = lblWelcome;

      return lblWelcome;
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
     * Getter for controlPanelContainer called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer get_controlPanelContainer() {
      return build_controlPanelContainer();
    }
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer build_controlPanelContainer() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer controlPanelContainer = (com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer) GWT.create(com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer.class);
      // Setup section.


      this.owner.controlPanelContainer = controlPanelContainer;

      return controlPanelContainer;
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
     * Getter for center called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_center() {
      return build_center();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_center() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel center = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.


      this.owner.center = center;

      return center;
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
