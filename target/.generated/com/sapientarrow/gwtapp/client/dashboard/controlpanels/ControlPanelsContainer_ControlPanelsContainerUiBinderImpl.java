package com.sapientarrow.gwtapp.client.dashboard.controlpanels;

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

public class ControlPanelsContainer_ControlPanelsContainerUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer>, com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer.ControlPanelsContainerUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='metro-tile metro-tile-dashboard'> <div id='content'></div>  Dashboard <span id='{0}'></span> </div>")
    SafeHtml html1(String arg0);
     
    @Template("<div class='metro-tile metro-tile-small metro-tile-accordion'> <div id='content'></div>  Accordion <span id='{0}'></span>  </div>")
    SafeHtml html2(String arg0);
     
    @Template("<div class='metro-tile metro-tile-small metro-tile-portal'> <div id='content'></div> Portal <span id='{0}'></span> </div>")
    SafeHtml html3(String arg0);
     
    @Template("<div class='metro-tile metro-tile-msg'> <div id='content'></div> Search <span id='{0}'></span> </div>")
    SafeHtml html4(String arg0);
     
    @Template("<div class='metro-tile metro-tile-small metro-tile-dropbox'> <div id='content'></div> Intelligence <span id='{0}'></span> </div>")
    SafeHtml html5(String arg0);
     
    @Template("<div class='metro-surface'> <table> <tr> <td> <span id='{0}'></span> </td> <td> <span id='{1}'></span> </td> </tr> </table> <table> <tr> <td> <span id='{2}'></span> </td> <td> <span id='{3}'></span> </td> <td> <span id='{4}'></span>  </td> </tr> </table>  </div>")
    SafeHtml html6(String arg0, String arg1, String arg2, String arg3, String arg4);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer owner;


    public Widgets(final com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId1());
    }
    SafeHtml template_html2() {
      return template.html2(get_domId3());
    }
    SafeHtml template_html3() {
      return template.html3(get_domId5());
    }
    SafeHtml template_html4() {
      return template.html4(get_domId7());
    }
    SafeHtml template_html5() {
      return template.html5(get_domId9());
    }
    SafeHtml template_html6() {
      return template.html6(get_domId0(), get_domId2(), get_domId4(), get_domId6(), get_domId8());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer_ControlPanelsContainerUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer_ControlPanelsContainerUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer_ControlPanelsContainerUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer_ControlPanelsContainerUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer_ControlPanelsContainerUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer_ControlPanelsContainerUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer_ControlPanelsContainerUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.controlpanels.ControlPanelsContainer_ControlPanelsContainerUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html6().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord141 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId2Element().get();
      get_domId4Element().get();
      get_domId6Element().get();
      get_domId8Element().get();

      // Detach section.
      attachRecord141.detach();
      f_HTMLPanel1.addAndReplaceElement(get_dashboardContainer(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_accordionContainer(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_portalContainer(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_searchContainer(), get_domId6Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_intelligenceContainer(), get_domId8Element().get());

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
     * Getter for dashboardContainer called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_dashboardContainer() {
      return build_dashboardContainer();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_dashboardContainer() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel dashboardContainer = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.
      dashboardContainer.add(get_f_HTMLPanel2());


      this.owner.dashboardContainer = dashboardContainer;

      return dashboardContainer;
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
      UiBinderUtil.TempAttachment attachRecord142 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
      get_domId1Element().get();

      // Detach section.
      attachRecord142.detach();
      f_HTMLPanel2.addAndReplaceElement(get_dashboardPanel(), get_domId1Element().get());

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
     * Getter for dashboardPanel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardPanelView get_dashboardPanel() {
      return build_dashboardPanel();
    }
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardPanelView build_dashboardPanel() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardPanelView dashboardPanel = (com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardPanelView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardPanelView.class);
      // Setup section.


      this.owner.dashboardPanel = dashboardPanel;

      return dashboardPanel;
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
     * Getter for accordionContainer called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_accordionContainer() {
      return build_accordionContainer();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_accordionContainer() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel accordionContainer = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.
      accordionContainer.add(get_f_HTMLPanel3());


      this.owner.accordionContainer = accordionContainer;

      return accordionContainer;
    }

    /**
     * Getter for f_HTMLPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel3() {
      return build_f_HTMLPanel3();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel3 = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord143 = UiBinderUtil.attachToDom(f_HTMLPanel3.getElement());
      get_domId3Element().get();

      // Detach section.
      attachRecord143.detach();
      f_HTMLPanel3.addAndReplaceElement(get_dashboardAccordionPanel(), get_domId3Element().get());

      return f_HTMLPanel3;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for dashboardAccordionPanel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardAccordionPanelView get_dashboardAccordionPanel() {
      return build_dashboardAccordionPanel();
    }
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardAccordionPanelView build_dashboardAccordionPanel() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardAccordionPanelView dashboardAccordionPanel = (com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardAccordionPanelView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardAccordionPanelView.class);
      // Setup section.


      this.owner.dashboardAccordionPanel = dashboardAccordionPanel;

      return dashboardAccordionPanel;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for portalContainer called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_portalContainer() {
      return build_portalContainer();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_portalContainer() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel portalContainer = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.
      portalContainer.add(get_f_HTMLPanel4());


      this.owner.portalContainer = portalContainer;

      return portalContainer;
    }

    /**
     * Getter for f_HTMLPanel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel4() {
      return build_f_HTMLPanel4();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel4 = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord144 = UiBinderUtil.attachToDom(f_HTMLPanel4.getElement());
      get_domId5Element().get();

      // Detach section.
      attachRecord144.detach();
      f_HTMLPanel4.addAndReplaceElement(get_dashboardPortalPanel(), get_domId5Element().get());

      return f_HTMLPanel4;
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
     * Getter for dashboardPortalPanel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardPortalPanelView get_dashboardPortalPanel() {
      return build_dashboardPortalPanel();
    }
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardPortalPanelView build_dashboardPortalPanel() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardPortalPanelView dashboardPortalPanel = (com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardPortalPanelView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.controlpanels.DashboardPortalPanelView.class);
      // Setup section.


      this.owner.dashboardPortalPanel = dashboardPortalPanel;

      return dashboardPortalPanel;
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
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for searchContainer called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_searchContainer() {
      return build_searchContainer();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_searchContainer() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel searchContainer = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.
      searchContainer.add(get_f_HTMLPanel5());


      this.owner.searchContainer = searchContainer;

      return searchContainer;
    }

    /**
     * Getter for f_HTMLPanel5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel5() {
      return build_f_HTMLPanel5();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel5 = new com.google.gwt.user.client.ui.HTMLPanel(template_html4().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord145 = UiBinderUtil.attachToDom(f_HTMLPanel5.getElement());
      get_domId7Element().get();

      // Detach section.
      attachRecord145.detach();
      f_HTMLPanel5.addAndReplaceElement(get_searchPanel(), get_domId7Element().get());

      return f_HTMLPanel5;
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
     * Getter for searchPanel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.SearchDataPanelView get_searchPanel() {
      return build_searchPanel();
    }
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.SearchDataPanelView build_searchPanel() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.controlpanels.SearchDataPanelView searchPanel = (com.sapientarrow.gwtapp.client.dashboard.controlpanels.SearchDataPanelView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.controlpanels.SearchDataPanelView.class);
      // Setup section.


      this.owner.searchPanel = searchPanel;

      return searchPanel;
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
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for intelligenceContainer called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_intelligenceContainer() {
      return build_intelligenceContainer();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_intelligenceContainer() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel intelligenceContainer = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.
      intelligenceContainer.add(get_f_HTMLPanel6());


      this.owner.intelligenceContainer = intelligenceContainer;

      return intelligenceContainer;
    }

    /**
     * Getter for f_HTMLPanel6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel6() {
      return build_f_HTMLPanel6();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel6 = new com.google.gwt.user.client.ui.HTMLPanel(template_html5().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord146 = UiBinderUtil.attachToDom(f_HTMLPanel6.getElement());
      get_domId9Element().get();

      // Detach section.
      attachRecord146.detach();
      f_HTMLPanel6.addAndReplaceElement(get_intelligencePanel(), get_domId9Element().get());

      return f_HTMLPanel6;
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
     * Getter for intelligencePanel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.IntelligencePackPanelView get_intelligencePanel() {
      return build_intelligencePanel();
    }
    private com.sapientarrow.gwtapp.client.dashboard.controlpanels.IntelligencePackPanelView build_intelligencePanel() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.dashboard.controlpanels.IntelligencePackPanelView intelligencePanel = (com.sapientarrow.gwtapp.client.dashboard.controlpanels.IntelligencePackPanelView) GWT.create(com.sapientarrow.gwtapp.client.dashboard.controlpanels.IntelligencePackPanelView.class);
      // Setup section.


      this.owner.intelligencePanel = intelligencePanel;

      return intelligencePanel;
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
  }
}
