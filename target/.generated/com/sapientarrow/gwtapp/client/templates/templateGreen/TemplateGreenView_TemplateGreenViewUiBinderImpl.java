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

public class TemplateGreenView_TemplateGreenViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView>, com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView.TemplateGreenViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("HOME PAGE TITLE")
    SafeHtml html1();
     
    @Template("Lorem ipsum dolor sit amet, consectetur adipiscing elit. In in magna augue. Phasellus non ipsum nec nisl volutpat tincidunt. Donec sit amet volutpat odio. Integer dignissim vitae neque at venenatis. Nunc convallis eget risus nec convallis. Quisque nunc tortor, aliquet ut pretium id, ornare id tortor. Nulla facilisi. Maecenas sit amet ante a elit vulputate aliquam in ut quam.")
    SafeHtml html2();
     
    @Template("WHAT WE DO?")
    SafeHtml html3();
     
    @Template("Nam vitae ligula eu mi molestie fringilla sed ac assa. Quisque justo metus, commodo eu viverra quis, volutpat et urna.")
    SafeHtml html4();
     
    @Template("<b>Read</b> More")
    SafeHtml html5();
     
    @Template("Nam vitae ligula eu mi molestie fringilla sed ac assa. Quisque justo metus, commodo eu viverra quis, volutpat et urna.")
    SafeHtml html6();
     
    @Template("<b>Read</b> More")
    SafeHtml html7();
     
    @Template("Nam vitae ligula eu mi molestie fringilla sed ac assa. Quisque justo metus, commodo eu viverra quis, volutpat et urna.")
    SafeHtml html8();
     
    @Template("<b>Read</b> More")
    SafeHtml html9();
     
    @Template("Nam vitae ligula eu mi molestie fringilla sed ac assa. Quisque justo metus, commodo eu viverra quis, volutpat et urna.")
    SafeHtml html10();
     
    @Template("<b>Read</b> More")
    SafeHtml html11();
     
    @Template("<span id='{0}'></span> <div style='padding-left:20%'> <span id='{1}'></span> </div>")
    SafeHtml html12(String arg0, String arg1);
     
    @Template("RECENT WORK?")
    SafeHtml html13();
     
    @Template("RECENT WORK 1")
    SafeHtml html14();
     
    @Template("Nam vitae ligula eu mi molestie fringilla sed ac assa. Quisque justo metus, commodo eu viverra quis, volutpat et urna.")
    SafeHtml html15();
     
    @Template("RECENT WORK 2")
    SafeHtml html16();
     
    @Template("Nam vitae ligula eu mi molestie fringilla sed ac assa. Quisque justo metus, commodo eu viverra quis, volutpat et urna.")
    SafeHtml html17();
     
    @Template("RECENT WORK 3")
    SafeHtml html18();
     
    @Template("Nam vitae ligula eu mi molestie fringilla sed ac assa. Quisque justo metus, commodo eu viverra quis, volutpat et urna.")
    SafeHtml html19();
     
    @Template("RECENT WORK 4")
    SafeHtml html20();
     
    @Template("Nam vitae ligula eu mi molestie fringilla sed ac assa. Quisque justo metus, commodo eu viverra quis, volutpat et urna.")
    SafeHtml html21();
     
    @Template("RECENT WORK 5")
    SafeHtml html22();
     
    @Template("Nam vitae ligula eu mi molestie fringilla sed ac assa. Quisque justo metus, commodo eu viverra quis, volutpat et urna.")
    SafeHtml html23();
     
    @Template("RECENT WORK 6")
    SafeHtml html24();
     
    @Template("Nam vitae ligula eu mi molestie fringilla sed ac assa. Quisque justo metus, commodo eu viverra quis, volutpat et urna.")
    SafeHtml html25();
     
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html26(String arg0, String arg1);
     
    @Template("COMPANY DETAILS")
    SafeHtml html27();
     
    @Template("OUR LATEST NEWS")
    SafeHtml html28();
     
    @Template("News Item 1")
    SafeHtml html29();
     
    @Template("News Item 2")
    SafeHtml html30();
     
    @Template("News Item 3")
    SafeHtml html31();
     
    @Template("LATEST PORDUCTS")
    SafeHtml html32();
     
    @Template("Product 1 here")
    SafeHtml html33();
     
    @Template("Product 2 here")
    SafeHtml html34();
     
    @Template("Product 3 here")
    SafeHtml html35();
     
    @Template("CONTACT US")
    SafeHtml html36();
     
    @Template("Head Office")
    SafeHtml html37();
     
    @Template("The Street")
    SafeHtml html38();
     
    @Template("The Town/City")
    SafeHtml html39();
     
    @Template("Country")
    SafeHtml html40();
     
    @Template("<div style='padding-left:20%'> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> </div>")
    SafeHtml html41(String arg0, String arg1, String arg2);
     
    @Template("<span id='{0}'></span>")
    SafeHtml html42(String arg0);
     
    @Template("<span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span> <span id='{4}'></span> <span id='{5}'></span> <span id='{6}'></span> <span id='{7}'></span>")
    SafeHtml html43(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId12();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId13();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId14();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId11();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId15();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId12Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId13Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId14Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId11Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId10Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId15Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
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
      return template.html9();
    }
    SafeHtml template_html10() {
      return template.html10();
    }
    SafeHtml template_html11() {
      return template.html11();
    }
    SafeHtml template_html12() {
      return template.html12(get_domId5(), get_domId6());
    }
    SafeHtml template_html13() {
      return template.html13();
    }
    SafeHtml template_html14() {
      return template.html14();
    }
    SafeHtml template_html15() {
      return template.html15();
    }
    SafeHtml template_html16() {
      return template.html16();
    }
    SafeHtml template_html17() {
      return template.html17();
    }
    SafeHtml template_html18() {
      return template.html18();
    }
    SafeHtml template_html19() {
      return template.html19();
    }
    SafeHtml template_html20() {
      return template.html20();
    }
    SafeHtml template_html21() {
      return template.html21();
    }
    SafeHtml template_html22() {
      return template.html22();
    }
    SafeHtml template_html23() {
      return template.html23();
    }
    SafeHtml template_html24() {
      return template.html24();
    }
    SafeHtml template_html25() {
      return template.html25();
    }
    SafeHtml template_html26() {
      return template.html26(get_domId8(), get_domId9());
    }
    SafeHtml template_html27() {
      return template.html27();
    }
    SafeHtml template_html28() {
      return template.html28();
    }
    SafeHtml template_html29() {
      return template.html29();
    }
    SafeHtml template_html30() {
      return template.html30();
    }
    SafeHtml template_html31() {
      return template.html31();
    }
    SafeHtml template_html32() {
      return template.html32();
    }
    SafeHtml template_html33() {
      return template.html33();
    }
    SafeHtml template_html34() {
      return template.html34();
    }
    SafeHtml template_html35() {
      return template.html35();
    }
    SafeHtml template_html36() {
      return template.html36();
    }
    SafeHtml template_html37() {
      return template.html37();
    }
    SafeHtml template_html38() {
      return template.html38();
    }
    SafeHtml template_html39() {
      return template.html39();
    }
    SafeHtml template_html40() {
      return template.html40();
    }
    SafeHtml template_html41() {
      return template.html41(get_domId12(), get_domId13(), get_domId14());
    }
    SafeHtml template_html42() {
      return template.html42(get_domId11());
    }
    SafeHtml template_html43() {
      return template.html43(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId7(), get_domId10(), get_domId15());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 46 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenCss_style style;
    private com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenCss_style build_style() {
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html43().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord130 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId7Element().get();
      get_domId10Element().get();
      get_domId15Element().get();

      // Detach section.
      attachRecord130.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_HeaderView2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Container3(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Row7(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Row12(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel15(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel41(), get_domId7Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel68(), get_domId10Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FooterView112(), get_domId15Element().get());

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
     * Getter for f_HeaderView2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView get_f_HeaderView2() {
      return build_f_HeaderView2();
    }
    private com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView build_f_HeaderView2() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView f_HeaderView2 = (com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView) GWT.create(com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView.class);
      // Setup section.


      return f_HeaderView2;
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
     * Getter for f_Container3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container3() {
      return build_f_Container3();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container3 = (org.gwtbootstrap3.client.ui.Container) GWT.create(org.gwtbootstrap3.client.ui.Container.class);
      // Setup section.
      f_Container3.add(get_f_Row4());
      f_Container3.setStyleName("" + get_style().containerPanelColor() + "");
      f_Container3.setFluid(true);
      f_Container3.setMarginTop(45);


      return f_Container3;
    }

    /**
     * Getter for f_Row4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row4() {
      return build_f_Row4();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row4 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row4.add(get_f_Column5());


      return f_Row4;
    }

    /**
     * Getter for f_Column5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column5() {
      return build_f_Column5();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column5 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_12,MD_11,LG_12");
      // Setup section.
      f_Column5.add(get_f_Image6());


      return f_Column5;
    }

    /**
     * Getter for f_Image6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image6() {
      return build_f_Image6();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image6 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image6.setUrl("images/garden2.jpg");


      return f_Image6;
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
     * Getter for f_Row7 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row7() {
      return build_f_Row7();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row7 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row7.add(get_f_Br8());
      f_Row7.add(get_f_Br9());
      f_Row7.add(get_f_Column10());


      return f_Row7;
    }

    /**
     * Getter for f_Br8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br8() {
      return build_f_Br8();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br8 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br8;
    }

    /**
     * Getter for f_Br9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br9() {
      return build_f_Br9();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br9 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br9;
    }

    /**
     * Getter for f_Column10 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column10() {
      return build_f_Column10();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column10 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_8,MD_9,LG_9");
      // Setup section.
      f_Column10.add(get_f_NavbarBrand11());


      return f_Column10;
    }

    /**
     * Getter for f_NavbarBrand11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand11() {
      return build_f_NavbarBrand11();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand11 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand11.setHTML(template_html1().asString());
      f_NavbarBrand11.setStyleName("" + get_style().heading() + "");


      return f_NavbarBrand11;
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
     * Getter for f_Row12 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row12() {
      return build_f_Row12();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row12 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row12.add(get_f_Column13());


      return f_Row12;
    }

    /**
     * Getter for f_Column13 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column13() {
      return build_f_Column13();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column13 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_12,MD_12,LG_12");
      // Setup section.
      f_Column13.add(get_f_Paragraph14());


      return f_Column13;
    }

    /**
     * Getter for f_Paragraph14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph14() {
      return build_f_Paragraph14();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph14 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html2().asString());
      // Setup section.
      f_Paragraph14.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph14;
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
     * Getter for f_HTMLPanel15 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel15() {
      return build_f_HTMLPanel15();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel15() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel15 = new com.google.gwt.user.client.ui.HTMLPanel(template_html12().asString());
      // Setup section.
      f_HTMLPanel15.setStyleName("" + get_style().sectionsPanelMargin() + " " + get_style().innerMainPanelColorWhatWeDo() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord131 = UiBinderUtil.attachToDom(f_HTMLPanel15.getElement());
      get_domId5Element().get();
      get_domId6Element().get();

      // Detach section.
      attachRecord131.detach();
      f_HTMLPanel15.addAndReplaceElement(get_f_Row16(), get_domId5Element().get());
      f_HTMLPanel15.addAndReplaceElement(get_f_Row20(), get_domId6Element().get());

      return f_HTMLPanel15;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for f_Row16 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row16() {
      return build_f_Row16();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row16 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row16.add(get_f_HTML17());
      f_Row16.add(get_f_Br18());
      f_Row16.add(get_f_Br19());


      return f_Row16;
    }

    /**
     * Getter for f_HTML17 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML17() {
      return build_f_HTML17();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML17() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML17 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML17.setHTML(template_html3().asString());
      f_HTML17.setStyleName("" + get_style().sectionHeader() + "");


      return f_HTML17;
    }

    /**
     * Getter for f_Br18 called 1 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for f_Br19 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br19() {
      return build_f_Br19();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br19 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br19;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for f_Row20 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row20() {
      return build_f_Row20();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row20 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row20.add(get_f_Column21());
      f_Row20.add(get_f_Column26());
      f_Row20.add(get_f_Column31());
      f_Row20.add(get_f_Column36());


      return f_Row20;
    }

    /**
     * Getter for f_Column21 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column21() {
      return build_f_Column21();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column21 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_6,MD_2,LG_2");
      // Setup section.
      f_Column21.add(get_f_Image22());
      f_Column21.add(get_f_Br23());
      f_Column21.add(get_f_Paragraph24());
      f_Column21.add(get_f_NavbarBrand25());


      return f_Column21;
    }

    /**
     * Getter for f_Image22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image22() {
      return build_f_Image22();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image22 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image22.setWidth("100px");
      f_Image22.setUrl("images/TextInfo1.jpg");
      f_Image22.setHeight("100px");


      return f_Image22;
    }

    /**
     * Getter for f_Br23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br23() {
      return build_f_Br23();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br23 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br23;
    }

    /**
     * Getter for f_Paragraph24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph24() {
      return build_f_Paragraph24();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph24 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html4().asString());
      // Setup section.
      f_Paragraph24.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph24;
    }

    /**
     * Getter for f_NavbarBrand25 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand25() {
      return build_f_NavbarBrand25();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand25 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand25.setHTML(template_html5().asString());
      f_NavbarBrand25.setStyleName("" + get_style().readMore() + "");


      return f_NavbarBrand25;
    }

    /**
     * Getter for f_Column26 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column26() {
      return build_f_Column26();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column26 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_6,MD_2,LG_2");
      // Setup section.
      f_Column26.add(get_f_Image27());
      f_Column26.add(get_f_Br28());
      f_Column26.add(get_f_Paragraph29());
      f_Column26.add(get_f_NavbarBrand30());


      return f_Column26;
    }

    /**
     * Getter for f_Image27 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image27() {
      return build_f_Image27();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image27 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image27.setWidth("100px");
      f_Image27.setUrl("images/TextInfo2.jpg");
      f_Image27.setHeight("100px");


      return f_Image27;
    }

    /**
     * Getter for f_Br28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br28() {
      return build_f_Br28();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br28 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br28;
    }

    /**
     * Getter for f_Paragraph29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph29() {
      return build_f_Paragraph29();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph29 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html6().asString());
      // Setup section.
      f_Paragraph29.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph29;
    }

    /**
     * Getter for f_NavbarBrand30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand30() {
      return build_f_NavbarBrand30();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand30 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand30.setHTML(template_html7().asString());
      f_NavbarBrand30.setStyleName("" + get_style().readMore() + "");


      return f_NavbarBrand30;
    }

    /**
     * Getter for f_Column31 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column31() {
      return build_f_Column31();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column31 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_6,MD_2,LG_2");
      // Setup section.
      f_Column31.add(get_f_Image32());
      f_Column31.add(get_f_Br33());
      f_Column31.add(get_f_Paragraph34());
      f_Column31.add(get_f_NavbarBrand35());


      return f_Column31;
    }

    /**
     * Getter for f_Image32 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image32() {
      return build_f_Image32();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image32 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image32.setWidth("100px");
      f_Image32.setUrl("images/TextInfo3.jpg");
      f_Image32.setHeight("100px");


      return f_Image32;
    }

    /**
     * Getter for f_Br33 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br33() {
      return build_f_Br33();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br33 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br33;
    }

    /**
     * Getter for f_Paragraph34 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph34() {
      return build_f_Paragraph34();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph34 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html8().asString());
      // Setup section.
      f_Paragraph34.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph34;
    }

    /**
     * Getter for f_NavbarBrand35 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand35() {
      return build_f_NavbarBrand35();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand35 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand35.setHTML(template_html9().asString());
      f_NavbarBrand35.setStyleName("" + get_style().readMore() + "");


      return f_NavbarBrand35;
    }

    /**
     * Getter for f_Column36 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column36() {
      return build_f_Column36();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column36 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_6,MD_2,LG_2");
      // Setup section.
      f_Column36.add(get_f_Image37());
      f_Column36.add(get_f_Br38());
      f_Column36.add(get_f_Paragraph39());
      f_Column36.add(get_f_NavbarBrand40());


      return f_Column36;
    }

    /**
     * Getter for f_Image37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image37() {
      return build_f_Image37();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image37 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image37.setWidth("100px");
      f_Image37.setUrl("images/TextInfo4.jpg");
      f_Image37.setHeight("100px");


      return f_Image37;
    }

    /**
     * Getter for f_Br38 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br38() {
      return build_f_Br38();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br38 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br38;
    }

    /**
     * Getter for f_Paragraph39 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph39() {
      return build_f_Paragraph39();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph39 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html10().asString());
      // Setup section.
      f_Paragraph39.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph39;
    }

    /**
     * Getter for f_NavbarBrand40 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand40() {
      return build_f_NavbarBrand40();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand40 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand40.setHTML(template_html11().asString());
      f_NavbarBrand40.setStyleName("" + get_style().readMore() + "");


      return f_NavbarBrand40;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for f_HTMLPanel41 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel41() {
      return build_f_HTMLPanel41();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel41() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel41 = new com.google.gwt.user.client.ui.HTMLPanel(template_html26().asString());
      // Setup section.
      f_HTMLPanel41.setStyleName("" + get_style().sectionsPanelMargin() + " " + get_style().innerMainPanelColorRecentWork() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord132 = UiBinderUtil.attachToDom(f_HTMLPanel41.getElement());
      get_domId8Element().get();
      get_domId9Element().get();

      // Detach section.
      attachRecord132.detach();
      f_HTMLPanel41.addAndReplaceElement(get_f_Row42(), get_domId8Element().get());
      f_HTMLPanel41.addAndReplaceElement(get_f_Row47(), get_domId9Element().get());

      return f_HTMLPanel41;
    }

    /**
     * Getter for domId8 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for f_Row42 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row42() {
      return build_f_Row42();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row42 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row42.add(get_f_Br43());
      f_Row42.add(get_f_Br44());
      f_Row42.add(get_f_HTML45());
      f_Row42.add(get_f_Br46());


      return f_Row42;
    }

    /**
     * Getter for f_Br43 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br43() {
      return build_f_Br43();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br43 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br43;
    }

    /**
     * Getter for f_Br44 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br44() {
      return build_f_Br44();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br44 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br44;
    }

    /**
     * Getter for f_HTML45 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML45() {
      return build_f_HTML45();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML45() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML45 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML45.setHTML(template_html13().asString());
      f_HTML45.setStyleName("" + get_style().sectionHeader() + "");


      return f_HTML45;
    }

    /**
     * Getter for f_Br46 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br46() {
      return build_f_Br46();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br46 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br46;
    }

    /**
     * Getter for domId8Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for domId9 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for f_Row47 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row47() {
      return build_f_Row47();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row47 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row47.add(get_f_Column48());
      f_Row47.add(get_f_Column51());
      f_Row47.addStyleName("" + get_style().showGrid() + "");


      return f_Row47;
    }

    /**
     * Getter for f_Column48 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column48() {
      return build_f_Column48();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column48 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_5,MD_5,LG_5");
      // Setup section.
      f_Column48.add(get_f_Br49());
      f_Column48.add(get_f_Image50());


      return f_Column48;
    }

    /**
     * Getter for f_Br49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br49() {
      return build_f_Br49();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br49 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br49;
    }

    /**
     * Getter for f_Image50 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image50() {
      return build_f_Image50();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image50 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image50.setWidth("330px");
      f_Image50.setUrl("images/garden7.jpg");
      f_Image50.setHeight("350px");


      return f_Image50;
    }

    /**
     * Getter for f_Column51 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column51() {
      return build_f_Column51();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column51 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_5,MD_5,LG_5");
      // Setup section.
      f_Column51.add(get_f_Image52());
      f_Column51.add(get_f_NavbarBrand53());
      f_Column51.add(get_f_Paragraph54());
      f_Column51.add(get_f_Image55());
      f_Column51.add(get_f_NavbarBrand56());
      f_Column51.add(get_f_Paragraph57());
      f_Column51.add(get_f_Image58());
      f_Column51.add(get_f_NavbarBrand59());
      f_Column51.add(get_f_Paragraph60());
      f_Column51.add(get_f_Image61());
      f_Column51.add(get_f_NavbarBrand62());
      f_Column51.add(get_f_Paragraph63());
      f_Column51.add(get_f_NavbarBrand64());
      f_Column51.add(get_f_Paragraph65());
      f_Column51.add(get_f_NavbarBrand66());
      f_Column51.add(get_f_Paragraph67());


      return f_Column51;
    }

    /**
     * Getter for f_Image52 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image52() {
      return build_f_Image52();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image52 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image52.setWidth("30px");
      f_Image52.setUrl("images/recentWork.jpg");
      f_Image52.setHeight("30px");


      return f_Image52;
    }

    /**
     * Getter for f_NavbarBrand53 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand53() {
      return build_f_NavbarBrand53();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand53 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand53.setHTML(template_html14().asString());
      f_NavbarBrand53.setStyleName("" + get_style().textInfo() + "");


      return f_NavbarBrand53;
    }

    /**
     * Getter for f_Paragraph54 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph54() {
      return build_f_Paragraph54();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph54 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html15().asString());
      // Setup section.
      f_Paragraph54.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph54;
    }

    /**
     * Getter for f_Image55 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image55() {
      return build_f_Image55();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image55 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image55.setWidth("30px");
      f_Image55.setUrl("images/recentWork.jpg");
      f_Image55.setHeight("30px");


      return f_Image55;
    }

    /**
     * Getter for f_NavbarBrand56 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand56() {
      return build_f_NavbarBrand56();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand56 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand56.setHTML(template_html16().asString());
      f_NavbarBrand56.setStyleName("" + get_style().textInfo() + "");


      return f_NavbarBrand56;
    }

    /**
     * Getter for f_Paragraph57 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph57() {
      return build_f_Paragraph57();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph57 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html17().asString());
      // Setup section.
      f_Paragraph57.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph57;
    }

    /**
     * Getter for f_Image58 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image58() {
      return build_f_Image58();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image58 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image58.setWidth("30px");
      f_Image58.setUrl("images/recentWork.jpg");
      f_Image58.setHeight("30px");


      return f_Image58;
    }

    /**
     * Getter for f_NavbarBrand59 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand59() {
      return build_f_NavbarBrand59();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand59 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand59.setHTML(template_html18().asString());
      f_NavbarBrand59.setStyleName("" + get_style().textInfo() + "");


      return f_NavbarBrand59;
    }

    /**
     * Getter for f_Paragraph60 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph60() {
      return build_f_Paragraph60();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph60 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html19().asString());
      // Setup section.
      f_Paragraph60.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph60;
    }

    /**
     * Getter for f_Image61 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image61() {
      return build_f_Image61();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image61 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image61.setWidth("30px");
      f_Image61.setUrl("images/recentWork.jpg");
      f_Image61.setHeight("30px");


      return f_Image61;
    }

    /**
     * Getter for f_NavbarBrand62 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand62() {
      return build_f_NavbarBrand62();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand62 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand62.setHTML(template_html20().asString());
      f_NavbarBrand62.setStyleName("" + get_style().textInfo() + "");


      return f_NavbarBrand62;
    }

    /**
     * Getter for f_Paragraph63 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph63() {
      return build_f_Paragraph63();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph63 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html21().asString());
      // Setup section.
      f_Paragraph63.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph63;
    }

    /**
     * Getter for f_NavbarBrand64 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand64() {
      return build_f_NavbarBrand64();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand64 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand64.setHTML(template_html22().asString());
      f_NavbarBrand64.setStyleName("" + get_style().textInfo() + "");


      return f_NavbarBrand64;
    }

    /**
     * Getter for f_Paragraph65 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph65() {
      return build_f_Paragraph65();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph65 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html23().asString());
      // Setup section.
      f_Paragraph65.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph65;
    }

    /**
     * Getter for f_NavbarBrand66 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand66() {
      return build_f_NavbarBrand66();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand66 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand66.setHTML(template_html24().asString());
      f_NavbarBrand66.setStyleName("" + get_style().textInfo() + "");


      return f_NavbarBrand66;
    }

    /**
     * Getter for f_Paragraph67 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph67() {
      return build_f_Paragraph67();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph67 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html25().asString());
      // Setup section.
      f_Paragraph67.setStyleName("" + get_style().paragraphStyle() + "");


      return f_Paragraph67;
    }

    /**
     * Getter for domId9Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for f_HTMLPanel68 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel68() {
      return build_f_HTMLPanel68();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel68() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel68 = new com.google.gwt.user.client.ui.HTMLPanel(template_html42().asString());
      // Setup section.
      f_HTMLPanel68.setStyleName("" + get_style().sectionsPanelMargin() + " " + get_style().innerMainPanelColorCompanyDetails() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord133 = UiBinderUtil.attachToDom(f_HTMLPanel68.getElement());
      get_domId11Element().get();

      // Detach section.
      attachRecord133.detach();
      f_HTMLPanel68.addAndReplaceElement(get_f_Row69(), get_domId11Element().get());

      return f_HTMLPanel68;
    }

    /**
     * Getter for domId11 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for f_Row69 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row69() {
      return build_f_Row69();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row69 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row69.add(get_f_Br70());
      f_Row69.add(get_f_HTML71());
      f_Row69.add(get_f_Br72());
      f_Row69.add(get_f_Br73());
      f_Row69.add(get_f_HTMLPanel74());


      return f_Row69;
    }

    /**
     * Getter for f_Br70 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br70() {
      return build_f_Br70();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br70 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br70;
    }

    /**
     * Getter for f_HTML71 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML71() {
      return build_f_HTML71();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML71() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML71 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML71.setHTML(template_html27().asString());
      f_HTML71.setStyleName("" + get_style().sectionHeader() + "");


      return f_HTML71;
    }

    /**
     * Getter for f_Br72 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br72() {
      return build_f_Br72();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br72 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br72;
    }

    /**
     * Getter for f_Br73 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br73() {
      return build_f_Br73();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br73() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br73 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br73;
    }

    /**
     * Getter for f_HTMLPanel74 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel74() {
      return build_f_HTMLPanel74();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel74() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel74 = new com.google.gwt.user.client.ui.HTMLPanel(template_html41().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord134 = UiBinderUtil.attachToDom(f_HTMLPanel74.getElement());
      get_domId12Element().get();
      get_domId13Element().get();
      get_domId14Element().get();

      // Detach section.
      attachRecord134.detach();
      f_HTMLPanel74.addAndReplaceElement(get_f_Column75(), get_domId12Element().get());
      f_HTMLPanel74.addAndReplaceElement(get_f_Column88(), get_domId13Element().get());
      f_HTMLPanel74.addAndReplaceElement(get_f_Column101(), get_domId14Element().get());

      return f_HTMLPanel74;
    }

    /**
     * Getter for domId12 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_Column75 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column75() {
      return build_f_Column75();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column75() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column75 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_6,MD_3,LG_3");
      // Setup section.
      f_Column75.add(get_f_Image76());
      f_Column75.add(get_f_Br77());
      f_Column75.add(get_f_Br78());
      f_Column75.add(get_f_HTML79());
      f_Column75.add(get_f_Br80());
      f_Column75.add(get_f_NavbarBrand81());
      f_Column75.add(get_f_Br82());
      f_Column75.add(get_f_Br83());
      f_Column75.add(get_f_NavbarBrand84());
      f_Column75.add(get_f_Br85());
      f_Column75.add(get_f_Br86());
      f_Column75.add(get_f_NavbarBrand87());


      return f_Column75;
    }

    /**
     * Getter for f_Image76 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image76() {
      return build_f_Image76();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image76() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image76 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image76.setWidth("250px");
      f_Image76.setUrl("images/garden4.jpg");
      f_Image76.setHeight("150px");


      return f_Image76;
    }

    /**
     * Getter for f_Br77 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br77() {
      return build_f_Br77();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br77() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br77 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br77;
    }

    /**
     * Getter for f_Br78 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br78() {
      return build_f_Br78();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br78() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br78 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br78;
    }

    /**
     * Getter for f_HTML79 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML79() {
      return build_f_HTML79();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML79() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML79 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML79.setHTML(template_html28().asString());
      f_HTML79.setStyleName("" + get_style().companyDetailsItemsHeadings() + "");


      return f_HTML79;
    }

    /**
     * Getter for f_Br80 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br80() {
      return build_f_Br80();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br80() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br80 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br80;
    }

    /**
     * Getter for f_NavbarBrand81 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand81() {
      return build_f_NavbarBrand81();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand81 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand81.setHTML(template_html29().asString());
      f_NavbarBrand81.setStyleName("" + get_style().companyDetailsItems() + "");


      return f_NavbarBrand81;
    }

    /**
     * Getter for f_Br82 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br82() {
      return build_f_Br82();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br82() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br82 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br82;
    }

    /**
     * Getter for f_Br83 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br83() {
      return build_f_Br83();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br83() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br83 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br83;
    }

    /**
     * Getter for f_NavbarBrand84 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand84() {
      return build_f_NavbarBrand84();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand84() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand84 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand84.setHTML(template_html30().asString());
      f_NavbarBrand84.setStyleName("" + get_style().companyDetailsItems() + "");


      return f_NavbarBrand84;
    }

    /**
     * Getter for f_Br85 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br85() {
      return build_f_Br85();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br85() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br85 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br85;
    }

    /**
     * Getter for f_Br86 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br86() {
      return build_f_Br86();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br86() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br86 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br86;
    }

    /**
     * Getter for f_NavbarBrand87 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand87() {
      return build_f_NavbarBrand87();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand87() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand87 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand87.setHTML(template_html31().asString());
      f_NavbarBrand87.setStyleName("" + get_style().companyDetailsItems() + "");


      return f_NavbarBrand87;
    }

    /**
     * Getter for domId12Element called 2 times. Type: DEFAULT. Build precedence: 5.
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

    /**
     * Getter for domId13 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
     */
    private java.lang.String domId13;
    private java.lang.String get_domId13() {
      return domId13;
    }
    private java.lang.String build_domId13() {
      // Creation section.
      domId13 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId13;
    }

    /**
     * Getter for f_Column88 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column88() {
      return build_f_Column88();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column88() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column88 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_6,MD_3,LG_3");
      // Setup section.
      f_Column88.add(get_f_Image89());
      f_Column88.add(get_f_Br90());
      f_Column88.add(get_f_Br91());
      f_Column88.add(get_f_HTML92());
      f_Column88.add(get_f_Br93());
      f_Column88.add(get_f_NavbarBrand94());
      f_Column88.add(get_f_Br95());
      f_Column88.add(get_f_Br96());
      f_Column88.add(get_f_NavbarBrand97());
      f_Column88.add(get_f_Br98());
      f_Column88.add(get_f_Br99());
      f_Column88.add(get_f_NavbarBrand100());


      return f_Column88;
    }

    /**
     * Getter for f_Image89 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image89() {
      return build_f_Image89();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image89() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image89 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image89.setWidth("250px");
      f_Image89.setUrl("images/garden5.jpg");
      f_Image89.setHeight("150px");


      return f_Image89;
    }

    /**
     * Getter for f_Br90 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br90() {
      return build_f_Br90();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br90() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br90 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br90;
    }

    /**
     * Getter for f_Br91 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br91() {
      return build_f_Br91();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br91() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br91 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br91;
    }

    /**
     * Getter for f_HTML92 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML92() {
      return build_f_HTML92();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML92() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML92 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML92.setHTML(template_html32().asString());
      f_HTML92.setStyleName("" + get_style().companyDetailsItemsHeadings() + "");


      return f_HTML92;
    }

    /**
     * Getter for f_Br93 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br93() {
      return build_f_Br93();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br93() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br93 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br93;
    }

    /**
     * Getter for f_NavbarBrand94 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand94() {
      return build_f_NavbarBrand94();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand94() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand94 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand94.setHTML(template_html33().asString());
      f_NavbarBrand94.setStyleName("" + get_style().companyDetailsItems() + "");


      return f_NavbarBrand94;
    }

    /**
     * Getter for f_Br95 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br95() {
      return build_f_Br95();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br95() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br95 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br95;
    }

    /**
     * Getter for f_Br96 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br96() {
      return build_f_Br96();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br96() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br96 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br96;
    }

    /**
     * Getter for f_NavbarBrand97 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand97() {
      return build_f_NavbarBrand97();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand97() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand97 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand97.setHTML(template_html34().asString());
      f_NavbarBrand97.setStyleName("" + get_style().companyDetailsItems() + "");


      return f_NavbarBrand97;
    }

    /**
     * Getter for f_Br98 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br98() {
      return build_f_Br98();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br98() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br98 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br98;
    }

    /**
     * Getter for f_Br99 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br99() {
      return build_f_Br99();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br99() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br99 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br99;
    }

    /**
     * Getter for f_NavbarBrand100 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand100() {
      return build_f_NavbarBrand100();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand100() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand100 = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      f_NavbarBrand100.setHTML(template_html35().asString());
      f_NavbarBrand100.setStyleName("" + get_style().companyDetailsItems() + "");


      return f_NavbarBrand100;
    }

    /**
     * Getter for domId13Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId13Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId13Element() {
      return domId13Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId13Element() {
      // Creation section.
      domId13Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId13());
      // Setup section.


      return domId13Element;
    }

    /**
     * Getter for domId14 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
     */
    private java.lang.String domId14;
    private java.lang.String get_domId14() {
      return domId14;
    }
    private java.lang.String build_domId14() {
      // Creation section.
      domId14 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId14;
    }

    /**
     * Getter for f_Column101 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column101() {
      return build_f_Column101();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column101() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column101 = new org.gwtbootstrap3.client.ui.Column("XS_12,SM_6,MD_3,LG_3");
      // Setup section.
      f_Column101.add(get_f_Image102());
      f_Column101.add(get_f_Br103());
      f_Column101.add(get_f_Br104());
      f_Column101.add(get_f_HTML105());
      f_Column101.add(get_f_Br106());
      f_Column101.add(get_f_HTML107());
      f_Column101.add(get_f_HTML108());
      f_Column101.add(get_f_HTML109());
      f_Column101.add(get_f_HTML110());
      f_Column101.add(get_f_Br111());


      return f_Column101;
    }

    /**
     * Getter for f_Image102 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image102() {
      return build_f_Image102();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image102() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image102 = (org.gwtbootstrap3.client.ui.Image) GWT.create(org.gwtbootstrap3.client.ui.Image.class);
      // Setup section.
      f_Image102.setWidth("250px");
      f_Image102.setUrl("images/garden6.jpg");
      f_Image102.setHeight("150px");


      return f_Image102;
    }

    /**
     * Getter for f_Br103 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br103() {
      return build_f_Br103();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br103() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br103 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br103;
    }

    /**
     * Getter for f_Br104 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br104() {
      return build_f_Br104();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br104() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br104 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br104;
    }

    /**
     * Getter for f_HTML105 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML105() {
      return build_f_HTML105();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML105() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML105 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML105.setHTML(template_html36().asString());
      f_HTML105.setStyleName("" + get_style().companyDetailsItemsHeadings() + "");


      return f_HTML105;
    }

    /**
     * Getter for f_Br106 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br106() {
      return build_f_Br106();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br106() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br106 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br106;
    }

    /**
     * Getter for f_HTML107 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML107() {
      return build_f_HTML107();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML107() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML107 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML107.setHTML(template_html37().asString());
      f_HTML107.setStyleName("" + get_style().companyDetailsContactUsItems() + "");


      return f_HTML107;
    }

    /**
     * Getter for f_HTML108 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML108() {
      return build_f_HTML108();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML108() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML108 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML108.setHTML(template_html38().asString());
      f_HTML108.setStyleName("" + get_style().companyDetailsContactUsItems() + "");


      return f_HTML108;
    }

    /**
     * Getter for f_HTML109 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML109() {
      return build_f_HTML109();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML109() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML109 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML109.setHTML(template_html39().asString());
      f_HTML109.setStyleName("" + get_style().companyDetailsContactUsItems() + "");


      return f_HTML109;
    }

    /**
     * Getter for f_HTML110 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML110() {
      return build_f_HTML110();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML110() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML110 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML110.setHTML(template_html40().asString());
      f_HTML110.setStyleName("" + get_style().companyDetailsContactUsItems() + "");


      return f_HTML110;
    }

    /**
     * Getter for f_Br111 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br111() {
      return build_f_Br111();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br111() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br111 = (org.gwtbootstrap3.client.ui.html.Br) GWT.create(org.gwtbootstrap3.client.ui.html.Br.class);
      // Setup section.


      return f_Br111;
    }

    /**
     * Getter for domId14Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId14Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId14Element() {
      return domId14Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId14Element() {
      // Creation section.
      domId14Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId14());
      // Setup section.


      return domId14Element;
    }

    /**
     * Getter for domId11Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for domId15 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId15;
    private java.lang.String get_domId15() {
      return domId15;
    }
    private java.lang.String build_domId15() {
      // Creation section.
      domId15 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId15;
    }

    /**
     * Getter for f_FooterView112 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView get_f_FooterView112() {
      return build_f_FooterView112();
    }
    private com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView build_f_FooterView112() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView f_FooterView112 = (com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView) GWT.create(com.sapientarrow.gwtapp.client.templates.templateGreen.FooterView.class);
      // Setup section.


      return f_FooterView112;
    }

    /**
     * Getter for domId15Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId15Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId15Element() {
      return domId15Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId15Element() {
      // Creation section.
      domId15Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId15());
      // Setup section.


      return domId15Element;
    }
  }
}
