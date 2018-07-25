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

public class HeaderView_HeaderViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sapientarrow.gwtapp.client.view.HeaderView>, com.sapientarrow.gwtapp.client.view.HeaderView.HeaderViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
    @Template("Home")
    SafeHtml html2();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html3(String arg0);
     
    @Template("About Us")
    SafeHtml html4();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html5(String arg0);
     
    @Template("Templates")
    SafeHtml html6();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html7(String arg0);
     
    @Template("<span id='{0}'></span>")
    SafeHtml html8(String arg0);
     
    @Template("File Upload")
    SafeHtml html9();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html10(String arg0);
     
    @Template("JavaBean Editor")
    SafeHtml html11();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html12(String arg0);
     
    @Template("DynBean Editor")
    SafeHtml html13();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html14(String arg0);
     
    @Template("Bean Data Screen")
    SafeHtml html15();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html16(String arg0);
     
    @Template("DynBean Data Screen")
    SafeHtml html17();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html18(String arg0);
     
    @Template("Download Json")
    SafeHtml html19();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html20(String arg0);
     
    @Template("Global Preferences")
    SafeHtml html21();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html22(String arg0);
     
    @Template("Bindings")
    SafeHtml html23();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html24(String arg0);
     
    @Template("<head> <meta content='width=device-width, initial-scale=1' name='viewport'> <link href='http://www.w3schools.com/lib/w3.css' rel='stylesheet'> </head> <div style='float:left; padding-left:20px'> <span id='{0}'></span> </div>  <ul class='w3-navbar w3-card-2 w3-theme-l1'> <li> <span id='{1}'></span> </li> <li> <span id='{2}'></span> </li>  <li class='w3-dropdown-hover'> <span id='{3}'></span> </li>  <li class='w3-dropdown-hover'> <span id='{4}'></span> <a> <i class='fa fa-caret-down'></i> </a> <div class='w3-dropdown-content w3-white w3-card-4'> <span id='{5}'></span> <span id='{6}'></span> <span id='{7}'></span> <span id='{8}'></span> <span id='{9}'></span> <span id='{10}'></span> <span id='{11}'></span> <span id='{12}'></span> </div> </li> </ul>")
    SafeHtml html25(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sapientarrow.gwtapp.client.view.HeaderView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sapientarrow.gwtapp.client.view.HeaderView owner;


    public Widgets(final com.sapientarrow.gwtapp.client.view.HeaderView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId11();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId13();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId15();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId17();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId19();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId21();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId23();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId25();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId12();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId14();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId16();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId18();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId20();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId22();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId24();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId11Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId13Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId15Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId17Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId19Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId21Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId23Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId25Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId10Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId12Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId14Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId16Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId18Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId20Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId22Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId24Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId1());
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3(get_domId3());
    }
    SafeHtml template_html4() {
      return template.html4();
    }
    SafeHtml template_html5() {
      return template.html5(get_domId5());
    }
    SafeHtml template_html6() {
      return template.html6();
    }
    SafeHtml template_html7() {
      return template.html7(get_domId7());
    }
    SafeHtml template_html8() {
      return template.html8(get_domId9());
    }
    SafeHtml template_html9() {
      return template.html9();
    }
    SafeHtml template_html10() {
      return template.html10(get_domId11());
    }
    SafeHtml template_html11() {
      return template.html11();
    }
    SafeHtml template_html12() {
      return template.html12(get_domId13());
    }
    SafeHtml template_html13() {
      return template.html13();
    }
    SafeHtml template_html14() {
      return template.html14(get_domId15());
    }
    SafeHtml template_html15() {
      return template.html15();
    }
    SafeHtml template_html16() {
      return template.html16(get_domId17());
    }
    SafeHtml template_html17() {
      return template.html17();
    }
    SafeHtml template_html18() {
      return template.html18(get_domId19());
    }
    SafeHtml template_html19() {
      return template.html19();
    }
    SafeHtml template_html20() {
      return template.html20(get_domId21());
    }
    SafeHtml template_html21() {
      return template.html21();
    }
    SafeHtml template_html22() {
      return template.html22(get_domId23());
    }
    SafeHtml template_html23() {
      return template.html23();
    }
    SafeHtml template_html24() {
      return template.html24(get_domId25());
    }
    SafeHtml template_html25() {
      return template.html25(get_domId0(), get_domId2(), get_domId4(), get_domId6(), get_domId8(), get_domId10(), get_domId12(), get_domId14(), get_domId16(), get_domId18(), get_domId20(), get_domId22(), get_domId24());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.view.HeaderView_HeaderViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.sapientarrow.gwtapp.client.view.HeaderView_HeaderViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.view.HeaderView_HeaderViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sapientarrow.gwtapp.client.view.HeaderView_HeaderViewUiBinderImpl_GenBundle) GWT.create(com.sapientarrow.gwtapp.client.view.HeaderView_HeaderViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sapientarrow.gwtapp.client.view.HeaderView_HeaderViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.sapientarrow.gwtapp.client.view.HeaderView_HeaderViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.sapientarrow.gwtapp.client.view.HeaderView_HeaderViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html25().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord159 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId2Element().get();
      get_domId4Element().get();
      get_domId6Element().get();
      get_domId8Element().get();
      get_domId10Element().get();
      get_domId12Element().get();
      get_domId14Element().get();
      get_domId16Element().get();
      get_domId18Element().get();
      get_domId20Element().get();
      get_domId22Element().get();
      get_domId24Element().get();

      // Detach section.
      attachRecord159.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel3(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel4(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel5(), get_domId6Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel6(), get_domId8Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel7(), get_domId10Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel8(), get_domId12Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel9(), get_domId14Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel10(), get_domId16Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel11(), get_domId18Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel12(), get_domId20Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel13(), get_domId22Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel14(), get_domId24Element().get());

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
     * Getter for f_HTMLPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel2() {
      return build_f_HTMLPanel2();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord160 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
      get_domId1Element().get();

      // Detach section.
      attachRecord160.detach();
      f_HTMLPanel2.addAndReplaceElement(get_imgLogo(), get_domId1Element().get());

      return f_HTMLPanel2;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for imgLogo called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Image get_imgLogo() {
      return build_imgLogo();
    }
    private com.google.gwt.user.client.ui.Image build_imgLogo() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image imgLogo = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.
      imgLogo.setUrl("");


      this.owner.imgLogo = imgLogo;

      return imgLogo;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for f_HTMLPanel3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel3() {
      return build_f_HTMLPanel3();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel3 = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord161 = UiBinderUtil.attachToDom(f_HTMLPanel3.getElement());
      get_domId3Element().get();

      // Detach section.
      attachRecord161.detach();
      f_HTMLPanel3.addAndReplaceElement(get_menuHome(), get_domId3Element().get());

      return f_HTMLPanel3;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for menuHome called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_menuHome() {
      return build_menuHome();
    }
    private com.google.gwt.user.client.ui.Anchor build_menuHome() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor menuHome = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      menuHome.setHTML(template_html2().asString());
      menuHome.setStyleName("point");


      this.owner.menuHome = menuHome;

      return menuHome;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for f_HTMLPanel4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel4() {
      return build_f_HTMLPanel4();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel4 = new com.google.gwt.user.client.ui.HTMLPanel(template_html5().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord162 = UiBinderUtil.attachToDom(f_HTMLPanel4.getElement());
      get_domId5Element().get();

      // Detach section.
      attachRecord162.detach();
      f_HTMLPanel4.addAndReplaceElement(get_menuAboutUs(), get_domId5Element().get());

      return f_HTMLPanel4;
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
     * Getter for menuAboutUs called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_menuAboutUs() {
      return build_menuAboutUs();
    }
    private com.google.gwt.user.client.ui.Anchor build_menuAboutUs() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor menuAboutUs = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      menuAboutUs.setHTML(template_html4().asString());
      menuAboutUs.setStyleName("point");


      return menuAboutUs;
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
     * Getter for f_HTMLPanel5 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel5() {
      return build_f_HTMLPanel5();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel5 = new com.google.gwt.user.client.ui.HTMLPanel(template_html7().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord163 = UiBinderUtil.attachToDom(f_HTMLPanel5.getElement());
      get_domId7Element().get();

      // Detach section.
      attachRecord163.detach();
      f_HTMLPanel5.addAndReplaceElement(get_menuTemplates(), get_domId7Element().get());

      return f_HTMLPanel5;
    }

    /**
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for menuTemplates called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_menuTemplates() {
      return build_menuTemplates();
    }
    private com.google.gwt.user.client.ui.Anchor build_menuTemplates() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor menuTemplates = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      menuTemplates.setHTML(template_html6().asString());
      menuTemplates.setStyleName("point");


      this.owner.menuTemplates = menuTemplates;

      return menuTemplates;
    }

    /**
     * Getter for domId7Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for f_HTMLPanel6 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel6() {
      return build_f_HTMLPanel6();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel6 = new com.google.gwt.user.client.ui.HTMLPanel(template_html8().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord164 = UiBinderUtil.attachToDom(f_HTMLPanel6.getElement());
      get_domId9Element().get();

      // Detach section.
      attachRecord164.detach();
      f_HTMLPanel6.addAndReplaceElement(get_menuUser(), get_domId9Element().get());

      return f_HTMLPanel6;
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
     * Getter for menuUser called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_menuUser() {
      return build_menuUser();
    }
    private com.google.gwt.user.client.ui.Anchor build_menuUser() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor menuUser = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      menuUser.setStyleName("point");


      this.owner.menuUser = menuUser;

      return menuUser;
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
     * Getter for f_HTMLPanel7 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel7() {
      return build_f_HTMLPanel7();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel7 = new com.google.gwt.user.client.ui.HTMLPanel(template_html10().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord165 = UiBinderUtil.attachToDom(f_HTMLPanel7.getElement());
      get_domId11Element().get();

      // Detach section.
      attachRecord165.detach();
      f_HTMLPanel7.addAndReplaceElement(get_ancFileUpload(), get_domId11Element().get());

      return f_HTMLPanel7;
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
     * Getter for ancFileUpload called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancFileUpload() {
      return build_ancFileUpload();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancFileUpload() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancFileUpload = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancFileUpload.setHTML(template_html9().asString());
      ancFileUpload.setStyleName("hover");
      ancFileUpload.setWordWrap(false);


      this.owner.ancFileUpload = ancFileUpload;

      return ancFileUpload;
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
     * Getter for f_HTMLPanel8 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel8() {
      return build_f_HTMLPanel8();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel8 = new com.google.gwt.user.client.ui.HTMLPanel(template_html12().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord166 = UiBinderUtil.attachToDom(f_HTMLPanel8.getElement());
      get_domId13Element().get();

      // Detach section.
      attachRecord166.detach();
      f_HTMLPanel8.addAndReplaceElement(get_ancJavaBeanEditor(), get_domId13Element().get());

      return f_HTMLPanel8;
    }

    /**
     * Getter for domId13 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for ancJavaBeanEditor called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancJavaBeanEditor() {
      return build_ancJavaBeanEditor();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancJavaBeanEditor() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancJavaBeanEditor = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancJavaBeanEditor.setHTML(template_html11().asString());
      ancJavaBeanEditor.setStyleName("hover");
      ancJavaBeanEditor.setWordWrap(false);


      this.owner.ancJavaBeanEditor = ancJavaBeanEditor;

      return ancJavaBeanEditor;
    }

    /**
     * Getter for domId13Element called 2 times. Type: DEFAULT. Build precedence: 3.
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

    /**
     * Getter for domId14 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_HTMLPanel9 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel9() {
      return build_f_HTMLPanel9();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel9 = new com.google.gwt.user.client.ui.HTMLPanel(template_html14().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord167 = UiBinderUtil.attachToDom(f_HTMLPanel9.getElement());
      get_domId15Element().get();

      // Detach section.
      attachRecord167.detach();
      f_HTMLPanel9.addAndReplaceElement(get_ancDynamicBeanEditor(), get_domId15Element().get());

      return f_HTMLPanel9;
    }

    /**
     * Getter for domId15 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for ancDynamicBeanEditor called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancDynamicBeanEditor() {
      return build_ancDynamicBeanEditor();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancDynamicBeanEditor() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancDynamicBeanEditor = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancDynamicBeanEditor.setHTML(template_html13().asString());
      ancDynamicBeanEditor.setStyleName("hover");
      ancDynamicBeanEditor.setWordWrap(false);


      this.owner.ancDynamicBeanEditor = ancDynamicBeanEditor;

      return ancDynamicBeanEditor;
    }

    /**
     * Getter for domId15Element called 2 times. Type: DEFAULT. Build precedence: 3.
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

    /**
     * Getter for domId14Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId16 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId16;
    private java.lang.String get_domId16() {
      return domId16;
    }
    private java.lang.String build_domId16() {
      // Creation section.
      domId16 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId16;
    }

    /**
     * Getter for f_HTMLPanel10 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel10() {
      return build_f_HTMLPanel10();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel10 = new com.google.gwt.user.client.ui.HTMLPanel(template_html16().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord168 = UiBinderUtil.attachToDom(f_HTMLPanel10.getElement());
      get_domId17Element().get();

      // Detach section.
      attachRecord168.detach();
      f_HTMLPanel10.addAndReplaceElement(get_ancBeanData(), get_domId17Element().get());

      return f_HTMLPanel10;
    }

    /**
     * Getter for domId17 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId17;
    private java.lang.String get_domId17() {
      return domId17;
    }
    private java.lang.String build_domId17() {
      // Creation section.
      domId17 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId17;
    }

    /**
     * Getter for ancBeanData called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancBeanData() {
      return build_ancBeanData();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancBeanData() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancBeanData = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancBeanData.setHTML(template_html15().asString());
      ancBeanData.setStyleName("hover");
      ancBeanData.setWordWrap(false);


      this.owner.ancBeanData = ancBeanData;

      return ancBeanData;
    }

    /**
     * Getter for domId17Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId17Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId17Element() {
      return domId17Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId17Element() {
      // Creation section.
      domId17Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId17());
      // Setup section.


      return domId17Element;
    }

    /**
     * Getter for domId16Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId16Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId16Element() {
      return domId16Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId16Element() {
      // Creation section.
      domId16Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId16());
      // Setup section.


      return domId16Element;
    }

    /**
     * Getter for domId18 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId18;
    private java.lang.String get_domId18() {
      return domId18;
    }
    private java.lang.String build_domId18() {
      // Creation section.
      domId18 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId18;
    }

    /**
     * Getter for f_HTMLPanel11 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel11() {
      return build_f_HTMLPanel11();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel11() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel11 = new com.google.gwt.user.client.ui.HTMLPanel(template_html18().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord169 = UiBinderUtil.attachToDom(f_HTMLPanel11.getElement());
      get_domId19Element().get();

      // Detach section.
      attachRecord169.detach();
      f_HTMLPanel11.addAndReplaceElement(get_ancDynamicBeanData(), get_domId19Element().get());

      return f_HTMLPanel11;
    }

    /**
     * Getter for domId19 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId19;
    private java.lang.String get_domId19() {
      return domId19;
    }
    private java.lang.String build_domId19() {
      // Creation section.
      domId19 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId19;
    }

    /**
     * Getter for ancDynamicBeanData called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancDynamicBeanData() {
      return build_ancDynamicBeanData();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancDynamicBeanData() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancDynamicBeanData = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancDynamicBeanData.setHTML(template_html17().asString());
      ancDynamicBeanData.setStyleName("hover");
      ancDynamicBeanData.setWordWrap(false);


      this.owner.ancDynamicBeanData = ancDynamicBeanData;

      return ancDynamicBeanData;
    }

    /**
     * Getter for domId19Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId19Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId19Element() {
      return domId19Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId19Element() {
      // Creation section.
      domId19Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId19());
      // Setup section.


      return domId19Element;
    }

    /**
     * Getter for domId18Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId18Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId18Element() {
      return domId18Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId18Element() {
      // Creation section.
      domId18Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId18());
      // Setup section.


      return domId18Element;
    }

    /**
     * Getter for domId20 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId20;
    private java.lang.String get_domId20() {
      return domId20;
    }
    private java.lang.String build_domId20() {
      // Creation section.
      domId20 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId20;
    }

    /**
     * Getter for f_HTMLPanel12 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel12() {
      return build_f_HTMLPanel12();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel12() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel12 = new com.google.gwt.user.client.ui.HTMLPanel(template_html20().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord170 = UiBinderUtil.attachToDom(f_HTMLPanel12.getElement());
      get_domId21Element().get();

      // Detach section.
      attachRecord170.detach();
      f_HTMLPanel12.addAndReplaceElement(get_ancDownloadJson(), get_domId21Element().get());

      return f_HTMLPanel12;
    }

    /**
     * Getter for domId21 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId21;
    private java.lang.String get_domId21() {
      return domId21;
    }
    private java.lang.String build_domId21() {
      // Creation section.
      domId21 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId21;
    }

    /**
     * Getter for ancDownloadJson called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancDownloadJson() {
      return build_ancDownloadJson();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancDownloadJson() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancDownloadJson = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancDownloadJson.setHTML(template_html19().asString());
      ancDownloadJson.setStyleName("hover");
      ancDownloadJson.setWordWrap(false);


      this.owner.ancDownloadJson = ancDownloadJson;

      return ancDownloadJson;
    }

    /**
     * Getter for domId21Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId21Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId21Element() {
      return domId21Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId21Element() {
      // Creation section.
      domId21Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId21());
      // Setup section.


      return domId21Element;
    }

    /**
     * Getter for domId20Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId20Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId20Element() {
      return domId20Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId20Element() {
      // Creation section.
      domId20Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId20());
      // Setup section.


      return domId20Element;
    }

    /**
     * Getter for domId22 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId22;
    private java.lang.String get_domId22() {
      return domId22;
    }
    private java.lang.String build_domId22() {
      // Creation section.
      domId22 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId22;
    }

    /**
     * Getter for f_HTMLPanel13 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel13() {
      return build_f_HTMLPanel13();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel13() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel13 = new com.google.gwt.user.client.ui.HTMLPanel(template_html22().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord171 = UiBinderUtil.attachToDom(f_HTMLPanel13.getElement());
      get_domId23Element().get();

      // Detach section.
      attachRecord171.detach();
      f_HTMLPanel13.addAndReplaceElement(get_ancGlobalPreferences(), get_domId23Element().get());

      return f_HTMLPanel13;
    }

    /**
     * Getter for domId23 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId23;
    private java.lang.String get_domId23() {
      return domId23;
    }
    private java.lang.String build_domId23() {
      // Creation section.
      domId23 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId23;
    }

    /**
     * Getter for ancGlobalPreferences called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancGlobalPreferences() {
      return build_ancGlobalPreferences();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancGlobalPreferences() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancGlobalPreferences = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancGlobalPreferences.setHTML(template_html21().asString());
      ancGlobalPreferences.setStyleName("hover");
      ancGlobalPreferences.setWordWrap(false);


      this.owner.ancGlobalPreferences = ancGlobalPreferences;

      return ancGlobalPreferences;
    }

    /**
     * Getter for domId23Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId23Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId23Element() {
      return domId23Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId23Element() {
      // Creation section.
      domId23Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId23());
      // Setup section.


      return domId23Element;
    }

    /**
     * Getter for domId22Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId22Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId22Element() {
      return domId22Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId22Element() {
      // Creation section.
      domId22Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId22());
      // Setup section.


      return domId22Element;
    }

    /**
     * Getter for domId24 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId24;
    private java.lang.String get_domId24() {
      return domId24;
    }
    private java.lang.String build_domId24() {
      // Creation section.
      domId24 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId24;
    }

    /**
     * Getter for f_HTMLPanel14 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel14() {
      return build_f_HTMLPanel14();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel14() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel14 = new com.google.gwt.user.client.ui.HTMLPanel(template_html24().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord172 = UiBinderUtil.attachToDom(f_HTMLPanel14.getElement());
      get_domId25Element().get();

      // Detach section.
      attachRecord172.detach();
      f_HTMLPanel14.addAndReplaceElement(get_ancBindings(), get_domId25Element().get());

      return f_HTMLPanel14;
    }

    /**
     * Getter for domId25 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId25;
    private java.lang.String get_domId25() {
      return domId25;
    }
    private java.lang.String build_domId25() {
      // Creation section.
      domId25 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId25;
    }

    /**
     * Getter for ancBindings called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Anchor get_ancBindings() {
      return build_ancBindings();
    }
    private com.google.gwt.user.client.ui.Anchor build_ancBindings() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor ancBindings = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      ancBindings.setHTML(template_html23().asString());
      ancBindings.setStyleName("hover");
      ancBindings.setWordWrap(false);


      this.owner.ancBindings = ancBindings;

      return ancBindings;
    }

    /**
     * Getter for domId25Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId25Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId25Element() {
      return domId25Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId25Element() {
      // Creation section.
      domId25Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId25());
      // Setup section.


      return domId25Element;
    }

    /**
     * Getter for domId24Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId24Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId24Element() {
      return domId24Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId24Element() {
      // Creation section.
      domId24Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId24());
      // Setup section.


      return domId24Element;
    }
  }
}
