package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kz0 extends jz0 {
    public long j;
    public boolean k;
    public final /* synthetic */ nz0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(nz0 nz0Var, i01 i01Var) {
        super(nz0Var, i01Var);
        i01Var.getClass();
        this.l = nz0Var;
        this.j = -1L;
        this.k = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.h) {
            return;
        }
        if (this.k) {
            TimeZone timeZone = lv3.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = lv3.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.l.b.h();
                b(nz0.f);
            }
        }
        this.h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r16.k == false) goto L46;
     */
    @Override // defpackage.jz0, defpackage.z73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(long j, hp hpVar) throws IOException {
        byte bF;
        nz0 nz0Var = this.l;
        pi piVar = nz0Var.c;
        hpVar.getClass();
        if (this.h) {
            c.q("closed");
            return 0L;
        }
        if (this.k) {
            long j2 = this.j;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((ej2) piVar.h).q(Long.MAX_VALUE);
                }
                try {
                    ej2 ej2Var = (ej2) piVar.h;
                    hp hpVar2 = ej2Var.g;
                    ej2Var.t(1L);
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (!ej2Var.h(i2)) {
                            break;
                        }
                        bF = hpVar2.f(i);
                        if ((bF < 48 || bF > 57) && ((bF < 97 || bF > 102) && (bF < 65 || bF > 70))) {
                            break;
                        }
                        i = i2;
                    }
                    if (i == 0) {
                        ur.r(16);
                        String string = Integer.toString(bF, 16);
                        string.getClass();
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
                    }
                    this.j = hpVar2.j();
                    String string2 = y93.G0(((ej2) piVar.h).q(Long.MAX_VALUE)).toString();
                    if (this.j < 0 || (string2.length() > 0 && !fa3.e0(string2, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.j + string2 + '\"');
                    }
                    if (this.j == 0) {
                        this.k = false;
                        b(nz0Var.e.c());
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jD = super.d(Math.min(8192L, this.j), hpVar);
            if (jD != -1) {
                this.j -= jD;
                return jD;
            }
            nz0Var.b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(nz0.f);
            throw protocolException;
        }
        return -1L;
    }
}
