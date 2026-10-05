package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b62 extends e0 {
    public final z52 h;
    public int i;
    public sk3 j;
    public int k;

    public b62(z52 z52Var, int i) {
        super(i, z52Var.m);
        this.h = z52Var;
        this.i = z52Var.f();
        this.k = -1;
        b();
    }

    public final void a() {
        if (this.i != this.h.f()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.e0, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.f;
        z52 z52Var = this.h;
        z52Var.add(i, obj);
        this.f++;
        this.g = z52Var.a();
        this.i = z52Var.f();
        this.k = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        z52 z52Var = this.h;
        Object[] objArr = z52Var.k;
        if (objArr == null) {
            this.j = null;
            return;
        }
        int i = (z52Var.m - 1) & (-32);
        int i2 = this.f;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (z52Var.i / 5) + 1;
        sk3 sk3Var = this.j;
        if (sk3Var == null) {
            this.j = new sk3(objArr, i2, i, i3);
            return;
        }
        sk3Var.f = i2;
        sk3Var.g = i;
        sk3Var.h = i3;
        if (sk3Var.i.length < i3) {
            sk3Var.i = new Object[i3];
        }
        sk3Var.i[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        sk3Var.j = r0;
        sk3Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            c.n();
            return null;
        }
        int i = this.f;
        this.k = i;
        sk3 sk3Var = this.j;
        z52 z52Var = this.h;
        if (sk3Var == null) {
            Object[] objArr = z52Var.l;
            this.f = i + 1;
            return objArr[i];
        }
        if (sk3Var.hasNext()) {
            this.f++;
            return sk3Var.next();
        }
        Object[] objArr2 = z52Var.l;
        int i2 = this.f;
        this.f = i2 + 1;
        return objArr2[i2 - sk3Var.g];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            c.n();
            return null;
        }
        int i = this.f;
        this.k = i - 1;
        sk3 sk3Var = this.j;
        z52 z52Var = this.h;
        if (sk3Var == null) {
            Object[] objArr = z52Var.l;
            int i2 = i - 1;
            this.f = i2;
            return objArr[i2];
        }
        int i3 = sk3Var.g;
        if (i <= i3) {
            this.f = i - 1;
            return sk3Var.previous();
        }
        Object[] objArr2 = z52Var.l;
        int i4 = i - 1;
        this.f = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.e0, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.k;
        if (i == -1) {
            throw new IllegalStateException();
        }
        z52 z52Var = this.h;
        z52Var.b(i);
        int i2 = this.k;
        if (i2 < this.f) {
            this.f = i2;
        }
        this.g = z52Var.a();
        this.i = z52Var.f();
        this.k = -1;
        b();
    }

    @Override // defpackage.e0, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.k;
        if (i == -1) {
            throw new IllegalStateException();
        }
        z52 z52Var = this.h;
        z52Var.set(i, obj);
        this.i = z52Var.f();
        b();
    }
}
