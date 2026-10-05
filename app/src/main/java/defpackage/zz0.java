package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final boolean b(boolean z, gw gwVar) throws Exception {
        int iK;
        Object[] array;
        try {
            this.f.t(9L);
            iK = jv3.k(this.f);
        } catch (EOFException unused) {
        }
        if (iK > 16384) {
            c.r(by1.e(iK, "FRAME_SIZE_ERROR: "));
            return false;
        }
        int i2 = this.f.readByte() & 255;
        byte b = this.f.readByte();
        int i3 = b & 255;
        int i4 = this.f.readInt();
        int i5 = Integer.MAX_VALUE & i4;
        int i6 = 1;
        if (i2 != 8) {
            Logger logger = i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(oz0.b(true, i5, iK, i2, i3));
            }
        }
        if (z && i2 != 4) {
            throw new IOException("Expected a SETTINGS frame but was " + oz0.a(i2));
        }
        nj0 nj0Var = null;
        switch (i2) {
            case 0:
                c(gwVar, iK, i3, i5);
                return true;
            case 1:
                h(gwVar, iK, i3, i5);
                return true;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                if (iK != 5) {
                    c.r(by1.h("TYPE_PRIORITY length: ", " != 5", iK));
                    return false;
                }
                if (i5 == 0) {
                    c.r("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                rp rpVar = this.f;
                rpVar.readInt();
                rpVar.readByte();
                return true;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                if (iK != 4) {
                    c.r(by1.h("TYPE_RST_STREAM length: ", " != 4", iK));
                    return false;
                }
                if (i5 == 0) {
                    c.r("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int i7 = this.f.readInt();
                nj0.g.getClass();
                nj0[] nj0VarArrValues = nj0.values();
                int length = nj0VarArrValues.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        nj0 nj0Var2 = nj0VarArrValues[i8];
                        if (nj0Var2.f == i7) {
                            nj0Var = nj0Var2;
                        } else {
                            i8++;
                        }
                    }
                }
                if (nj0Var == null) {
                    c.r(by1.e(i7, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                }
                wz0 wz0Var = (wz0) gwVar.h;
                if (i5 != 0 && (i4 & 1) == 0) {
                    hd3.b(wz0Var.n, wz0Var.h + '[' + i5 + "] onReset", new sz0(wz0Var, i5, nj0Var, i6));
                    return true;
                }
                d01 d01VarF = wz0Var.f(i5);
                if (d01VarF != null) {
                    synchronized (d01VarF) {
                        if (d01VarF.g() == null) {
                            d01VarF.q = nj0Var;
                            d01VarF.notifyAll();
                        }
                        break;
                    }
                    return true;
                }
                return true;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                rp rpVar2 = this.f;
                if (i5 != 0) {
                    c.r("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((b & 1) != 0) {
                    if (iK != 0) {
                        c.r("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (iK % 6 != 0) {
                    c.r(by1.e(iK, "TYPE_SETTINGS length % 6 != 0: "));
                    return false;
                }
                pz2 pz2Var = new pz2();
                j41 j41VarN = y02.N(y02.S(0, iK), 6);
                int i9 = j41VarN.f;
                int i10 = j41VarN.g;
                int i11 = j41VarN.h;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (true) {
                        short s = rpVar2.readShort();
                        byte[] bArr = jv3.a;
                        int i12 = s & 65535;
                        int i13 = rpVar2.readInt();
                        if (i12 != 2) {
                            if (i12 != 4) {
                                if (i12 == 5 && (i13 < 16384 || i13 > 16777215)) {
                                }
                            } else if (i13 < 0) {
                                c.r("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (i13 != 0 && i13 != 1) {
                            c.r("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        pz2Var.b(i12, i13);
                        if (i9 != i10) {
                            i9 += i11;
                        }
                        break;
                    }
                }
                wz0 wz0Var2 = (wz0) gwVar.h;
                hd3.b(wz0Var2.m, nc2.j(new StringBuilder(), wz0Var2.h, " applyAndAckSettings"), new u1(22, gwVar, pz2Var));
                return true;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                i(gwVar, iK, i3, i5);
                return true;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                if (iK != 8) {
                    c.r(by1.e(iK, "TYPE_PING length != 8: "));
                    return false;
                }
                if (i5 != 0) {
                    c.r("TYPE_PING streamId != 0");
                    return false;
                }
                final int i14 = this.f.readInt();
                final int i15 = this.f.readInt();
                i = (b & 1) != 0 ? 1 : 0;
                wz0 wz0Var3 = (wz0) gwVar.h;
                if (i == 0) {
                    hd3 hd3Var = wz0Var3.m;
                    String strJ = nc2.j(new StringBuilder(), ((wz0) gwVar.h).h, " ping");
                    final wz0 wz0Var4 = (wz0) gwVar.h;
                    hd3.b(hd3Var, strJ, new cs0() { // from class: vz0
                        @Override // defpackage.cs0
                        public final Object a() {
                            wz0 wz0Var5 = wz0Var4;
                            try {
                                wz0Var5.B.j(i14, i15, true);
                            } catch (IOException e) {
                                nj0 nj0Var3 = nj0.i;
                                wz0Var5.b(nj0Var3, nj0Var3, e);
                            }
                            return dm3.a;
                        }
                    });
                    return true;
                }
                synchronized (wz0Var3) {
                    try {
                        if (i14 == 1) {
                            wz0Var3.q++;
                        } else if (i14 == 2) {
                            wz0Var3.s++;
                        } else if (i14 == 3) {
                            wz0Var3.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                if (iK < 8) {
                    c.r(by1.e(iK, "TYPE_GOAWAY length < 8: "));
                    return false;
                }
                if (i5 != 0) {
                    c.r("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int i16 = this.f.readInt();
                int i17 = this.f.readInt();
                int i18 = iK - 8;
                nj0.g.getClass();
                nj0[] nj0VarArrValues2 = nj0.values();
                int length2 = nj0VarArrValues2.length;
                int i19 = 0;
                while (true) {
                    if (i19 < length2) {
                        nj0 nj0Var3 = nj0VarArrValues2[i19];
                        if (nj0Var3.f == i17) {
                            nj0Var = nj0Var3;
                        } else {
                            i19++;
                        }
                    }
                }
                if (nj0Var == null) {
                    c.r(by1.e(i17, "TYPE_GOAWAY unexpected error code: "));
                    return false;
                }
                kq kqVarG = kq.i;
                if (i18 > 0) {
                    kqVarG = this.f.g(i18);
                }
                kqVarG.getClass();
                kqVarG.b();
                wz0 wz0Var5 = (wz0) gwVar.h;
                synchronized (wz0Var5) {
                    array = wz0Var5.g.values().toArray(new d01[0]);
                    wz0Var5.k = true;
                }
                d01[] d01VarArr = (d01[]) array;
                int length3 = d01VarArr.length;
                while (i < length3) {
                    d01 d01Var = d01VarArr[i];
                    if (d01Var.f > i16 && d01Var.h()) {
                        nj0 nj0Var4 = nj0.l;
                        synchronized (d01Var) {
                            if (d01Var.g() == null) {
                                d01Var.q = nj0Var4;
                                d01Var.notifyAll();
                            }
                        }
                        ((wz0) gwVar.h).f(d01Var.f);
                    }
                    i++;
                }
                return true;
            case 8:
                try {
                    if (iK != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iK);
                    }
                    long j = ((long) this.f.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = i;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(oz0.c(true, i5, iK, j));
                    }
                    wz0 wz0Var6 = (wz0) gwVar.h;
                    if (i5 == 0) {
                        synchronized (wz0Var6) {
                            wz0Var6.z += j;
                            wz0Var6.notifyAll();
                        }
                        return true;
                    }
                    d01 d01VarC = wz0Var6.c(i5);
                    if (d01VarC != null) {
                        synchronized (d01VarC) {
                            d01VarC.j += j;
                            if (j > 0) {
                                d01VarC.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    i.fine(oz0.b(true, i5, iK, 8, i3));
                    throw e;
                }
            default:
                this.f.skip(iK);
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011c, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
    
        r9.j(defpackage.ux0.g, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(gw gwVar, int i2, int i3, final int i4) throws IOException {
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        if (i4 == 0) {
            c.r("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = true;
        if ((i3 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i3 & 32) != 0) {
            c.r("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i3 & 8) != 0) {
            byte b = this.f.readByte();
            byte[] bArr = jv3.a;
            i5 = b & 255;
        } else {
            i5 = 0;
        }
        final int iM = vp.M(i2, i3, i5);
        rp rpVar = this.f;
        rpVar.getClass();
        final wz0 wz0Var = (wz0) gwVar.h;
        if (!((i4 == 0 || (i4 & 1) != 0) ? false : z)) {
            d01 d01VarC = wz0Var.c(i4);
            if (d01VarC != null) {
                TimeZone timeZone = lv3.a;
                b01 b01Var = d01VarC.m;
                long j = iM;
                b01Var.getClass();
                long j2 = j;
                while (true) {
                    d01 d01Var = b01Var.k;
                    if (j2 <= 0) {
                        TimeZone timeZone2 = lv3.a;
                        d01Var.g.i(j);
                        b01Var.k.g.u.getClass();
                        break;
                    }
                    synchronized (d01Var) {
                        z2 = b01Var.g;
                        z3 = b01Var.i.g + j2 > b01Var.f;
                    }
                    if (z3) {
                        rpVar.skip(j2);
                        b01Var.k.f(nj0.k);
                        break;
                    }
                    if (z2) {
                        rpVar.skip(j2);
                        break;
                    }
                    long jD = rpVar.d(j2, b01Var.h);
                    if (jD == -1) {
                        throw new EOFException();
                    }
                    j2 -= jD;
                    d01 d01Var2 = b01Var.k;
                    synchronized (d01Var2) {
                        try {
                            if (b01Var.j) {
                                hp hpVar = b01Var.h;
                                hpVar.skip(hpVar.g);
                            } else {
                                hp hpVar2 = b01Var.i;
                                boolean z5 = hpVar2.g == 0;
                                hpVar2.u(b01Var.h);
                                if (z5) {
                                    d01Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                ((wz0) gwVar.h).k(i4, nj0.i);
                long j3 = iM;
                ((wz0) gwVar.h).i(j3);
                rpVar.skip(j3);
            }
        } else {
            final hp hpVar3 = new hp();
            long j4 = iM;
            rpVar.t(j4);
            rpVar.d(j4, hpVar3);
            hd3.b(wz0Var.n, wz0Var.h + '[' + i4 + "] onData", new cs0(i4, hpVar3, iM, z4) { // from class: rz0
                public final /* synthetic */ int g;
                public final /* synthetic */ hp h;
                public final /* synthetic */ int i;

                @Override // defpackage.cs0
                public final Object a() {
                    wz0 wz0Var2 = this.f;
                    int i6 = this.g;
                    hp hpVar4 = this.h;
                    int i7 = this.i;
                    try {
                        wz0Var2.p.getClass();
                        hpVar4.skip(i7);
                        wz0Var2.B.k(i6, nj0.m);
                        synchronized (wz0Var2) {
                            wz0Var2.D.remove(Integer.valueOf(i6));
                        }
                    } catch (IOException unused) {
                    }
                    return dm3.a;
                }
            });
        }
        this.f.skip(i5);
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
