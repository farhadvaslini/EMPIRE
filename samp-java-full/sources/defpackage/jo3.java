package defpackage;

import android.app.ActivityOptions;
import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jo3 {
    public static w01 b = null;
    public static final int c = 9;
    public static final int d = 6;
    public static final int e = 10;
    public static final int f = 5;
    public static final int g = 15;
    public static final int h = 48;
    public final /* synthetic */ int a;

    public /* synthetic */ jo3(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, w8 w8Var, um umVar, d00 d00Var, nv0 nv0Var, bq1 bq1Var, dw1 dw1Var, x12 x12Var, m22 m22Var, m22 m22Var2, i32 i32Var, o63 o63Var, boolean z) {
        um umVar2;
        int i3;
        w8 w8Var2;
        dw1 dw1Var2;
        x12 x12Var2;
        m22 m22Var3;
        m22 m22Var4;
        o63 o63Var2;
        boolean z2;
        um umVar3;
        xj2 xj2VarT;
        o63 o63Var3;
        x12 x12Var3;
        m22 m22Var5;
        boolean z3;
        m22 m22Var6;
        w8 w8VarB;
        dw1 dw1Var3;
        int i4;
        nv0Var.b0(1860873769);
        int i5 = i | (nv0Var.f(i32Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i5 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        int i6 = 224640 | i5;
        int i7 = i2 & 64;
        if (i7 == 0) {
            if ((i & 1572864) == 0) {
                umVar2 = umVar;
                i6 |= nv0Var.f(umVar2) ? 1048576 : 524288;
            }
            i3 = i6 | 910163968;
            if (nv0Var.R(i3 & 1, (306783379 & i3) == 306783378)) {
                nv0Var.U();
                w8Var2 = w8Var;
                dw1Var2 = dw1Var;
                x12Var2 = x12Var;
                m22Var3 = m22Var;
                m22Var4 = m22Var2;
                o63Var2 = o63Var;
                z2 = z;
                umVar3 = umVar2;
            } else {
                nv0Var.W();
                if ((i & 1) == 0 || nv0Var.A()) {
                    b22 b22Var = new b22(0.0f, 0.0f, 0.0f, 0.0f);
                    m22 m22Var7 = m22.g;
                    if (i7 != 0) {
                        umVar2 = f5.q;
                    }
                    int i8 = (i3 & 14) | 196608;
                    c32 c32Var = new c32();
                    h80 h80VarA = q83.a(nv0Var);
                    jk2 jk2Var = mr3.a;
                    s83 s83VarF = n92.F(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                    Object obj = (ua0) nv0Var.j(s20.h);
                    ee2 ee2Var = s20.n;
                    bb1 bb1Var = (bb1) nv0Var.j(ee2Var);
                    boolean zF = ((((i8 & 14) ^ 6) > 4 && nv0Var.f(i32Var)) || (i8 & 6) == 4) | nv0Var.f(h80VarA) | nv0Var.f(s83VarF) | nv0Var.f(c32Var) | nv0Var.f(obj) | nv0Var.d(bb1Var.ordinal());
                    Object objO = nv0Var.O();
                    Object obj2 = c20.a;
                    if (zF || objO == obj2) {
                        objO = new o63(new a31(i32Var, new w91(7, i32Var, bb1Var), c32Var), h80VarA, s83VarF);
                        nv0Var.j0(objO);
                    }
                    o63 o63Var4 = (o63) objO;
                    int i9 = i3 & (-29360129);
                    int i10 = (i3 & 14) | 432;
                    bb1 bb1Var2 = (bb1) nv0Var.j(ee2Var);
                    boolean zD = nv0Var.d(bb1Var2.ordinal()) | ((((i10 & 14) ^ 6) > 4 && nv0Var.f(i32Var)) || (i10 & 6) == 4);
                    Object objO2 = nv0Var.O();
                    if (zD || objO2 == obj2) {
                        objO2 = new g90(i32Var, bb1Var2);
                        nv0Var.j0(objO2);
                    }
                    g90 g90Var = (g90) objO2;
                    o63Var3 = o63Var4;
                    x12Var3 = b22Var;
                    m22Var5 = m22Var7;
                    z3 = true;
                    m22Var6 = m22.t;
                    w8VarB = m12.b(nv0Var);
                    dw1Var3 = g90Var;
                    i4 = i9;
                } else {
                    nv0Var.U();
                    i4 = i3 & (-29360129);
                    w8VarB = w8Var;
                    dw1Var3 = dw1Var;
                    x12Var3 = x12Var;
                    m22Var5 = m22Var;
                    m22Var6 = m22Var2;
                    o63Var3 = o63Var;
                    z3 = z;
                }
                um umVar4 = umVar2;
                nv0Var.q();
                uq.d(((i4 >> 3) & 14) | 24576 | ((i4 << 3) & 112) | 907545984, ((i4 >> 6) & 57344) | 1772934, w8VarB, umVar4, d00Var, nv0Var, bq1Var, dw1Var3, x12Var3, m22Var5, m22Var6, i32Var, o63Var3, z3);
                umVar3 = umVar4;
                x12Var2 = x12Var3;
                m22Var3 = m22Var5;
                m22Var4 = m22Var6;
                o63Var2 = o63Var3;
                w8Var2 = w8VarB;
                dw1Var2 = dw1Var3;
                z2 = z3;
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT == null) {
                xj2VarT.d = new gd1(i32Var, bq1Var, x12Var2, m22Var3, umVar3, o63Var2, z2, dw1Var2, m22Var4, w8Var2, d00Var, i, i2);
                return;
            }
            return;
        }
        i6 = 1797504 | i5;
        umVar2 = umVar;
        i3 = i6 | 910163968;
        if (nv0Var.R(i3 & 1, (306783379 & i3) == 306783378)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT == null) {
        }
    }

    public static final void b(long j, gh3 gh3Var, rs0 rs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-684938728);
        if ((i & 6) == 0) {
            i2 = (nv0Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(gh3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(rs0Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            t20 t20Var = mg3.a;
            vr.d(new he2[]{nc2.f(j, t30.a), t20Var.a(((gh3) nv0Var.j(t20Var)).d(gh3Var))}, rs0Var, nv0Var, ((i2 >> 3) & 112) | 8);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ge2(j, gh3Var, rs0Var, i, 0);
        }
    }

    public static final void c(y33 y33Var, boolean z, cs0 cs0Var, z13 z13Var, bq1 bq1Var, boolean z2, nt2 nt2Var, ln lnVar, x12 x12Var, rs0 rs0Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        z13 z13Var2;
        boolean z3;
        nt2 nt2Var2;
        ln lnVar2;
        x12 x12Var2;
        rs0 rs0Var2;
        int i3;
        nt2 nt2Var3;
        ln lnVarA;
        x12 x12Var3;
        rs0 rs0VarN;
        int i4;
        nt2 nt2Var4;
        boolean z4;
        ln lnVar3;
        long j;
        long j2;
        long j3;
        nt2 nt2Var5;
        boolean z5;
        nv0Var.b0(1532041126);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(y33Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z13Var2 = z13Var;
            i2 |= nv0Var.f(z13Var2) ? 2048 : 1024;
        } else {
            z13Var2 = z13Var;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 16384 : 8192;
        }
        int i5 = 196608 | i2;
        if ((1572864 & i) == 0) {
            i5 = 720896 | i2;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        int i6 = 905969664 | i5;
        if (nv0Var.R(i6 & 1, (306783379 & i6) != 306783378)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                qt2 qt2Var = qt2.a;
                fy fyVar = (fy) nv0Var.j(hy.a);
                nt2 nt2Var6 = fyVar.m0;
                if (nt2Var6 == null) {
                    gy gyVar = w7.Z;
                    long jD = hy.d(fyVar, gyVar);
                    long jD2 = hy.d(fyVar, w7.a0);
                    gy gyVar2 = w7.X;
                    long jD3 = hy.d(fyVar, gyVar2);
                    long j4 = wx.f;
                    long jD4 = hy.d(fyVar, w7.c0);
                    long jD5 = hy.d(fyVar, gyVar2);
                    long jD6 = hy.d(fyVar, gyVar);
                    gy gyVar3 = w7.T;
                    long jD7 = hy.d(fyVar, gyVar3);
                    i3 = -33030145;
                    float f2 = w7.U;
                    long jB = wx.b(f2, jD7);
                    long jD8 = hy.d(fyVar, gyVar2);
                    float f3 = w7.V;
                    nt2Var3 = new nt2(jD, jD2, jD3, j4, jD4, jD5, jD6, jB, wx.b(f3, jD8), j4, wx.b(f2, hy.d(fyVar, gyVar3)), wx.b(f3, hy.d(fyVar, gyVar2)));
                    fyVar.m0 = nt2Var3;
                } else {
                    i3 = -33030145;
                    nt2Var3 = nt2Var6;
                }
                lnVarA = r51.a(qt2.b, z ? nt2Var3.c : !z ? nt2Var3.f : nt2Var3.l);
                x12Var3 = qt2.d;
                rs0VarN = gq.N(-643804033, new st2(z), nv0Var);
                i4 = i6 & i3;
                nt2Var4 = nt2Var3;
                z4 = true;
            } else {
                nv0Var.U();
                z4 = z2;
                lnVarA = lnVar;
                x12Var3 = x12Var;
                rs0VarN = rs0Var;
                i4 = i6 & (-33030145);
                nt2Var4 = nt2Var;
            }
            nv0Var.q();
            nv0Var.a0(-1579561419);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = nc2.e(nv0Var);
            }
            qr1 qr1Var = (qr1) objO;
            nv0Var.p(false);
            nt2Var4.getClass();
            if (z4 && z) {
                lnVar3 = lnVarA;
                j = nt2Var4.a;
            } else {
                lnVar3 = lnVarA;
                j = (!z4 || z) ? (z4 || !z) ? nt2Var4.j : nt2Var4.g : nt2Var4.d;
            }
            if (z4 && z) {
                j2 = j;
                j3 = nt2Var4.b;
            } else {
                j2 = j;
                j3 = (!z4 || z) ? (z4 || !z) ? nt2Var4.k : nt2Var4.h : nt2Var4.e;
            }
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = new a42(0);
                nv0Var.j0(objO2);
            }
            a42 a42Var = (a42) objO2;
            boolean zF = nv0Var.f(qr1Var);
            Object objO3 = nv0Var.O();
            if (zF || objO3 == obj) {
                nt2Var5 = nt2Var4;
                z5 = z4;
                objO3 = new hd1(qr1Var, a42Var, null, 20);
                nv0Var.j0(objO3);
            } else {
                nt2Var5 = nt2Var4;
                z5 = z4;
            }
            rn.l((rs0) objO3, nv0Var, qr1Var);
            bq1 bq1VarA = j43.a(vm1.C(y33Var.a(bq1Var), new wa2(1, a42Var, z)), xp.c, xp.d);
            Object objO4 = nv0Var.O();
            if (objO4 == obj) {
                objO4 = new cr2(13);
                nv0Var.j0(objO4);
            }
            ln lnVar4 = lnVar3;
            x12 x12Var4 = x12Var3;
            rs0 rs0Var3 = rs0VarN;
            boolean z6 = z5;
            hb3.b(z, cs0Var, su2.a(bq1VarA, false, (ns0) objO4), z6, z13Var2, j2, j3, 0.0f, lnVar4, qr1Var, gq.N(-1208080836, new do1(2, d00Var, rs0VarN, x12Var3), nv0Var), nv0Var, ((i4 >> 3) & 126) | ((i4 >> 6) & 7168) | ((i4 << 3) & 57344), 384);
            z3 = z6;
            lnVar2 = lnVar4;
            nt2Var2 = nt2Var5;
            rs0Var2 = rs0Var3;
            x12Var2 = x12Var4;
        } else {
            nv0Var.U();
            z3 = z2;
            nt2Var2 = nt2Var;
            lnVar2 = lnVar;
            x12Var2 = x12Var;
            rs0Var2 = rs0Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new v40(y33Var, z, cs0Var, z13Var, bq1Var, z3, nt2Var2, lnVar2, x12Var2, rs0Var2, d00Var, i);
        }
    }

    public static final void d(rs0 rs0Var, d00 d00Var, x12 x12Var, nv0 nv0Var, int i) {
        nv0Var.b0(-1069265073);
        int i2 = (nv0Var.h(rs0Var) ? 4 : 2) | i | (nv0Var.h(d00Var) ? 32 : 16) | (nv0Var.f(x12Var) ? 256 : 128);
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            vm vmVar = f5.k;
            bq1 bq1VarI = f80.I(yp1.a, x12Var);
            cn1 cn1VarD = eo.d(vmVar, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarI);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            mg3.a(ql3.a(w7.W, nv0Var), gq.N(-1372614088, new do1(3, d00Var, rs0Var, uq.R(pq1.g, nv0Var)), nv0Var), nv0Var, 48);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1(rs0Var, d00Var, x12Var, i, 14);
        }
    }

    public static final void e(final bq1 bq1Var, final float f2, final d00 d00Var, nv0 nv0Var, final int i) {
        nv0Var.b0(2041406825);
        int i2 = i | 48;
        int i3 = 1;
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            f2 = qt2.b;
            bq1 bq1VarE = r51.E(j43.b(su2.a(bq1Var, false, new cr2(14)), 0.0f, 40.0f, 1), m51.f);
            dp2 dp2VarA = cp2.a(new jj(-f2, true, new c(i3)), f5.q, nv0Var, 48);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarE);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, dp2VarA);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new y33();
                nv0Var.j0(objO);
            }
            d00Var.e((y33) objO, nv0Var, 54);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(f2, d00Var, i) { // from class: rt2
                public final /* synthetic */ float g;
                public final /* synthetic */ d00 h;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(391);
                    jo3.e(this.f, this.g, this.h, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static xa3 f() {
        return new xa3(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object g(defpackage.rb3 r6, defpackage.ml r7) {
        /*
            boolean r0 = r7 instanceof defpackage.fo2
            if (r0 == 0) goto L13
            r0 = r7
            fo2 r0 = (defpackage.fo2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            fo2 r0 = new fo2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            rb3 r6 = r0.i
            defpackage.y02.Q(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.y02.Q(r7)
        L31:
            r0.i = r6
            r0.k = r2
            ab2 r7 = defpackage.ab2.g
            java.lang.Object r7 = r6.c(r7, r0)
            y50 r1 = defpackage.y50.f
            if (r7 != r1) goto L40
            return r1
        L40:
            za2 r7 = (defpackage.za2) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            gb2 r5 = (defpackage.gb2) r5
            boolean r5 = defpackage.w22.k(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo3.g(rb3, ml):java.lang.Object");
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int i(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, gf.b(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static t63 l() {
        return (t63) a73.b.j();
    }

    public static final e60 m(cr3 cr3Var) {
        return cr3Var instanceof rx0 ? ((rx0) cr3Var).getDefaultViewModelCreationExtras() : d60.b;
    }

    public static boolean n(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final boolean o(vu2 vu2Var) {
        qu2 qu2VarK = vu2Var.k();
        return qu2VarK.f.c(zu2.B);
    }

    public static final boolean p(sf3 sf3Var, boolean z) {
        ab1 ab1VarC;
        ye1 ye1Var = sf3Var.d;
        if (ye1Var == null || (ab1VarC = ye1Var.c()) == null) {
            return false;
        }
        jk2 jk2VarA = d32.A(ab1VarC);
        long jL = sf3Var.l(z);
        float f2 = jk2VarA.a;
        float f3 = jk2VarA.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = jk2VarA.b;
        float f5 = jk2VarA.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    public static final void q(String str) {
        str.getClass();
        throw new IllegalArgumentException(nc2.i("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final r13 r(r13 r13Var, r13 r13Var2, float f2) {
        long jN = vp.N(r13Var.a, r13Var2.a, f2);
        long j = r13Var.b;
        long j2 = r13Var2.b;
        float fN = lq.N(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f2);
        float fN2 = lq.N(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f2);
        return new r13(jN, (((long) Float.floatToRawIntBits(fN)) << 32) | (((long) Float.floatToRawIntBits(fN2)) & 4294967295L), lq.N(r13Var.c, r13Var2.c, f2));
    }

    public static t63 s(t63 t63Var) {
        if (t63Var instanceof kk3) {
            kk3 kk3Var = (kk3) t63Var;
            if (kk3Var.t == g12.G()) {
                kk3Var.r = null;
                return t63Var;
            }
        }
        if (t63Var instanceof lk3) {
            lk3 lk3Var = (lk3) t63Var;
            if (lk3Var.i == g12.G()) {
                lk3Var.h = null;
                return t63Var;
            }
        }
        t63 t63VarG = a73.g(t63Var, null, false);
        t63VarG.j();
        return t63VarG;
    }

    public static Object t(b5 b5Var, cs0 cs0Var) {
        t63 kk3Var;
        t63 t63Var = (t63) a73.b.j();
        if (t63Var instanceof kk3) {
            kk3 kk3Var2 = (kk3) t63Var;
            if (kk3Var2.t == g12.G()) {
                ns0 ns0Var = kk3Var2.r;
                ns0 ns0Var2 = kk3Var2.s;
                try {
                    ((kk3) t63Var).r = a73.k(b5Var, ns0Var, true);
                    ((kk3) t63Var).s = ns0Var2;
                    return cs0Var.a();
                } finally {
                    kk3Var2.r = ns0Var;
                    kk3Var2.s = ns0Var2;
                }
            }
        }
        if (t63Var == null || (t63Var instanceof ns1)) {
            kk3Var = new kk3(t63Var instanceof ns1 ? (ns1) t63Var : null, b5Var, null, true, false);
        } else {
            kk3Var = t63Var.u(b5Var);
        }
        try {
            t63 t63VarJ = kk3Var.j();
            try {
                Object objA = cs0Var.a();
                t63.q(t63VarJ);
                kk3Var.c();
                return objA;
            } catch (Throwable th) {
                t63.q(t63VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            kk3Var.c();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List u(String str) {
        JSONArray jSONArrayOptJSONArray;
        ga2 ga2Var;
        String str2;
        String strF0;
        Number number;
        str.getClass();
        if (y93.q0(str) || (jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("plugins")) == null || jSONArrayOptJSONArray.length() > 64) {
            return ni0.f;
        }
        ai1 ai1VarX = vr.x();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                Object objOpt = jSONObjectOptJSONObject.opt("id");
                String str3 = objOpt instanceof String ? (String) objOpt : null;
                if (str3 != null) {
                    Object objOpt2 = jSONObjectOptJSONObject.opt("version");
                    String str4 = objOpt2 instanceof String ? (String) objOpt2 : null;
                    if (str4 != null && !y93.q0(str3) && str3.length() <= 128 && !y93.q0(str4) && str4.length() <= 128) {
                        Object objOpt3 = jSONObjectOptJSONObject.opt("state");
                        String str5 = objOpt3 instanceof String ? (String) objOpt3 : null;
                        if (str5 != null) {
                            int iHashCode = str5.hashCode();
                            if (iHashCode != -1281977283) {
                                if (iHashCode != 270940796) {
                                    if (iHashCode == 1550783935 && str5.equals("running")) {
                                        ga2Var = ga2.f;
                                        ga2 ga2Var2 = ga2Var;
                                        Object objOpt4 = jSONObjectOptJSONObject.opt("lastError");
                                        str2 = objOpt4 instanceof String ? (String) objOpt4 : null;
                                        if (str2 == null) {
                                            strF0 = null;
                                            Object objOpt5 = jSONObjectOptJSONObject.opt("memoryBytes");
                                            number = !(objOpt5 instanceof Number) ? (Number) objOpt5 : null;
                                            if (number == null) {
                                                long jLongValue = number.longValue();
                                                Long lValueOf = Long.valueOf(jLongValue);
                                                if (jLongValue < 0) {
                                                    lValueOf = null;
                                                }
                                                if (lValueOf != null) {
                                                    long jLongValue2 = lValueOf.longValue();
                                                    Object objOpt6 = jSONObjectOptJSONObject.opt("recentErrors");
                                                    Number number2 = objOpt6 instanceof Number ? (Number) objOpt6 : null;
                                                    if (number2 == null) {
                                                        Object objOpt7 = jSONObjectOptJSONObject.opt("consecutiveErrors");
                                                        number2 = objOpt7 instanceof Number ? (Number) objOpt7 : null;
                                                    }
                                                    if (number2 != null) {
                                                        int iIntValue = number2.intValue();
                                                        Integer numValueOf = iIntValue >= 0 ? Integer.valueOf(iIntValue) : null;
                                                        if (numValueOf != null) {
                                                            ai1VarX.add(new ha2(str3, str4, ga2Var2, strF0, jLongValue2, numValueOf.intValue()));
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (y93.q0(str2)) {
                                                str2 = null;
                                            }
                                            if (str2 != null) {
                                                strF0 = y93.F0(2048, str2);
                                            }
                                            Object objOpt52 = jSONObjectOptJSONObject.opt("memoryBytes");
                                            if (!(objOpt52 instanceof Number)) {
                                            }
                                            if (number == null) {
                                            }
                                        }
                                    }
                                } else if (str5.equals("disabled")) {
                                    ga2Var = ga2.g;
                                    ga2 ga2Var22 = ga2Var;
                                    Object objOpt42 = jSONObjectOptJSONObject.opt("lastError");
                                    if (objOpt42 instanceof String) {
                                    }
                                    if (str2 == null) {
                                    }
                                }
                            } else if (str5.equals("failed")) {
                                ga2Var = ga2.h;
                                ga2 ga2Var222 = ga2Var;
                                Object objOpt422 = jSONObjectOptJSONObject.opt("lastError");
                                if (objOpt422 instanceof String) {
                                }
                                if (str2 == null) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return vr.r(ai1VarX);
    }

    public static void v(t63 t63Var, t63 t63Var2, ns0 ns0Var) {
        if (t63Var != t63Var2) {
            t63Var2.getClass();
            t63.q(t63Var);
            t63Var2.c();
        } else if (t63Var instanceof kk3) {
            ((kk3) t63Var).r = ns0Var;
        } else if (t63Var instanceof lk3) {
            ((lk3) t63Var).h = ns0Var;
        } else {
            c.h(t63Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static void w(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            pendingIntent.send();
            return;
        }
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (i >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e2) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e2);
        }
    }

    public static String x(int i) {
        return i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
    }

    public static final int y(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void z(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b2 = bArr[i];
                    if (b2 < 0) {
                        while (i < i3) {
                            int i5 = i + 1;
                            byte b3 = bArr[i];
                            if (b3 >= 0) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b3;
                                while (i5 < i3) {
                                    byte b4 = bArr[i5];
                                    if (b4 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b4;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i = i5;
                                    }
                                }
                                i4 = i6;
                                i = i5;
                            } else if (b3 < -32) {
                                if (i5 >= i3) {
                                    throw z51.a();
                                }
                                i += 2;
                                byte b5 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b3 < -62 || g12.W(b5)) {
                                    throw z51.a();
                                }
                                cArr[i4] = (char) ((b5 & 63) | ((b3 & 31) << 6));
                                i4 = i7;
                            } else {
                                if (b3 >= -16) {
                                    if (i5 >= i3 - 2) {
                                        throw z51.a();
                                    }
                                    byte b6 = bArr[i5];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i4 + 1;
                                    if (!g12.W(b6)) {
                                        if ((((b6 + 112) + (b3 << 28)) >> 30) == 0 && !g12.W(b7) && !g12.W(b8)) {
                                            int i10 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i4 += 2;
                                        }
                                    }
                                    throw z51.a();
                                }
                                if (i5 >= i3 - 1) {
                                    throw z51.a();
                                }
                                int i11 = i + 2;
                                byte b9 = bArr[i5];
                                i += 3;
                                byte b10 = bArr[i11];
                                int i12 = i4 + 1;
                                if (g12.W(b9) || ((b3 == -32 && b9 < -96) || ((b3 == -19 && b9 >= -96) || g12.W(b10)))) {
                                    throw z51.a();
                                }
                                cArr[i4] = (char) (((b9 & 63) << 6) | ((b3 & 15) << 12) | (b10 & 63));
                                i4 = i12;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i++;
                    cArr[i4] = (char) b2;
                    i4++;
                }
                while (i < i3) {
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = c51.a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw z51.a();
                }
                return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(String str, int i, byte[] bArr, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        char c2 = 2048;
        char c3 = 55296;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i5 = i2 + i;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = i6 + i;
                    if (i7 >= i5 || (cCharAt = str.charAt(i6)) >= 128) {
                        if (i6 != length) {
                            return i + length;
                        }
                        int i8 = i + i6;
                        while (i6 < length) {
                            char cCharAt3 = str.charAt(i6);
                            if (cCharAt3 < 128 && i8 < i5) {
                                bArr[i8] = (byte) cCharAt3;
                                i8++;
                            } else if (cCharAt3 < 2048 && i8 <= i5 - 2) {
                                int i9 = i8 + 1;
                                bArr[i8] = (byte) ((cCharAt3 >>> 6) | 960);
                                i8 += 2;
                                bArr[i9] = (byte) ((cCharAt3 & '?') | 128);
                            } else {
                                if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i8 > i5 - 3) {
                                    if (i8 > i5 - 4) {
                                        if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i3)))) {
                                            throw new ko3(i6, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i8);
                                    }
                                    int i10 = i6 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i8 + 3;
                                            bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i8 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i6 = i10;
                                        } else {
                                            i6 = i10;
                                        }
                                    }
                                    throw new ko3(i6 - 1, length);
                                }
                                bArr[i8] = (byte) ((cCharAt3 >>> '\f') | 480);
                                int i12 = i8 + 2;
                                bArr[i8 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                                i8 += 3;
                                bArr[i12] = (byte) ((cCharAt3 & '?') | 128);
                            }
                            i6++;
                        }
                        return i8;
                    }
                    bArr[i7] = (byte) cCharAt;
                    i6++;
                }
                if (i6 != length) {
                }
                break;
            default:
                long j = i;
                long j2 = ((long) i2) + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i13 = 0;
                while (i13 < length2 && (cCharAt2 = str.charAt(i13)) < 128) {
                    qm3.j(bArr, j, (byte) cCharAt2);
                    i13++;
                    j++;
                }
                if (i13 != length2) {
                    while (i13 < length2) {
                        char cCharAt5 = str.charAt(i13);
                        if (cCharAt5 < 128 && j < j2) {
                            qm3.j(bArr, j, (byte) cCharAt5);
                            j++;
                        } else if (cCharAt5 >= c2 || j > j2 - 2) {
                            int i14 = i13;
                            if ((cCharAt5 >= c3 && 57343 >= cCharAt5) || j > j2 - 3) {
                                if (j > j2 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i4 = i14 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i4)))) {
                                        throw new ko3(i14, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                }
                                i13 = i14 + 1;
                                if (i13 != length2) {
                                    char cCharAt6 = str.charAt(i13);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        qm3.j(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                        qm3.j(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j3 = j + 3;
                                        qm3.j(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j += 4;
                                        qm3.j(bArr, j3, (byte) ((codePoint2 & 63) | 128));
                                    }
                                } else {
                                    i13 = i14;
                                }
                                throw new ko3(i13 - 1, length2);
                            }
                            qm3.j(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j4 = j + 2;
                            qm3.j(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j += 3;
                            qm3.j(bArr, j4, (byte) ((cCharAt5 & '?') | 128));
                            i13 = i14;
                        } else {
                            long j5 = j + 1;
                            qm3.j(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
                            j += 2;
                            qm3.j(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                            i13 = i13;
                        }
                        i13++;
                        c2 = 2048;
                        c3 = 55296;
                    }
                }
                return (int) j;
        }
    }
}
