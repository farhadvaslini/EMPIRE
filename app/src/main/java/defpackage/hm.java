package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import top.th1nk.samp.MainActivity;
import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hm extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm(Object obj, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((hm) m(p40Var, x50Var)).o(dm3Var);
                return dm3Var;
            case 1:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((hm) m(p40Var, x50Var)).o(dm3Var);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((hm) m(p40Var, x50Var)).o(dm3Var);
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((hm) m(p40Var, x50Var)).o(dm3Var);
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            case 8:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            case vr.g /* 9 */:
                return ((hm) m(p40Var, x50Var)).o(dm3Var);
            default:
                ((hm) m(p40Var, x50Var)).o(dm3Var);
                return dm3Var;
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                return new hm((jj3) obj2, p40Var, 0);
            case 1:
                return new hm((tw) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new hm((go3) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new hm((os1) obj2, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new hm((sa1) obj2, p40Var, 4);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new hm((String) obj2, p40Var, 5);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new hm((MainActivity) obj2, p40Var, 6);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new hm((c72) obj2, p40Var, 7);
            case 8:
                return new hm((oa2) obj2, p40Var, 8);
            case vr.g /* 9 */:
                return new hm((sm2) obj2, p40Var, 9);
            default:
                return new hm((cs0) obj2, p40Var, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0311 A[Catch: all -> 0x030c, TRY_LEAVE, TryCatch #7 {all -> 0x030c, blocks: (B:124:0x02d6, B:126:0x02dc, B:129:0x02e9, B:132:0x02f6, B:134:0x0309, B:138:0x0311, B:141:0x0333, B:142:0x0338, B:143:0x0339, B:144:0x033e, B:145:0x033f, B:146:0x0356), top: B:199:0x02d6, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0333 A[Catch: all -> 0x030c, TRY_ENTER, TryCatch #7 {all -> 0x030c, blocks: (B:124:0x02d6, B:126:0x02dc, B:129:0x02e9, B:132:0x02f6, B:134:0x0309, B:138:0x0311, B:141:0x0333, B:142:0x0338, B:143:0x0339, B:144:0x033e, B:145:0x033f, B:146:0x0356), top: B:199:0x02d6, outer: #8 }] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object qn2Var;
        Object qn2Var2;
        ln2 ln2VarF;
        nn2 nn2Var;
        File file;
        String str;
        Object qn2Var3;
        Object jm2Var;
        String string;
        long j = 0;
        long j2 = 262145;
        switch (this.j) {
            case 0:
                y02.Q(obj);
                ((jj3) this.k).a();
                return dm3.a;
            case 1:
                y02.Q(obj);
                uu uuVar = ((tw) this.k).d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                File file2 = uuVar.c;
                try {
                } catch (Throwable th) {
                    qn2Var = new qn2(th);
                }
                if (!file2.isFile()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                long length = file2.length();
                if (1 > length || length >= 262145) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                long jLastModified = file2.lastModified();
                long j3 = jCurrentTimeMillis - jLastModified;
                if (0 > j3 || j3 > 604800000) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                qn2Var = new rq(wu.b(em0.Z(file2, ys.a)), jLastModified);
                return (rq) (qn2Var instanceof qn2 ? null : qn2Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y02.Q(obj);
                ((go3) this.k).g(true);
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y02.Q(obj);
                try {
                    RaksampNativeBridge raksampNativeBridge = RaksampNativeBridge.INSTANCE;
                    os1 os1Var = (os1) this.k;
                    r93 r93Var = da1.a;
                    raksampNativeBridge.setLogLevelByName((String) os1Var.getValue());
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    ti tiVar = ui.a;
                    ui.c(ti.i, "LauncherRoute", "Unable to configure RAKSAMP log level", e2);
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y02.Q(obj);
                a31 a31Var = ((sa1) this.k).e;
                a31Var.getClass();
                try {
                    pl plVar = new pl(7);
                    plVar.E("https://sa-mp.th1nk.top/data/servers.json");
                    plVar.s();
                    ll2 ll2Var = new ll2(plVar);
                    my1 my1Var = (my1) a31Var.h;
                    my1Var.getClass();
                    ln2VarF = new ij2(my1Var, ll2Var).f();
                    try {
                        nn2Var = ln2VarF.l;
                    } finally {
                    }
                } catch (Throwable th2) {
                    qn2Var2 = new qn2(th2);
                }
                if (!ln2VarF.u) {
                    throw new IllegalStateException(("HTTP " + ln2VarF.i).toString());
                }
                if (nn2Var.b() > 262144) {
                    throw new IllegalStateException("Response is too large");
                }
                rp rpVarF = nn2Var.f();
                hp hpVar = new hp();
                while (j <= 262144) {
                    long j4 = j2;
                    long jD = rpVarF.d(Math.min(8192L, j4 - j), hpVar);
                    if (jD == -1) {
                        if (j <= 262144) {
                            throw new IllegalStateException("Response is too large");
                        }
                        String strM = hpVar.m();
                        qn2Var2 = a31.C(strM);
                        SharedPreferences sharedPreferences = (SharedPreferences) a31Var.g;
                        sharedPreferences.getClass();
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.getClass();
                        editorEdit.putString("json", strM);
                        editorEdit.apply();
                        ln2VarF.close();
                        return new rn2(qn2Var2);
                    }
                    j += jD;
                    j2 = j4;
                }
                if (j <= 262144) {
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                y02.Q(obj);
                if (((String) this.k) != null) {
                    file = new File((String) this.k);
                } else {
                    ti tiVar2 = ui.a;
                    file = ui.b;
                }
                if (file == null) {
                    return null;
                }
                em0.a0(file, "", ys.a);
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                y02.Q(obj);
                try {
                    ti tiVar3 = ui.a;
                    ui.a = ti.h;
                    ui.b((MainActivity) this.k);
                    ui.a("MainActivity", "Launcher activity created");
                    break;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    Log.w("MainActivity", "Unable to initialize launcher logging", e4);
                }
                return dm3.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                y02.Q(obj);
                c72 c72Var = (c72) this.k;
                Context context = c72Var.b;
                zt2 zt2Var = c72Var.c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = zt2Var.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        c.k();
                        return null;
                    }
                    str = "textview";
                }
                m72.o();
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(m72.k(context.getPackageName(), str).build());
                c72Var.f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            case 8:
                y02.Q(obj);
                uu uuVar2 = ((oa2) this.k).d;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File file3 = uuVar2.c;
                try {
                } catch (Throwable th3) {
                    qn2Var3 = new qn2(th3);
                }
                if (!file3.isFile()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                long length2 = file3.length();
                if (1 > length2 || length2 >= 262145) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                long jLastModified2 = file3.lastModified();
                long j5 = jCurrentTimeMillis2 - jLastModified2;
                if (0 > j5 || j5 > 604800000) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                qn2Var3 = new tq(x72.a(em0.Z(file3, ys.a)), jLastModified2);
                return (tq) (qn2Var3 instanceof qn2 ? null : qn2Var3);
            case vr.g /* 9 */:
                y02.Q(obj);
                a31 a31Var2 = ((sm2) this.k).c;
                a31Var2.getClass();
                List list = xl2.a;
                File fileR = a31Var2.r();
                if (fileR.exists() && fileR.isDirectory()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    zl0 zl0Var = new zl0(new bm0(fileR, cm0.f));
                    while (true) {
                        int i = 0;
                        if (zl0Var.hasNext()) {
                            File file4 = (File) zl0Var.next();
                            file4.getClass();
                            nl0 nl0VarX = em0.X(pq.U(file4));
                            List list2 = nl0VarX.b;
                            nl0 nl0VarX2 = em0.X(pq.U(fileR));
                            List list3 = nl0VarX2.b;
                            if (nl0VarX.a.equals(nl0VarX2.a)) {
                                int size = list3.size();
                                int size2 = list2.size();
                                int iMin = Math.min(size2, size);
                                while (i < iMin && s51.n(list2.get(i), list3.get(i))) {
                                    i++;
                                }
                                StringBuilder sb = new StringBuilder();
                                int i2 = size - 1;
                                if (i <= i2) {
                                    while (!s51.n(((File) list3.get(i2)).getName(), "..")) {
                                        sb.append("..");
                                        if (i2 != i) {
                                            sb.append(File.separatorChar);
                                        }
                                        if (i2 != i) {
                                            i2--;
                                        }
                                    }
                                    string = null;
                                }
                                if (i < size2) {
                                    if (i < size) {
                                        sb.append(File.separatorChar);
                                    }
                                    List listO0 = qx.o0(i, list2);
                                    String str2 = File.separator;
                                    str2.getClass();
                                    qx.w0(listO0, sb, str2, null, 124);
                                }
                                string = sb.toString();
                            } else {
                                string = null;
                            }
                            if (string == null) {
                                throw new IllegalArgumentException("this and base files have different roots: " + file4 + " and " + fileR + '.');
                            }
                            if (string.length() > 0) {
                                String lowerCase = string.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                linkedHashMap.put(lowerCase, string);
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (String str3 : xl2.a) {
                                String lowerCase2 = str3.toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                                String strConcat = lowerCase2.concat("/");
                                if (!linkedHashMap.isEmpty()) {
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        if (s51.n(entry.getKey(), lowerCase2) || fa3.e0((String) entry.getKey(), strConcat, false)) {
                                        }
                                        break;
                                    }
                                }
                                arrayList.add(str3.concat("/"));
                            }
                            for (String str4 : xl2.b) {
                                String lowerCase3 = str4.toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                                if (!linkedHashMap.containsKey(lowerCase3)) {
                                    arrayList.add(str4);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                return mm2.a;
                            }
                            jm2Var = new km2(arrayList);
                        }
                    }
                } else {
                    jm2Var = new jm2(by1.g("Base directory does not exist: ", fileR.getAbsolutePath()));
                }
                return jm2Var;
            default:
                y02.Q(obj);
                ((cs0) this.k).a();
                return dm3.a;
        }
    }
}
