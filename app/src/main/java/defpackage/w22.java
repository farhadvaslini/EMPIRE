package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class w22 {
    public static w01 a = null;
    public static w01 b = null;
    public static final float c = 64.0f;

    public static final boolean A(ro2 ro2Var) {
        long j = ro2Var.e;
        return (j >>> 32) == (4294967295L & j) && j == ro2Var.f && j == ro2Var.g && j == ro2Var.h;
    }

    public static MappedByteBuffer B(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        if (r3 == r13) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(rb3 rb3Var, g51 g51Var, h9 h9Var, za2 za2Var, ml mlVar) {
        eu2 eu2Var;
        qn1 qn1Var;
        boolean z;
        mk2 mk2Var;
        ye1 ye1Var;
        boolean z2;
        rb3 rb3Var2 = rb3Var;
        g51 g51Var2 = g51Var;
        qn1 qn1Var2 = m22.o;
        if (mlVar instanceof eu2) {
            eu2Var = (eu2) mlVar;
            int i = eu2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                eu2Var.m = i - Integer.MIN_VALUE;
            } else {
                eu2Var = new eu2(mlVar);
            }
        }
        eu2 eu2Var2 = eu2Var;
        Object objE = eu2Var2.l;
        int i2 = eu2Var2.m;
        int i3 = 0;
        try {
            try {
                if (i2 == 0) {
                    y02.Q(objE);
                    gb2 gb2Var = (gb2) za2Var.a.get(0);
                    int i4 = za2Var.e & 1;
                    y50 y50Var = y50.f;
                    if (i4 != 0) {
                        long j = gb2Var.c;
                        sf3 sf3Var = (sf3) g51Var2.d;
                        ye1 ye1Var2 = sf3Var.d;
                        if (ye1Var2 == null || ye1Var2.d() == null || !sf3Var.k()) {
                            z2 = false;
                        } else {
                            sf3Var.t = -1;
                            ip0 ip0Var = sf3Var.l;
                            if (ip0Var != null) {
                                ip0.a(ip0Var);
                            }
                            g51Var2.d(sf3Var.n(), j, false, m22.o);
                            z2 = true;
                        }
                        if (z2) {
                            gb2Var.a();
                            long j2 = gb2Var.a;
                            xc1 xc1Var = new xc1(26, g51Var2);
                            eu2Var2.i = rb3Var2;
                            eu2Var2.j = g51Var2;
                            eu2Var2.m = 1;
                            objE = le0.e(rb3Var2, j2, xc1Var, eu2Var2);
                            if (objE == y50Var) {
                                return y50Var;
                            }
                            if (((Boolean) objE).booleanValue()) {
                            }
                        }
                    } else {
                        int i5 = h9Var.b;
                        if (i5 != 1) {
                            qn1Var = i5 != 2 ? m22.q : m22.p;
                        } else {
                            qn1Var = qn1Var2;
                        }
                        long j3 = gb2Var.c;
                        sf3 sf3Var2 = (sf3) g51Var2.d;
                        if (!sf3Var2.k() || sf3Var2.n().a.g.length() == 0 || (ye1Var = sf3Var2.d) == null || ye1Var.d() == null) {
                            z = false;
                        } else {
                            ip0 ip0Var2 = sf3Var2.l;
                            if (ip0Var2 != null) {
                                ip0.a(ip0Var2);
                            }
                            sf3Var2.o = j3;
                            sf3Var2.t = -1;
                            sf3Var2.h(true);
                            long jD = g51Var2.d(sf3Var2.n(), sf3Var2.o, true, qn1Var);
                            if (i5 >= 2) {
                                g51Var2.b = true;
                                g51Var2.c = new yg3(jD);
                            }
                            z = true;
                        }
                        if (z) {
                            mk2Var = new mk2();
                            mk2Var.f = !qn1Var.equals(qn1Var2);
                            long j4 = gb2Var.a;
                            v1 v1Var = new v1(g51Var2, qn1Var, mk2Var, 23);
                            eu2Var2.i = rb3Var2;
                            eu2Var2.j = g51Var2;
                            eu2Var2.k = mk2Var;
                            eu2Var2.m = 2;
                            objE = le0.e(rb3Var2, j4, v1Var, eu2Var2);
                        }
                    }
                } else if (i2 == 1) {
                    g51Var2 = eu2Var2.j;
                    rb3Var2 = eu2Var2.i;
                    y02.Q(objE);
                    if (((Boolean) objE).booleanValue()) {
                        List list = rb3Var2.k.y.a;
                        int size = list.size();
                        while (i3 < size) {
                            gb2 gb2Var2 = (gb2) list.get(i3);
                            if (m(gb2Var2)) {
                                gb2Var2.a();
                            }
                            i3++;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mk2 mk2Var2 = eu2Var2.k;
                    g51Var2 = eu2Var2.j;
                    rb3 rb3Var3 = eu2Var2.i;
                    y02.Q(objE);
                    mk2Var = mk2Var2;
                    rb3Var2 = rb3Var3;
                    if (((Boolean) objE).booleanValue() && mk2Var.f) {
                        List list2 = rb3Var2.k.y.a;
                        int size2 = list2.size();
                        while (i3 < size2) {
                            gb2 gb2Var3 = (gb2) list2.get(i3);
                            if (m(gb2Var3)) {
                                gb2Var3.a();
                            }
                            i3++;
                        }
                    }
                    g51Var2.c();
                }
                return dm3.a;
            } finally {
            }
        } finally {
        }
    }

    public static final long D(gb2 gb2Var, boolean z) {
        long jD = gy1.d(gb2Var.c, gb2Var.g);
        if (z || !gb2Var.c()) {
            return jD;
        }
        return 0L;
    }

    public static dc2 E(String str) {
        s12 s12Var = new s12(19);
        j90 j90Var = ac0.a;
        x80 x80Var = x80.h;
        xa3 xa3VarF = jo3.f();
        x80Var.getClass();
        return new dc2(str, s12Var, ur.c(pq.Q(x80Var, xa3VarF)));
    }

    public static final Rect F(m41 m41Var) {
        return new Rect(m41Var.a, m41Var.b, m41Var.c, m41Var.d);
    }

    public static final RectF G(jk2 jk2Var) {
        return new RectF(jk2Var.a, jk2Var.b, jk2Var.c, jk2Var.d);
    }

    public static final jk2 H(RectF rectF) {
        return new jk2(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I(rb3 rb3Var, qe3 qe3Var, za2 za2Var, ml mlVar) {
        fu2 fu2Var;
        gb2 gb2Var;
        if (mlVar instanceof fu2) {
            fu2Var = (fu2) mlVar;
            int i = fu2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                fu2Var.m = i - Integer.MIN_VALUE;
            } else {
                fu2Var = new fu2(mlVar);
            }
        }
        Object objC = fu2Var.l;
        int i2 = fu2Var.m;
        int i3 = 1;
        y50 y50Var = y50.f;
        try {
            if (i2 == 0) {
                y02.Q(objC);
                gb2Var = (gb2) qx.q0(za2Var.a);
                long j = gb2Var.a;
                fu2Var.i = rb3Var;
                fu2Var.j = qe3Var;
                fu2Var.k = gb2Var;
                fu2Var.m = 1;
                objC = le0.c(rb3Var, j, fu2Var);
                if (objC == y50Var) {
                }
                return y50Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qe3Var = fu2Var.j;
                rb3Var = fu2Var.i;
                y02.Q(objC);
                if (((Boolean) objC).booleanValue()) {
                    List list = rb3Var.k.y.a;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        gb2 gb2Var2 = (gb2) list.get(i4);
                        if (m(gb2Var2)) {
                            gb2Var2.a();
                        }
                    }
                    qe3Var.a();
                } else {
                    qe3Var.onCancel();
                }
                return dm3.a;
            }
            gb2 gb2Var3 = fu2Var.k;
            qe3Var = fu2Var.j;
            rb3 rb3Var2 = fu2Var.i;
            y02.Q(objC);
            gb2Var = gb2Var3;
            rb3Var = rb3Var2;
            gb2 gb2Var4 = (gb2) objC;
            if (gb2Var4 != null) {
                long j2 = gb2Var4.c;
                if (gy1.c(gy1.d(gb2Var.c, j2)) < le0.h(rb3Var.F(), gb2Var.i)) {
                    qe3Var.d(j2, iu2.a);
                    long j3 = gb2Var4.a;
                    uk1 uk1Var = new uk1(qe3Var, i3);
                    fu2Var.i = rb3Var;
                    fu2Var.j = qe3Var;
                    fu2Var.k = null;
                    fu2Var.m = 2;
                    objC = le0.e(rb3Var, j3, uk1Var, fu2Var);
                }
            }
            return dm3.a;
        } catch (CancellationException e) {
            qe3Var.onCancel();
            throw e;
        }
    }

    public static final void a(final boolean z, bq1 bq1Var, boolean z2, rf2 rf2Var, nv0 nv0Var, final int i) {
        final bq1 bq1Var2;
        final boolean z3;
        final rf2 rf2Var2;
        Object objZ;
        nv0Var.b0(408580840);
        int i2 = i | (nv0Var.g(z) ? 4 : 2) | 208256;
        boolean z4 = true;
        if (nv0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            nv0Var.W();
            int i3 = i & 1;
            yp1 yp1Var = yp1.a;
            if (i3 == 0 || nv0Var.A()) {
                fy fyVar = (fy) nv0Var.j(hy.a);
                rf2Var2 = fyVar.l0;
                if (rf2Var2 == null) {
                    rf2 rf2Var3 = new rf2(hy.d(fyVar, gv3.K), hy.d(fyVar, gv3.L), wx.b(0.38f, hy.d(fyVar, gv3.H)), wx.b(0.38f, hy.d(fyVar, gv3.I)));
                    fyVar.l0 = rf2Var3;
                    rf2Var2 = rf2Var3;
                }
                bq1Var2 = yp1Var;
            } else {
                nv0Var.U();
                bq1Var2 = bq1Var;
                z4 = z2;
                rf2Var2 = rf2Var;
            }
            nv0Var.q();
            e93 e93VarA = gd.a(z ? 6.0f : 0.0f, uq.R(pq1.g, nv0Var), nv0Var);
            rf2Var2.getClass();
            long j = (z4 && z) ? rf2Var2.a : (!z4 || z) ? (z4 || !z) ? rf2Var2.d : rf2Var2.c : rf2Var2.b;
            if (z4) {
                nv0Var.a0(1194696477);
                objZ = f43.a(j, uq.R(pq1.h, nv0Var), nv0Var);
                nv0Var.p(false);
            } else {
                nv0Var.a0(1194874138);
                objZ = b32.z(new wx(j), nv0Var);
                nv0Var.p(false);
            }
            bq1 bq1VarI = j43.i(f80.J(j43.s(bq1Var2.d(yp1Var).d(yp1Var)), 2.0f), gv3.J);
            boolean zF = nv0Var.f(objZ) | nv0Var.f(e93VarA);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = new er1(10, objZ, e93VarA);
                nv0Var.j0(objO);
            }
            vr.a(0, (ns0) objO, nv0Var, bq1VarI);
            z3 = z4;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            z3 = z2;
            rf2Var2 = rf2Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(z, bq1Var2, z3, rf2Var2, i) { // from class: sf2
                public final /* synthetic */ boolean f;
                public final /* synthetic */ bq1 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ rf2 i;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(49);
                    w22.a(this.f, this.g, this.h, this.i, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final ro2 b(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new ro2(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(bq1 bq1Var, rs0 rs0Var, rs0 rs0Var2, rs0 rs0Var3, rs0 rs0Var4, int i, long j, long j2, js3 js3Var, final d00 d00Var, nv0 nv0Var, final int i2, final int i3) {
        bq1 bq1Var2;
        int i4;
        rs0 rs0Var5;
        int i5;
        rs0 rs0Var6;
        int i6;
        rs0 rs0Var7;
        long j3;
        js3 js3Var2;
        int i7;
        final int i8;
        final bq1 bq1Var3;
        final rs0 rs0Var8;
        final rs0 rs0Var9;
        final rs0 rs0Var10;
        final long j4;
        final js3 js3Var3;
        final rs0 rs0Var11;
        final long j5;
        xj2 xj2VarT;
        rs0 rs0Var12;
        long jB;
        int i9;
        js3 am3Var;
        int i10;
        bq1 bq1Var4;
        long j6;
        boolean z;
        Object objO;
        ss1 ss1Var;
        boolean zF;
        Object objO2;
        nv0Var.b0(-1211482744);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            bq1Var2 = bq1Var;
        } else if ((i2 & 6) == 0) {
            bq1Var2 = bq1Var;
            i4 = (nv0Var.f(bq1Var2) ? 4 : 2) | i2;
        } else {
            bq1Var2 = bq1Var;
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                rs0Var5 = rs0Var;
                i4 |= nv0Var.h(rs0Var5) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    rs0Var6 = rs0Var2;
                    i4 |= nv0Var.h(rs0Var6) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        rs0Var7 = rs0Var3;
                        i4 |= nv0Var.h(rs0Var7) ? 2048 : 1024;
                    }
                    int i13 = i4 | 221184;
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            j3 = j;
                            int i14 = nv0Var.e(j3) ? 1048576 : 524288;
                            i13 |= i14;
                        } else {
                            j3 = j;
                        }
                        i13 |= i14;
                    } else {
                        j3 = j;
                    }
                    int i15 = i13 | 4194304;
                    if ((i3 & 256) != 0) {
                        js3Var2 = js3Var;
                        int i16 = nv0Var.f(js3Var2) ? 67108864 : 33554432;
                        i7 = i15 | i16;
                        if (nv0Var.R(i7 & 1, (i7 & 306783379) != 306783378)) {
                            nv0Var.W();
                            if ((i2 & 1) == 0 || nv0Var.A()) {
                                if (i11 != 0) {
                                    bq1Var2 = yp1.a;
                                }
                                if (i12 != 0) {
                                    rs0Var5 = s00.a;
                                }
                                if (i5 != 0) {
                                    rs0Var6 = s00.b;
                                }
                                if (i6 != 0) {
                                    rs0Var7 = s00.c;
                                }
                                rs0Var12 = s00.d;
                                if ((i3 & 64) != 0) {
                                    j3 = ((fy) nv0Var.j(hy.a)).n;
                                    i7 &= -3670017;
                                }
                                jB = hy.b(j3, nv0Var);
                                i9 = i7 & (-29360129);
                                if ((i3 & 256) != 0) {
                                    WeakHashMap weakHashMap = qt3.w;
                                    i9 = (-264241153) & i7;
                                    bq1Var4 = bq1Var2;
                                    am3Var = new am3(ak2.e(nv0Var).g, ak2.e(nv0Var).b);
                                    j6 = j3;
                                    i10 = 2;
                                    nv0Var.q();
                                    int i17 = (234881024 & i9) ^ 100663296;
                                    z = (i17 <= 67108864 && nv0Var.f(am3Var)) || (i9 & 100663296) == 67108864;
                                    objO = nv0Var.O();
                                    Object obj = c20.a;
                                    if (z || objO == obj) {
                                        objO = new ss1(am3Var);
                                        nv0Var.j0(objO);
                                    }
                                    ss1Var = (ss1) objO;
                                    rs0 rs0Var13 = rs0Var12;
                                    zF = nv0Var.f(ss1Var) | ((i17 <= 67108864 && nv0Var.f(am3Var)) || (i9 & 100663296) == 67108864);
                                    objO2 = nv0Var.O();
                                    if (zF || objO2 == obj) {
                                        objO2 = new er1(13, ss1Var, am3Var);
                                        nv0Var.j0(objO2);
                                    }
                                    rs0 rs0Var14 = rs0Var5;
                                    rs0 rs0Var15 = rs0Var6;
                                    rs0 rs0Var16 = rs0Var7;
                                    int i18 = i10;
                                    int i19 = ((i9 >> 12) & 896) | 12582912;
                                    js3 js3Var4 = am3Var;
                                    long j7 = jB;
                                    hb3.a(vm1.D(bq1Var4, (ns0) objO2), null, j6, j7, 0.0f, 0.0f, null, gq.N(848889571, new hr2(i18, rs0Var14, d00Var, rs0Var16, rs0Var13, ss1Var, rs0Var15), nv0Var), nv0Var, i19, 114);
                                    j4 = j6;
                                    j5 = j7;
                                    bq1Var3 = bq1Var4;
                                    rs0Var8 = rs0Var14;
                                    rs0Var9 = rs0Var15;
                                    rs0Var10 = rs0Var16;
                                    rs0Var11 = rs0Var13;
                                    i8 = i18;
                                    js3Var3 = js3Var4;
                                } else {
                                    am3Var = js3Var2;
                                    i10 = 2;
                                }
                            } else {
                                nv0Var.U();
                                if ((i3 & 64) != 0) {
                                    i7 &= -3670017;
                                }
                                int i20 = i7 & (-29360129);
                                if ((i3 & 256) != 0) {
                                    i20 = i7 & (-264241153);
                                }
                                i10 = i;
                                jB = j2;
                                i9 = i20;
                                am3Var = js3Var2;
                                rs0Var12 = rs0Var4;
                            }
                            bq1Var4 = bq1Var2;
                            j6 = j3;
                            nv0Var.q();
                            int i172 = (234881024 & i9) ^ 100663296;
                            if (i172 <= 67108864) {
                                objO = nv0Var.O();
                                Object obj2 = c20.a;
                                if (z) {
                                    objO = new ss1(am3Var);
                                    nv0Var.j0(objO);
                                    ss1Var = (ss1) objO;
                                    rs0 rs0Var132 = rs0Var12;
                                    if (i172 <= 67108864) {
                                        zF = nv0Var.f(ss1Var) | ((i172 <= 67108864 && nv0Var.f(am3Var)) || (i9 & 100663296) == 67108864);
                                        objO2 = nv0Var.O();
                                        if (zF) {
                                            objO2 = new er1(13, ss1Var, am3Var);
                                            nv0Var.j0(objO2);
                                            rs0 rs0Var142 = rs0Var5;
                                            rs0 rs0Var152 = rs0Var6;
                                            rs0 rs0Var162 = rs0Var7;
                                            int i182 = i10;
                                            int i192 = ((i9 >> 12) & 896) | 12582912;
                                            js3 js3Var42 = am3Var;
                                            long j72 = jB;
                                            hb3.a(vm1.D(bq1Var4, (ns0) objO2), null, j6, j72, 0.0f, 0.0f, null, gq.N(848889571, new hr2(i182, rs0Var142, d00Var, rs0Var162, rs0Var132, ss1Var, rs0Var152), nv0Var), nv0Var, i192, 114);
                                            j4 = j6;
                                            j5 = j72;
                                            bq1Var3 = bq1Var4;
                                            rs0Var8 = rs0Var142;
                                            rs0Var9 = rs0Var152;
                                            rs0Var10 = rs0Var162;
                                            rs0Var11 = rs0Var132;
                                            i8 = i182;
                                            js3Var3 = js3Var42;
                                        }
                                    } else {
                                        zF = nv0Var.f(ss1Var) | ((i172 <= 67108864 && nv0Var.f(am3Var)) || (i9 & 100663296) == 67108864);
                                        objO2 = nv0Var.O();
                                        if (zF) {
                                        }
                                    }
                                }
                            } else {
                                objO = nv0Var.O();
                                Object obj22 = c20.a;
                                if (z) {
                                }
                            }
                        } else {
                            nv0Var.U();
                            i8 = i;
                            bq1Var3 = bq1Var2;
                            rs0Var8 = rs0Var5;
                            rs0Var9 = rs0Var6;
                            rs0Var10 = rs0Var7;
                            j4 = j3;
                            js3Var3 = js3Var2;
                            rs0Var11 = rs0Var4;
                            j5 = j2;
                        }
                        xj2VarT = nv0Var.t();
                        if (xj2VarT != null) {
                            xj2VarT.d = new rs0() { // from class: fr2
                                @Override // defpackage.rs0
                                public final Object f(Object obj3, Object obj4) {
                                    ((Integer) obj4).getClass();
                                    int iY = jo3.y(i2 | 1);
                                    w22.c(bq1Var3, rs0Var8, rs0Var9, rs0Var10, rs0Var11, i8, j4, j5, js3Var3, d00Var, (nv0) obj3, iY, i3);
                                    return dm3.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    js3Var2 = js3Var;
                    i7 = i15 | i16;
                    if (nv0Var.R(i7 & 1, (i7 & 306783379) != 306783378)) {
                    }
                    xj2VarT = nv0Var.t();
                    if (xj2VarT != null) {
                    }
                }
                rs0Var7 = rs0Var3;
                int i132 = i4 | 221184;
                if ((1572864 & i2) != 0) {
                }
                int i152 = i132 | 4194304;
                if ((i3 & 256) != 0) {
                }
                i7 = i152 | i16;
                if (nv0Var.R(i7 & 1, (i7 & 306783379) != 306783378)) {
                }
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                }
            }
            rs0Var6 = rs0Var2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            rs0Var7 = rs0Var3;
            int i1322 = i4 | 221184;
            if ((1572864 & i2) != 0) {
            }
            int i1522 = i1322 | 4194304;
            if ((i3 & 256) != 0) {
            }
            i7 = i1522 | i16;
            if (nv0Var.R(i7 & 1, (i7 & 306783379) != 306783378)) {
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT != null) {
            }
        }
        rs0Var5 = rs0Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        rs0Var6 = rs0Var2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        rs0Var7 = rs0Var3;
        int i13222 = i4 | 221184;
        if ((1572864 & i2) != 0) {
        }
        int i15222 = i13222 | 4194304;
        if ((i3 & 256) != 0) {
        }
        i7 = i15222 | i16;
        if (nv0Var.R(i7 & 1, (i7 & 306783379) != 306783378)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
        }
    }

    public static final void d(int i, rs0 rs0Var, d00 d00Var, rs0 rs0Var2, rs0 rs0Var3, js3 js3Var, rs0 rs0Var4, nv0 nv0Var, int i2) {
        int i3;
        int i4;
        nv0Var.b0(-280287501);
        int i5 = i2 | (nv0Var.d(i) ? 4 : 2) | (nv0Var.h(rs0Var) ? 32 : 16) | (nv0Var.h(d00Var) ? 256 : 128) | (nv0Var.h(rs0Var2) ? 2048 : 1024) | (nv0Var.h(rs0Var3) ? 16384 : 8192) | (nv0Var.f(js3Var) ? 131072 : 65536) | (nv0Var.h(rs0Var4) ? 1048576 : 524288);
        if (nv0Var.R(i5 & 1, (599187 & i5) != 599186)) {
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = new ir2();
                nv0Var.j0(objO);
            }
            ir2 ir2Var = (ir2) objO;
            boolean z = (i5 & 112) == 32;
            Object objO2 = nv0Var.O();
            if (z || objO2 == obj) {
                objO2 = new d00(605195056, new y4(6, rs0Var), true);
                nv0Var.j0(objO2);
            }
            rs0 rs0Var5 = (rs0) objO2;
            boolean z2 = (i5 & 7168) == 2048;
            Object objO3 = nv0Var.O();
            if (z2 || objO3 == obj) {
                objO3 = new d00(418899191, new y4(5, rs0Var2), true);
                nv0Var.j0(objO3);
            }
            rs0 rs0Var6 = (rs0) objO3;
            boolean z3 = (57344 & i5) == 16384;
            Object objO4 = nv0Var.O();
            if (z3 || objO4 == obj) {
                objO4 = new d00(338600263, new y4(4, rs0Var3), true);
                nv0Var.j0(objO4);
            }
            rs0 rs0Var7 = (rs0) objO4;
            boolean z4 = (i5 & 896) == 256;
            Object objO5 = nv0Var.O();
            if (z4 || objO5 == obj) {
                i3 = i5;
                objO5 = new d00(-1776388365, new z4(9, d00Var, ir2Var), true);
                nv0Var.j0(objO5);
            } else {
                i3 = i5;
            }
            rs0 rs0Var8 = (rs0) objO5;
            boolean z5 = (i3 & 3670016) == 1048576;
            Object objO6 = nv0Var.O();
            if (z5 || objO6 == obj) {
                objO6 = new d00(-1731662488, new y4(3, rs0Var4), true);
                nv0Var.j0(objO6);
            }
            rs0 rs0Var9 = (rs0) objO6;
            boolean zF = ((i3 & 458752) == 131072) | nv0Var.f(rs0Var5) | nv0Var.f(rs0Var6) | nv0Var.f(rs0Var7) | ((i3 & 14) == 4) | nv0Var.f(rs0Var9) | nv0Var.f(rs0Var8);
            Object objO7 = nv0Var.O();
            if (zF || objO7 == obj) {
                i4 = 0;
                Object rg2Var = new rg2(js3Var, rs0Var5, rs0Var6, rs0Var7, i, rs0Var9, ir2Var, rs0Var8);
                nv0Var.j0(rg2Var);
                objO7 = rg2Var;
            } else {
                i4 = 0;
            }
            n92.b(null, (rs0) objO7, nv0Var, i4, 1);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new b00(i, rs0Var, d00Var, rs0Var2, rs0Var3, js3Var, rs0Var4, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(rb3 rb3Var, ml mlVar) {
        du2 du2Var;
        y50 y50Var;
        int size;
        int i;
        if (mlVar instanceof du2) {
            du2Var = (du2) mlVar;
            int i2 = du2Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                du2Var.k = i2 - Integer.MIN_VALUE;
            } else {
                du2Var = new du2(mlVar);
            }
        }
        Object objC = du2Var.j;
        int i3 = du2Var.k;
        if (i3 == 0) {
            y02.Q(objC);
            du2Var.i = rb3Var;
            du2Var.k = 1;
            objC = rb3Var.c(ab2.g, du2Var);
            y50Var = y50.f;
            if (objC == y50Var) {
            }
            za2 za2Var = (za2) objC;
            List list = za2Var.a;
            size = list.size();
            i = 0;
            while (i < size) {
            }
            return za2Var;
        }
        if (i3 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rb3Var = du2Var.i;
        y02.Q(objC);
        za2 za2Var2 = (za2) objC;
        List list2 = za2Var2.a;
        size = list2.size();
        i = 0;
        while (i < size) {
            if (k((gb2) list2.get(i))) {
                i++;
            } else {
                du2Var.i = rb3Var;
                du2Var.k = 1;
                objC = rb3Var.c(ab2.g, du2Var);
                y50Var = y50.f;
                if (objC == y50Var) {
                    return y50Var;
                }
                za2 za2Var22 = (za2) objC;
                List list22 = za2Var22.a;
                size = list22.size();
                i = 0;
                while (i < size) {
                }
            }
        }
        return za2Var22;
    }

    public static final jk2 f(m23 m23Var, i23 i23Var) {
        if (i23Var == null) {
            return null;
        }
        List listB = m23Var.b();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
            if (s51.n(((o23) listB.get(i)).r, i23Var)) {
                if (i23Var.s) {
                    return !i23Var.w ? i23Var.v : b32.b(i23Var.r1().l0(vr.W(i23Var), 0L, (6 & 4) != 0), lr.T(vr.W(i23Var).h));
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(rb3 rb3Var, qe3 qe3Var, za2 za2Var, int i, ml mlVar) {
        gu2 gu2Var;
        long j;
        pk2 pk2Var;
        if (mlVar instanceof gu2) {
            gu2Var = (gu2) mlVar;
            int i2 = gu2Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gu2Var.n = i2 - Integer.MIN_VALUE;
            } else {
                gu2Var = new gu2(mlVar);
            }
        }
        Object objI = gu2Var.m;
        int i3 = gu2Var.n;
        dm3 dm3Var = dm3.a;
        int i4 = 2;
        y50 y50Var = y50.f;
        try {
            if (i3 == 0) {
                y02.Q(objI);
                gb2 gb2Var = (gb2) qx.q0(za2Var.a);
                j = gb2Var.a;
                qe3Var.d(gb2Var.c, i > 2 ? m22.q : m22.p);
                pk2Var = new pk2();
                pk2Var.f = 9205357640488583168L;
                long jC = rb3Var.F().c();
                hu2 hu2Var = new hu2(j, pk2Var, null);
                gu2Var.i = rb3Var;
                gu2Var.j = qe3Var;
                gu2Var.k = pk2Var;
                gu2Var.l = j;
                gu2Var.n = 1;
                objI = rb3Var.I(jC, hu2Var, gu2Var);
                if (objI == y50Var) {
                }
                return y50Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qe3Var = gu2Var.j;
                rb3Var = gu2Var.i;
                y02.Q(objI);
                if (!((Boolean) objI).booleanValue()) {
                    qe3Var.onCancel();
                    return dm3Var;
                }
                List list = rb3Var.k.y.a;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    gb2 gb2Var2 = (gb2) list.get(i5);
                    if (m(gb2Var2)) {
                        gb2Var2.a();
                    }
                }
                qe3Var.a();
                return dm3Var;
            }
            long j2 = gu2Var.l;
            pk2Var = gu2Var.k;
            qe3 qe3Var2 = gu2Var.j;
            rb3 rb3Var2 = gu2Var.i;
            try {
                y02.Q(objI);
                j = j2;
                qe3Var = qe3Var2;
                rb3Var = rb3Var2;
            } catch (CancellationException e) {
                e = e;
                qe3Var = qe3Var2;
                qe3Var.onCancel();
                throw e;
            }
            zc0 zc0Var = (zc0) objI;
            if (zc0Var == null) {
                zc0Var = zc0.h;
            }
            if (zc0Var == zc0.i) {
                qe3Var.onCancel();
                return dm3Var;
            }
            if (zc0Var == zc0.f) {
                qe3Var.a();
                return dm3Var;
            }
            if (zc0Var == zc0.g) {
                qe3Var.e(pk2Var.f);
            }
            uk1 uk1Var = new uk1(qe3Var, i4);
            gu2Var.i = rb3Var;
            gu2Var.j = qe3Var;
            gu2Var.k = null;
            gu2Var.n = 2;
            objI = le0.e(rb3Var, j, uk1Var, gu2Var);
        } catch (CancellationException e2) {
            e = e2;
        }
    }

    public static final void h(pl plVar, long j, long j2, long j3, boolean z) {
        d42 d42Var = (d42) plVar.h;
        d42 d42Var2 = (d42) plVar.j;
        d42 d42Var3 = (d42) plVar.g;
        d42 d42Var4 = (d42) plVar.i;
        if (!gy1.b(((gy1) d42Var4.getValue()).a, j3) || !h43.a(((h43) d42Var3.getValue()).a, j) || z) {
            d42Var3.setValue(new h43(j));
            d42Var4.setValue(new gy1(j3));
            if (z) {
                d42Var.setValue(new gy1(gy1.d(gy1.d(j2, j3), gy1.d(((gy1) d42Var2.getValue()).a, ((gy1) d42Var.getValue()).a))));
            }
        }
        d42Var2.setValue(new gy1(gy1.d(j2, j3)));
    }

    public static final int i(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final int j(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final boolean k(gb2 gb2Var) {
        return (gb2Var.c() || gb2Var.h || !gb2Var.d) ? false : true;
    }

    public static final boolean l(gb2 gb2Var) {
        return !gb2Var.h && gb2Var.d;
    }

    public static final boolean m(gb2 gb2Var) {
        return (gb2Var.c() || !gb2Var.h || gb2Var.d) ? false : true;
    }

    public static final boolean n(gb2 gb2Var) {
        return gb2Var.h && !gb2Var.d;
    }

    public static tb3 o(long j, long j2, long j3, long j4, nv0 nv0Var) {
        long j5 = wx.f;
        long jE = hy.e(gv3.p0, nv0Var);
        long jE2 = hy.e(gv3.w0, nv0Var);
        long jE3 = hy.e(gv3.z0, nv0Var);
        long jB = wx.b(gv3.a0, hy.e(gv3.Z, nv0Var));
        r93 r93Var = hy.a;
        long jX = vp.x(jB, ((fy) nv0Var.j(r93Var)).p);
        long jE4 = hy.e(gv3.d0, nv0Var);
        float f = gv3.e0;
        return new tb3(j, j2, j5, jE, j3, j4, jE2, jE3, jX, vp.x(wx.b(f, jE4), ((fy) nv0Var.j(r93Var)).p), j5, vp.x(wx.b(gv3.c0, hy.e(gv3.b0, nv0Var)), ((fy) nv0Var.j(r93Var)).p), vp.x(wx.b(gv3.g0, hy.e(gv3.f0, nv0Var)), ((fy) nv0Var.j(r93Var)).p), vp.x(wx.b(f, hy.e(gv3.j0, nv0Var)), ((fy) nv0Var.j(r93Var)).p), vp.x(wx.b(f, hy.e(gv3.k0, nv0Var)), ((fy) nv0Var.j(r93Var)).p), vp.x(wx.b(gv3.i0, hy.e(gv3.h0, nv0Var)), ((fy) nv0Var.j(r93Var)).p));
    }

    public static boolean p(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static StaticLayout q(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            n21.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            n21.a("invalid end value");
        }
        if (i3 < 0) {
            n21.a("invalid maxLines value");
        }
        if (i < 0) {
            n21.a("invalid width value");
        }
        if (i4 < 0) {
            n21.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            builderObtain.setLineBreakConfig(q93.c().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final boolean r(long j, long j2) {
        return j == j2;
    }

    public static String s(jq jqVar) {
        StringBuilder sb = new StringBuilder(jqVar.size());
        for (int i = 0; i < jqVar.size(); i++) {
            byte bA = jqVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case vr.g /* 9 */:
                        sb.append("\\t");
                        break;
                    case vr.h /* 10 */:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case vr.i /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final fn1 t(dd1 dd1Var, int i, long j, v22 v22Var, long j2, um umVar, bb1 bb1Var, int i2, or1 or1Var) {
        List list;
        Object objB = v22Var.b(i);
        List list2 = (List) or1Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listC = dd1Var.c(i);
            int size = listC.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((xm1) listC.get(i3)).t(j));
            }
            or1Var.i(i, arrayList);
            list = arrayList;
        }
        return new fn1(i, i2, list, j2, objB, umVar, bb1Var);
    }

    public static final ViewParent u(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final w01 v() {
        w01 w01Var = b;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("AutoMirrored.Filled.Send", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new q42(2.01f, 21.0f));
        arrayList.add(new p42(23.0f, 12.0f));
        arrayList.add(new p42(2.01f, 3.0f));
        arrayList.add(new p42(2.0f, 10.0f));
        arrayList.add(new x42(15.0f, 2.0f));
        arrayList.add(new x42(-15.0f, 2.0f));
        arrayList.add(m42.c);
        v01.a(v01Var, arrayList, w73Var);
        w01 w01VarB = v01Var.b();
        b = w01VarB;
        return w01VarB;
    }

    public static final jk2 w(pl plVar) {
        return b32.b(gy1.e(((gy1) ((d42) plVar.h).getValue()).a, ((gy1) ((d42) plVar.i).getValue()).a), ((h43) ((d42) plVar.g).getValue()).a);
    }

    public static File x(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final boolean y(gb2 gb2Var, long j, long j2) {
        int i = gb2Var.i == 1 ? 1 : 0;
        long j3 = gb2Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static boolean z(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }
}
