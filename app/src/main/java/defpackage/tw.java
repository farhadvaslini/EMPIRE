package defpackage;

import android.app.Application;
import java.io.File;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tw extends vc {
    public final nw c;
    public final uu d;
    public int e;
    public w83 f;
    public w83 g;
    public final i93 h;
    public final i93 i;
    public final i93 j;
    public final i93 k;
    public final i93 l;
    public final i93 m;
    public final i93 n;
    public final i93 o;
    public final i93 p;
    public final i93 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(Application application) {
        super(application);
        application.getClass();
        this.c = new nw(application);
        this.d = new uu(application, 0);
        i93 i93VarE = s51.e(ni0.f);
        this.h = i93VarE;
        this.i = i93VarE;
        Boolean bool = Boolean.FALSE;
        i93 i93VarE2 = s51.e(bool);
        this.j = i93VarE2;
        this.k = i93VarE2;
        i93 i93VarE3 = s51.e(zu.a);
        this.l = i93VarE3;
        this.m = i93VarE3;
        i93 i93VarE4 = s51.e(bool);
        this.n = i93VarE4;
        this.o = i93VarE4;
        i93 i93VarE5 = s51.e(gv.a);
        this.p = i93VarE5;
        this.q = i93VarE5;
        j();
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(tw twVar, vu vuVar, File file, q40 q40Var) {
        qw qwVar;
        twVar.getClass();
        if (q40Var instanceof qw) {
            qwVar = (qw) q40Var;
            int i = qwVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qwVar.k = i - Integer.MIN_VALUE;
            } else {
                qwVar = new qw(twVar, q40Var);
            }
        }
        Object objG = qwVar.i;
        int i2 = qwVar.k;
        if (i2 == 0) {
            y02.Q(objG);
            j90 j90Var = ac0.a;
            x80 x80Var = x80.h;
            l lVar = new l(vuVar, file, twVar, null, 10);
            qwVar.k = 1;
            objG = cl3.G(x80Var, lVar, qwVar);
            y50 y50Var = y50.f;
            if (objG == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objG);
        }
        return ((rn2) objG).f;
    }

    public static final void f(tw twVar, Object obj, vu vuVar) {
        Object fvVar;
        i93 i93Var = twVar.p;
        Throwable thA = rn2.a(obj);
        if (thA == null) {
            ((Number) obj).intValue();
            twVar.j();
            Application application = twVar.b;
            application.getClass();
            String string = application.getString(R.string.launcher_cleo_message_installed, vuVar.b);
            string.getClass();
            fvVar = new iv(string);
        } else {
            ti tiVar = ui.a;
            ui.c(ti.i, "CleoViewModel", "CLEO package installation failed", thA);
            fvVar = new fv(twVar.h(thA, R.string.launcher_cleo_error_install));
        }
        i93Var.getClass();
        i93Var.j(null, fvVar);
    }

    public final void g() {
        i93 i93Var = this.p;
        Object value = i93Var.getValue();
        hv hvVar = value instanceof hv ? (hv) value : null;
        if ((hvVar != null ? hvVar.a : null) == ev.g) {
            w83 w83Var = this.g;
            if (w83Var != null) {
                w83Var.c(null);
            }
            i93Var.j(null, gv.a);
        }
    }

    public final String h(Throwable th, int i) {
        dv dvVar;
        cv cvVar = th instanceof cv ? (cv) th : null;
        if (cvVar == null || (dvVar = cvVar.f) == null) {
            dvVar = dv.o;
        }
        switch (dvVar.ordinal()) {
            case 0:
                i = R.string.launcher_cleo_error_invalid_extension;
                break;
            case 1:
                i = R.string.launcher_cleo_error_cannot_read;
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                i = R.string.launcher_cleo_error_script_too_large;
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                i = R.string.launcher_cleo_error_package_too_large;
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                i = R.string.launcher_cleo_error_invalid_archive;
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                i = R.string.launcher_cleo_error_no_scripts;
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                i = R.string.launcher_cleo_error_unsafe_path;
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                i = R.string.launcher_cleo_error_file_conflict;
                break;
            case 8:
                i = R.string.launcher_cleo_error_invalid_kind;
                break;
            case vr.g /* 9 */:
                break;
            default:
                c.k();
                return null;
        }
        Application application = this.b;
        application.getClass();
        String string = application.getString(i);
        string.getClass();
        return string;
    }

    public final void i() {
        int i = this.e + 1;
        this.e = i;
        Boolean bool = Boolean.TRUE;
        i93 i93Var = this.n;
        i93Var.getClass();
        i93Var.j(null, bool);
        w83 w83Var = this.f;
        if (w83Var != null) {
            w83Var.c(null);
        }
        w83 w83VarT = cl3.t(f80.F(this), null, new wg2(this, i, null), 3);
        this.f = w83VarT;
        w83VarT.r(new ow(this, w83VarT, 0));
    }

    public final void j() {
        Boolean bool = Boolean.TRUE;
        i93 i93Var = this.j;
        i93Var.getClass();
        i93Var.j(null, bool);
        dx dxVarF = f80.F(this);
        j90 j90Var = ac0.a;
        cl3.t(dxVarF, x80.h, new pw(this, null), 2);
    }
}
