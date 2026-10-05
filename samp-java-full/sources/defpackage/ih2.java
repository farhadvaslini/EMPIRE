package defpackage;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ih2 implements e70 {
    public static final ec2 b = new ec2("instances");
    public final e70 a;

    public ih2(Application application) {
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        this.a = jh2.b.a(applicationContext, jh2.a[0]);
    }

    @Override // defpackage.e70
    public Object a(rs0 rs0Var, q40 q40Var) {
        return this.a.a(new cc2(rs0Var, null, 0), q40Var);
    }

    @Override // defpackage.e70
    public fn0 b() {
        return this.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(String str, int i, String str2, xy2 xy2Var, String str3, q40 q40Var) {
        eh2 eh2Var;
        if (q40Var instanceof eh2) {
            eh2Var = (eh2) q40Var;
            int i2 = eh2Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eh2Var.k = i2 - Integer.MIN_VALUE;
            } else {
                eh2Var = new eh2(this, q40Var);
            }
        }
        Object obj = eh2Var.i;
        int i3 = eh2Var.k;
        if (i3 == 0) {
            y02.Q(obj);
            m9 m9Var = new m9(str, i, str2, xy2Var, str3, (p40) null);
            eh2Var.k = 1;
            Object objL = b32.l(this.a, m9Var, eh2Var);
            y50 y50Var = y50.f;
            if (objL == y50Var) {
                return y50Var;
            }
        } else {
            if (i3 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(String str, int i, q40 q40Var) {
        hh2 hh2Var;
        if (q40Var instanceof hh2) {
            hh2Var = (hh2) q40Var;
            int i2 = hh2Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hh2Var.k = i2 - Integer.MIN_VALUE;
            } else {
                hh2Var = new hh2(this, q40Var);
            }
        }
        Object obj = hh2Var.i;
        int i3 = hh2Var.k;
        p40 p40Var = null;
        int i4 = 1;
        if (i3 == 0) {
            y02.Q(obj);
            hf2 hf2Var = new hf2(str, i, p40Var, i4);
            hh2Var.k = 1;
            Object objL = b32.l(this.a, hf2Var, hh2Var);
            y50 y50Var = y50.f;
            if (objL == y50Var) {
                return y50Var;
            }
        } else {
            if (i3 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }

    public ih2(e70 e70Var) {
        this.a = e70Var;
    }
}
