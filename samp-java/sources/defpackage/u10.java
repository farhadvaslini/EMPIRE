package defpackage;

import android.graphics.RenderEffect;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class u10 {
    public Object a;

    public u10(int i) {
        switch (i) {
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                this.a = new Object();
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                this.a = b32.w(Boolean.FALSE);
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public boolean a(int i, pv0 pv0Var, Object obj) {
        ArrayList arrayList = pv0Var.a;
        if (arrayList == null) {
            b(i, pv0Var, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof iv0)) {
                if (!(obj2 instanceof pv0)) {
                    c.h(obj2, "Unexpected child source info ");
                    break;
                }
                if (a(i, (pv0) obj2, obj)) {
                    b(0, pv0Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                b(0, pv0Var, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    public void b(int i, pv0 pv0Var, Object obj) {
        ((ArrayList) this.a).add(new v10(i, null, null));
    }

    public RenderEffect c() {
        RenderEffect renderEffect = (RenderEffect) this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectF = f();
        this.a = renderEffectF;
        return renderEffectF;
    }

    public abstract void d(lv2 lv2Var);

    public abstract void e();

    public abstract RenderEffect f();

    public abstract void g();

    public abstract Object h();

    public abstract Object i();

    public void j(int i, Object obj, pv0 pv0Var, Object obj2) {
        if (s51.n(obj, c20.a)) {
            b(i, pv0Var, null);
        }
    }

    public abstract ns0 k(lv2 lv2Var);

    public abstract void l(js jsVar);

    public abstract void m(Object obj);

    public abstract void n(gk3 gk3Var);

    public abstract void o();
}
