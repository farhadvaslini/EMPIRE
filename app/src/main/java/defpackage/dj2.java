package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dj2 implements qp {
    public final g43 f;
    public final hp g;
    public boolean h;

    public dj2(g43 g43Var) {
        g43Var.getClass();
        this.f = g43Var;
        this.g = new hp();
    }

    @Override // defpackage.g43
    public final ci3 a() {
        return this.f.a();
    }

    public final qp b() {
        if (this.h) {
            c.q("closed");
            return null;
        }
        hp hpVar = this.g;
        long j = hpVar.g;
        if (j == 0) {
            j = 0;
        } else {
            jt2 jt2Var = hpVar.f;
            jt2Var.getClass();
            jt2 jt2Var2 = jt2Var.g;
            jt2Var2.getClass();
            int i = jt2Var2.c;
            if (i < 8192 && jt2Var2.e) {
                j -= (long) (i - jt2Var2.b);
            }
        }
        if (j > 0) {
            this.f.l(j, hpVar);
        }
        return this;
    }

    @Override // defpackage.g43, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        g43 g43Var = this.f;
        if (this.h) {
            return;
        }
        try {
            hp hpVar = this.g;
            long j = hpVar.g;
            if (j > 0) {
                g43Var.l(j, hpVar);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            g43Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.h = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.qp
    public final qp e(kq kqVar) {
        kqVar.getClass();
        if (this.h) {
            c.q("closed");
            return null;
        }
        this.g.p(kqVar);
        b();
        return this;
    }

    @Override // defpackage.qp, defpackage.g43, java.io.Flushable
    public final void flush() {
        if (this.h) {
            c.q("closed");
            return;
        }
        hp hpVar = this.g;
        long j = hpVar.g;
        g43 g43Var = this.f;
        if (j > 0) {
            g43Var.l(j, hpVar);
        }
        g43Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // defpackage.g43
    public final void l(long j, hp hpVar) {
        hpVar.getClass();
        if (this.h) {
            c.q("closed");
        } else {
            this.g.l(j, hpVar);
            b();
        }
    }

    public final String toString() {
        return "buffer(" + this.f + ')';
    }

    @Override // defpackage.qp
    public final qp w(String str) {
        if (this.h) {
            c.q("closed");
            return null;
        }
        this.g.E(str);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.h) {
            c.q("closed");
            return 0;
        }
        int iWrite = this.g.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // defpackage.qp
    public final qp writeByte(int i) {
        if (this.h) {
            c.q("closed");
            return null;
        }
        this.g.v(i);
        b();
        return this;
    }

    @Override // defpackage.qp
    public final qp writeInt(int i) {
        if (this.h) {
            c.q("closed");
            return null;
        }
        this.g.B(i);
        b();
        return this;
    }

    @Override // defpackage.qp
    public final qp writeShort(int i) {
        if (this.h) {
            c.q("closed");
            return null;
        }
        this.g.C(i);
        b();
        return this;
    }

    @Override // defpackage.qp
    public final qp write(byte[] bArr) {
        if (!this.h) {
            this.g.r(bArr, bArr.length);
            b();
            return this;
        }
        c.q("closed");
        return null;
    }
}
