package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pagina02_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (pagina02) ","pagina02",3,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "pagina02","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 13;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Root = Root1";
Debug.ShouldStop(8192);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 15;BA.debugLine="Root.LoadLayout(\"Pagina02\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Pagina02")),__ref.getField(false, "ba"));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (pagina02) ","pagina02",3,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "pagina02","button1_click", __ref);}
RemoteObject _pg2 = RemoteObject.declareNull("b4a.example.pagina02");
 BA.debugLineNum = 21;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim pg2 As Pagina02";
Debug.ShouldStop(2097152);
_pg2 = RemoteObject.createNew ("b4a.example.pagina02");Debug.locals.put("pg2", _pg2);
 BA.debugLineNum = 23;BA.debugLine="pg2 = B4XPages.GetPage( \"pagina02\")";
Debug.ShouldStop(4194304);
_pg2 = (pagina02._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pagina02"))));Debug.locals.put("pg2", _pg2);
 BA.debugLineNum = 24;BA.debugLine="B4XPages.ClosePage( pg2 )";
Debug.ShouldStop(8388608);
pagina02._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((_pg2)));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
pagina02._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",pagina02._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
pagina02._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",pagina02._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private Label1 As Label";
pagina02._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",pagina02._label1);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pagina02) ","pagina02",3,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pagina02","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="Return Me";
Debug.ShouldStop(256);
if (true) return __ref;
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}