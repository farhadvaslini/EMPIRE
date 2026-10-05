package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class zj implements uj3, n50 {
    public final /* synthetic */ int f;

    public zj() {
        this.f = 0;
        new nl1(16);
        long[] jArr = nr2.a;
        new is1();
    }

    public static final ju a(zj zjVar, String str) {
        ju juVar = new ju(str);
        ju.d.put(str, juVar);
        return juVar;
    }

    public static final float b(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static kq d(String str) {
        if (str.length() % 2 != 0) {
            c.g("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (gv3.s(str.charAt(i2 + 1)) + (gv3.s(str.charAt(i2)) << 4));
        }
        return new kq(bArr);
    }

    public static kq e(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(ys.a);
        bytes.getClass();
        kq kqVar = new kq(bytes);
        kqVar.h = str;
        return kqVar;
    }

    public static lw g(String str) {
        Object next;
        str.getClass();
        String strD0 = y93.D0(str, '.', "");
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = strD0.toLowerCase(locale);
        lowerCase.getClass();
        mj0 mj0Var = lw.k;
        mj0Var.getClass();
        a0 a0Var = new a0(0, mj0Var);
        while (true) {
            if (!a0Var.hasNext()) {
                next = null;
                break;
            }
            next = a0Var.next();
            if (((lw) next).f.equals(lowerCase)) {
                break;
            }
        }
        return (lw) next;
    }

    public static long i() {
        return wx.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(uh0 uh0Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                        selectionStart = -1;
                        int iMax2 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                            iMin = -1;
                            if (selectionStart != -1 && iMin != -1) {
                            }
                        } else {
                            loop2: while (true) {
                                boolean z2 = false;
                                while (true) {
                                    if (iMax2 == 0) {
                                        iMin = selectionEnd;
                                        break loop2;
                                    }
                                    if (selectionEnd >= iMin) {
                                        if (z2) {
                                            break;
                                        }
                                    } else {
                                        char cCharAt = editable.charAt(selectionEnd);
                                        if (z2) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt)) {
                                            iMax2--;
                                            selectionEnd++;
                                        } else {
                                            if (Character.isLowSurrogate(cCharAt)) {
                                                break loop2;
                                            }
                                            selectionEnd++;
                                            z2 = true;
                                        }
                                    }
                                }
                                iMax2--;
                                selectionEnd++;
                            }
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    } else {
                        loop0: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char cCharAt2 = editable.charAt(selectionStart);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(cCharAt2)) {
                                        iMax--;
                                    } else {
                                        if (Character.isHighSurrogate(cCharAt2)) {
                                            break loop0;
                                        }
                                        z3 = true;
                                    }
                                } else {
                                    if (z3) {
                                        break loop0;
                                    }
                                    selectionStart = 0;
                                }
                            }
                            iMax--;
                        }
                        selectionStart = -1;
                        int iMax22 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0) {
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                kl3[] kl3VarArr = (kl3[]) editable.getSpans(selectionStart, iMin, kl3.class);
                if (kl3VarArr != null && kl3VarArr.length > 0) {
                    for (kl3 kl3Var : kl3VarArr) {
                        int spanStart = editable.getSpanStart(kl3Var);
                        int spanEnd = editable.getSpanEnd(kl3Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    uh0Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    uh0Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static kq k(byte[] bArr) {
        kq kqVar = kq.i;
        int length = bArr.length;
        rn.v(bArr.length, 0L, length);
        return new kq(uj.M(bArr, 0, length));
    }

    public long c(long j, long j2) {
        float fMin = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMin)) & 4294967295L);
        int i = lr2.a;
        return jFloatToRawIntBits;
    }

    public synchronized ju f(String str) {
        ju juVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = ju.d;
            juVar = (ju) linkedHashMap.get(str);
            if (juVar == null) {
                juVar = (ju) linkedHashMap.get(fa3.e0(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : fa3.e0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (juVar == null) {
                    juVar = new ju(str);
                }
                linkedHashMap.put(str, juVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return juVar;
    }

    public Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.f) {
            case vr.h /* 10 */:
                return "Empty";
            case 11:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zj(int i) {
        this.f = i;
    }
}
