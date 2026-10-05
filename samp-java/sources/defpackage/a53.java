package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class a53 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ h53 g;

    public /* synthetic */ a53(h53 h53Var, int i) {
        this.f = i;
        this.g = h53Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) throws PendingIntent.CanceledException {
        int i;
        int i2 = this.f;
        dm3 dm3Var = dm3.a;
        h53 h53Var = this.g;
        switch (i2) {
            case 0:
                p41 p41Var = (p41) obj;
                h53Var.p.h((int) (p41Var.a >> 32));
                h53Var.q.h((int) (p41Var.a & 4294967295L));
                return dm3Var;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                ex exVar = h53Var.h;
                z32 z32Var = h53Var.i;
                float f = exVar.f;
                float f2 = exVar.g;
                float fG = y02.g(fFloatValue, f, f2);
                int i3 = h53Var.f;
                boolean z = false;
                if (i3 > 0 && (i = i3 + 1) >= 0) {
                    float fAbs = fG;
                    float f3 = fAbs;
                    int i4 = 0;
                    while (true) {
                        float fN = lq.N(f, f2, i4 / i);
                        float f4 = fN - fG;
                        if (Math.abs(f4) <= fAbs) {
                            fAbs = Math.abs(f4);
                            f3 = fN;
                        }
                        if (i4 != i) {
                            i4++;
                        } else {
                            fG = f3;
                        }
                    }
                }
                if (fG != z32Var.g()) {
                    if (fG != z32Var.g()) {
                        ns0 ns0Var = h53Var.j;
                        if (ns0Var != null) {
                            ns0Var.h(Float.valueOf(fG));
                        } else {
                            h53Var.c(fG);
                        }
                    }
                    cs0 cs0Var = h53Var.g;
                    if (cs0Var != null) {
                        cs0Var.a();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                h53Var.a(0.0f);
                h53Var.t.a();
                return dm3Var;
        }
    }
}
