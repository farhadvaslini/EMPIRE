package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class me1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ me1(tg3 tg3Var, ze zeVar, jc jcVar) {
        this.f = 28;
        this.g = zeVar;
        this.h = jcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x028c  */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() throws PendingIntent.CanceledException {
        l20 l20Var;
        long j;
        qg3 qg3VarD;
        ye1 ye1Var;
        af afVar;
        int i = 7;
        int i2 = 8;
        p40 p40Var = null;
        switch (this.f) {
            case 0:
                return new le1((gq2) this.g, oi0.f, (dq2) this.h);
            case 1:
                ie1 ie1Var = (ie1) this.g;
                os1 os1Var = (os1) this.h;
                Integer numValueOf = Integer.valueOf(ie1Var.g());
                Integer numValueOf2 = Integer.valueOf(ie1Var.h());
                Boolean bool = (Boolean) os1Var.getValue();
                bool.getClass();
                return new xk3(numValueOf, numValueOf2, bool);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                s33 s33Var = (s33) this.g;
                x50 x50Var = (x50) this.h;
                if (((Boolean) s33Var.c.d.h(t33.h)).booleanValue()) {
                    cl3.t(x50Var, null, new qp1(s33Var, p40Var, i), 3);
                }
                return Boolean.TRUE;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ut1 ut1Var = (ut1) this.g;
                qt1 qt1Var = (qt1) this.h;
                qt1Var.getClass();
                synchronized (ut1Var.a) {
                    try {
                        i93 i93Var = ut1Var.b;
                        Iterable iterable = (Iterable) i93Var.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (s51.n((qt1) obj, qt1Var)) {
                                i93Var.j(null, arrayList);
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        i93Var.j(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                pi piVar = (pi) this.g;
                yj2 yj2Var = (yj2) this.h;
                if (((bk) piVar.g).get() == 0) {
                    yj2Var.a();
                }
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((ns0) this.g).h((z31) this.h);
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((n10) this.g).d = (rs0) this.h;
                return dm3.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new File(((Context) this.g).getApplicationContext().getFilesDir(), "datastore/".concat(((dc2) this.h).a.concat(".preferences_pb")));
            case 8:
                hb0 hb0Var = (hb0) this.g;
                a42 a42Var = (a42) this.h;
                return Integer.valueOf((hb0Var.b != 5 || a42Var.g() <= 0) ? a42Var.g() : a42Var.g() - 1);
            case vr.g /* 9 */:
                ((ns0) this.g).h(Integer.valueOf(((l71) this.h).b));
                return dm3.a;
            case vr.h /* 10 */:
                js1 js1Var = (js1) this.g;
                l20 l20Var2 = (l20) this.h;
                Object[] objArr = js1Var.b;
                long[] jArr = js1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    l20Var2.z(objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 == 8) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
                return dm3.a;
            case 11:
                uk2 uk2Var = (uk2) this.g;
                String str = (String) this.h;
                uk2Var.getClass();
                Matcher matcher = uk2Var.f.matcher(str);
                matcher.getClass();
                return n32.b(matcher, 0, str);
            case vr.i /* 12 */:
                ((ns0) this.g).h((File) this.h);
                return dm3.a;
            case 13:
                ((ns0) this.g).h(((dd0) ((hd0) this.h)).a);
                return dm3.a;
            case 14:
                ((ns0) this.g).h((xy2) this.h);
                return dm3.a;
            case jo3.g /* 15 */:
                ((os1) this.h).setValue((jz2) this.g);
                return dm3.a;
            case 16:
                ((ns0) this.g).h((kq2) this.h);
                return dm3.a;
            case 17:
                ((os1) this.h).setValue((cf2) this.g);
                return dm3.a;
            case 18:
                ((ot0) this.g).h(((y31) this.h).a.b);
                return dm3.a;
            case 19:
                ((os1) this.h).setValue((qw1) this.g);
                return dm3.a;
            case 20:
                ((ns0) this.g).h((qf2) this.h);
                return dm3.a;
            case 21:
                ((ns0) this.g).h(Integer.valueOf(vm1.M(((z32) this.h).g())));
                return dm3.a;
            case 22:
                ((ns0) this.g).h((qp2) this.h);
                return dm3.a;
            case 23:
                ((ns0) this.g).h((oh3) this.h);
                return dm3.a;
            case 24:
                z53 z53Var = (z53) this.g;
                el0 el0Var = (el0) this.h;
                if (!s51.n(z53Var, el0Var.a)) {
                    vx.g0(el0Var.b, new aw2(i2, z53Var));
                    xj2 xj2Var = el0Var.c;
                    if (xj2Var != null && (l20Var = xj2Var.a) != null) {
                        l20Var.s(xj2Var, null);
                    }
                }
                return dm3.a;
            case 25:
                Context context = (Context) this.g;
                TextClassification textClassification = (TextClassification) this.h;
                String text = textClassification.getText();
                jo3.w(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                return dm3.a;
            case 26:
                cl3.t((x50) this.g, null, new l80((ns0) this.h, p40Var, 15), 1);
                return dm3.a;
            case 27:
                sf3 sf3Var = (sf3) this.g;
                long j3 = ((p41) ((os1) this.h).getValue()).a;
                gy1 gy1VarI = sf3Var.i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (gy1VarI != null) {
                    long j4 = gy1VarI.a;
                    af afVarM = sf3Var.m();
                    if (afVarM != null && afVarM.g.length() != 0) {
                        fx0 fx0Var = (fx0) sf3Var.r.getValue();
                        int i6 = fx0Var == null ? -1 : uf3.a[fx0Var.ordinal()];
                        if (i6 != -1) {
                            if (i6 == 1 || i6 == 2) {
                                long j5 = sf3Var.n().b;
                                int i7 = yg3.c;
                                j = j5 >> 32;
                            } else {
                                if (i6 != 3) {
                                    c.k();
                                    return null;
                                }
                                long j6 = sf3Var.n().b;
                                int i8 = yg3.c;
                                j = j6 & 4294967295L;
                            }
                            int i9 = (int) j;
                            ye1 ye1Var2 = sf3Var.d;
                            if (ye1Var2 != null && (qg3VarD = ye1Var2.d()) != null && (ye1Var = sf3Var.d) != null && (afVar = (af) ye1Var.a.b) != null) {
                                int iH = y02.h(sf3Var.b.r(i9), 0, afVar.g.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (qg3VarD.d(j4) >> 32));
                                pg3 pg3Var = qg3VarD.a;
                                br1 br1Var = pg3Var.b;
                                int iD = br1Var.d(iH);
                                float fE = pg3Var.e(iD);
                                float f = pg3Var.f(iD);
                                float fG = y02.g(fIntBitsToFloat, Math.min(fE, f), Math.max(fE, f));
                                if (p41.b(j3, 0L) || Math.abs(fIntBitsToFloat - fG) <= ((int) (j3 >> 32)) / 2) {
                                    float f2 = br1Var.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(((br1Var.b(iD) - f2) / 2.0f) + f2)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new gy1(jFloatToRawIntBits);
            default:
                ze zeVar = (ze) this.g;
                jc jcVar = (jc) this.h;
                og1 og1Var = (og1) zeVar.a;
                if (og1Var instanceof ng1) {
                    try {
                        jcVar.a(((ng1) og1Var).a);
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return dm3.a;
        }
    }

    public /* synthetic */ me1(ut1 ut1Var, qt1 qt1Var, boolean z) {
        this.f = 3;
        this.g = ut1Var;
        this.h = qt1Var;
    }

    public /* synthetic */ me1(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
