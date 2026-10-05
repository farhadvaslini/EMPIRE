package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PointF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.widget.EdgeEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.DoubleUnaryOperator;
import top.th1nk.samp.feature.download.DownloadForegroundService;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class pq {
    public static w01 a;
    public static w01 b;
    public static w01 c;
    public static w01 d;
    public static w01 e;
    public static w01 f;
    public static w01 g;

    public static final hf1 A(xz xzVar) {
        xzVar.getClass();
        gf1 lifecycle = xzVar.getLifecycle();
        lifecycle.getClass();
        yl1 yl1Var = lifecycle.a;
        while (true) {
            hf1 hf1Var = (hf1) ((AtomicReference) yl1Var.g).get();
            if (hf1Var != null) {
                return hf1Var;
            }
            xa3 xa3VarF = jo3.f();
            j90 j90Var = ac0.a;
            hf1 hf1Var2 = new hf1(lifecycle, Q(xa3VarF, tl1.a.k));
            AtomicReference atomicReference = (AtomicReference) yl1Var.g;
            do {
                p40 p40Var = null;
                if (atomicReference.compareAndSet(null, hf1Var2)) {
                    j90 j90Var2 = ac0.a;
                    cl3.t(hf1Var2, tl1.a.k, new pw(hf1Var2, p40Var, 8), 2);
                    return hf1Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final int B(br1 br1Var, long j, oq3 oq3Var) {
        float f2 = oq3Var != null ? oq3Var.f() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = br1Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < br1Var.f(iE) - f2 || Float.intBitsToFloat(i) > br1Var.b(iE) + f2) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-f2) || Float.intBitsToFloat(i2) > br1Var.d + f2) {
            return -1;
        }
        return iE;
    }

    public static final w01 C() {
        w01 w01Var = g;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(12.0f, 8.0f);
        tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        tx0Var.l(-0.9f, -2.0f, -2.0f, -2.0f);
        tx0Var.l(-2.0f, 0.9f, -2.0f, 2.0f);
        tx0Var.l(0.9f, 2.0f, 2.0f, 2.0f);
        tx0Var.c();
        tx0Var.j(12.0f, 10.0f);
        tx0Var.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        tx0Var.l(0.9f, 2.0f, 2.0f, 2.0f);
        tx0Var.l(2.0f, -0.9f, 2.0f, -2.0f);
        tx0Var.l(-0.9f, -2.0f, -2.0f, -2.0f);
        tx0Var.c();
        tx0Var.j(12.0f, 16.0f);
        tx0Var.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        tx0Var.l(0.9f, 2.0f, 2.0f, 2.0f);
        tx0Var.l(2.0f, -0.9f, 2.0f, -2.0f);
        tx0Var.l(-0.9f, -2.0f, -2.0f, -2.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        g = w01VarB;
        return w01VarB;
    }

    public static final long D(ye1 ye1Var, jk2 jk2Var, int i) {
        qn1 qn1Var = m22.y;
        qg3 qg3VarD = ye1Var.d();
        br1 br1Var = qg3VarD != null ? qg3VarD.a.b : null;
        ab1 ab1VarC = ye1Var.c();
        return (br1Var == null || ab1VarC == null) ? yg3.b : br1Var.h(jk2Var.i(ab1VarC.V(0L)), i, qn1Var);
    }

    public static final float[] E(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static boolean F(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean G(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final boolean H(tb1 tb1Var) {
        if (tb1Var.n == null) {
            return false;
        }
        tb1 tb1VarU = tb1Var.u();
        return (tb1VarU != null ? tb1VarU.n : null) == null || tb1Var.M.b;
    }

    public static final boolean I(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean J(nv0 nv0Var) {
        return (((Configuration) nv0Var.j(x7.a)).uiMode & 48) == 32;
    }

    public static final boolean K(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean L(int i) {
        int type;
        return (!K(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static o50 M(m50 m50Var, n50 n50Var) {
        n50Var.getClass();
        return s51.n(m50Var.getKey(), n50Var) ? li0.f : m50Var;
    }

    public static final float[] N(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] O(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static float P(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sg0.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static o50 Q(m50 m50Var, o50 o50Var) {
        o50Var.getClass();
        return o50Var == li0.f ? m50Var : (o50) o50Var.p(new z00(13, (byte) 0), m50Var);
    }

    public static final void R(m53 m53Var, wi wiVar, int i) {
        while (true) {
            int i2 = m53Var.v;
            if (i > i2 && i < m53Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            m53Var.M();
            if (m53Var.y(m53Var.v)) {
                wiVar.s();
            }
            m53Var.j();
        }
    }

    public static final String S(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + "@" + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static void T(Context context) {
        context.getClass();
        context.stopService(new Intent(context, (Class<?>) DownloadForegroundService.class));
    }

    public static final nl0 U(File file) {
        int length;
        List list;
        int iN0;
        String path = file.getPath();
        path.getClass();
        char c2 = File.separatorChar;
        int iN02 = y93.n0(path, c2, 0, 4);
        if (iN02 != 0) {
            length = (iN02 <= 0 || path.charAt(iN02 + (-1)) != ':') ? (iN02 == -1 && y93.k0(path, ':')) ? path.length() : 0 : iN02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c2 || (iN0 = y93.n0(path, c2, 2, 4)) < 0) {
            length = 1;
        } else {
            int iN03 = y93.n0(path, c2, iN0 + 1, 4);
            length = iN03 >= 0 ? iN03 + 1 : path.length();
        }
        String strSubstring = path.substring(0, length);
        String strSubstring2 = path.substring(length);
        if (strSubstring2.length() == 0) {
            list = ni0.f;
        } else {
            List listZ0 = y93.z0(strSubstring2, new char[]{c2}, 6);
            ArrayList arrayList = new ArrayList(rx.d0(listZ0, 10));
            Iterator it = listZ0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new nl0(new File(strSubstring), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [aj2, u10] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList V(i53 i53Var, int i, Integer num) {
        ?? aj2Var = new aj2(i53Var);
        int iQ = i53Var.q(i);
        iv0 iv0VarA = i53Var.a(i);
        while (i >= 0) {
            aj2Var.j(i53Var.i(i), i53Var.k(i) ? i53Var.p(i53Var.b, i) : c20.a, i53Var.a.g(i), num);
            if (iQ >= 0) {
                iv0 iv0Var = iv0VarA;
                iv0VarA = i53Var.a(iQ);
                i = iQ;
                iQ = i53Var.q(iQ);
                num = iv0Var;
            } else {
                i = iQ;
                num = iv0VarA;
            }
        }
        return (ArrayList) aj2Var.a;
    }

    public static final void a(final boolean z, final ns0 ns0Var, bq1 bq1Var, boolean z2, dt dtVar, nv0 nv0Var, final int i, final int i2) {
        boolean z3;
        int i3;
        final bq1 bq1Var2;
        final dt dtVar2;
        final boolean z4;
        int i4;
        dt dtVar3;
        int i5;
        bq1 bq1Var3;
        dt dtVar4;
        cs0 cs0Var;
        boolean z5;
        nv0Var.b0(-1406741137);
        int i6 = i | (nv0Var.g(z) ? 4 : 2) | (nv0Var.h(ns0Var) ? 32 : 16);
        int i7 = i6 | 384;
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 = i6 | 3456;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i7 | (nv0Var.g(z3) ? 2048 : 1024);
        }
        int i9 = i3 | 204800;
        if (nv0Var.R(i9 & 1, (74899 & i9) != 74898)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                if (i8 != 0) {
                    z3 = true;
                }
                fy fyVar = (fy) nv0Var.j(hy.a);
                dt dtVar5 = fyVar.e0;
                if (dtVar5 == null) {
                    long jD = hy.d(fyVar, jt.c);
                    long j = wx.f;
                    gy gyVar = jt.a;
                    long jD2 = hy.d(fyVar, gyVar);
                    i4 = -57345;
                    gy gyVar2 = jt.b;
                    dtVar3 = new dt(jD, j, jD2, j, wx.b(0.38f, hy.d(fyVar, gyVar2)), j, wx.b(0.38f, hy.d(fyVar, gyVar2)), hy.d(fyVar, gyVar), hy.d(fyVar, jt.f), wx.b(0.38f, hy.d(fyVar, gyVar2)), wx.b(0.38f, hy.d(fyVar, jt.e)), wx.b(0.38f, hy.d(fyVar, gyVar2)));
                    fyVar.e0 = dtVar3;
                } else {
                    i4 = -57345;
                    dtVar3 = dtVar5;
                }
                i5 = i9 & i4;
                bq1Var3 = yp1.a;
                dtVar4 = dtVar3;
            } else {
                nv0Var.U();
                i5 = i9 & (-57345);
                bq1Var3 = bq1Var;
                dtVar4 = dtVar;
            }
            boolean z6 = z3;
            nv0Var.q();
            float fFloor = (float) Math.floor(((ua0) nv0Var.j(s20.h)).T(2.0f));
            mi3 mi3Var = z ? mi3.f : mi3.g;
            if (ns0Var != null) {
                nv0Var.a0(2066152950);
                boolean z7 = ((i5 & 112) == 32) | ((i5 & 14) == 4);
                Object objO = nv0Var.O();
                if (z7 || objO == c20.a) {
                    z5 = false;
                    objO = new et(0, ns0Var, z);
                    nv0Var.j0(objO);
                } else {
                    z5 = false;
                }
                cs0Var = (cs0) objO;
                nv0Var.p(z5);
            } else {
                nv0Var.a0(2066218639);
                nv0Var.p(false);
                cs0Var = null;
            }
            e(mi3Var, cs0Var, new ga3(fFloor, 0.0f, 2, 0, null, 26), new ga3(fFloor, 0.0f, 0, 0, null, 30), bq1Var3, z6, dtVar4, nv0Var, (i5 << 6) & 33546240);
            bq1Var2 = bq1Var3;
            z4 = z6;
            dtVar2 = dtVar4;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            dtVar2 = dtVar;
            z4 = z3;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(z, ns0Var, bq1Var2, z4, dtVar2, i, i2) { // from class: ft
                public final /* synthetic */ boolean f;
                public final /* synthetic */ ns0 g;
                public final /* synthetic */ bq1 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ dt j;
                public final /* synthetic */ int k;

                {
                    this.k = i2;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    pq.a(this.f, this.g, this.h, this.i, this.j, (nv0) obj, iY, this.k);
                    return dm3.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z, mi3 mi3Var, bq1 bq1Var, dt dtVar, ga3 ga3Var, ga3 ga3Var2, nv0 nv0Var, int i) {
        int i2;
        bq1 bq1Var2;
        nv0 nv0Var2;
        float f2;
        int iOrdinal;
        float f3;
        mi3 mi3Var2;
        int iOrdinal2;
        float f4;
        int iOrdinal3;
        ck3 ck3VarF;
        mm0 s63Var;
        ek3 ek3VarH;
        Object objO;
        zj zjVar;
        e93 e93VarA;
        long j;
        e93 e93VarZ;
        ct ctVar;
        long j2;
        e93 e93VarZ2;
        boolean zF;
        e93 e93Var;
        Object objO2;
        nv0Var.b0(-891330208);
        if ((i & 6) == 0) {
            i2 = (nv0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.d(mi3Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            bq1Var2 = bq1Var;
            i2 |= nv0Var.f(bq1Var2) ? 256 : 128;
        } else {
            bq1Var2 = bq1Var;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.f(dtVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.h(ga3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.h(ga3Var2) ? 131072 : 65536;
        }
        if (nv0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            gk3 gk3VarD0 = w7.d0(mi3Var, null, nv0Var, (i2 >> 3) & 14, 2);
            d42 d42Var = gk3VarD0.d;
            u10 u10Var = gk3VarD0.a;
            mm0 mm0VarR = uq.R(pq1.f, nv0Var);
            bl3 bl3Var = rn.f1;
            mi3 mi3Var3 = (mi3) u10Var.h();
            nv0Var.a0(-768316570);
            int iOrdinal4 = mi3Var3.ordinal();
            float f5 = 0.0f;
            if (iOrdinal4 == 0) {
                f2 = 1.0f;
                nv0Var.p(false);
                Float fValueOf = Float.valueOf(f2);
                mi3 mi3Var4 = (mi3) d42Var.getValue();
                nv0Var.a0(-768316570);
                iOrdinal = mi3Var4.ordinal();
                if (iOrdinal == 0) {
                    f3 = 1.0f;
                    nv0Var.p(false);
                    Float fValueOf2 = Float.valueOf(f3);
                    ck3 ck3VarF2 = gk3VarD0.f();
                    nv0Var.a0(1780794470);
                    Object objA = ck3VarF2.a();
                    mi3Var2 = mi3.g;
                    mm0 s63Var2 = (objA == mi3Var2 && ck3VarF2.c() == mi3Var2) ? new s63(100) : mm0VarR;
                    nv0Var.p(false);
                    ek3 ek3VarH2 = w7.H(gk3VarD0, fValueOf, fValueOf2, s63Var2, bl3Var, nv0Var, 0);
                    mi3 mi3Var5 = (mi3) u10Var.h();
                    nv0Var.a0(1840054703);
                    iOrdinal2 = mi3Var5.ordinal();
                    if (iOrdinal2 != 0 || iOrdinal2 == 1) {
                        f4 = 0.0f;
                    } else {
                        if (iOrdinal2 != 2) {
                            c.k();
                            return;
                        }
                        f4 = 1.0f;
                    }
                    nv0Var.p(false);
                    Float fValueOf3 = Float.valueOf(f4);
                    mi3 mi3Var6 = (mi3) d42Var.getValue();
                    nv0Var.a0(1840054703);
                    iOrdinal3 = mi3Var6.ordinal();
                    if (iOrdinal3 != 0 && iOrdinal3 != 1) {
                        if (iOrdinal3 == 2) {
                            c.k();
                            return;
                        }
                        f5 = 1.0f;
                    }
                    nv0Var.p(false);
                    Float fValueOf4 = Float.valueOf(f5);
                    ck3VarF = gk3VarD0.f();
                    nv0Var.a0(630790831);
                    if (ck3VarF.a() != mi3Var2) {
                        mm0VarR = n92.D();
                    } else {
                        if (ck3VarF.c() == mi3Var2) {
                            s63Var = new s63(100);
                        }
                        nv0Var.p(false);
                        ek3VarH = w7.H(gk3VarD0, fValueOf3, fValueOf4, s63Var, bl3Var, nv0Var, 0);
                        nv0Var2 = nv0Var;
                        objO = nv0Var2.O();
                        zjVar = c20.a;
                        if (objO == zjVar) {
                            objO = new ct();
                            nv0Var2.j0(objO);
                        }
                        ct ctVar2 = (ct) objO;
                        dtVar.getClass();
                        e93VarA = f43.a(mi3Var == mi3Var2 ? dtVar.b : dtVar.a, dt.a(mi3Var, nv0Var2), nv0Var2);
                        if (z) {
                            int iOrdinal5 = mi3Var.ordinal();
                            if (iOrdinal5 == 0) {
                                j = dtVar.c;
                            } else if (iOrdinal5 != 1) {
                                if (iOrdinal5 != 2) {
                                    c.k();
                                    return;
                                }
                                j = dtVar.c;
                            } else {
                                j = dtVar.d;
                            }
                        } else {
                            int iOrdinal6 = mi3Var.ordinal();
                            if (iOrdinal6 == 0) {
                                j = dtVar.e;
                            } else if (iOrdinal6 == 1) {
                                j = dtVar.f;
                            } else {
                                if (iOrdinal6 != 2) {
                                    c.k();
                                    return;
                                }
                                j = dtVar.g;
                            }
                        }
                        if (z) {
                            nv0Var2.a0(496051715);
                            e93VarZ = f43.a(j, dt.a(mi3Var, nv0Var2), nv0Var2);
                            nv0Var2.p(false);
                        } else {
                            nv0Var2.a0(496141925);
                            e93VarZ = b32.z(new wx(j), nv0Var2);
                            nv0Var2.p(false);
                        }
                        if (z) {
                            int iOrdinal7 = mi3Var.ordinal();
                            if (iOrdinal7 == 0) {
                                ctVar = ctVar2;
                                j2 = dtVar.h;
                            } else if (iOrdinal7 != 1) {
                                if (iOrdinal7 != 2) {
                                    c.k();
                                    return;
                                }
                                ctVar = ctVar2;
                                j2 = dtVar.h;
                            } else {
                                ctVar = ctVar2;
                                j2 = dtVar.i;
                            }
                        } else {
                            ctVar = ctVar2;
                            int iOrdinal8 = mi3Var.ordinal();
                            if (iOrdinal8 == 0) {
                                j2 = dtVar.j;
                            } else if (iOrdinal8 == 1) {
                                j2 = dtVar.k;
                            } else {
                                if (iOrdinal8 != 2) {
                                    c.k();
                                    return;
                                }
                                j2 = dtVar.l;
                            }
                        }
                        if (z) {
                            nv0Var2.a0(633231558);
                            e93VarZ2 = f43.a(j2, dt.a(mi3Var, nv0Var2), nv0Var2);
                            nv0Var2.p(false);
                        } else {
                            nv0Var2.a0(633321768);
                            e93VarZ2 = b32.z(new wx(j2), nv0Var2);
                            nv0Var2.p(false);
                        }
                        bq1 bq1VarI = j43.i(j43.s(bq1Var2), 20.0f);
                        zF = nv0Var2.f(e93VarZ) | nv0Var2.f(e93VarZ2) | nv0Var2.h(ga3Var2) | nv0Var2.f(e93VarA) | nv0Var2.f(ek3VarH2) | nv0Var2.f(ek3VarH) | nv0Var2.h(ga3Var);
                        e93Var = e93VarZ;
                        objO2 = nv0Var2.O();
                        if (zF || objO2 == zjVar) {
                            ht htVar = new ht(e93Var, e93VarZ2, ga3Var2, e93VarA, ek3VarH2, ek3VarH, ga3Var, ctVar);
                            nv0Var2.j0(htVar);
                            objO2 = htVar;
                        }
                        vr.a(0, (ns0) objO2, nv0Var2, bq1VarI);
                    }
                    s63Var = mm0VarR;
                    nv0Var.p(false);
                    ek3VarH = w7.H(gk3VarD0, fValueOf3, fValueOf4, s63Var, bl3Var, nv0Var, 0);
                    nv0Var2 = nv0Var;
                    objO = nv0Var2.O();
                    zjVar = c20.a;
                    if (objO == zjVar) {
                    }
                    ct ctVar22 = (ct) objO;
                    dtVar.getClass();
                    e93VarA = f43.a(mi3Var == mi3Var2 ? dtVar.b : dtVar.a, dt.a(mi3Var, nv0Var2), nv0Var2);
                    if (z) {
                    }
                    if (z) {
                    }
                    if (z) {
                    }
                    if (z) {
                    }
                    bq1 bq1VarI2 = j43.i(j43.s(bq1Var2), 20.0f);
                    zF = nv0Var2.f(e93VarZ) | nv0Var2.f(e93VarZ2) | nv0Var2.h(ga3Var2) | nv0Var2.f(e93VarA) | nv0Var2.f(ek3VarH2) | nv0Var2.f(ek3VarH) | nv0Var2.h(ga3Var);
                    e93Var = e93VarZ;
                    objO2 = nv0Var2.O();
                    if (zF) {
                        ht htVar2 = new ht(e93Var, e93VarZ2, ga3Var2, e93VarA, ek3VarH2, ek3VarH, ga3Var, ctVar);
                        nv0Var2.j0(htVar2);
                        objO2 = htVar2;
                        vr.a(0, (ns0) objO2, nv0Var2, bq1VarI2);
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        c.k();
                        return;
                    }
                    f3 = 1.0f;
                    nv0Var.p(false);
                    Float fValueOf22 = Float.valueOf(f3);
                    ck3 ck3VarF22 = gk3VarD0.f();
                    nv0Var.a0(1780794470);
                    Object objA2 = ck3VarF22.a();
                    mi3Var2 = mi3.g;
                    if (objA2 == mi3Var2) {
                        nv0Var.p(false);
                        ek3 ek3VarH22 = w7.H(gk3VarD0, fValueOf, fValueOf22, s63Var2, bl3Var, nv0Var, 0);
                        mi3 mi3Var52 = (mi3) u10Var.h();
                        nv0Var.a0(1840054703);
                        iOrdinal2 = mi3Var52.ordinal();
                        if (iOrdinal2 != 0) {
                            f4 = 0.0f;
                            nv0Var.p(false);
                            Float fValueOf32 = Float.valueOf(f4);
                            mi3 mi3Var62 = (mi3) d42Var.getValue();
                            nv0Var.a0(1840054703);
                            iOrdinal3 = mi3Var62.ordinal();
                            if (iOrdinal3 != 0) {
                                if (iOrdinal3 == 2) {
                                }
                            }
                            nv0Var.p(false);
                            Float fValueOf42 = Float.valueOf(f5);
                            ck3VarF = gk3VarD0.f();
                            nv0Var.a0(630790831);
                            if (ck3VarF.a() != mi3Var2) {
                            }
                            s63Var = mm0VarR;
                            nv0Var.p(false);
                            ek3VarH = w7.H(gk3VarD0, fValueOf32, fValueOf42, s63Var, bl3Var, nv0Var, 0);
                            nv0Var2 = nv0Var;
                            objO = nv0Var2.O();
                            zjVar = c20.a;
                            if (objO == zjVar) {
                            }
                            ct ctVar222 = (ct) objO;
                            dtVar.getClass();
                            e93VarA = f43.a(mi3Var == mi3Var2 ? dtVar.b : dtVar.a, dt.a(mi3Var, nv0Var2), nv0Var2);
                            if (z) {
                            }
                            if (z) {
                            }
                            if (z) {
                            }
                            if (z) {
                            }
                            bq1 bq1VarI22 = j43.i(j43.s(bq1Var2), 20.0f);
                            zF = nv0Var2.f(e93VarZ) | nv0Var2.f(e93VarZ2) | nv0Var2.h(ga3Var2) | nv0Var2.f(e93VarA) | nv0Var2.f(ek3VarH22) | nv0Var2.f(ek3VarH) | nv0Var2.h(ga3Var);
                            e93Var = e93VarZ;
                            objO2 = nv0Var2.O();
                            if (zF) {
                            }
                        }
                    }
                } else {
                    f3 = 0.0f;
                    nv0Var.p(false);
                    Float fValueOf222 = Float.valueOf(f3);
                    ck3 ck3VarF222 = gk3VarD0.f();
                    nv0Var.a0(1780794470);
                    Object objA22 = ck3VarF222.a();
                    mi3Var2 = mi3.g;
                    if (objA22 == mi3Var2) {
                    }
                }
            } else if (iOrdinal4 != 1) {
                if (iOrdinal4 != 2) {
                    c.k();
                    return;
                }
                f2 = 1.0f;
                nv0Var.p(false);
                Float fValueOf5 = Float.valueOf(f2);
                mi3 mi3Var42 = (mi3) d42Var.getValue();
                nv0Var.a0(-768316570);
                iOrdinal = mi3Var42.ordinal();
                if (iOrdinal == 0) {
                }
            } else {
                f2 = 0.0f;
                nv0Var.p(false);
                Float fValueOf52 = Float.valueOf(f2);
                mi3 mi3Var422 = (mi3) d42Var.getValue();
                nv0Var.a0(-768316570);
                iOrdinal = mi3Var422.ordinal();
                if (iOrdinal == 0) {
                }
            }
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gm(z, mi3Var, bq1Var, dtVar, ga3Var, ga3Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g9 c(int i, int i2, int i3) {
        ColorSpace rgb;
        ColorSpace.Rgb rgb2;
        ColorSpace colorSpace;
        eo2 eo2Var = ky.e;
        s51.G(i3);
        Bitmap.Config configG = s51.G(i3);
        if (s51.n(eo2Var, eo2Var)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (s51.n(eo2Var, ky.q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (s51.n(eo2Var, ky.r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (s51.n(eo2Var, ky.o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (s51.n(eo2Var, ky.j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (s51.n(eo2Var, ky.i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (s51.n(eo2Var, ky.t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (s51.n(eo2Var, ky.s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (s51.n(eo2Var, ky.k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (s51.n(eo2Var, ky.l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (s51.n(eo2Var, ky.g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (s51.n(eo2Var, ky.h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (s51.n(eo2Var, ky.f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (s51.n(eo2Var, ky.m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (s51.n(eo2Var, ky.p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!s51.n(eo2Var, ky.n)) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 34) {
                    ColorSpace colorSpace2 = s51.n(eo2Var, ky.v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : s51.n(eo2Var, ky.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                    }
                } else if (i4 >= 36) {
                    ColorSpace colorSpace3 = s51.n(eo2Var, ky.x) ? ColorSpace.get(ColorSpace.Named.OK_LAB) : null;
                    if (colorSpace3 != null) {
                        colorSpace = colorSpace3;
                    }
                } else if (eo2Var != null) {
                    String str = eo2Var.a;
                    float[] fArrA = eo2Var.d.a();
                    vj3 vj3Var = eo2Var.g;
                    ColorSpace.Rgb.TransferParameters transferParameters = vj3Var != null ? new ColorSpace.Rgb.TransferParameters(vj3Var.b, vj3Var.c, vj3Var.d, vj3Var.e, vj3Var.f, vj3Var.g, vj3Var.a) : null;
                    float[] fArr = eo2Var.i;
                    final int i5 = 0;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, eo2Var.h, fArrA, transferParameters);
                        if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr2 = eo2Var.h;
                        final do2 do2Var = eo2Var.l;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: jy
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                int i6 = i5;
                                ns0 ns0Var = do2Var;
                                switch (i6) {
                                }
                                return ((Number) ns0Var.h(Double.valueOf(d2))).doubleValue();
                            }
                        };
                        final do2 do2Var2 = eo2Var.o;
                        final int i6 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: jy
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                int i62 = i6;
                                ns0 ns0Var = do2Var2;
                                switch (i62) {
                                }
                                return ((Number) ns0Var.h(Double.valueOf(d2))).doubleValue();
                            }
                        }, eo2Var.e, eo2Var.f);
                    }
                    colorSpace = rgb2;
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new g9(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configG, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = rgb;
        return new g9(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configG, true, colorSpace));
    }

    public static final void d(cs0 cs0Var, bq1 bq1Var, nd1 nd1Var, cd1 cd1Var, nv0 nv0Var, int i) {
        cd1 cd1Var2;
        nd1 nd1Var2;
        bq1 bq1Var2;
        nv0Var.b0(1055276397);
        int i2 = (nv0Var.h(cs0Var) ? 4 : 2) | i | (nv0Var.f(bq1Var) ? 32 : 16) | (nv0Var.f(nd1Var) ? 256 : 128) | (nv0Var.f(cd1Var) ? 2048 : 1024);
        if (nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            cd1Var2 = cd1Var;
            bd1 bd1Var = new bd1(nd1Var, bq1Var, cd1Var2, b32.z(cs0Var, nv0Var), 0);
            nd1Var2 = nd1Var;
            bq1Var2 = bq1Var;
            ur.d(gq.N(-933153643, bd1Var, nv0Var), nv0Var, 6);
        } else {
            cd1Var2 = cd1Var;
            nd1Var2 = nd1Var;
            bq1Var2 = bq1Var;
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ul(cs0Var, bq1Var2, nd1Var2, cd1Var2, i);
        }
    }

    public static final void e(mi3 mi3Var, cs0 cs0Var, ga3 ga3Var, ga3 ga3Var2, bq1 bq1Var, boolean z, dt dtVar, nv0 nv0Var, int i) {
        int i2;
        mi3 mi3Var2;
        int i3;
        bq1 bq1VarL;
        nv0Var.b0(-406243761);
        if ((i & 6) == 0) {
            i2 = (nv0Var.d(mi3Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(ga3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(ga3Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= nv0Var.f(dtVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= nv0Var.f(null) ? 8388608 : 4194304;
        }
        if (nv0Var.R(i2 & 1, (4793491 & i2) != 4793490)) {
            nv0Var.W();
            if ((i & 1) != 0 && !nv0Var.A()) {
                nv0Var.U();
            }
            nv0Var.q();
            bq1 bq1Var2 = yp1.a;
            if (cs0Var != null) {
                i3 = i2;
                mi3Var2 = mi3Var;
                bq1VarL = gv3.L(mi3Var2, ko2.a(jt.d / 2.0f, 4, 0L, false), z, new no2(1), cs0Var);
            } else {
                mi3Var2 = mi3Var;
                i3 = i2;
                bq1VarL = bq1Var2;
            }
            if (cs0Var != null) {
                ry0 ry0Var = w41.a;
                bq1Var2 = ep1.a;
            }
            int i4 = i3 << 6;
            b(z, mi3Var2, f80.J(bq1Var.d(bq1Var2).d(bq1VarL), 2.0f), dtVar, ga3Var, ga3Var2, nv0Var, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i4) | (i4 & 458752));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gt(mi3Var, cs0Var, ga3Var, ga3Var2, bq1Var, z, dtVar, i);
        }
    }

    public static final int f(ye1 ye1Var, long j, oq3 oq3Var) {
        long jV;
        int iB;
        qg3 qg3VarD = ye1Var.d();
        if (qg3VarD != null) {
            br1 br1Var = qg3VarD.a.b;
            ab1 ab1VarC = ye1Var.c();
            if (ab1VarC != null && (iB = B(br1Var, (jV = ab1VarC.V(j)), oq3Var)) != -1) {
                return br1Var.g(gy1.a(jV, (br1Var.b(iB) + br1Var.f(iB)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long g(ye1 ye1Var, jk2 jk2Var, jk2 jk2Var2, int i) {
        long jD = D(ye1Var, jk2Var, i);
        if (yg3.c(jD)) {
            return yg3.b;
        }
        long jD2 = D(ye1Var, jk2Var2, i);
        if (yg3.c(jD2)) {
            return yg3.b;
        }
        int i2 = (int) (jD >> 32);
        int i3 = (int) (jD2 & 4294967295L);
        return d32.f(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean h(pg3 pg3Var, int i) {
        br1 br1Var = pg3Var.b;
        int iD = br1Var.d(i);
        return i == pg3Var.g(iD) || i == br1Var.c(iD, false) ? pg3Var.h(i) != pg3Var.a(i) : pg3Var.a(i) != pg3Var.a(i - 1);
    }

    public static final long i(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
    }

    public static iy j(iy iyVar) {
        xr3 xr3Var = rn.k0;
        if (gq.y(iyVar.b, 12884901888L)) {
            eo2 eo2Var = (eo2) iyVar;
            xr3 xr3Var2 = eo2Var.d;
            if (!p(xr3Var2, xr3Var)) {
                return new eo2(eo2Var.a, eo2Var.h, xr3Var, N(m(e4.c.b, xr3Var2.a(), xr3Var.a()), eo2Var.i), eo2Var.k, eo2Var.n, eo2Var.e, eo2Var.f, eo2Var.g, -1);
            }
        }
        return iyVar;
    }

    public static final iv0 k(iv0 iv0Var) {
        if (iv0Var == null) {
            iv0Var = null;
        }
        if (iv0Var != null) {
            return iv0Var;
        }
        e20.b("Inconsistent composition");
        c.d();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [aj2, u10] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [iv0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List l(m53 m53Var, Integer num, int i, Integer num2) {
        int iE;
        int iS;
        as1 as1Var;
        if (m53Var.w || m53Var.p() == 0) {
            return ni0.f;
        }
        ?? aj2Var = new aj2(m53Var);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = m53Var.v;
            if (iE < 0) {
                iE = m53Var.E(m53Var.b, i);
            }
        }
        if (num == 0) {
            int iN = m53Var.i - m53Var.N(m53Var.b, m53Var.r(i));
            or1 or1Var = m53Var.s;
            num = Integer.valueOf(iN + ((or1Var == null || (as1Var = (as1) or1Var.b(i)) == null) ? 0 : as1Var.b));
        }
        int iR = m53Var.r(i) * 5;
        int[] iArr = m53Var.b;
        if (iR < iArr.length) {
            iS = m53Var.s(i);
        } else {
            int iE2 = iE >= 0 ? m53Var.E(iArr, iE) : iE;
            iS = m53Var.s(iE);
            int i2 = iE;
            iE = iE2;
            i = i2;
        }
        while (i >= 0) {
            aj2Var.j(iS, (m53Var.b[(m53Var.r(i) * 5) + 1] & 536870912) != 0 ? m53Var.t(i) : c20.a, m53Var.O(i), num);
            num = m53Var.b(i);
            if (iE >= 0) {
                int iE3 = m53Var.E(m53Var.b, iE);
                iS = m53Var.s(iE);
                int i3 = iE;
                iE = iE3;
                i = i3;
            } else {
                i = iE;
            }
        }
        return (ArrayList) aj2Var.a;
    }

    public static final float[] m(float[] fArr, float[] fArr2, float[] fArr3) {
        O(fArr, fArr2);
        O(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrE = E(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return N(fArrE, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final os1 o(t41 t41Var, nv0 nv0Var, int i) {
        Object objO = nv0Var.O();
        zj zjVar = c20.a;
        if (objO == zjVar) {
            objO = b32.w(Boolean.FALSE);
            nv0Var.j0(objO);
        }
        os1 os1Var = (os1) objO;
        boolean z = (((i & 14) ^ 6) > 4 && nv0Var.f(t41Var)) || (i & 6) == 4;
        Object objO2 = nv0Var.O();
        if (z || objO2 == zjVar) {
            objO2 = new j(t41Var, os1Var, null, 22);
            nv0Var.j0(objO2);
        }
        rn.l((rs0) objO2, nv0Var, t41Var);
        return os1Var;
    }

    public static final boolean p(xr3 xr3Var, xr3 xr3Var2) {
        if (xr3Var == xr3Var2) {
            return true;
        }
        return Math.abs(xr3Var.a - xr3Var2.a) < 0.001f && Math.abs(xr3Var.b - xr3Var2.b) < 0.001f;
    }

    public static final g30 q(iy iyVar, iy iyVar2) {
        return iyVar == iyVar2 ? new e30(iyVar, iyVar, 1) : (gq.y(iyVar.b, 12884901888L) && gq.y(iyVar2.b, 12884901888L)) ? new f30((eo2) iyVar, (eo2) iyVar2) : new g30(iyVar, iyVar2, 0);
    }

    public static final Integer r(i53 i53Var, g20 g20Var, int i, int i2) {
        Integer numR;
        int[] iArr = i53Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (i53Var.j(i) && i53Var.i(i) == 206 && s51.n(i53Var.p(iArr, i), e20.e)) {
                Object objH = i53Var.h(i, 0);
                rv0 rv0Var = objH instanceof rv0 ? (rv0) objH : null;
                al2 al2Var = rv0Var != null ? rv0Var.a : null;
                kv0 kv0Var = al2Var instanceof kv0 ? (kv0) al2Var : null;
                if (kv0Var != null && kv0Var.f == g20Var) {
                    return Integer.valueOf(i);
                }
            }
            if (i53Var.d(i) && (numR = r(i53Var, g20Var, i + 1, i3)) != null) {
                return Integer.valueOf(numR.intValue());
            }
            i = i3;
        }
    }

    public static a41 s(int i, long j) {
        long j2 = i;
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            return j > 0 ? a41.i : a41.h;
        }
        if (j4 < -31557014167219200L) {
            return a41.h;
        }
        if (j4 > 31556889864403199L) {
            return a41.i;
        }
        long j5 = j2 % 1000000000;
        return new a41((int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)), j4);
    }

    public static m50 t(m50 m50Var, n50 n50Var) {
        n50Var.getClass();
        if (s51.n(m50Var.getKey(), n50Var)) {
            return m50Var;
        }
        return null;
    }

    public static final w01 u() {
        w01 w01Var = a;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(19.0f, 6.41f);
        tx0Var.h(17.59f, 5.0f);
        tx0Var.h(12.0f, 10.59f);
        tx0Var.h(6.41f, 5.0f);
        tx0Var.h(5.0f, 6.41f);
        tx0Var.h(10.59f, 12.0f);
        tx0Var.h(5.0f, 17.59f);
        tx0Var.h(6.41f, 19.0f);
        tx0Var.h(12.0f, 13.41f);
        tx0Var.h(17.59f, 19.0f);
        tx0Var.h(19.0f, 17.59f);
        tx0Var.h(13.41f, 12.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        a = w01VarB;
        return w01VarB;
    }

    public static tv1 v(fy fyVar) {
        tv1 tv1Var = fyVar.k0;
        if (tv1Var != null) {
            return tv1Var;
        }
        long jD = hy.d(fyVar, rn.p0);
        long jD2 = hy.d(fyVar, rn.r0);
        long jD3 = hy.d(fyVar, rn.q0);
        gy gyVar = rn.s0;
        long jD4 = hy.d(fyVar, gyVar);
        gy gyVar2 = rn.t0;
        tv1 tv1Var2 = new tv1(jD, jD2, jD3, jD4, hy.d(fyVar, gyVar2), wx.b(0.38f, hy.d(fyVar, gyVar)), wx.b(0.38f, hy.d(fyVar, gyVar2)));
        fyVar.k0 = tv1Var2;
        return tv1Var2;
    }

    public static String w(qh0 qh0Var, int i) {
        qh0Var.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = qh0Var.a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static float x(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sg0.b(edgeEffect);
        }
        return 0.0f;
    }

    public static nv2 y(fu1 fu1Var) {
        fu1Var.getClass();
        return pv2.H(fu1Var, new fi1(21));
    }

    public static final w01 z() {
        w01 w01Var = e;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new q42(8.59f, 16.59f));
        arrayList.add(new p42(13.17f, 12.0f));
        arrayList.add(new p42(8.59f, 7.41f));
        arrayList.add(new p42(10.0f, 6.0f));
        arrayList.add(new x42(6.0f, 6.0f));
        arrayList.add(new x42(-6.0f, 6.0f));
        arrayList.add(new x42(-1.41f, -1.41f));
        arrayList.add(m42.c);
        v01.a(v01Var, arrayList, w73Var);
        w01 w01VarB = v01Var.b();
        e = w01VarB;
        return w01VarB;
    }

    public abstract List n(String str, List list);
}
