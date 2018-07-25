package com.sapientarrow.gwtapp.client.globalpreferences;

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

public class GlobalPreferencesView_GlobalPreferencesViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView>, com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView.GlobalPreferencesViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Cancel")
    SafeHtml html1();
     
    @Template("Save")
    SafeHtml html2();
     
    @Template("<div> <span id='{0}'></span> <div style='padding-left:3%'> <span id='{1}'></span> <span id='{2}'></span> </div> </div>")
    SafeHtml html3(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView owner) {
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
      return template.html3(get_domId0(), get_domId1(), get_domId2());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView_GlobalPreferencesViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView_GlobalPreferencesViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView_GlobalPreferencesViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView_GlobalPreferencesViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView_GlobalPreferencesViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for appConstants called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.view.ApplicationConstants get_appConstants() {
      return build_appConstants();
    }
    private com.sapientarrow.gwtapp.client.view.ApplicationConstants build_appConstants() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.view.ApplicationConstants appConstants = (com.sapientarrow.gwtapp.client.view.ApplicationConstants) GWT.create(com.sapientarrow.gwtapp.client.view.ApplicationConstants.class);
      // Setup section.


      return appConstants;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView_GlobalPreferencesViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView_GlobalPreferencesViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.globalpreferences.GlobalPreferencesView_GlobalPreferencesViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      UiBinderUtil.TempAttachment attachRecord106 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();

      // Detach section.
      attachRecord106.detach();
      f_HTMLPanel1.addAndReplaceElement(get_splitPanel(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnCancel(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnSave(), get_domId2Element().get());

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
     * Getter for splitPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalSplitPanel get_splitPanel() {
      return build_splitPanel();
    }
    private com.google.gwt.user.client.ui.HorizontalSplitPanel build_splitPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalSplitPanel splitPanel = (com.google.gwt.user.client.ui.HorizontalSplitPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalSplitPanel.class);
      // Setup section.
      splitPanel.add(get_treePreferences());
      splitPanel.add(get_f_FlowPanel4());
      splitPanel.setWidth("100%");


      this.owner.splitPanel = splitPanel;

      return splitPanel;
    }

    /**
     * Getter for treePreferences called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Tree get_treePreferences() {
      return build_treePreferences();
    }
    private com.google.gwt.user.client.ui.Tree build_treePreferences() {
      // Creation section.
      final com.google.gwt.user.client.ui.Tree treePreferences = (com.google.gwt.user.client.ui.Tree) GWT.create(com.google.gwt.user.client.ui.Tree.class);
      // Setup section.
      treePreferences.addItem(get_treeItemMyAccount());
      treePreferences.addItem(get_f_TreeItem2());
      treePreferences.addItem(get_f_TreeItem3());
      treePreferences.addItem(get_treeItemMain());


      this.owner.treePreferences = treePreferences;

      return treePreferences;
    }

    /**
     * Getter for treeItemMyAccount called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TreeItem get_treeItemMyAccount() {
      return build_treeItemMyAccount();
    }
    private com.google.gwt.user.client.ui.TreeItem build_treeItemMyAccount() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem treeItemMyAccount = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      treeItemMyAccount.addItem(get_treeItemViewPlan());
      treeItemMyAccount.addItem(get_treeItemViewRegistration());
      treeItemMyAccount.addItem(get_treeItemEditRegistration());
      treeItemMyAccount.addItem(get_treeItemUsage());
      treeItemMyAccount.setText("My Account");


      this.owner.treeItemMyAccount = treeItemMyAccount;

      return treeItemMyAccount;
    }

    /**
     * Getter for treeItemViewPlan called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TreeItem get_treeItemViewPlan() {
      return build_treeItemViewPlan();
    }
    private com.google.gwt.user.client.ui.TreeItem build_treeItemViewPlan() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem treeItemViewPlan = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      treeItemViewPlan.setHTML("View Plan");
      treeItemViewPlan.setText("View Plan");


      this.owner.treeItemViewPlan = treeItemViewPlan;

      return treeItemViewPlan;
    }

    /**
     * Getter for treeItemViewRegistration called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TreeItem get_treeItemViewRegistration() {
      return build_treeItemViewRegistration();
    }
    private com.google.gwt.user.client.ui.TreeItem build_treeItemViewRegistration() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem treeItemViewRegistration = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      treeItemViewRegistration.setHTML("View Registration");
      treeItemViewRegistration.setText("View Registration");


      this.owner.treeItemViewRegistration = treeItemViewRegistration;

      return treeItemViewRegistration;
    }

    /**
     * Getter for treeItemEditRegistration called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TreeItem get_treeItemEditRegistration() {
      return build_treeItemEditRegistration();
    }
    private com.google.gwt.user.client.ui.TreeItem build_treeItemEditRegistration() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem treeItemEditRegistration = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      treeItemEditRegistration.setHTML("Edit Registration");
      treeItemEditRegistration.setText("Edit Registration");


      this.owner.treeItemEditRegistration = treeItemEditRegistration;

      return treeItemEditRegistration;
    }

    /**
     * Getter for treeItemUsage called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TreeItem get_treeItemUsage() {
      return build_treeItemUsage();
    }
    private com.google.gwt.user.client.ui.TreeItem build_treeItemUsage() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem treeItemUsage = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      treeItemUsage.setVisible(false);
      treeItemUsage.setHTML("Usage");
      treeItemUsage.setText("Usage");


      this.owner.treeItemUsage = treeItemUsage;

      return treeItemUsage;
    }

    /**
     * Getter for f_TreeItem2 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TreeItem get_f_TreeItem2() {
      return build_f_TreeItem2();
    }
    private com.google.gwt.user.client.ui.TreeItem build_f_TreeItem2() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem f_TreeItem2 = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      f_TreeItem2.addItem(get_treeItemLogo());
      f_TreeItem2.addItem(get_treeItemMenus());
      f_TreeItem2.setText("Header");


      return f_TreeItem2;
    }

    /**
     * Getter for treeItemLogo called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TreeItem get_treeItemLogo() {
      return build_treeItemLogo();
    }
    private com.google.gwt.user.client.ui.TreeItem build_treeItemLogo() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem treeItemLogo = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      treeItemLogo.setHTML("Logo");
      treeItemLogo.setText("Logo");


      this.owner.treeItemLogo = treeItemLogo;

      return treeItemLogo;
    }

    /**
     * Getter for treeItemMenus called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TreeItem get_treeItemMenus() {
      return build_treeItemMenus();
    }
    private com.google.gwt.user.client.ui.TreeItem build_treeItemMenus() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem treeItemMenus = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      treeItemMenus.setHTML("Menus");
      treeItemMenus.setText("Menus");


      this.owner.treeItemMenus = treeItemMenus;

      return treeItemMenus;
    }

    /**
     * Getter for f_TreeItem3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TreeItem get_f_TreeItem3() {
      return build_f_TreeItem3();
    }
    private com.google.gwt.user.client.ui.TreeItem build_f_TreeItem3() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem f_TreeItem3 = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      f_TreeItem3.setVisible(false);
      f_TreeItem3.setText("Footer");


      return f_TreeItem3;
    }

    /**
     * Getter for treeItemMain called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TreeItem get_treeItemMain() {
      return build_treeItemMain();
    }
    private com.google.gwt.user.client.ui.TreeItem build_treeItemMain() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem treeItemMain = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      treeItemMain.addItem(get_treeItemDashboard());
      treeItemMain.setText("Main Page");


      this.owner.treeItemMain = treeItemMain;

      return treeItemMain;
    }

    /**
     * Getter for treeItemDashboard called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TreeItem get_treeItemDashboard() {
      return build_treeItemDashboard();
    }
    private com.google.gwt.user.client.ui.TreeItem build_treeItemDashboard() {
      // Creation section.
      final com.google.gwt.user.client.ui.TreeItem treeItemDashboard = (com.google.gwt.user.client.ui.TreeItem) GWT.create(com.google.gwt.user.client.ui.TreeItem.class);
      // Setup section.
      treeItemDashboard.setHTML("Dashboard");
      treeItemDashboard.setText("Dashboard");


      this.owner.treeItemDashboard = treeItemDashboard;

      return treeItemDashboard;
    }

    /**
     * Getter for f_FlowPanel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel4() {
      return build_f_FlowPanel4();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel4 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.


      return f_FlowPanel4;
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
     * Getter for btnCancel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnCancel() {
      return build_btnCancel();
    }
    private com.google.gwt.user.client.ui.Button build_btnCancel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnCancel = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnCancel.setHTML(template_html1().asString());
      btnCancel.setStyleName("button primary");
      btnCancel.setVisible(false);
      btnCancel.setWidth("100px");


      this.owner.btnCancel = btnCancel;

      return btnCancel;
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
     * Getter for btnSave called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnSave() {
      return build_btnSave();
    }
    private com.google.gwt.user.client.ui.Button build_btnSave() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnSave = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnSave.setHTML(template_html2().asString());
      btnSave.setStyleName("button primary w3-theme-l2");
      btnSave.setWidth("100px");


      this.owner.btnSave = btnSave;

      return btnSave;
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
