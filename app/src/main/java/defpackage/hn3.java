package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hn3 {
    public static final hn3 a = new hn3();
    public static final my1 b;

    static {
        ly1 ly1Var = new ly1();
        ly1Var.a(10L);
        ly1Var.b(10L);
        b = new my1(ly1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(String str) {
        Object next;
        String strW0;
        if (str != null) {
            Iterator it = y93.z0(str, new char[]{','}, 6).iterator();
            while (it.hasNext()) {
                List listZ0 = y93.z0((String) it.next(), new char[]{';'}, 6);
                Iterator it2 = qx.o0(1, listZ0).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    String strV0 = y93.v0(y93.G0((String) next).toString(), "rel=");
                    char[] cArr = {'\"'};
                    int length = strV0.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean zF = uj.F(cArr, strV0.charAt(!z ? i : length));
                        if (z) {
                            if (!zF) {
                                break;
                            }
                            length--;
                        } else if (zF) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    if (s51.n(strV0.subSequence(i, length + 1).toString(), "next")) {
                        break;
                    }
                }
                if (((String) next) == null) {
                    strW0 = null;
                } else {
                    strW0 = y93.w0(y93.v0(y93.G0((String) qx.q0(listZ0)).toString(), "<"), ">");
                    if (strW0.length() > 0) {
                    }
                }
                if (strW0 != null) {
                    return strW0;
                }
            }
        }
        return null;
    }

    public static dn3 e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("tag_name", "");
        ArrayList arrayList = new ArrayList();
        Object objOpt = jSONObject.opt("assets");
        if (objOpt instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) objOpt;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString2 = jSONObjectOptJSONObject.optString("name");
                    strOptString2.getClass();
                    String string = y93.G0(strOptString2).toString();
                    String strOptString3 = jSONObjectOptJSONObject.optString("browser_download_url");
                    strOptString3.getClass();
                    String string2 = y93.G0(strOptString3).toString();
                    if (string.length() != 0 && string2.length() != 0) {
                        arrayList.add(new cn3(string, string2, jSONObjectOptJSONObject.optLong("size")));
                    }
                }
            }
        }
        strOptString.getClass();
        return new dn3(strOptString, arrayList, jSONObject.optBoolean("draft", false), jSONObject.optBoolean("prerelease", false));
    }

    public static ai1 f(String str) {
        JSONArray jSONArray = new JSONArray(str);
        ai1 ai1VarX = vr.x();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String string = jSONObjectOptJSONObject.toString();
                string.getClass();
                ai1VarX.add(e(string));
            }
        }
        return vr.r(ai1VarX);
    }

    public static cn3 g(dn3 dn3Var) {
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        ArrayList arrayList = dn3Var.b;
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= length) {
                int size = arrayList.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (s51.n(((cn3) obj2).a, "app-universal-release.apk")) {
                        obj = obj2;
                        break;
                    }
                }
                return (cn3) obj;
            }
            String strI = nc2.i("app-", strArr[i2], "-release.apk");
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i3);
                i3++;
                if (s51.n(((cn3) obj3).a, strI)) {
                    obj = obj3;
                    break;
                }
            }
            cn3 cn3Var = (cn3) obj;
            if (cn3Var != null) {
                return cn3Var;
            }
            i2++;
        }
    }

    public static dn3 h(List list, boolean z) {
        list.getClass();
        Iterator it = list.iterator();
        r32 r32Var = null;
        while (it.hasNext()) {
            dn3 dn3Var = (dn3) it.next();
            boolean z2 = dn3Var.c;
            String str = dn3Var.a;
            if (!z2 && (z || !dn3Var.d)) {
                ou2 ou2VarU = n32.u(str, true);
                if (ou2VarU == null) {
                    try {
                        ti tiVar = ui.a;
                        ui.c(ti.i, "UpdateChecker", "Ignoring release with invalid SemVer tag: " + str, null);
                    } catch (Throwable unused) {
                    }
                } else if (r32Var == null || ou2VarU.compareTo((ou2) r32Var.g) > 0) {
                    r32Var = new r32(dn3Var, ou2VarU);
                }
            }
        }
        if (r32Var != null) {
            return (dn3) r32Var.f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(dn3 dn3Var, String str, q40 q40Var) {
        en3 en3Var;
        Object obj;
        Object qn2Var;
        if (q40Var instanceof en3) {
            en3Var = (en3) q40Var;
            int i = en3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                en3Var.l = i - Integer.MIN_VALUE;
            } else {
                en3Var = new en3(this, q40Var);
            }
        }
        Object objQ = en3Var.j;
        int i2 = en3Var.l;
        if (i2 == 0) {
            y02.Q(objQ);
            ArrayList arrayList = dn3Var.b;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i3);
                i3++;
                if (s51.n(((cn3) obj).a, "checksums.txt")) {
                    break;
                }
            }
            cn3 cn3Var = (cn3) obj;
            if (cn3Var != null) {
                String str2 = cn3Var.b;
                en3Var.i = str;
                en3Var.l = 1;
                jr jrVar = new jr(1, vr.I(en3Var));
                jrVar.s();
                try {
                    pl plVar = new pl(7);
                    plVar.E(str2);
                    plVar.s();
                    qn2Var = new ll2(plVar);
                } catch (Throwable th) {
                    qn2Var = new qn2(th);
                }
                if (rn2.a(qn2Var) == null) {
                    my1 my1Var = b;
                    my1Var.getClass();
                    ij2 ij2Var = new ij2(my1Var, (ll2) qn2Var);
                    jrVar.v(new em2(ij2Var, 2));
                    ij2Var.e(new fm2(jrVar, 2));
                } else {
                    jrVar.t(null);
                }
                objQ = jrVar.q();
                y50 y50Var = y50.f;
                if (objQ == y50Var) {
                    return y50Var;
                }
            }
            return "";
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = en3Var.i;
        y02.Q(objQ);
        String str3 = (String) objQ;
        if (str3 != null) {
            zl0 zl0Var = new zl0(pv2.J(new vj(4, str3), new im(11, str)));
            String str4 = (String) (zl0Var.hasNext() ? zl0Var.next() : null);
            return str4 == null ? "" : str4;
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r12 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r12 != r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00bb -> B:41:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, q40 q40Var) {
        fn3 fn3Var;
        String str;
        Object objC;
        bn3 bn3Var;
        List list;
        Set set;
        String str2;
        Object objC2;
        if (q40Var instanceof fn3) {
            fn3Var = (fn3) q40Var;
            int i = fn3Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                fn3Var.o = i - Integer.MIN_VALUE;
            } else {
                fn3Var = new fn3(this, q40Var);
            }
        }
        Object obj = fn3Var.m;
        int i2 = fn3Var.o;
        Object obj2 = y50.f;
        try {
            if (i2 == 0) {
                y02.Q(obj);
                str = z ? "https://api.github.com/repos/SA-MP-Android/App/releases?per_page=100" : "https://api.github.com/repos/SA-MP-Android/App/releases/latest";
                fn3Var.j = str;
                fn3Var.i = z;
                fn3Var.o = 1;
                objC = c(str, fn3Var);
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = fn3Var.i;
                    set = fn3Var.l;
                    list = fn3Var.k;
                    y02.Q(obj);
                    objC2 = ((rn2) obj).f;
                    y02.Q(objC2);
                    bn3Var = (bn3) objC2;
                    vx.f0(list, f(bn3Var.a));
                    str2 = bn3Var.b;
                    if (str2 != null && set.add(str2)) {
                        fn3Var.j = null;
                        fn3Var.k = list;
                        fn3Var.l = set;
                        fn3Var.i = z;
                        fn3Var.o = 2;
                        objC2 = c(str2, fn3Var);
                    }
                    return h(list, true);
                }
                z = fn3Var.i;
                str = fn3Var.j;
                y02.Q(obj);
                objC = ((rn2) obj).f;
            }
            Throwable thA = rn2.a(objC);
            if (thA != null) {
                return new qn2(thA);
            }
            bn3Var = (bn3) objC;
            if (!z) {
                return h(vr.K(e(bn3Var.a)), false);
            }
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet(om1.X(1));
            linkedHashSet.add(new String[]{str}[0]);
            list = arrayList;
            set = linkedHashSet;
            vx.f0(list, f(bn3Var.a));
            str2 = bn3Var.b;
            if (str2 != null) {
                fn3Var.j = null;
                fn3Var.k = list;
                fn3Var.l = set;
                fn3Var.i = z;
                fn3Var.o = 2;
                objC2 = c(str2, fn3Var);
            }
            return h(list, true);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new qn2(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, q40 q40Var) {
        gn3 gn3Var;
        Object qn2Var;
        if (q40Var instanceof gn3) {
            gn3Var = (gn3) q40Var;
            int i = gn3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gn3Var.k = i - Integer.MIN_VALUE;
            } else {
                gn3Var = new gn3(this, q40Var);
            }
        }
        Object objQ = gn3Var.i;
        int i2 = gn3Var.k;
        int i3 = 1;
        if (i2 == 0) {
            y02.Q(objQ);
            try {
                pl plVar = new pl(7);
                plVar.E(str);
                plVar.s();
                qn2Var = new ll2(plVar);
            } catch (Throwable th) {
                qn2Var = new qn2(th);
            }
            Throwable thA = rn2.a(qn2Var);
            if (thA != null) {
                return new qn2(thA);
            }
            gn3Var.k = 1;
            jr jrVar = new jr(1, vr.I(gn3Var));
            jrVar.s();
            my1 my1Var = b;
            my1Var.getClass();
            ij2 ij2Var = new ij2(my1Var, (ll2) qn2Var);
            jrVar.v(new em2(ij2Var, 1));
            ij2Var.e(new fm2(jrVar, i3));
            objQ = jrVar.q();
            y50 y50Var = y50.f;
            if (objQ == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objQ);
        }
        return ((rn2) objQ).f;
    }
}
