package defpackage;

import android.app.Application;
import android.content.Intent;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sa1 extends vc {
    public final i93 A;
    public final i93 B;
    public final i93 C;
    public final i93 D;
    public final i93 E;
    public final i93 F;
    public final i93 G;
    public final i93 H;
    public final i93 I;
    public final LinkedHashSet J;
    public final iv2 K;
    public boolean L;
    public w83 M;
    public w83 N;
    public final i93 O;
    public final i93 P;
    public final i93 Q;
    public final i93 R;
    public final i93 S;
    public final i93 T;
    public final i93 U;
    public final i93 V;
    public final i93 W;
    public final i93 X;
    public final i93 Y;
    public final i93 Z;
    public final i93 a0;
    public final i93 b0;
    public final qy2 c;
    public final i93 c0;
    public final on0 d;
    public final i93 d0;
    public final a31 e;
    public final i93 e0;
    public final lf2 f;
    public final i93 f0;
    public final y92 g;
    public final i93 g0;
    public final ja2 h;
    public final i93 h0;
    public final i93 i;
    public final cj2 i0;
    public final ak2 j;
    public final cj2 j0;
    public final i93 k;
    public final i93 k0;
    public final i93 l;
    public final cj2 l0;
    public final i93 m;
    public final i93 n;
    public final i93 o;
    public final i93 p;
    public final i93 q;
    public final i93 r;
    public final i93 s;
    public final i93 t;
    public final i93 u;
    public final i93 v;
    public final i93 w;
    public final i93 x;
    public final i93 y;
    public final i93 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sa1(Application application) {
        super(application);
        application.getClass();
        qy2 qy2Var = new qy2(application);
        this.c = qy2Var;
        int i = 3;
        on0 on0Var = new on0(qy2Var.d, new pa1(i, null, 1), 1);
        this.d = on0Var;
        pa1 pa1Var = new pa1(i, null == true ? 1 : 0, 0);
        fn0 fn0Var = qy2Var.u;
        on0 on0Var2 = new on0(fn0Var, pa1Var, 1);
        this.e = new a31(application, 27);
        this.f = new lf2(application);
        this.g = y92.i.s(application);
        this.h = new ja2(application);
        i93 i93VarE = s51.e(null);
        this.i = i93VarE;
        this.j = new ak2(2);
        oi0 oi0Var = oi0.f;
        i93 i93VarE2 = s51.e(oi0Var);
        this.k = i93VarE2;
        ni0 ni0Var = ni0.f;
        i93 i93VarE3 = s51.e(ni0Var);
        this.l = i93VarE3;
        i93 i93VarE4 = s51.e(rj2.f);
        this.m = i93VarE4;
        Boolean bool = Boolean.FALSE;
        i93 i93VarE5 = s51.e(bool);
        this.n = i93VarE5;
        i93 i93VarE6 = s51.e(new g4(15));
        this.o = i93VarE6;
        i93 i93VarE7 = s51.e(null);
        this.p = i93VarE7;
        i93 i93VarE8 = s51.e(new hp2());
        this.q = i93VarE8;
        i93 i93VarE9 = s51.e(new o72(null == true ? 1 : 0, null == true ? 1 : 0, false, 31));
        this.r = i93VarE9;
        i93 i93VarE10 = s51.e(new v71());
        this.s = i93VarE10;
        i93 i93VarE11 = s51.e("Player");
        this.t = i93VarE11;
        this.u = s51.e(oi0Var);
        i93 i93VarE12 = s51.e(qp2.i);
        this.v = i93VarE12;
        i93 i93VarE13 = s51.e("0.3.7-R4");
        this.w = i93VarE13;
        i93 i93VarE14 = s51.e("Info");
        this.x = i93VarE14;
        i93 i93VarE15 = s51.e(bool);
        this.y = i93VarE15;
        i93 i93VarE16 = s51.e(qi.a());
        this.z = i93VarE16;
        i93 i93VarE17 = s51.e(oh3.g);
        this.A = i93VarE17;
        i93 i93VarE18 = s51.e(bool);
        this.B = i93VarE18;
        i93 i93VarE19 = s51.e(qy2.v);
        this.C = i93VarE19;
        i93 i93VarE20 = s51.e(bool);
        this.D = i93VarE20;
        i93 i93VarE21 = s51.e(60);
        this.E = i93VarE21;
        i93 i93VarE22 = s51.e(Integer.valueOf(n32.h(application)));
        this.F = i93VarE22;
        Boolean bool2 = Boolean.TRUE;
        i93 i93VarE23 = s51.e(bool2);
        this.G = i93VarE23;
        i93 i93VarE24 = s51.e(bool2);
        this.H = i93VarE24;
        this.I = s51.e("");
        this.J = new LinkedHashSet();
        int i2 = jv2.a;
        this.K = new iv2(2);
        dx dxVarF = f80.F(this);
        j90 j90Var = ac0.a;
        p40 p40Var = null;
        cl3.t(dxVarF, x80.h, new ga1(this, p40Var, 2), 2);
        cl3.t(f80.F(this), null, new ga1(this, p40Var, 3), 3);
        int i3 = 4;
        k(on0Var, "servers", new fa1(this, p40Var, i3));
        k(qy2Var.e, "nickname", new fa1(this, p40Var, 5));
        k(qy2Var.f, "recent nicknames", new fa1(this, p40Var, 6));
        k(qy2Var.g, "client version", new fa1(this, p40Var, 7));
        k(qy2Var.h, "client version name", new fa1(this, p40Var, 8));
        k(qy2Var.i, "log level", new fa1(this, p40Var, 9));
        k(qy2Var.j, "native keyboard", new ha1(this, p40Var, i3));
        int i4 = 0;
        k(qy2Var.k, "language", new fa1(this, p40Var, i4));
        k(qy2Var.l, "theme", new fa1(this, p40Var, 1));
        k(qy2Var.q, "FPS limit", new ga1(this, p40Var, i4));
        k(qy2Var.n, "chat timestamp", new ha1(this, p40Var, i4));
        k(qy2Var.o, "radar position", new fa1(this, p40Var, 2));
        int i5 = 1;
        k(qy2Var.p, "PC client check", new ha1(this, p40Var, i5));
        k(qy2Var.r, "font size", new ga1(this, p40Var, i5));
        k(qy2Var.s, "server notifications", new ha1(this, p40Var, 2));
        int i6 = 3;
        k(qy2Var.t, "RAKSAMP notifications", new ha1(this, p40Var, i6));
        k(fn0Var, "default server", new fa1(this, p40Var, i6));
        this.O = i93VarE6;
        this.P = i93VarE7;
        this.Q = i93VarE8;
        this.R = i93VarE9;
        this.S = i93VarE10;
        this.T = i93VarE11;
        this.U = i93VarE12;
        this.V = i93VarE13;
        this.W = i93VarE14;
        this.X = i93VarE15;
        this.Y = i93VarE16;
        this.Z = i93VarE17;
        this.a0 = i93VarE18;
        this.b0 = i93VarE19;
        this.c0 = i93VarE20;
        this.d0 = i93VarE21;
        this.e0 = i93VarE22;
        this.f0 = i93VarE23;
        this.g0 = i93VarE24;
        this.h0 = i93VarE;
        p40 p40Var2 = null;
        int i7 = 3;
        this.i0 = lr.R(new go0(on0Var, on0Var2, new la1(i7, p40Var2, 0)), f80.F(this), n33.a(), null);
        this.j0 = lr.R(new go0(on0Var, i93VarE2, new la1(i7, p40Var2, 2)), f80.F(this), n33.a(), ni0Var);
        this.k0 = i93VarE5;
        this.l0 = lr.R(new qn0(2, new fn0[]{i93VarE3, i93VarE4, on0Var, i93VarE2}, new na1(5, null)), f80.F(this), n33.a(), uj2.a);
    }

    public static final Intent e(sa1 sa1Var, kq2 kq2Var, String str, xy2 xy2Var, String str2, String str3) {
        sa1Var.getClass();
        Application application = sa1Var.b;
        application.getClass();
        Intent intent = new Intent(application, (Class<?>) GameActivity.class);
        intent.putExtra("server_host", kq2Var.a.a);
        intent.putExtra("server_port", kq2Var.a.b);
        intent.putExtra("nickname", str);
        intent.putExtra("client_version", ((qp2) sa1Var.v.getValue()).g);
        intent.putExtra("client_version_name", (String) sa1Var.w.getValue());
        intent.putExtra("server_password", str2);
        intent.putExtra("gpci", str3);
        intent.putExtra("server_text_encoding", xy2Var.g);
        intent.putExtra("native_keyboard_enabled", ((Boolean) sa1Var.y.getValue()).booleanValue());
        intent.putExtra("language_tag", (String) sa1Var.z.getValue());
        intent.putExtra("log_level", (String) sa1Var.x.getValue());
        intent.putExtra("fps_limit", ((Number) sa1Var.E.getValue()).intValue());
        intent.putExtra("font_size", ((Number) sa1Var.F.getValue()).intValue());
        intent.putExtra("show_chat_timestamp", ((Boolean) sa1Var.B.getValue()).booleanValue());
        intent.putExtra("radar_position", ((qf2) sa1Var.C.getValue()).f);
        intent.putExtra("emulate_pc_client_check", ((Boolean) sa1Var.D.getValue()).booleanValue());
        intent.setFlags(335544320);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:48:0x00f5, B:50:0x00ff, B:54:0x0110, B:56:0x0120, B:58:0x0131, B:57:0x0128, B:51:0x0102, B:53:0x0106, B:62:0x013d, B:63:0x0142, B:24:0x005a, B:25:0x0065, B:27:0x0077, B:29:0x0088, B:31:0x008e, B:32:0x009c, B:34:0x00a3, B:38:0x00b6, B:40:0x00ba, B:44:0x00d4, B:43:0x00c2, B:28:0x007f), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:48:0x00f5, B:50:0x00ff, B:54:0x0110, B:56:0x0120, B:58:0x0131, B:57:0x0128, B:51:0x0102, B:53:0x0106, B:62:0x013d, B:63:0x0142, B:24:0x005a, B:25:0x0065, B:27:0x0077, B:29:0x0088, B:31:0x008e, B:32:0x009c, B:34:0x00a3, B:38:0x00b6, B:40:0x00ba, B:44:0x00d4, B:43:0x00c2, B:28:0x007f), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:48:0x00f5, B:50:0x00ff, B:54:0x0110, B:56:0x0120, B:58:0x0131, B:57:0x0128, B:51:0x0102, B:53:0x0106, B:62:0x013d, B:63:0x0142, B:24:0x005a, B:25:0x0065, B:27:0x0077, B:29:0x0088, B:31:0x008e, B:32:0x009c, B:34:0x00a3, B:38:0x00b6, B:40:0x00ba, B:44:0x00d4, B:43:0x00c2, B:28:0x007f), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:48:0x00f5, B:50:0x00ff, B:54:0x0110, B:56:0x0120, B:58:0x0131, B:57:0x0128, B:51:0x0102, B:53:0x0106, B:62:0x013d, B:63:0x0142, B:24:0x005a, B:25:0x0065, B:27:0x0077, B:29:0x0088, B:31:0x008e, B:32:0x009c, B:34:0x00a3, B:38:0x00b6, B:40:0x00ba, B:44:0x00d4, B:43:0x00c2, B:28:0x007f), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.sa1 r13, defpackage.sv2 r14, defpackage.q40 r15) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa1.f(sa1, sv2, q40):java.lang.Object");
    }

    public final void g() {
        ja2 ja2Var = this.h;
        ja2Var.getClass();
        try {
            ja2Var.b.delete();
        } catch (Throwable unused) {
        }
        try {
            ja2Var.c.delete();
        } catch (Throwable unused2) {
        }
        this.i.i(null);
    }

    public final void h(sv2 sv2Var) {
        sv2Var.getClass();
        Iterable iterable = (Iterable) this.j0.f.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String str = ((yv2) it.next()).a.e;
                String lowerCase = sv2Var.c.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (s51.n(str, lowerCase)) {
                    return;
                }
            }
        }
        cl3.t(f80.F(this), null, new ja1(this, sv2Var, null, 0), 3);
    }

    public final void i() {
        i93 i93Var = this.s;
        v71 v71Var = (v71) i93Var.getValue();
        kq2 kq2Var = v71Var.b;
        if (kq2Var == null) {
            return;
        }
        String str = v71Var.c;
        if (y93.q0(str)) {
            str = (String) this.t.getValue();
        }
        String str2 = str;
        u(kq2Var.e, str2);
        i93Var.j(null, new v71());
        cl3.t(f80.F(this), null, new m9(this, kq2Var, v71Var, str2, (p40) null, 5), 3);
    }

    public final void j(ts0 ts0Var) {
        i93 i93Var = this.s;
        v71 v71Var = (v71) i93Var.getValue();
        kq2 kq2Var = v71Var.b;
        if (kq2Var == null) {
            return;
        }
        String str = v71Var.c;
        if (y93.q0(str)) {
            str = (String) this.t.getValue();
        }
        String str2 = str;
        u(kq2Var.e, str2);
        i93Var.j(null, new v71());
        cl3.t(f80.F(this), null, new m9(this, kq2Var, v71Var, ts0Var, str2, null, 6), 3);
    }

    public final void k(fn0 fn0Var, String str, rs0 rs0Var) {
        int i = 1;
        cl3.t(f80.F(this), null, new l80(new on0(new un0(fn0Var, rs0Var, i), new la1(str, null), 1), null, i), 3);
    }

    public final void l(boolean z) {
        if (!this.L || z) {
            this.L = true;
            w83 w83Var = this.M;
            p40 p40Var = null;
            if (w83Var != null) {
                w83Var.c(null);
            }
            this.M = cl3.t(f80.F(this), null, new ma1(this, z, p40Var, 0), 3);
        }
    }

    public final void m(String str) {
        i93 i93Var;
        Object value;
        str.getClass();
        do {
            i93Var = this.s;
            value = i93Var.getValue();
        } while (!i93Var.h(value, v71.a((v71) value, str, null, null, 123)));
    }

    public final void n(String str) {
        i93 i93Var;
        Object value;
        str.getClass();
        do {
            i93Var = this.s;
            value = i93Var.getValue();
        } while (!i93Var.h(value, v71.a((v71) value, null, str, null, 111)));
    }

    public final void o(xy2 xy2Var) {
        i93 i93Var;
        Object value;
        xy2Var.getClass();
        do {
            i93Var = this.s;
            value = i93Var.getValue();
        } while (!i93Var.h(value, v71.a((v71) value, null, null, xy2Var, 63)));
    }

    public final void p(String str) {
        i93 i93Var;
        Object value;
        g4 g4Var;
        StringBuilder sb;
        str.getClass();
        do {
            i93Var = this.o;
            value = i93Var.getValue();
            g4Var = (g4) value;
            sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
        } while (!i93Var.h(value, g4.a(g4Var, null, sb.toString(), null, 3)));
    }

    public final void q() {
        kq2 kq2Var = (kq2) this.i0.f.getValue();
        if (kq2Var == null) {
            return;
        }
        u(kq2Var.e, (String) this.t.getValue());
        cl3.t(f80.F(this), null, new l(this, kq2Var, null, 19), 3);
    }

    public final void r(List list, boolean z) {
        sa1 sa1Var;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            p40 p40Var = null;
            if (i < 0) {
                vr.b0();
                throw null;
            }
            sv2 sv2Var = (sv2) obj;
            String lowerCase = sv2Var.c.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            LinkedHashSet linkedHashSet = this.J;
            if (z || !linkedHashSet.contains(lowerCase)) {
                linkedHashSet.add(lowerCase);
                sa1Var = this;
                cl3.t(f80.F(this), null, new ia1(i, sa1Var, sv2Var, p40Var, 1), 3);
            } else {
                sa1Var = this;
            }
            this = sa1Var;
            i = i2;
        }
    }

    public final void s() {
        w83 w83Var = this.N;
        if (w83Var == null || !w83Var.b()) {
            w83 w83VarT = cl3.t(f80.F(this), null, new ga1(this, null, 5), 3);
            this.N = w83VarT;
            w83VarT.r(new i(22, this, w83VarT));
        }
    }

    public final void t(sv2 sv2Var) {
        sv2Var.getClass();
        cl3.t(f80.F(this), null, new ja1(this, sv2Var, null, 1), 3);
    }

    public final void u(String str, String str2) {
        i93 i93Var;
        Object value;
        Map mapSingletonMap;
        String string = y93.G0(str2).toString();
        if (y93.q0(string)) {
            return;
        }
        do {
            i93Var = this.u;
            value = i93Var.getValue();
            Map map = (Map) value;
            ai1 ai1VarX = vr.x();
            ai1VarX.add(string);
            Object obj = (List) map.get(str);
            if (obj == null) {
                obj = ni0.f;
            }
            Iterator it = pv2.K(new jm0(new vj(1, obj), false, new im(5, string)), 2).iterator();
            while (it.hasNext()) {
                ai1VarX.add((String) it.next());
            }
            ai1 ai1VarR = vr.r(ai1VarX);
            if (map.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(str, ai1VarR);
                mapSingletonMap.getClass();
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(str, ai1VarR);
                mapSingletonMap = linkedHashMap;
            }
        } while (!i93Var.h(value, mapSingletonMap));
        cl3.t(f80.F(this), null, new l(this, str, string, null, 21), 3);
    }

    public final void v(String str) {
        str.getClass();
        cl3.t(f80.F(this), null, new qa1(this, str, null, 2), 3);
    }

    public final void w() {
        g4 g4Var = (g4) this.o.getValue();
        xv2 xv2VarX = d32.x(g4Var.b, g4Var.c);
        if (xv2VarX.equals(tv2.a)) {
            x(h4.f);
            return;
        }
        if (xv2VarX.equals(uv2.a)) {
            x(h4.g);
            return;
        }
        if (xv2VarX.equals(vv2.a)) {
            x(h4.h);
        } else if (!(xv2VarX instanceof wv2)) {
            c.k();
        } else {
            cl3.t(f80.F(this), null, new j(this, (wv2) xv2VarX, null, 28), 3);
        }
    }

    public final void x(h4 h4Var) {
        i93 i93Var;
        Object value;
        do {
            i93Var = this.o;
            value = i93Var.getValue();
        } while (!i93Var.h(value, g4.a((g4) value, null, null, h4Var, 7)));
    }

    public final void y(kq2 kq2Var) {
        aq2 aq2Var;
        kq2Var.getClass();
        Map map = (Map) this.k.getValue();
        String str = kq2Var.e;
        Object obj = map.get(str);
        vy2 vy2Var = obj instanceof vy2 ? (vy2) obj : null;
        boolean z = (vy2Var == null || (aq2Var = vy2Var.a.a) == null || !aq2Var.a) ? false : true;
        String str2 = (String) this.t.getValue();
        List list = (List) ((Map) this.u.getValue()).get(str);
        if (list == null) {
            list = ni0.f;
        }
        v71 v71Var = new v71(true, kq2Var, str2, list, kq2Var.d, z, kq2Var.c);
        i93 i93Var = this.s;
        i93Var.getClass();
        i93Var.j(null, v71Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(sv2 sv2Var) {
        sv2Var.getClass();
        o72 o72Var = new o72(sv2Var, null, true, 20);
        i93 i93Var = this.r;
        i93Var.getClass();
        i93Var.j(null, o72Var);
        cl3.t(f80.F(this), null, new l(this, sv2Var, 0 == true ? 1 : 0, 23), 3);
    }
}
