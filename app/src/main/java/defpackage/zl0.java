package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zl0 implements Iterator, t61 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;
    public Object i;
    public final /* synthetic */ nv2 j;

    public zl0(bm0 bm0Var) {
        this.f = 0;
        this.j = bm0Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.i = arrayDeque;
        File file = (File) bm0Var.b;
        if (file.isDirectory()) {
            arrayDeque.push(c(file));
        } else if (!file.isFile()) {
            this.g = 2;
        } else {
            file.getClass();
            arrayDeque.push(new xl0(file));
        }
    }

    public void a() {
        jm0 jm0Var = (jm0) this.j;
        Iterator it = (Iterator) this.h;
        while (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) jm0Var.c.h(next)).booleanValue() == jm0Var.b) {
                this.i = next;
                this.g = 1;
                return;
            }
        }
        this.g = 0;
    }

    public void b() {
        Iterator it = (Iterator) this.h;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((sc3) this.j).c.h(next)).booleanValue()) {
                this.g = 1;
                this.i = next;
                return;
            }
        }
        this.g = 0;
    }

    public vl0 c(File file) {
        int iOrdinal = ((cm0) ((bm0) this.j).c).ordinal();
        if (iOrdinal == 0) {
            file.getClass();
            return new yl0(file);
        }
        if (iOrdinal == 1) {
            file.getClass();
            return new wl0(file);
        }
        c.k();
        return null;
    }

    public boolean d() {
        File file;
        File fileA;
        this.g = 3;
        ArrayDeque arrayDeque = (ArrayDeque) this.i;
        while (true) {
            am0 am0Var = (am0) arrayDeque.peek();
            if (am0Var == null) {
                file = null;
                break;
            }
            fileA = am0Var.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(am0Var.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                }
                arrayDeque.push(c(fileA));
            }
        }
        file = fileA;
        if (file != null) {
            this.h = file;
            this.g = 1;
        } else {
            this.g = 2;
        }
        return this.g == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f) {
            case 0:
                int i = this.g;
                if (i == 0) {
                    return d();
                }
                if (i == 1) {
                    return true;
                }
                if (i != 2) {
                    c.p("hasNext called when the iterator is in the FAILED state.");
                }
                return false;
            case 1:
                if (this.g == -1) {
                    a();
                }
                return this.g == 1;
            default:
                if (this.g == -1) {
                    b();
                }
                return this.g == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                int i = this.g;
                if (i == 1) {
                    this.g = 0;
                } else if (i != 2 && d()) {
                    this.g = 0;
                } else {
                    c.n();
                }
                break;
            case 1:
                if (this.g == -1) {
                    a();
                }
                if (this.g == 0) {
                    c.n();
                } else {
                    Object obj = this.i;
                    this.i = null;
                    this.g = -1;
                }
                break;
            default:
                if (this.g == -1) {
                    b();
                }
                if (this.g == 0) {
                    c.n();
                } else {
                    Object obj2 = this.i;
                    this.i = null;
                    this.g = -1;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public zl0(jm0 jm0Var) {
        this.f = 1;
        this.j = jm0Var;
        this.h = jm0Var.a.iterator();
        this.g = -1;
    }

    public zl0(sc3 sc3Var) {
        this.f = 2;
        this.j = sc3Var;
        this.h = sc3Var.b.iterator();
        this.g = -1;
    }
}
