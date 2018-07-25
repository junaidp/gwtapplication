package com.sapientarrow.gwtapp.client.templates.templateGreen;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TemplateGreenView_TemplateGreenViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenBundle {
  private static TemplateGreenView_TemplateGreenViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new TemplateGreenView_TemplateGreenViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GBDND-TCAL{text-align:" + ("left")  + ";style:" + ("\"display: inline\"")  + ";}.GBDND-TCCK{font-size:" + ("130%")  + ";}.GBDND-TCLK{color:" + ("#8cb32a")  + ";}.GBDND-TCHK{color:" + ("#8cb32a")  + ";font-size:" + ("xx-large")  + ";font-family:" + ("sans-serif")  + ";font-size:" + ("24px")  + ";line-height:" + ("48px")  + ";}.GBDND-TCDL{margin-top:" + ("10px")  + ";margin-bottom:") + (("20px")  + ";background-color:" + ("#efefed")  + ";}.GBDND-TCMK{margin-top:" + ("25px")  + ";}.GBDND-TCCL{margin-top:" + ("0")  + ";}.GBDND-TCNK,.GBDND-TCGK{color:" + ("white")  + ";}.GBDND-TCKK{background-color:" + ("#f6f7f4")  + ";}.GBDND-TCJK{background-color:" + ("#efefed")  + ";}.GBDND-TCIK{background-color:" + ("white")  + ";}.GBDND-TCOK{font-family:" + ("\"Lato\""+ ","+ " " +"sans-serif")  + ";font-weight:" + ("400")  + ";font-size:" + ("16px") ) + (";line-height:" + ("24px")  + ";color:" + ("#5e5e5e")  + ";}.GBDND-TCBL{font-family:" + ("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";text-align:" + ("center")  + ";border-bottom:" + ("0"+ " " +"none")  + ";margin-bottom:" + ("0")  + ";color:" + ("#8cb32a")  + ";font-size:" + ("36px")  + ";line-height:" + ("48px")  + ";font-weight:" + ("400")  + ";text-transform:") + (("uppercase")  + ";}.GBDND-TCEL{text-align:" + ("center")  + " !important;color:" + ("#8cb32a")  + ";font-family:" + ("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("18px")  + ";line-height:" + ("24px")  + ";margin-bottom:" + ("12px")  + ";font-weight:" + ("400")  + ";text-transform:" + ("uppercase")  + ";margin:" + ("0")  + ";text-rendering:" + ("optimizelegibility") ) + (";}.GBDND-TCFK{color:" + ("#8cb32a")  + ";font-family:" + ("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("18px")  + ";line-height:" + ("24px")  + ";margin-bottom:" + ("12px")  + ";font-weight:" + ("400")  + ";text-transform:" + ("uppercase")  + ";margin:" + ("0")  + ";text-rendering:" + ("optimizelegibility")  + ";}.GBDND-TCEK{color:" + ("#8cb32a")  + ";font-family:") + (("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("16px")  + ";font-weight:" + ("400")  + ";line-height:" + ("24px")  + ";margin-bottom:" + ("12px")  + ";margin-right:" + ("0")  + ";margin-left:" + ("0")  + ";margin-top:" + ("0")  + ";}.GBDND-TCDK{color:" + ("#5e5e5e")  + ";font-family:" + ("\"Lato\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("16px") ) + (";font-weight:" + ("400")  + ";line-height:" + ("24px")  + ";margin-bottom:" + ("12px")  + ";margin-right:" + ("0")  + ";margin-left:" + ("0")  + ";margin-top:" + ("0")  + ";}.GBDND-TCPK{text-align:" + ("center")  + " !important;color:" + ("#8cb32a")  + ";font-family:" + ("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("18px")  + ";line-height:") + (("24px")  + ";margin-bottom:" + ("12px")  + ";font-weight:" + ("400")  + ";text-transform:" + ("uppercase")  + ";margin:" + ("0")  + ";text-rendering:" + ("optimizelegibility")  + ";}")) : ((".GBDND-TCAL{text-align:" + ("right")  + ";style:" + ("\"display: inline\"")  + ";}.GBDND-TCCK{font-size:" + ("130%")  + ";}.GBDND-TCLK{color:" + ("#8cb32a")  + ";}.GBDND-TCHK{color:" + ("#8cb32a")  + ";font-size:" + ("xx-large")  + ";font-family:" + ("sans-serif")  + ";font-size:" + ("24px")  + ";line-height:" + ("48px")  + ";}.GBDND-TCDL{margin-top:" + ("10px")  + ";margin-bottom:") + (("20px")  + ";background-color:" + ("#efefed")  + ";}.GBDND-TCMK{margin-top:" + ("25px")  + ";}.GBDND-TCCL{margin-top:" + ("0")  + ";}.GBDND-TCNK,.GBDND-TCGK{color:" + ("white")  + ";}.GBDND-TCKK{background-color:" + ("#f6f7f4")  + ";}.GBDND-TCJK{background-color:" + ("#efefed")  + ";}.GBDND-TCIK{background-color:" + ("white")  + ";}.GBDND-TCOK{font-family:" + ("\"Lato\""+ ","+ " " +"sans-serif")  + ";font-weight:" + ("400")  + ";font-size:" + ("16px") ) + (";line-height:" + ("24px")  + ";color:" + ("#5e5e5e")  + ";}.GBDND-TCBL{font-family:" + ("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";text-align:" + ("center")  + ";border-bottom:" + ("0"+ " " +"none")  + ";margin-bottom:" + ("0")  + ";color:" + ("#8cb32a")  + ";font-size:" + ("36px")  + ";line-height:" + ("48px")  + ";font-weight:" + ("400")  + ";text-transform:") + (("uppercase")  + ";}.GBDND-TCEL{text-align:" + ("center")  + " !important;color:" + ("#8cb32a")  + ";font-family:" + ("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("18px")  + ";line-height:" + ("24px")  + ";margin-bottom:" + ("12px")  + ";font-weight:" + ("400")  + ";text-transform:" + ("uppercase")  + ";margin:" + ("0")  + ";text-rendering:" + ("optimizelegibility") ) + (";}.GBDND-TCFK{color:" + ("#8cb32a")  + ";font-family:" + ("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("18px")  + ";line-height:" + ("24px")  + ";margin-bottom:" + ("12px")  + ";font-weight:" + ("400")  + ";text-transform:" + ("uppercase")  + ";margin:" + ("0")  + ";text-rendering:" + ("optimizelegibility")  + ";}.GBDND-TCEK{color:" + ("#8cb32a")  + ";font-family:") + (("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("16px")  + ";font-weight:" + ("400")  + ";line-height:" + ("24px")  + ";margin-bottom:" + ("12px")  + ";margin-left:" + ("0")  + ";margin-right:" + ("0")  + ";margin-top:" + ("0")  + ";}.GBDND-TCDK{color:" + ("#5e5e5e")  + ";font-family:" + ("\"Lato\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("16px") ) + (";font-weight:" + ("400")  + ";line-height:" + ("24px")  + ";margin-bottom:" + ("12px")  + ";margin-left:" + ("0")  + ";margin-right:" + ("0")  + ";margin-top:" + ("0")  + ";}.GBDND-TCPK{text-align:" + ("center")  + " !important;color:" + ("#8cb32a")  + ";font-family:" + ("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("18px")  + ";line-height:") + (("24px")  + ";margin-bottom:" + ("12px")  + ";font-weight:" + ("400")  + ";text-transform:" + ("uppercase")  + ";margin:" + ("0")  + ";text-rendering:" + ("optimizelegibility")  + ";}"));
      }
      public java.lang.String bigFont() {
        return "GBDND-TCCK";
      }
      public java.lang.String companyDetailsContactUsItems() {
        return "GBDND-TCDK";
      }
      public java.lang.String companyDetailsItems() {
        return "GBDND-TCEK";
      }
      public java.lang.String companyDetailsItemsHeadings() {
        return "GBDND-TCFK";
      }
      public java.lang.String containerPanelColor() {
        return "GBDND-TCGK";
      }
      public java.lang.String heading() {
        return "GBDND-TCHK";
      }
      public java.lang.String innerMainPanelColorCompanyDetails() {
        return "GBDND-TCIK";
      }
      public java.lang.String innerMainPanelColorRecentWork() {
        return "GBDND-TCJK";
      }
      public java.lang.String innerMainPanelColorWhatWeDo() {
        return "GBDND-TCKK";
      }
      public java.lang.String listItemsColor() {
        return "GBDND-TCLK";
      }
      public java.lang.String mainPanelMargin() {
        return "GBDND-TCMK";
      }
      public java.lang.String outerMainPanelColor() {
        return "GBDND-TCNK";
      }
      public java.lang.String paragraphStyle() {
        return "GBDND-TCOK";
      }
      public java.lang.String readMore() {
        return "GBDND-TCPK";
      }
      public java.lang.String rightAlignInline() {
        return "GBDND-TCAL";
      }
      public java.lang.String sectionHeader() {
        return "GBDND-TCBL";
      }
      public java.lang.String sectionsPanelMargin() {
        return "GBDND-TCCL";
      }
      public java.lang.String showGrid() {
        return "GBDND-TCDL";
      }
      public java.lang.String textInfo() {
        return "GBDND-TCEL";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.sapientarrow.gwtapp.client.templates.templateGreen.TemplateGreenView_TemplateGreenViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
