package com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents;

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

public class UploadedBindingClass_UploadedBindingClassUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass>, com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass.UploadedBindingClassUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div style='padding:5px'> <span id='{0}'></span> <span id='{1}'></span>   <span id='{2}'></span>  <span id='{3}'></span>   <span id='{4}'></span>  <span id='{5}'></span>  <span id='{6}'></span>  <span id='{7}'></span>  <span id='{8}'></span> <span id='{9}'></span> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass owner;


    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = (com.google.gwt.event.dom.client.BlurHandler) new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onTextBoxBlur((com.google.gwt.event.dom.client.BlurEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = (com.google.gwt.event.dom.client.BlurHandler) new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onTextBoxAddBlur((com.google.gwt.event.dom.client.BlurEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = (com.google.gwt.event.dom.client.BlurHandler) new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onTextBoxUserBlur((com.google.gwt.event.dom.client.BlurEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = (com.google.gwt.event.dom.client.BlurHandler) new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onTextBoxUserIdBlur((com.google.gwt.event.dom.client.BlurEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = (com.google.gwt.event.dom.client.BlurHandler) new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onTextBoxUserPasswordBlur((com.google.gwt.event.dom.client.BlurEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = (com.google.gwt.event.dom.client.BlurHandler) new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onTextBoxUserMyAcIdBlur((com.google.gwt.event.dom.client.BlurEvent) event);
      }
    };

    public Widgets(final com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass owner) {
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
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6(), get_domId7(), get_domId8(), get_domId9());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass_UploadedBindingClassUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass_UploadedBindingClassUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass_UploadedBindingClassUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass_UploadedBindingClassUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass_UploadedBindingClassUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass_UploadedBindingClassUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass_UploadedBindingClassUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.view.widgets.UploadedComponents.UploadedBindingClass_UploadedBindingClassUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      UiBinderUtil.TempAttachment attachRecord173 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
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

      // Detach section.
      attachRecord173.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel4(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel6(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel8(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel9(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel11(), get_domId5Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel13(), get_domId6Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel15(), get_domId7Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel17(), get_domId8Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel19(), get_domId9Element().get());

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
     * Getter for f_HorizontalPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel2() {
      return build_f_HorizontalPanel2();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel2.add(get_f_Label3());
      f_HorizontalPanel2.add(get_listIds());


      return f_HorizontalPanel2;
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
      f_Label3.setWidth("200px");
      f_Label3.setText("Id");


      return f_Label3;
    }

    /**
     * Getter for listIds called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.ListBox get_listIds() {
      return build_listIds();
    }
    private com.google.gwt.user.client.ui.ListBox build_listIds() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox listIds = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      listIds.setName("id");
      listIds.setVisibleItemCount(1);


      this.owner.listIds = listIds;

      return listIds;
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
     * Getter for f_HorizontalPanel4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel4() {
      return build_f_HorizontalPanel4();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel4 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel4.add(get_f_Label5());
      f_HorizontalPanel4.add(get_textBoxName());


      return f_HorizontalPanel4;
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
      f_Label5.setWidth("200px");
      f_Label5.setText("Name");


      return f_Label5;
    }

    /**
     * Getter for textBoxName called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_textBoxName() {
      return build_textBoxName();
    }
    private com.google.gwt.user.client.ui.TextBox build_textBoxName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox textBoxName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      textBoxName.setName("name");
      textBoxName.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      this.owner.textBoxName = textBoxName;

      return textBoxName;
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
     * Getter for f_HorizontalPanel6 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel6() {
      return build_f_HorizontalPanel6();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel6.add(get_f_Label7());
      f_HorizontalPanel6.add(get_checkM());
      f_HorizontalPanel6.add(get_checkF());


      return f_HorizontalPanel6;
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
      f_Label7.setText("Gender :");
      f_Label7.setWidth("200px");


      return f_Label7;
    }

    /**
     * Getter for checkM called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.RadioButton get_checkM() {
      return build_checkM();
    }
    private com.google.gwt.user.client.ui.RadioButton build_checkM() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton checkM = new com.google.gwt.user.client.ui.RadioButton("gender");
      // Setup section.
      checkM.setText("Male");


      this.owner.checkM = checkM;

      return checkM;
    }

    /**
     * Getter for checkF called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.RadioButton get_checkF() {
      return build_checkF();
    }
    private com.google.gwt.user.client.ui.RadioButton build_checkF() {
      // Creation section.
      final com.google.gwt.user.client.ui.RadioButton checkF = new com.google.gwt.user.client.ui.RadioButton("gender");
      // Setup section.
      checkF.setText("Female");


      this.owner.checkF = checkF;

      return checkF;
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
     * Getter for f_HorizontalPanel8 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel8() {
      return build_f_HorizontalPanel8();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel8 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel8.add(get_checkReceiveNotifications());


      return f_HorizontalPanel8;
    }

    /**
     * Getter for checkReceiveNotifications called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.CheckBox get_checkReceiveNotifications() {
      return build_checkReceiveNotifications();
    }
    private com.google.gwt.user.client.ui.CheckBox build_checkReceiveNotifications() {
      // Creation section.
      final com.google.gwt.user.client.ui.CheckBox checkReceiveNotifications = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.
      checkReceiveNotifications.setName("notifications");
      checkReceiveNotifications.setText("Notifications");


      this.owner.checkReceiveNotifications = checkReceiveNotifications;

      return checkReceiveNotifications;
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
     * Getter for f_HorizontalPanel9 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel9() {
      return build_f_HorizontalPanel9();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel9 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel9.add(get_f_Label10());
      f_HorizontalPanel9.add(get_textBoxUser_Name());


      return f_HorizontalPanel9;
    }

    /**
     * Getter for f_Label10 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label10() {
      return build_f_Label10();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label10() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label10 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label10.setWidth("200px");
      f_Label10.setText("User_Name");


      return f_Label10;
    }

    /**
     * Getter for textBoxUser_Name called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_textBoxUser_Name() {
      return build_textBoxUser_Name();
    }
    private com.google.gwt.user.client.ui.TextBox build_textBoxUser_Name() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox textBoxUser_Name = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      textBoxUser_Name.setName("userEntity_name");
      textBoxUser_Name.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);


      this.owner.textBoxUser_Name = textBoxUser_Name;

      return textBoxUser_Name;
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
     * Getter for f_HorizontalPanel11 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel11() {
      return build_f_HorizontalPanel11();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel11() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel11 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel11.add(get_f_Label12());
      f_HorizontalPanel11.add(get_textBoxUser_Id());


      return f_HorizontalPanel11;
    }

    /**
     * Getter for f_Label12 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label12() {
      return build_f_Label12();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label12() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label12 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label12.setWidth("200px");
      f_Label12.setText("User_Id");


      return f_Label12;
    }

    /**
     * Getter for textBoxUser_Id called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_textBoxUser_Id() {
      return build_textBoxUser_Id();
    }
    private com.google.gwt.user.client.ui.TextBox build_textBoxUser_Id() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox textBoxUser_Id = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      textBoxUser_Id.setName("userEntity_userId");
      textBoxUser_Id.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);


      this.owner.textBoxUser_Id = textBoxUser_Id;

      return textBoxUser_Id;
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
     * Getter for f_HorizontalPanel13 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel13() {
      return build_f_HorizontalPanel13();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel13() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel13 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel13.add(get_f_Label14());
      f_HorizontalPanel13.add(get_textBoxUser_password());


      return f_HorizontalPanel13;
    }

    /**
     * Getter for f_Label14 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label14() {
      return build_f_Label14();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label14() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label14 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label14.setWidth("200px");
      f_Label14.setText("User_password");


      return f_Label14;
    }

    /**
     * Getter for textBoxUser_password called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.PasswordTextBox get_textBoxUser_password() {
      return build_textBoxUser_password();
    }
    private com.google.gwt.user.client.ui.PasswordTextBox build_textBoxUser_password() {
      // Creation section.
      final com.google.gwt.user.client.ui.PasswordTextBox textBoxUser_password = (com.google.gwt.user.client.ui.PasswordTextBox) GWT.create(com.google.gwt.user.client.ui.PasswordTextBox.class);
      // Setup section.
      textBoxUser_password.setName("userEntity_password");
      textBoxUser_password.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);


      this.owner.textBoxUser_password = textBoxUser_password;

      return textBoxUser_password;
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
     * Getter for f_HorizontalPanel15 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel15() {
      return build_f_HorizontalPanel15();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel15() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel15 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel15.add(get_f_Label16());
      f_HorizontalPanel15.add(get_user_MyAccountEntity_myAccountId());


      return f_HorizontalPanel15;
    }

    /**
     * Getter for f_Label16 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label16() {
      return build_f_Label16();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label16() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label16 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label16.setWidth("200px");
      f_Label16.setText("User_MyAccount_myAccountId");


      return f_Label16;
    }

    /**
     * Getter for user_MyAccountEntity_myAccountId called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_user_MyAccountEntity_myAccountId() {
      return build_user_MyAccountEntity_myAccountId();
    }
    private com.google.gwt.user.client.ui.TextBox build_user_MyAccountEntity_myAccountId() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox user_MyAccountEntity_myAccountId = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      user_MyAccountEntity_myAccountId.setName("UserEntity_MyAccountEntity_myAccountId");
      user_MyAccountEntity_myAccountId.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);


      this.owner.user_MyAccountEntity_myAccountId = user_MyAccountEntity_myAccountId;

      return user_MyAccountEntity_myAccountId;
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
     * Getter for f_HorizontalPanel17 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel17() {
      return build_f_HorizontalPanel17();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel17() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel17 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel17.add(get_f_Label18());
      f_HorizontalPanel17.add(get_user_MyAccountEntity_lastEdited());


      return f_HorizontalPanel17;
    }

    /**
     * Getter for f_Label18 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label18() {
      return build_f_Label18();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label18() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label18 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label18.setWidth("200px");
      f_Label18.setText("User_MyAccount_lastEdited");


      return f_Label18;
    }

    /**
     * Getter for user_MyAccountEntity_lastEdited called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_user_MyAccountEntity_lastEdited() {
      return build_user_MyAccountEntity_lastEdited();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_user_MyAccountEntity_lastEdited() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox user_MyAccountEntity_lastEdited = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.


      this.owner.user_MyAccountEntity_lastEdited = user_MyAccountEntity_lastEdited;

      return user_MyAccountEntity_lastEdited;
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
     * Getter for f_HorizontalPanel19 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel19() {
      return build_f_HorizontalPanel19();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel19() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel19 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel19.add(get_f_Label20());
      f_HorizontalPanel19.add(get_txtAddress());


      return f_HorizontalPanel19;
    }

    /**
     * Getter for f_Label20 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label20() {
      return build_f_Label20();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label20() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label20 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label20.setWidth("200px");
      f_Label20.setText("Address");


      return f_Label20;
    }

    /**
     * Getter for txtAddress called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_txtAddress() {
      return build_txtAddress();
    }
    private com.google.gwt.user.client.ui.TextBox build_txtAddress() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox txtAddress = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      txtAddress.setWidth("162px");
      txtAddress.setName("address");
      txtAddress.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      this.owner.txtAddress = txtAddress;

      return txtAddress;
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
  }
}
