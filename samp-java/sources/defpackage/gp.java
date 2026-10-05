package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gp extends InputStream {
    public final /* synthetic */ int f;
    public final /* synthetic */ rp g;

    public /* synthetic */ gp(rp rpVar, int i) {
        this.f = i;
        this.g = rpVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.f;
        rp rpVar = this.g;
        switch (i) {
            case 0:
                return (int) Math.min(((hp) rpVar).g, 2147483647L);
            default:
                ej2 ej2Var = (ej2) rpVar;
                if (!ej2Var.h) {
                    return (int) Math.min(ej2Var.g.g, 2147483647L);
                }
                c.r("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f) {
            case 0:
                break;
            default:
                ((ej2) this.g).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f;
        rp rpVar = this.g;
        switch (i) {
            case 0:
                hp hpVar = (hp) rpVar;
                if (hpVar.g > 0) {
                    return hpVar.readByte() & 255;
                }
                return -1;
            default:
                ej2 ej2Var = (ej2) rpVar;
                hp hpVar2 = ej2Var.g;
                if (ej2Var.h) {
                    c.r("closed");
                    return 0;
                }
                if (hpVar2.g == 0 && ej2Var.f.d(8192L, hpVar2) == -1) {
                    return -1;
                }
                return hpVar2.readByte() & 255;
        }
    }

    public final String toString() {
        int i = this.f;
        rp rpVar = this.g;
        switch (i) {
            case 0:
                return ((hp) rpVar) + ".inputStream()";
            default:
                return ((ej2) rpVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f) {
            case 1:
                outputStream.getClass();
                ej2 ej2Var = (ej2) this.g;
                hp hpVar = ej2Var.g;
                if (ej2Var.h) {
                    c.r("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (hpVar.g == 0 && ej2Var.f.d(8192L, hpVar) == -1) {
                        return j;
                    }
                    long j2 = hpVar.g;
                    j += j2;
                    rn.v(j2, 0L, j2);
                    jt2 jt2Var = hpVar.f;
                    while (j2 > 0) {
                        jt2Var.getClass();
                        int iMin = (int) Math.min(j2, jt2Var.c - jt2Var.b);
                        outputStream.write(jt2Var.a, jt2Var.b, iMin);
                        int i = jt2Var.b + iMin;
                        jt2Var.b = i;
                        long j3 = iMin;
                        hpVar.g -= j3;
                        j2 -= j3;
                        if (i == jt2Var.c) {
                            jt2 jt2VarA = jt2Var.a();
                            hpVar.f = jt2VarA;
                            mt2.a(jt2Var);
                            jt2Var = jt2VarA;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    private final void b() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f;
        rp rpVar = this.g;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((hp) rpVar).read(bArr, i, i2);
            default:
                ej2 ej2Var = (ej2) rpVar;
                hp hpVar = ej2Var.g;
                if (!ej2Var.h) {
                    rn.v(bArr.length, i, i2);
                    if (hpVar.g == 0 && ej2Var.f.d(8192L, hpVar) == -1) {
                        return -1;
                    }
                    return hpVar.read(bArr, i, i2);
                }
                c.r("closed");
                return 0;
        }
    }
}
