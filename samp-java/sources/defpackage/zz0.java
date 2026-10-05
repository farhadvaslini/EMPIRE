package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zz0 implements Closeable {
    public static final Logger i;
    public final rp f;
    public final yz0 g;
    public final gz0 h;

    static {
        Logger logger = Logger.getLogger(oz0.class.getName());
        logger.getClass();
        i = logger;
    }

    public zz0(ej2 ej2Var) {
        ej2Var.getClass();
        this.f = ej2Var;
        yz0 yz0Var = new yz0(ej2Var);
        this.g = yz0Var;
        this.h = new gz0(yz0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0240, code lost:
    
        defpackage.c.r(defpackage.by1.e(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0249, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(boolean r14, defpackage.gw r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz0.b(boolean, gw):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011c, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
    
        r9.j(defpackage.ux0.g, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.gw r17, int r18, int r19, final int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz0.c(gw, int, int, int):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f.close();
    }

    public final List f(int i2, int i3, int i4, int i5) throws IOException {
        yz0 yz0Var = this.g;
        yz0Var.i = i2;
        yz0Var.j = i3;
        yz0Var.g = i4;
        yz0Var.h = i5;
        gz0 gz0Var = this.h;
        ej2 ej2Var = gz0Var.d;
        while (!ej2Var.b()) {
            byte b = ej2Var.readByte();
            byte[] bArr = jv3.a;
            int i6 = b & 255;
            if (i6 == 128) {
                c.r("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iF = gz0Var.f(i6, 127);
                int i7 = iF - 1;
                if (i7 >= 0) {
                    sx0[] sx0VarArr = iz0.a;
                    if (i7 <= sx0VarArr.length - 1) {
                        gz0Var.a(sx0VarArr[i7]);
                    }
                }
                int length = gz0Var.f + 1 + (i7 - iz0.a.length);
                if (length >= 0) {
                    sx0[] sx0VarArr2 = gz0Var.e;
                    if (length < sx0VarArr2.length) {
                        sx0 sx0Var = sx0VarArr2[length];
                        sx0Var.getClass();
                        gz0Var.a(sx0Var);
                    }
                }
                c.r(by1.e(iF, "Header index too large "));
                return null;
            }
            if (i6 == 64) {
                sx0[] sx0VarArr3 = iz0.a;
                kq kqVarE = gz0Var.e();
                iz0.a(kqVarE);
                gz0Var.d(new sx0(kqVarE, gz0Var.e()));
            } else if ((b & 64) == 64) {
                gz0Var.d(new sx0(gz0Var.c(gz0Var.f(i6, 63) - 1), gz0Var.e()));
            } else if ((b & 32) == 32) {
                int iF2 = gz0Var.f(i6, 31);
                gz0Var.a = iF2;
                if (iF2 < 0 || iF2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + gz0Var.a);
                }
                int i8 = gz0Var.h;
                if (iF2 < i8) {
                    if (iF2 == 0) {
                        sx0[] sx0VarArr4 = gz0Var.e;
                        uj.O(0, sx0VarArr4.length, null, sx0VarArr4);
                        gz0Var.f = gz0Var.e.length - 1;
                        gz0Var.g = 0;
                        gz0Var.h = 0;
                    } else {
                        gz0Var.b(i8 - iF2);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                sx0[] sx0VarArr5 = iz0.a;
                kq kqVarE2 = gz0Var.e();
                iz0.a(kqVarE2);
                gz0Var.a(new sx0(kqVarE2, gz0Var.e()));
            } else {
                gz0Var.a(new sx0(gz0Var.c(gz0Var.f(i6, 15) - 1), gz0Var.e()));
            }
        }
        ArrayList arrayList = gz0Var.b;
        List listN0 = qx.N0(arrayList);
        arrayList.clear();
        gz0Var.c = 0L;
        return listN0;
    }

    public final void h(gw gwVar, int i2, int i3, int i4) throws IOException {
        int i5;
        if (i4 == 0) {
            c.r("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte b = this.f.readByte();
            byte[] bArr = jv3.a;
            i5 = b & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            rp rpVar = this.f;
            rpVar.readInt();
            rpVar.readByte();
            byte[] bArr2 = jv3.a;
            i2 -= 5;
        }
        List listF = f(vp.M(i2, i3, i5), i5, i3, i4);
        wz0 wz0Var = (wz0) gwVar.h;
        if (i4 != 0 && (i4 & 1) == 0) {
            z = true;
        }
        if (z) {
            hd3.b(wz0Var.n, wz0Var.h + '[' + i4 + "] onHeaders", new sz0(wz0Var, i4, listF, z2));
            return;
        }
        synchronized (wz0Var) {
            d01 d01VarC = wz0Var.c(i4);
            if (d01VarC != null) {
                d01VarC.j(lv3.h(listF), z2);
                return;
            }
            if (wz0Var.k) {
                return;
            }
            if (i4 <= wz0Var.i) {
                return;
            }
            if (i4 % 2 == wz0Var.j % 2) {
                return;
            }
            d01 d01Var = new d01(i4, wz0Var, false, z2, lv3.h(listF));
            wz0Var.i = i4;
            wz0Var.g.put(Integer.valueOf(i4), d01Var);
            hd3.b(wz0Var.l.d(), wz0Var.h + '[' + i4 + "] onStream", new u1(21, wz0Var, d01Var));
        }
    }

    public final void i(gw gwVar, int i2, int i3, int i4) throws IOException {
        int i5;
        if (i4 == 0) {
            c.r("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i6 = 0;
        if ((i3 & 8) != 0) {
            byte b = this.f.readByte();
            byte[] bArr = jv3.a;
            i5 = b & 255;
        } else {
            i5 = 0;
        }
        int i7 = this.f.readInt() & Integer.MAX_VALUE;
        List listF = f(vp.M(i2 - 4, i3, i5), i5, i3, i4);
        wz0 wz0Var = (wz0) gwVar.h;
        synchronized (wz0Var) {
            if (wz0Var.D.contains(Integer.valueOf(i7))) {
                wz0Var.k(i7, nj0.i);
                return;
            }
            wz0Var.D.add(Integer.valueOf(i7));
            hd3.b(wz0Var.n, wz0Var.h + '[' + i7 + "] onRequest", new sz0(wz0Var, i7, listF, i6));
        }
    }
}
