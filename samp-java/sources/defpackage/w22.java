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

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(defpackage.rb3 r17, defpackage.g51 r18, defpackage.h9 r19, defpackage.za2 r20, defpackage.ml r21) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w22.C(rb3, g51, h9, za2, ml):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(defpackage.rb3 r12, defpackage.qe3 r13, defpackage.za2 r14, defpackage.ml r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w22.I(rb3, qe3, za2, ml):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.bq1 r24, defpackage.rs0 r25, defpackage.rs0 r26, defpackage.rs0 r27, defpackage.rs0 r28, int r29, long r30, long r32, defpackage.js3 r34, final defpackage.d00 r35, defpackage.nv0 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w22.c(bq1, rs0, rs0, rs0, rs0, int, long, long, js3, d00, nv0, int, int):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.rb3 r6, defpackage.ml r7) {
        /*
            boolean r0 = r7 instanceof defpackage.du2
            if (r0 == 0) goto L13
            r0 = r7
            du2 r0 = (defpackage.du2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            du2 r0 = new du2
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
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            gb2 r5 = (defpackage.gb2) r5
            boolean r5 = k(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w22.e(rb3, ml):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.rb3 r11, defpackage.qe3 r12, defpackage.za2 r13, int r14, defpackage.ml r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w22.g(rb3, qe3, za2, int, ml):java.lang.Object");
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
        Object tag = view.getTag(2131230923);
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
