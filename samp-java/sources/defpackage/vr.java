package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.Display;
import android.view.RoundedCorner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class vr {
    public static w01 a = null;
    public static w01 b = null;
    public static g9 c = null;
    public static n6 d = null;
    public static rr e = null;
    public static w01 f = null;
    public static final int g = 9;
    public static final int h = 10;
    public static final int i = 12;
    public static w01 j;
    public static w01 k;

    public static ei1 B(fy fyVar) {
        ei1 ei1Var = fyVar.h0;
        if (ei1Var != null) {
            return ei1Var;
        }
        ei1 ei1Var2 = new ei1(hy.d(fyVar, f80.e0), hy.d(fyVar, f80.m0), hy.d(fyVar, f80.o0), hy.d(fyVar, f80.q0), hy.d(fyVar, f80.r0), hy.d(fyVar, f80.u0), wx.b(f80.h0, hy.d(fyVar, f80.g0)), wx.b(f80.j0, hy.d(fyVar, f80.i0)), wx.b(f80.l0, hy.d(fyVar, f80.k0)));
        fyVar.h0 = ei1Var2;
        return ei1Var2;
    }

    public static int C(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final w01 D() {
        w01 w01Var = k;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Notifications", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(12.0f, 22.0f);
        tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        tx0Var.g(-4.0f);
        tx0Var.e(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        tx0Var.c();
        tx0Var.j(18.0f, 16.0f);
        tx0Var.o(-5.0f);
        tx0Var.e(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        tx0Var.h(13.5f, 4.0f);
        tx0Var.e(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        tx0Var.l(-1.5f, 0.67f, -1.5f, 1.5f);
        tx0Var.o(0.68f);
        tx0Var.d(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        tx0Var.o(5.0f);
        tx0Var.i(-2.0f, 2.0f);
        tx0Var.o(1.0f);
        tx0Var.g(16.0f);
        tx0Var.o(-1.0f);
        tx0Var.i(-2.0f, -2.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        k = w01VarB;
        return w01VarB;
    }

    public static Intent E(wf wfVar) {
        Intent parentActivityIntent = wfVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strG = G(wfVar, wfVar.getComponentName());
            if (strG == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(wfVar, strG);
            try {
                return G(wfVar, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strG + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent F(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strG = G(context, componentName);
        if (strG == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strG);
        return G(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String G(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static so2 H(Display display, int i2) {
        RoundedCorner roundedCorner;
        int i3;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i2)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i3 = 1;
            if (position != 1) {
                i3 = 2;
                if (position != 2) {
                    i3 = 3;
                    if (position != 3) {
                        c.p(by1.e(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        return new so2(i3, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static p40 I(p40 p40Var) {
        p40Var.getClass();
        q40 q40Var = p40Var instanceof q40 ? (q40) p40Var : null;
        if (q40Var == null || (p40Var = q40Var.h) != null) {
            return p40Var;
        }
        q50 q50Var = (q50) q40Var.i().m(f5.L);
        p40 wb0Var = q50Var != null ? new wb0(q50Var, q40Var) : q40Var;
        q40Var.h = wb0Var;
        return wb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(of0 of0Var) {
        if (((aq1) of0Var).f.s) {
            U(of0Var, 1).E1();
        }
    }

    public static List K(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List L(Object... objArr) {
        if (objArr.length <= 0) {
            return ni0.f;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final ArrayList M(Map map, ns0 ns0Var) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            pt1 pt1Var = (pt1) entry.getValue();
            Boolean bool = pt1Var != null ? Boolean.FALSE : null;
            bool.getClass();
            if (!bool.booleanValue() && !pt1Var.b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) ns0Var.h((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList N(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new lj(objArr, true));
    }

    public static final List Q(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : K(list.get(0)) : ni0.f;
    }

    public static oq0 R(XmlResourceParser xmlResourceParser, Resources resources) throws Throwable {
        int next;
        int i2;
        int i3;
        int i4;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            a0(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), nf2.b);
        int i5 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), nf2.c);
                        int i7 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = typedArrayObtainAttributes2.getInt(i8, 0);
                        int i10 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i10, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i10);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            a0(xmlResourceParser);
                        }
                        arrayList.add(new qq0(i7, i9, resourceId2, string7, string6, z));
                    } else {
                        a0(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new pq0((qq0[]) arrayList.toArray(new qq0[0]));
        }
        List listS = S(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), nf2.d);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i5);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        i4 = integer;
                        String string10 = typedArrayObtainAttributes3.getString(i2);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i6) {
                            a0(xmlResourceParser);
                        }
                        try {
                            typedArray = typedArrayObtainAttributes3;
                            i3 = i6;
                            try {
                                hq0 hq0Var = new hq0(string, string2, string8, listS, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(hq0Var);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = typedArrayObtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i3 = i6;
                i4 = integer;
                a0(xmlResourceParser);
                i6 = i3;
                integer = i4;
                i2 = 2;
                i5 = 0;
            }
        }
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new rq0(arrayList2, i11, integer2, string5);
        }
        if (string3 == null) {
            c.p("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new hq0(string, string2, string3, listS, null, null));
        if (string4 != null) {
            arrayList2.add(new hq0(string, string2, string4, listS, null, null));
        }
        return new rq0(arrayList2, i11, integer2, string5);
    }

    public static List S(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final void T(ia0 ia0Var) {
        l6 l6VarM4getAutofillManager;
        tb1 tb1VarX = X(ia0Var);
        if (tb1VarX.z || (l6VarM4getAutofillManager = ((h7) wb1.a(tb1VarX)).getAutofillManager()) == null) {
            return;
        }
        Rect rect = l6VarM4getAutofillManager.k;
        lk2 lk2Var = l6VarM4getAutofillManager.i;
        tb1 tb1Var = (tb1) lk2Var.a.b(tb1VarX.g);
        if (tb1Var == null || tb1Var.l == -4) {
            return;
        }
        h9 h9Var = lk2Var.c;
        int iE = lk2Var.e(tb1Var);
        long[] jArr = (long[]) h9Var.c;
        long j2 = jArr[iE];
        long j3 = jArr[iE + 1];
        rect.set((int) (j2 >> 32), (int) j2, (int) (j3 >> 32), (int) j3);
        l6VarM4getAutofillManager.f.w().requestAutofill(l6VarM4getAutofillManager.h, tb1VarX.g, rect);
    }

    public static final ex1 U(ia0 ia0Var, int i2) {
        ex1 ex1Var = ((aq1) ia0Var).f.m;
        ex1Var.getClass();
        if (ex1Var.w1() != ia0Var || !fx1.g(i2)) {
            return ex1Var;
        }
        ex1 ex1Var2 = ex1Var.C;
        ex1Var2.getClass();
        return ex1Var2;
    }

    public static final ow0 V(ia0 ia0Var) {
        return ((h7) Y(ia0Var)).getGraphicsContext();
    }

    public static final ex1 W(ia0 ia0Var) {
        if (!((aq1) ia0Var).f.s) {
            m21.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        ex1 ex1VarU = U(ia0Var, 2);
        if (!ex1VarU.w1().s) {
            m21.c("LayoutCoordinates is not attached.");
        }
        return ex1VarU;
    }

    public static final tb1 X(ia0 ia0Var) {
        ex1 ex1Var = ((aq1) ia0Var).f.m;
        if (ex1Var != null) {
            return ex1Var.z;
        }
        throw nc2.d("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final q12 Y(ia0 ia0Var) {
        q12 q12Var = X(ia0Var).t;
        if (q12Var != null) {
            return q12Var;
        }
        throw nc2.d("This node does not have an owner.");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String Z(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final void a(int i2, ns0 ns0Var, nv0 nv0Var, bq1 bq1Var) {
        nv0Var.b0(-932836462);
        int i3 = (nv0Var.f(bq1Var) ? 4 : 2) | i2 | (nv0Var.h(ns0Var) ? 32 : 16);
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            oz2.g(nv0Var, w7.K(bq1Var, ns0Var));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new tr(bq1Var, ns0Var, i2);
        }
    }

    public static void a0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static gz b() {
        gz gzVar = new gz(true);
        gzVar.V(null);
        return gzVar;
    }

    public static void b0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.he2 r11, defpackage.rs0 r12, defpackage.nv0 r13, int r14) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr.c(he2, rs0, nv0, int):void");
    }

    public static Object c0(rs0 rs0Var, Object obj, p40 p40Var) {
        rs0Var.getClass();
        o50 o50VarI = p40Var.i();
        Object v51Var = o50VarI == li0.f ? new v51(p40Var) : new w51(p40Var, o50VarI);
        cl3.i(2, rs0Var);
        return rs0Var.f(obj, v51Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.he2[] r10, defpackage.rs0 r11, defpackage.nv0 r12, int r13) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr.d(he2[], rs0, nv0, int):void");
    }

    public static final void e(boolean z, boolean z2, cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, nv0 nv0Var, int i2) {
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(-1584205198);
        cs0 cs0Var4 = cs0Var2;
        int i3 = i2 | (nv0Var2.g(z) ? 4 : 2) | (nv0Var2.g(z2) ? 32 : 16) | (nv0Var2.h(cs0Var) ? 256 : 128) | (nv0Var2.h(cs0Var4) ? 2048 : 1024) | (nv0Var2.h(cs0Var3) ? 16384 : 8192);
        int i4 = 1;
        int i5 = 0;
        if (nv0Var2.R(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z3 = z && z2;
            String strF = !z ? by1.f(nv0Var2, -2002763899, 2131624102, nv0Var2, false) : !z2 ? by1.f(nv0Var2, -2002761398, 2131624105, nv0Var2, false) : by1.f(nv0Var2, -2002759067, 2131624111, nv0Var2, false);
            if (z) {
                cs0Var4 = !z2 ? cs0Var3 : cs0Var;
            }
            yp1 yp1Var = yp1.a;
            if (z3) {
                nv0Var2.a0(-1955760895);
                gq.a(cs0Var4, j43.e(j43.c(yp1Var, 1.0f), 56.0f), false, uo2.a(20.0f), null, null, null, null, gq.N(1164829319, new oy0(i5, strF), nv0Var2), nv0Var, 805306416, 500);
                nv0Var2 = nv0Var;
                nv0Var2.p(false);
            } else {
                nv0Var2.a0(-1955149730);
                gq.i(cs0Var4, j43.c(yp1Var, 1.0f), false, uo2.a(28.0f), null, null, null, gq.N(1056231452, new oy0(i4, strF), nv0Var2), nv0Var2, 805306416, 500);
                nv0Var2.p(false);
            }
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new bw(z, z2, cs0Var, cs0Var2, cs0Var3, i2);
        }
    }

    public static final void f(String str, kq2 kq2Var, List list, nm2 nm2Var, ns0 ns0Var, cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, nv0 nv0Var, int i2) {
        nv0Var.b0(-1355873287);
        int i3 = i2 | (nv0Var.f(str) ? 4 : 2) | (nv0Var.h(kq2Var) ? 32 : 16) | (nv0Var.f(list) ? 256 : 128) | (nv0Var.f(nm2Var) ? 2048 : 1024) | (nv0Var.h(ns0Var) ? 16384 : 8192) | (nv0Var.h(cs0Var) ? 131072 : 65536) | (nv0Var.h(cs0Var2) ? 1048576 : 524288) | (nv0Var.h(cs0Var3) ? 8388608 : 4194304);
        if (nv0Var.R(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = b32.w(Boolean.FALSE);
                nv0Var.j0(objO);
            }
            gv3.i(oz2.M(2131624219, nv0Var), gq.N(1185239919, new aa1(str, nm2Var, cs0Var3, list, cs0Var, cs0Var2, (os1) objO, kq2Var, ns0Var), nv0Var), nv0Var, 48);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ny0(str, kq2Var, list, nm2Var, ns0Var, cs0Var, cs0Var2, cs0Var3, i2);
        }
    }

    public static final void g(nm2 nm2Var, cs0 cs0Var, nv0 nv0Var, int i2) {
        r32 r32Var;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(-600960431);
        int i3 = i2 | (nv0Var2.f(nm2Var) ? 4 : 2) | (nv0Var2.h(cs0Var) ? 32 : 16);
        int i4 = 1;
        if (nv0Var2.R(i3 & 1, (i3 & 19) != 18)) {
            if (s51.n(nm2Var, mm2.a)) {
                nv0Var2.a0(-1997351197);
                r32Var = new r32(new wx(((fy) nv0Var2.j(hy.a)).a), oz2.M(2131624359, nv0Var2));
                nv0Var2.p(false);
            } else if (s51.n(nm2Var, im2.a)) {
                nv0Var2.a0(-1997347449);
                r32Var = new r32(new wx(((fy) nv0Var2.j(hy.a)).j), oz2.M(2131624348, nv0Var2));
                nv0Var2.p(false);
            } else if (s51.n(nm2Var, lm2.a)) {
                nv0Var2.a0(-1997343500);
                r32Var = new r32(new wx(((fy) nv0Var2.j(hy.a)).s), oz2.M(2131624357, nv0Var2));
                nv0Var2.p(false);
            } else if (nm2Var instanceof km2) {
                nv0Var2.a0(-1997339110);
                r32Var = new r32(new wx(((fy) nv0Var2.j(hy.a)).w), oz2.N(2131624360, new Object[]{Integer.valueOf(((km2) nm2Var).a.size())}, nv0Var2));
                nv0Var2.p(false);
            } else {
                if (!(nm2Var instanceof jm2)) {
                    throw by1.d(nv0Var2, -1997352319, false);
                }
                nv0Var2.a0(-1997333663);
                r32Var = new r32(new wx(((fy) nv0Var2.j(hy.a)).w), oz2.M(2131624350, nv0Var2));
                nv0Var2.p(false);
            }
            long j2 = ((wx) r32Var.f).a;
            String str = (String) r32Var.g;
            yp1 yp1Var = yp1.a;
            bq1 bq1VarX = gv3.x(2, cs0Var, yp1Var, !(nm2Var instanceof mm2));
            dp2 dp2VarA = cp2.a(new jj(8.0f, true, new c(i4)), f5.q, nv0Var2, 54);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, bq1VarX);
            w10.c.getClass();
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(tb1.Y);
            } else {
                nv0Var2.m0();
            }
            y02.F(f5.E, nv0Var2, dp2VarA);
            y02.F(f5.D, nv0Var2, n52VarL);
            y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
            y02.C(nv0Var2);
            y02.F(f5.C, nv0Var2, bq1VarM);
            eo.a(gv3.v(j43.k(yp1Var, 10.0f), j2, uo2.a), nv0Var2, 0);
            mg3.b(str, null, j2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).k, nv0Var, 0, 0, 131066);
            nv0Var2 = nv0Var;
            nv0Var2.p(true);
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i2, 16, nm2Var, cs0Var);
        }
    }

    public static final void h(qs1 qs1Var, aq1 aq1Var) {
        qs1 qs1VarZ = X(aq1Var).z();
        int i2 = qs1VarZ.h - 1;
        Object[] objArr = qs1VarZ.f;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                qs1Var.b(((tb1) objArr[i2]).L.f);
                i2--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.xh3 r4, defpackage.ss0 r5, java.lang.Throwable r6, defpackage.q40 r7) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            boolean r0 = r7 instanceof defpackage.mn0
            if (r0 == 0) goto L13
            r0 = r7
            mn0 r0 = (defpackage.mn0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            mn0 r0 = new mn0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.i
            defpackage.y02.Q(r7)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r4 = move-exception
            goto L43
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L30:
            defpackage.y02.Q(r7)
            r0.i = r6     // Catch: java.lang.Throwable -> L27
            r0.k = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.e(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L40
            return r5
        L40:
            dm3 r4 = defpackage.dm3.a
            return r4
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            defpackage.uq.j(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr.i(xh3, ss0, java.lang.Throwable, q40):java.lang.Object");
    }

    public static final aq1 j(qs1 qs1Var) {
        int i2;
        if (qs1Var == null || (i2 = qs1Var.h) == 0) {
            return null;
        }
        return (aq1) qs1Var.k(i2 - 1);
    }

    public static final double k(double d2, double d3, double d4, double d5) {
        double d6 = d2 * d2;
        double d7 = (((d4 * 3.0d) / d2) - ((d3 * d3) / d6)) / 3.0d;
        double d8 = (((d5 * 27.0d) / d2) + (((((d3 * 2.0d) * d3) * d3) / (d6 * d2)) - (((9.0d * d3) * d4) / d6))) / 27.0d;
        double dSqrt = Math.sqrt((((d7 * d7) * d7) / 27.0d) + ((d8 * d8) / 4.0d));
        double d9 = (-d8) / 2.0d;
        return (Math.cbrt(d9 - dSqrt) + Math.cbrt(d9 + dSqrt)) - (d3 / (d2 * 3.0d));
    }

    public static ArrayList m(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new lj(objArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final kb1 n(aq1 aq1Var) {
        if ((aq1Var.h & 2) != 0) {
            if (aq1Var instanceof kb1) {
                return (kb1) aq1Var;
            }
            if (aq1Var instanceof ja0) {
                aq1 aq1Var2 = ((ja0) aq1Var).u;
                while (aq1Var2 != 0) {
                    if (aq1Var2 instanceof kb1) {
                        return (kb1) aq1Var2;
                    }
                    aq1Var2 = (!(aq1Var2 instanceof ja0) || (aq1Var2.h & 2) == 0) ? aq1Var2.k : ((ja0) aq1Var2).u;
                }
            }
        }
        return null;
    }

    public static int o(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i2 = 0;
        if (size < 0) {
            c.p(nc2.h("fromIndex (", 0, ") is greater than toIndex (", size, ")."));
            return 0;
        }
        if (size > size2) {
            c.i(nc2.h("toIndex (", size, ") is greater than size (", size2, ")."));
            return 0;
        }
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int iT = ur.t((Comparable) arrayList.get(i4), comparable);
            if (iT < 0) {
                i2 = i4 + 1;
            } else {
                if (iT <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final jk2 p(ab1 ab1Var) {
        ab1 ab1VarF = ab1Var.F();
        return ab1VarF != null ? ab1VarF.c0(ab1Var, true) : new jk2(0.0f, 0.0f, (int) (ab1Var.i0() >> 32), (int) (ab1Var.i0() & 4294967295L));
    }

    public static final jk2 q(ab1 ab1Var, boolean z) {
        ab1 ab1VarY = y(ab1Var);
        float fI0 = (int) (ab1VarY.i0() >> 32);
        float fI02 = (int) (ab1VarY.i0() & 4294967295L);
        jk2 jk2VarC0 = ab1VarY.c0(ab1Var, z);
        float f2 = jk2VarC0.a;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fI0) {
                f2 = fI0;
            }
        }
        float f3 = jk2VarC0.b;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > fI02) {
                f3 = fI02;
            }
        }
        float f4 = jk2VarC0.c;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= fI0) {
                fI0 = f4;
            }
            f4 = fI0;
        }
        float f5 = jk2VarC0.d;
        if (z) {
            float f6 = f5 >= 0.0f ? f5 : 0.0f;
            if (f6 <= fI02) {
                fI02 = f6;
            }
            f5 = fI02;
        }
        if (f2 == f4 || f3 == f5) {
            return jk2.e;
        }
        long jD = ab1VarY.D((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jD2 = ab1VarY.D((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jD3 = ab1VarY.D((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        long jD4 = ab1VarY.D((((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jD3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jD2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jD4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jD3 & 4294967295L));
        return new jk2(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static ai1 r(ai1 ai1Var) {
        ai1Var.g();
        ai1Var.h = true;
        return ai1Var.g > 0 ? ai1Var : ai1.i;
    }

    public static final nr1 s(ad1 ad1Var, kd1 kd1Var, po poVar) {
        int iMin;
        l73 l73Var = kd1Var.f;
        l73Var.getClass();
        j0 j0Var = w7.R(l73Var).c;
        qs1 qs1Var = poVar.a;
        int i2 = 1;
        if (!(qs1Var.h != 0) && j0Var.isEmpty()) {
            return f41.a;
        }
        nr1 nr1Var = new nr1();
        if (poVar.a.h != 0) {
            int i3 = qs1Var.h;
            if (i3 == 0) {
                c.m("MutableVector is empty.");
                return null;
            }
            Object[] objArr = qs1Var.f;
            int i4 = ((oc1) objArr[0]).a;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = ((oc1) objArr[i5]).a;
                if (i6 < i4) {
                    i4 = i6;
                }
            }
            if (i4 < 0) {
                p21.a("negative minIndex");
            }
            int i7 = qs1Var.h;
            if (i7 == 0) {
                c.m("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = qs1Var.f;
            int i8 = ((oc1) objArr2[0]).b;
            for (int i9 = 0; i9 < i7; i9++) {
                int i10 = ((oc1) objArr2[i9]).b;
                if (i10 > i8) {
                    i8 = i10;
                }
            }
            iMin = Math.min(i8, ad1Var.a() - 1);
            i2 = i4;
        } else {
            iMin = 0;
        }
        int iA = j0Var.a();
        for (int i11 = 0; i11 < iA; i11++) {
            jd1 jd1Var = (jd1) j0Var.get(i11);
            int iW = lq.w(jd1Var.c, ad1Var, jd1Var.a);
            if ((i2 > iW || iW > iMin) && iW >= 0 && iW < ad1Var.a()) {
                nr1Var.a(iW);
            }
        }
        if (i2 <= iMin) {
            while (true) {
                nr1Var.a(i2);
                if (i2 == iMin) {
                    break;
                }
                i2++;
            }
        }
        int i12 = nr1Var.b;
        if (i12 == 0) {
            return nr1Var;
        }
        int[] iArr = nr1Var.a;
        iArr.getClass();
        Arrays.sort(iArr, 0, i12);
        return nr1Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String t(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static ei1 u(long j2, nv0 nv0Var) {
        long j3 = wx.g;
        ei1 ei1VarB = B((fy) nv0Var.j(hy.a));
        long j4 = j2 != 16 ? j2 : ei1VarB.a;
        long j5 = j3 != 16 ? j3 : ei1VarB.b;
        long j6 = j3 != 16 ? j3 : ei1VarB.c;
        long j7 = j3 != 16 ? j3 : ei1VarB.d;
        long j8 = j3 != 16 ? j3 : ei1VarB.e;
        long j9 = j3 != 16 ? j3 : ei1VarB.f;
        long j10 = j3 != 16 ? j3 : ei1VarB.g;
        long j11 = j3 != 16 ? j3 : ei1VarB.h;
        if (j3 == 16) {
            j3 = ei1VarB.i;
        }
        return new ei1(j4, j5, j6, j7, j8, j9, j10, j11, j3);
    }

    public static final boolean v(jk2 jk2Var, float f2, float f3) {
        float f4 = jk2Var.a;
        if (f2 > jk2Var.c || f4 > f2) {
            return false;
        }
        return f3 <= jk2Var.d && jk2Var.b <= f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p40 w(p40 p40Var, p40 p40Var2, rs0 rs0Var) {
        rs0Var.getClass();
        if (rs0Var instanceof ml) {
            return ((ml) rs0Var).m(p40Var2, p40Var);
        }
        o50 o50VarI = p40Var2.i();
        return o50VarI == li0.f ? new t51(p40Var2, p40Var, rs0Var) : new u51(p40Var2, o50VarI, rs0Var, p40Var);
    }

    public static ai1 x() {
        return new ai1(10);
    }

    public static final ab1 y(ab1 ab1Var) {
        ab1 ab1Var2;
        ab1 ab1VarF = ab1Var.F();
        while (true) {
            ab1 ab1Var3 = ab1VarF;
            ab1Var2 = ab1Var;
            ab1Var = ab1Var3;
            if (ab1Var == null) {
                break;
            }
            ab1VarF = ab1Var.F();
        }
        ex1 ex1Var = ab1Var2 instanceof ex1 ? (ex1) ab1Var2 : null;
        if (ex1Var == null) {
            return ab1Var2;
        }
        ex1 ex1Var2 = ex1Var.D;
        while (true) {
            ex1 ex1Var3 = ex1Var2;
            ex1 ex1Var4 = ex1Var;
            ex1Var = ex1Var3;
            if (ex1Var == null) {
                return ex1Var4;
            }
            ex1Var2 = ex1Var.D;
        }
    }

    public static cp1 z(cp1 cp1Var, bb1 bb1Var, gh3 gh3Var, ua0 ua0Var, zp0 zp0Var) {
        if (cp1Var != null && bb1Var == cp1Var.a && n32.y(gh3Var, bb1Var).equals(cp1Var.b) && ua0Var.h() == cp1Var.c.f && zp0Var == cp1Var.d) {
            return cp1Var;
        }
        cp1 cp1Var2 = cp1.h;
        if (cp1Var2 != null && bb1Var == cp1Var2.a && n32.y(gh3Var, bb1Var).equals(cp1Var2.b) && ua0Var.h() == cp1Var2.c.f && zp0Var == cp1Var2.d) {
            return cp1Var2;
        }
        cp1 cp1Var3 = new cp1(bb1Var, n32.y(gh3Var, bb1Var), new xa0(ua0Var.h(), ua0Var.G()), zp0Var);
        cp1.h = cp1Var3;
        return cp1Var3;
    }

    public abstract jk2 A();

    public abstract void O(Throwable th);

    public abstract void P(pl plVar);

    public abstract int l(int i2, int i3, bb1 bb1Var);
}
