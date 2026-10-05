package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pw extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw(Object obj, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                return ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((pw) m((p40) obj2, (d93) obj)).o(dm3Var);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
                return dm3Var;
            case 8:
                ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
                return dm3Var;
            case vr.g /* 9 */:
                return ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.h /* 10 */:
                ((pw) m((p40) obj2, (es1) obj)).o(dm3Var);
                return dm3Var;
            case 11:
                ((pw) m((p40) obj2, (es1) obj)).o(dm3Var);
                return dm3Var;
            case vr.i /* 12 */:
                ((pw) m((p40) obj2, (es1) obj)).o(dm3Var);
                return dm3Var;
            case 13:
                ((pw) m((p40) obj2, (es1) obj)).o(dm3Var);
                return dm3Var;
            case 14:
                ((pw) m((p40) obj2, (es1) obj)).o(dm3Var);
                return dm3Var;
            case jo3.g /* 15 */:
                ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
                return dm3Var;
            case 16:
                ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
                return dm3Var;
            default:
                return ((pw) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new pw((tw) this.k, (x31) this.l, p40Var, 0);
            case 1:
                return new pw((tw) this.k, (Uri) this.l, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                pw pwVar = new pw((tw) this.k, p40Var);
                pwVar.l = obj;
                return pwVar;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                pw pwVar2 = new pw((n60) this.l, p40Var, 3);
                pwVar2.k = obj;
                return pwVar2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                pw pwVar3 = new pw((z60) this.l, p40Var, 4);
                pwVar3.k = obj;
                return pwVar3;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                pw pwVar4 = new pw((d93) this.l, p40Var, 5);
                pwVar4.k = obj;
                return pwVar4;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                pw pwVar5 = new pw((Context) this.l, p40Var, 6);
                pwVar5.k = obj;
                return pwVar5;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new pw((File) this.k, (os1) this.l, p40Var, 7);
            case 8:
                pw pwVar6 = new pw((hf1) this.l, p40Var, 8);
                pwVar6.k = obj;
                return pwVar6;
            case vr.g /* 9 */:
                return new pw((sm2) this.k, (String) this.l, p40Var, 9);
            case vr.h /* 10 */:
                pw pwVar7 = new pw((qk2) this.l, p40Var, 10);
                pwVar7.k = obj;
                return pwVar7;
            case 11:
                pw pwVar8 = new pw((qy2) this.l, p40Var, 11);
                pwVar8.k = obj;
                return pwVar8;
            case vr.i /* 12 */:
                pw pwVar9 = new pw((qp2) this.l, p40Var, 12);
                pwVar9.k = obj;
                return pwVar9;
            case 13:
                pw pwVar10 = new pw((qf2) this.l, p40Var, 13);
                pwVar10.k = obj;
                return pwVar10;
            case 14:
                pw pwVar11 = new pw((oh3) this.l, p40Var, 14);
                pwVar11.k = obj;
                return pwVar11;
            case jo3.g /* 15 */:
                return new pw((l22) this.k, (a42) this.l, p40Var, 15);
            case 16:
                return new pw((m23) this.k, (o23) this.l, p40Var, 16);
            default:
                return new pw((qh0) this.k, (File) this.l, p40Var, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ml
    public final Object o(Object obj) {
        Serializable qn2Var;
        Object objO;
        Object qn2Var2;
        Object objG0;
        File[] fileArrListFiles;
        Object qn2Var3;
        String str;
        int i = 16;
        int i2 = 2;
        int i3 = 3;
        boolean z = false;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i4 = 1;
        switch (this.j) {
            case 0:
                y02.Q(obj);
                nw nwVar = ((tw) this.k).c;
                String str2 = ((x31) this.l).a;
                nwVar.getClass();
                synchronized (nwVar.e) {
                    try {
                        qn2Var = Integer.valueOf(nwVar.c(str2));
                    } catch (Throwable th) {
                        qn2Var = new qn2(th);
                    }
                    objO = nw.o(qn2Var);
                    break;
                }
                return new rn2(objO);
            case 1:
                y02.Q(obj);
                return new rn2(((tw) this.k).c.e((Uri) this.l));
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y02.Q(obj);
                try {
                    try {
                        nw nwVar2 = ((tw) this.k).c;
                        synchronized (nwVar2.e) {
                            qn2Var2 = nwVar2.j();
                        }
                    } catch (Throwable th2) {
                        qn2Var2 = new qn2(th2);
                    }
                    Throwable thA = rn2.a(qn2Var2);
                    if (thA != null) {
                        ti tiVar = ui.a;
                        ui.c(ti.i, "CleoViewModel", "Unable to list CLEO scripts", thA);
                    }
                    ni0 ni0Var = ni0.f;
                    if (qn2Var2 instanceof qn2) {
                        qn2Var2 = ni0Var;
                    }
                    i93 i93Var = ((tw) this.k).h;
                    i93Var.getClass();
                    i93Var.j(null, (List) qn2Var2);
                    i93 i93Var2 = ((tw) this.k).j;
                    Boolean bool = Boolean.FALSE;
                    i93Var2.getClass();
                    i93Var2.j(null, bool);
                    return dm3.a;
                } catch (Throwable th3) {
                    i93 i93Var3 = ((tw) this.k).j;
                    Boolean bool2 = Boolean.FALSE;
                    i93Var3.getClass();
                    i93Var3.j(null, bool2);
                    throw th3;
                }
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y02.Q(obj);
                x50 x50Var = (x50) this.k;
                n60 n60Var = (n60) this.l;
                j61 j61Var = (j61) n60Var.b.getAndSet(null);
                AtomicReference atomicReference = n60Var.b;
                w83 w83VarT = cl3.t(x50Var, null, new j(j61Var, n60Var, objArr == true ? 1 : 0, i), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, w83VarT)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                    }
                }
                return Boolean.valueOf(z);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                x50 x50Var2 = (x50) this.k;
                y02.Q(obj);
                z60 z60Var = (z60) this.l;
                cl3.t(x50Var2, null, new q60(z60Var, objArr4 == true ? 1 : 0, i4), 3);
                cl3.t(x50Var2, null, new q60(z60Var, objArr3 == true ? 1 : 0, i2), 3);
                cl3.t(x50Var2, null, new q60(z60Var, objArr2 == true ? 1 : 0, i3), 3);
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                y02.Q(obj);
                d93 d93Var = (d93) this.k;
                if ((d93Var instanceof a70) && ((a70) d93Var).a <= ((a70) ((d93) this.l)).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ti tiVar2 = ti.i;
                dm3 dm3Var = dm3.a;
                y02.Q(obj);
                Context applicationContext = ((Context) this.l).getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    try {
                        dh2.a.b(application, new ih2(application));
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        ti tiVar3 = ui.a;
                        ui.c(tiVar2, "LauncherRoute", "Unable to initialize RAKSAMP", e2);
                    }
                    break;
                } else {
                    ti tiVar4 = ui.a;
                    ui.c(tiVar2, "LauncherRoute", "Application context is unavailable", null);
                }
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                y02.Q(obj);
                os1 os1Var = (os1) this.l;
                File file = (File) this.k;
                if (file == null || (fileArrListFiles = file.listFiles()) == null) {
                    objG0 = ni0.f;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : fileArrListFiles) {
                        String name = file2.getName();
                        name.getClass();
                        if (fa3.e0(name, "raksamp_log", false)) {
                            String name2 = file2.getName();
                            name2.getClass();
                            if (fa3.Y(name2, ".txt", false)) {
                                arrayList.add(file2);
                            }
                        }
                    }
                    objG0 = qx.G0(arrayList, new up0(11));
                }
                r93 r93Var = da1.a;
                os1Var.setValue(objG0);
                return dm3.a;
            case 8:
                y02.Q(obj);
                x50 x50Var3 = (x50) this.k;
                hf1 hf1Var = (hf1) this.l;
                gf1 gf1Var = hf1Var.f;
                if (((rf1) gf1Var).i.compareTo(ff1.g) >= 0) {
                    gf1Var.a(hf1Var);
                } else {
                    j61 j61Var2 = (j61) x50Var3.h().m(f5.b0);
                    if (j61Var2 != null) {
                        j61Var2.c(null);
                    }
                }
                return dm3.a;
            case vr.g /* 9 */:
                y02.Q(obj);
                a31 a31Var = ((sm2) this.k).c;
                String str3 = (String) this.l;
                SharedPreferences sharedPreferences = (SharedPreferences) a31Var.h;
                str3.getClass();
                String str4 = str3.equals("https://sa-mp.th1nk.top/data/sources.json") ? "official_json" : s51.n(sharedPreferences.getString("custom_url", null), str3) ? "custom_json" : "missing";
                String string = sharedPreferences.getString(str4, null);
                if (string == null) {
                    return null;
                }
                try {
                    gm2 gm2Var = gm2.a;
                    qn2Var3 = gm2.b(string);
                    break;
                } catch (Throwable th4) {
                    qn2Var3 = new qn2(th4);
                }
                if (rn2.a(qn2Var3) == null) {
                    obj2 = qn2Var3;
                } else {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.getClass();
                    editorEdit.remove(str4);
                    editorEdit.apply();
                }
                return (hm2) obj2;
            case vr.h /* 10 */:
                dm3 dm3Var2 = dm3.a;
                qk2 qk2Var = (qk2) this.l;
                es1 es1Var = (es1) this.k;
                y02.Q(obj);
                ec2 ec2Var = qy2.O;
                String str5 = (String) es1Var.c(ec2Var);
                if (str5 == null) {
                    str5 = "";
                }
                ec2 ec2Var2 = qy2.P;
                String strW = (String) es1Var.c(ec2Var2);
                if (strW == null) {
                    strW = "";
                }
                if (y93.q0(str5) || y93.q0(strW)) {
                    if (y93.q0(strW)) {
                        byte[] bArr = new byte[16];
                        ry2.c.nextBytes(bArr);
                        strW = uj.W(bArr, "", new cr2(19), 30);
                    }
                    qk2Var.f = ry2.a(strW);
                    es1Var.e(ec2Var2, strW);
                    es1Var.e(ec2Var, qk2Var.f);
                } else {
                    qk2Var.f = str5;
                }
                return dm3Var2;
            case 11:
                qy2 qy2Var = (qy2) this.l;
                dm3 dm3Var3 = dm3.a;
                es1 es1Var2 = (es1) this.k;
                y02.Q(obj);
                ec2 ec2Var3 = qy2.w;
                String str6 = (String) es1Var2.c(ec2Var3);
                if (str6 == null) {
                    str6 = "";
                }
                kg1 kg1Var = new kg1(str6);
                while (true) {
                    if (kg1Var.hasNext()) {
                        if (y93.z0((String) kg1Var.next(), new char[]{'\t'}, 6).size() == 3) {
                            int i5 = 0;
                            int i6 = 1;
                            int i7 = 0;
                            es1Var2.d(ec2Var3, pv2.I(pv2.J(new vj(4, str6), new e91(i6, qy2Var, qy2.class, "decodeServer", "decodeServer(Ljava/lang/String;)Ltop/th1nk/samp/core/config/SavedServer;", i7, i5, 26)), "\n", new e91(i6, qy2Var, qy2.class, "encodeServer", "encodeServer(Ltop/th1nk/samp/core/config/SavedServer;)Ljava/lang/String;", i7, i5, 27), 30));
                        }
                    }
                }
                return dm3Var3;
            case vr.i /* 12 */:
                es1 es1Var3 = (es1) this.k;
                y02.Q(obj);
                es1Var3.d(qy2.z, ((qp2) this.l).f);
                return dm3.a;
            case 13:
                es1 es1Var4 = (es1) this.k;
                y02.Q(obj);
                es1Var4.d(qy2.H, ((qf2) this.l).f);
                return dm3.a;
            case 14:
                es1 es1Var5 = (es1) this.k;
                y02.Q(obj);
                ec2 ec2Var4 = qy2.F;
                ak2 ak2Var = oh3.f;
                oh3 oh3Var = (oh3) this.l;
                ak2Var.getClass();
                oh3Var.getClass();
                int iOrdinal = oh3Var.ordinal();
                if (iOrdinal == 0) {
                    str = "system";
                } else if (iOrdinal == 1) {
                    str = "light";
                } else if (iOrdinal == 2) {
                    str = "dark";
                } else {
                    if (iOrdinal != 3) {
                        c.k();
                        return null;
                    }
                    str = "dynamic";
                }
                es1Var5.d(ec2Var4, str);
                return dm3.a;
            case jo3.g /* 15 */:
                a42 a42Var = (a42) this.l;
                y02.Q(obj);
                l22 l22Var = (l22) this.k;
                if (s51.n(l22Var, g22.a) || s51.n(l22Var, f22.a)) {
                    List list = p03.a;
                    a42Var.h(a42Var.g() + 1);
                }
                return dm3.a;
            case 16:
                y02.Q(obj);
                m23 m23Var = (m23) this.k;
                if (m23Var.b().isEmpty()) {
                    m23Var.b.n.remove(m23Var.a);
                }
                return dm3.a;
            default:
                File file3 = (File) this.l;
                y02.Q(obj);
                int i8 = Build.VERSION.SDK_INT;
                Context context = ((qh0) this.k).a;
                return i8 >= 33 ? context.getPackageManager().getPackageArchiveInfo(file3.getAbsolutePath(), PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageArchiveInfo(file3.getAbsolutePath(), 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw(Object obj, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(tw twVar, p40 p40Var) {
        super(2, p40Var);
        this.j = 2;
        this.k = twVar;
    }
}
