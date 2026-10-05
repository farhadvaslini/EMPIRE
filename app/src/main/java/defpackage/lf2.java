package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lf2 {
    public static final ec2 b = new ec2("commands_map");
    public final e70 a;

    public lf2(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = mf2.b.a(applicationContext, mf2.a[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, q40 q40Var) {
        df2 df2Var;
        mk2 mk2Var;
        if (q40Var instanceof df2) {
            df2Var = (df2) q40Var;
            int i = df2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                df2Var.l = i - Integer.MIN_VALUE;
            } else {
                df2Var = new df2(this, q40Var);
            }
        }
        Object obj = df2Var.j;
        int i2 = df2Var.l;
        if (i2 == 0) {
            y02.Q(obj);
            mk2 mk2Var2 = new mk2();
            vo voVar = new vo(str, mk2Var2, str2, str3, null, 1);
            df2Var.i = mk2Var2;
            df2Var.l = 1;
            Object objL = b32.l(this.a, voVar, df2Var);
            y50 y50Var = y50.f;
            if (objL == y50Var) {
                return y50Var;
            }
            mk2Var = mk2Var2;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mk2Var = df2Var.i;
            y02.Q(obj);
        }
        return Boolean.valueOf(mk2Var.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, int i, q40 q40Var) {
        gf2 gf2Var;
        if (q40Var instanceof gf2) {
            gf2Var = (gf2) q40Var;
            int i2 = gf2Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gf2Var.k = i2 - Integer.MIN_VALUE;
            } else {
                gf2Var = new gf2(this, q40Var);
            }
        }
        Object obj = gf2Var.i;
        int i3 = gf2Var.k;
        p40 p40Var = null;
        if (i3 == 0) {
            y02.Q(obj);
            hf2 hf2Var = new hf2(str, i, p40Var, 0);
            gf2Var.k = 1;
            Object objL = b32.l(this.a, hf2Var, gf2Var);
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
    public final Object c(String str, q40 q40Var) {
        if2 if2Var;
        if (q40Var instanceof if2) {
            if2Var = (if2) q40Var;
            int i = if2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                if2Var.k = i - Integer.MIN_VALUE;
            } else {
                if2Var = new if2(this, q40Var);
            }
        }
        Object obj = if2Var.i;
        int i2 = if2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            jf2 jf2Var = new jf2(str, p40Var, 0);
            if2Var.k = 1;
            Object objL = b32.l(this.a, jf2Var, if2Var);
            y50 y50Var = y50.f;
            if (objL == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
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
    public final Object d(String str, int i, String str2, String str3, q40 q40Var) {
        kf2 kf2Var;
        if (q40Var instanceof kf2) {
            kf2Var = (kf2) q40Var;
            int i2 = kf2Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kf2Var.k = i2 - Integer.MIN_VALUE;
            } else {
                kf2Var = new kf2(this, q40Var);
            }
        }
        Object obj = kf2Var.i;
        int i3 = kf2Var.k;
        if (i3 == 0) {
            y02.Q(obj);
            n9 n9Var = new n9(str, i, str2, str3, (p40) null);
            kf2Var.k = 1;
            Object objL = b32.l(this.a, n9Var, kf2Var);
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
}
