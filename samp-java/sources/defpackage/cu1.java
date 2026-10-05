package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cu1 {
    public static final uk2 m = new uk2("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final uk2 n = new uk2("\\{(.+?)\\}");
    public static final uk2 o = new uk2("http[s]?://");
    public static final uk2 p = new uk2(".*");
    public static final uk2 q = new uk2("([^/]*?|)");
    public static final uk2 r = new uk2("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final xb3 d;
    public final xb3 e;
    public final lc1 f;
    public boolean g;
    public final lc1 h;
    public final lc1 i;
    public final lc1 j;
    public final xb3 k;
    public final boolean l;

    public cu1(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.d = new xb3(new cs0(this) { // from class: zt1
            public final /* synthetic */ cu1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                List list;
                int i2 = i;
                cu1 cu1Var = this.g;
                switch (i2) {
                    case 0:
                        String str2 = cu1Var.c;
                        if (str2 != null) {
                            return new uk2(0, str2);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(cu1.r.c(cu1Var.a));
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        String str3 = cu1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) cu1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    c.g(by1.i("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) qx.r0(queryParameters);
                                if (str5 == null) {
                                    cu1Var.g = true;
                                    str5 = str4;
                                }
                                uk2 uk2Var = cu1.n;
                                uk2Var.getClass();
                                str5.getClass();
                                Matcher matcher = uk2Var.f.matcher(str5);
                                matcher.getClass();
                                bu1 bu1Var = new bu1();
                                int i3 = 0;
                                for (sm1 sm1VarB = n32.b(matcher, 0, str5); sm1VarB != null; sm1VarB = sm1VarB.c()) {
                                    pm1 pm1VarB = sm1VarB.c.b(1);
                                    pm1VarB.getClass();
                                    bu1Var.b.add(pm1VarB.a);
                                    if (sm1VarB.b().f > i3) {
                                        String strQuote = Pattern.quote(str5.substring(i3, sm1VarB.b().f));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = sm1VarB.b().g + 1;
                                }
                                if (i3 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i3));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                bu1Var.a = cu1.h(sb.toString());
                                linkedHashMap.put(str4, bu1Var);
                            }
                        }
                        return linkedHashMap;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        String str6 = cu1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        cu1.a(fragment, arrayList2, sb2);
                        return new r32(arrayList2, sb2.toString());
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        r32 r32Var = (r32) cu1Var.h.getValue();
                        return (r32Var == null || (list = (List) r32Var.f) == null) ? new ArrayList() : list;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        r32 r32Var2 = (r32) cu1Var.h.getValue();
                        if (r32Var2 != null) {
                            return (String) r32Var2.g;
                        }
                        return null;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) cu1Var.j.getValue();
                        if (str7 != null) {
                            return new uk2(0, str7);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.e = new xb3(new cs0(this) { // from class: zt1
            public final /* synthetic */ cu1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                List list;
                int i22 = i2;
                cu1 cu1Var = this.g;
                switch (i22) {
                    case 0:
                        String str2 = cu1Var.c;
                        if (str2 != null) {
                            return new uk2(0, str2);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(cu1.r.c(cu1Var.a));
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        String str3 = cu1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) cu1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    c.g(by1.i("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) qx.r0(queryParameters);
                                if (str5 == null) {
                                    cu1Var.g = true;
                                    str5 = str4;
                                }
                                uk2 uk2Var = cu1.n;
                                uk2Var.getClass();
                                str5.getClass();
                                Matcher matcher = uk2Var.f.matcher(str5);
                                matcher.getClass();
                                bu1 bu1Var = new bu1();
                                int i3 = 0;
                                for (sm1 sm1VarB = n32.b(matcher, 0, str5); sm1VarB != null; sm1VarB = sm1VarB.c()) {
                                    pm1 pm1VarB = sm1VarB.c.b(1);
                                    pm1VarB.getClass();
                                    bu1Var.b.add(pm1VarB.a);
                                    if (sm1VarB.b().f > i3) {
                                        String strQuote = Pattern.quote(str5.substring(i3, sm1VarB.b().f));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = sm1VarB.b().g + 1;
                                }
                                if (i3 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i3));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                bu1Var.a = cu1.h(sb.toString());
                                linkedHashMap.put(str4, bu1Var);
                            }
                        }
                        return linkedHashMap;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        String str6 = cu1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        cu1.a(fragment, arrayList2, sb2);
                        return new r32(arrayList2, sb2.toString());
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        r32 r32Var = (r32) cu1Var.h.getValue();
                        return (r32Var == null || (list = (List) r32Var.f) == null) ? new ArrayList() : list;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        r32 r32Var2 = (r32) cu1Var.h.getValue();
                        if (r32Var2 != null) {
                            return (String) r32Var2.g;
                        }
                        return null;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) cu1Var.j.getValue();
                        if (str7 != null) {
                            return new uk2(0, str7);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        cs0 cs0Var = new cs0(this) { // from class: zt1
            public final /* synthetic */ cu1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                List list;
                int i22 = i3;
                cu1 cu1Var = this.g;
                switch (i22) {
                    case 0:
                        String str2 = cu1Var.c;
                        if (str2 != null) {
                            return new uk2(0, str2);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(cu1.r.c(cu1Var.a));
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        String str3 = cu1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) cu1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    c.g(by1.i("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) qx.r0(queryParameters);
                                if (str5 == null) {
                                    cu1Var.g = true;
                                    str5 = str4;
                                }
                                uk2 uk2Var = cu1.n;
                                uk2Var.getClass();
                                str5.getClass();
                                Matcher matcher = uk2Var.f.matcher(str5);
                                matcher.getClass();
                                bu1 bu1Var = new bu1();
                                int i32 = 0;
                                for (sm1 sm1VarB = n32.b(matcher, 0, str5); sm1VarB != null; sm1VarB = sm1VarB.c()) {
                                    pm1 pm1VarB = sm1VarB.c.b(1);
                                    pm1VarB.getClass();
                                    bu1Var.b.add(pm1VarB.a);
                                    if (sm1VarB.b().f > i32) {
                                        String strQuote = Pattern.quote(str5.substring(i32, sm1VarB.b().f));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = sm1VarB.b().g + 1;
                                }
                                if (i32 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i32));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                bu1Var.a = cu1.h(sb.toString());
                                linkedHashMap.put(str4, bu1Var);
                            }
                        }
                        return linkedHashMap;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        String str6 = cu1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        cu1.a(fragment, arrayList2, sb2);
                        return new r32(arrayList2, sb2.toString());
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        r32 r32Var = (r32) cu1Var.h.getValue();
                        return (r32Var == null || (list = (List) r32Var.f) == null) ? new ArrayList() : list;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        r32 r32Var2 = (r32) cu1Var.h.getValue();
                        if (r32Var2 != null) {
                            return (String) r32Var2.g;
                        }
                        return null;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) cu1Var.j.getValue();
                        if (str7 != null) {
                            return new uk2(0, str7);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        pe1 pe1Var = pe1.f;
        this.f = ur.J(pe1Var, cs0Var);
        final int i4 = 3;
        this.h = ur.J(pe1Var, new cs0(this) { // from class: zt1
            public final /* synthetic */ cu1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                List list;
                int i22 = i4;
                cu1 cu1Var = this.g;
                switch (i22) {
                    case 0:
                        String str2 = cu1Var.c;
                        if (str2 != null) {
                            return new uk2(0, str2);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(cu1.r.c(cu1Var.a));
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        String str3 = cu1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) cu1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    c.g(by1.i("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) qx.r0(queryParameters);
                                if (str5 == null) {
                                    cu1Var.g = true;
                                    str5 = str4;
                                }
                                uk2 uk2Var = cu1.n;
                                uk2Var.getClass();
                                str5.getClass();
                                Matcher matcher = uk2Var.f.matcher(str5);
                                matcher.getClass();
                                bu1 bu1Var = new bu1();
                                int i32 = 0;
                                for (sm1 sm1VarB = n32.b(matcher, 0, str5); sm1VarB != null; sm1VarB = sm1VarB.c()) {
                                    pm1 pm1VarB = sm1VarB.c.b(1);
                                    pm1VarB.getClass();
                                    bu1Var.b.add(pm1VarB.a);
                                    if (sm1VarB.b().f > i32) {
                                        String strQuote = Pattern.quote(str5.substring(i32, sm1VarB.b().f));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = sm1VarB.b().g + 1;
                                }
                                if (i32 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i32));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                bu1Var.a = cu1.h(sb.toString());
                                linkedHashMap.put(str4, bu1Var);
                            }
                        }
                        return linkedHashMap;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        String str6 = cu1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        cu1.a(fragment, arrayList2, sb2);
                        return new r32(arrayList2, sb2.toString());
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        r32 r32Var = (r32) cu1Var.h.getValue();
                        return (r32Var == null || (list = (List) r32Var.f) == null) ? new ArrayList() : list;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        r32 r32Var2 = (r32) cu1Var.h.getValue();
                        if (r32Var2 != null) {
                            return (String) r32Var2.g;
                        }
                        return null;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) cu1Var.j.getValue();
                        if (str7 != null) {
                            return new uk2(0, str7);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.i = ur.J(pe1Var, new cs0(this) { // from class: zt1
            public final /* synthetic */ cu1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                List list;
                int i22 = i5;
                cu1 cu1Var = this.g;
                switch (i22) {
                    case 0:
                        String str2 = cu1Var.c;
                        if (str2 != null) {
                            return new uk2(0, str2);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(cu1.r.c(cu1Var.a));
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        String str3 = cu1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) cu1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    c.g(by1.i("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) qx.r0(queryParameters);
                                if (str5 == null) {
                                    cu1Var.g = true;
                                    str5 = str4;
                                }
                                uk2 uk2Var = cu1.n;
                                uk2Var.getClass();
                                str5.getClass();
                                Matcher matcher = uk2Var.f.matcher(str5);
                                matcher.getClass();
                                bu1 bu1Var = new bu1();
                                int i32 = 0;
                                for (sm1 sm1VarB = n32.b(matcher, 0, str5); sm1VarB != null; sm1VarB = sm1VarB.c()) {
                                    pm1 pm1VarB = sm1VarB.c.b(1);
                                    pm1VarB.getClass();
                                    bu1Var.b.add(pm1VarB.a);
                                    if (sm1VarB.b().f > i32) {
                                        String strQuote = Pattern.quote(str5.substring(i32, sm1VarB.b().f));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = sm1VarB.b().g + 1;
                                }
                                if (i32 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i32));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                bu1Var.a = cu1.h(sb.toString());
                                linkedHashMap.put(str4, bu1Var);
                            }
                        }
                        return linkedHashMap;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        String str6 = cu1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        cu1.a(fragment, arrayList2, sb2);
                        return new r32(arrayList2, sb2.toString());
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        r32 r32Var = (r32) cu1Var.h.getValue();
                        return (r32Var == null || (list = (List) r32Var.f) == null) ? new ArrayList() : list;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        r32 r32Var2 = (r32) cu1Var.h.getValue();
                        if (r32Var2 != null) {
                            return (String) r32Var2.g;
                        }
                        return null;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) cu1Var.j.getValue();
                        if (str7 != null) {
                            return new uk2(0, str7);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.j = ur.J(pe1Var, new cs0(this) { // from class: zt1
            public final /* synthetic */ cu1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                List list;
                int i22 = i6;
                cu1 cu1Var = this.g;
                switch (i22) {
                    case 0:
                        String str2 = cu1Var.c;
                        if (str2 != null) {
                            return new uk2(0, str2);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(cu1.r.c(cu1Var.a));
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        String str3 = cu1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) cu1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    c.g(by1.i("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) qx.r0(queryParameters);
                                if (str5 == null) {
                                    cu1Var.g = true;
                                    str5 = str4;
                                }
                                uk2 uk2Var = cu1.n;
                                uk2Var.getClass();
                                str5.getClass();
                                Matcher matcher = uk2Var.f.matcher(str5);
                                matcher.getClass();
                                bu1 bu1Var = new bu1();
                                int i32 = 0;
                                for (sm1 sm1VarB = n32.b(matcher, 0, str5); sm1VarB != null; sm1VarB = sm1VarB.c()) {
                                    pm1 pm1VarB = sm1VarB.c.b(1);
                                    pm1VarB.getClass();
                                    bu1Var.b.add(pm1VarB.a);
                                    if (sm1VarB.b().f > i32) {
                                        String strQuote = Pattern.quote(str5.substring(i32, sm1VarB.b().f));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = sm1VarB.b().g + 1;
                                }
                                if (i32 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i32));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                bu1Var.a = cu1.h(sb.toString());
                                linkedHashMap.put(str4, bu1Var);
                            }
                        }
                        return linkedHashMap;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        String str6 = cu1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        cu1.a(fragment, arrayList2, sb2);
                        return new r32(arrayList2, sb2.toString());
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        r32 r32Var = (r32) cu1Var.h.getValue();
                        return (r32Var == null || (list = (List) r32Var.f) == null) ? new ArrayList() : list;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        r32 r32Var2 = (r32) cu1Var.h.getValue();
                        if (r32Var2 != null) {
                            return (String) r32Var2.g;
                        }
                        return null;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) cu1Var.j.getValue();
                        if (str7 != null) {
                            return new uk2(0, str7);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.k = new xb3(new cs0(this) { // from class: zt1
            public final /* synthetic */ cu1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                List list;
                int i22 = i7;
                cu1 cu1Var = this.g;
                switch (i22) {
                    case 0:
                        String str2 = cu1Var.c;
                        if (str2 != null) {
                            return new uk2(0, str2);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(cu1.r.c(cu1Var.a));
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        String str3 = cu1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) cu1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    c.g(by1.i("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) qx.r0(queryParameters);
                                if (str5 == null) {
                                    cu1Var.g = true;
                                    str5 = str4;
                                }
                                uk2 uk2Var = cu1.n;
                                uk2Var.getClass();
                                str5.getClass();
                                Matcher matcher = uk2Var.f.matcher(str5);
                                matcher.getClass();
                                bu1 bu1Var = new bu1();
                                int i32 = 0;
                                for (sm1 sm1VarB = n32.b(matcher, 0, str5); sm1VarB != null; sm1VarB = sm1VarB.c()) {
                                    pm1 pm1VarB = sm1VarB.c.b(1);
                                    pm1VarB.getClass();
                                    bu1Var.b.add(pm1VarB.a);
                                    if (sm1VarB.b().f > i32) {
                                        String strQuote = Pattern.quote(str5.substring(i32, sm1VarB.b().f));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = sm1VarB.b().g + 1;
                                }
                                if (i32 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i32));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                bu1Var.a = cu1.h(sb.toString());
                                linkedHashMap.put(str4, bu1Var);
                            }
                        }
                        return linkedHashMap;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        String str6 = cu1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        cu1.a(fragment, arrayList2, sb2);
                        return new r32(arrayList2, sb2.toString());
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        r32 r32Var = (r32) cu1Var.h.getValue();
                        return (r32Var == null || (list = (List) r32Var.f) == null) ? new ArrayList() : list;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        r32 r32Var2 = (r32) cu1Var.h.getValue();
                        if (r32Var2 != null) {
                            return (String) r32Var2.g;
                        }
                        return null;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) cu1Var.j.getValue();
                        if (str7 != null) {
                            return new uk2(0, str7);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new xb3(new cs0(this) { // from class: zt1
            public final /* synthetic */ cu1 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                List list;
                int i22 = i8;
                cu1 cu1Var = this.g;
                switch (i22) {
                    case 0:
                        String str2 = cu1Var.c;
                        if (str2 != null) {
                            return new uk2(0, str2);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(cu1.r.c(cu1Var.a));
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        String str3 = cu1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) cu1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    c.g(by1.i("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) qx.r0(queryParameters);
                                if (str5 == null) {
                                    cu1Var.g = true;
                                    str5 = str4;
                                }
                                uk2 uk2Var = cu1.n;
                                uk2Var.getClass();
                                str5.getClass();
                                Matcher matcher = uk2Var.f.matcher(str5);
                                matcher.getClass();
                                bu1 bu1Var = new bu1();
                                int i32 = 0;
                                for (sm1 sm1VarB = n32.b(matcher, 0, str5); sm1VarB != null; sm1VarB = sm1VarB.c()) {
                                    pm1 pm1VarB = sm1VarB.c.b(1);
                                    pm1VarB.getClass();
                                    bu1Var.b.add(pm1VarB.a);
                                    if (sm1VarB.b().f > i32) {
                                        String strQuote = Pattern.quote(str5.substring(i32, sm1VarB.b().f));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = sm1VarB.b().g + 1;
                                }
                                if (i32 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i32));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                bu1Var.a = cu1.h(sb.toString());
                                linkedHashMap.put(str4, bu1Var);
                            }
                        }
                        return linkedHashMap;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        String str6 = cu1Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        cu1.a(fragment, arrayList2, sb2);
                        return new r32(arrayList2, sb2.toString());
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        r32 r32Var = (r32) cu1Var.h.getValue();
                        return (r32Var == null || (list = (List) r32Var.f) == null) ? new ArrayList() : list;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        r32 r32Var2 = (r32) cu1Var.h.getValue();
                        if (r32Var2 != null) {
                            return (String) r32Var2.g;
                        }
                        return null;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) cu1Var.j.getValue();
                        if (str7 != null) {
                            return new uk2(0, str7);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!m.f.matcher(str).find()) {
            String strPattern = o.f.pattern();
            strPattern.getClass();
            sb.append(strPattern);
        }
        Pattern patternCompile = Pattern.compile("(\\?|#|$)");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        sm1 sm1VarB = n32.b(matcher, 0, str);
        if (sm1VarB != null) {
            a(str.substring(0, sm1VarB.b().f), arrayList, sb);
            if (!p.f.matcher(sb).find() && !q.f.matcher(sb).find()) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = h(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        uk2 uk2Var = n;
        uk2Var.getClass();
        Matcher matcher = uk2Var.f.matcher(str);
        matcher.getClass();
        int i = 0;
        for (sm1 sm1VarB = n32.b(matcher, 0, str); sm1VarB != null; sm1VarB = sm1VarB.c()) {
            pm1 pm1VarB = sm1VarB.c.b(1);
            pm1VarB.getClass();
            arrayList.add(pm1VarB.a);
            if (sm1VarB.b().f > i) {
                String strQuote = Pattern.quote(str.substring(i, sm1VarB.b().f));
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = q.f.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i = sm1VarB.b().g + 1;
        }
        if (i < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, pt1 pt1Var) {
        if (pt1Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            xu1 xu1Var = pt1Var.a;
            str.getClass();
            xu1Var.e(bundle, str, xu1Var.d(str2));
        }
    }

    public static String h(String str) {
        return (y93.h0(str, "\\Q", false) && y93.h0(str, "\\E", false)) ? fa3.c0(str, ".*", "\\E.*\\Q") : y93.h0(str, "\\.\\*", false) ? fa3.c0(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.a);
        uri2.getClass();
        return qx.u0(pathSegments, uri2.getPathSegments()).size();
    }

    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            vx.f0(arrayList, ((bu1) it.next()).b);
        }
        return qx.D0(qx.D0(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        sm1 sm1VarB;
        sm1 sm1VarB2;
        String strDecode;
        uri.getClass();
        linkedHashMap.getClass();
        uk2 uk2Var = (uk2) this.d.getValue();
        if (uk2Var != null && (sm1VarB = uk2Var.b(uri.toString())) != null) {
            Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
            if (e(sm1VarB, bundleU, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, bundleU, linkedHashMap))) {
                String fragment = uri.getFragment();
                uk2 uk2Var2 = (uk2) this.k.getValue();
                if (uk2Var2 != null && (sm1VarB2 = uk2Var2.b(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(rx.d0(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            vr.b0();
                            throw null;
                        }
                        String str = (String) obj;
                        pm1 pm1VarB = sm1VarB2.c.b(i2);
                        if (pm1VarB != null) {
                            strDecode = Uri.decode(pm1VarB.a);
                            strDecode.getClass();
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(bundleU, str, strDecode, (pt1) linkedHashMap.get(str));
                            arrayList.add(dm3.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (vr.M(linkedHashMap, new au1(0, bundleU)).isEmpty()) {
                    return bundleU;
                }
            }
        }
        return null;
    }

    public final boolean e(sm1 sm1Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(rx.d0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String strDecode = null;
            if (i < 0) {
                vr.b0();
                throw null;
            }
            String str = (String) obj;
            pm1 pm1VarB = sm1Var.c.b(i3);
            if (pm1VarB != null) {
                strDecode = Uri.decode(pm1VarB.a);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str, strDecode, (pt1) map.get(str));
                arrayList2.add(dm3.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof cu1)) {
            return false;
        }
        return this.a.equals(((cu1) obj).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.net.Uri r20, android.os.Bundle r21, java.util.Map r22) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu1.f(android.net.Uri, android.os.Bundle, java.util.Map):boolean");
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
