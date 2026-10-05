package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class d1 {
    public Object a;
    public Object b;

    public d1(vp vpVar) {
        this.a = new tk(0, this);
        this.b = new sk(this, vpVar);
    }

    public void c() {
        sg sgVar = (sg) this.a;
        if (sgVar != null) {
            try {
                ((vg) this.b).p.unregisterReceiver(sgVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i);

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof cb3)) {
            return menuItem;
        }
        cb3 cb3Var = (cb3) menuItem;
        if (((w33) this.b) == null) {
            this.b = new w33(0);
        }
        MenuItem menuItem2 = (MenuItem) ((w33) this.b).get(cb3Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        ao1 ao1Var = new ao1((Context) this.a, cb3Var);
        ((w33) this.b).put(cb3Var, ao1Var);
        return ao1Var;
    }

    public int[] h(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String i() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        s51.F("text");
        throw null;
    }

    public boolean j() {
        return ((tk) this.a).b && ((sk) this.b).b;
    }

    public abstract void l();

    public abstract void o();

    public abstract int[] p(int i);

    public void q() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((sg) this.a) == null) {
            this.a = new sg(this);
        }
        ((vg) this.b).p.registerReceiver((sg) this.a, intentFilterD);
    }

    public d1(Context context) {
        this.a = context;
    }

    public d1() {
        this.b = new int[2];
    }

    public d1(vg vgVar) {
        this.b = vgVar;
    }

    public void k() {
    }

    public void n() {
    }

    public void m(rk rkVar) {
    }
}
