package defpackage;

import android.R;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.HandwritingGesture;
import android.window.BackEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public static final boolean Y(rp0 rp0Var, rp0 rp0Var2, int i, v1 v1Var) {
        aq1 aq1Var;
        tb1 tb1VarX;
        ax1 ax1Var;
        if (rp0Var.u1() != mp0.g) {
            c.q("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new rp0[16];
        if (!rp0Var.f.s) {
            m21.c("visitChildren called on an unattached node");
        }
        qs1 qs1Var = new qs1(new aq1[16]);
        aq1 aq1Var2 = rp0Var.f;
        aq1 aq1Var3 = aq1Var2.k;
        if (aq1Var3 == null) {
            vr.h(qs1Var, aq1Var2);
        } else {
            qs1Var.b(aq1Var3);
        }
        int i2 = 0;
        while (true) {
            int i3 = qs1Var.h;
            aq1Var = null;
            if (i3 == 0) {
                break;
            }
            aq1 aq1VarJ = (aq1) qs1Var.k(i3 - 1);
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
                                rp0 rp0Var3 = (rp0) aq1VarJ;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = rp0Var3;
                                i2 = i4;
                            } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                int i5 = 0;
                                for (aq1 aq1Var4 = ((ja0) aq1VarJ).u; aq1Var4 != null; aq1Var4 = aq1Var4.k) {
                                    if ((aq1Var4.h & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            aq1VarJ = aq1Var4;
                                        } else {
                                            if (qs1Var2 == null) {
                                                qs1Var2 = new qs1(new aq1[16]);
                                            }
                                            if (aq1VarJ != null) {
                                                qs1Var2.b(aq1VarJ);
                                                aq1VarJ = null;
                                            }
                                            qs1Var2.b(aq1Var4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
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
        Arrays.sort(objArr, 0, i2, up0.b);
        if (i != 1) {
            if (i != 2) {
                c.q("This function should only be used for 1-D focus search");
                return false;
            }
            l41 l41VarS = y02.S(0, i2);
            int i6 = l41VarS.f;
            int i7 = l41VarS.g;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        rp0 rp0Var4 = (rp0) objArr[i7];
                        if (br.H(rp0Var4) && n(rp0Var4, v1Var)) {
                            break;
                        }
                    }
                    if (s51.n(objArr[i7], rp0Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!rp0Var.f.s) {
                }
                aq1 aq1Var5 = rp0Var.f.j;
                tb1VarX = vr.X(rp0Var);
                loop5: while (true) {
                    if (tb1VarX == null) {
                    }
                }
                if (aq1Var != null) {
                }
            }
            return false;
        }
        l41 l41VarS2 = y02.S(0, i2);
        int i8 = l41VarS2.f;
        int i9 = l41VarS2.g;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    rp0 rp0Var5 = (rp0) objArr[i8];
                    if (br.H(rp0Var5) && z(rp0Var5, v1Var)) {
                        break;
                    }
                }
                if (s51.n(objArr[i8], rp0Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && rp0Var.r1().a) {
            if (!rp0Var.f.s) {
                m21.c("visitAncestors called on an unattached node");
            }
            aq1 aq1Var52 = rp0Var.f.j;
            tb1VarX = vr.X(rp0Var);
            loop5: while (true) {
                if (tb1VarX == null) {
                    break;
                }
                if ((tb1VarX.L.f.i & 1024) != 0) {
                    while (aq1Var52 != null) {
                        if ((aq1Var52.h & 1024) != 0) {
                            aq1 aq1VarJ2 = aq1Var52;
                            qs1 qs1Var3 = null;
                            while (aq1VarJ2 != null) {
                                if (aq1VarJ2 instanceof rp0) {
                                    aq1Var = aq1VarJ2;
                                    break loop5;
                                }
                                if ((aq1VarJ2.h & 1024) != 0 && (aq1VarJ2 instanceof ja0)) {
                                    int i10 = 0;
                                    for (aq1 aq1Var6 = ((ja0) aq1VarJ2).u; aq1Var6 != null; aq1Var6 = aq1Var6.k) {
                                        if ((aq1Var6.h & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                aq1VarJ2 = aq1Var6;
                                            } else {
                                                if (qs1Var3 == null) {
                                                    qs1Var3 = new qs1(new aq1[16]);
                                                }
                                                if (aq1VarJ2 != null) {
                                                    qs1Var3.b(aq1VarJ2);
                                                    aq1VarJ2 = null;
                                                }
                                                qs1Var3.b(aq1Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                aq1VarJ2 = vr.j(qs1Var3);
                            }
                        }
                        aq1Var52 = aq1Var52.j;
                    }
                }
                tb1VarX = tb1VarX.u();
                aq1Var52 = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
            }
            if (aq1Var != null) {
                return ((Boolean) v1Var.h(rp0Var)).booleanValue();
            }
        }
        return false;
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
    */
    public static final long Z(float f, long j) {
        int iP;
        boolean z;
        float f2;
        float f3;
        double d2;
        double[] dArr;
        double d3;
        int i;
        int i2;
        int i3;
        int iCeil;
        double dFloor;
        double[] dArr2;
        double[] dArr3;
        double d4 = f;
        if ((d4 < 1.0E-4d) || (d4 > 99.9999d)) {
            return vp.b(cl3.f(d4));
        }
        cr crVarW = br.w(vp.T(j));
        float f4 = crVarW.a;
        float f5 = crVarW.b;
        as0 as0Var = as0.k;
        if (s51.n(as0Var, as0Var)) {
            double d5 = f4;
            double d6 = f5;
            double[] dArr4 = n92.L;
            if (d6 < 1.0E-4d || d4 < 1.0E-4d || d4 > 99.9999d) {
                iP = cl3.f(d4);
            } else {
                double d7 = d5 % 360.0d;
                if (d7 < 0.0d) {
                    d7 += 360.0d;
                }
                double radians = Math.toRadians(d7);
                double dPow = (d4 > 8.0d ? Math.pow((d4 + 16.0d) / 116.0d, 3.0d) : d4 / 903.2962962962963d) * 100.0d;
                double dSqrt = Math.sqrt(dPow) * 11.0d;
                int i4 = 1;
                double dPow2 = 1.0d / Math.pow(1.64d - Math.pow(0.29d, as0Var.a), 0.73d);
                double d8 = 2.0d;
                double dCos = (Math.cos(radians + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * ((double) as0Var.f) * ((double) as0Var.d);
                double dSin = Math.sin(radians);
                double dCos2 = Math.cos(radians);
                int i5 = 0;
                while (true) {
                    d2 = d8;
                    if (i5 >= 5) {
                        dArr = dArr4;
                        d3 = dPow;
                        i = i4;
                        i2 = -16777216;
                        i3 = 8;
                        break;
                    }
                    i = i4;
                    double d9 = d6;
                    double d10 = dSqrt / 100.0d;
                    i2 = -16777216;
                    double dPow3 = Math.pow(((d9 == 0.0d || dSqrt == 0.0d) ? 0.0d : d9 / Math.sqrt(d10)) * dPow2, 1.1111111111111112d);
                    i3 = 8;
                    dArr = dArr4;
                    d3 = dPow;
                    double dPow4 = (Math.pow(d10, (1.0d / ((double) as0Var.e)) / ((double) as0Var.j)) * ((double) as0Var.b)) / ((double) as0Var.c);
                    double d11 = (((0.305d + dPow4) * 23.0d) * dPow3) / (((dPow3 * 108.0d) * dSin) + (((11.0d * dPow3) * dCos2) + (23.0d * dCos)));
                    double d12 = d11 * dCos2;
                    double d13 = d11 * dSin;
                    double d14 = dPow4 * 460.0d;
                    double d15 = ((288.0d * d13) + ((451.0d * d12) + d14)) / 1403.0d;
                    double d16 = ((d14 - (891.0d * d12)) - (261.0d * d13)) / 1403.0d;
                    double d17 = ((d14 - (d12 * 220.0d)) - (d13 * 6300.0d)) / 1403.0d;
                    double dQ = n92.q(d15);
                    double dQ2 = n92.q(d16);
                    double dQ3 = n92.q(d17);
                    double[][] dArr5 = n92.K;
                    double[] dArr6 = dArr5[0];
                    double d18 = (dArr6[2] * dQ3) + (dArr6[i] * dQ2) + (dArr6[0] * dQ);
                    double[] dArr7 = dArr5[i];
                    double d19 = (dArr7[2] * dQ3) + (dArr7[i] * dQ2) + (dArr7[0] * dQ);
                    double[] dArr8 = dArr5[2];
                    double d20 = (dQ3 * dArr8[2]) + (dQ2 * dArr8[i]) + (dQ * dArr8[0]);
                    if (d18 < 0.0d || d19 < 0.0d || d20 < 0.0d) {
                        break;
                    }
                    double d21 = (dArr[2] * d20) + (dArr[i] * d19) + (dArr[0] * d18);
                    if (d21 <= 0.0d) {
                        break;
                    }
                    if (i5 == 4) {
                        break;
                    }
                    double d22 = d21 - d3;
                    if (Math.abs(d22) < 0.002d) {
                        break;
                    }
                    dSqrt -= (d22 * dSqrt) / (d21 * d2);
                    i5++;
                    i4 = i;
                    d8 = d2;
                    d6 = d9;
                    dArr4 = dArr;
                    dPow = d3;
                }
                iP = 0;
                if (iP == 0) {
                    double[] dArr9 = new double[3];
                    dArr9[0] = -1.0d;
                    dArr9[i] = -1.0d;
                    dArr9[2] = -1.0d;
                    int i6 = i;
                    boolean z2 = false;
                    int i7 = 0;
                    double[] dArr10 = dArr9;
                    double d23 = 0.0d;
                    double d24 = 0.0d;
                    while (i7 < 12) {
                        double d25 = dArr[0];
                        double d26 = dArr[i];
                        double d27 = dArr[2];
                        double d28 = i7 % 4 <= i ? 0.0d : 100.0d;
                        double d29 = i7 % 2 == 0 ? 0.0d : 100.0d;
                        if (i7 < 4) {
                            double d30 = ((d3 - (d26 * d28)) - (d27 * d29)) / d25;
                            dArr2 = n92.r(d30) ? new double[]{d30, d28, d29} : new double[]{-1.0d, -1.0d, -1.0d};
                        } else if (i7 < i3) {
                            double d31 = ((d3 - (d25 * d29)) - (d27 * d28)) / d26;
                            if (n92.r(d31)) {
                                dArr3 = new double[]{d29, d31, d28};
                                dArr2 = dArr3;
                            } else {
                                dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                            }
                        } else {
                            double d32 = ((d3 - (d25 * d28)) - (d26 * d29)) / d27;
                            if (n92.r(d32)) {
                                dArr3 = new double[]{d28, d29, d32};
                                dArr2 = dArr3;
                            } else {
                                dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                            }
                        }
                        if (dArr2[0] >= 0.0d) {
                            double dN = n92.n(dArr2);
                            if (!z2) {
                                dArr9 = dArr2;
                                dArr10 = dArr9;
                                d23 = dN;
                                d24 = d23;
                                z2 = true;
                            } else if (i6 != 0 || n92.g(d23, dN, d24)) {
                                if (n92.g(d23, radians, dN)) {
                                    i6 = 0;
                                    dArr10 = dArr2;
                                    d24 = dN;
                                } else {
                                    i6 = 0;
                                    dArr9 = dArr2;
                                    d23 = dN;
                                }
                            }
                        }
                        i7++;
                        i = 1;
                        i3 = 8;
                    }
                    double[][] dArr11 = {dArr9, dArr10};
                    double[] dArr12 = dArr11[0];
                    double dN2 = n92.n(dArr12);
                    double[] dArr13 = dArr11[1];
                    for (int i8 = 0; i8 < 3; i8++) {
                        double d33 = dArr12[i8];
                        double d34 = dArr13[i8];
                        if (d33 != d34) {
                            if (d33 < d34) {
                                iCeil = (int) Math.floor(n92.H(d33) - 0.5d);
                                dFloor = Math.ceil(n92.H(dArr13[i8]) - 0.5d);
                            } else {
                                iCeil = (int) Math.ceil(n92.H(d33) - 0.5d);
                                dFloor = Math.floor(n92.H(dArr13[i8]) - 0.5d);
                            }
                            int i9 = (int) dFloor;
                            double d35 = dN2;
                            for (int i10 = 0; i10 < 8 && Math.abs(i9 - iCeil) > 1.0d; i10++) {
                                int iFloor = (int) Math.floor(((double) (iCeil + i9)) / d2);
                                double d36 = n92.M[iFloor];
                                double d37 = dArr12[i8];
                                double d38 = dArr13[i8];
                                if (d38 != d37) {
                                    d38 = (d36 - d37) / (d38 - d37);
                                }
                                double d39 = dArr12[0];
                                double d40 = ((dArr13[0] - d39) * d38) + d39;
                                double d41 = dArr12[1];
                                double d42 = ((dArr13[1] - d41) * d38) + d41;
                                double d43 = dArr12[2];
                                double[] dArr14 = {d40, d42, ((dArr13[2] - d43) * d38) + d43};
                                double dN3 = n92.n(dArr14);
                                if (n92.g(d35, radians, dN3)) {
                                    i9 = iFloor;
                                    dArr13 = dArr14;
                                } else {
                                    iCeil = iFloor;
                                    dArr12 = dArr14;
                                    d35 = dN3;
                                }
                            }
                            dN2 = d35;
                        }
                    }
                    iP = ((cl3.l((dArr12[0] + dArr13[0]) / d2) & 255) << 16) | i2 | ((cl3.l((dArr12[1] + dArr13[1]) / d2) & 255) << 8) | (cl3.l((dArr12[2] + dArr13[2]) / d2) & 255);
                }
            }
        } else if (f5 < 1.0d || Math.round(f) <= 0.0d || Math.round(f) >= 100.0d) {
            iP = cl3.p(f);
        } else {
            float f6 = 0.0f;
            float fMin = f4 < 0.0f ? 0.0f : Math.min(360.0f, f4);
            float f7 = 0.0f;
            float f8 = f5;
            boolean z3 = true;
            cr crVar = null;
            while (true) {
                if (Math.abs(f7 - f5) >= 0.4000000059604645d) {
                    float f9 = 1000.0f;
                    float f10 = f6;
                    float f11 = 1000.0f;
                    float f12 = 100.0f;
                    cr crVar2 = null;
                    while (true) {
                        z = z3;
                        if (Math.abs(f10 - f12) <= 0.009999999776482582d) {
                            f2 = fMin;
                            f3 = 2.0f;
                            break;
                        }
                        float f13 = ((f12 - f10) / 2.0f) + f10;
                        f3 = 2.0f;
                        int iC = br.x(f13, f8, fMin).c(as0.k);
                        float fV = cl3.v((iC >> 16) & 255);
                        float fV2 = cl3.v((iC >> 8) & 255);
                        float fV3 = cl3.v(iC & 255);
                        double d44 = fV;
                        double[] dArr15 = cl3.r[1];
                        float f14 = ((float) ((((double) fV3) * dArr15[2]) + ((((double) fV2) * dArr15[1]) + (d44 * dArr15[0])))) / 100.0f;
                        float fCbrt = f14 <= 0.008856452f ? f14 * 903.2963f : (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                        float fAbs = (float) Math.abs(f - r0);
                        if (fAbs < 0.2f) {
                            cr crVarW2 = br.w(iC);
                            cr crVarX = br.x(crVarW2.c, crVarW2.b, fMin);
                            float f15 = crVarW2.d - crVarX.d;
                            float f16 = crVarW2.e - crVarX.e;
                            float f17 = crVarW2.f - crVarX.f;
                            double dSqrt2 = Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15));
                            f2 = fMin;
                            float fPow = (float) (Math.pow(dSqrt2, 0.63d) * 1.41d);
                            if (fPow <= 1.0f) {
                                f11 = fPow;
                                crVar2 = crVarW2;
                                f9 = fAbs;
                            }
                        } else {
                            f2 = fMin;
                        }
                        if (f9 == f10 && f11 == f10) {
                            break;
                        }
                        if (fCbrt < f) {
                            fMin = f2;
                            z3 = z;
                            f10 = f13;
                        } else {
                            fMin = f2;
                            z3 = z;
                            f12 = f13;
                        }
                    }
                    cr crVar3 = crVar2;
                    if (!z) {
                        if (crVar3 == null) {
                            f5 = f8;
                        } else {
                            crVar = crVar3;
                            f7 = f8;
                        }
                        f8 = ((f5 - f7) / f3) + f7;
                        fMin = f2;
                        f6 = f10;
                        z3 = z;
                    } else {
                        if (crVar3 != null) {
                            iP = crVar3.c(as0Var);
                            break;
                        }
                        f8 = ((f5 - f7) / f3) + f7;
                        z3 = false;
                        fMin = f2;
                        f6 = f10;
                    }
                } else {
                    iP = crVar == null ? cl3.p(f) : crVar.c(as0Var);
                }
            }
        }
        return vp.b(iP);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zw a0(af afVar) {
        long j;
        List list = afVar.h;
        ni0 ni0Var = ni0.f;
        List list2 = list == null ? ni0Var : list;
        CharSequence charSequence = afVar.g;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            yl1 yl1Var = new yl1(27, false);
            yl1Var.g = Parcel.obtain();
            if (list == null) {
                list = ni0Var;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                ze zeVar = (ze) list.get(i);
                h83 h83Var = (h83) zeVar.a;
                int i2 = zeVar.b;
                int i3 = zeVar.c;
                ((Parcel) yl1Var.g).recycle();
                yl1Var.g = Parcel.obtain();
                dg3 dg3Var = h83Var.a;
                long j2 = h83Var.l;
                long j3 = h83Var.h;
                long j4 = h83Var.b;
                List list3 = list;
                int i4 = size;
                long jA = dg3Var.a();
                SpannableString spannableString2 = spannableString;
                int i5 = i;
                long j5 = wx.g;
                if (wx.c(jA, j5)) {
                    j = j5;
                } else {
                    yl1Var.w((byte) 1);
                    j = j5;
                    ((Parcel) yl1Var.g).writeLong(h83Var.a.a());
                }
                long j6 = jh3.c;
                byte b2 = 2;
                if (!jh3.a(j4, j6)) {
                    yl1Var.w((byte) 2);
                    yl1Var.y(j4);
                }
                xq0 xq0Var = h83Var.c;
                if (xq0Var != null) {
                    yl1Var.w((byte) 3);
                    ((Parcel) yl1Var.g).writeInt(xq0Var.f);
                }
                vq0 vq0Var = h83Var.d;
                if (vq0Var != null) {
                    int i6 = vq0Var.a;
                    yl1Var.w((byte) 4);
                    yl1Var.w((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                wq0 wq0Var = h83Var.e;
                if (wq0Var != null) {
                    int i7 = wq0Var.a;
                    yl1Var.w((byte) 5);
                    if (i7 != 0) {
                        if (i7 == 65535) {
                            b2 = 1;
                        } else if (i7 != 1) {
                            b2 = i7 == 2 ? (byte) 3 : (byte) 0;
                        }
                        yl1Var.w(b2);
                    }
                }
                String str = h83Var.g;
                if (str != null) {
                    yl1Var.w((byte) 6);
                    ((Parcel) yl1Var.g).writeString(str);
                }
                if (!jh3.a(j3, j6)) {
                    yl1Var.w((byte) 7);
                    yl1Var.y(j3);
                }
                nl nlVar = h83Var.i;
                if (nlVar != null) {
                    float f = nlVar.a;
                    yl1Var.w((byte) 8);
                    yl1Var.x(f);
                }
                eg3 eg3Var = h83Var.j;
                if (eg3Var != null) {
                    yl1Var.w((byte) 9);
                    yl1Var.x(eg3Var.a);
                    yl1Var.x(eg3Var.b);
                }
                if (!wx.c(j2, j)) {
                    yl1Var.w((byte) 10);
                    ((Parcel) yl1Var.g).writeLong(j2);
                }
                ne3 ne3Var = h83Var.m;
                if (ne3Var != null) {
                    yl1Var.w((byte) 11);
                    ((Parcel) yl1Var.g).writeInt(ne3Var.a);
                }
                r13 r13Var = h83Var.n;
                if (r13Var != null) {
                    yl1Var.w((byte) 12);
                    ((Parcel) yl1Var.g).writeLong(r13Var.a);
                    long j7 = r13Var.b;
                    yl1Var.x(Float.intBitsToFloat((int) (j7 >> 32)));
                    yl1Var.x(Float.intBitsToFloat((int) (j7 & 4294967295L)));
                    yl1Var.x(r13Var.c);
                }
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) yl1Var.g).marshall(), 0)), i2, i3, 33);
                i = i5 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i4;
            }
            charSequence = spannableString;
        }
        return new zw(ClipData.newPlainText("plain text", charSequence));
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
    */
    public static final void g(bq1 bq1Var, z13 z13Var, xr xrVar, yr yrVar, ln lnVar, d00 d00Var, nv0 nv0Var, int i, int i2) {
        int i3;
        z13 z13VarA;
        xr xrVarD;
        yr yrVarR;
        ln lnVar2;
        z13 z13Var2;
        xr xrVar2;
        yr yrVar2;
        ln lnVar3;
        xj2 xj2VarT;
        z13 z13Var3;
        ln lnVar4;
        nv0Var.b0(1359693790);
        if ((i & 6) == 0) {
            i3 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                z13VarA = z13Var;
                int i4 = nv0Var.f(z13VarA) ? 32 : 16;
                i3 |= i4;
            } else {
                z13VarA = z13Var;
            }
            i3 |= i4;
        } else {
            z13VarA = z13Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                xrVarD = xrVar;
                int i5 = nv0Var.f(xrVarD) ? 256 : 128;
                i3 |= i5;
            } else {
                xrVarD = xrVar;
            }
            i3 |= i5;
        } else {
            xrVarD = xrVar;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                yrVarR = yrVar;
                int i6 = nv0Var.f(yrVarR) ? 2048 : 1024;
                i3 |= i6;
            } else {
                yrVarR = yrVar;
            }
            i3 |= i6;
        } else {
            yrVarR = yrVar;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                lnVar2 = lnVar;
                i3 |= nv0Var.f(lnVar2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= nv0Var.h(d00Var) ? 131072 : 65536;
            }
            int i8 = 1;
            if (nv0Var.R(i3 & 1, (74899 & i3) == 74898)) {
                nv0Var.U();
                z13Var2 = z13VarA;
                xrVar2 = xrVarD;
                yrVar2 = yrVarR;
                lnVar3 = lnVar2;
            } else {
                nv0Var.W();
                if ((i & 1) == 0 || nv0Var.A()) {
                    if ((i2 & 2) != 0) {
                        z13VarA = g23.a(n92.E, nv0Var);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        xrVarD = gq.D((fy) nv0Var.j(hy.a));
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        yrVarR = gq.r(63);
                        i3 &= -7169;
                    }
                    if (i7 != 0) {
                        z13Var3 = z13VarA;
                        lnVar4 = null;
                    }
                    nv0Var.q();
                    hb3.a(bq1Var, z13Var3, xrVarD.a, xrVarD.b, 0.0f, ((jd0) yrVarR.a(true, null, nv0Var, ((i3 >> 3) & 896) | 54).getValue()).f, lnVar4, gq.N(-97109725, new p01(d00Var, i8), nv0Var), nv0Var, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
                    xrVar2 = xrVarD;
                    yrVar2 = yrVarR;
                    z13Var2 = z13Var3;
                    lnVar3 = lnVar4;
                } else {
                    nv0Var.U();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                z13Var3 = z13VarA;
                lnVar4 = lnVar2;
                nv0Var.q();
                hb3.a(bq1Var, z13Var3, xrVarD.a, xrVarD.b, 0.0f, ((jd0) yrVarR.a(true, null, nv0Var, ((i3 >> 3) & 896) | 54).getValue()).f, lnVar4, gq.N(-97109725, new p01(d00Var, i8), nv0Var), nv0Var, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
                xrVar2 = xrVarD;
                yrVar2 = yrVarR;
                z13Var2 = z13Var3;
                lnVar3 = lnVar4;
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT == null) {
                xj2VarT.d = new as(bq1Var, z13Var2, xrVar2, yrVar2, lnVar3, d00Var, i, i2);
                return;
            }
            return;
        }
        i3 |= 24576;
        lnVar2 = lnVar;
        if ((196608 & i) == 0) {
        }
        int i82 = 1;
        if (nv0Var.R(i3 & 1, (74899 & i3) == 74898)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT == null) {
        }
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
    */
    public static final Object m(File file, ns0 ns0Var, q40 q40Var) throws IOException {
        ul0 ul0Var;
        if (q40Var instanceof ul0) {
            ul0Var = (ul0) q40Var;
            int i = ul0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ul0Var.k = i - Integer.MIN_VALUE;
            } else {
                ul0Var = new ul0(q40Var);
            }
        }
        Object obj = ul0Var.j;
        int i2 = ul0Var.k;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                File file2 = ul0Var.i;
                y02.Q(obj);
                return obj;
            }
            y02.Q(obj);
            ul0Var.i = file;
            ul0Var.k = 1;
            Object objH = ns0Var.h(ul0Var);
            Object obj2 = y50.f;
            return objH == obj2 ? obj2 : objH;
        } catch (IOException e) {
            if (e instanceof c60) {
                throw e;
            }
            file.getClass();
            if (!file.exists()) {
                throw vp.r(file, e);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw vp.r(file, e);
                    }
                    throw vp.r(file, e);
                }
                if (file.canWrite()) {
                    throw vp.r(file, e);
                }
                throw vp.r(file, e);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw vp.r(file, e);
                }
                throw vp.r(file, e);
            }
            if (file.canWrite()) {
                throw vp.r(file, e);
            }
            throw vp.r(file, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean n(rp0 rp0Var, v1 v1Var) {
        int iOrdinal = rp0Var.u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                rp0 rp0VarZ = br.z(rp0Var);
                if (rp0VarZ == null) {
                    c.q("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = rp0VarZ.u1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                c.k();
                                return false;
                            }
                            c.q("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (n(rp0VarZ, v1Var) || A(rp0Var, rp0VarZ, 2, v1Var) || (rp0VarZ.r1().a && ((Boolean) v1Var.h(rp0VarZ)).booleanValue())) {
                        return true;
                    }
                }
                return A(rp0Var, rp0VarZ, 2, v1Var);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    c.k();
                    return false;
                }
                if (!Q(rp0Var, v1Var)) {
                    if (!(rp0Var.r1().a ? ((Boolean) v1Var.h(rp0Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return Q(rp0Var, v1Var);
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
