package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ie2 {
    public static final kq b = new kq(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = vr.K("*");
    public static final ie2 d = new ie2(new xg(1));
    public final xg a;

    public ie2(xg xgVar) {
        this.a = xgVar;
    }

    public static List b(String str) {
        List listZ0 = y93.z0(str, new char[]{'.'}, 6);
        if (!s51.n(qx.y0(listZ0), "")) {
            return listZ0;
        }
        int size = listZ0.size() - 1;
        return qx.I0(listZ0, size >= 0 ? size : 0);
    }

    public final String a(String str) {
        String strI;
        String strI2;
        String strI3;
        List listZ0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        xg xgVar = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) xgVar.a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) xgVar.b).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        xgVar.f();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        xgVar.e = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((kq) xgVar.c) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(xgVar.f);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) xgVar.e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        kq[] kqVarArr = new kq[size3];
        for (int i = 0; i < size3; i++) {
            kq kqVar = kq.i;
            kqVarArr[i] = zj.e((String) listB.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strI = null;
                break;
            }
            kq kqVar2 = (kq) xgVar.c;
            if (kqVar2 == null) {
                s51.F("bytes");
                throw null;
            }
            strI = h01.i(kqVar2, kqVarArr, i2);
            if (strI != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            kq[] kqVarArr2 = (kq[]) kqVarArr.clone();
            int length = kqVarArr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                kqVarArr2[i3] = b;
                kq kqVar3 = (kq) xgVar.c;
                if (kqVar3 == null) {
                    s51.F("bytes");
                    throw null;
                }
                strI2 = h01.i(kqVar3, kqVarArr2, i3);
                if (strI2 != null) {
                    break;
                }
            }
            strI2 = null;
        } else {
            strI2 = null;
        }
        if (strI2 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                kq kqVar4 = (kq) xgVar.d;
                if (kqVar4 == null) {
                    s51.F("exceptionBytes");
                    throw null;
                }
                strI3 = h01.i(kqVar4, kqVarArr, i5);
                if (strI3 != null) {
                    break;
                }
            }
            strI3 = null;
        } else {
            strI3 = null;
        }
        if (strI3 != null) {
            listZ0 = y93.z0("!".concat(strI3), new char[]{'.'}, 6);
        } else if (strI == null && strI2 == null) {
            listZ0 = c;
        } else {
            List listZ02 = ni0.f;
            List listZ03 = strI != null ? y93.z0(strI, new char[]{'.'}, 6) : listZ02;
            if (strI2 != null) {
                listZ02 = y93.z0(strI2, new char[]{'.'}, 6);
            }
            listZ0 = listZ03.size() > listZ02.size() ? listZ03 : listZ02;
        }
        if (listB.size() == listZ0.size() && ((String) listZ0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listZ0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listZ0.size();
        } else {
            size = listB.size();
            size2 = listZ0.size() + 1;
        }
        int i6 = size - size2;
        nv2 vjVar = new vj(1, b(str));
        if (i6 < 0) {
            c.g(by1.h("Requested element count ", " is less than zero.", i6));
            return null;
        }
        if (i6 != 0) {
            vjVar = vjVar instanceof fg0 ? ((fg0) vjVar).b(i6) : new eg0(vjVar, i6, 0);
        }
        return pv2.I(vjVar, ".", null, 62);
    }
}
