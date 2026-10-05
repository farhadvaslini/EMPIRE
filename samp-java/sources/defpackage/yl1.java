package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class yl1 implements oo1, ln1, di, vn1, z30, b40, ub2, xi {
    public static final tv0 h = new tv0(1);
    public final /* synthetic */ int f;
    public Object g;

    public yl1(int i) {
        vo1 vo1Var;
        this.f = i;
        switch (i) {
            case 1:
                this.g = new t1(this);
                break;
            case 8:
                this.g = new AtomicInteger(0);
                break;
            case vr.g /* 9 */:
                this.g = new AtomicReference(null);
                break;
            case 14:
                TimeUnit.MINUTES.getClass();
                id3 id3Var = id3.l;
                id3Var.getClass();
                this.g = new lj2(id3Var);
                break;
            case 18:
                this.g = s51.e(ul3.b);
                break;
            case 21:
                this.g = new x73(f80.b0);
                break;
            default:
                be2 be2Var = be2.c;
                try {
                    vo1Var = (vo1) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    vo1Var = h;
                }
                vo1[] vo1VarArr = {tv0.b, vo1Var};
                xl1 xl1Var = new xl1();
                xl1Var.a = vo1VarArr;
                Charset charset = c51.a;
                this.g = xl1Var;
                break;
        }
    }

    public d93 A() {
        return (d93) ((i93) this.g).getValue();
    }

    public e93 B() {
        nh0 nh0VarA = nh0.a();
        if (nh0VarA.c() == 1) {
            return new c11(true);
        }
        d42 d42VarW = b32.w(Boolean.FALSE);
        nh0VarA.h(new v80(d42VarW, this));
        return d42VarW;
    }

    public void C(float f, float f2, float f3, float f4) {
        pi piVar = (pi) this.g;
        pr prVarK = piVar.k();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (piVar.A() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (piVar.A() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            l21.a("Width and height must be greater than or equal to zero");
        }
        piVar.Q(jFloatToRawIntBits);
        prVarK.g(f, f2);
    }

    public boolean D(int i, int i2, Bundle bundle) {
        return false;
    }

    public boolean E(tb1 tb1Var) {
        if (!tb1Var.H()) {
            m21.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((x73) this.g).remove(tb1Var);
    }

    public void F(float f, long j) {
        pr prVarK = ((pi) this.g).k();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        prVarK.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        prVarK.c(f);
        prVarK.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void G(float f, float f2, long j) {
        pr prVarK = ((pi) this.g).k();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        prVarK.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        prVarK.b(f, f2);
        prVarK.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void H(float f, float f2) {
        ((pi) this.g).k().g(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(defpackage.d93 r5) {
        /*
            r4 = this;
            r5.getClass()
            java.lang.Object r4 = r4.g
            i93 r4 = (defpackage.i93) r4
        L7:
            java.lang.Object r0 = r4.getValue()
            r1 = r0
            d93 r1 = (defpackage.d93) r1
            boolean r2 = r1 instanceof defpackage.zi2
            if (r2 != 0) goto L3c
            ul3 r2 = defpackage.ul3.b
            boolean r2 = defpackage.s51.n(r1, r2)
            if (r2 == 0) goto L1b
            goto L3c
        L1b:
            boolean r2 = r1 instanceof defpackage.a70
            if (r2 == 0) goto L29
            int r2 = r5.a
            r3 = r1
            a70 r3 = (defpackage.a70) r3
            int r3 = r3.a
            if (r2 <= r3) goto L3d
            goto L3c
        L29:
            boolean r2 = r1 instanceof defpackage.km0
            if (r2 == 0) goto L2e
            goto L3d
        L2e:
            boolean r4 = r1 instanceof defpackage.ww1
            if (r4 == 0) goto L38
            java.lang.String r4 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.c.q(r4)
            return
        L38:
            defpackage.c.k()
            return
        L3c:
            r1 = r5
        L3d:
            boolean r0 = r4.h(r0, r1)
            if (r0 == 0) goto L7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl1.I(d93):void");
    }

    public void J(int i, Object obj, qr2 qr2Var) {
        nx nxVar = (nx) this.g;
        nxVar.B(i, 3);
        qr2Var.f((f0) obj, nxVar.a);
        nxVar.B(i, 4);
    }

    @Override // defpackage.ub2
    public long a(m41 m41Var, long j, bb1 bb1Var, long j2) {
        long j3 = ((i41) ((cs0) this.g).a()).a;
        int iL = lr.l(m41Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), bb1Var == bb1.f);
        return (((long) lr.l(m41Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iL) << 32);
    }

    @Override // defpackage.oo1
    public void b(nn1 nn1Var, boolean z) {
        if (nn1Var instanceof na3) {
            ((na3) nn1Var).z.k().c(false);
        }
        oo1 oo1Var = ((z2) this.g).j;
        if (oo1Var != null) {
            oo1Var.b(nn1Var, z);
        }
    }

    @Override // defpackage.z30
    public c40 build() {
        return new c40(new yl1(((ContentInfo.Builder) this.g).build()));
    }

    @Override // defpackage.b40
    public int c() {
        return ((ContentInfo) this.g).getSource();
    }

    @Override // defpackage.xi
    public Object d(cs2 cs2Var, Float f, Float f2, ns0 ns0Var, n63 n63Var) {
        Object objX = g12.x(cs2Var, f.floatValue(), cl3.c(0.0f, f2.floatValue(), 28), (h80) this.g, ns0Var, n63Var);
        return objX == y50.f ? objX : (le) objX;
    }

    @Override // defpackage.b40
    public ClipData e() {
        return ((ContentInfo) this.g).getClip();
    }

    @Override // defpackage.ln1
    public boolean g(nn1 nn1Var, MenuItem menuItem) {
        c3 c3Var = ((ActionMenuView) this.g).F;
        if (c3Var != null) {
            Toolbar toolbar = ((pi3) c3Var).f;
            toolbar.L.b();
            ti3 ti3Var = toolbar.N;
            if (ti3Var != null ? ((vi3) ti3Var).f.b.onMenuItemSelected(0, menuItem) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vn1
    public void h(nn1 nn1Var, MenuItem menuItem) {
        ((ds) this.g).k.removeCallbacksAndMessages(nn1Var);
    }

    @Override // defpackage.b40
    public int i() {
        return ((ContentInfo) this.g).getFlags();
    }

    @Override // defpackage.vn1
    public void j(nn1 nn1Var, wn1 wn1Var) {
        ds dsVar = (ds) this.g;
        Handler handler = dsVar.k;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = dsVar.m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (nn1Var == ((cs) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new bs(this, i2 < arrayList.size() ? (cs) arrayList.get(i2) : null, wn1Var, nn1Var), nn1Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.b40
    public ContentInfo k() {
        return (ContentInfo) this.g;
    }

    @Override // defpackage.ln1
    public void l(nn1 nn1Var) {
        ln1 ln1Var = ((ActionMenuView) this.g).A;
        if (ln1Var != null) {
            ln1Var.l(nn1Var);
        }
    }

    @Override // defpackage.z30
    public void n(Uri uri) {
        ((ContentInfo.Builder) this.g).setLinkUri(uri);
    }

    @Override // defpackage.oo1
    public boolean p(nn1 nn1Var) {
        z2 z2Var = (z2) this.g;
        if (nn1Var == z2Var.h) {
            return false;
        }
        ((na3) nn1Var).A.getClass();
        oo1 oo1Var = z2Var.j;
        if (oo1Var != null) {
            return oo1Var.p(nn1Var);
        }
        return false;
    }

    @Override // defpackage.z30
    public void q(int i) {
        ((ContentInfo.Builder) this.g).setFlags(i);
    }

    public void r(tb1 tb1Var) {
        if (!tb1Var.H()) {
            m21.c("DepthSortedSet.add called on an unattached node");
        }
        ((x73) this.g).add(tb1Var);
    }

    @Override // defpackage.z30
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.g).setExtras(bundle);
    }

    public void t(float f, float f2, float f3, float f4, int i) {
        ((pi) this.g).k().f(f, f2, f3, f4, i);
    }

    public String toString() {
        switch (this.f) {
            case 16:
                return "ContentInfoCompat{" + ((ContentInfo) this.g) + "}";
            case 21:
                return ((x73) this.g).toString();
            default:
                return super.toString();
        }
    }

    public s1 u(int i) {
        return null;
    }

    public void v() {
        ((g20) this.g).getClass();
    }

    public void w(byte b) {
        ((Parcel) this.g).writeByte(b);
    }

    public void x(float f) {
        ((Parcel) this.g).writeFloat(f);
    }

    public void y(long j) {
        long jB = jh3.b(j);
        byte b = 0;
        if (!kh3.a(jB, 0L)) {
            if (kh3.a(jB, 4294967296L)) {
                b = 1;
            } else if (kh3.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        w(b);
        if (kh3.a(jh3.b(j), 0L)) {
            return;
        }
        x(jh3.c(j));
    }

    public s1 z(int i) {
        return null;
    }

    public void f(int i) {
    }

    public void m(int i) {
    }

    public void o(int i, float f) {
    }

    public /* synthetic */ yl1(int i, boolean z) {
        this.f = i;
    }

    public yl1(nx nxVar) {
        this.f = 12;
        c51.a(nxVar, "output");
        this.g = nxVar;
        nxVar.a = this;
    }

    public yl1(boolean z) {
        this.f = 7;
        this.g = new AtomicBoolean(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[PHI: r10
      0x0029: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0019, B:10:0x0022, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yl1(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 6
            r0.f = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            ej[][] r4 = new defpackage.ej[r2][]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L13:
            if (r6 >= r2) goto L6a
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L29
            if (r9 == r3) goto L32
            if (r9 == r11) goto L30
            if (r9 == r10) goto L2b
            r10 = 4
            if (r9 == r10) goto L29
            r10 = 5
            if (r9 == r10) goto L29
            r13 = r8
            goto L34
        L29:
            r13 = r10
            goto L34
        L2b:
            if (r7 != r3) goto L32
            goto L30
        L2e:
            r13 = r7
            goto L34
        L30:
            r7 = r11
            goto L2e
        L32:
            r7 = r3
            goto L2e
        L34:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            ej[] r11 = new defpackage.ej[r3]
            r12 = r5
        L46:
            if (r12 >= r3) goto L64
            int r16 = r12 * 2
            r17 = r12
            ej r12 = new ej
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L46
        L64:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L13
        L6a:
            r0.g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl1.<init>(int[], float[], float[][]):void");
    }

    public /* synthetic */ yl1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public yl1(TextView textView) {
        this.f = 26;
        this.g = new ei0(textView);
    }

    public yl1(EditText editText) {
        this.f = 25;
        this.g = new a31(editText, 12);
    }

    public yl1(ContentInfo contentInfo) {
        this.f = 16;
        contentInfo.getClass();
        this.g = s7.h(contentInfo);
    }

    public yl1(ClipData clipData, int i) {
        this.f = 15;
        this.g = s7.f(clipData, i);
    }

    public void s(int i, s1 s1Var, String str, Bundle bundle) {
    }
}
