package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sz0 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ wz0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ sz0(wz0 wz0Var, int i, List list, boolean z) {
        this.f = 2;
        this.g = wz0Var;
        this.h = i;
    }

    @Override // defpackage.cs0
    public final Object a() {
        switch (this.f) {
            case 0:
                wz0 wz0Var = this.g;
                int i = this.h;
                wz0Var.p.getClass();
                try {
                    wz0Var.B.k(i, nj0.m);
                    synchronized (wz0Var) {
                        wz0Var.D.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return dm3.a;
            case 1:
                wz0 wz0Var2 = this.g;
                int i2 = this.h;
                wz0Var2.p.getClass();
                synchronized (wz0Var2) {
                    wz0Var2.D.remove(Integer.valueOf(i2));
                }
                return dm3.a;
            default:
                wz0 wz0Var3 = this.g;
                int i3 = this.h;
                wz0Var3.p.getClass();
                try {
                    wz0Var3.B.k(i3, nj0.m);
                    synchronized (wz0Var3) {
                        wz0Var3.D.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return dm3.a;
        }
    }

    public /* synthetic */ sz0(wz0 wz0Var, int i, Object obj, int i2) {
        this.f = i2;
        this.g = wz0Var;
        this.h = i;
    }
}
