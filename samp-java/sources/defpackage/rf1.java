package defpackage;

import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rf1 extends gf1 {
    public final boolean b;
    public pi c;
    public final vr3 d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public ff1 i;
    public final i93 j;

    public rf1(of1 of1Var, boolean z) {
        this.a = new yl1(9);
        this.b = z;
        this.c = new pi(8);
        this.d = new vr3(of1Var);
        this.h = new ArrayList();
        ff1 ff1Var = ff1.g;
        this.i = ff1Var;
        this.j = s51.e(ff1Var);
    }

    @Override // defpackage.gf1
    public final void a(nf1 nf1Var) {
        mf1 c90Var;
        qf1 qf1Var;
        of1 of1Var;
        nf1Var.getClass();
        d("addObserver");
        ff1 ff1Var = this.i;
        ff1 ff1Var2 = ff1.f;
        if (ff1Var != ff1Var2) {
            ff1Var2 = ff1.g;
        }
        qf1 qf1Var2 = new qf1();
        qf1Var2.a = ff1Var2;
        HashMap map = wf1.a;
        boolean z = nf1Var instanceof mf1;
        boolean z2 = nf1Var instanceof a90;
        int i = 2;
        if (z && z2) {
            c90Var = new c90((a90) nf1Var, (mf1) nf1Var);
        } else if (z2) {
            c90Var = new c90((a90) nf1Var, (mf1) null);
        } else if (z) {
            c90Var = (mf1) nf1Var;
        } else {
            Class<?> cls = nf1Var.getClass();
            if (wf1.b(cls) == 2) {
                Object obj = wf1.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    wf1.a((Constructor) list.get(0), nf1Var);
                    throw null;
                }
                int size = list.size();
                sv0[] sv0VarArr = new sv0[size];
                if (size > 0) {
                    wf1.a((Constructor) list.get(0), nf1Var);
                    throw null;
                }
                c90Var = new ik2(i, sv0VarArr);
            } else {
                c90Var = new c90(nf1Var);
            }
        }
        qf1Var2.b = c90Var;
        pi piVar = this.c;
        piVar.getClass();
        is1 is1Var = (is1) piVar.g;
        kl0 kl0Var = (kl0) is1Var.g(nf1Var);
        if (kl0Var != null) {
            qf1Var = kl0Var.g;
        } else {
            kl0 kl0Var2 = new kl0(nf1Var, qf1Var2);
            is1Var.m(nf1Var, kl0Var2);
            kl0 kl0Var3 = (kl0) piVar.i;
            if (kl0Var3 == null) {
                piVar.h = kl0Var2;
                piVar.i = kl0Var2;
            } else {
                kl0Var3.h = kl0Var2;
                kl0Var2.i = kl0Var3;
                piVar.i = kl0Var2;
            }
            qf1Var = null;
        }
        if (qf1Var == null && (of1Var = (of1) this.d.a.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            ff1 ff1VarC = c(nf1Var);
            this.e++;
            while (qf1Var2.a.compareTo(ff1VarC) < 0) {
                pi piVar2 = this.c;
                piVar2.getClass();
                if (!((is1) piVar2.g).c(nf1Var)) {
                    break;
                }
                ff1 ff1Var3 = qf1Var2.a;
                ArrayList arrayList = this.h;
                arrayList.add(ff1Var3);
                cf1 cf1Var = ef1.Companion;
                ff1 ff1Var4 = qf1Var2.a;
                cf1Var.getClass();
                ff1Var4.getClass();
                int iOrdinal = ff1Var4.ordinal();
                ef1 ef1Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : ef1.ON_RESUME : ef1.ON_START : ef1.ON_CREATE;
                if (ef1Var == null) {
                    c.o(qf1Var2.a, "no event up from ");
                    return;
                } else {
                    qf1Var2.a(of1Var, ef1Var);
                    vx.j0(arrayList);
                    ff1VarC = c(nf1Var);
                }
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    @Override // defpackage.gf1
    public final void b(nf1 nf1Var) {
        nf1Var.getClass();
        d("removeObserver");
        pi piVar = this.c;
        piVar.getClass();
        kl0 kl0Var = (kl0) ((is1) piVar.g).k(nf1Var);
        if (kl0Var == null) {
            return;
        }
        kl0 kl0Var2 = kl0Var.i;
        kl0 kl0Var3 = kl0Var.h;
        if (kl0Var2 == null) {
            piVar.h = kl0Var3;
        } else {
            kl0Var2.h = kl0Var3;
        }
        kl0 kl0Var4 = kl0Var.h;
        if (kl0Var4 == null) {
            piVar.i = kl0Var2;
        } else {
            kl0Var4.i = kl0Var2;
        }
        kl0Var.j = true;
    }

    public final ff1 c(nf1 nf1Var) {
        pi piVar = this.c;
        piVar.getClass();
        nf1Var.getClass();
        kl0 kl0Var = (kl0) ((is1) piVar.g).g(nf1Var);
        kl0 kl0Var2 = kl0Var != null ? kl0Var.i : null;
        ff1 ff1Var = kl0Var2 != null ? kl0Var2.g.a : null;
        ArrayList arrayList = this.h;
        ff1 ff1Var2 = arrayList.isEmpty() ? null : (ff1) arrayList.get(arrayList.size() - 1);
        ff1 ff1Var3 = this.i;
        if (ff1Var == null || ff1Var.compareTo(ff1Var3) >= 0) {
            ff1Var = ff1Var3;
        }
        return (ff1Var2 == null || ff1Var2.compareTo(ff1Var) >= 0) ? ff1Var : ff1Var2;
    }

    public final void d(String str) {
        fj fjVar;
        if (this.b) {
            if (fj.c != null) {
                fjVar = fj.c;
            } else {
                synchronized (fj.class) {
                    try {
                        if (fj.c == null) {
                            fj.c = new fj(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                fjVar = fj.c;
            }
            ((fj) fjVar.b).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            qn1.e(nc2.i("Method ", str, " must be called on the main thread"));
        }
    }

    public final void e(ef1 ef1Var) {
        ef1Var.getClass();
        d("handleLifecycleEvent");
        f(ef1Var.a());
    }

    public final void f(ff1 ff1Var) {
        if (this.i == ff1Var) {
            return;
        }
        of1 of1Var = (of1) this.d.a.get();
        ff1 ff1Var2 = this.i;
        ff1 ff1Var3 = ff1.g;
        ff1 ff1Var4 = ff1.f;
        if (ff1Var2 == ff1Var3 && ff1Var == ff1Var4) {
            throw new IllegalStateException(("State must be at least '" + ff1.h + "' to be moved to '" + ff1Var + "' in component " + of1Var).toString());
        }
        if (ff1Var2 == ff1Var4 && ff1Var2 != ff1Var) {
            throw new IllegalStateException(("State is '" + ff1Var4 + "' and cannot be moved to `" + ff1Var + "` in component " + of1Var).toString());
        }
        this.i = ff1Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.i == ff1Var4) {
            this.c = new pi(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r7.g = false;
        r7.j.i(r7.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r7 = this;
            vr3 r0 = r7.d
            java.lang.ref.WeakReference r0 = r0.a
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La3
            of1 r0 = (defpackage.of1) r0
        Lc:
            pi r1 = r7.c
            java.lang.Object r2 = r1.g
            is1 r2 = (defpackage.is1) r2
            int r2 = r2.e
            r3 = 0
            if (r2 != 0) goto L18
            goto L34
        L18:
            java.lang.Object r2 = r1.h
            kl0 r2 = (defpackage.kl0) r2
            java.lang.String r4 = "Collection is empty."
            if (r2 == 0) goto L9f
            qf1 r5 = r2.g
            ff1 r5 = r5.a
            java.lang.Object r1 = r1.i
            kl0 r1 = (defpackage.kl0) r1
            if (r1 == 0) goto L9b
            qf1 r1 = r1.g
            ff1 r1 = r1.a
            if (r5 != r1) goto L3e
            ff1 r6 = r7.i
            if (r6 != r1) goto L3e
        L34:
            r7.g = r3
            i93 r0 = r7.j
            ff1 r7 = r7.i
            r0.i(r7)
            return
        L3e:
            r7.g = r3
            ff1 r1 = r7.i
            if (r2 == 0) goto L97
            int r1 = r1.compareTo(r5)
            if (r1 >= 0) goto L64
            pi r1 = r7.c
            pf1 r2 = new pf1
            r2.<init>(r7)
            r1.getClass()
            java.lang.Object r1 = r1.i
            kl0 r1 = (defpackage.kl0) r1
        L58:
            if (r1 == 0) goto L64
            boolean r3 = r1.j
            if (r3 != 0) goto L61
            r2.h(r1)
        L61:
            kl0 r1 = r1.i
            goto L58
        L64:
            pi r1 = r7.c
            java.lang.Object r1 = r1.i
            kl0 r1 = (defpackage.kl0) r1
            boolean r2 = r7.g
            if (r2 != 0) goto Lc
            if (r1 == 0) goto Lc
            ff1 r2 = r7.i
            qf1 r1 = r1.g
            ff1 r1 = r1.a
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto Lc
            pi r1 = r7.c
            pf1 r2 = new pf1
            r3 = 1
            r2.<init>(r7)
            r1.getClass()
            java.lang.Object r1 = r1.h
            kl0 r1 = (defpackage.kl0) r1
        L8b:
            if (r1 == 0) goto Lc
            boolean r3 = r1.j
            if (r3 != 0) goto L94
            r2.h(r1)
        L94:
            kl0 r1 = r1.h
            goto L8b
        L97:
            defpackage.c.m(r4)
            return
        L9b:
            defpackage.c.m(r4)
            return
        L9f:
            defpackage.c.m(r4)
            return
        La3:
            java.lang.String r7 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            defpackage.c.q(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf1.g():void");
    }
}
