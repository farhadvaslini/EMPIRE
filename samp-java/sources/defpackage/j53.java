package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class j53 implements i20, Iterable, t61 {
    public int g;
    public int i;
    public int j;
    public boolean l;
    public int m;
    public HashMap o;
    public or1 p;
    public int[] f = new int[0];
    public Object[] h = new Object[0];
    public final Object k = new Object();
    public ArrayList n = new ArrayList();

    public final int a(iv0 iv0Var) {
        if (this.l) {
            e20.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!iv0Var.a()) {
            yb2.a("Anchor refers to a group that was removed");
        }
        return iv0Var.a;
    }

    public final void b() {
        this.o = new HashMap();
    }

    public final i53 c() {
        if (this.l) {
            c.q("Cannot read while a writer is pending");
            return null;
        }
        this.j++;
        return new i53(this);
    }

    public final m53 e() {
        if (this.l) {
            e20.a("Cannot start a writer when another writer is pending");
        }
        if (this.j > 0) {
            e20.a("Cannot start a writer when a reader is pending");
        }
        this.l = true;
        this.m++;
        return new m53(this);
    }

    public final boolean f(iv0 iv0Var) {
        int iE;
        return iv0Var.a() && (iE = l53.e(this.n, iv0Var.a, this.g)) >= 0 && s51.n(this.n.get(iE), iv0Var);
    }

    public final pv0 g(int i) {
        int i2;
        ArrayList arrayList;
        int iE;
        HashMap map = this.o;
        if (map != null) {
            if (this.l) {
                e20.a("use active SlotWriter to crate an anchor for location instead");
            }
            iv0 iv0Var = (i < 0 || i >= (i2 = this.g) || (iE = l53.e((arrayList = this.n), i, i2)) < 0) ? null : (iv0) arrayList.get(iE);
            if (iv0Var != null) {
                return (pv0) map.get(iv0Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dx0(this, 0, this.g);
    }
}
