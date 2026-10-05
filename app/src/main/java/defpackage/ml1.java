package defpackage;

import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ml1 extends ed3 {
    public final xc0 e;
    public final wc0 f;
    public final AtomicReference g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(id3 id3Var, xc0 xc0Var, wc0 wc0Var) {
        super(nc2.j(new StringBuilder(), wc0Var.a, " dns"), false);
        id3Var.getClass();
        this.e = xc0Var;
        this.f = wc0Var;
        this.g = new AtomicReference(jl1.b);
    }

    @Override // defpackage.ed3
    public final long a() {
        Object obj;
        jl1 jl1Var = jl1.a;
        AtomicReference atomicReference = this.g;
        try {
            this.e.a(this.f.a);
            atomicReference.getClass();
            loop0: while (true) {
                obj = atomicReference.get();
                ll1 ll1Var = (ll1) obj;
                ll1Var.getClass();
                if (!(ll1Var instanceof kl1)) {
                    break;
                }
                while (!atomicReference.compareAndSet(obj, jl1Var)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                break loop0;
            }
            return -1L;
        } catch (UnknownHostException unused) {
            atomicReference.getClass();
            while (true) {
                Object obj2 = atomicReference.get();
                ll1 ll1Var2 = (ll1) obj2;
                ll1Var2.getClass();
                if (!(ll1Var2 instanceof kl1)) {
                    return -1L;
                }
                while (!atomicReference.compareAndSet(obj2, jl1Var)) {
                    if (atomicReference.get() != obj2) {
                        break;
                    }
                }
                return -1L;
            }
        }
    }
}
