package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ej2 implements rp {
    public final z73 f;
    public final hp g;
    public boolean h;

    public ej2(z73 z73Var) {
        z73Var.getClass();
        this.f = z73Var;
        this.g = new hp();
    }

    @Override // defpackage.rp
    public final InputStream A() {
        return new gp(this, 1);
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return this.f.a();
    }

    public final boolean b() {
        if (this.h) {
            c.q("closed");
            return false;
        }
        hp hpVar = this.g;
        return hpVar.c() && this.f.d(8192L, hpVar) == -1;
    }

    public final long c(byte b, long j, long j2) {
        if (this.h) {
            c.q("closed");
            return 0L;
        }
        if (0 > j2) {
            c.f(j2, "fromIndex=0 toIndex=");
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            hp hpVar = this.g;
            byte b2 = b;
            long j3 = j2;
            long jH = hpVar.h(b2, jMax, j3);
            if (jH != -1) {
                return jH;
            }
            long j4 = hpVar.g;
            if (j4 >= j3 || this.f.d(8192L, hpVar) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.close();
        hp hpVar = this.g;
        hpVar.skip(hpVar.g);
    }

    @Override // defpackage.z73
    public final long d(long j, hp hpVar) {
        hpVar.getClass();
        if (j < 0) {
            c.f(j, "byteCount < 0: ");
            return 0L;
        }
        if (this.h) {
            c.q("closed");
            return 0L;
        }
        hp hpVar2 = this.g;
        if (hpVar2.g == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f.d(8192L, hpVar2) == -1) {
                return -1L;
            }
        }
        return hpVar2.d(Math.min(j, hpVar2.g), hpVar);
    }

    public final int f() throws EOFException {
        t(4L);
        int i = this.g.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // defpackage.rp
    public final kq g(long j) throws EOFException {
        t(j);
        return this.g.g(j);
    }

    public final boolean h(long j) {
        hp hpVar;
        if (j < 0) {
            c.f(j, "byteCount < 0: ");
            return false;
        }
        if (this.h) {
            c.q("closed");
            return false;
        }
        do {
            hpVar = this.g;
            if (hpVar.g >= j) {
                return true;
            }
        } while (this.f.d(8192L, hpVar) != -1);
        return false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // defpackage.rp
    public final String q(long j) throws EOFException {
        if (j < 0) {
            c.f(j, "limit < 0: ");
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jC = c((byte) 10, 0L, j2);
        hp hpVar = this.g;
        if (jC != -1) {
            return b.a(jC, hpVar);
        }
        if (j2 < Long.MAX_VALUE && h(j2) && hpVar.f(j2 - 1) == 13 && h(j2 + 1) && hpVar.f(j2) == 10) {
            return b.a(j2, hpVar);
        }
        hp hpVar2 = new hp();
        hpVar.b(hpVar2, 0L, Math.min(32L, hpVar.g));
        throw new EOFException("\\n not found: limit=" + Math.min(hpVar.g, j) + " content=" + hpVar2.g(hpVar2.g).c() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        hp hpVar = this.g;
        if (hpVar.g == 0 && this.f.d(8192L, hpVar) == -1) {
            return -1;
        }
        return hpVar.read(byteBuffer);
    }

    @Override // defpackage.rp
    public final byte readByte() throws EOFException {
        t(1L);
        return this.g.readByte();
    }

    @Override // defpackage.rp
    public final int readInt() throws EOFException {
        t(4L);
        return this.g.readInt();
    }

    @Override // defpackage.rp
    public final short readShort() throws EOFException {
        t(2L);
        return this.g.readShort();
    }

    @Override // defpackage.rp
    public final int s(r02 r02Var) throws EOFException {
        r02Var.getClass();
        if (this.h) {
            c.q("closed");
            return 0;
        }
        while (true) {
            hp hpVar = this.g;
            int iB = b.b(hpVar, r02Var, true);
            if (iB != -2) {
                if (iB != -1) {
                    hpVar.skip(r02Var.f[iB].b());
                    return iB;
                }
            } else if (this.f.d(8192L, hpVar) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // defpackage.rp
    public final void skip(long j) throws EOFException {
        if (this.h) {
            c.q("closed");
            return;
        }
        while (j > 0) {
            hp hpVar = this.g;
            if (hpVar.g == 0 && this.f.d(8192L, hpVar) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, hpVar.g);
            hpVar.skip(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.rp
    public final void t(long j) throws EOFException {
        if (!h(j)) {
            throw new EOFException();
        }
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }

    @Override // defpackage.rp
    public final String y(Charset charset) {
        charset.getClass();
        z73 z73Var = this.f;
        hp hpVar = this.g;
        hpVar.u(z73Var);
        return hpVar.k(hpVar.g, charset);
    }
}
