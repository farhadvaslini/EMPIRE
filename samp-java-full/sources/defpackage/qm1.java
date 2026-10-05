package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qm1 extends d0 {
    public final /* synthetic */ int f = 1;
    public final Object g;

    public qm1(List list) {
        list.getClass();
        this.g = list;
    }

    @Override // defpackage.t
    public final int a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((sm1) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.t, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                String strGroup = ((sm1) obj).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) obj).get(qx.k0(i, this));
        }
    }

    @Override // defpackage.d0, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.d0, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f) {
            case 1:
                return new yn2(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.d0, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.d0, java.util.List
    public ListIterator listIterator() {
        switch (this.f) {
            case 1:
                return new yn2(this, 0);
            default:
                return super.listIterator();
        }
    }

    public qm1(sm1 sm1Var) {
        this.g = sm1Var;
    }

    @Override // defpackage.d0, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f) {
            case 1:
                return new yn2(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
