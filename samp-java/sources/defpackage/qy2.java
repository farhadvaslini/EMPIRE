package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qy2 {
    public final Context a;
    public final e70 b;
    public final SharedPreferences c;
    public final zx2 d;
    public final t92 e;
    public final zx2 f;
    public final t92 g;
    public final zx2 h;
    public final t92 i;
    public final t92 j;
    public final t92 k;
    public final t92 l;
    public final t92 m;
    public final t92 n;
    public final t92 o;
    public final t92 p;
    public final t92 q;
    public final qn0 r;
    public final t92 s;
    public final t92 t;
    public final t92 u;
    public static final qf2 v = qf2.h;
    public static final ec2 w = new ec2("servers");
    public static final ec2 x = new ec2("nickname");
    public static final ec2 y = new ec2("recent_nicknames");
    public static final ec2 z = new ec2("client_version");
    public static final ec2 A = new ec2("client_version_name");
    public static final ec2 B = new ec2("log_level");
    public static final ec2 C = new ec2("native_keyboard_enabled");
    public static final ec2 D = new ec2("language_tag");
    public static final ec2 E = new ec2("sources_url");
    public static final ec2 F = new ec2("theme_mode");
    public static final ec2 G = new ec2("show_chat_timestamp");
    public static final ec2 H = new ec2("radar_position");
    public static final ec2 I = new ec2("emulate_pc_client_check");
    public static final ec2 J = new ec2("fps_limit");
    public static final ec2 K = new ec2("font_size");
    public static final ec2 L = new ec2("default_server_id");
    public static final ec2 M = new ec2("show_server_notification");
    public static final ec2 N = new ec2("show_raksamp_notification");
    public static final ec2 O = new ec2("gpci");
    public static final ec2 P = new ec2("gpci_random");

    public qy2(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        applicationContext.getClass();
        ih2 ih2VarA = ry2.b.a(applicationContext, ry2.a[0]);
        this.b = ih2VarA;
        this.c = applicationContext.getSharedPreferences("servers", 0);
        this.d = new zx2(ih2VarA.b(), this, 0);
        this.e = new t92(ih2VarA.b(), 11);
        this.f = new zx2(ih2VarA.b(), this, 1);
        this.g = new t92(ih2VarA.b(), 12);
        this.h = new zx2(ih2VarA.b(), this, 2);
        this.i = new t92(ih2VarA.b(), 13);
        this.j = new t92(ih2VarA.b(), 14);
        this.k = new t92(ih2VarA.b(), 15);
        this.l = new t92(ih2VarA.b(), 16);
        this.m = new t92(ih2VarA.b(), 2);
        this.n = new t92(ih2VarA.b(), 3);
        this.o = new t92(ih2VarA.b(), 4);
        this.p = new t92(ih2VarA.b(), 5);
        this.q = new t92(ih2VarA.b(), 6);
        int i = 7;
        this.r = new qn0(i, new t92(ih2VarA.b(), i), this);
        this.s = new t92(ih2VarA.b(), 8);
        this.t = new t92(ih2VarA.b(), 9);
        this.u = new t92(ih2VarA.b(), 10);
        ih2VarA.b();
    }

    public static final Map a(qy2 qy2Var, String str) {
        Object qn2Var;
        List listI0;
        Map linkedHashMap = oi0.f;
        if (str != null && !y93.q0(str)) {
            try {
                qn2Var = new JSONObject(str);
            } catch (Throwable th) {
                qn2Var = new qn2(th);
            }
            if (qn2Var instanceof qn2) {
                qn2Var = null;
            }
            JSONObject jSONObject = (JSONObject) qn2Var;
            if (jSONObject != null) {
                linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        l41 l41VarS = y02.S(0, jSONArrayOptJSONArray.length());
                        ArrayList arrayList = new ArrayList();
                        Iterator it = l41VarS.iterator();
                        while (((k41) it).h) {
                            String strOptString = jSONArrayOptJSONArray.optString(((e41) it).nextInt());
                            strOptString.getClass();
                            String string = y93.G0(strOptString).toString();
                            if (y93.q0(string)) {
                                string = null;
                            }
                            if (string != null) {
                                arrayList.add(string);
                            }
                        }
                        listI0 = qx.I0(qx.N0(qx.Q0(arrayList)), 3);
                    } else {
                        listI0 = null;
                    }
                    if (listI0 == null) {
                        listI0 = ni0.f;
                    }
                    if (!listI0.isEmpty()) {
                        linkedHashMap.put(next, listI0);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final kq2 b(qy2 qy2Var, String str) {
        Integer numF0;
        qy2Var.getClass();
        List listZ0 = y93.z0(str, new char[]{'\t'}, 6);
        int size = listZ0.size();
        if (3 <= size && size < 6) {
            Object obj = listZ0.get(0);
            if (y93.q0((String) obj)) {
                obj = null;
            }
            String str2 = (String) obj;
            if (str2 != null && (numF0 = fa3.f0((String) listZ0.get(1))) != null) {
                int iIntValue = numF0.intValue();
                Long lG0 = fa3.g0((String) listZ0.get(2));
                if (lG0 != null) {
                    long jLongValue = lG0.longValue();
                    if (1 <= iIntValue && iIntValue < 65536) {
                        sv2 sv2Var = new sv2(iIntValue, str2);
                        String str3 = (String) qx.s0(3, listZ0);
                        ak2 ak2Var = xy2.h;
                        ak2Var.getClass();
                        xy2 xy2VarH = ak2.h(str3);
                        if (xy2VarH == null) {
                            xy2VarH = ak2.n(ak2Var);
                        }
                        xy2 xy2Var = xy2VarH;
                        String str4 = (String) qx.s0(4, listZ0);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new kq2(sv2Var, jLongValue, xy2Var, str4);
                    }
                }
            }
        }
        return null;
    }

    public static final String c(qy2 qy2Var, kq2 kq2Var) {
        qy2Var.getClass();
        sv2 sv2Var = kq2Var.a;
        return qx.x0(vr.L(sv2Var.a, String.valueOf(sv2Var.b), String.valueOf(kq2Var.b), kq2Var.c.f, kq2Var.d), "\t", null, null, null, 62);
    }

    public static String f(String str, qp2 qp2Var) {
        str.getClass();
        qp2Var.getClass();
        String string = y93.G0(str).toString();
        if (y93.q0(string)) {
            string = null;
        }
        return string != null ? n32.F(string) : qp2Var.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(java.lang.String r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ax2
            if (r0 == 0) goto L13
            r0 = r6
            ax2 r0 = (defpackage.ax2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            ax2 r0 = new ax2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L42
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            jf2 r6 = new jf2
            r1 = 5
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L42
            return r5
        L42:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.A(java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(defpackage.oh3 r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bx2
            if (r0 == 0) goto L13
            r0 = r6
            bx2 r0 = (defpackage.bx2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            bx2 r0 = new bx2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L43
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            pw r6 = new pw
            r1 = 14
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L43
            return r5
        L43:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.B(oh3, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.sv2 r10, defpackage.xy2 r11, defpackage.q40 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.zv2
            if (r0 == 0) goto L13
            r0 = r12
            zv2 r0 = (defpackage.zv2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            zv2 r0 = new zv2
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.y02.Q(r12)
            goto L46
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.y02.Q(r12)
            f50 r3 = new f50
            r8 = 3
            r7 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.k = r2
            e70 r9 = r4.b
            java.lang.Object r9 = defpackage.b32.l(r9, r3, r0)
            y50 r10 = defpackage.y50.f
            if (r9 != r10) goto L46
            return r10
        L46:
            dm3 r9 = defpackage.dm3.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.d(sv2, xy2, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.q40 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.bw2
            if (r0 == 0) goto L13
            r0 = r6
            bw2 r0 = (defpackage.bw2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            bw2 r0 = new bw2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.j
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            qk2 r5 = r0.i
            defpackage.y02.Q(r6)
            goto L51
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r5)
            return r2
        L2e:
            defpackage.y02.Q(r6)
            qk2 r6 = new qk2
            r6.<init>()
            java.lang.String r1 = ""
            r6.f = r1
            pw r1 = new pw
            r4 = 10
            r1.<init>(r6, r2, r4)
            r0.i = r6
            r0.l = r3
            e70 r5 = r5.b
            java.lang.Object r5 = defpackage.b32.l(r5, r1, r0)
            y50 r0 = defpackage.y50.f
            if (r5 != r0) goto L50
            return r0
        L50:
            r5 = r6
        L51:
            java.lang.Object r5 = r5.f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.e(q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.q40 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cw2
            if (r0 == 0) goto L13
            r0 = r5
            cw2 r0 = (defpackage.cw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            cw2 r0 = new cw2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r5)
            goto L43
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r5)
            pw r5 = new pw
            r1 = 11
            r5.<init>(r4, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r5, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L43
            return r5
        L43:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.g(q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.q40 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dw2
            if (r0 == 0) goto L13
            r0 = r7
            dw2 r0 = (defpackage.dw2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            dw2 r0 = new dw2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.j
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r6 = r0.i
            defpackage.y02.Q(r7)
            return r6
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r6)
            return r2
        L2e:
            defpackage.y02.Q(r7)
            r7 = 16
            byte[] r7 = new byte[r7]
            java.security.SecureRandom r1 = defpackage.ry2.c
            r1.nextBytes(r7)
            cr2 r1 = new cr2
            r4 = 19
            r1.<init>(r4)
            r4 = 30
            java.lang.String r5 = ""
            java.lang.String r7 = defpackage.uj.W(r7, r5, r1, r4)
            java.lang.String r1 = defpackage.ry2.a(r7)
            rw r4 = new rw
            r5 = 9
            r4.<init>(r7, r1, r2, r5)
            r0.i = r1
            r0.l = r3
            e70 r6 = r6.b
            java.lang.Object r6 = defpackage.b32.l(r6, r4, r0)
            y50 r7 = defpackage.y50.f
            if (r6 != r7) goto L63
            return r7
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.h(q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ew2
            if (r0 == 0) goto L13
            r0 = r6
            ew2 r0 = (defpackage.ew2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            ew2 r0 = new ew2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            fw2 r6 = new fw2
            r6.<init>(r4, r5, r2)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L41
            return r5
        L41:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.i(java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.qp2 r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gw2
            if (r0 == 0) goto L13
            r0 = r6
            gw2 r0 = (defpackage.gw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            gw2 r0 = new gw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L43
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            pw r6 = new pw
            r1 = 12
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L43
            return r5
        L43:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.j(qp2, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hw2
            if (r0 == 0) goto L13
            r0 = r6
            hw2 r0 = (defpackage.hw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            hw2 r0 = new hw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            fw2 r6 = new fw2
            r6.<init>(r5, r4, r2)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L41
            return r5
        L41:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.k(java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.iw2
            if (r0 == 0) goto L13
            r0 = r6
            iw2 r0 = (defpackage.iw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            iw2 r0 = new iw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            jf2 r6 = new jf2
            r6.<init>(r5, r2, r3)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L41
            return r5
        L41:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.l(java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(boolean r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jw2
            if (r0 == 0) goto L13
            r0 = r6
            jw2 r0 = (defpackage.jw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            jw2 r0 = new jw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L42
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            kw2 r6 = new kw2
            r1 = 0
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L42
            return r5
        L42:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.m(boolean, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(int r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lw2
            if (r0 == 0) goto L13
            r0 = r6
            lw2 r0 = (defpackage.lw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            lw2 r0 = new lw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            ox1 r6 = new ox1
            r6.<init>(r5, r2, r3)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L41
            return r5
        L41:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.n(int, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(int r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mw2
            if (r0 == 0) goto L13
            r0 = r6
            mw2 r0 = (defpackage.mw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            mw2 r0 = new mw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L42
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            ox1 r6 = new ox1
            r1 = 2
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L42
            return r5
        L42:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.o(int, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.nw2
            if (r0 == 0) goto L13
            r0 = r6
            nw2 r0 = (defpackage.nw2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            nw2 r0 = new nw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.j
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r5 = r0.i
            defpackage.y02.Q(r6)
            goto L4a
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2e:
            defpackage.y02.Q(r6)
            java.lang.String r5 = defpackage.qi.b(r5)
            jf2 r6 = new jf2
            r1 = 2
            r6.<init>(r5, r2, r1)
            r0.i = r5
            r0.l = r3
            e70 r1 = r4.b
            java.lang.Object r6 = defpackage.b32.l(r1, r6, r0)
            y50 r0 = defpackage.y50.f
            if (r6 != r0) goto L4a
            return r0
        L4a:
            android.content.SharedPreferences r4 = r4.c
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r6 = "language_tag"
            android.content.SharedPreferences$Editor r4 = r4.putString(r6, r5)
            r4.apply()
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.p(java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ow2
            if (r0 == 0) goto L13
            r0 = r6
            ow2 r0 = (defpackage.ow2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            ow2 r0 = new ow2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L42
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            jf2 r6 = new jf2
            r1 = 3
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L42
            return r5
        L42:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.q(java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(boolean r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pw2
            if (r0 == 0) goto L13
            r0 = r6
            pw2 r0 = (defpackage.pw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            pw2 r0 = new pw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            kw2 r6 = new kw2
            r6.<init>(r5, r2, r3)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L41
            return r5
        L41:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.r(boolean, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qw2
            if (r0 == 0) goto L13
            r0 = r6
            qw2 r0 = (defpackage.qw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            qw2 r0 = new qw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L42
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            jf2 r6 = new jf2
            r1 = 4
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L42
            return r5
        L42:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.s(java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.qf2 r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.rw2
            if (r0 == 0) goto L13
            r0 = r6
            rw2 r0 = (defpackage.rw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            rw2 r0 = new rw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L43
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            pw r6 = new pw
            r1 = 13
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L43
            return r5
        L43:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.t(qf2, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r11, java.lang.String r12, defpackage.q40 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.sw2
            if (r0 == 0) goto L13
            r0 = r13
            sw2 r0 = (defpackage.sw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            sw2 r0 = new sw2
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.i
            int r1 = r0.k
            dm3 r2 = defpackage.dm3.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.y02.Q(r13)
            return r2
        L27:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r10)
            r10 = 0
            return r10
        L2e:
            defpackage.y02.Q(r13)
            java.lang.CharSequence r12 = defpackage.y93.G0(r12)
            java.lang.String r7 = r12.toString()
            boolean r12 = defpackage.y93.q0(r11)
            if (r12 != 0) goto L5c
            boolean r12 = defpackage.y93.q0(r7)
            if (r12 == 0) goto L46
            goto L5c
        L46:
            tw2 r4 = new tw2
            r9 = 0
            r8 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.k = r3
            e70 r10 = r5.b
            java.lang.Object r10 = defpackage.b32.l(r10, r4, r0)
            y50 r11 = defpackage.y50.f
            if (r10 != r11) goto L5c
            return r11
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.u(java.lang.String, java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r10, java.lang.String r11, defpackage.q40 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.uw2
            if (r0 == 0) goto L13
            r0 = r12
            uw2 r0 = (defpackage.uw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            uw2 r0 = new uw2
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.y02.Q(r12)
            goto L46
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.y02.Q(r12)
            tw2 r3 = new tw2
            r8 = 1
            r7 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.k = r2
            e70 r9 = r4.b
            java.lang.Object r9 = defpackage.b32.l(r9, r3, r0)
            y50 r10 = defpackage.y50.f
            if (r9 != r10) goto L46
            return r10
        L46:
            dm3 r9 = defpackage.dm3.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.v(java.lang.String, java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r10, defpackage.xy2 r11, defpackage.q40 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.ww2
            if (r0 == 0) goto L13
            r0 = r12
            ww2 r0 = (defpackage.ww2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            ww2 r0 = new ww2
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.y02.Q(r12)
            goto L46
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.y02.Q(r12)
            f50 r3 = new f50
            r8 = 4
            r7 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.k = r2
            e70 r9 = r4.b
            java.lang.Object r9 = defpackage.b32.l(r9, r3, r0)
            y50 r10 = defpackage.y50.f
            if (r9 != r10) goto L46
            return r10
        L46:
            dm3 r9 = defpackage.dm3.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.w(java.lang.String, xy2, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(boolean r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.xw2
            if (r0 == 0) goto L13
            r0 = r6
            xw2 r0 = (defpackage.xw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            xw2 r0 = new xw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L42
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            kw2 r6 = new kw2
            r1 = 2
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L42
            return r5
        L42:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.x(boolean, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(boolean r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yw2
            if (r0 == 0) goto L13
            r0 = r6
            yw2 r0 = (defpackage.yw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            yw2 r0 = new yw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L42
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            kw2 r6 = new kw2
            r1 = 3
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L42
            return r5
        L42:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.y(boolean, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(boolean r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.zw2
            if (r0 == 0) goto L13
            r0 = r6
            zw2 r0 = (defpackage.zw2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            zw2 r0 = new zw2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L42
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            kw2 r6 = new kw2
            r1 = 4
            r6.<init>(r5, r2, r1)
            r0.k = r3
            e70 r4 = r4.b
            java.lang.Object r4 = defpackage.b32.l(r4, r6, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L42
            return r5
        L42:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.z(boolean, q40):java.lang.Object");
    }
}
