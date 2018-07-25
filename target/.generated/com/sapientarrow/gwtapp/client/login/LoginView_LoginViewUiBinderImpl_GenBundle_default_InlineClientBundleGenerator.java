package com.sapientarrow.gwtapp.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LoginView_LoginViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenBundle {
  private static LoginView_LoginViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new LoginView_LoginViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenCss_style() {
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
        return (".GBDND-TCFI{font-weight:" + ("bold")  + ";}");
      }
      public java.lang.String important() {
        return "GBDND-TCFI";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.sapientarrow.gwtapp.client.login.LoginView_LoginViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
