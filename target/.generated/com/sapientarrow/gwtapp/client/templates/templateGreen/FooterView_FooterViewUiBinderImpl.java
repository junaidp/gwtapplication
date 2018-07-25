package com.sapientarrow.gwtapp.client.templates.templateGreen;

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

public class FooterView_FooterViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView>, com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView.FooterViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("HUGE DISCOUNTS WHEN YOU")
    SafeHtml html1();
     
    @Template("TRANSFER!")
    SafeHtml html2();
     
    @Template("So if you were waiting for the perfect time to seize this <span id='{0}'></span> opportunity, the time is now. <span id='{1}'></span> <span id='{2}'></span> <b>There are no obligations</b> <span id='{3}'></span> <b>Get a taste of SUCCESS!</b> <span id='{4}'></span> <b>So, act now...</b> <span id='{5}'></span>")
    SafeHtml html3(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5);
     
    @Template("sapient arrow")
    SafeHtml html4();
     
    @Template("© 2017 sapientarrowgreen <span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html5(String arg0, String arg1);
     
    @Template("<span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span>")
    SafeHtml html6(String arg0, String arg1, String arg2, String arg3);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = (com.google.gwt.event.dom.client.ClickHandler) new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId11();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId10Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId11Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3(get_domId3(), get_domId4(), get_domId5(), get_domId6(), get_domId7(), get_domId8());
    }
    SafeHtml template_html4() {
      return template.html4();
    }
    SafeHtml template_html5() {
      return template.html5(get_domId10(), get_domId11());
    }
    SafeHtml template_html6() {
      return template.html6(get_domId0(), get_domId1(), get_domId2(), get_domId9());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView_FooterViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView_FooterViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView_FooterViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView_FooterViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView_FooterViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 10 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView_FooterViewUiBinderImpl_GenCss_style style;
    private com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView_FooterViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView_FooterViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      f_HTMLPanel1.setStyleName("" + get_style().mainPanelMargin() + " " + get_style().mainPanelColor() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord150 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId9Element().get();

      // Detach section.
      attachRecord150.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_Br2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Br3(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Row4(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Row19(), get_domId9Element().get());

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
     * Getter for f_Br2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br2() {
      return build_f_Br2();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br2 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br2;
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
     * Getter for f_Br3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br3() {
      return build_f_Br3();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br3 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br3;
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
     * Getter for f_Row4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row4() {
      return build_f_Row4();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row4 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row4.add(get_f_Column5());
      f_Row4.add(get_f_Column8());
      f_Row4.addStyleName("" + get_style().img() + "");
      f_Row4.addStyleName("" + get_style().showGrid() + "");


      return f_Row4;
    }

    /**
     * Getter for f_Column5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column5() {
      return build_f_Column5();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column5 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_5,MD_5,LG_5");
      // Setup section.
      f_Column5.add(get_f_Br6());
      f_Column5.add(get_f_Image7());


      return f_Column5;
    }

    /**
     * Getter for f_Br6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br6() {
      return build_f_Br6();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br6 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br6;
    }

    /**
     * Getter for f_Image7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image7() {
      return build_f_Image7();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image7 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image7.addStyleName("" + get_style().emailImage() + "");
      f_Image7.setWidth("250px");
      f_Image7.setUrl("images/email.jpg");
      f_Image7.setHeight("160px");


      return f_Image7;
    }

    /**
     * Getter for f_Column8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column8() {
      return build_f_Column8();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column8 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_5,MD_5,LG_5");
      // Setup section.
      f_Column8.add(get_f_HTML9());
      f_Column8.add(get_f_HTML10());
      f_Column8.add(get_f_Br11());
      f_Column8.add(get_f_Paragraph12());
      f_Column8.add(get_btnSignup());


      return f_Column8;
    }

    /**
     * Getter for f_HTML9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML9() {
      return build_f_HTML9();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML9() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML9 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML9.setHTML(template_html1().asString());
      f_HTML9.setStyleName("" + get_style().textInfoDiscount() + "");


      return f_HTML9;
    }

    /**
     * Getter for f_HTML10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML10() {
      return build_f_HTML10();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML10() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML10 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML10.setHTML(template_html2().asString());
      f_HTML10.setStyleName("" + get_style().textInfoDiscount() + "");


      return f_HTML10;
    }

    /**
     * Getter for f_Br11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br11() {
      return build_f_Br11();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br11 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br11;
    }

    /**
     * Getter for f_Paragraph12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph12() {
      return build_f_Paragraph12();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph12 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.
      f_Paragraph12.setStyleName("" + get_style().paragraphStyleSimple() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord151 = UiBinderUtil.attachToDom(f_Paragraph12.getElement());
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId5Element().get();
      get_domId6Element().get();
      get_domId7Element().get();
      get_domId8Element().get();

      // Detach section.
      attachRecord151.detach();
      f_Paragraph12.addAndReplaceElement(get_f_Br13(), get_domId3Element().get());
      f_Paragraph12.addAndReplaceElement(get_f_Br14(), get_domId4Element().get());
      f_Paragraph12.addAndReplaceElement(get_f_Br15(), get_domId5Element().get());
      f_Paragraph12.addAndReplaceElement(get_f_Br16(), get_domId6Element().get());
      f_Paragraph12.addAndReplaceElement(get_f_Br17(), get_domId7Element().get());
      f_Paragraph12.addAndReplaceElement(get_f_Br18(), get_domId8Element().get());

      return f_Paragraph12;
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
     * Getter for f_Br13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br13() {
      return build_f_Br13();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br13 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br13;
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
     * Getter for f_Br14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br14() {
      return build_f_Br14();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br14 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br14;
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
     * Getter for f_Br15 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br15() {
      return build_f_Br15();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br15 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br15;
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
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_Br16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br16() {
      return build_f_Br16();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br16 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br16;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 5.
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
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_Br17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br17() {
      return build_f_Br17();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br17 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br17;
    }

    /**
     * Getter for domId7Element called 2 times. Type: DEFAULT. Build precedence: 5.
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
     * Getter for domId8 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_Br18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br18() {
      return build_f_Br18();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br18 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br18;
    }

    /**
     * Getter for domId8Element called 2 times. Type: DEFAULT. Build precedence: 5.
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
     * Getter for btnSignup called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_btnSignup() {
      return build_btnSignup();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_btnSignup() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton btnSignup = (org.gwtbootstrap3.client.ui.AnchorButton) GWT.create(org.gwtbootstrap3.client.ui.AnchorButton.class);
      // Setup section.
      btnSignup.setText("Signup Today");
      btnSignup.setStyleName("" + get_style().signupButton() + "");
      btnSignup.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      this.owner.btnSignup = btnSignup;

      return btnSignup;
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
     * Getter for f_Row19 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row19() {
      return build_f_Row19();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row19 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row19.add(get_f_Column20());


      return f_Row19;
    }

    /**
     * Getter for f_Column20 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column20() {
      return build_f_Column20();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column20 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_12,MD_12,LG_12");
      // Setup section.
      f_Column20.add(get_f_Paragraph21());


      return f_Column20;
    }

    /**
     * Getter for f_Paragraph21 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph21() {
      return build_f_Paragraph21();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph21 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html5().asString());
      // Setup section.
      f_Paragraph21.setStyleName("" + get_style().paragraphStyle() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord152 = UiBinderUtil.attachToDom(f_Paragraph21.getElement());
      get_domId10Element().get();
      get_domId11Element().get();

      // Detach section.
      attachRecord152.detach();
      f_Paragraph21.addAndReplaceElement(get_f_Br22(), get_domId10Element().get());
      f_Paragraph21.addAndReplaceElement(get_f_NavbarLink23(), get_domId11Element().get());

      return f_Paragraph21;
    }

    /**
     * Getter for domId10 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_Br22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br22() {
      return build_f_Br22();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br22 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br22;
    }

    /**
     * Getter for domId10Element called 2 times. Type: DEFAULT. Build precedence: 5.
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
     * Getter for domId11 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_NavbarLink23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarLink get_f_NavbarLink23() {
      return build_f_NavbarLink23();
    }
    private org.gwtbootstrap3.client.ui.NavbarLink build_f_NavbarLink23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarLink f_NavbarLink23 = (org.gwtbootstrap3.client.ui.NavbarLink) GWT.create(org.gwtbootstrap3.client.ui.NavbarLink.class);
      // Setup section.
      f_NavbarLink23.setHTML(template_html4().asString());
      f_NavbarLink23.setHref("http://sapientarrow.com/");


      return f_NavbarLink23;
    }

    /**
     * Getter for domId11Element called 2 times. Type: DEFAULT. Build precedence: 5.
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
