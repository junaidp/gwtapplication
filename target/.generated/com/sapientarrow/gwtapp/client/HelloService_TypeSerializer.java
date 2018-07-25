package com.sapientarrow.gwtapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class HelloService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMapNative;
  private static final JsArrayString signatureMapNative;
  
  static {
    methodMapNative = loadMethodsNative();
    signatureMapNative = loadSignaturesNative();
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException/2761891166"] = [
        @com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/github/nmorel/gwtjackson/client/exception/JsonDeserializationException;),
        @com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/github/nmorel/gwtjackson/client/exception/JsonDeserializationException;)
      ];
    
    result["com.github.nmorel.gwtjackson.client.exception.JsonMappingException/1609301265"] = [
        @com.github.nmorel.gwtjackson.client.exception.JsonMappingException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.github.nmorel.gwtjackson.client.exception.JsonMappingException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/github/nmorel/gwtjackson/client/exception/JsonMappingException;),
        @com.github.nmorel.gwtjackson.client.exception.JsonMappingException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/github/nmorel/gwtjackson/client/exception/JsonMappingException;)
      ];
    
    result["com.github.nmorel.gwtjackson.client.exception.JsonSerializationException/1192494644"] = [
        @com.github.nmorel.gwtjackson.client.exception.JsonSerializationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.github.nmorel.gwtjackson.client.exception.JsonSerializationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/github/nmorel/gwtjackson/client/exception/JsonSerializationException;),
        @com.github.nmorel.gwtjackson.client.exception.JsonSerializationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/github/nmorel/gwtjackson/client/exception/JsonSerializationException;)
      ];
    
    result["com.github.nmorel.gwtjackson.client.stream.JsonToken/3241000856"] = [
        @com.github.nmorel.gwtjackson.client.stream.JsonToken_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.github.nmorel.gwtjackson.client.stream.JsonToken_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/github/nmorel/gwtjackson/client/stream/JsonToken;),
        @com.github.nmorel.gwtjackson.client.stream.JsonToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/github/nmorel/gwtjackson/client/stream/JsonToken;)
      ];
    
    result["com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException/2002326338"] = [
        @com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/github/nmorel/gwtjackson/client/stream/impl/MalformedJsonException;),
        @com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/github/nmorel/gwtjackson/client/stream/impl/MalformedJsonException;)
      ];
    
    result["com.google.gwt.aria.client.AutocompleteValue/1925551446"] = [
        @com.google.gwt.aria.client.AutocompleteValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.AutocompleteValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/AutocompleteValue;),
        @com.google.gwt.aria.client.AutocompleteValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/AutocompleteValue;)
      ];
    
    result["com.google.gwt.aria.client.CheckedValue/768347454"] = [
        @com.google.gwt.aria.client.CheckedValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.CheckedValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/CheckedValue;),
        @com.google.gwt.aria.client.CheckedValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/CheckedValue;)
      ];
    
    result["com.google.gwt.aria.client.DropeffectValue/3176917350"] = [
        @com.google.gwt.aria.client.DropeffectValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.DropeffectValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/DropeffectValue;),
        @com.google.gwt.aria.client.DropeffectValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/DropeffectValue;)
      ];
    
    result["com.google.gwt.aria.client.ExpandedValue/3762568014"] = [
        @com.google.gwt.aria.client.ExpandedValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.ExpandedValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/ExpandedValue;),
        @com.google.gwt.aria.client.ExpandedValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/ExpandedValue;)
      ];
    
    result["com.google.gwt.aria.client.GrabbedValue/331842861"] = [
        @com.google.gwt.aria.client.GrabbedValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.GrabbedValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/GrabbedValue;),
        @com.google.gwt.aria.client.GrabbedValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/GrabbedValue;)
      ];
    
    result["com.google.gwt.aria.client.InvalidValue/1948907690"] = [
        @com.google.gwt.aria.client.InvalidValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.InvalidValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/InvalidValue;),
        @com.google.gwt.aria.client.InvalidValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/InvalidValue;)
      ];
    
    result["com.google.gwt.aria.client.LiveValue/3541140001"] = [
        @com.google.gwt.aria.client.LiveValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.LiveValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/LiveValue;),
        @com.google.gwt.aria.client.LiveValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/LiveValue;)
      ];
    
    result["com.google.gwt.aria.client.OrientationValue/3117542483"] = [
        @com.google.gwt.aria.client.OrientationValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.OrientationValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/OrientationValue;),
        @com.google.gwt.aria.client.OrientationValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/OrientationValue;)
      ];
    
    result["com.google.gwt.aria.client.PressedValue/4264355363"] = [
        @com.google.gwt.aria.client.PressedValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.PressedValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/PressedValue;),
        @com.google.gwt.aria.client.PressedValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/PressedValue;)
      ];
    
    result["com.google.gwt.aria.client.RelevantValue/115378802"] = [
        @com.google.gwt.aria.client.RelevantValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.RelevantValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/RelevantValue;),
        @com.google.gwt.aria.client.RelevantValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/RelevantValue;)
      ];
    
    result["com.google.gwt.aria.client.SelectedValue/3013847655"] = [
        @com.google.gwt.aria.client.SelectedValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.SelectedValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/SelectedValue;),
        @com.google.gwt.aria.client.SelectedValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/SelectedValue;)
      ];
    
    result["com.google.gwt.aria.client.SortValue/3178211337"] = [
        @com.google.gwt.aria.client.SortValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.aria.client.SortValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/aria/client/SortValue;),
        @com.google.gwt.aria.client.SortValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/aria/client/SortValue;)
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$Composite/18929677"] = [
        @com.google.gwt.canvas.dom.client.Context2d_Composite_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_Composite_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$Composite;),
        @com.google.gwt.canvas.dom.client.Context2d_Composite_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/canvas/dom/client/Context2d$Composite;)
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$LineCap/429792263"] = [
        @com.google.gwt.canvas.dom.client.Context2d_LineCap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_LineCap_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$LineCap;),
        @com.google.gwt.canvas.dom.client.Context2d_LineCap_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/canvas/dom/client/Context2d$LineCap;)
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$LineJoin/2210915141"] = [
        @com.google.gwt.canvas.dom.client.Context2d_LineJoin_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_LineJoin_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$LineJoin;),
        @com.google.gwt.canvas.dom.client.Context2d_LineJoin_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/canvas/dom/client/Context2d$LineJoin;)
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$Repetition/4129637252"] = [
        @com.google.gwt.canvas.dom.client.Context2d_Repetition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_Repetition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$Repetition;),
        @com.google.gwt.canvas.dom.client.Context2d_Repetition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/canvas/dom/client/Context2d$Repetition;)
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$TextAlign/2376656572"] = [
        @com.google.gwt.canvas.dom.client.Context2d_TextAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_TextAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$TextAlign;),
        @com.google.gwt.canvas.dom.client.Context2d_TextAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/canvas/dom/client/Context2d$TextAlign;)
      ];
    
    result["com.google.gwt.canvas.dom.client.Context2d$TextBaseline/658509555"] = [
        @com.google.gwt.canvas.dom.client.Context2d_TextBaseline_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.canvas.dom.client.Context2d_TextBaseline_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/canvas/dom/client/Context2d$TextBaseline;),
        @com.google.gwt.canvas.dom.client.Context2d_TextBaseline_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/canvas/dom/client/Context2d$TextBaseline;)
      ];
    
    result["com.google.gwt.cell.client.ButtonCellBase$Decoration/4176385646"] = [
        @com.google.gwt.cell.client.ButtonCellBase_Decoration_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.cell.client.ButtonCellBase_Decoration_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/cell/client/ButtonCellBase$Decoration;),
        @com.google.gwt.cell.client.ButtonCellBase_Decoration_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/cell/client/ButtonCellBase$Decoration;)
      ];
    
    result["com.google.gwt.core.client.CodeDownloadException$Reason/1932184584"] = [
        @com.google.gwt.core.client.CodeDownloadException_Reason_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.core.client.CodeDownloadException_Reason_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/core/client/CodeDownloadException$Reason;),
        @com.google.gwt.core.client.CodeDownloadException_Reason_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/core/client/CodeDownloadException$Reason;)
      ];
    
    result["com.google.gwt.core.client.impl.SerializableThrowable/3563828140"] = [
        @com.google.gwt.core.client.impl.SerializableThrowable_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.core.client.impl.SerializableThrowable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/core/client/impl/SerializableThrowable;),
        @com.google.gwt.core.client.impl.SerializableThrowable_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/core/client/impl/SerializableThrowable;)
      ];
    
    result["com.google.gwt.core.shared.SerializableThrowable/2791287161"] = [
        @com.google.gwt.user.client.rpc.core.com.google.gwt.core.shared.SerializableThrowable_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.com.google.gwt.core.shared.SerializableThrowable_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/core/shared/SerializableThrowable;),
        @com.google.gwt.user.client.rpc.core.com.google.gwt.core.shared.SerializableThrowable_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/core/shared/SerializableThrowable;)
      ];
    
    result["com.google.gwt.dom.client.Style$BorderStyle/3150101049"] = [
        @com.google.gwt.dom.client.Style_BorderStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_BorderStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$BorderStyle;),
        @com.google.gwt.dom.client.Style_BorderStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$BorderStyle;)
      ];
    
    result["com.google.gwt.dom.client.Style$Clear/2112927382"] = [
        @com.google.gwt.dom.client.Style_Clear_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Clear_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Clear;),
        @com.google.gwt.dom.client.Style_Clear_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$Clear;)
      ];
    
    result["com.google.gwt.dom.client.Style$Cursor/1026777009"] = [
        @com.google.gwt.dom.client.Style_Cursor_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Cursor_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Cursor;),
        @com.google.gwt.dom.client.Style_Cursor_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$Cursor;)
      ];
    
    result["com.google.gwt.dom.client.Style$Display/723716105"] = [
        @com.google.gwt.dom.client.Style_Display_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Display_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Display;),
        @com.google.gwt.dom.client.Style_Display_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$Display;)
      ];
    
    result["com.google.gwt.dom.client.Style$Float/1707775544"] = [
        @com.google.gwt.dom.client.Style_Float_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Float_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Float;),
        @com.google.gwt.dom.client.Style_Float_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$Float;)
      ];
    
    result["com.google.gwt.dom.client.Style$FontStyle/4060934115"] = [
        @com.google.gwt.dom.client.Style_FontStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_FontStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$FontStyle;),
        @com.google.gwt.dom.client.Style_FontStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$FontStyle;)
      ];
    
    result["com.google.gwt.dom.client.Style$FontWeight/33706534"] = [
        @com.google.gwt.dom.client.Style_FontWeight_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_FontWeight_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$FontWeight;),
        @com.google.gwt.dom.client.Style_FontWeight_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$FontWeight;)
      ];
    
    result["com.google.gwt.dom.client.Style$ListStyleType/3802079421"] = [
        @com.google.gwt.dom.client.Style_ListStyleType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_ListStyleType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$ListStyleType;),
        @com.google.gwt.dom.client.Style_ListStyleType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$ListStyleType;)
      ];
    
    result["com.google.gwt.dom.client.Style$OutlineStyle/1758908680"] = [
        @com.google.gwt.dom.client.Style_OutlineStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_OutlineStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$OutlineStyle;),
        @com.google.gwt.dom.client.Style_OutlineStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$OutlineStyle;)
      ];
    
    result["com.google.gwt.dom.client.Style$Overflow/356058891"] = [
        @com.google.gwt.dom.client.Style_Overflow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Overflow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Overflow;),
        @com.google.gwt.dom.client.Style_Overflow_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$Overflow;)
      ];
    
    result["com.google.gwt.dom.client.Style$Position/2832938336"] = [
        @com.google.gwt.dom.client.Style_Position_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Position_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Position;),
        @com.google.gwt.dom.client.Style_Position_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$Position;)
      ];
    
    result["com.google.gwt.dom.client.Style$TableLayout/2147313447"] = [
        @com.google.gwt.dom.client.Style_TableLayout_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_TableLayout_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$TableLayout;),
        @com.google.gwt.dom.client.Style_TableLayout_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$TableLayout;)
      ];
    
    result["com.google.gwt.dom.client.Style$TextAlign/1644464014"] = [
        @com.google.gwt.dom.client.Style_TextAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_TextAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$TextAlign;),
        @com.google.gwt.dom.client.Style_TextAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$TextAlign;)
      ];
    
    result["com.google.gwt.dom.client.Style$TextDecoration/3728028595"] = [
        @com.google.gwt.dom.client.Style_TextDecoration_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_TextDecoration_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$TextDecoration;),
        @com.google.gwt.dom.client.Style_TextDecoration_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$TextDecoration;)
      ];
    
    result["com.google.gwt.dom.client.Style$TextJustify/743471844"] = [
        @com.google.gwt.dom.client.Style_TextJustify_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_TextJustify_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$TextJustify;),
        @com.google.gwt.dom.client.Style_TextJustify_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$TextJustify;)
      ];
    
    result["com.google.gwt.dom.client.Style$TextOverflow/4060207849"] = [
        @com.google.gwt.dom.client.Style_TextOverflow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_TextOverflow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$TextOverflow;),
        @com.google.gwt.dom.client.Style_TextOverflow_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$TextOverflow;)
      ];
    
    result["com.google.gwt.dom.client.Style$TextTransform/3353539122"] = [
        @com.google.gwt.dom.client.Style_TextTransform_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_TextTransform_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$TextTransform;),
        @com.google.gwt.dom.client.Style_TextTransform_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$TextTransform;)
      ];
    
    result["com.google.gwt.dom.client.Style$Unit/84355486"] = [
        @com.google.gwt.dom.client.Style_Unit_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Unit_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Unit;),
        @com.google.gwt.dom.client.Style_Unit_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$Unit;)
      ];
    
    result["com.google.gwt.dom.client.Style$VerticalAlign/3048118721"] = [
        @com.google.gwt.dom.client.Style_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$VerticalAlign;),
        @com.google.gwt.dom.client.Style_VerticalAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$VerticalAlign;)
      ];
    
    result["com.google.gwt.dom.client.Style$Visibility/3536973088"] = [
        @com.google.gwt.dom.client.Style_Visibility_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_Visibility_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$Visibility;),
        @com.google.gwt.dom.client.Style_Visibility_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$Visibility;)
      ];
    
    result["com.google.gwt.dom.client.Style$WhiteSpace/3895437819"] = [
        @com.google.gwt.dom.client.Style_WhiteSpace_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.dom.client.Style_WhiteSpace_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/dom/client/Style$WhiteSpace;),
        @com.google.gwt.dom.client.Style_WhiteSpace_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/dom/client/Style$WhiteSpace;)
      ];
    
    result["com.google.gwt.event.shared.UmbrellaException/3104463596"] = [
        @com.google.gwt.event.shared.UmbrellaException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.event.shared.UmbrellaException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/event/shared/UmbrellaException;),
        @com.google.gwt.event.shared.UmbrellaException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/event/shared/UmbrellaException;)
      ];
    
    result["com.google.gwt.http.client.RequestException/190587325"] = [
        @com.google.gwt.http.client.RequestException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.http.client.RequestException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/http/client/RequestException;),
        @com.google.gwt.http.client.RequestException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/http/client/RequestException;)
      ];
    
    result["com.google.gwt.i18n.client.DateTimeFormat$PredefinedFormat/3956695956"] = [
        @com.google.gwt.i18n.client.DateTimeFormat_PredefinedFormat_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.DateTimeFormat_PredefinedFormat_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/DateTimeFormat$PredefinedFormat;),
        @com.google.gwt.i18n.client.DateTimeFormat_PredefinedFormat_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/DateTimeFormat$PredefinedFormat;)
      ];
    
    result["com.google.gwt.i18n.client.HasDirection$Direction/586671123"] = [
        @com.google.gwt.i18n.client.HasDirection_Direction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.HasDirection_Direction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/HasDirection$Direction;),
        @com.google.gwt.i18n.client.HasDirection_Direction_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/HasDirection$Direction;)
      ];
    
    result["com.google.gwt.i18n.shared.DateTimeFormat$PredefinedFormat/77296891"] = [
        @com.google.gwt.i18n.shared.DateTimeFormat_PredefinedFormat_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.shared.DateTimeFormat_PredefinedFormat_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/shared/DateTimeFormat$PredefinedFormat;),
        @com.google.gwt.i18n.shared.DateTimeFormat_PredefinedFormat_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/shared/DateTimeFormat$PredefinedFormat;)
      ];
    
    result["com.google.gwt.i18n.shared.impl.DateRecord/3375188634"] = [
        @com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/shared/impl/DateRecord;),
        @com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/shared/impl/DateRecord;)
      ];
    
    result["com.google.gwt.json.client.JSONException/2941795468"] = [
        @com.google.gwt.json.client.JSONException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.json.client.JSONException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/json/client/JSONException;),
        @com.google.gwt.json.client.JSONException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/json/client/JSONException;)
      ];
    
    result["com.google.gwt.jsonp.client.TimeoutException/1112787596"] = [
        @com.google.gwt.jsonp.client.TimeoutException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.jsonp.client.TimeoutException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/jsonp/client/TimeoutException;),
        @com.google.gwt.jsonp.client.TimeoutException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/jsonp/client/TimeoutException;)
      ];
    
    result["com.google.gwt.layout.client.Layout$Alignment/2527392528"] = [
        @com.google.gwt.layout.client.Layout_Alignment_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.layout.client.Layout_Alignment_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/layout/client/Layout$Alignment;),
        @com.google.gwt.layout.client.Layout_Alignment_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/layout/client/Layout$Alignment;)
      ];
    
    result["com.google.gwt.resources.client.ImageResource$RepeatStyle/1206724650"] = [
        @com.google.gwt.resources.client.ImageResource_RepeatStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.resources.client.ImageResource_RepeatStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/resources/client/ImageResource$RepeatStyle;),
        @com.google.gwt.resources.client.ImageResource_RepeatStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/resources/client/ImageResource$RepeatStyle;)
      ];
    
    result["com.google.gwt.safecss.shared.SafeStylesString/1334499262"] = [
        @com.google.gwt.safecss.shared.SafeStylesString_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.safecss.shared.SafeStylesString_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/safecss/shared/SafeStylesString;),
        @com.google.gwt.safecss.shared.SafeStylesString_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/safecss/shared/SafeStylesString;)
      ];
    
    result["com.google.gwt.safehtml.shared.SafeHtmlString/235635043"] = [
        @com.google.gwt.safehtml.shared.SafeHtmlString_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.safehtml.shared.SafeHtmlString_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/safehtml/shared/SafeHtmlString;),
        @com.google.gwt.safehtml.shared.SafeHtmlString_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/safehtml/shared/SafeHtmlString;)
      ];
    
    result["com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy$KeyboardPagingPolicy/2634835889"] = [
        @com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy_KeyboardPagingPolicy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy_KeyboardPagingPolicy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/cellview/client/HasKeyboardPagingPolicy$KeyboardPagingPolicy;),
        @com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy_KeyboardPagingPolicy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/cellview/client/HasKeyboardPagingPolicy$KeyboardPagingPolicy;)
      ];
    
    result["com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy$KeyboardSelectionPolicy/456638159"] = [
        @com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy_KeyboardSelectionPolicy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy_KeyboardSelectionPolicy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/cellview/client/HasKeyboardSelectionPolicy$KeyboardSelectionPolicy;),
        @com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy_KeyboardSelectionPolicy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/cellview/client/HasKeyboardSelectionPolicy$KeyboardSelectionPolicy;)
      ];
    
    result["com.google.gwt.user.cellview.client.RowHoverEvent$HoveringScope/2300783195"] = [
        @com.google.gwt.user.cellview.client.RowHoverEvent_HoveringScope_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.cellview.client.RowHoverEvent_HoveringScope_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/cellview/client/RowHoverEvent$HoveringScope;),
        @com.google.gwt.user.cellview.client.RowHoverEvent_HoveringScope_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/cellview/client/RowHoverEvent$HoveringScope;)
      ];
    
    result["com.google.gwt.user.cellview.client.SimplePager$TextLocation/2815715189"] = [
        @com.google.gwt.user.cellview.client.SimplePager_TextLocation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.cellview.client.SimplePager_TextLocation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/cellview/client/SimplePager$TextLocation;),
        @com.google.gwt.user.cellview.client.SimplePager_TextLocation_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/cellview/client/SimplePager$TextLocation;)
      ];
    
    result["com.google.gwt.user.client.DocumentModeAsserter$Severity/362743079"] = [
        @com.google.gwt.user.client.DocumentModeAsserter_Severity_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.DocumentModeAsserter_Severity_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/DocumentModeAsserter$Severity;),
        @com.google.gwt.user.client.DocumentModeAsserter_Severity_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/DocumentModeAsserter$Severity;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.RpcTokenException/2345075298"] = [
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/RpcTokenException;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/RpcTokenException;)
      ];
    
    result["com.google.gwt.user.client.rpc.SerializableException/3047383460"] = [
        @com.google.gwt.user.client.rpc.SerializableException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.SerializableException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/SerializableException;),
        @com.google.gwt.user.client.rpc.SerializableException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/SerializableException;)
      ];
    
    result["com.google.gwt.user.client.rpc.SerializationException/2836333220"] = [
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/SerializationException;),
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/SerializationException;)
      ];
    
    result["com.google.gwt.user.client.rpc.SerializedTypeViolationException/914601580"] = [
        @com.google.gwt.user.client.rpc.SerializedTypeViolationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.SerializedTypeViolationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/SerializedTypeViolationException;),
        @com.google.gwt.user.client.rpc.SerializedTypeViolationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/SerializedTypeViolationException;)
      ];
    
    result["com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447"] = [
        @com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/ServiceDefTarget$NoServiceEntryPointSpecifiedException;),
        @com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/ServiceDefTarget$NoServiceEntryPointSpecifiedException;)
      ];
    
    result["com.google.gwt.user.client.rpc.XsrfToken/4254043109"] = [
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/XsrfToken;),
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/XsrfToken;)
      ];
    
    result["com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter$ResponseReader/3896068654"] = [
        @com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter_ResponseReader_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter_ResponseReader_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/impl/RequestCallbackAdapter$ResponseReader;),
        @com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter_ResponseReader_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/impl/RequestCallbackAdapter$ResponseReader;)
      ];
    
    result["com.google.gwt.user.client.ui.ChangeListenerCollection/287642957"] = [
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ChangeListenerCollection;),
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/ChangeListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.ClickListenerCollection/2152455986"] = [
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ClickListenerCollection;),
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/ClickListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.DockLayoutPanel$Direction/1397005836"] = [
        @com.google.gwt.user.client.ui.DockLayoutPanel_Direction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.DockLayoutPanel_Direction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/DockLayoutPanel$Direction;),
        @com.google.gwt.user.client.ui.DockLayoutPanel_Direction_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/DockLayoutPanel$Direction;)
      ];
    
    result["com.google.gwt.user.client.ui.FocusListenerCollection/119490835"] = [
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/FocusListenerCollection;),
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/FocusListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.FormHandlerCollection/3088681894"] = [
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/FormHandlerCollection;),
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/FormHandlerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242"] = [
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/KeyboardListenerCollection;),
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/KeyboardListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.LoadListenerCollection/3174178888"] = [
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/LoadListenerCollection;),
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/LoadListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.MouseListenerCollection/465158911"] = [
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MouseListenerCollection;),
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/MouseListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.MouseWheelListenerCollection/370304552"] = [
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MouseWheelListenerCollection;),
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/MouseWheelListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion/2803420099"] = [
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MultiWordSuggestOracle$MultiWordSuggestion;),
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/MultiWordSuggestOracle$MultiWordSuggestion;)
      ];
    
    result["[Lcom.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion;/1531882420"] = [
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/user/client/ui/MultiWordSuggestOracle$MultiWordSuggestion;),
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/google/gwt/user/client/ui/MultiWordSuggestOracle$MultiWordSuggestion;)
      ];
    
    result["com.google.gwt.user.client.ui.PopupListenerCollection/1920131050"] = [
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/PopupListenerCollection;),
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/PopupListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.PopupPanel$AnimationType/3176768593"] = [
        @com.google.gwt.user.client.ui.PopupPanel_AnimationType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.PopupPanel_AnimationType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/PopupPanel$AnimationType;),
        @com.google.gwt.user.client.ui.PopupPanel_AnimationType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/PopupPanel$AnimationType;)
      ];
    
    result["com.google.gwt.user.client.ui.ScrollListenerCollection/210686268"] = [
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ScrollListenerCollection;),
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/ScrollListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.SuggestOracle$Request/3707347745"] = [
        @com.google.gwt.user.client.ui.SuggestOracle_Request_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.SuggestOracle_Request_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/SuggestOracle$Request;),
        @com.google.gwt.user.client.ui.SuggestOracle_Request_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/SuggestOracle$Request;)
      ];
    
    result["com.google.gwt.user.client.ui.SuggestOracle$Response/3840253928"] = [
        @com.google.gwt.user.client.ui.SuggestOracle_Response_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.SuggestOracle_Response_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/SuggestOracle$Response;),
        @com.google.gwt.user.client.ui.SuggestOracle_Response_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/SuggestOracle$Response;)
      ];
    
    result["[Lcom.google.gwt.user.client.ui.SuggestOracle$Suggestion;/3224244884"] = [
        @com.google.gwt.user.client.ui.SuggestOracle_Suggestion_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.SuggestOracle_Suggestion_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/user/client/ui/SuggestOracle$Suggestion;),
        @com.google.gwt.user.client.ui.SuggestOracle_Suggestion_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/google/gwt/user/client/ui/SuggestOracle$Suggestion;)
      ];
    
    result["com.google.gwt.user.client.ui.TabListenerCollection/3768293299"] = [
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TabListenerCollection;),
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/TabListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.TableListenerCollection/2254740473"] = [
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TableListenerCollection;),
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/TableListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.TreeListenerCollection/3716243734"] = [
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TreeListenerCollection;),
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/TreeListenerCollection;)
      ];
    
    result["com.google.gwt.user.client.ui.ValueBoxBase$TextAlignment/2654912399"] = [
        @com.google.gwt.user.client.ui.ValueBoxBase_TextAlignment_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ValueBoxBase_TextAlignment_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ValueBoxBase$TextAlignment;),
        @com.google.gwt.user.client.ui.ValueBoxBase_TextAlignment_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/ui/ValueBoxBase$TextAlignment;)
      ];
    
    result["com.google.gwt.validation.client.impl.ConstraintOrigin/3366491330"] = [
        @com.google.gwt.validation.client.impl.ConstraintOrigin_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.validation.client.impl.ConstraintOrigin_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/validation/client/impl/ConstraintOrigin;),
        @com.google.gwt.validation.client.impl.ConstraintOrigin_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/validation/client/impl/ConstraintOrigin;)
      ];
    
    result["com.google.gwt.view.client.DefaultSelectionEventManager$SelectAction/3087887111"] = [
        @com.google.gwt.view.client.DefaultSelectionEventManager_SelectAction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.view.client.DefaultSelectionEventManager_SelectAction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/view/client/DefaultSelectionEventManager$SelectAction;),
        @com.google.gwt.view.client.DefaultSelectionEventManager_SelectAction_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/view/client/DefaultSelectionEventManager$SelectAction;)
      ];
    
    result["com.google.gwt.view.client.Range/1471336945"] = [
        @com.google.gwt.view.client.Range_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.view.client.Range_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/view/client/Range;),
        @com.google.gwt.view.client.Range_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/view/client/Range;)
      ];
    
    result["com.google.gwt.xhr.client.XMLHttpRequest$ResponseType/824406458"] = [
        @com.google.gwt.xhr.client.XMLHttpRequest_ResponseType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.xhr.client.XMLHttpRequest_ResponseType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/xhr/client/XMLHttpRequest$ResponseType;),
        @com.google.gwt.xhr.client.XMLHttpRequest_ResponseType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/xhr/client/XMLHttpRequest$ResponseType;)
      ];
    
    result["com.google.gwt.xml.client.impl.DOMParseException/3799120635"] = [
        @com.google.gwt.xml.client.impl.DOMParseException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.xml.client.impl.DOMParseException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/xml/client/impl/DOMParseException;),
        @com.google.gwt.xml.client.impl.DOMParseException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/xml/client/impl/DOMParseException;)
      ];
    
    result["com.google.web.bindery.event.shared.UmbrellaException/1025846929"] = [
        @com.google.web.bindery.event.shared.UmbrellaException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.web.bindery.event.shared.UmbrellaException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/web/bindery/event/shared/UmbrellaException;),
        @com.google.web.bindery.event.shared.UmbrellaException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/web/bindery/event/shared/UmbrellaException;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.beans.BeanSet/864170362"] = [
        @com.sapientarrow.gwtapp.shared.beans.BeanSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.beans.BeanSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/beans/BeanSet;),
        @com.sapientarrow.gwtapp.shared.beans.BeanSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/beans/BeanSet;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.beans.Test/1096420907"] = [
        @com.sapientarrow.gwtapp.shared.beans.Test_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.beans.Test_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/beans/Test;),
        @com.sapientarrow.gwtapp.shared.beans.Test_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/beans/Test;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.beans.firs/417539580"] = [
        @com.sapientarrow.gwtapp.shared.beans.firs_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.beans.firs_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/beans/firs;),
        @com.sapientarrow.gwtapp.shared.beans.firs_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/beans/firs;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO/1335219307"] = [
        @com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/dto/AddedBeanDTO;),
        @com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/dto/AddedBeanDTO;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO/1519408965"] = [
        @com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/dto/AddedBeanPropertyDTO;),
        @com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/dto/AddedBeanPropertyDTO;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO/2384942776"] = [
        @com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/dto/AnnotationsDTO;),
        @com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/dto/AnnotationsDTO;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO/2179775848"] = [
        @com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/dto/BeanExceptionDTO;),
        @com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/dto/BeanExceptionDTO;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO/1954732187"] = [
        @com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/dto/BeanObjectDTO;),
        @com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/dto/BeanObjectDTO;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.dto.BindingsDTO/2015667196"] = [
        @com.sapientarrow.gwtapp.shared.dto.BindingsDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.dto.BindingsDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/dto/BindingsDTO;),
        @com.sapientarrow.gwtapp.shared.dto.BindingsDTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/dto/BindingsDTO;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.entity.BeanSetChild3/3934785532"] = [
        @com.sapientarrow.gwtapp.shared.entity.BeanSetChild3_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.entity.BeanSetChild3_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/entity/BeanSetChild3;),
        @com.sapientarrow.gwtapp.shared.entity.BeanSetChild3_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/entity/BeanSetChild3;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4/4200208158"] = [
        @com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/entity/BeanSetChild3Child4;),
        @com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/entity/BeanSetChild3Child4;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child8/3269152738"] = [
        @com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child8_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child8_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/entity/BeanSetChild3Child8;),
        @com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child8_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/entity/BeanSetChild3Child8;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.entity.Beans/4256108783"] = [
        @com.sapientarrow.gwtapp.shared.entity.Beans_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.entity.Beans_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/entity/Beans;),
        @com.sapientarrow.gwtapp.shared.entity.Beans_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/entity/Beans;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity/1465785515"] = [
        @com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/entity/GlobalPreferencesEntity;),
        @com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/entity/GlobalPreferencesEntity;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.entity.MyAccountEntity/3907803323"] = [
        @com.sapientarrow.gwtapp.shared.entity.MyAccountEntity_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.entity.MyAccountEntity_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/entity/MyAccountEntity;),
        @com.sapientarrow.gwtapp.shared.entity.MyAccountEntity_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/entity/MyAccountEntity;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity/2686000432"] = [
        @com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/entity/MyAccountPreferencesEntity;),
        @com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/entity/MyAccountPreferencesEntity;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity/2847995576"] = [
        @com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/entity/NameSpaceEntity;),
        @com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/entity/NameSpaceEntity;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.entity.RestEntity/1199117542"] = [
        @com.sapientarrow.gwtapp.shared.entity.RestEntity_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.entity.RestEntity_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/entity/RestEntity;),
        @com.sapientarrow.gwtapp.shared.entity.RestEntity_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/entity/RestEntity;)
      ];
    
    result["com.sapientarrow.gwtapp.shared.entity.UserEntity/4135867036"] = [
        @com.sapientarrow.gwtapp.shared.entity.UserEntity_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.sapientarrow.gwtapp.shared.entity.UserEntity_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/sapientarrow/gwtapp/shared/entity/UserEntity;),
        @com.sapientarrow.gwtapp.shared.entity.UserEntity_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/sapientarrow/gwtapp/shared/entity/UserEntity;)
      ];
    
    result["com.smartgwt.client.types.Alignment/2059691798"] = [
        @com.smartgwt.client.types.Alignment_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Alignment_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Alignment;),
        @com.smartgwt.client.types.Alignment_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Alignment;)
      ];
    
    result["com.smartgwt.client.types.AnimationAcceleration/1030130908"] = [
        @com.smartgwt.client.types.AnimationAcceleration_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.AnimationAcceleration_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/AnimationAcceleration;),
        @com.smartgwt.client.types.AnimationAcceleration_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/AnimationAcceleration;)
      ];
    
    result["com.smartgwt.client.types.AnimationEffect/1745997804"] = [
        @com.smartgwt.client.types.AnimationEffect_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.AnimationEffect_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/AnimationEffect;),
        @com.smartgwt.client.types.AnimationEffect_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/AnimationEffect;)
      ];
    
    result["com.smartgwt.client.types.AutoFitEvent/3347218727"] = [
        @com.smartgwt.client.types.AutoFitEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.AutoFitEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/AutoFitEvent;),
        @com.smartgwt.client.types.AutoFitEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/AutoFitEvent;)
      ];
    
    result["com.smartgwt.client.types.AutoFitIconFieldType/165308987"] = [
        @com.smartgwt.client.types.AutoFitIconFieldType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.AutoFitIconFieldType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/AutoFitIconFieldType;),
        @com.smartgwt.client.types.AutoFitIconFieldType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/AutoFitIconFieldType;)
      ];
    
    result["com.smartgwt.client.types.AutoFitWidthApproach/1885313844"] = [
        @com.smartgwt.client.types.AutoFitWidthApproach_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.AutoFitWidthApproach_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/AutoFitWidthApproach;),
        @com.smartgwt.client.types.AutoFitWidthApproach_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/AutoFitWidthApproach;)
      ];
    
    result["com.smartgwt.client.types.AutoSelectionModel/2926672886"] = [
        @com.smartgwt.client.types.AutoSelectionModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.AutoSelectionModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/AutoSelectionModel;),
        @com.smartgwt.client.types.AutoSelectionModel_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/AutoSelectionModel;)
      ];
    
    result["com.smartgwt.client.types.Autofit/460799988"] = [
        @com.smartgwt.client.types.Autofit_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Autofit_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Autofit;),
        @com.smartgwt.client.types.Autofit_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Autofit;)
      ];
    
    result["com.smartgwt.client.types.Axis/203209807"] = [
        @com.smartgwt.client.types.Axis_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Axis_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Axis;),
        @com.smartgwt.client.types.Axis_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Axis;)
      ];
    
    result["com.smartgwt.client.types.BkgndRepeat/1953695206"] = [
        @com.smartgwt.client.types.BkgndRepeat_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.BkgndRepeat_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/BkgndRepeat;),
        @com.smartgwt.client.types.BkgndRepeat_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/BkgndRepeat;)
      ];
    
    result["com.smartgwt.client.types.CharacterCasing/563764124"] = [
        @com.smartgwt.client.types.CharacterCasing_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.CharacterCasing_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/CharacterCasing;),
        @com.smartgwt.client.types.CharacterCasing_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/CharacterCasing;)
      ];
    
    result["com.smartgwt.client.types.ChartType/1093124538"] = [
        @com.smartgwt.client.types.ChartType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ChartType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ChartType;),
        @com.smartgwt.client.types.ChartType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ChartType;)
      ];
    
    result["com.smartgwt.client.types.ClickMaskMode/816615013"] = [
        @com.smartgwt.client.types.ClickMaskMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ClickMaskMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ClickMaskMode;),
        @com.smartgwt.client.types.ClickMaskMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ClickMaskMode;)
      ];
    
    result["com.smartgwt.client.types.ContentsType/4027903048"] = [
        @com.smartgwt.client.types.ContentsType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ContentsType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ContentsType;),
        @com.smartgwt.client.types.ContentsType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ContentsType;)
      ];
    
    result["com.smartgwt.client.types.ControlName/2110942730"] = [
        @com.smartgwt.client.types.ControlName_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ControlName_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ControlName;),
        @com.smartgwt.client.types.ControlName_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ControlName;)
      ];
    
    result["com.smartgwt.client.types.CriteriaCombineOperator/985731300"] = [
        @com.smartgwt.client.types.CriteriaCombineOperator_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.CriteriaCombineOperator_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/CriteriaCombineOperator;),
        @com.smartgwt.client.types.CriteriaCombineOperator_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/CriteriaCombineOperator;)
      ];
    
    result["com.smartgwt.client.types.CriteriaPolicy/1231634951"] = [
        @com.smartgwt.client.types.CriteriaPolicy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.CriteriaPolicy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/CriteriaPolicy;),
        @com.smartgwt.client.types.CriteriaPolicy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/CriteriaPolicy;)
      ];
    
    result["com.smartgwt.client.types.Cursor/2709488080"] = [
        @com.smartgwt.client.types.Cursor_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Cursor_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Cursor;),
        @com.smartgwt.client.types.Cursor_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Cursor;)
      ];
    
    result["com.smartgwt.client.types.DSDataFormat/1520460056"] = [
        @com.smartgwt.client.types.DSDataFormat_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DSDataFormat_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DSDataFormat;),
        @com.smartgwt.client.types.DSDataFormat_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DSDataFormat;)
      ];
    
    result["com.smartgwt.client.types.DSOperationType/2700575727"] = [
        @com.smartgwt.client.types.DSOperationType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DSOperationType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DSOperationType;),
        @com.smartgwt.client.types.DSOperationType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DSOperationType;)
      ];
    
    result["com.smartgwt.client.types.DSProtocol/891422600"] = [
        @com.smartgwt.client.types.DSProtocol_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DSProtocol_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DSProtocol;),
        @com.smartgwt.client.types.DSProtocol_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DSProtocol;)
      ];
    
    result["com.smartgwt.client.types.DSServerType/1335616997"] = [
        @com.smartgwt.client.types.DSServerType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DSServerType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DSServerType;),
        @com.smartgwt.client.types.DSServerType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DSServerType;)
      ];
    
    result["com.smartgwt.client.types.DateDisplayFormat/3660476357"] = [
        @com.smartgwt.client.types.DateDisplayFormat_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DateDisplayFormat_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DateDisplayFormat;),
        @com.smartgwt.client.types.DateDisplayFormat_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DateDisplayFormat;)
      ];
    
    result["com.smartgwt.client.types.DateItemSelectorFormat/1637479457"] = [
        @com.smartgwt.client.types.DateItemSelectorFormat_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DateItemSelectorFormat_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DateItemSelectorFormat;),
        @com.smartgwt.client.types.DateItemSelectorFormat_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DateItemSelectorFormat;)
      ];
    
    result["com.smartgwt.client.types.DialogButtons/3690681596"] = [
        @com.smartgwt.client.types.DialogButtons_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DialogButtons_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DialogButtons;),
        @com.smartgwt.client.types.DialogButtons_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DialogButtons;)
      ];
    
    result["com.smartgwt.client.types.Direction/1041214416"] = [
        @com.smartgwt.client.types.Direction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Direction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Direction;),
        @com.smartgwt.client.types.Direction_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Direction;)
      ];
    
    result["com.smartgwt.client.types.DisplayNodeType/3935504306"] = [
        @com.smartgwt.client.types.DisplayNodeType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DisplayNodeType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DisplayNodeType;),
        @com.smartgwt.client.types.DisplayNodeType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DisplayNodeType;)
      ];
    
    result["com.smartgwt.client.types.DragAppearance/3679721516"] = [
        @com.smartgwt.client.types.DragAppearance_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DragAppearance_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DragAppearance;),
        @com.smartgwt.client.types.DragAppearance_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DragAppearance;)
      ];
    
    result["com.smartgwt.client.types.DragDataAction/841293788"] = [
        @com.smartgwt.client.types.DragDataAction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DragDataAction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DragDataAction;),
        @com.smartgwt.client.types.DragDataAction_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DragDataAction;)
      ];
    
    result["com.smartgwt.client.types.DragIntersectStyle/3568880719"] = [
        @com.smartgwt.client.types.DragIntersectStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DragIntersectStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DragIntersectStyle;),
        @com.smartgwt.client.types.DragIntersectStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DragIntersectStyle;)
      ];
    
    result["com.smartgwt.client.types.DragTrackerMode/2481326892"] = [
        @com.smartgwt.client.types.DragTrackerMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DragTrackerMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DragTrackerMode;),
        @com.smartgwt.client.types.DragTrackerMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DragTrackerMode;)
      ];
    
    result["com.smartgwt.client.types.DrawPosition/594986244"] = [
        @com.smartgwt.client.types.DrawPosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.DrawPosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/DrawPosition;),
        @com.smartgwt.client.types.DrawPosition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/DrawPosition;)
      ];
    
    result["com.smartgwt.client.types.EditCompletionEvent/456556858"] = [
        @com.smartgwt.client.types.EditCompletionEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.EditCompletionEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/EditCompletionEvent;),
        @com.smartgwt.client.types.EditCompletionEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/EditCompletionEvent;)
      ];
    
    result["com.smartgwt.client.types.EmbeddedPosition/1196828721"] = [
        @com.smartgwt.client.types.EmbeddedPosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.EmbeddedPosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/EmbeddedPosition;),
        @com.smartgwt.client.types.EmbeddedPosition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/EmbeddedPosition;)
      ];
    
    result["com.smartgwt.client.types.Encoding/86827910"] = [
        @com.smartgwt.client.types.Encoding_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Encoding_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Encoding;),
        @com.smartgwt.client.types.Encoding_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Encoding;)
      ];
    
    result["com.smartgwt.client.types.EnterKeyEditAction/1393963638"] = [
        @com.smartgwt.client.types.EnterKeyEditAction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.EnterKeyEditAction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/EnterKeyEditAction;),
        @com.smartgwt.client.types.EnterKeyEditAction_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/EnterKeyEditAction;)
      ];
    
    result["com.smartgwt.client.types.EnumTranslateStrategy/889823818"] = [
        @com.smartgwt.client.types.EnumTranslateStrategy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.EnumTranslateStrategy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/EnumTranslateStrategy;),
        @com.smartgwt.client.types.EnumTranslateStrategy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/EnumTranslateStrategy;)
      ];
    
    result["com.smartgwt.client.types.EscapeKeyEditAction/656181998"] = [
        @com.smartgwt.client.types.EscapeKeyEditAction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.EscapeKeyEditAction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/EscapeKeyEditAction;),
        @com.smartgwt.client.types.EscapeKeyEditAction_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/EscapeKeyEditAction;)
      ];
    
    result["com.smartgwt.client.types.ExpansionMode/895634532"] = [
        @com.smartgwt.client.types.ExpansionMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ExpansionMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ExpansionMode;),
        @com.smartgwt.client.types.ExpansionMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ExpansionMode;)
      ];
    
    result["com.smartgwt.client.types.ExportDisplay/1140697071"] = [
        @com.smartgwt.client.types.ExportDisplay_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ExportDisplay_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ExportDisplay;),
        @com.smartgwt.client.types.ExportDisplay_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ExportDisplay;)
      ];
    
    result["com.smartgwt.client.types.ExportFormat/4016487000"] = [
        @com.smartgwt.client.types.ExportFormat_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ExportFormat_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ExportFormat;),
        @com.smartgwt.client.types.ExportFormat_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ExportFormat;)
      ];
    
    result["com.smartgwt.client.types.FetchMode/3226491226"] = [
        @com.smartgwt.client.types.FetchMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.FetchMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/FetchMode;),
        @com.smartgwt.client.types.FetchMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/FetchMode;)
      ];
    
    result["com.smartgwt.client.types.FieldType/1065871080"] = [
        @com.smartgwt.client.types.FieldType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.FieldType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/FieldType;),
        @com.smartgwt.client.types.FieldType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/FieldType;)
      ];
    
    result["com.smartgwt.client.types.FireStyle/3237165587"] = [
        @com.smartgwt.client.types.FireStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.FireStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/FireStyle;),
        @com.smartgwt.client.types.FireStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/FireStyle;)
      ];
    
    result["com.smartgwt.client.types.FooterControls/4221352374"] = [
        @com.smartgwt.client.types.FooterControls_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.FooterControls_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/FooterControls;),
        @com.smartgwt.client.types.FooterControls_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/FooterControls;)
      ];
    
    result["com.smartgwt.client.types.FormErrorOrientation/330364333"] = [
        @com.smartgwt.client.types.FormErrorOrientation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.FormErrorOrientation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/FormErrorOrientation;),
        @com.smartgwt.client.types.FormErrorOrientation_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/FormErrorOrientation;)
      ];
    
    result["com.smartgwt.client.types.FormItemType/2032166810"] = [
        @com.smartgwt.client.types.FormItemType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.FormItemType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/FormItemType;),
        @com.smartgwt.client.types.FormItemType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/FormItemType;)
      ];
    
    result["com.smartgwt.client.types.FormLayoutType/2028340521"] = [
        @com.smartgwt.client.types.FormLayoutType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.FormLayoutType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/FormLayoutType;),
        @com.smartgwt.client.types.FormLayoutType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/FormLayoutType;)
      ];
    
    result["com.smartgwt.client.types.FormMethod/3616284611"] = [
        @com.smartgwt.client.types.FormMethod_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.FormMethod_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/FormMethod;),
        @com.smartgwt.client.types.FormMethod_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/FormMethod;)
      ];
    
    result["com.smartgwt.client.types.GroupStartOpen/1101930971"] = [
        @com.smartgwt.client.types.GroupStartOpen_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.GroupStartOpen_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/GroupStartOpen;),
        @com.smartgwt.client.types.GroupStartOpen_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/GroupStartOpen;)
      ];
    
    result["com.smartgwt.client.types.HashAlgorithm/4162218006"] = [
        @com.smartgwt.client.types.HashAlgorithm_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.HashAlgorithm_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/HashAlgorithm;),
        @com.smartgwt.client.types.HashAlgorithm_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/HashAlgorithm;)
      ];
    
    result["com.smartgwt.client.types.HeaderControls/2401841894"] = [
        @com.smartgwt.client.types.HeaderControls_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.HeaderControls_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/HeaderControls;),
        @com.smartgwt.client.types.HeaderControls_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/HeaderControls;)
      ];
    
    result["com.smartgwt.client.types.HoverMode/1555421795"] = [
        @com.smartgwt.client.types.HoverMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.HoverMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/HoverMode;),
        @com.smartgwt.client.types.HoverMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/HoverMode;)
      ];
    
    result["com.smartgwt.client.types.ImageStyle/3108665182"] = [
        @com.smartgwt.client.types.ImageStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ImageStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ImageStyle;),
        @com.smartgwt.client.types.ImageStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ImageStyle;)
      ];
    
    result["com.smartgwt.client.types.JSONCircularReferenceMode/1036888274"] = [
        @com.smartgwt.client.types.JSONCircularReferenceMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.JSONCircularReferenceMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/JSONCircularReferenceMode;),
        @com.smartgwt.client.types.JSONCircularReferenceMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/JSONCircularReferenceMode;)
      ];
    
    result["com.smartgwt.client.types.JSONDateFormat/1192233834"] = [
        @com.smartgwt.client.types.JSONDateFormat_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.JSONDateFormat_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/JSONDateFormat;),
        @com.smartgwt.client.types.JSONDateFormat_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/JSONDateFormat;)
      ];
    
    result["com.smartgwt.client.types.JSONInstanceSerializationMode/1191038686"] = [
        @com.smartgwt.client.types.JSONInstanceSerializationMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.JSONInstanceSerializationMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/JSONInstanceSerializationMode;),
        @com.smartgwt.client.types.JSONInstanceSerializationMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/JSONInstanceSerializationMode;)
      ];
    
    result["com.smartgwt.client.types.LayoutPolicy/3036893673"] = [
        @com.smartgwt.client.types.LayoutPolicy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.LayoutPolicy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/LayoutPolicy;),
        @com.smartgwt.client.types.LayoutPolicy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/LayoutPolicy;)
      ];
    
    result["com.smartgwt.client.types.LayoutResizeBarPolicy/3626081300"] = [
        @com.smartgwt.client.types.LayoutResizeBarPolicy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.LayoutResizeBarPolicy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/LayoutResizeBarPolicy;),
        @com.smartgwt.client.types.LayoutResizeBarPolicy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/LayoutResizeBarPolicy;)
      ];
    
    result["com.smartgwt.client.types.ListGridEditEvent/3886065023"] = [
        @com.smartgwt.client.types.ListGridEditEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ListGridEditEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ListGridEditEvent;),
        @com.smartgwt.client.types.ListGridEditEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ListGridEditEvent;)
      ];
    
    result["com.smartgwt.client.types.ListGridFieldType/2000039019"] = [
        @com.smartgwt.client.types.ListGridFieldType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ListGridFieldType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ListGridFieldType;),
        @com.smartgwt.client.types.ListGridFieldType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ListGridFieldType;)
      ];
    
    result["com.smartgwt.client.types.LoadState/37053401"] = [
        @com.smartgwt.client.types.LoadState_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.LoadState_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/LoadState;),
        @com.smartgwt.client.types.LoadState_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/LoadState;)
      ];
    
    result["com.smartgwt.client.types.LocatorStrategy/3925750836"] = [
        @com.smartgwt.client.types.LocatorStrategy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.LocatorStrategy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/LocatorStrategy;),
        @com.smartgwt.client.types.LocatorStrategy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/LocatorStrategy;)
      ];
    
    result["com.smartgwt.client.types.LocatorTypeStrategy/961391465"] = [
        @com.smartgwt.client.types.LocatorTypeStrategy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.LocatorTypeStrategy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/LocatorTypeStrategy;),
        @com.smartgwt.client.types.LocatorTypeStrategy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/LocatorTypeStrategy;)
      ];
    
    result["com.smartgwt.client.types.LogPriority/1509208694"] = [
        @com.smartgwt.client.types.LogPriority_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.LogPriority_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/LogPriority;),
        @com.smartgwt.client.types.LogPriority_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/LogPriority;)
      ];
    
    result["com.smartgwt.client.types.LogicalOperator/3552004836"] = [
        @com.smartgwt.client.types.LogicalOperator_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.LogicalOperator_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/LogicalOperator;),
        @com.smartgwt.client.types.LogicalOperator_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/LogicalOperator;)
      ];
    
    result["com.smartgwt.client.types.MenuFieldID/3896245071"] = [
        @com.smartgwt.client.types.MenuFieldID_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.MenuFieldID_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/MenuFieldID;),
        @com.smartgwt.client.types.MenuFieldID_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/MenuFieldID;)
      ];
    
    result["com.smartgwt.client.types.MultipleAppearance/251507130"] = [
        @com.smartgwt.client.types.MultipleAppearance_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.MultipleAppearance_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/MultipleAppearance;),
        @com.smartgwt.client.types.MultipleAppearance_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/MultipleAppearance;)
      ];
    
    result["com.smartgwt.client.types.NavigationMode/2618262723"] = [
        @com.smartgwt.client.types.NavigationMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.NavigationMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/NavigationMode;),
        @com.smartgwt.client.types.NavigationMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/NavigationMode;)
      ];
    
    result["com.smartgwt.client.types.OperatorId/1374955218"] = [
        @com.smartgwt.client.types.OperatorId_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.OperatorId_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/OperatorId;),
        @com.smartgwt.client.types.OperatorId_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/OperatorId;)
      ];
    
    result["com.smartgwt.client.types.OperatorValueType/1765879087"] = [
        @com.smartgwt.client.types.OperatorValueType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.OperatorValueType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/OperatorValueType;),
        @com.smartgwt.client.types.OperatorValueType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/OperatorValueType;)
      ];
    
    result["com.smartgwt.client.types.Orientation/577127793"] = [
        @com.smartgwt.client.types.Orientation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Orientation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Orientation;),
        @com.smartgwt.client.types.Orientation_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Orientation;)
      ];
    
    result["com.smartgwt.client.types.Overflow/2773856450"] = [
        @com.smartgwt.client.types.Overflow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Overflow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Overflow;),
        @com.smartgwt.client.types.Overflow_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Overflow;)
      ];
    
    result["com.smartgwt.client.types.PageEvent/3642199904"] = [
        @com.smartgwt.client.types.PageEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.PageEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/PageEvent;),
        @com.smartgwt.client.types.PageEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/PageEvent;)
      ];
    
    result["com.smartgwt.client.types.PageOrientation/3310175191"] = [
        @com.smartgwt.client.types.PageOrientation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.PageOrientation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/PageOrientation;),
        @com.smartgwt.client.types.PageOrientation_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/PageOrientation;)
      ];
    
    result["com.smartgwt.client.types.PercentBoxModel/2221852492"] = [
        @com.smartgwt.client.types.PercentBoxModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.PercentBoxModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/PercentBoxModel;),
        @com.smartgwt.client.types.PercentBoxModel_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/PercentBoxModel;)
      ];
    
    result["com.smartgwt.client.types.Positioning/2453663791"] = [
        @com.smartgwt.client.types.Positioning_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Positioning_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Positioning;),
        @com.smartgwt.client.types.Positioning_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Positioning;)
      ];
    
    result["com.smartgwt.client.types.PromptStyle/1132304114"] = [
        @com.smartgwt.client.types.PromptStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.PromptStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/PromptStyle;),
        @com.smartgwt.client.types.PromptStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/PromptStyle;)
      ];
    
    result["com.smartgwt.client.types.RPCTransport/3409442810"] = [
        @com.smartgwt.client.types.RPCTransport_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.RPCTransport_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/RPCTransport;),
        @com.smartgwt.client.types.RPCTransport_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/RPCTransport;)
      ];
    
    result["com.smartgwt.client.types.RecordComponentPoolingMode/2355959272"] = [
        @com.smartgwt.client.types.RecordComponentPoolingMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.RecordComponentPoolingMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/RecordComponentPoolingMode;),
        @com.smartgwt.client.types.RecordComponentPoolingMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/RecordComponentPoolingMode;)
      ];
    
    result["com.smartgwt.client.types.RecordLayout/2691907645"] = [
        @com.smartgwt.client.types.RecordLayout_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.RecordLayout_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/RecordLayout;),
        @com.smartgwt.client.types.RecordLayout_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/RecordLayout;)
      ];
    
    result["com.smartgwt.client.types.RecordSummaryFunctionType/4285856520"] = [
        @com.smartgwt.client.types.RecordSummaryFunctionType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.RecordSummaryFunctionType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/RecordSummaryFunctionType;),
        @com.smartgwt.client.types.RecordSummaryFunctionType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/RecordSummaryFunctionType;)
      ];
    
    result["com.smartgwt.client.types.RowEndEditAction/2787188272"] = [
        @com.smartgwt.client.types.RowEndEditAction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.RowEndEditAction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/RowEndEditAction;),
        @com.smartgwt.client.types.RowEndEditAction_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/RowEndEditAction;)
      ];
    
    result["com.smartgwt.client.types.SQLPagingStrategy/3498555179"] = [
        @com.smartgwt.client.types.SQLPagingStrategy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.SQLPagingStrategy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/SQLPagingStrategy;),
        @com.smartgwt.client.types.SQLPagingStrategy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/SQLPagingStrategy;)
      ];
    
    result["com.smartgwt.client.types.SQLType/2911324845"] = [
        @com.smartgwt.client.types.SQLType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.SQLType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/SQLType;),
        @com.smartgwt.client.types.SQLType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/SQLType;)
      ];
    
    result["com.smartgwt.client.types.Selected/1251796839"] = [
        @com.smartgwt.client.types.Selected_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Selected_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Selected;),
        @com.smartgwt.client.types.Selected_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Selected;)
      ];
    
    result["com.smartgwt.client.types.SelectionAppearance/199115397"] = [
        @com.smartgwt.client.types.SelectionAppearance_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.SelectionAppearance_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/SelectionAppearance;),
        @com.smartgwt.client.types.SelectionAppearance_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/SelectionAppearance;)
      ];
    
    result["com.smartgwt.client.types.SelectionBoundary/4002678833"] = [
        @com.smartgwt.client.types.SelectionBoundary_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.SelectionBoundary_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/SelectionBoundary;),
        @com.smartgwt.client.types.SelectionBoundary_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/SelectionBoundary;)
      ];
    
    result["com.smartgwt.client.types.SelectionStyle/2974594097"] = [
        @com.smartgwt.client.types.SelectionStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.SelectionStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/SelectionStyle;),
        @com.smartgwt.client.types.SelectionStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/SelectionStyle;)
      ];
    
    result["com.smartgwt.client.types.SelectionType/2471041809"] = [
        @com.smartgwt.client.types.SelectionType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.SelectionType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/SelectionType;),
        @com.smartgwt.client.types.SelectionType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/SelectionType;)
      ];
    
    result["com.smartgwt.client.types.SendMethod/1862343157"] = [
        @com.smartgwt.client.types.SendMethod_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.SendMethod_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/SendMethod;),
        @com.smartgwt.client.types.SendMethod_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/SendMethod;)
      ];
    
    result["com.smartgwt.client.types.Side/288599021"] = [
        @com.smartgwt.client.types.Side_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Side_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Side;),
        @com.smartgwt.client.types.Side_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Side;)
      ];
    
    result["com.smartgwt.client.types.SortArrow/526858425"] = [
        @com.smartgwt.client.types.SortArrow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.SortArrow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/SortArrow;),
        @com.smartgwt.client.types.SortArrow_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/SortArrow;)
      ];
    
    result["com.smartgwt.client.types.SortDirection/1691533931"] = [
        @com.smartgwt.client.types.SortDirection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.SortDirection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/SortDirection;),
        @com.smartgwt.client.types.SortDirection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/SortDirection;)
      ];
    
    result["com.smartgwt.client.types.State/2211996589"] = [
        @com.smartgwt.client.types.State_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.State_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/State;),
        @com.smartgwt.client.types.State_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/State;)
      ];
    
    result["com.smartgwt.client.types.SummaryFunctionType/3979365735"] = [
        @com.smartgwt.client.types.SummaryFunctionType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.SummaryFunctionType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/SummaryFunctionType;),
        @com.smartgwt.client.types.SummaryFunctionType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/SummaryFunctionType;)
      ];
    
    result["com.smartgwt.client.types.TabBarControls/1522657898"] = [
        @com.smartgwt.client.types.TabBarControls_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.TabBarControls_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/TabBarControls;),
        @com.smartgwt.client.types.TabBarControls_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/TabBarControls;)
      ];
    
    result["com.smartgwt.client.types.TabTitleEditEvent/1629386143"] = [
        @com.smartgwt.client.types.TabTitleEditEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.TabTitleEditEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/TabTitleEditEvent;),
        @com.smartgwt.client.types.TabTitleEditEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/TabTitleEditEvent;)
      ];
    
    result["com.smartgwt.client.types.TableMode/992219322"] = [
        @com.smartgwt.client.types.TableMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.TableMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/TableMode;),
        @com.smartgwt.client.types.TableMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/TableMode;)
      ];
    
    result["com.smartgwt.client.types.TextAreaWrap/2234558247"] = [
        @com.smartgwt.client.types.TextAreaWrap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.TextAreaWrap_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/TextAreaWrap;),
        @com.smartgwt.client.types.TextAreaWrap_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/TextAreaWrap;)
      ];
    
    result["com.smartgwt.client.types.TextMatchStyle/2435011120"] = [
        @com.smartgwt.client.types.TextMatchStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.TextMatchStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/TextMatchStyle;),
        @com.smartgwt.client.types.TextMatchStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/TextMatchStyle;)
      ];
    
    result["com.smartgwt.client.types.TileLayoutPolicy/1739208210"] = [
        @com.smartgwt.client.types.TileLayoutPolicy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.TileLayoutPolicy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/TileLayoutPolicy;),
        @com.smartgwt.client.types.TileLayoutPolicy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/TileLayoutPolicy;)
      ];
    
    result["com.smartgwt.client.types.TimeFormatter/2306491366"] = [
        @com.smartgwt.client.types.TimeFormatter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.TimeFormatter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/TimeFormatter;),
        @com.smartgwt.client.types.TimeFormatter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/TimeFormatter;)
      ];
    
    result["com.smartgwt.client.types.TitleOrientation/751650582"] = [
        @com.smartgwt.client.types.TitleOrientation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.TitleOrientation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/TitleOrientation;),
        @com.smartgwt.client.types.TitleOrientation_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/TitleOrientation;)
      ];
    
    result["com.smartgwt.client.types.TopOperatorAppearance/2466608722"] = [
        @com.smartgwt.client.types.TopOperatorAppearance_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.TopOperatorAppearance_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/TopOperatorAppearance;),
        @com.smartgwt.client.types.TopOperatorAppearance_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/TopOperatorAppearance;)
      ];
    
    result["com.smartgwt.client.types.TreeModelType/66152375"] = [
        @com.smartgwt.client.types.TreeModelType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.TreeModelType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/TreeModelType;),
        @com.smartgwt.client.types.TreeModelType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/TreeModelType;)
      ];
    
    result["com.smartgwt.client.types.ValidationMode/1151982259"] = [
        @com.smartgwt.client.types.ValidationMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ValidationMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ValidationMode;),
        @com.smartgwt.client.types.ValidationMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ValidationMode;)
      ];
    
    result["com.smartgwt.client.types.ValidatorType/3999656904"] = [
        @com.smartgwt.client.types.ValidatorType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ValidatorType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ValidatorType;),
        @com.smartgwt.client.types.ValidatorType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ValidatorType;)
      ];
    
    result["com.smartgwt.client.types.VerticalAlignment/1960762003"] = [
        @com.smartgwt.client.types.VerticalAlignment_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.VerticalAlignment_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/VerticalAlignment;),
        @com.smartgwt.client.types.VerticalAlignment_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/VerticalAlignment;)
      ];
    
    result["com.smartgwt.client.types.ViewName/1093254564"] = [
        @com.smartgwt.client.types.ViewName_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.ViewName_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/ViewName;),
        @com.smartgwt.client.types.ViewName_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/ViewName;)
      ];
    
    result["com.smartgwt.client.types.Visibility/3238112137"] = [
        @com.smartgwt.client.types.Visibility_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.Visibility_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/Visibility;),
        @com.smartgwt.client.types.Visibility_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/Visibility;)
      ];
    
    result["com.smartgwt.client.types.VisibilityMode/2429247622"] = [
        @com.smartgwt.client.types.VisibilityMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.smartgwt.client.types.VisibilityMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/smartgwt/client/types/VisibilityMode;),
        @com.smartgwt.client.types.VisibilityMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/smartgwt/client/types/VisibilityMode;)
      ];
    
    result["gwtupload.client.IFileInput$FileInputType/1833217677"] = [
        @gwtupload.client.IFileInput_FileInputType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @gwtupload.client.IFileInput_FileInputType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lgwtupload/client/IFileInput$FileInputType;),
        @gwtupload.client.IFileInput_FileInputType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lgwtupload/client/IFileInput$FileInputType;)
      ];
    
    result["gwtupload.client.IUploadStatus$CancelBehavior/3007774437"] = [
        @gwtupload.client.IUploadStatus_CancelBehavior_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @gwtupload.client.IUploadStatus_CancelBehavior_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lgwtupload/client/IUploadStatus$CancelBehavior;),
        @gwtupload.client.IUploadStatus_CancelBehavior_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lgwtupload/client/IUploadStatus$CancelBehavior;)
      ];
    
    result["gwtupload.client.IUploadStatus$Status/1552745995"] = [
        @gwtupload.client.IUploadStatus_Status_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @gwtupload.client.IUploadStatus_Status_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lgwtupload/client/IUploadStatus$Status;),
        @gwtupload.client.IUploadStatus_Status_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lgwtupload/client/IUploadStatus$Status;)
      ];
    
    result["java.io.IOException/1159940531"] = [
        @com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/io/IOException;),
        @com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/io/IOException;)
      ];
    
    result["java.io.UnsupportedEncodingException/1526756933"] = [
        @com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/io/UnsupportedEncodingException;),
        @com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/io/UnsupportedEncodingException;)
      ];
    
    result["java.lang.ArithmeticException/1539622151"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/ArithmeticException;),
        @com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArithmeticException;)
      ];
    
    result["java.lang.ArrayIndexOutOfBoundsException/600550433"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/ArrayIndexOutOfBoundsException;),
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArrayIndexOutOfBoundsException;)
      ];
    
    result["java.lang.ArrayStoreException/3540507190"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/ArrayStoreException;),
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArrayStoreException;)
      ];
    
    result["java.lang.AssertionError/3490171458"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/AssertionError;),
        @com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/AssertionError;)
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Byte/1571082439"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Byte;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Byte;)
      ];
    
    result["java.lang.Character/2663399736"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Character;),
        @com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Character;)
      ];
    
    result["java.lang.ClassCastException/702295179"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/ClassCastException;),
        @com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ClassCastException;)
      ];
    
    result["java.lang.Double/858496421"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Double;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Double;)
      ];
    
    result["java.lang.Error/1331973429"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Error;),
        @com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Error;)
      ];
    
    result["java.lang.Exception/1920171873"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Exception;),
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Exception;)
      ];
    
    result["java.lang.Float/1718559123"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Float;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Float;)
      ];
    
    result["java.lang.IllegalArgumentException/1755012560"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/IllegalArgumentException;),
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IllegalArgumentException;)
      ];
    
    result["java.lang.IllegalStateException/1972187323"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/IllegalStateException;),
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IllegalStateException;)
      ];
    
    result["java.lang.IndexOutOfBoundsException/2489527753"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/IndexOutOfBoundsException;),
        @com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IndexOutOfBoundsException;)
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["java.lang.Long/4227064769"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Long;)
      ];
    
    result["java.lang.NegativeArraySizeException/3846860241"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/NegativeArraySizeException;),
        @com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NegativeArraySizeException;)
      ];
    
    result["java.lang.NoSuchMethodException/260969707"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.NoSuchMethodException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.NoSuchMethodException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/NoSuchMethodException;),
        @com.google.gwt.user.client.rpc.core.java.lang.NoSuchMethodException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NoSuchMethodException;)
      ];
    
    result["java.lang.NullPointerException/1463492344"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/NullPointerException;),
        @com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NullPointerException;)
      ];
    
    result["java.lang.NumberFormatException/3305228476"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/NumberFormatException;),
        @com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NumberFormatException;)
      ];
    
    result["java.lang.RuntimeException/515124647"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/RuntimeException;),
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/RuntimeException;)
      ];
    
    result["java.lang.Short/551743396"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Short;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Short;)
      ];
    
    result["java.lang.StackTraceElement/455763907"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/StackTraceElement;),
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/StackTraceElement;)
      ];
    
    result["[Ljava.lang.StackTraceElement;/3867167983"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/StackTraceElement;),
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/StackTraceElement;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.lang.StringIndexOutOfBoundsException/500777603"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/StringIndexOutOfBoundsException;),
        @com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/StringIndexOutOfBoundsException;)
      ];
    
    result["java.lang.Throwable/2953622131"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Throwable;),
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Throwable;)
      ];
    
    result["java.lang.UnsupportedOperationException/3744010015"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/UnsupportedOperationException;),
        @com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/UnsupportedOperationException;)
      ];
    
    result["java.lang.Void/2139725816"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Void_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Void_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Void;),
        @com.google.gwt.user.client.rpc.core.java.lang.Void_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Void;)
      ];
    
    result["java.lang.annotation.AnnotationFormatError/2257184627"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/annotation/AnnotationFormatError;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/annotation/AnnotationFormatError;)
      ];
    
    result["java.lang.annotation.AnnotationTypeMismatchException/976205828"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/annotation/AnnotationTypeMismatchException;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/annotation/AnnotationTypeMismatchException;)
      ];
    
    result["java.lang.annotation.ElementType/2567657504"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.ElementType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.ElementType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/annotation/ElementType;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.ElementType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/annotation/ElementType;)
      ];
    
    result["java.lang.annotation.RetentionPolicy/3918071115"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.RetentionPolicy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.RetentionPolicy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/annotation/RetentionPolicy;),
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.RetentionPolicy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/annotation/RetentionPolicy;)
      ];
    
    result["java.lang.reflect.InvocationTargetException/80424744"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.reflect.InvocationTargetException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.reflect.InvocationTargetException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/reflect/InvocationTargetException;),
        @com.google.gwt.user.client.rpc.core.java.lang.reflect.InvocationTargetException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/reflect/InvocationTargetException;)
      ];
    
    result["java.math.BigDecimal/8151472"] = [
        @com.google.gwt.user.client.rpc.core.java.math.BigDecimal_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.math.BigDecimal_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/math/BigDecimal;),
        @com.google.gwt.user.client.rpc.core.java.math.BigDecimal_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/math/BigDecimal;)
      ];
    
    result["java.math.BigInteger/927293797"] = [
        @com.google.gwt.user.client.rpc.core.java.math.BigInteger_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.math.BigInteger_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/math/BigInteger;),
        @com.google.gwt.user.client.rpc.core.java.math.BigInteger_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/math/BigInteger;)
      ];
    
    result["java.math.MathContext/1014811437"] = [
        @com.google.gwt.user.client.rpc.core.java.math.MathContext_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.math.MathContext_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/math/MathContext;),
        @com.google.gwt.user.client.rpc.core.java.math.MathContext_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/math/MathContext;)
      ];
    
    result["java.math.RoundingMode/4117623240"] = [
        @com.google.gwt.user.client.rpc.core.java.math.RoundingMode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.math.RoundingMode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/math/RoundingMode;),
        @com.google.gwt.user.client.rpc.core.java.math.RoundingMode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/math/RoundingMode;)
      ];
    
    result["java.security.DigestException/629316798"] = [
        @com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/security/DigestException;),
        @com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/DigestException;)
      ];
    
    result["java.security.GeneralSecurityException/2669239907"] = [
        @com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/security/GeneralSecurityException;),
        @com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/GeneralSecurityException;)
      ];
    
    result["java.security.NoSuchAlgorithmException/2892037213"] = [
        @com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/security/NoSuchAlgorithmException;),
        @com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/NoSuchAlgorithmException;)
      ];
    
    result["java.sql.Date/730999118"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ];
    
    result["java.sql.Time/1816797103"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ];
    
    result["java.sql.Timestamp/3040052672"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ];
    
    result["java.util.ArrayList/4159755760"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.Arrays$ArrayList/2507071751"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/4157118744"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyMap/4174664486"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Map;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Map;)
      ];
    
    result["java.util.Collections$EmptySet/3523698179"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Set;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Set;)
      ];
    
    result["java.util.Collections$SingletonList/1586180994"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.ConcurrentModificationException/2717383897"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ConcurrentModificationException;),
        @com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ConcurrentModificationException;)
      ];
    
    result["java.util.Date/3385151746"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
      ];
    
    result["java.util.EmptyStackException/89438517"] = [
        @com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/EmptyStackException;),
        @com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/EmptyStackException;)
      ];
    
    result["java.util.EnumMap/1826390227"] = [
        @com.google.gwt.user.client.rpc.core.java.util.EnumMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.EnumMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/EnumMap;),
        @com.google.gwt.user.client.rpc.core.java.util.EnumMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/EnumMap;)
      ];
    
    result["java.util.HashMap/1797211028"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ];
    
    result["java.util.HashSet/3273092938"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashSet;)
      ];
    
    result["java.util.IdentityHashMap/1839153020"] = [
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/IdentityHashMap;)
      ];
    
    result["java.util.LinkedHashMap/3008245022"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ];
    
    result["java.util.LinkedHashSet/1826081506"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashSet;)
      ];
    
    result["java.util.LinkedList/3953877921"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["java.util.NoSuchElementException/1559248883"] = [
        @com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/NoSuchElementException;),
        @com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/NoSuchElementException;)
      ];
    
    result["java.util.Stack/1346942793"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["java.util.TooManyListenersException/2023078032"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TooManyListenersException;),
        @com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TooManyListenersException;)
      ];
    
    result["java.util.TreeMap/1493889780"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.TreeSet/4043497002"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeSet;)
      ];
    
    result["java.util.UUID/1602462489"] = [
        @com.google.gwt.user.client.rpc.core.java.util.UUID_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.UUID_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/UUID;),
        @com.google.gwt.user.client.rpc.core.java.util.UUID_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/UUID;)
      ];
    
    result["java.util.Vector/3057315478"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    result["java.util.logging.Level/2839552483"] = [
        @com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/logging/Level;),
        @com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/logging/Level;)
      ];
    
    result["java.util.logging.LogRecord/2492345967"] = [
        @com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/logging/LogRecord;),
        @com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/logging/LogRecord;)
      ];
    
    result["org.fusesource.restygwt.client.Json$Style/895358586"] = [
        @org.fusesource.restygwt.client.Json_Style_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.fusesource.restygwt.client.Json_Style_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/fusesource/restygwt/client/Json$Style;),
        @org.fusesource.restygwt.client.Json_Style_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/fusesource/restygwt/client/Json$Style;)
      ];
    
    result["org.gwtbootstrap3.client.ui.ModalSize/2147129378"] = [
        @org.gwtbootstrap3.client.ui.ModalSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.ModalSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/ModalSize;),
        @org.gwtbootstrap3.client.ui.ModalSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/ModalSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.AlertType/1636077610"] = [
        @org.gwtbootstrap3.client.ui.constants.AlertType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.AlertType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/AlertType;),
        @org.gwtbootstrap3.client.ui.constants.AlertType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/AlertType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.Alignment/1771331551"] = [
        @org.gwtbootstrap3.client.ui.constants.Alignment_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.Alignment_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/Alignment;),
        @org.gwtbootstrap3.client.ui.constants.Alignment_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/Alignment;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.BadgePosition/3996546920"] = [
        @org.gwtbootstrap3.client.ui.constants.BadgePosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.BadgePosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/BadgePosition;),
        @org.gwtbootstrap3.client.ui.constants.BadgePosition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/BadgePosition;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ButtonDismiss/2563178806"] = [
        @org.gwtbootstrap3.client.ui.constants.ButtonDismiss_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ButtonDismiss_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ButtonDismiss;),
        @org.gwtbootstrap3.client.ui.constants.ButtonDismiss_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ButtonDismiss;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ButtonGroupSize/313839071"] = [
        @org.gwtbootstrap3.client.ui.constants.ButtonGroupSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ButtonGroupSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ButtonGroupSize;),
        @org.gwtbootstrap3.client.ui.constants.ButtonGroupSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ButtonGroupSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ButtonSize/347638960"] = [
        @org.gwtbootstrap3.client.ui.constants.ButtonSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ButtonSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ButtonSize;),
        @org.gwtbootstrap3.client.ui.constants.ButtonSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ButtonSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ButtonType/765164003"] = [
        @org.gwtbootstrap3.client.ui.constants.ButtonType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ButtonType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ButtonType;),
        @org.gwtbootstrap3.client.ui.constants.ButtonType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ButtonType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ColumnOffset/116165412"] = [
        @org.gwtbootstrap3.client.ui.constants.ColumnOffset_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ColumnOffset_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ColumnOffset;),
        @org.gwtbootstrap3.client.ui.constants.ColumnOffset_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ColumnOffset;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ColumnPull/2209414238"] = [
        @org.gwtbootstrap3.client.ui.constants.ColumnPull_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ColumnPull_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ColumnPull;),
        @org.gwtbootstrap3.client.ui.constants.ColumnPull_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ColumnPull;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ColumnPush/2100114568"] = [
        @org.gwtbootstrap3.client.ui.constants.ColumnPush_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ColumnPush_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ColumnPush;),
        @org.gwtbootstrap3.client.ui.constants.ColumnPush_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ColumnPush;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ColumnSize/1746838281"] = [
        @org.gwtbootstrap3.client.ui.constants.ColumnSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ColumnSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ColumnSize;),
        @org.gwtbootstrap3.client.ui.constants.ColumnSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ColumnSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ContextualBackground/1955812303"] = [
        @org.gwtbootstrap3.client.ui.constants.ContextualBackground_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ContextualBackground_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ContextualBackground;),
        @org.gwtbootstrap3.client.ui.constants.ContextualBackground_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ContextualBackground;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.DeviceSize/1387155296"] = [
        @org.gwtbootstrap3.client.ui.constants.DeviceSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.DeviceSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/DeviceSize;),
        @org.gwtbootstrap3.client.ui.constants.DeviceSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/DeviceSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.Emphasis/2660858784"] = [
        @org.gwtbootstrap3.client.ui.constants.Emphasis_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.Emphasis_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/Emphasis;),
        @org.gwtbootstrap3.client.ui.constants.Emphasis_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/Emphasis;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.FormGroupSize/21416311"] = [
        @org.gwtbootstrap3.client.ui.constants.FormGroupSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.FormGroupSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/FormGroupSize;),
        @org.gwtbootstrap3.client.ui.constants.FormGroupSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/FormGroupSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.FormType/849347587"] = [
        @org.gwtbootstrap3.client.ui.constants.FormType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.FormType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/FormType;),
        @org.gwtbootstrap3.client.ui.constants.FormType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/FormType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.HeadingSize/3881538646"] = [
        @org.gwtbootstrap3.client.ui.constants.HeadingSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.HeadingSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/HeadingSize;),
        @org.gwtbootstrap3.client.ui.constants.HeadingSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/HeadingSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.IconFlip/2354696101"] = [
        @org.gwtbootstrap3.client.ui.constants.IconFlip_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.IconFlip_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/IconFlip;),
        @org.gwtbootstrap3.client.ui.constants.IconFlip_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/IconFlip;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.IconPosition/3441177690"] = [
        @org.gwtbootstrap3.client.ui.constants.IconPosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.IconPosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/IconPosition;),
        @org.gwtbootstrap3.client.ui.constants.IconPosition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/IconPosition;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.IconRotate/2301682682"] = [
        @org.gwtbootstrap3.client.ui.constants.IconRotate_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.IconRotate_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/IconRotate;),
        @org.gwtbootstrap3.client.ui.constants.IconRotate_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/IconRotate;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.IconSize/2914124279"] = [
        @org.gwtbootstrap3.client.ui.constants.IconSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.IconSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/IconSize;),
        @org.gwtbootstrap3.client.ui.constants.IconSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/IconSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.IconType/2171808626"] = [
        @org.gwtbootstrap3.client.ui.constants.IconType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.IconType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/IconType;),
        @org.gwtbootstrap3.client.ui.constants.IconType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/IconType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ImageType/1221058296"] = [
        @org.gwtbootstrap3.client.ui.constants.ImageType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ImageType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ImageType;),
        @org.gwtbootstrap3.client.ui.constants.ImageType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ImageType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.InputGroupSize/2326742103"] = [
        @org.gwtbootstrap3.client.ui.constants.InputGroupSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.InputGroupSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/InputGroupSize;),
        @org.gwtbootstrap3.client.ui.constants.InputGroupSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/InputGroupSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.InputSize/1929687441"] = [
        @org.gwtbootstrap3.client.ui.constants.InputSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.InputSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/InputSize;),
        @org.gwtbootstrap3.client.ui.constants.InputSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/InputSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.InputType/458698927"] = [
        @org.gwtbootstrap3.client.ui.constants.InputType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.InputType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/InputType;),
        @org.gwtbootstrap3.client.ui.constants.InputType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/InputType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.LabelType/94017299"] = [
        @org.gwtbootstrap3.client.ui.constants.LabelType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.LabelType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/LabelType;),
        @org.gwtbootstrap3.client.ui.constants.LabelType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/LabelType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ListGroupItemType/4041901989"] = [
        @org.gwtbootstrap3.client.ui.constants.ListGroupItemType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ListGroupItemType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ListGroupItemType;),
        @org.gwtbootstrap3.client.ui.constants.ListGroupItemType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ListGroupItemType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ModalBackdrop/1057050077"] = [
        @org.gwtbootstrap3.client.ui.constants.ModalBackdrop_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ModalBackdrop_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ModalBackdrop;),
        @org.gwtbootstrap3.client.ui.constants.ModalBackdrop_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ModalBackdrop;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.NavbarPosition/392266708"] = [
        @org.gwtbootstrap3.client.ui.constants.NavbarPosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.NavbarPosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/NavbarPosition;),
        @org.gwtbootstrap3.client.ui.constants.NavbarPosition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/NavbarPosition;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.NavbarPull/2969440698"] = [
        @org.gwtbootstrap3.client.ui.constants.NavbarPull_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.NavbarPull_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/NavbarPull;),
        @org.gwtbootstrap3.client.ui.constants.NavbarPull_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/NavbarPull;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.NavbarType/622358470"] = [
        @org.gwtbootstrap3.client.ui.constants.NavbarType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.NavbarType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/NavbarType;),
        @org.gwtbootstrap3.client.ui.constants.NavbarType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/NavbarType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.PaginationSize/149394892"] = [
        @org.gwtbootstrap3.client.ui.constants.PaginationSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.PaginationSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/PaginationSize;),
        @org.gwtbootstrap3.client.ui.constants.PaginationSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/PaginationSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.PanelType/1479391277"] = [
        @org.gwtbootstrap3.client.ui.constants.PanelType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.PanelType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/PanelType;),
        @org.gwtbootstrap3.client.ui.constants.PanelType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/PanelType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.Placement/1758553133"] = [
        @org.gwtbootstrap3.client.ui.constants.Placement_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.Placement_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/Placement;),
        @org.gwtbootstrap3.client.ui.constants.Placement_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/Placement;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ProgressBarType/2352050686"] = [
        @org.gwtbootstrap3.client.ui.constants.ProgressBarType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ProgressBarType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ProgressBarType;),
        @org.gwtbootstrap3.client.ui.constants.ProgressBarType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ProgressBarType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ProgressType/3431109222"] = [
        @org.gwtbootstrap3.client.ui.constants.ProgressType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ProgressType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ProgressType;),
        @org.gwtbootstrap3.client.ui.constants.ProgressType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ProgressType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.Pull/1394081837"] = [
        @org.gwtbootstrap3.client.ui.constants.Pull_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.Pull_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/Pull;),
        @org.gwtbootstrap3.client.ui.constants.Pull_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/Pull;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.Responsiveness/2513113237"] = [
        @org.gwtbootstrap3.client.ui.constants.Responsiveness_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.Responsiveness_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/Responsiveness;),
        @org.gwtbootstrap3.client.ui.constants.Responsiveness_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/Responsiveness;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.Spy/1479946371"] = [
        @org.gwtbootstrap3.client.ui.constants.Spy_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.Spy_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/Spy;),
        @org.gwtbootstrap3.client.ui.constants.Spy_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/Spy;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.TabPosition/1874433980"] = [
        @org.gwtbootstrap3.client.ui.constants.TabPosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.TabPosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/TabPosition;),
        @org.gwtbootstrap3.client.ui.constants.TabPosition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/TabPosition;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.TableType/1553517271"] = [
        @org.gwtbootstrap3.client.ui.constants.TableType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.TableType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/TableType;),
        @org.gwtbootstrap3.client.ui.constants.TableType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/TableType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.Toggle/3396410580"] = [
        @org.gwtbootstrap3.client.ui.constants.Toggle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.Toggle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/Toggle;),
        @org.gwtbootstrap3.client.ui.constants.Toggle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/Toggle;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.Trigger/3871512988"] = [
        @org.gwtbootstrap3.client.ui.constants.Trigger_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.Trigger_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/Trigger;),
        @org.gwtbootstrap3.client.ui.constants.Trigger_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/Trigger;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.TypeAttrType/1369504142"] = [
        @org.gwtbootstrap3.client.ui.constants.TypeAttrType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.TypeAttrType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/TypeAttrType;),
        @org.gwtbootstrap3.client.ui.constants.TypeAttrType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/TypeAttrType;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.ValidationState/3036419144"] = [
        @org.gwtbootstrap3.client.ui.constants.ValidationState_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.ValidationState_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/ValidationState;),
        @org.gwtbootstrap3.client.ui.constants.ValidationState_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/ValidationState;)
      ];
    
    result["org.gwtbootstrap3.client.ui.constants.WellSize/1623867639"] = [
        @org.gwtbootstrap3.client.ui.constants.WellSize_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.constants.WellSize_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/constants/WellSize;),
        @org.gwtbootstrap3.client.ui.constants.WellSize_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/constants/WellSize;)
      ];
    
    result["org.gwtbootstrap3.client.ui.form.error.ErrorHandlerType/1860599828"] = [
        @org.gwtbootstrap3.client.ui.form.error.ErrorHandlerType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.gwtbootstrap3.client.ui.form.error.ErrorHandlerType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/gwtbootstrap3/client/ui/form/error/ErrorHandlerType;),
        @org.gwtbootstrap3.client.ui.form.error.ErrorHandlerType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/gwtbootstrap3/client/ui/form/error/ErrorHandlerType;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Animation$Easing/3735069525"] = [
        @org.moxieapps.gwt.highcharts.client.Animation_Easing_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Animation_Easing_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Animation$Easing;),
        @org.moxieapps.gwt.highcharts.client.Animation_Easing_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Animation$Easing;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Axis$TickPosition/1010371333"] = [
        @org.moxieapps.gwt.highcharts.client.Axis_TickPosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Axis_TickPosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Axis$TickPosition;),
        @org.moxieapps.gwt.highcharts.client.Axis_TickPosition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Axis$TickPosition;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Axis$Type/4207514151"] = [
        @org.moxieapps.gwt.highcharts.client.Axis_Type_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Axis_Type_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Axis$Type;),
        @org.moxieapps.gwt.highcharts.client.Axis_Type_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Axis$Type;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Axis$WeekDay/3580146343"] = [
        @org.moxieapps.gwt.highcharts.client.Axis_WeekDay_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Axis_WeekDay_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Axis$WeekDay;),
        @org.moxieapps.gwt.highcharts.client.Axis_WeekDay_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Axis$WeekDay;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.AxisTitle$Align/2164109409"] = [
        @org.moxieapps.gwt.highcharts.client.AxisTitle_Align_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.AxisTitle_Align_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/AxisTitle$Align;),
        @org.moxieapps.gwt.highcharts.client.AxisTitle_Align_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/AxisTitle$Align;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.BaseChart$PinchType/2530541518"] = [
        @org.moxieapps.gwt.highcharts.client.BaseChart_PinchType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.BaseChart_PinchType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/BaseChart$PinchType;),
        @org.moxieapps.gwt.highcharts.client.BaseChart_PinchType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/BaseChart$PinchType;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.BaseChart$ZoomType/44055760"] = [
        @org.moxieapps.gwt.highcharts.client.BaseChart_ZoomType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.BaseChart_ZoomType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/BaseChart$ZoomType;),
        @org.moxieapps.gwt.highcharts.client.BaseChart_ZoomType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/BaseChart$ZoomType;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Button$Align/3456588153"] = [
        @org.moxieapps.gwt.highcharts.client.Button_Align_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Button_Align_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Button$Align;),
        @org.moxieapps.gwt.highcharts.client.Button_Align_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Button$Align;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Button$VerticalAlign/2446340888"] = [
        @org.moxieapps.gwt.highcharts.client.Button_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Button_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Button$VerticalAlign;),
        @org.moxieapps.gwt.highcharts.client.Button_VerticalAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Button$VerticalAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Chart$PanKey/2391337624"] = [
        @org.moxieapps.gwt.highcharts.client.Chart_PanKey_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Chart_PanKey_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Chart$PanKey;),
        @org.moxieapps.gwt.highcharts.client.Chart_PanKey_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Chart$PanKey;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Chart$ZoomType/2512909599"] = [
        @org.moxieapps.gwt.highcharts.client.Chart_ZoomType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Chart_ZoomType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Chart$ZoomType;),
        @org.moxieapps.gwt.highcharts.client.Chart_ZoomType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Chart$ZoomType;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.ChartTitle$Align/2232980280"] = [
        @org.moxieapps.gwt.highcharts.client.ChartTitle_Align_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.ChartTitle_Align_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/ChartTitle$Align;),
        @org.moxieapps.gwt.highcharts.client.ChartTitle_Align_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/ChartTitle$Align;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.ChartTitle$VerticalAlign/3240749240"] = [
        @org.moxieapps.gwt.highcharts.client.ChartTitle_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.ChartTitle_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/ChartTitle$VerticalAlign;),
        @org.moxieapps.gwt.highcharts.client.ChartTitle_VerticalAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/ChartTitle$VerticalAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.ColorAxis$DataClassColor/2298622042"] = [
        @org.moxieapps.gwt.highcharts.client.ColorAxis_DataClassColor_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.ColorAxis_DataClassColor_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/ColorAxis$DataClassColor;),
        @org.moxieapps.gwt.highcharts.client.ColorAxis_DataClassColor_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/ColorAxis$DataClassColor;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.ColorAxis$TickPosition/1578667054"] = [
        @org.moxieapps.gwt.highcharts.client.ColorAxis_TickPosition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.ColorAxis_TickPosition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/ColorAxis$TickPosition;),
        @org.moxieapps.gwt.highcharts.client.ColorAxis_TickPosition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/ColorAxis$TickPosition;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.ContextButton$Symbol/3570721933"] = [
        @org.moxieapps.gwt.highcharts.client.ContextButton_Symbol_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.ContextButton_Symbol_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/ContextButton$Symbol;),
        @org.moxieapps.gwt.highcharts.client.ContextButton_Symbol_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/ContextButton$Symbol;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Credits$Align/417185484"] = [
        @org.moxieapps.gwt.highcharts.client.Credits_Align_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Credits_Align_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Credits$Align;),
        @org.moxieapps.gwt.highcharts.client.Credits_Align_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Credits$Align;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Credits$VerticalAlign/2094122738"] = [
        @org.moxieapps.gwt.highcharts.client.Credits_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Credits_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Credits$VerticalAlign;),
        @org.moxieapps.gwt.highcharts.client.Credits_VerticalAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Credits$VerticalAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Exporting$Type/2214413220"] = [
        @org.moxieapps.gwt.highcharts.client.Exporting_Type_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Exporting_Type_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Exporting$Type;),
        @org.moxieapps.gwt.highcharts.client.Exporting_Type_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Exporting$Type;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Legend$Align/2237269823"] = [
        @org.moxieapps.gwt.highcharts.client.Legend_Align_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Legend_Align_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Legend$Align;),
        @org.moxieapps.gwt.highcharts.client.Legend_Align_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Legend$Align;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Legend$Layout/1792407694"] = [
        @org.moxieapps.gwt.highcharts.client.Legend_Layout_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Legend_Layout_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Legend$Layout;),
        @org.moxieapps.gwt.highcharts.client.Legend_Layout_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Legend$Layout;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Legend$VerticalAlign/2465929449"] = [
        @org.moxieapps.gwt.highcharts.client.Legend_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Legend_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Legend$VerticalAlign;),
        @org.moxieapps.gwt.highcharts.client.Legend_VerticalAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Legend$VerticalAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.MapNavigation$AlignTo/3547562634"] = [
        @org.moxieapps.gwt.highcharts.client.MapNavigation_AlignTo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.MapNavigation_AlignTo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/MapNavigation$AlignTo;),
        @org.moxieapps.gwt.highcharts.client.MapNavigation_AlignTo_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/MapNavigation$AlignTo;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.PaneBackground$Shape/1048059041"] = [
        @org.moxieapps.gwt.highcharts.client.PaneBackground_Shape_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.PaneBackground_Shape_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/PaneBackground$Shape;),
        @org.moxieapps.gwt.highcharts.client.PaneBackground_Shape_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/PaneBackground$Shape;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.PlotLine$DashStyle/2523597544"] = [
        @org.moxieapps.gwt.highcharts.client.PlotLine_DashStyle_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.PlotLine_DashStyle_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/PlotLine$DashStyle;),
        @org.moxieapps.gwt.highcharts.client.PlotLine_DashStyle_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/PlotLine$DashStyle;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.RangeSelector$Align/3965187701"] = [
        @org.moxieapps.gwt.highcharts.client.RangeSelector_Align_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.RangeSelector_Align_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/RangeSelector$Align;),
        @org.moxieapps.gwt.highcharts.client.RangeSelector_Align_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/RangeSelector$Align;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.RangeSelector$ButtonType/2001461292"] = [
        @org.moxieapps.gwt.highcharts.client.RangeSelector_ButtonType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.RangeSelector_ButtonType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/RangeSelector$ButtonType;),
        @org.moxieapps.gwt.highcharts.client.RangeSelector_ButtonType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/RangeSelector$ButtonType;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.RangeSelector$VerticalAlign/3222532419"] = [
        @org.moxieapps.gwt.highcharts.client.RangeSelector_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.RangeSelector_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/RangeSelector$VerticalAlign;),
        @org.moxieapps.gwt.highcharts.client.RangeSelector_VerticalAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/RangeSelector$VerticalAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.ResetZoomButton$RelativeTo/1078293971"] = [
        @org.moxieapps.gwt.highcharts.client.ResetZoomButton_RelativeTo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.ResetZoomButton_RelativeTo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/ResetZoomButton$RelativeTo;),
        @org.moxieapps.gwt.highcharts.client.ResetZoomButton_RelativeTo_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/ResetZoomButton$RelativeTo;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.Series$Type/1606148214"] = [
        @org.moxieapps.gwt.highcharts.client.Series_Type_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.Series_Type_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/Series$Type;),
        @org.moxieapps.gwt.highcharts.client.Series_Type_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/Series$Type;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.XAxis$TickmarkPlacement/261369144"] = [
        @org.moxieapps.gwt.highcharts.client.XAxis_TickmarkPlacement_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.XAxis_TickmarkPlacement_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/XAxis$TickmarkPlacement;),
        @org.moxieapps.gwt.highcharts.client.XAxis_TickmarkPlacement_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/XAxis$TickmarkPlacement;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.labels.Labels$Align/3277164253"] = [
        @org.moxieapps.gwt.highcharts.client.labels.Labels_Align_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.labels.Labels_Align_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/labels/Labels$Align;),
        @org.moxieapps.gwt.highcharts.client.labels.Labels_Align_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/labels/Labels$Align;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.labels.Labels$VerticalAlign/2595725691"] = [
        @org.moxieapps.gwt.highcharts.client.labels.Labels_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.labels.Labels_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/labels/Labels$VerticalAlign;),
        @org.moxieapps.gwt.highcharts.client.labels.Labels_VerticalAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/labels/Labels$VerticalAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel$Align/1250742720"] = [
        @org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel_Align_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel_Align_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/labels/PlotBandLabel$Align;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel_Align_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/labels/PlotBandLabel$Align;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel$TextAlign/2848886158"] = [
        @org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel_TextAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel_TextAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/labels/PlotBandLabel$TextAlign;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel_TextAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/labels/PlotBandLabel$TextAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel$VerticalAlign/559121371"] = [
        @org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/labels/PlotBandLabel$VerticalAlign;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel_VerticalAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/labels/PlotBandLabel$VerticalAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel$Align/1005083410"] = [
        @org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_Align_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_Align_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/labels/PlotLineLabel$Align;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_Align_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/labels/PlotLineLabel$Align;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel$TextAlign/4020407747"] = [
        @org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_TextAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_TextAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/labels/PlotLineLabel$TextAlign;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_TextAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/labels/PlotLineLabel$TextAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel$VerticalAlign/517653301"] = [
        @org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/labels/PlotLineLabel$VerticalAlign;),
        @org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel_VerticalAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/labels/PlotLineLabel$VerticalAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.labels.StackLabels$VerticalAlign/3080174185"] = [
        @org.moxieapps.gwt.highcharts.client.labels.StackLabels_VerticalAlign_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.labels.StackLabels_VerticalAlign_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/labels/StackLabels$VerticalAlign;),
        @org.moxieapps.gwt.highcharts.client.labels.StackLabels_VerticalAlign_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/labels/StackLabels$VerticalAlign;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping$Approximation/3237336384"] = [
        @org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping_Approximation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping_Approximation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/plotOptions/DataGrouping$Approximation;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping_Approximation_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/plotOptions/DataGrouping$Approximation;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.plotOptions.FlagPlotOptions$Shape/2361091966"] = [
        @org.moxieapps.gwt.highcharts.client.plotOptions.FlagPlotOptions_Shape_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.FlagPlotOptions_Shape_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/plotOptions/FlagPlotOptions$Shape;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.FlagPlotOptions_Shape_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/plotOptions/FlagPlotOptions$Shape;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.plotOptions.LinePlotOptions$Compare/2141346721"] = [
        @org.moxieapps.gwt.highcharts.client.plotOptions.LinePlotOptions_Compare_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.LinePlotOptions_Compare_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/plotOptions/LinePlotOptions$Compare;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.LinePlotOptions_Compare_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/plotOptions/LinePlotOptions$Compare;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.plotOptions.Marker$Symbol/4197506872"] = [
        @org.moxieapps.gwt.highcharts.client.plotOptions.Marker_Symbol_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.Marker_Symbol_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/plotOptions/Marker$Symbol;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.Marker_Symbol_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/plotOptions/Marker$Symbol;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions$Cursor/2484737786"] = [
        @org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_Cursor_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_Cursor_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/plotOptions/PlotOptions$Cursor;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_Cursor_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/plotOptions/PlotOptions$Cursor;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions$PointPlacement/1752182582"] = [
        @org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_PointPlacement_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_PointPlacement_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/plotOptions/PlotOptions$PointPlacement;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_PointPlacement_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/plotOptions/PlotOptions$PointPlacement;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions$Stacking/3629364835"] = [
        @org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_Stacking_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_Stacking_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/plotOptions/PlotOptions$Stacking;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions_Stacking_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/plotOptions/PlotOptions$Stacking;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions$LayoutAlgorithm/4168493263"] = [
        @org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutAlgorithm_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutAlgorithm_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/plotOptions/TreemapPlotOptions$LayoutAlgorithm;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutAlgorithm_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/plotOptions/TreemapPlotOptions$LayoutAlgorithm;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions$LayoutStartingDirection/1785705584"] = [
        @org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutStartingDirection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutStartingDirection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/plotOptions/TreemapPlotOptions$LayoutStartingDirection;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions_LayoutStartingDirection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/plotOptions/TreemapPlotOptions$LayoutStartingDirection;)
      ];
    
    result["org.moxieapps.gwt.highcharts.client.plotOptions.Zone$Axis/1009473604"] = [
        @org.moxieapps.gwt.highcharts.client.plotOptions.Zone_Axis_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.Zone_Axis_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/moxieapps/gwt/highcharts/client/plotOptions/Zone$Axis;),
        @org.moxieapps.gwt.highcharts.client.plotOptions.Zone_Axis_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/moxieapps/gwt/highcharts/client/plotOptions/Zone$Axis;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException::class)] = "com.github.nmorel.gwtjackson.client.exception.JsonDeserializationException/2761891166";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.github.nmorel.gwtjackson.client.exception.JsonMappingException::class)] = "com.github.nmorel.gwtjackson.client.exception.JsonMappingException/1609301265";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.github.nmorel.gwtjackson.client.exception.JsonSerializationException::class)] = "com.github.nmorel.gwtjackson.client.exception.JsonSerializationException/1192494644";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.github.nmorel.gwtjackson.client.stream.JsonToken::class)] = "com.github.nmorel.gwtjackson.client.stream.JsonToken/3241000856";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException::class)] = "com.github.nmorel.gwtjackson.client.stream.impl.MalformedJsonException/2002326338";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.AutocompleteValue::class)] = "com.google.gwt.aria.client.AutocompleteValue/1925551446";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.CheckedValue::class)] = "com.google.gwt.aria.client.CheckedValue/768347454";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.DropeffectValue::class)] = "com.google.gwt.aria.client.DropeffectValue/3176917350";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.ExpandedValue::class)] = "com.google.gwt.aria.client.ExpandedValue/3762568014";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.GrabbedValue::class)] = "com.google.gwt.aria.client.GrabbedValue/331842861";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.InvalidValue::class)] = "com.google.gwt.aria.client.InvalidValue/1948907690";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.LiveValue::class)] = "com.google.gwt.aria.client.LiveValue/3541140001";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.OrientationValue::class)] = "com.google.gwt.aria.client.OrientationValue/3117542483";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.PressedValue::class)] = "com.google.gwt.aria.client.PressedValue/4264355363";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.RelevantValue::class)] = "com.google.gwt.aria.client.RelevantValue/115378802";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.SelectedValue::class)] = "com.google.gwt.aria.client.SelectedValue/3013847655";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.aria.client.SortValue::class)] = "com.google.gwt.aria.client.SortValue/3178211337";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.Composite::class)] = "com.google.gwt.canvas.dom.client.Context2d$Composite/18929677";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.LineCap::class)] = "com.google.gwt.canvas.dom.client.Context2d$LineCap/429792263";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.LineJoin::class)] = "com.google.gwt.canvas.dom.client.Context2d$LineJoin/2210915141";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.Repetition::class)] = "com.google.gwt.canvas.dom.client.Context2d$Repetition/4129637252";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.TextAlign::class)] = "com.google.gwt.canvas.dom.client.Context2d$TextAlign/2376656572";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.canvas.dom.client.Context2d.TextBaseline::class)] = "com.google.gwt.canvas.dom.client.Context2d$TextBaseline/658509555";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.cell.client.ButtonCellBase.Decoration::class)] = "com.google.gwt.cell.client.ButtonCellBase$Decoration/4176385646";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.core.client.CodeDownloadException.Reason::class)] = "com.google.gwt.core.client.CodeDownloadException$Reason/1932184584";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.core.client.impl.SerializableThrowable::class)] = "com.google.gwt.core.client.impl.SerializableThrowable/3563828140";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.core.shared.SerializableThrowable::class)] = "com.google.gwt.core.shared.SerializableThrowable/2791287161";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.BorderStyle::class)] = "com.google.gwt.dom.client.Style$BorderStyle/3150101049";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Clear::class)] = "com.google.gwt.dom.client.Style$Clear/2112927382";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Cursor::class)] = "com.google.gwt.dom.client.Style$Cursor/1026777009";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Display::class)] = "com.google.gwt.dom.client.Style$Display/723716105";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Float::class)] = "com.google.gwt.dom.client.Style$Float/1707775544";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.FontStyle::class)] = "com.google.gwt.dom.client.Style$FontStyle/4060934115";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.FontWeight::class)] = "com.google.gwt.dom.client.Style$FontWeight/33706534";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.ListStyleType::class)] = "com.google.gwt.dom.client.Style$ListStyleType/3802079421";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.OutlineStyle::class)] = "com.google.gwt.dom.client.Style$OutlineStyle/1758908680";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Overflow::class)] = "com.google.gwt.dom.client.Style$Overflow/356058891";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Position::class)] = "com.google.gwt.dom.client.Style$Position/2832938336";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.TableLayout::class)] = "com.google.gwt.dom.client.Style$TableLayout/2147313447";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.TextAlign::class)] = "com.google.gwt.dom.client.Style$TextAlign/1644464014";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.TextDecoration::class)] = "com.google.gwt.dom.client.Style$TextDecoration/3728028595";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.TextJustify::class)] = "com.google.gwt.dom.client.Style$TextJustify/743471844";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.TextOverflow::class)] = "com.google.gwt.dom.client.Style$TextOverflow/4060207849";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.TextTransform::class)] = "com.google.gwt.dom.client.Style$TextTransform/3353539122";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Unit::class)] = "com.google.gwt.dom.client.Style$Unit/84355486";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.VerticalAlign::class)] = "com.google.gwt.dom.client.Style$VerticalAlign/3048118721";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.Visibility::class)] = "com.google.gwt.dom.client.Style$Visibility/3536973088";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.dom.client.Style.WhiteSpace::class)] = "com.google.gwt.dom.client.Style$WhiteSpace/3895437819";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.event.shared.UmbrellaException::class)] = "com.google.gwt.event.shared.UmbrellaException/3104463596";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.http.client.RequestException::class)] = "com.google.gwt.http.client.RequestException/190587325";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.DateTimeFormat.PredefinedFormat::class)] = "com.google.gwt.i18n.client.DateTimeFormat$PredefinedFormat/3956695956";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.HasDirection.Direction::class)] = "com.google.gwt.i18n.client.HasDirection$Direction/586671123";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat::class)] = "com.google.gwt.i18n.shared.DateTimeFormat$PredefinedFormat/77296891";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.shared.impl.DateRecord::class)] = "com.google.gwt.i18n.shared.impl.DateRecord/3375188634";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.json.client.JSONException::class)] = "com.google.gwt.json.client.JSONException/2941795468";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.jsonp.client.TimeoutException::class)] = "com.google.gwt.jsonp.client.TimeoutException/1112787596";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.layout.client.Layout.Alignment::class)] = "com.google.gwt.layout.client.Layout$Alignment/2527392528";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.resources.client.ImageResource.RepeatStyle::class)] = "com.google.gwt.resources.client.ImageResource$RepeatStyle/1206724650";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.safecss.shared.SafeStylesString::class)] = "com.google.gwt.safecss.shared.SafeStylesString/1334499262";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.safehtml.shared.SafeHtmlString::class)] = "com.google.gwt.safehtml.shared.SafeHtmlString/235635043";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy.KeyboardPagingPolicy::class)] = "com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy$KeyboardPagingPolicy/2634835889";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy::class)] = "com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy$KeyboardSelectionPolicy/456638159";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.cellview.client.RowHoverEvent.HoveringScope::class)] = "com.google.gwt.user.cellview.client.RowHoverEvent$HoveringScope/2300783195";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.cellview.client.SimplePager.TextLocation::class)] = "com.google.gwt.user.cellview.client.SimplePager$TextLocation/2815715189";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.DocumentModeAsserter.Severity::class)] = "com.google.gwt.user.client.DocumentModeAsserter$Severity/362743079";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializableException::class)] = "com.google.gwt.user.client.rpc.SerializableException/3047383460";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializationException::class)] = "com.google.gwt.user.client.rpc.SerializationException/2836333220";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializedTypeViolationException::class)] = "com.google.gwt.user.client.rpc.SerializedTypeViolationException/914601580";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.ServiceDefTarget.NoServiceEntryPointSpecifiedException::class)] = "com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader::class)] = "com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter$ResponseReader/3896068654";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ChangeListenerCollection::class)] = "com.google.gwt.user.client.ui.ChangeListenerCollection/287642957";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ClickListenerCollection::class)] = "com.google.gwt.user.client.ui.ClickListenerCollection/2152455986";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.DockLayoutPanel.Direction::class)] = "com.google.gwt.user.client.ui.DockLayoutPanel$Direction/1397005836";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FocusListenerCollection::class)] = "com.google.gwt.user.client.ui.FocusListenerCollection/119490835";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FormHandlerCollection::class)] = "com.google.gwt.user.client.ui.FormHandlerCollection/3088681894";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.KeyboardListenerCollection::class)] = "com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.LoadListenerCollection::class)] = "com.google.gwt.user.client.ui.LoadListenerCollection/3174178888";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseListenerCollection/465158911";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseWheelListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseWheelListenerCollection/370304552";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MultiWordSuggestOracle.MultiWordSuggestion::class)] = "com.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion/2803420099";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MultiWordSuggestOracle.MultiWordSuggestion[]::class)] = "[Lcom.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion;/1531882420";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.PopupListenerCollection::class)] = "com.google.gwt.user.client.ui.PopupListenerCollection/1920131050";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.PopupPanel.AnimationType::class)] = "com.google.gwt.user.client.ui.PopupPanel$AnimationType/3176768593";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ScrollListenerCollection::class)] = "com.google.gwt.user.client.ui.ScrollListenerCollection/210686268";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.SuggestOracle.Request::class)] = "com.google.gwt.user.client.ui.SuggestOracle$Request/3707347745";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.SuggestOracle.Response::class)] = "com.google.gwt.user.client.ui.SuggestOracle$Response/3840253928";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.SuggestOracle.Suggestion[]::class)] = "[Lcom.google.gwt.user.client.ui.SuggestOracle$Suggestion;/3224244884";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TabListenerCollection::class)] = "com.google.gwt.user.client.ui.TabListenerCollection/3768293299";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TableListenerCollection::class)] = "com.google.gwt.user.client.ui.TableListenerCollection/2254740473";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TreeListenerCollection::class)] = "com.google.gwt.user.client.ui.TreeListenerCollection/3716243734";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment::class)] = "com.google.gwt.user.client.ui.ValueBoxBase$TextAlignment/2654912399";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.validation.client.impl.ConstraintOrigin::class)] = "com.google.gwt.validation.client.impl.ConstraintOrigin/3366491330";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.view.client.DefaultSelectionEventManager.SelectAction::class)] = "com.google.gwt.view.client.DefaultSelectionEventManager$SelectAction/3087887111";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.view.client.Range::class)] = "com.google.gwt.view.client.Range/1471336945";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.xhr.client.XMLHttpRequest.ResponseType::class)] = "com.google.gwt.xhr.client.XMLHttpRequest$ResponseType/824406458";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.xml.client.impl.DOMParseException::class)] = "com.google.gwt.xml.client.impl.DOMParseException/3799120635";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.web.bindery.event.shared.UmbrellaException::class)] = "com.google.web.bindery.event.shared.UmbrellaException/1025846929";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.beans.BeanSet::class)] = "com.sapientarrow.gwtapp.shared.beans.BeanSet/864170362";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.beans.Test::class)] = "com.sapientarrow.gwtapp.shared.beans.Test/1096420907";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.beans.firs::class)] = "com.sapientarrow.gwtapp.shared.beans.firs/417539580";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO::class)] = "com.sapientarrow.gwtapp.shared.dto.AddedBeanDTO/1335219307";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO::class)] = "com.sapientarrow.gwtapp.shared.dto.AddedBeanPropertyDTO/1519408965";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO::class)] = "com.sapientarrow.gwtapp.shared.dto.AnnotationsDTO/2384942776";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO::class)] = "com.sapientarrow.gwtapp.shared.dto.BeanExceptionDTO/2179775848";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO::class)] = "com.sapientarrow.gwtapp.shared.dto.BeanObjectDTO/1954732187";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.dto.BindingsDTO::class)] = "com.sapientarrow.gwtapp.shared.dto.BindingsDTO/2015667196";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3::class)] = "com.sapientarrow.gwtapp.shared.entity.BeanSetChild3/3934785532";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4::class)] = "com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child4/4200208158";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child8::class)] = "com.sapientarrow.gwtapp.shared.entity.BeanSetChild3Child8/3269152738";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.entity.Beans::class)] = "com.sapientarrow.gwtapp.shared.entity.Beans/4256108783";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity::class)] = "com.sapientarrow.gwtapp.shared.entity.GlobalPreferencesEntity/1465785515";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.entity.MyAccountEntity::class)] = "com.sapientarrow.gwtapp.shared.entity.MyAccountEntity/3907803323";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity::class)] = "com.sapientarrow.gwtapp.shared.entity.MyAccountPreferencesEntity/2686000432";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity::class)] = "com.sapientarrow.gwtapp.shared.entity.NameSpaceEntity/2847995576";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.entity.RestEntity::class)] = "com.sapientarrow.gwtapp.shared.entity.RestEntity/1199117542";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.sapientarrow.gwtapp.shared.entity.UserEntity::class)] = "com.sapientarrow.gwtapp.shared.entity.UserEntity/4135867036";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Alignment::class)] = "com.smartgwt.client.types.Alignment/2059691798";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.AnimationAcceleration::class)] = "com.smartgwt.client.types.AnimationAcceleration/1030130908";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.AnimationEffect::class)] = "com.smartgwt.client.types.AnimationEffect/1745997804";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.AutoFitEvent::class)] = "com.smartgwt.client.types.AutoFitEvent/3347218727";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.AutoFitIconFieldType::class)] = "com.smartgwt.client.types.AutoFitIconFieldType/165308987";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.AutoFitWidthApproach::class)] = "com.smartgwt.client.types.AutoFitWidthApproach/1885313844";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.AutoSelectionModel::class)] = "com.smartgwt.client.types.AutoSelectionModel/2926672886";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Autofit::class)] = "com.smartgwt.client.types.Autofit/460799988";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Axis::class)] = "com.smartgwt.client.types.Axis/203209807";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.BkgndRepeat::class)] = "com.smartgwt.client.types.BkgndRepeat/1953695206";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.CharacterCasing::class)] = "com.smartgwt.client.types.CharacterCasing/563764124";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ChartType::class)] = "com.smartgwt.client.types.ChartType/1093124538";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ClickMaskMode::class)] = "com.smartgwt.client.types.ClickMaskMode/816615013";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ContentsType::class)] = "com.smartgwt.client.types.ContentsType/4027903048";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ControlName::class)] = "com.smartgwt.client.types.ControlName/2110942730";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.CriteriaCombineOperator::class)] = "com.smartgwt.client.types.CriteriaCombineOperator/985731300";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.CriteriaPolicy::class)] = "com.smartgwt.client.types.CriteriaPolicy/1231634951";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Cursor::class)] = "com.smartgwt.client.types.Cursor/2709488080";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DSDataFormat::class)] = "com.smartgwt.client.types.DSDataFormat/1520460056";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DSOperationType::class)] = "com.smartgwt.client.types.DSOperationType/2700575727";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DSProtocol::class)] = "com.smartgwt.client.types.DSProtocol/891422600";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DSServerType::class)] = "com.smartgwt.client.types.DSServerType/1335616997";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DateDisplayFormat::class)] = "com.smartgwt.client.types.DateDisplayFormat/3660476357";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DateItemSelectorFormat::class)] = "com.smartgwt.client.types.DateItemSelectorFormat/1637479457";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DialogButtons::class)] = "com.smartgwt.client.types.DialogButtons/3690681596";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Direction::class)] = "com.smartgwt.client.types.Direction/1041214416";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DisplayNodeType::class)] = "com.smartgwt.client.types.DisplayNodeType/3935504306";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DragAppearance::class)] = "com.smartgwt.client.types.DragAppearance/3679721516";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DragDataAction::class)] = "com.smartgwt.client.types.DragDataAction/841293788";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DragIntersectStyle::class)] = "com.smartgwt.client.types.DragIntersectStyle/3568880719";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DragTrackerMode::class)] = "com.smartgwt.client.types.DragTrackerMode/2481326892";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.DrawPosition::class)] = "com.smartgwt.client.types.DrawPosition/594986244";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.EditCompletionEvent::class)] = "com.smartgwt.client.types.EditCompletionEvent/456556858";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.EmbeddedPosition::class)] = "com.smartgwt.client.types.EmbeddedPosition/1196828721";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Encoding::class)] = "com.smartgwt.client.types.Encoding/86827910";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.EnterKeyEditAction::class)] = "com.smartgwt.client.types.EnterKeyEditAction/1393963638";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.EnumTranslateStrategy::class)] = "com.smartgwt.client.types.EnumTranslateStrategy/889823818";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.EscapeKeyEditAction::class)] = "com.smartgwt.client.types.EscapeKeyEditAction/656181998";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ExpansionMode::class)] = "com.smartgwt.client.types.ExpansionMode/895634532";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ExportDisplay::class)] = "com.smartgwt.client.types.ExportDisplay/1140697071";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ExportFormat::class)] = "com.smartgwt.client.types.ExportFormat/4016487000";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.FetchMode::class)] = "com.smartgwt.client.types.FetchMode/3226491226";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.FieldType::class)] = "com.smartgwt.client.types.FieldType/1065871080";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.FireStyle::class)] = "com.smartgwt.client.types.FireStyle/3237165587";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.FooterControls::class)] = "com.smartgwt.client.types.FooterControls/4221352374";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.FormErrorOrientation::class)] = "com.smartgwt.client.types.FormErrorOrientation/330364333";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.FormItemType::class)] = "com.smartgwt.client.types.FormItemType/2032166810";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.FormLayoutType::class)] = "com.smartgwt.client.types.FormLayoutType/2028340521";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.FormMethod::class)] = "com.smartgwt.client.types.FormMethod/3616284611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.GroupStartOpen::class)] = "com.smartgwt.client.types.GroupStartOpen/1101930971";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.HashAlgorithm::class)] = "com.smartgwt.client.types.HashAlgorithm/4162218006";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.HeaderControls::class)] = "com.smartgwt.client.types.HeaderControls/2401841894";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.HoverMode::class)] = "com.smartgwt.client.types.HoverMode/1555421795";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ImageStyle::class)] = "com.smartgwt.client.types.ImageStyle/3108665182";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.JSONCircularReferenceMode::class)] = "com.smartgwt.client.types.JSONCircularReferenceMode/1036888274";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.JSONDateFormat::class)] = "com.smartgwt.client.types.JSONDateFormat/1192233834";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.JSONInstanceSerializationMode::class)] = "com.smartgwt.client.types.JSONInstanceSerializationMode/1191038686";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.LayoutPolicy::class)] = "com.smartgwt.client.types.LayoutPolicy/3036893673";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.LayoutResizeBarPolicy::class)] = "com.smartgwt.client.types.LayoutResizeBarPolicy/3626081300";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ListGridEditEvent::class)] = "com.smartgwt.client.types.ListGridEditEvent/3886065023";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ListGridFieldType::class)] = "com.smartgwt.client.types.ListGridFieldType/2000039019";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.LoadState::class)] = "com.smartgwt.client.types.LoadState/37053401";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.LocatorStrategy::class)] = "com.smartgwt.client.types.LocatorStrategy/3925750836";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.LocatorTypeStrategy::class)] = "com.smartgwt.client.types.LocatorTypeStrategy/961391465";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.LogPriority::class)] = "com.smartgwt.client.types.LogPriority/1509208694";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.LogicalOperator::class)] = "com.smartgwt.client.types.LogicalOperator/3552004836";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.MenuFieldID::class)] = "com.smartgwt.client.types.MenuFieldID/3896245071";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.MultipleAppearance::class)] = "com.smartgwt.client.types.MultipleAppearance/251507130";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.NavigationMode::class)] = "com.smartgwt.client.types.NavigationMode/2618262723";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.OperatorId::class)] = "com.smartgwt.client.types.OperatorId/1374955218";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.OperatorValueType::class)] = "com.smartgwt.client.types.OperatorValueType/1765879087";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Orientation::class)] = "com.smartgwt.client.types.Orientation/577127793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Overflow::class)] = "com.smartgwt.client.types.Overflow/2773856450";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.PageEvent::class)] = "com.smartgwt.client.types.PageEvent/3642199904";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.PageOrientation::class)] = "com.smartgwt.client.types.PageOrientation/3310175191";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.PercentBoxModel::class)] = "com.smartgwt.client.types.PercentBoxModel/2221852492";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Positioning::class)] = "com.smartgwt.client.types.Positioning/2453663791";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.PromptStyle::class)] = "com.smartgwt.client.types.PromptStyle/1132304114";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.RPCTransport::class)] = "com.smartgwt.client.types.RPCTransport/3409442810";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.RecordComponentPoolingMode::class)] = "com.smartgwt.client.types.RecordComponentPoolingMode/2355959272";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.RecordLayout::class)] = "com.smartgwt.client.types.RecordLayout/2691907645";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.RecordSummaryFunctionType::class)] = "com.smartgwt.client.types.RecordSummaryFunctionType/4285856520";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.RowEndEditAction::class)] = "com.smartgwt.client.types.RowEndEditAction/2787188272";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.SQLPagingStrategy::class)] = "com.smartgwt.client.types.SQLPagingStrategy/3498555179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.SQLType::class)] = "com.smartgwt.client.types.SQLType/2911324845";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Selected::class)] = "com.smartgwt.client.types.Selected/1251796839";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.SelectionAppearance::class)] = "com.smartgwt.client.types.SelectionAppearance/199115397";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.SelectionBoundary::class)] = "com.smartgwt.client.types.SelectionBoundary/4002678833";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.SelectionStyle::class)] = "com.smartgwt.client.types.SelectionStyle/2974594097";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.SelectionType::class)] = "com.smartgwt.client.types.SelectionType/2471041809";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.SendMethod::class)] = "com.smartgwt.client.types.SendMethod/1862343157";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Side::class)] = "com.smartgwt.client.types.Side/288599021";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.SortArrow::class)] = "com.smartgwt.client.types.SortArrow/526858425";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.SortDirection::class)] = "com.smartgwt.client.types.SortDirection/1691533931";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.State::class)] = "com.smartgwt.client.types.State/2211996589";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.SummaryFunctionType::class)] = "com.smartgwt.client.types.SummaryFunctionType/3979365735";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.TabBarControls::class)] = "com.smartgwt.client.types.TabBarControls/1522657898";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.TabTitleEditEvent::class)] = "com.smartgwt.client.types.TabTitleEditEvent/1629386143";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.TableMode::class)] = "com.smartgwt.client.types.TableMode/992219322";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.TextAreaWrap::class)] = "com.smartgwt.client.types.TextAreaWrap/2234558247";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.TextMatchStyle::class)] = "com.smartgwt.client.types.TextMatchStyle/2435011120";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.TileLayoutPolicy::class)] = "com.smartgwt.client.types.TileLayoutPolicy/1739208210";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.TimeFormatter::class)] = "com.smartgwt.client.types.TimeFormatter/2306491366";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.TitleOrientation::class)] = "com.smartgwt.client.types.TitleOrientation/751650582";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.TopOperatorAppearance::class)] = "com.smartgwt.client.types.TopOperatorAppearance/2466608722";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.TreeModelType::class)] = "com.smartgwt.client.types.TreeModelType/66152375";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ValidationMode::class)] = "com.smartgwt.client.types.ValidationMode/1151982259";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ValidatorType::class)] = "com.smartgwt.client.types.ValidatorType/3999656904";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.VerticalAlignment::class)] = "com.smartgwt.client.types.VerticalAlignment/1960762003";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.ViewName::class)] = "com.smartgwt.client.types.ViewName/1093254564";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.Visibility::class)] = "com.smartgwt.client.types.Visibility/3238112137";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.smartgwt.client.types.VisibilityMode::class)] = "com.smartgwt.client.types.VisibilityMode/2429247622";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@gwtupload.client.IFileInput.FileInputType::class)] = "gwtupload.client.IFileInput$FileInputType/1833217677";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@gwtupload.client.IUploadStatus.CancelBehavior::class)] = "gwtupload.client.IUploadStatus$CancelBehavior/3007774437";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@gwtupload.client.IUploadStatus.Status::class)] = "gwtupload.client.IUploadStatus$Status/1552745995";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.io.IOException::class)] = "java.io.IOException/1159940531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.io.UnsupportedEncodingException::class)] = "java.io.UnsupportedEncodingException/1526756933";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArithmeticException::class)] = "java.lang.ArithmeticException/1539622151";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArrayIndexOutOfBoundsException::class)] = "java.lang.ArrayIndexOutOfBoundsException/600550433";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArrayStoreException::class)] = "java.lang.ArrayStoreException/3540507190";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.AssertionError::class)] = "java.lang.AssertionError/3490171458";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Byte::class)] = "java.lang.Byte/1571082439";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Character::class)] = "java.lang.Character/2663399736";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ClassCastException::class)] = "java.lang.ClassCastException/702295179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double::class)] = "java.lang.Double/858496421";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Error::class)] = "java.lang.Error/1331973429";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Exception::class)] = "java.lang.Exception/1920171873";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Float::class)] = "java.lang.Float/1718559123";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IllegalArgumentException::class)] = "java.lang.IllegalArgumentException/1755012560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IllegalStateException::class)] = "java.lang.IllegalStateException/1972187323";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IndexOutOfBoundsException::class)] = "java.lang.IndexOutOfBoundsException/2489527753";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long::class)] = "java.lang.Long/4227064769";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NegativeArraySizeException::class)] = "java.lang.NegativeArraySizeException/3846860241";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NoSuchMethodException::class)] = "java.lang.NoSuchMethodException/260969707";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NullPointerException::class)] = "java.lang.NullPointerException/1463492344";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NumberFormatException::class)] = "java.lang.NumberFormatException/3305228476";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.RuntimeException::class)] = "java.lang.RuntimeException/515124647";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Short::class)] = "java.lang.Short/551743396";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StackTraceElement::class)] = "java.lang.StackTraceElement/455763907";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StackTraceElement[]::class)] = "[Ljava.lang.StackTraceElement;/3867167983";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StringIndexOutOfBoundsException::class)] = "java.lang.StringIndexOutOfBoundsException/500777603";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Throwable::class)] = "java.lang.Throwable/2953622131";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.UnsupportedOperationException::class)] = "java.lang.UnsupportedOperationException/3744010015";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Void::class)] = "java.lang.Void/2139725816";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.AnnotationFormatError::class)] = "java.lang.annotation.AnnotationFormatError/2257184627";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.AnnotationTypeMismatchException::class)] = "java.lang.annotation.AnnotationTypeMismatchException/976205828";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.ElementType::class)] = "java.lang.annotation.ElementType/2567657504";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.RetentionPolicy::class)] = "java.lang.annotation.RetentionPolicy/3918071115";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.reflect.InvocationTargetException::class)] = "java.lang.reflect.InvocationTargetException/80424744";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.math.BigDecimal::class)] = "java.math.BigDecimal/8151472";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.math.BigInteger::class)] = "java.math.BigInteger/927293797";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.math.MathContext::class)] = "java.math.MathContext/1014811437";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.math.RoundingMode::class)] = "java.math.RoundingMode/4117623240";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.DigestException::class)] = "java.security.DigestException/629316798";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.GeneralSecurityException::class)] = "java.security.GeneralSecurityException/2669239907";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.NoSuchAlgorithmException::class)] = "java.security.NoSuchAlgorithmException/2892037213";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/730999118";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/1816797103";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/3040052672";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/4159755760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays.ArrayList::class)] = "java.util.Arrays$ArrayList/2507071751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyList::class)] = "java.util.Collections$EmptyList/4157118744";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyMap::class)] = "java.util.Collections$EmptyMap/4174664486";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptySet::class)] = "java.util.Collections$EmptySet/3523698179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.SingletonList::class)] = "java.util.Collections$SingletonList/1586180994";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ConcurrentModificationException::class)] = "java.util.ConcurrentModificationException/2717383897";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/3385151746";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.EmptyStackException::class)] = "java.util.EmptyStackException/89438517";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.EnumMap::class)] = "java.util.EnumMap/1826390227";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashMap::class)] = "java.util.HashMap/1797211028";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashSet::class)] = "java.util.HashSet/3273092938";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.IdentityHashMap::class)] = "java.util.IdentityHashMap/1839153020";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashMap::class)] = "java.util.LinkedHashMap/3008245022";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/1826081506";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/3953877921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.NoSuchElementException::class)] = "java.util.NoSuchElementException/1559248883";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1346942793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TooManyListenersException::class)] = "java.util.TooManyListenersException/2023078032";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1493889780";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeSet::class)] = "java.util.TreeSet/4043497002";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.UUID::class)] = "java.util.UUID/1602462489";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3057315478";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.logging.Level::class)] = "java.util.logging.Level/2839552483";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.logging.LogRecord::class)] = "java.util.logging.LogRecord/2492345967";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.fusesource.restygwt.client.Json.Style::class)] = "org.fusesource.restygwt.client.Json$Style/895358586";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.ModalSize::class)] = "org.gwtbootstrap3.client.ui.ModalSize/2147129378";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.AlertType::class)] = "org.gwtbootstrap3.client.ui.constants.AlertType/1636077610";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.Alignment::class)] = "org.gwtbootstrap3.client.ui.constants.Alignment/1771331551";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.BadgePosition::class)] = "org.gwtbootstrap3.client.ui.constants.BadgePosition/3996546920";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ButtonDismiss::class)] = "org.gwtbootstrap3.client.ui.constants.ButtonDismiss/2563178806";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ButtonGroupSize::class)] = "org.gwtbootstrap3.client.ui.constants.ButtonGroupSize/313839071";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ButtonSize::class)] = "org.gwtbootstrap3.client.ui.constants.ButtonSize/347638960";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ButtonType::class)] = "org.gwtbootstrap3.client.ui.constants.ButtonType/765164003";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ColumnOffset::class)] = "org.gwtbootstrap3.client.ui.constants.ColumnOffset/116165412";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ColumnPull::class)] = "org.gwtbootstrap3.client.ui.constants.ColumnPull/2209414238";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ColumnPush::class)] = "org.gwtbootstrap3.client.ui.constants.ColumnPush/2100114568";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ColumnSize::class)] = "org.gwtbootstrap3.client.ui.constants.ColumnSize/1746838281";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ContextualBackground::class)] = "org.gwtbootstrap3.client.ui.constants.ContextualBackground/1955812303";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.DeviceSize::class)] = "org.gwtbootstrap3.client.ui.constants.DeviceSize/1387155296";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.Emphasis::class)] = "org.gwtbootstrap3.client.ui.constants.Emphasis/2660858784";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.FormGroupSize::class)] = "org.gwtbootstrap3.client.ui.constants.FormGroupSize/21416311";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.FormType::class)] = "org.gwtbootstrap3.client.ui.constants.FormType/849347587";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.HeadingSize::class)] = "org.gwtbootstrap3.client.ui.constants.HeadingSize/3881538646";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.IconFlip::class)] = "org.gwtbootstrap3.client.ui.constants.IconFlip/2354696101";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.IconPosition::class)] = "org.gwtbootstrap3.client.ui.constants.IconPosition/3441177690";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.IconRotate::class)] = "org.gwtbootstrap3.client.ui.constants.IconRotate/2301682682";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.IconSize::class)] = "org.gwtbootstrap3.client.ui.constants.IconSize/2914124279";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.IconType::class)] = "org.gwtbootstrap3.client.ui.constants.IconType/2171808626";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ImageType::class)] = "org.gwtbootstrap3.client.ui.constants.ImageType/1221058296";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.InputGroupSize::class)] = "org.gwtbootstrap3.client.ui.constants.InputGroupSize/2326742103";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.InputSize::class)] = "org.gwtbootstrap3.client.ui.constants.InputSize/1929687441";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.InputType::class)] = "org.gwtbootstrap3.client.ui.constants.InputType/458698927";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.LabelType::class)] = "org.gwtbootstrap3.client.ui.constants.LabelType/94017299";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ListGroupItemType::class)] = "org.gwtbootstrap3.client.ui.constants.ListGroupItemType/4041901989";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ModalBackdrop::class)] = "org.gwtbootstrap3.client.ui.constants.ModalBackdrop/1057050077";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.NavbarPosition::class)] = "org.gwtbootstrap3.client.ui.constants.NavbarPosition/392266708";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.NavbarPull::class)] = "org.gwtbootstrap3.client.ui.constants.NavbarPull/2969440698";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.NavbarType::class)] = "org.gwtbootstrap3.client.ui.constants.NavbarType/622358470";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.PaginationSize::class)] = "org.gwtbootstrap3.client.ui.constants.PaginationSize/149394892";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.PanelType::class)] = "org.gwtbootstrap3.client.ui.constants.PanelType/1479391277";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.Placement::class)] = "org.gwtbootstrap3.client.ui.constants.Placement/1758553133";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ProgressBarType::class)] = "org.gwtbootstrap3.client.ui.constants.ProgressBarType/2352050686";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ProgressType::class)] = "org.gwtbootstrap3.client.ui.constants.ProgressType/3431109222";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.Pull::class)] = "org.gwtbootstrap3.client.ui.constants.Pull/1394081837";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.Responsiveness::class)] = "org.gwtbootstrap3.client.ui.constants.Responsiveness/2513113237";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.Spy::class)] = "org.gwtbootstrap3.client.ui.constants.Spy/1479946371";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.TabPosition::class)] = "org.gwtbootstrap3.client.ui.constants.TabPosition/1874433980";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.TableType::class)] = "org.gwtbootstrap3.client.ui.constants.TableType/1553517271";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.Toggle::class)] = "org.gwtbootstrap3.client.ui.constants.Toggle/3396410580";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.Trigger::class)] = "org.gwtbootstrap3.client.ui.constants.Trigger/3871512988";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.TypeAttrType::class)] = "org.gwtbootstrap3.client.ui.constants.TypeAttrType/1369504142";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.ValidationState::class)] = "org.gwtbootstrap3.client.ui.constants.ValidationState/3036419144";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.constants.WellSize::class)] = "org.gwtbootstrap3.client.ui.constants.WellSize/1623867639";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.gwtbootstrap3.client.ui.form.error.ErrorHandlerType::class)] = "org.gwtbootstrap3.client.ui.form.error.ErrorHandlerType/1860599828";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Animation.Easing::class)] = "org.moxieapps.gwt.highcharts.client.Animation$Easing/3735069525";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Axis.TickPosition::class)] = "org.moxieapps.gwt.highcharts.client.Axis$TickPosition/1010371333";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Axis.Type::class)] = "org.moxieapps.gwt.highcharts.client.Axis$Type/4207514151";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Axis.WeekDay::class)] = "org.moxieapps.gwt.highcharts.client.Axis$WeekDay/3580146343";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.AxisTitle.Align::class)] = "org.moxieapps.gwt.highcharts.client.AxisTitle$Align/2164109409";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.BaseChart.PinchType::class)] = "org.moxieapps.gwt.highcharts.client.BaseChart$PinchType/2530541518";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.BaseChart.ZoomType::class)] = "org.moxieapps.gwt.highcharts.client.BaseChart$ZoomType/44055760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Button.Align::class)] = "org.moxieapps.gwt.highcharts.client.Button$Align/3456588153";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Button.VerticalAlign::class)] = "org.moxieapps.gwt.highcharts.client.Button$VerticalAlign/2446340888";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Chart.PanKey::class)] = "org.moxieapps.gwt.highcharts.client.Chart$PanKey/2391337624";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Chart.ZoomType::class)] = "org.moxieapps.gwt.highcharts.client.Chart$ZoomType/2512909599";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.ChartTitle.Align::class)] = "org.moxieapps.gwt.highcharts.client.ChartTitle$Align/2232980280";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.ChartTitle.VerticalAlign::class)] = "org.moxieapps.gwt.highcharts.client.ChartTitle$VerticalAlign/3240749240";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.ColorAxis.DataClassColor::class)] = "org.moxieapps.gwt.highcharts.client.ColorAxis$DataClassColor/2298622042";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.ColorAxis.TickPosition::class)] = "org.moxieapps.gwt.highcharts.client.ColorAxis$TickPosition/1578667054";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.ContextButton.Symbol::class)] = "org.moxieapps.gwt.highcharts.client.ContextButton$Symbol/3570721933";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Credits.Align::class)] = "org.moxieapps.gwt.highcharts.client.Credits$Align/417185484";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Credits.VerticalAlign::class)] = "org.moxieapps.gwt.highcharts.client.Credits$VerticalAlign/2094122738";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Exporting.Type::class)] = "org.moxieapps.gwt.highcharts.client.Exporting$Type/2214413220";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Legend.Align::class)] = "org.moxieapps.gwt.highcharts.client.Legend$Align/2237269823";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Legend.Layout::class)] = "org.moxieapps.gwt.highcharts.client.Legend$Layout/1792407694";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Legend.VerticalAlign::class)] = "org.moxieapps.gwt.highcharts.client.Legend$VerticalAlign/2465929449";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.MapNavigation.AlignTo::class)] = "org.moxieapps.gwt.highcharts.client.MapNavigation$AlignTo/3547562634";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.PaneBackground.Shape::class)] = "org.moxieapps.gwt.highcharts.client.PaneBackground$Shape/1048059041";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.PlotLine.DashStyle::class)] = "org.moxieapps.gwt.highcharts.client.PlotLine$DashStyle/2523597544";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.RangeSelector.Align::class)] = "org.moxieapps.gwt.highcharts.client.RangeSelector$Align/3965187701";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.RangeSelector.ButtonType::class)] = "org.moxieapps.gwt.highcharts.client.RangeSelector$ButtonType/2001461292";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.RangeSelector.VerticalAlign::class)] = "org.moxieapps.gwt.highcharts.client.RangeSelector$VerticalAlign/3222532419";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.ResetZoomButton.RelativeTo::class)] = "org.moxieapps.gwt.highcharts.client.ResetZoomButton$RelativeTo/1078293971";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.Series.Type::class)] = "org.moxieapps.gwt.highcharts.client.Series$Type/1606148214";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.XAxis.TickmarkPlacement::class)] = "org.moxieapps.gwt.highcharts.client.XAxis$TickmarkPlacement/261369144";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.labels.Labels.Align::class)] = "org.moxieapps.gwt.highcharts.client.labels.Labels$Align/3277164253";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.labels.Labels.VerticalAlign::class)] = "org.moxieapps.gwt.highcharts.client.labels.Labels$VerticalAlign/2595725691";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel.Align::class)] = "org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel$Align/1250742720";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel.TextAlign::class)] = "org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel$TextAlign/2848886158";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel.VerticalAlign::class)] = "org.moxieapps.gwt.highcharts.client.labels.PlotBandLabel$VerticalAlign/559121371";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel.Align::class)] = "org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel$Align/1005083410";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel.TextAlign::class)] = "org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel$TextAlign/4020407747";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel.VerticalAlign::class)] = "org.moxieapps.gwt.highcharts.client.labels.PlotLineLabel$VerticalAlign/517653301";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.labels.StackLabels.VerticalAlign::class)] = "org.moxieapps.gwt.highcharts.client.labels.StackLabels$VerticalAlign/3080174185";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping.Approximation::class)] = "org.moxieapps.gwt.highcharts.client.plotOptions.DataGrouping$Approximation/3237336384";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.plotOptions.FlagPlotOptions.Shape::class)] = "org.moxieapps.gwt.highcharts.client.plotOptions.FlagPlotOptions$Shape/2361091966";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.plotOptions.LinePlotOptions.Compare::class)] = "org.moxieapps.gwt.highcharts.client.plotOptions.LinePlotOptions$Compare/2141346721";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.plotOptions.Marker.Symbol::class)] = "org.moxieapps.gwt.highcharts.client.plotOptions.Marker$Symbol/4197506872";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions.Cursor::class)] = "org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions$Cursor/2484737786";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions.PointPlacement::class)] = "org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions$PointPlacement/1752182582";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions.Stacking::class)] = "org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions$Stacking/3629364835";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutAlgorithm::class)] = "org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions$LayoutAlgorithm/4168493263";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions.LayoutStartingDirection::class)] = "org.moxieapps.gwt.highcharts.client.plotOptions.TreemapPlotOptions$LayoutStartingDirection/1785705584";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.moxieapps.gwt.highcharts.client.plotOptions.Zone.Axis::class)] = "org.moxieapps.gwt.highcharts.client.plotOptions.Zone$Axis/1009473604";
    return result;
  }-*/;
  
  public HelloService_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}
