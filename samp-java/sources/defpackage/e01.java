package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class e01 implements Closeable {
    public static final Logger k = Logger.getLogger(oz0.class.getName());
    public final qp f;
    public final hp g;
    public int h;
    public boolean i;
    public final hz0 j;

    public e01(dj2 dj2Var) {
        dj2Var.getClass();
        this.f = dj2Var;
        hp hpVar = new hp();
        this.g = hpVar;
        this.h = 16384;
        this.j = new hz0(hpVar);
    }

    public final void b(pz2 pz2Var) {
        pz2Var.getClass();
        synchronized (this) {
            try {
                if (this.i) {
                    throw new IOException("closed");
                }
                int i = this.h;
                int i2 = pz2Var.a;
                if ((i2 & 32) != 0) {
                    i = pz2Var.b[5];
                }
                this.h = i;
                if (((i2 & 2) != 0 ? pz2Var.b[1] : -1) != -1) {
                    hz0 hz0Var = this.j;
                    int i3 = (i2 & 2) != 0 ? pz2Var.b[1] : -1;
                    hz0Var.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = hz0Var.d;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            hz0Var.b = Math.min(hz0Var.b, iMin);
                        }
                        hz0Var.c = true;
                        hz0Var.d = iMin;
                        int i5 = hz0Var.h;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                sx0[] sx0VarArr = hz0Var.e;
                                uj.O(0, sx0VarArr.length, null, sx0VarArr);
                                hz0Var.f = hz0Var.e.length - 1;
                                hz0Var.g = 0;
                                hz0Var.h = 0;
                            } else {
                                hz0Var.a(i5 - iMin);
                            }
                        }
                    }
                }
                f(0, 0, 4, 1);
                this.f.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z, int i, hp hpVar, int i2) {
        synchronized (this) {
            if (this.i) {
                throw new IOException("closed");
            }
            f(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                qp qpVar = this.f;
                hpVar.getClass();
                qpVar.l(i2, hpVar);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.i = true;
            this.f.close();
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = k;
            if (logger.isLoggable(level)) {
                logger.fine(oz0.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.h) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.h + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            c.g(by1.e(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = jv3.a;
        qp qpVar = this.f;
        qpVar.getClass();
        qpVar.writeByte((i2 >>> 16) & 255);
        qpVar.writeByte((i2 >>> 8) & 255);
        qpVar.writeByte(i2 & 255);
        qpVar.writeByte(i3 & 255);
        qpVar.writeByte(i4 & 255);
        qpVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final void flush() {
        synchronized (this) {
            if (this.i) {
                throw new IOException("closed");
            }
            this.f.flush();
        }
    }

    public final void h(int i, nj0 nj0Var, byte[] bArr) {
        synchronized (this) {
            if (this.i) {
                throw new IOException("closed");
            }
            if (nj0Var.f == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            f(0, bArr.length + 8, 7, 0);
            this.f.writeInt(i);
            this.f.writeInt(nj0Var.f);
            if (bArr.length != 0) {
                this.f.write(bArr);
            }
            this.f.flush();
        }
    }

    public final void i(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.i) {
                throw new IOException("closed");
            }
            this.j.d(arrayList);
            long j = this.g.g;
            long jMin = Math.min(this.h, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            f(i, (int) jMin, 1, i2);
            this.f.l(jMin, this.g);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.h, j2);
                    j2 -= jMin2;
                    f(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.f.l(jMin2, this.g);
                }
            }
        }
    }

    public final void j(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.i) {
                throw new IOException("closed");
            }
            f(0, 8, 6, z ? 1 : 0);
            this.f.writeInt(i);
            this.f.writeInt(i2);
            this.f.flush();
        }
    }

    public final void k(int i, nj0 nj0Var) {
        synchronized (this) {
            if (this.i) {
                throw new IOException("closed");
            }
            if (nj0Var.f == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            f(i, 4, 3, 0);
            this.f.writeInt(nj0Var.f);
            this.f.flush();
        }
    }

    public final void m(int i, long j) {
        synchronized (this) {
            try {
                if (this.i) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(oz0.c(false, i, 4, j));
                }
                f(i, 4, 8, 0);
                this.f.writeInt((int) j);
                this.f.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
