package com.sapientarrow.gwtapp.client.dashboard.MyDashboard;

public class RunTimeView_RunTimeViewUiBinderImpl_TemplateImpl implements com.sapientarrow.gwtapp.client.dashboard.MyDashboard.RunTimeView_RunTimeViewUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0,java.lang.String arg1) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'></span> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("'></span>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}