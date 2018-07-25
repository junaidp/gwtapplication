package com.sapientarrow.gwtapp.client.beaneditor;

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

public class JavaBeanEditorView_JavaBeanEditorViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView>, com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView.JavaBeanEditorViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Create")
    SafeHtml html1();
     
    @Template("+")
    SafeHtml html2();
     
    @Template("Assign Editors")
    SafeHtml html3();
     
    @Template("Create")
    SafeHtml html4();
     
    @Template("<div style='width:100%'> <div> <div style='float:left; padding:5px;background-color: #E8E8E8;box-shadow: 2px 2px 3px #C8C8C8;margin:10px;border-radius:5px;width:550px'> <div style='border:groove;border-color:white;padding:10px;border-radius:5px'> <div style='padding-bottom:5px;padding-left:40%'> <span id='{0}'></span> </div> <div style='float:left;padding-right:23%'> <span id='{1}'></span> </div> <div> <span id='{2}'></span> </div>  <span id='{3}'></span> <span id='{4}'></span> <div style='margin-top:10px;padding-left:2px'> <span id='{5}'></span> </div> <div> <span id='{6}'></span> </div> <div> <span id='{7}'></span> </div> <div style='padding-top:5px;padding-left:72%'> <span id='{8}'></span> </div>  </div> <div style='border:groove;border-color:white;padding:10px;border-radius:5px;background-color: #E8E8E8;box-shadow: 2px 2px 3px #C8C8C8;margin-top:20px'> <div style='padding-left:40%'> <span id='{9}'></span> </div> <div style='padding-top:5px'> <span id='{10}'></span> </div> <div style='padding-top:5px;padding-left:62%'> <span id='{11}'></span> </div> </div> </div> <div style='float:left'> <span id='{12}'></span> </div> </div> </div> <div style='clear:both'></div>")
    SafeHtml html5(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId11();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId12();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId10Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId11Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId12Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
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
      return template.html5(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6(), get_domId7(), get_domId8(), get_domId9(), get_domId10(), get_domId11(), get_domId12());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView_JavaBeanEditorViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView_JavaBeanEditorViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView_JavaBeanEditorViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView_JavaBeanEditorViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView_JavaBeanEditorViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView_JavaBeanEditorViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView_JavaBeanEditorViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.beaneditor.JavaBeanEditorView_JavaBeanEditorViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html5().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord123 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId5Element().get();
      get_domId6Element().get();
      get_domId7Element().get();
      get_domId8Element().get();
      get_domId9Element().get();
      get_domId10Element().get();
      get_domId11Element().get();
      get_domId12Element().get();

      // Detach section.
      attachRecord123.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_Label2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_textPackageName(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnCreate(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_txtBeanName(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnAddProperty(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_listAddObject(), get_domId5Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_vpnlObjectContainer(), get_domId6Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_DisclosurePanel3(), get_domId7Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnAssignEditors(), get_domId8Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Label4(), get_domId9Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_listBeans(), get_domId10Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnGenerate(), get_domId11Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_addBeanPropertyWidget(), get_domId12Element().get());

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
     * Getter for f_Label2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label2() {
      return build_f_Label2();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label2() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label2.setText("Create Bean");
      f_Label2.setStyleName("blue");


      return f_Label2;
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
     * Getter for textPackageName called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_textPackageName() {
      return build_textPackageName();
    }
    private com.google.gwt.user.client.ui.TextBox build_textPackageName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox textPackageName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      textPackageName.setStyleName("inLine");


      this.owner.textPackageName = textPackageName;

      return textPackageName;
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
     * Getter for btnCreate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnCreate() {
      return build_btnCreate();
    }
    private com.google.gwt.user.client.ui.Button build_btnCreate() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnCreate = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnCreate.setHTML(template_html1().asString());
      btnCreate.setStyleName("button primary");
      btnCreate.setWidth("100px");
      btnCreate.setHeight("30px");


      this.owner.btnCreate = btnCreate;

      return btnCreate;
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
     * Getter for txtBeanName called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_txtBeanName() {
      return build_txtBeanName();
    }
    private com.google.gwt.user.client.ui.TextBox build_txtBeanName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txtBeanName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      txtBeanName.setStyleName("inLine");


      this.owner.txtBeanName = txtBeanName;

      return txtBeanName;
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
     * Getter for btnAddProperty called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnAddProperty() {
      return build_btnAddProperty();
    }
    private com.google.gwt.user.client.ui.Button build_btnAddProperty() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnAddProperty = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnAddProperty.setHTML(template_html2().asString());
      btnAddProperty.setStyleName("button primary imageButton inLine");
      btnAddProperty.setWidth("20px");
      btnAddProperty.setTitle("Add Property");
      btnAddProperty.setHeight("20px");


      this.owner.btnAddProperty = btnAddProperty;

      return btnAddProperty;
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
     * Getter for listAddObject called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ListBox get_listAddObject() {
      return build_listAddObject();
    }
    private com.google.gwt.user.client.ui.ListBox build_listAddObject() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox listAddObject = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      listAddObject.setStyleName("");


      this.owner.listAddObject = listAddObject;

      return listAddObject;
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
     * Getter for vpnlObjectContainer called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_vpnlObjectContainer() {
      return build_vpnlObjectContainer();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_vpnlObjectContainer() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel vpnlObjectContainer = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.


      this.owner.vpnlObjectContainer = vpnlObjectContainer;

      return vpnlObjectContainer;
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
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_DisclosurePanel3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.DisclosurePanel get_f_DisclosurePanel3() {
      return build_f_DisclosurePanel3();
    }
    private com.google.gwt.user.client.ui.DisclosurePanel build_f_DisclosurePanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.DisclosurePanel f_DisclosurePanel3 = new com.google.gwt.user.client.ui.DisclosurePanel("Annotations");
      // Setup section.
      f_DisclosurePanel3.add(get_addAnnotationsWidget());


      return f_DisclosurePanel3;
    }

    /**
     * Getter for addAnnotationsWidget called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.sapientarrow.gwtapp.client.beaneditor.AddAnnotationsWidget get_addAnnotationsWidget() {
      return build_addAnnotationsWidget();
    }
    private com.sapientarrow.gwtapp.client.beaneditor.AddAnnotationsWidget build_addAnnotationsWidget() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.beaneditor.AddAnnotationsWidget addAnnotationsWidget = (com.sapientarrow.gwtapp.client.beaneditor.AddAnnotationsWidget) GWT.create(com.sapientarrow.gwtapp.client.beaneditor.AddAnnotationsWidget.class);
      // Setup section.


      this.owner.addAnnotationsWidget = addAnnotationsWidget;

      return addAnnotationsWidget;
    }

    /**
     * Getter for domId7Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for btnAssignEditors called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Anchor get_btnAssignEditors() {
      return build_btnAssignEditors();
    }
    private com.google.gwt.user.client.ui.Anchor build_btnAssignEditors() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor btnAssignEditors = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      btnAssignEditors.setHTML(template_html3().asString());
      btnAssignEditors.setStyleName("point");
      btnAssignEditors.setVisible(false);


      this.owner.btnAssignEditors = btnAssignEditors;

      return btnAssignEditors;
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

    /**
     * Getter for domId9 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setText("Create Reflection");
      f_Label4.setStyleName("blue");


      return f_Label4;
    }

    /**
     * Getter for domId9Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for listBeans called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ListBox get_listBeans() {
      return build_listBeans();
    }
    private com.google.gwt.user.client.ui.ListBox build_listBeans() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox listBeans = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.


      this.owner.listBeans = listBeans;

      return listBeans;
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

    /**
     * Getter for domId11 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId11;
    private java.lang.String get_domId11() {
      return domId11;
    }
    private java.lang.String build_domId11() {
      // Creation section.
      domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId11;
    }

    /**
     * Getter for btnGenerate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnGenerate() {
      return build_btnGenerate();
    }
    private com.google.gwt.user.client.ui.Button build_btnGenerate() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnGenerate = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnGenerate.setHTML(template_html4().asString());
      btnGenerate.setStyleName("button primary");
      btnGenerate.setWidth("100px");
      btnGenerate.setHeight("30px");


      this.owner.btnGenerate = btnGenerate;

      return btnGenerate;
    }

    /**
     * Getter for domId11Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId11Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId11Element() {
      return domId11Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId11Element() {
      // Creation section.
      domId11Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId11());
      // Setup section.


      return domId11Element;
    }

    /**
     * Getter for domId12 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId12;
    private java.lang.String get_domId12() {
      return domId12;
    }
    private java.lang.String build_domId12() {
      // Creation section.
      domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId12;
    }

    /**
     * Getter for addBeanPropertyWidget called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.sapientarrow.gwtapp.client.beaneditor.AddBeanProportyWidget get_addBeanPropertyWidget() {
      return build_addBeanPropertyWidget();
    }
    private com.sapientarrow.gwtapp.client.beaneditor.AddBeanProportyWidget build_addBeanPropertyWidget() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.beaneditor.AddBeanProportyWidget addBeanPropertyWidget = (com.sapientarrow.gwtapp.client.beaneditor.AddBeanProportyWidget) GWT.create(com.sapientarrow.gwtapp.client.beaneditor.AddBeanProportyWidget.class);
      // Setup section.


      this.owner.addBeanPropertyWidget = addBeanPropertyWidget;

      return addBeanPropertyWidget;
    }

    /**
     * Getter for domId12Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId12Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId12Element() {
      return domId12Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId12Element() {
      // Creation section.
      domId12Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId12());
      // Setup section.


      return domId12Element;
    }
  }
}
