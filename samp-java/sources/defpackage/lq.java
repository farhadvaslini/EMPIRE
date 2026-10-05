package defpackage;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.HandwritingGesture;
import android.window.BackEvent;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class lq {
    public static w01 a;
    public static w01 b;
    public static w01 c;
    public static w01 d;

    public static final boolean A(rp0 rp0Var, rp0 rp0Var2, int i, v1 v1Var) {
        if (Y(rp0Var, rp0Var2, i, v1Var)) {
            return true;
        }
        Boolean bool = (Boolean) cl3.C(rp0Var, i, new py(((ep0) ((h7) vr.Y(rp0Var)).getFocusOwner()).f(), rp0Var, rp0Var2, i, v1Var, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static long B(Context context, int i) {
        return vp.b(context.getResources().getColor(i, context.getTheme()));
    }

    public static final int C(nv0 nv0Var) {
        nv0Var.getClass();
        return Long.hashCode(nv0Var.T);
    }

    public static final long D(nv0 nv0Var) {
        return nv0Var.T;
    }

    public static final w01 E() {
        w01 w01Var = b;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Dns", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(20.0f, 13.0f);
        tx0Var.f(4.0f);
        tx0Var.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        tx0Var.o(6.0f);
        tx0Var.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        tx0Var.g(16.0f);
        tx0Var.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        tx0Var.o(-6.0f);
        tx0Var.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        tx0Var.c();
        tx0Var.j(7.0f, 19.0f);
        tx0Var.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        tx0Var.l(0.9f, -2.0f, 2.0f, -2.0f);
        tx0Var.l(2.0f, 0.9f, 2.0f, 2.0f);
        tx0Var.l(-0.9f, 2.0f, -2.0f, 2.0f);
        tx0Var.c();
        tx0Var.j(20.0f, 3.0f);
        tx0Var.f(4.0f);
        tx0Var.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        tx0Var.o(6.0f);
        tx0Var.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        tx0Var.g(16.0f);
        tx0Var.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        tx0Var.n(4.0f);
        tx0Var.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        tx0Var.c();
        tx0Var.j(7.0f, 9.0f);
        tx0Var.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        tx0Var.l(0.9f, -2.0f, 2.0f, -2.0f);
        tx0Var.l(2.0f, 0.9f, 2.0f, 2.0f);
        tx0Var.l(-0.9f, 2.0f, -2.0f, 2.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        b = w01VarB;
        return w01VarB;
    }

    public static xt1 F(br3 br3Var) {
        i21 i21Var = yt1.a;
        d60 d60Var = d60.b;
        i21Var.getClass();
        d60Var.getClass();
        pl plVar = new pl(br3Var, i21Var, d60Var);
        lu luVarA = rk2.a(xt1.class);
        String strB = luVarA.b();
        if (strB != null) {
            return (xt1) plVar.y(luVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        c.p("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final j61 G(o50 o50Var) {
        j61 j61Var = (j61) o50Var.m(f5.b0);
        if (j61Var != null) {
            return j61Var;
        }
        c.h(o50Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final w01 H() {
        w01 w01Var = d;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(18.0f, 8.0f);
        tx0Var.g(-1.0f);
        tx0Var.h(17.0f, 6.0f);
        tx0Var.e(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        tx0Var.k(7.0f, 3.24f, 7.0f, 6.0f);
        tx0Var.o(2.0f);
        tx0Var.h(6.0f, 8.0f);
        tx0Var.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        tx0Var.o(10.0f);
        tx0Var.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        tx0Var.g(12.0f);
        tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        tx0Var.h(20.0f, 10.0f);
        tx0Var.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        tx0Var.c();
        tx0Var.j(12.0f, 17.0f);
        tx0Var.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        tx0Var.l(0.9f, -2.0f, 2.0f, -2.0f);
        tx0Var.l(2.0f, 0.9f, 2.0f, 2.0f);
        tx0Var.l(-0.9f, 2.0f, -2.0f, 2.0f);
        tx0Var.c();
        tx0Var.j(15.1f, 8.0f);
        tx0Var.h(8.9f, 8.0f);
        tx0Var.h(8.9f, 6.0f);
        tx0Var.e(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        tx0Var.e(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        tx0Var.o(2.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        d = w01VarB;
        return w01VarB;
    }

    public static final ic I(o50 o50Var) {
        ic icVar = (ic) o50Var.m(f5.c0);
        if (icVar != null) {
            return icVar;
        }
        c.q("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void J(kb1 kb1Var) {
        vr.X(kb1Var).E();
    }

    public static final kc0 K(j61 j61Var, boolean z, m61 m61Var) {
        if (j61Var instanceof q61) {
            return ((q61) j61Var).W(z, m61Var);
        }
        return j61Var.z(m61Var.r(), z, new k(1, m61Var, m61.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 2));
    }

    public static final boolean L(o50 o50Var) {
        j61 j61Var = (j61) o50Var.m(f5.b0);
        if (j61Var != null) {
            return j61Var.b();
        }
        return true;
    }

    public static final boolean M(byte[] bArr, int i) {
        if (i > 0 && i <= bArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                char c2 = (char) bArr[i2];
                if (('0' <= c2 && c2 < ':') || (('a' <= c2 && c2 < 'g') || ('A' <= c2 && c2 < 'G'))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final float N(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int O(int i, float f, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    public static void P(long j, af afVar, boolean z, xc1 xc1Var) {
        if (z) {
            int i = yg3.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(afVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < afVar.g.length() ? Character.codePointAt(afVar, iCharCount2) : 10;
            if (pq.L(iCodePointBefore) && (pq.K(iCodePointAt) || pq.I(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(afVar, iCharCount);
                    }
                } while (pq.L(iCodePointBefore));
                j = d32.f(iCharCount, iCharCount2);
            } else if (pq.L(iCodePointAt) && (pq.K(iCodePointBefore) || pq.I(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == afVar.g.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(afVar, iCharCount2);
                    }
                } while (pq.L(iCodePointAt));
                j = d32.f(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        xc1Var.h(new ox0(new eh0[]{new nz2(i2, i2), new pa0(yg3.d(j), 0)}));
    }

    public static final boolean Q(rp0 rp0Var, v1 v1Var) {
        Object[] objArr = new rp0[16];
        if (!rp0Var.f.s) {
            m21.c("visitChildren called on an unattached node");
        }
        qs1 qs1Var = new qs1(new aq1[16]);
        aq1 aq1Var = rp0Var.f;
        aq1 aq1Var2 = aq1Var.k;
        if (aq1Var2 == null) {
            vr.h(qs1Var, aq1Var);
        } else {
            qs1Var.b(aq1Var2);
        }
        int i = 0;
        while (true) {
            int i2 = qs1Var.h;
            if (i2 == 0) {
                break;
            }
            aq1 aq1VarJ = (aq1) qs1Var.k(i2 - 1);
            if ((aq1VarJ.i & 1024) == 0) {
                vr.h(qs1Var, aq1VarJ);
            } else {
                while (true) {
                    if (aq1VarJ == null) {
                        break;
                    }
                    if ((aq1VarJ.h & 1024) != 0) {
                        qs1 qs1Var2 = null;
                        while (aq1VarJ != null) {
                            if (aq1VarJ instanceof rp0) {
                                rp0 rp0Var2 = (rp0) aq1VarJ;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = rp0Var2;
                                i = i3;
                            } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                int i4 = 0;
                                for (aq1 aq1Var3 = ((ja0) aq1VarJ).u; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                                    if ((aq1Var3.h & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            aq1VarJ = aq1Var3;
                                        } else {
                                            if (qs1Var2 == null) {
                                                qs1Var2 = new qs1(new aq1[16]);
                                            }
                                            if (aq1VarJ != null) {
                                                qs1Var2.b(aq1VarJ);
                                                aq1VarJ = null;
                                            }
                                            qs1Var2.b(aq1Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            aq1VarJ = vr.j(qs1Var2);
                        }
                    } else {
                        aq1VarJ = aq1VarJ.k;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, up0.b);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                rp0 rp0Var3 = (rp0) objArr[i5];
                if (br.H(rp0Var3) && n(rp0Var3, v1Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean R(rp0 rp0Var, v1 v1Var) {
        Object[] objArr = new rp0[16];
        if (!rp0Var.f.s) {
            m21.c("visitChildren called on an unattached node");
        }
        qs1 qs1Var = new qs1(new aq1[16]);
        aq1 aq1Var = rp0Var.f;
        aq1 aq1Var2 = aq1Var.k;
        if (aq1Var2 == null) {
            vr.h(qs1Var, aq1Var);
        } else {
            qs1Var.b(aq1Var2);
        }
        int i = 0;
        while (true) {
            int i2 = qs1Var.h;
            if (i2 == 0) {
                break;
            }
            aq1 aq1VarJ = (aq1) qs1Var.k(i2 - 1);
            if ((aq1VarJ.i & 1024) == 0) {
                vr.h(qs1Var, aq1VarJ);
            } else {
                while (true) {
                    if (aq1VarJ == null) {
                        break;
                    }
                    if ((aq1VarJ.h & 1024) != 0) {
                        qs1 qs1Var2 = null;
                        while (aq1VarJ != null) {
                            if (aq1VarJ instanceof rp0) {
                                rp0 rp0Var2 = (rp0) aq1VarJ;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = rp0Var2;
                                i = i3;
                            } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                int i4 = 0;
                                for (aq1 aq1Var3 = ((ja0) aq1VarJ).u; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                                    if ((aq1Var3.h & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            aq1VarJ = aq1Var3;
                                        } else {
                                            if (qs1Var2 == null) {
                                                qs1Var2 = new qs1(new aq1[16]);
                                            }
                                            if (aq1VarJ != null) {
                                                qs1Var2.b(aq1VarJ);
                                                aq1VarJ = null;
                                            }
                                            qs1Var2.b(aq1Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            aq1VarJ = vr.j(qs1Var2);
                        }
                    } else {
                        aq1VarJ = aq1VarJ.k;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, up0.b);
        for (int i5 = 0; i5 < i; i5++) {
            rp0 rp0Var3 = (rp0) objArr[i5];
            if (br.H(rp0Var3) && z(rp0Var3, v1Var)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] S(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                c.q(by1.e(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static final int T(int i, String str) {
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }

    public static byte[] U(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static long V(InputStream inputStream, int i) throws IOException {
        byte[] bArrS = S(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrS[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static final lv0 W(nv0 nv0Var) {
        nv0 nv0Var2;
        nv0Var.X(206, e20.e);
        if (nv0Var.S) {
            m53.z(nv0Var.I);
        }
        Object objG = nv0Var.G();
        rv0 vn2Var = objG instanceof rv0 ? (rv0) objG : null;
        if (vn2Var == null) {
            nv0Var2 = nv0Var;
            vn2Var = new vn2(new kv0(new lv0(nv0Var2, nv0Var.T, nv0Var.q, nv0Var.C, nv0Var.h.y)), -1);
            nv0Var2.k0(vn2Var);
        } else {
            nv0Var2 = nv0Var;
        }
        al2 al2Var = vn2Var.a;
        al2Var.getClass();
        lv0 lv0Var = ((kv0) al2Var).f;
        lv0Var.f.setValue(nv0Var2.l());
        nv0Var2.p(false);
        return lv0Var;
    }

    public static final String X(String str) {
        str.getClass();
        String strReplace = str.replace('\r', ' ');
        strReplace.getClass();
        String strReplace2 = strReplace.replace('\n', ' ');
        strReplace2.getClass();
        return y93.G0(strReplace2).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0197 A[EDGE_INSN: B:157:0x0197->B:127:0x0197 BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean Y(defpackage.rp0 r12, defpackage.rp0 r13, int r14, defpackage.v1 r15) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq.Y(rp0, rp0, int, v1):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0204, code lost:
    
        if (r42 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0208, code lost:
    
        if (r44 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020c, code lost:
    
        if (r12 <= 100.01d) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x020f, code lost:
    
        r0 = ((((defpackage.cl3.l(r42) & 255) << 16) | (-16777216)) | ((defpackage.cl3.l(r44) & 255) << 8)) | (defpackage.cl3.l(r12) & 255);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Z(float r50, long r51) {
        /*
            Method dump skipped, instruction units count: 1421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq.Z(float, long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.zw a0(defpackage.af r21) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq.a0(af):zw");
    }

    public static String b0(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) ? nc2.i("CornerRadius.circular(", uq.M(Float.intBitsToFloat(i)), ")") : by1.i("CornerRadius.elliptical(", uq.M(Float.intBitsToFloat(i)), ", ", uq.M(Float.intBitsToFloat(i2)), ")");
    }

    public static final void c0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 3] = (byte) (i2 >>> 24);
    }

    public static void d0(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void e0(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        d0(byteArrayOutputStream, i, 2);
    }

    public static final void f(cs0 cs0Var, bq1 bq1Var, boolean z, z13 z13Var, xr xrVar, yr yrVar, d00 d00Var, nv0 nv0Var, int i) {
        boolean z2;
        yr yrVar2;
        yr yrVarR;
        int i2;
        nv0Var.b0(2136075085);
        int i3 = 2;
        int i4 = i | (nv0Var.h(cs0Var) ? 4 : 2) | 384 | (nv0Var.f(z13Var) ? 2048 : 1024) | (nv0Var.f(xrVar) ? 16384 : 8192) | 14221312;
        boolean z3 = true;
        if (nv0Var.R(i4 & 1, (38347923 & i4) != 38347922)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                yrVarR = gq.r(63);
                i2 = i4 & (-458753);
            } else {
                nv0Var.U();
                i2 = i4 & (-458753);
                z3 = z;
                yrVarR = yrVar;
            }
            nv0Var.q();
            nv0Var.a0(1577885006);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = nc2.e(nv0Var);
            }
            qr1 qr1Var = (qr1) objO;
            nv0Var.p(false);
            hb3.c(cs0Var, bq1Var, z3, z13Var, z3 ? xrVar.a : xrVar.c, z3 ? xrVar.b : xrVar.d, ((jd0) yrVarR.a(z3, qr1Var, nv0Var, 6).getValue()).f, null, qr1Var, gq.N(-1347531112, new p01(d00Var, i3), nv0Var), nv0Var, (i2 & 8190) | 100663296, 64);
            yrVar2 = yrVarR;
            z2 = z3;
        } else {
            nv0Var.U();
            z2 = z;
            yrVar2 = yrVar;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new zr(cs0Var, bq1Var, z2, z13Var, xrVar, yrVar2, d00Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.bq1 r20, defpackage.z13 r21, defpackage.xr r22, defpackage.yr r23, defpackage.ln r24, defpackage.d00 r25, defpackage.nv0 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq.g(bq1, z13, xr, yr, ln, d00, nv0, int, int):void");
    }

    public static xa0 h() {
        return new xa0(1.0f, 1.0f);
    }

    public static final void i(Boolean bool, Object obj, of1 of1Var, ns0 ns0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(696924721);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(ns0Var) ? 2048 : 1024;
        }
        if (nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                of1Var = (of1) nv0Var.j(ij1.a);
            } else {
                nv0Var.U();
            }
            int i3 = i2 & (-897);
            nv0Var.q();
            boolean zF = nv0Var.f(bool) | nv0Var.f(obj) | nv0Var.f(of1Var);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = new vf1(of1Var.getLifecycle());
                nv0Var.j0(objO);
            }
            j(of1Var, (vf1) objO, ns0Var, nv0Var, (i3 >> 3) & 896);
        } else {
            nv0Var.U();
        }
        of1 of1Var2 = of1Var;
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new v4(bool, obj, of1Var2, ns0Var, i, 3);
        }
    }

    public static final void j(of1 of1Var, vf1 vf1Var, ns0 ns0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(228371534);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(of1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(vf1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(ns0Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = nv0Var.h(vf1Var) | ((i2 & 896) == 256) | nv0Var.h(of1Var);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                objO = new v1((Object) of1Var, (Object) vf1Var, ns0Var, i3);
                nv0Var.j0(objO);
            }
            rn.h(of1Var, vf1Var, (ns0) objO, nv0Var);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(of1Var, vf1Var, ns0Var, i, 11);
        }
    }

    public static final kv1 k(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new kv1(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final View l(aq1 aq1Var) {
        pq3 pq3Var = vr.X(aq1Var.f).u;
        View interopView = pq3Var != null ? pq3Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        c.q("Could not fetch interop view");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(java.io.File r4, defpackage.ns0 r5, defpackage.q40 r6) throws java.io.IOException {
        /*
            boolean r0 = r6 instanceof defpackage.ul0
            if (r0 == 0) goto L13
            r0 = r6
            ul0 r0 = (defpackage.ul0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            ul0 r0 = new ul0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.io.File r4 = r0.i
            defpackage.y02.Q(r6)     // Catch: java.io.IOException -> L27
            return r6
        L27:
            r5 = move-exception
            goto L41
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L30:
            defpackage.y02.Q(r6)
            r0.i = r4     // Catch: java.io.IOException -> L27
            r0.k = r2     // Catch: java.io.IOException -> L27
            java.lang.Object r4 = r5.h(r0)     // Catch: java.io.IOException -> L27
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        L41:
            boolean r6 = r5 instanceof defpackage.c60
            if (r6 != 0) goto La5
            r4.getClass()
            boolean r6 = r4.exists()
            if (r6 == 0) goto La0
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7a
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6a
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L65
            java.io.IOException r4 = defpackage.vp.r(r4, r5)
            goto La4
        L65:
            java.io.IOException r4 = defpackage.vp.r(r4, r5)
            goto La4
        L6a:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L75
            java.io.IOException r4 = defpackage.vp.r(r4, r5)
            goto La4
        L75:
            java.io.IOException r4 = defpackage.vp.r(r4, r5)
            goto La4
        L7a:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L90
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8b
            java.io.IOException r4 = defpackage.vp.r(r4, r5)
            goto La4
        L8b:
            java.io.IOException r4 = defpackage.vp.r(r4, r5)
            goto La4
        L90:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9b
            java.io.IOException r4 = defpackage.vp.r(r4, r5)
            goto La4
        L9b:
            java.io.IOException r4 = defpackage.vp.r(r4, r5)
            goto La4
        La0:
            java.io.IOException r4 = defpackage.vp.r(r4, r5)
        La4:
            throw r4
        La5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq.m(java.io.File, ns0, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean n(defpackage.rp0 r7, defpackage.v1 r8) {
        /*
            mp0 r0 = r7.u1()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L81
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L35
            if (r0 == r3) goto L81
            if (r0 != r1) goto L31
            boolean r0 = Q(r7, r8)
            if (r0 != 0) goto L77
            gp0 r0 = r7.r1()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.h(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L76
            goto L77
        L31:
            defpackage.c.k()
            return r2
        L35:
            rp0 r0 = defpackage.br.z(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L7d
            mp0 r6 = r0.u1()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L78
            if (r6 == r4) goto L55
            if (r6 == r3) goto L78
            if (r6 == r1) goto L51
            defpackage.c.k()
            return r2
        L51:
            defpackage.c.q(r5)
            return r2
        L55:
            boolean r1 = n(r0, r8)
            if (r1 != 0) goto L77
            boolean r7 = A(r7, r0, r3, r8)
            if (r7 != 0) goto L77
            gp0 r7 = r0.r1()
            boolean r7 = r7.a
            if (r7 == 0) goto L76
            java.lang.Object r7 = r8.h(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            goto L77
        L76:
            return r2
        L77:
            return r4
        L78:
            boolean r7 = A(r7, r0, r3, r8)
            return r7
        L7d:
            defpackage.c.q(r5)
            return r2
        L81:
            boolean r7 = Q(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq.n(rp0, v1):boolean");
    }

    public static byte[] o(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final String p(byte[] bArr) {
        bArr.getClass();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        return y93.H0(new String(bArr, charset), 0);
    }

    public static final ni3 q(Context context) {
        B(context, R.color.system_neutral1_0);
        B(context, R.color.system_neutral1_10);
        Z(98.0f, B(context, R.color.system_neutral1_600));
        Z(96.0f, B(context, R.color.system_neutral1_600));
        B(context, R.color.system_neutral1_50);
        Z(94.0f, B(context, R.color.system_neutral1_600));
        Z(92.0f, B(context, R.color.system_neutral1_600));
        B(context, R.color.system_neutral1_100);
        Z(87.0f, B(context, R.color.system_neutral1_600));
        B(context, R.color.system_neutral1_200);
        B(context, R.color.system_neutral1_300);
        B(context, R.color.system_neutral1_400);
        B(context, R.color.system_neutral1_500);
        B(context, R.color.system_neutral1_600);
        B(context, R.color.system_neutral1_700);
        Z(24.0f, B(context, R.color.system_neutral1_600));
        Z(22.0f, B(context, R.color.system_neutral1_600));
        B(context, R.color.system_neutral1_800);
        Z(17.0f, B(context, R.color.system_neutral1_600));
        Z(12.0f, B(context, R.color.system_neutral1_600));
        B(context, R.color.system_neutral1_900);
        Z(6.0f, B(context, R.color.system_neutral1_600));
        Z(4.0f, B(context, R.color.system_neutral1_600));
        B(context, R.color.system_neutral1_1000);
        long jB = B(context, R.color.system_neutral2_0);
        B(context, R.color.system_neutral2_10);
        long jZ = Z(98.0f, B(context, R.color.system_neutral2_600));
        long jZ2 = Z(96.0f, B(context, R.color.system_neutral2_600));
        long jB2 = B(context, R.color.system_neutral2_50);
        long jZ3 = Z(94.0f, B(context, R.color.system_neutral2_600));
        long jZ4 = Z(92.0f, B(context, R.color.system_neutral2_600));
        long jB3 = B(context, R.color.system_neutral2_100);
        long jZ5 = Z(87.0f, B(context, R.color.system_neutral2_600));
        long jB4 = B(context, R.color.system_neutral2_200);
        B(context, R.color.system_neutral2_300);
        long jB5 = B(context, R.color.system_neutral2_400);
        long jB6 = B(context, R.color.system_neutral2_500);
        B(context, R.color.system_neutral2_600);
        long jB7 = B(context, R.color.system_neutral2_700);
        long jZ6 = Z(24.0f, B(context, R.color.system_neutral2_600));
        long jZ7 = Z(22.0f, B(context, R.color.system_neutral2_600));
        long jB8 = B(context, R.color.system_neutral2_800);
        long jZ8 = Z(17.0f, B(context, R.color.system_neutral2_600));
        long jZ9 = Z(12.0f, B(context, R.color.system_neutral2_600));
        long jB9 = B(context, R.color.system_neutral2_900);
        long jZ10 = Z(6.0f, B(context, R.color.system_neutral2_600));
        long jZ11 = Z(4.0f, B(context, R.color.system_neutral2_600));
        long jB10 = B(context, R.color.system_neutral2_1000);
        long jB11 = B(context, R.color.system_accent1_0);
        B(context, R.color.system_accent1_10);
        B(context, R.color.system_accent1_50);
        long jB12 = B(context, R.color.system_accent1_100);
        long jB13 = B(context, R.color.system_accent1_200);
        B(context, R.color.system_accent1_300);
        B(context, R.color.system_accent1_400);
        B(context, R.color.system_accent1_500);
        long jB14 = B(context, R.color.system_accent1_600);
        long jB15 = B(context, R.color.system_accent1_700);
        long jB16 = B(context, R.color.system_accent1_800);
        long jB17 = B(context, R.color.system_accent1_900);
        B(context, R.color.system_accent1_1000);
        long jB18 = B(context, R.color.system_accent2_0);
        B(context, R.color.system_accent2_10);
        B(context, R.color.system_accent2_50);
        long jB19 = B(context, R.color.system_accent2_100);
        long jB20 = B(context, R.color.system_accent2_200);
        B(context, R.color.system_accent2_300);
        B(context, R.color.system_accent2_400);
        B(context, R.color.system_accent2_500);
        long jB21 = B(context, R.color.system_accent2_600);
        long jB22 = B(context, R.color.system_accent2_700);
        long jB23 = B(context, R.color.system_accent2_800);
        long jB24 = B(context, R.color.system_accent2_900);
        B(context, R.color.system_accent2_1000);
        long jB25 = B(context, R.color.system_accent3_0);
        B(context, R.color.system_accent3_10);
        B(context, R.color.system_accent3_50);
        long jB26 = B(context, R.color.system_accent3_100);
        long jB27 = B(context, R.color.system_accent3_200);
        B(context, R.color.system_accent3_300);
        B(context, R.color.system_accent3_400);
        B(context, R.color.system_accent3_500);
        long jB28 = B(context, R.color.system_accent3_600);
        long jB29 = B(context, R.color.system_accent3_700);
        long jB30 = B(context, R.color.system_accent3_800);
        long jB31 = B(context, R.color.system_accent3_900);
        B(context, R.color.system_accent3_1000);
        return new ni3(jB, jZ, jZ2, jB2, jZ3, jZ4, jB3, jZ5, jB4, jB5, jB6, jB7, jZ6, jZ7, jB8, jZ8, jZ9, jB9, jZ10, jZ11, jB10, jB11, jB12, jB13, jB14, jB15, jB16, jB17, jB18, jB19, jB20, jB21, jB22, jB23, jB24, jB25, jB26, jB27, jB28, jB29, jB30, jB31);
    }

    public static final void r(o50 o50Var) {
        j61 j61Var = (j61) o50Var.m(f5.b0);
        if (j61Var != null && !j61Var.b()) {
            throw j61Var.o();
        }
    }

    public static final boolean s(long j, long j2) {
        return j == j2;
    }

    public static int u(HandwritingGesture handwritingGesture, xc1 xc1Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        xc1Var.h(new dz(1, fallbackText));
        return 5;
    }

    public static final float v(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final int w(int i, ad1 ad1Var, Object obj) {
        int iE;
        return (obj == null || ad1Var.a() == 0 || (i < ad1Var.a() && obj.equals(ad1Var.b(i))) || (iE = ad1Var.e(obj)) == -1) ? i : iE;
    }

    public static long x(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    n30.l(i6);
                    c.d();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return n30.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long y(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    n30.l(i6);
                    c.d();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return n30.a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static final boolean z(rp0 rp0Var, v1 v1Var) {
        int iOrdinal = rp0Var.u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                rp0 rp0VarZ = br.z(rp0Var);
                if (rp0VarZ != null) {
                    return z(rp0VarZ, v1Var) || A(rp0Var, rp0VarZ, 1, v1Var);
                }
                c.q("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return rp0Var.r1().a ? ((Boolean) v1Var.h(rp0Var)).booleanValue() : R(rp0Var, v1Var);
                }
                c.k();
                return false;
            }
        }
        return R(rp0Var, v1Var);
    }
}
