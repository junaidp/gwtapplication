package com.sapientarrow.gwtapp.client.binding;

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

public class BindingsView_BindingsViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.binding.BindingsView>, com.sapientarrow.gwtapp.client.binding.BindingsView.BindingsViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Add Binding")
    SafeHtml html1();
     
    @Template("Delete")
    SafeHtml html2();
     
    @Template("<span id='{0}'></span> <span id='{1}'></span>  <div style='padding-left:35%'> <span id='{2}'></span> </div> <div style='padding-left:87%'> <span id='{3}'></span> </div>")
    SafeHtml html3(String arg0, String arg1, String arg2, String arg3);
     
    @Template("<div style='padding-left:45%; padding-top:1%'> <span id='{0}'></span> </div> <div style='padding-left:28%'> <span id='{1}'></span> </div>")
    SafeHtml html4(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.binding.BindingsView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.binding.BindingsView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.binding.BindingsView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
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
      return template.html3(get_domId2(), get_domId3(), get_domId4(), get_domId5());
    }
    SafeHtml template_html4() {
      return template.html4(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.binding.BindingsView_BindingsViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.binding.BindingsView_BindingsViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.binding.BindingsView_BindingsViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.binding.BindingsView_BindingsViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.binding.BindingsView_BindingsViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.binding.BindingsView_BindingsViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.binding.BindingsView_BindingsViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.binding.BindingsView_BindingsViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html4().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord127 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();

      // Detach section.
      attachRecord127.detach();
      f_HTMLPanel1.addAndReplaceElement(get_btnAddBinding(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_DecoratorPanel2(), get_domId1Element().get());

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
     * Getter for btnAddBinding called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnAddBinding() {
      return build_btnAddBinding();
    }
    private com.google.gwt.user.client.ui.Button build_btnAddBinding() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnAddBinding = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnAddBinding.setHTML(template_html1().asString());
      btnAddBinding.setStyleName("button primary");
      btnAddBinding.setWidth("100px");


      this.owner.btnAddBinding = btnAddBinding;

      return btnAddBinding;
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
     * Getter for f_DecoratorPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.DecoratorPanel get_f_DecoratorPanel2() {
      return build_f_DecoratorPanel2();
    }
    private com.google.gwt.user.client.ui.DecoratorPanel build_f_DecoratorPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.DecoratorPanel f_DecoratorPanel2 = (com.google.gwt.user.client.ui.DecoratorPanel) GWT.create(com.google.gwt.user.client.ui.DecoratorPanel.class);
      // Setup section.
      f_DecoratorPanel2.add(get_f_VerticalPanel3());


      return f_DecoratorPanel2;
    }

    /**
     * Getter for f_VerticalPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel3() {
      return build_f_VerticalPanel3();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel3 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel3.add(get_f_HTMLPanel4());


      return f_VerticalPanel3;
    }

    /**
     * Getter for f_HTMLPanel4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel4() {
      return build_f_HTMLPanel4();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel4 = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord128 = UiBinderUtil.attachToDom(f_HTMLPanel4.getElement());
      get_domId2Element().get();
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId5Element().get();

      // Detach section.
      attachRecord128.detach();
      f_HTMLPanel4.addAndReplaceElement(get_txtSearch(), get_domId2Element().get());
      f_HTMLPanel4.addAndReplaceElement(get_cellContainer(), get_domId3Element().get());
      f_HTMLPanel4.addAndReplaceElement(get_pager(), get_domId4Element().get());
      f_HTMLPanel4.addAndReplaceElement(get_btnDeleteBindings(), get_domId5Element().get());

      return f_HTMLPanel4;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for txtSearch called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.TextBox get_txtSearch() {
      return build_txtSearch();
    }
    private com.google.gwt.user.client.ui.TextBox build_txtSearch() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txtSearch = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.


      this.owner.txtSearch = txtSearch;

      return txtSearch;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 5.
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
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for cellContainer called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_cellContainer() {
      return build_cellContainer();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_cellContainer() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel cellContainer = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      cellContainer.setWidth("600px");


      this.owner.cellContainer = cellContainer;

      return cellContainer;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 5.
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
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for pager called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.cellview.client.SimplePager get_pager() {
      return build_pager();
    }
    private com.google.gwt.user.cellview.client.SimplePager build_pager() {
      // Creation section.
      final com.google.gwt.user.cellview.client.SimplePager pager = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.CENTER);
      // Setup section.
      pager.addStyleName("pagerPanel");


      this.owner.pager = pager;

      return pager;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 5.
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
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for btnDeleteBindings called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Button get_btnDeleteBindings() {
      return build_btnDeleteBindings();
    }
    private com.google.gwt.user.client.ui.Button build_btnDeleteBindings() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnDeleteBindings = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnDeleteBindings.setHTML(template_html2().asString());
      btnDeleteBindings.setStyleName("button danger");
      btnDeleteBindings.setWidth("100px");
      btnDeleteBindings.setEnabled(false);


      this.owner.btnDeleteBindings = btnDeleteBindings;

      return btnDeleteBindings;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 5.
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
