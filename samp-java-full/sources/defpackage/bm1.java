package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class bm1 {
    public int f;
    public int g;
    public int h;
    public Object i;

    public bm1() {
        if (ak2.g == null) {
            ak2.g = new ak2(22);
        }
    }

    public int a(int i) {
        if (i < this.h) {
            return ((ByteBuffer) this.i).getShort(this.g + i);
        }
        return 0;
    }

    public void b() {
        if (((cm1) this.i).m != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f;
            cm1 cm1Var = (cm1) this.i;
            if (i >= cm1Var.k || cm1Var.h[i] >= 0) {
                return;
            } else {
                this.f = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.g) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.g) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f);
            if (!((Class) this.i).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = mq3.d(view);
            b1 b1Var = accessibilityDelegateD != null ? accessibilityDelegateD instanceof a1 ? ((a1) accessibilityDelegateD).a : new b1(accessibilityDelegateD) : null;
            if (b1Var == null) {
                b1Var = new b1();
            }
            mq3.i(view, b1Var);
            view.setTag(this.f, obj);
            mq3.f(view, this.h);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f < ((cm1) this.i).k;
    }

    public void remove() {
        cm1 cm1Var = (cm1) this.i;
        b();
        if (this.g == -1) {
            c.q("Call next() before removing element from the iterator.");
            return;
        }
        cm1Var.b();
        cm1Var.j(this.g);
        this.g = -1;
        this.h = cm1Var.m;
    }
}
