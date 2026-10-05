package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class oj implements Iterator, t61 {
    public int f;
    public int g;
    public boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oj(sj sjVar, int i) {
        this(sjVar.h);
        this.i = i;
        switch (i) {
            case 1:
                this.j = sjVar;
                this(sjVar.h);
                break;
            default:
                this.j = sjVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            c.n();
            return null;
        }
        int i = this.g;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                objE = ((sj) obj).e(i);
                break;
            case 1:
                objE = ((sj) obj).h(i);
                break;
            default:
                objE = ((tj) obj).g[i];
                break;
        }
        this.g++;
        this.h = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            c.q("Call next() before removing an element.");
            return;
        }
        int i = this.g - 1;
        this.g = i;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                ((sj) obj).f(i);
                break;
            case 1:
                ((sj) obj).f(i);
                break;
            default:
                ((tj) obj).a(i);
                break;
        }
        this.f--;
        this.h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oj(tj tjVar) {
        this(tjVar.h);
        this.i = 2;
        this.j = tjVar;
    }

    public oj(int i) {
        this.f = i;
    }
}
