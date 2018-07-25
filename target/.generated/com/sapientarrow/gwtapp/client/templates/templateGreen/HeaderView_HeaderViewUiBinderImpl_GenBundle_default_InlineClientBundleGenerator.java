package com.sapientarrow.gwtapp.client.templates.templateGreen;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class HeaderView_HeaderViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenBundle {
  private static HeaderView_HeaderViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new HeaderView_HeaderViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenCss_style() {
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
        return (".GBDND-TCCM{color:" + ("#8cb32a")  + ";font-family:" + ("\"Open Sans\""+ ","+ " " +"sans-serif")  + ";font-size:" + ("30px")  + ";font-style:" + ("normal")  + ";font-weight:" + ("400")  + ";line-height:" + ("30px")  + ";}.GBDND-TCEM{margin-top:" + ("25px")  + ";}.GBDND-TCDM{background-color:" + ("white")  + ";}");
      }
      public java.lang.String heading() {
        return "GBDND-TCCM";
      }
      public java.lang.String mainPanelColor() {
        return "GBDND-TCDM";
      }
      public java.lang.String mainPanelMargin() {
        return "GBDND-TCEM";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.sapientarrow.gwtapp.client.templates.templateGreen.HeaderView_HeaderViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
