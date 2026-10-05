package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 implements z73 {
    public byte f;
    public final ej2 g;
    public final Inflater h;
    public final g21 i;
    public final CRC32 j;

    public ex0(rp rpVar) {
        rpVar.getClass();
        ej2 ej2Var = new ej2(rpVar);
        this.g = ej2Var;
        Inflater inflater = new Inflater(true);
        this.h = inflater;
        this.i = new g21(ej2Var, inflater);
        this.j = new CRC32();
    }

    public static void b(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + y93.t0(8, rn.I(i2)) + " != expected 0x" + y93.t0(8, rn.I(i)));
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return this.g.f.a();
    }

    public final void c(hp hpVar, long j, long j2) {
        jt2 jt2Var = hpVar.f;
        jt2Var.getClass();
        while (true) {
            int i = jt2Var.c;
            int i2 = jt2Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            jt2Var = jt2Var.f;
            jt2Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) jt2Var.b) + j);
            int iMin = (int) Math.min(jt2Var.c - i3, j2);
            this.j.update(jt2Var.a, i3, iMin);
            j2 -= (long) iMin;
            jt2Var = jt2Var.f;
            jt2Var.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.close();
    }

    @Override // defpackage.z73
    public final long d(long j, hp hpVar) throws IOException {
        long j2;
        ex0 ex0Var = this;
        hpVar.getClass();
        byte b = ex0Var.f;
        CRC32 crc32 = ex0Var.j;
        ej2 ej2Var = ex0Var.g;
        if (b == 0) {
            ej2Var.t(10L);
            hp hpVar2 = ej2Var.g;
            byte bF = hpVar2.f(3L);
            boolean z = ((bF >> 1) & 1) == 1;
            if (z) {
                ex0Var.c(hpVar2, 0L, 10L);
            }
            b(8075, ej2Var.readShort(), "ID1ID2");
            ej2Var.skip(8L);
            if (((bF >> 2) & 1) == 1) {
                ej2Var.t(2L);
                if (z) {
                    c(hpVar2, 0L, 2L);
                }
                short s = hpVar2.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                ej2Var.t(j3);
                if (z) {
                    c(hpVar2, 0L, j3);
                }
                ej2Var.skip(j3);
            }
            if (((bF >> 3) & 1) == 1) {
                long jC = ej2Var.c((byte) 0, 0L, Long.MAX_VALUE);
                if (jC == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    c(hpVar2, 0L, jC + 1);
                } else {
                    j2 = 2;
                }
                ej2Var.skip(jC + 1);
            } else {
                j2 = 2;
            }
            if (((bF >> 4) & 1) == 1) {
                long j4 = j2;
                long jC2 = ej2Var.c((byte) 0, 0L, Long.MAX_VALUE);
                if (jC2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    ex0Var = this;
                    ex0Var.c(hpVar2, 0L, jC2 + 1);
                } else {
                    ex0Var = this;
                    j2 = j4;
                }
                ej2Var.skip(jC2 + 1);
            } else {
                ex0Var = this;
            }
            if (z) {
                ej2Var.t(j2);
                short s2 = hpVar2.readShort();
                b((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            ex0Var.f = (byte) 1;
        }
        if (ex0Var.f == 1) {
            long j5 = hpVar.g;
            long jD = ex0Var.i.d(8192L, hpVar);
            if (jD != -1) {
                ex0Var.c(hpVar, j5, jD);
                return jD;
            }
            ex0Var.f = (byte) 2;
        }
        if (ex0Var.f == 2) {
            b(ej2Var.f(), (int) crc32.getValue(), "CRC");
            b(ej2Var.f(), (int) ex0Var.h.getBytesWritten(), "ISIZE");
            ex0Var.f = (byte) 3;
            if (!ej2Var.b()) {
                c.r("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }
}
