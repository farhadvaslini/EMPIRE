package defpackage;

import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final void g() {
        Object obj = this.d.a.get();
        if (obj == null) {
            c.q("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final of1 of1Var = (of1) obj;
        while (true) {
            pi piVar = this.c;
            final int i = 0;
            if (((is1) piVar.g).e == 0) {
                break;
            }
            kl0 kl0Var = (kl0) piVar.h;
            if (kl0Var == null) {
                c.m("Collection is empty.");
                return;
            }
            ff1 ff1Var = kl0Var.g.a;
            kl0 kl0Var2 = (kl0) piVar.i;
            if (kl0Var2 == null) {
                c.m("Collection is empty.");
                return;
            }
            ff1 ff1Var2 = kl0Var2.g.a;
            if (ff1Var == ff1Var2 && this.i == ff1Var2) {
                break;
            }
            this.g = false;
            ff1 ff1Var3 = this.i;
            if (kl0Var == null) {
                c.m("Collection is empty.");
                return;
            }
            if (ff1Var3.compareTo(ff1Var) < 0) {
                pi piVar2 = this.c;
                ns0 ns0Var = new ns0(this) { // from class: pf1
                    public final /* synthetic */ rf1 g;

                    {
                        this.g = this;
                    }

                    @Override // defpackage.ns0
                    public final Object h(Object obj2) {
                        int i2 = i;
                        dm3 dm3Var = dm3.a;
                        of1 of1Var2 = of1Var;
                        rf1 rf1Var = this.g;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                nf1 nf1Var = (nf1) entry.getKey();
                                qf1 qf1Var = (qf1) entry.getValue();
                                while (true) {
                                    ff1 ff1Var4 = qf1Var.a;
                                    ff1 ff1Var5 = rf1Var.i;
                                    ArrayList arrayList = rf1Var.h;
                                    if (ff1Var4.compareTo(ff1Var5) > 0 && !rf1Var.g) {
                                        pi piVar3 = rf1Var.c;
                                        piVar3.getClass();
                                        nf1Var.getClass();
                                        if (((is1) piVar3.g).c(nf1Var)) {
                                            cf1 cf1Var = ef1.Companion;
                                            ff1 ff1Var6 = qf1Var.a;
                                            cf1Var.getClass();
                                            ef1 ef1VarA = cf1.a(ff1Var6);
                                            if (ef1VarA == null) {
                                                qn1.g(qf1Var.a, "no event down from ");
                                            } else {
                                                arrayList.add(ef1VarA.a());
                                                qf1Var.a(of1Var2, ef1VarA);
                                                vx.j0(arrayList);
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                nf1 nf1Var2 = (nf1) entry.getKey();
                                qf1 qf1Var2 = (qf1) entry.getValue();
                                while (true) {
                                    ff1 ff1Var7 = qf1Var2.a;
                                    ff1 ff1Var8 = rf1Var.i;
                                    ArrayList arrayList2 = rf1Var.h;
                                    if (ff1Var7.compareTo(ff1Var8) < 0 && !rf1Var.g) {
                                        pi piVar4 = rf1Var.c;
                                        piVar4.getClass();
                                        nf1Var2.getClass();
                                        if (((is1) piVar4.g).c(nf1Var2)) {
                                            arrayList2.add(qf1Var2.a);
                                            cf1 cf1Var2 = ef1.Companion;
                                            ff1 ff1Var9 = qf1Var2.a;
                                            cf1Var2.getClass();
                                            ff1Var9.getClass();
                                            int iOrdinal = ff1Var9.ordinal();
                                            ef1 ef1Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : ef1.ON_RESUME : ef1.ON_START : ef1.ON_CREATE;
                                            if (ef1Var == null) {
                                                qn1.g(qf1Var2.a, "no event up from ");
                                            } else {
                                                qf1Var2.a(of1Var2, ef1Var);
                                                vx.j0(arrayList2);
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                piVar2.getClass();
                for (kl0 kl0Var3 = (kl0) piVar2.i; kl0Var3 != null; kl0Var3 = kl0Var3.i) {
                    if (!kl0Var3.j) {
                        ns0Var.h(kl0Var3);
                    }
                }
            }
            kl0 kl0Var4 = (kl0) this.c.i;
            if (!this.g && kl0Var4 != null && this.i.compareTo(kl0Var4.g.a) > 0) {
                pi piVar3 = this.c;
                final int i2 = 1;
                ns0 ns0Var2 = new ns0(this) { // from class: pf1
                    public final /* synthetic */ rf1 g;

                    {
                        this.g = this;
                    }

                    @Override // defpackage.ns0
                    public final Object h(Object obj2) {
                        int i22 = i2;
                        dm3 dm3Var = dm3.a;
                        of1 of1Var2 = of1Var;
                        rf1 rf1Var = this.g;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i22) {
                            case 0:
                                entry.getClass();
                                nf1 nf1Var = (nf1) entry.getKey();
                                qf1 qf1Var = (qf1) entry.getValue();
                                while (true) {
                                    ff1 ff1Var4 = qf1Var.a;
                                    ff1 ff1Var5 = rf1Var.i;
                                    ArrayList arrayList = rf1Var.h;
                                    if (ff1Var4.compareTo(ff1Var5) > 0 && !rf1Var.g) {
                                        pi piVar32 = rf1Var.c;
                                        piVar32.getClass();
                                        nf1Var.getClass();
                                        if (((is1) piVar32.g).c(nf1Var)) {
                                            cf1 cf1Var = ef1.Companion;
                                            ff1 ff1Var6 = qf1Var.a;
                                            cf1Var.getClass();
                                            ef1 ef1VarA = cf1.a(ff1Var6);
                                            if (ef1VarA == null) {
                                                qn1.g(qf1Var.a, "no event down from ");
                                            } else {
                                                arrayList.add(ef1VarA.a());
                                                qf1Var.a(of1Var2, ef1VarA);
                                                vx.j0(arrayList);
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                nf1 nf1Var2 = (nf1) entry.getKey();
                                qf1 qf1Var2 = (qf1) entry.getValue();
                                while (true) {
                                    ff1 ff1Var7 = qf1Var2.a;
                                    ff1 ff1Var8 = rf1Var.i;
                                    ArrayList arrayList2 = rf1Var.h;
                                    if (ff1Var7.compareTo(ff1Var8) < 0 && !rf1Var.g) {
                                        pi piVar4 = rf1Var.c;
                                        piVar4.getClass();
                                        nf1Var2.getClass();
                                        if (((is1) piVar4.g).c(nf1Var2)) {
                                            arrayList2.add(qf1Var2.a);
                                            cf1 cf1Var2 = ef1.Companion;
                                            ff1 ff1Var9 = qf1Var2.a;
                                            cf1Var2.getClass();
                                            ff1Var9.getClass();
                                            int iOrdinal = ff1Var9.ordinal();
                                            ef1 ef1Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : ef1.ON_RESUME : ef1.ON_START : ef1.ON_CREATE;
                                            if (ef1Var == null) {
                                                qn1.g(qf1Var2.a, "no event up from ");
                                            } else {
                                                qf1Var2.a(of1Var2, ef1Var);
                                                vx.j0(arrayList2);
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                piVar3.getClass();
                for (kl0 kl0Var5 = (kl0) piVar3.h; kl0Var5 != null; kl0Var5 = kl0Var5.h) {
                    if (!kl0Var5.j) {
                        ns0Var2.h(kl0Var5);
                    }
                }
            }
        }
    }
}
