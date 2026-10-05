package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(ys.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String a(long j, hp hpVar) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (hpVar.f(j2) == 13) {
                String strK = hpVar.k(j2, ys.a);
                hpVar.skip(2L);
                return strK;
            }
        }
        String strK2 = hpVar.k(j, ys.a);
        hpVar.skip(1L);
        return strK2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(hp hpVar, r02 r02Var, boolean z) {
        int i;
        int i2;
        int i3;
        jt2 jt2Var;
        int i4;
        r02Var.getClass();
        jt2 jt2Var2 = hpVar.f;
        if (jt2Var2 != null) {
            byte[] bArr = jt2Var2.a;
            int i5 = jt2Var2.b;
            int i6 = jt2Var2.c;
            int[] iArr = r02Var.g;
            jt2 jt2Var3 = jt2Var2;
            int i7 = -1;
            int i8 = 0;
            loop0: while (true) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = i8 + 2;
                int i12 = iArr[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (jt2Var3 == null) {
                    break;
                }
                if (i10 >= 0) {
                    int i13 = i5 + 1;
                    int i14 = bArr[i5] & 255;
                    int i15 = i11 + i10;
                    while (i11 != i15) {
                        if (i14 == iArr[i11]) {
                            i = iArr[i11 + i10];
                            if (i13 == i6) {
                                jt2Var3 = jt2Var3.f;
                                jt2Var3.getClass();
                                int i16 = jt2Var3.b;
                                byte[] bArr2 = jt2Var3.a;
                                i2 = jt2Var3.c;
                                if (jt2Var3 == jt2Var2) {
                                    i3 = i16;
                                    bArr = bArr2;
                                    jt2Var3 = null;
                                } else {
                                    i3 = i16;
                                    bArr = bArr2;
                                }
                            } else {
                                i2 = i6;
                                i3 = i13;
                            }
                            if (i >= 0) {
                                return i;
                            }
                            int i17 = i2;
                            i8 = -i;
                            i5 = i3;
                            i6 = i17;
                        } else {
                            i11++;
                        }
                    }
                    break loop0;
                }
                int i18 = (i10 * (-1)) + i11;
                while (true) {
                    int i19 = i5 + 1;
                    int i20 = i11 + 1;
                    if ((bArr[i5] & 255) != iArr[i11]) {
                        break loop0;
                    }
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        jt2Var3.getClass();
                        jt2 jt2Var4 = jt2Var3.f;
                        jt2Var4.getClass();
                        i3 = jt2Var4.b;
                        byte[] bArr3 = jt2Var4.a;
                        i4 = jt2Var4.c;
                        if (jt2Var4 != jt2Var2) {
                            jt2Var = jt2Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            jt2Var = null;
                        }
                    } else {
                        jt2Var = jt2Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        jt2Var3 = jt2Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    jt2Var3 = jt2Var;
                    i11 = i20;
                }
            }
        } else {
            return z ? -2 : -1;
        }
    }
}
