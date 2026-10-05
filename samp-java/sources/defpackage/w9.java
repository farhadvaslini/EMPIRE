package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w9 implements zq {
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public w9(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            jo3.q("nav-entry-state:id");
            throw null;
        }
        this.b = string;
        this.a = g12.K("nav-entry-state:destination-id", bundle);
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            jo3.q("nav-entry-state:args");
            throw null;
        }
        this.c = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 != null) {
            this.d = bundle3;
        } else {
            jo3.q("nav-entry-state:saved-state");
            throw null;
        }
    }

    @Override // defpackage.zq
    public void a(ij2 ij2Var, ln2 ln2Var) {
        Object qn2Var;
        ll2 ll2Var = (ll2) this.c;
        int i = this.a;
        int i2 = ln2Var.i;
        jr jrVar = (jr) this.b;
        if (!(jrVar.r() instanceof qx1)) {
            ln2Var.close();
            return;
        }
        String strB = ln2.b(ln2Var, "Location");
        if (tu.c.contains(Integer.valueOf(i2)) && strB != null) {
            ln2Var.close();
            if (i >= 5) {
                tu.c(jrVar, new IllegalArgumentException("Too many catalog redirects"));
                return;
            }
            i01 i01VarH = ll2Var.a.h(strB);
            if (i01VarH == null || !i01VarH.f()) {
                tu.c(jrVar, new IllegalArgumentException("Invalid HTTPS catalog redirect URL"));
                return;
            }
            AtomicReference atomicReference = (AtomicReference) this.d;
            pl plVarA = ll2Var.a();
            plVarA.g = i01VarH;
            plVarA.s();
            tu.a(i + 1, jrVar, new ll2(plVarA), atomicReference);
            return;
        }
        try {
            try {
            } finally {
            }
        } catch (Exception e) {
            qn2Var = new qn2(e);
        }
        if (!ln2Var.u) {
            throw new IllegalStateException(("HTTP " + i2).toString());
        }
        tu tuVar = tu.a;
        nn2 nn2Var = ln2Var.l;
        String strM = null;
        if (nn2Var.b() <= 262144) {
            rp rpVarF = nn2Var.f();
            hp hpVar = new hp();
            long j = 0;
            while (j <= 262144) {
                long jD = rpVarF.d(Math.min(8192L, 262145 - j), hpVar);
                if (jD == -1) {
                    break;
                } else {
                    j += jD;
                }
            }
            if (j <= 262144) {
                strM = hpVar.m();
            } else {
                c.q("Catalog response is too large");
            }
        } else {
            c.q("Catalog response is too large");
        }
        qn2Var = new xu(wu.b(strM), strM);
        ln2Var.close();
        if (jrVar.r() instanceof qx1) {
            jrVar.t(new rn2(qn2Var));
        }
    }

    @Override // defpackage.zq
    public void b(ij2 ij2Var, IOException iOException) {
        tu.c((jr) this.b, iOException);
    }

    public long c() {
        Paint paint = (Paint) this.b;
        return Build.VERSION.SDK_INT >= 29 ? uu3.a.a(paint) : vp.b(paint.getColor());
    }

    public int d() {
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        int i = strokeCap == null ? -1 : x9.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int e() {
        Paint.Join strokeJoin = ((Paint) this.b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : x9.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void f(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void g(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            uu3.a.b(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(r51.D(i)));
        }
    }

    public void h(long j) {
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            uu3.a.c(paint, j);
        } else {
            paint.setColor(vp.T(j));
        }
    }

    public void i(yx yxVar) {
        this.d = yxVar;
        ((Paint) this.b).setColorFilter(yxVar != null ? yxVar.a : null);
    }

    public void j(int i) {
        ((Paint) this.b).setFilterBitmap(!(i == 0));
    }

    public void k(ea eaVar) {
        ((Paint) this.b).setPathEffect(null);
    }

    public void l(Shader shader) {
        this.c = shader;
        ((Paint) this.b).setShader(shader);
    }

    public void m(int i) {
        ((Paint) this.b).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void n(int i) {
        ((Paint) this.b).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void o(float f) {
        ((Paint) this.b).setStrokeWidth(f);
    }

    public void p(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public w9(qt1 qt1Var, int i) {
        this.b = qt1Var.k;
        this.a = i;
        st1 st1Var = qt1Var.m;
        this.c = st1Var.a();
        Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
        this.d = bundleU;
        st1Var.h.b(bundleU);
    }

    public w9(int i, jr jrVar, ll2 ll2Var, AtomicReference atomicReference) {
        this.b = jrVar;
        this.a = i;
        this.c = ll2Var;
        this.d = atomicReference;
    }

    public w9(Paint paint) {
        this.b = paint;
        this.a = 3;
    }
}
