package com.sapientarrow.gwtapp.client.forgotpassword;

public class ForgotPasswordView_ForgotPasswordViewUiBinderImpl_TemplateImpl implements com.sapientarrow.gwtapp.client.forgotpassword.ForgotPasswordView_ForgotPasswordViewUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("Send activation link");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html2(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,java.lang.String arg3) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<body class='metro'> <div style='padding-left:40%; padding-top:10%'> <div class='padding20'> <form> <h4 class='text-light blue'>Forgot Password</h4> <div> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("'></span> </div> <div> <span class='mif-user prepend-icon'></span> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
sb.append("'></span> </div> <div> <span class='mif-lock prepend-icon'></span> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
sb.append("'></span> </div> <div class='form-actions'> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
sb.append("'></span> </div> </form> </div> </div>  </body>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
