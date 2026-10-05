package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yv0 implements Iterator, t61 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;
    public final Object i;

    public yv0(ls1 ls1Var) {
        this.f = 2;
        this.i = ls1Var;
        this.g = -1;
        this.h = b32.u(new ks1(ls1Var, this, null));
    }

    public void a() {
        Object objH;
        int i = this.g;
        bm0 bm0Var = (bm0) this.i;
        if (i == -2) {
            objH = ((cs0) bm0Var.b).a();
        } else {
            ns0 ns0Var = (ns0) bm0Var.c;
            Object obj = this.h;
            obj.getClass();
            objH = ns0Var.h(obj);
        }
        this.h = objH;
        this.g = objH == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        Object obj = this.i;
        switch (i) {
            case 0:
                if (this.g < 0) {
                    a();
                }
                if (this.g == 1) {
                }
                break;
            case 1:
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                if (this.g < ((Map) obj).size()) {
                }
                break;
            default:
                oa3 oa3Var = (oa3) obj;
                Iterator it = (Iterator) this.h;
                while (this.g < oa3Var.b && it.hasNext()) {
                    it.next();
                    this.g++;
                }
                if (this.g < oa3Var.c && it.hasNext()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        Object obj = this.i;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (this.g < 0) {
                    a();
                }
                if (this.g == 0) {
                    c.n();
                    return null;
                }
                Object obj3 = this.h;
                obj3.getClass();
                this.g = -1;
                return obj3;
            case 1:
                return ((ov2) this.h).next();
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((ov2) this.h).next();
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                if (hasNext()) {
                    obj2 = this.h;
                    this.g++;
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj4 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                    this.h = ((qg1) obj4).b;
                } else {
                    c.n();
                }
                return obj2;
            default:
                oa3 oa3Var = (oa3) obj;
                Iterator it = (Iterator) this.h;
                while (this.g < oa3Var.b && it.hasNext()) {
                    it.next();
                    this.g++;
                }
                int i2 = this.g;
                if (i2 < oa3Var.c) {
                    this.g = i2 + 1;
                    return it.next();
                }
                c.n();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f;
        Object obj = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.g;
                if (i2 != -1) {
                    ((ds1) obj).g.h(i2);
                    this.g = -1;
                    return;
                }
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                int i3 = this.g;
                if (i3 != -1) {
                    ((ls1) obj).g.m(i3);
                    this.g = -1;
                    return;
                }
                return;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public yv0(oa3 oa3Var) {
        this.f = 4;
        this.i = oa3Var;
        this.h = oa3Var.a.iterator();
    }

    public yv0(bm0 bm0Var) {
        this.f = 0;
        this.i = bm0Var;
        this.g = -2;
    }

    public yv0(Object obj, Map map) {
        this.f = 3;
        this.h = obj;
        this.i = map;
    }

    public yv0(ds1 ds1Var) {
        this.f = 1;
        this.i = ds1Var;
        this.g = -1;
        this.h = b32.u(new cs1(ds1Var, this, null));
    }
}
