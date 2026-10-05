package defpackage;

import android.R;
import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class nh3 {
    public static final fy a = hy.c(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 65535);
    public static final fy b = hy.f(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 65535);

    public static final void a(Boolean bool, boolean z, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        boolean zBooleanValue;
        fy fyVarF;
        int i3;
        nv0Var.b0(-1500029873);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.g(z) ? 32 : 16;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) nv0Var.j(x7.b);
            if (bool == null) {
                nv0Var.a0(1580309700);
                zBooleanValue = pq.J(nv0Var);
                nv0Var.p(false);
            } else {
                nv0Var.a0(1580309297);
                nv0Var.p(false);
                zBooleanValue = bool.booleanValue();
            }
            if (!z || (i3 = Build.VERSION.SDK_INT) < 31) {
                fyVarF = zBooleanValue ? a : b;
            } else if (zBooleanValue) {
                if (i3 >= 34) {
                    fyVarF = hy.c(lq.B(context, R.color.system_primary_dark), lq.B(context, R.color.system_on_primary_dark), lq.B(context, R.color.system_primary_container_dark), lq.B(context, R.color.system_on_primary_container_dark), lq.B(context, R.color.system_primary_light), lq.B(context, R.color.system_secondary_dark), lq.B(context, R.color.system_on_secondary_dark), lq.B(context, R.color.system_secondary_container_dark), lq.B(context, R.color.system_on_secondary_container_dark), lq.B(context, R.color.system_tertiary_dark), lq.B(context, R.color.system_on_tertiary_dark), lq.B(context, R.color.system_tertiary_container_dark), lq.B(context, R.color.system_on_tertiary_container_dark), lq.B(context, R.color.system_background_dark), lq.B(context, R.color.system_on_background_dark), lq.B(context, R.color.system_surface_dark), lq.B(context, R.color.system_on_surface_dark), lq.B(context, R.color.system_surface_variant_dark), lq.B(context, R.color.system_on_surface_variant_dark), lq.B(context, R.color.system_primary_dark), lq.B(context, R.color.system_surface_light), lq.B(context, R.color.system_on_surface_light), lq.B(context, R.color.system_outline_dark), lq.B(context, R.color.system_outline_variant_dark), 0L, lq.B(context, R.color.system_surface_bright_dark), lq.B(context, R.color.system_surface_container_dark), lq.B(context, R.color.system_surface_container_high_dark), lq.B(context, R.color.system_surface_container_highest_dark), lq.B(context, R.color.system_surface_container_low_dark), lq.B(context, R.color.system_surface_container_lowest_dark), lq.B(context, R.color.system_surface_dim_dark), lq.B(context, R.color.system_primary_fixed), lq.B(context, R.color.system_primary_fixed_dim), lq.B(context, R.color.system_on_primary_fixed), lq.B(context, R.color.system_on_primary_fixed_variant), lq.B(context, R.color.system_secondary_fixed), lq.B(context, R.color.system_secondary_fixed_dim), lq.B(context, R.color.system_on_secondary_fixed), lq.B(context, R.color.system_on_secondary_fixed_variant), lq.B(context, R.color.system_tertiary_fixed), lq.B(context, R.color.system_tertiary_fixed_dim), lq.B(context, R.color.system_on_tertiary_fixed), lq.B(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                } else {
                    ni3 ni3VarQ = lq.q(context);
                    long j = ni3VarQ.x;
                    long j2 = ni3VarQ.A;
                    long j3 = ni3VarQ.z;
                    long j4 = ni3VarQ.w;
                    long j5 = ni3VarQ.y;
                    long j6 = ni3VarQ.E;
                    long j7 = ni3VarQ.H;
                    long j8 = ni3VarQ.G;
                    long j9 = ni3VarQ.D;
                    long j10 = ni3VarQ.L;
                    long j11 = ni3VarQ.O;
                    long j12 = ni3VarQ.N;
                    long j13 = ni3VarQ.K;
                    long j14 = ni3VarQ.s;
                    long j15 = ni3VarQ.g;
                    long j16 = ni3VarQ.l;
                    fyVarF = hy.c(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, ni3VarQ.i, j, j15, ni3VarQ.o, ni3VarQ.j, j16, ni3VarQ.u, ni3VarQ.m, ni3VarQ.q, ni3VarQ.p, ni3VarQ.n, ni3VarQ.r, ni3VarQ.t, j14, j4, j, ni3VarQ.B, j3, j9, j6, ni3VarQ.I, j8, j13, j10, ni3VarQ.P, j12, 62914560, 0);
                }
            } else if (i3 >= 34) {
                fyVarF = hy.f(lq.B(context, R.color.system_primary_light), lq.B(context, R.color.system_on_primary_light), lq.B(context, R.color.system_primary_container_light), lq.B(context, R.color.system_on_primary_container_light), lq.B(context, R.color.system_primary_dark), lq.B(context, R.color.system_secondary_light), lq.B(context, R.color.system_on_secondary_light), lq.B(context, R.color.system_secondary_container_light), lq.B(context, R.color.system_on_secondary_container_light), lq.B(context, R.color.system_tertiary_light), lq.B(context, R.color.system_on_tertiary_light), lq.B(context, R.color.system_tertiary_container_light), lq.B(context, R.color.system_on_tertiary_container_light), lq.B(context, R.color.system_background_light), lq.B(context, R.color.system_on_background_light), lq.B(context, R.color.system_surface_light), lq.B(context, R.color.system_on_surface_light), lq.B(context, R.color.system_surface_variant_light), lq.B(context, R.color.system_on_surface_variant_light), lq.B(context, R.color.system_primary_light), lq.B(context, R.color.system_surface_dark), lq.B(context, R.color.system_on_surface_dark), lq.B(context, R.color.system_outline_light), lq.B(context, R.color.system_outline_variant_light), 0L, lq.B(context, R.color.system_surface_bright_light), lq.B(context, R.color.system_surface_container_light), lq.B(context, R.color.system_surface_container_high_light), lq.B(context, R.color.system_surface_container_highest_light), lq.B(context, R.color.system_surface_container_low_light), lq.B(context, R.color.system_surface_container_lowest_light), lq.B(context, R.color.system_surface_dim_light), lq.B(context, R.color.system_primary_fixed), lq.B(context, R.color.system_primary_fixed_dim), lq.B(context, R.color.system_on_primary_fixed), lq.B(context, R.color.system_on_primary_fixed_variant), lq.B(context, R.color.system_secondary_fixed), lq.B(context, R.color.system_secondary_fixed_dim), lq.B(context, R.color.system_on_secondary_fixed), lq.B(context, R.color.system_on_secondary_fixed_variant), lq.B(context, R.color.system_tertiary_fixed), lq.B(context, R.color.system_tertiary_fixed_dim), lq.B(context, R.color.system_on_tertiary_fixed), lq.B(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
            } else {
                ni3 ni3VarQ2 = lq.q(context);
                long j17 = ni3VarQ2.y;
                long j18 = ni3VarQ2.v;
                long j19 = ni3VarQ2.w;
                long j20 = ni3VarQ2.B;
                long j21 = ni3VarQ2.x;
                long j22 = ni3VarQ2.F;
                long j23 = ni3VarQ2.C;
                long j24 = ni3VarQ2.D;
                long j25 = ni3VarQ2.I;
                long j26 = ni3VarQ2.M;
                long j27 = ni3VarQ2.J;
                long j28 = ni3VarQ2.K;
                long j29 = ni3VarQ2.P;
                long j30 = ni3VarQ2.b;
                long j31 = ni3VarQ2.r;
                long j32 = ni3VarQ2.g;
                fyVarF = hy.f(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j30, j31, j32, ni3VarQ2.l, j17, ni3VarQ2.o, ni3VarQ2.d, ni3VarQ2.k, ni3VarQ2.i, ni3VarQ2.u, j30, ni3VarQ2.e, ni3VarQ2.f, j32, ni3VarQ2.c, ni3VarQ2.a, ni3VarQ2.h, j19, j21, j20, ni3VarQ2.z, j24, ni3VarQ2.E, j25, ni3VarQ2.G, j28, ni3VarQ2.L, j29, ni3VarQ2.N, 62914560, 0);
            }
            um1.b(fyVarF, null, null, d00Var, nv0Var, 3072);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new lb(bool, z, d00Var, i);
        }
    }
}
