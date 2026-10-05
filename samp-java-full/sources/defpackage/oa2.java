package defpackage;

import android.app.Application;
import java.util.Set;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class oa2 extends vc {
    public final y92 c;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa2(Application application) {
        super(application);
        application.getClass();
        y92 y92VarS = y92.i.s(application);
        this.c = y92VarS;
        this.d = new uu(application, 1);
        this.h = y92VarS.g;
        Boolean bool = Boolean.FALSE;
        i93 i93VarE = s51.e(bool);
        this.i = i93VarE;
        this.j = i93VarE;
        i93 i93VarE2 = s51.e(a82.a);
        this.k = i93VarE2;
        this.l = i93VarE2;
        i93 i93VarE3 = s51.e(bool);
        this.m = i93VarE3;
        this.n = i93VarE3;
        i93 i93VarE4 = s51.e(h92.a);
        this.o = i93VarE4;
        this.p = i93VarE4;
        g();
    }

    public static final void e(oa2 oa2Var, j82 j82Var) {
        Object g92Var;
        int i;
        Application application = oa2Var.b;
        i93 i93Var = oa2Var.o;
        if (j82Var instanceof i82) {
            application.getClass();
            String string = application.getString(R.string.plugins_message_installed, ((i82) j82Var).a.a.c);
            string.getClass();
            g92Var = new j92(string);
        } else {
            if (!(j82Var instanceof h82)) {
                c.k();
                return;
            }
            ti tiVar = ui.a;
            g82 g82Var = ((h82) j82Var).a;
            ui.c(ti.i, "PluginViewModel", "Plugin installation failed: " + g82Var, null);
            switch (g82Var.ordinal()) {
                case 0:
                    i = R.string.plugins_error_package_extension;
                    break;
                case 1:
                    i = R.string.plugins_error_cannot_read;
                    break;
                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                    i = R.string.plugins_error_download;
                    break;
                case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                    i = R.string.plugins_error_package_too_large;
                    break;
                case oc2.LONG_FIELD_NUMBER /* 4 */:
                    i = R.string.plugins_error_checksum;
                    break;
                case oc2.STRING_FIELD_NUMBER /* 5 */:
                    i = R.string.plugins_error_invalid_archive;
                    break;
                case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = R.string.plugins_error_missing_manifest;
                    break;
                case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                    i = R.string.plugins_error_invalid_manifest;
                    break;
                case 8:
                    i = R.string.plugins_error_incompatible_api;
                    break;
                case vr.g /* 9 */:
                    i = R.string.plugins_error_catalog_mismatch;
                    break;
                case vr.h /* 10 */:
                    i = R.string.plugins_error_missing_entry;
                    break;
                case 11:
                    i = R.string.plugins_error_downgrade;
                    break;
                case vr.i /* 12 */:
                    i = R.string.plugins_error_too_many;
                    break;
                case 13:
                    i = R.string.plugins_error_version_conflict;
                    break;
                case 14:
                    i = R.string.plugins_error_unsafe_package;
                    break;
                case jo3.g /* 15 */:
                    i = R.string.plugins_error_install;
                    break;
                default:
                    c.k();
                    return;
            }
            application.getClass();
            String string2 = application.getString(i);
            string2.getClass();
            g92Var = new g92(string2);
        }
        i93Var.getClass();
        i93Var.j(null, g92Var);
    }

    public final Set f(String str) {
        str.getClass();
        m92 m92VarH = this.c.h(str);
        Set set = m92VarH != null ? m92VarH.c : null;
        return set == null ? si0.f : set;
    }

    public final void g() {
        int i = this.e + 1;
        this.e = i;
        Boolean bool = Boolean.TRUE;
        i93 i93Var = this.m;
        i93Var.getClass();
        i93Var.j(null, bool);
        w83 w83Var = this.f;
        if (w83Var != null) {
            w83Var.c(null);
        }
        w83 w83VarT = cl3.t(f80.F(this), null, new ia1(this, i, null), 3);
        this.f = w83VarT;
        w83VarT.r(new ma2(this, w83VarT, 0));
    }
}
