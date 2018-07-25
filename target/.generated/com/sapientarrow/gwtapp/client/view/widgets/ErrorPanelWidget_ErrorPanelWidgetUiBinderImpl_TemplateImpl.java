package com.sapientarrow.gwtapp.client.view.widgets;

public class ErrorPanelWidget_ErrorPanelWidgetUiBinderImpl_TemplateImpl implements com.sapientarrow.gwtapp.client.view.widgets.ErrorPanelWidget_ErrorPanelWidgetUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1() {
    StringBuilder sb = new java.lang.StringBuilder();
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html2(java.lang.String arg0) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<div class='alert-box errorPanel'><span>error: </span>  <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("'></span>  </div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
