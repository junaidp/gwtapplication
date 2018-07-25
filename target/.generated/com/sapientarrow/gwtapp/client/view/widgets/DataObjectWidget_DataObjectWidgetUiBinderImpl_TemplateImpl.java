package com.sapientarrow.gwtapp.client.view.widgets;

public class DataObjectWidget_DataObjectWidgetUiBinderImpl_TemplateImpl implements com.sapientarrow.gwtapp.client.view.widgets.DataObjectWidget_DataObjectWidgetUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0,java.lang.String arg1) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<div style='float:left; padding:5px'> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'></span> </div>  <div style='float:left;padding:5px'> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("'></span> </div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
