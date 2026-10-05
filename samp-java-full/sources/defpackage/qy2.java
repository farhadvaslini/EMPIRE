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
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final Object A(String str, q40 q40Var) {
        ax2 ax2Var;
        if (q40Var instanceof ax2) {
            ax2Var = (ax2) q40Var;
            int i = ax2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ax2Var.k = i - Integer.MIN_VALUE;
            } else {
                ax2Var = new ax2(this, q40Var);
            }
        }
        Object obj = ax2Var.i;
        int i2 = ax2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            jf2 jf2Var = new jf2(str, p40Var, 5);
            ax2Var.k = 1;
            Object objL = b32.l(this.b, jf2Var, ax2Var);
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
    public final Object B(oh3 oh3Var, q40 q40Var) {
        bx2 bx2Var;
        if (q40Var instanceof bx2) {
            bx2Var = (bx2) q40Var;
            int i = bx2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bx2Var.k = i - Integer.MIN_VALUE;
            } else {
                bx2Var = new bx2(this, q40Var);
            }
        }
        Object obj = bx2Var.i;
        int i2 = bx2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            pw pwVar = new pw(oh3Var, p40Var, 14);
            bx2Var.k = 1;
            Object objL = b32.l(this.b, pwVar, bx2Var);
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
    public final Object d(sv2 sv2Var, xy2 xy2Var, q40 q40Var) {
        zv2 zv2Var;
        if (q40Var instanceof zv2) {
            zv2Var = (zv2) q40Var;
            int i = zv2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zv2Var.k = i - Integer.MIN_VALUE;
            } else {
                zv2Var = new zv2(this, q40Var);
            }
        }
        Object obj = zv2Var.i;
        int i2 = zv2Var.k;
        if (i2 == 0) {
            y02.Q(obj);
            f50 f50Var = new f50(this, sv2Var, xy2Var, null, 3);
            zv2Var.k = 1;
            Object objL = b32.l(this.b, f50Var, zv2Var);
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
    public final Object e(q40 q40Var) {
        bw2 bw2Var;
        qk2 qk2Var;
        if (q40Var instanceof bw2) {
            bw2Var = (bw2) q40Var;
            int i = bw2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bw2Var.l = i - Integer.MIN_VALUE;
            } else {
                bw2Var = new bw2(this, q40Var);
            }
        }
        Object obj = bw2Var.j;
        int i2 = bw2Var.l;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            qk2 qk2Var2 = new qk2();
            qk2Var2.f = "";
            pw pwVar = new pw(qk2Var2, p40Var, 10);
            bw2Var.i = qk2Var2;
            bw2Var.l = 1;
            Object objL = b32.l(this.b, pwVar, bw2Var);
            y50 y50Var = y50.f;
            if (objL == y50Var) {
                return y50Var;
            }
            qk2Var = qk2Var2;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qk2Var = bw2Var.i;
            y02.Q(obj);
        }
        return qk2Var.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(q40 q40Var) {
        cw2 cw2Var;
        if (q40Var instanceof cw2) {
            cw2Var = (cw2) q40Var;
            int i = cw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cw2Var.k = i - Integer.MIN_VALUE;
            } else {
                cw2Var = new cw2(this, q40Var);
            }
        }
        Object obj = cw2Var.i;
        int i2 = cw2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            pw pwVar = new pw(this, p40Var, 11);
            cw2Var.k = 1;
            Object objL = b32.l(this.b, pwVar, cw2Var);
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
    public final Object h(q40 q40Var) {
        dw2 dw2Var;
        if (q40Var instanceof dw2) {
            dw2Var = (dw2) q40Var;
            int i = dw2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                dw2Var.l = i - Integer.MIN_VALUE;
            } else {
                dw2Var = new dw2(this, q40Var);
            }
        }
        Object obj = dw2Var.j;
        int i2 = dw2Var.l;
        p40 p40Var = null;
        if (i2 != 0) {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = dw2Var.i;
            y02.Q(obj);
            return str;
        }
        y02.Q(obj);
        byte[] bArr = new byte[16];
        ry2.c.nextBytes(bArr);
        String strW = uj.W(bArr, "", new cr2(19), 30);
        String strA = ry2.a(strW);
        rw rwVar = new rw(strW, strA, p40Var, 9);
        dw2Var.i = strA;
        dw2Var.l = 1;
        Object objL = b32.l(this.b, rwVar, dw2Var);
        y50 y50Var = y50.f;
        return objL == y50Var ? y50Var : strA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, q40 q40Var) {
        ew2 ew2Var;
        if (q40Var instanceof ew2) {
            ew2Var = (ew2) q40Var;
            int i = ew2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ew2Var.k = i - Integer.MIN_VALUE;
            } else {
                ew2Var = new ew2(this, q40Var);
            }
        }
        Object obj = ew2Var.i;
        int i2 = ew2Var.k;
        if (i2 == 0) {
            y02.Q(obj);
            fw2 fw2Var = new fw2(this, str, (p40) null);
            ew2Var.k = 1;
            Object objL = b32.l(this.b, fw2Var, ew2Var);
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
    public final Object j(qp2 qp2Var, q40 q40Var) {
        gw2 gw2Var;
        if (q40Var instanceof gw2) {
            gw2Var = (gw2) q40Var;
            int i = gw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gw2Var.k = i - Integer.MIN_VALUE;
            } else {
                gw2Var = new gw2(this, q40Var);
            }
        }
        Object obj = gw2Var.i;
        int i2 = gw2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            pw pwVar = new pw(qp2Var, p40Var, 12);
            gw2Var.k = 1;
            Object objL = b32.l(this.b, pwVar, gw2Var);
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
    public final Object k(String str, q40 q40Var) {
        hw2 hw2Var;
        if (q40Var instanceof hw2) {
            hw2Var = (hw2) q40Var;
            int i = hw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hw2Var.k = i - Integer.MIN_VALUE;
            } else {
                hw2Var = new hw2(this, q40Var);
            }
        }
        Object obj = hw2Var.i;
        int i2 = hw2Var.k;
        if (i2 == 0) {
            y02.Q(obj);
            fw2 fw2Var = new fw2(str, this, (p40) null);
            hw2Var.k = 1;
            Object objL = b32.l(this.b, fw2Var, hw2Var);
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
    public final Object l(String str, q40 q40Var) {
        iw2 iw2Var;
        if (q40Var instanceof iw2) {
            iw2Var = (iw2) q40Var;
            int i = iw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iw2Var.k = i - Integer.MIN_VALUE;
            } else {
                iw2Var = new iw2(this, q40Var);
            }
        }
        Object obj = iw2Var.i;
        int i2 = iw2Var.k;
        p40 p40Var = null;
        int i3 = 1;
        if (i2 == 0) {
            y02.Q(obj);
            jf2 jf2Var = new jf2(str, p40Var, i3);
            iw2Var.k = 1;
            Object objL = b32.l(this.b, jf2Var, iw2Var);
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
    public final Object m(boolean z2, q40 q40Var) {
        jw2 jw2Var;
        if (q40Var instanceof jw2) {
            jw2Var = (jw2) q40Var;
            int i = jw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jw2Var.k = i - Integer.MIN_VALUE;
            } else {
                jw2Var = new jw2(this, q40Var);
            }
        }
        Object obj = jw2Var.i;
        int i2 = jw2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            kw2 kw2Var = new kw2(z2, p40Var, 0);
            jw2Var.k = 1;
            Object objL = b32.l(this.b, kw2Var, jw2Var);
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
    public final Object n(int i, q40 q40Var) {
        lw2 lw2Var;
        if (q40Var instanceof lw2) {
            lw2Var = (lw2) q40Var;
            int i2 = lw2Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lw2Var.k = i2 - Integer.MIN_VALUE;
            } else {
                lw2Var = new lw2(this, q40Var);
            }
        }
        Object obj = lw2Var.i;
        int i3 = lw2Var.k;
        p40 p40Var = null;
        int i4 = 1;
        if (i3 == 0) {
            y02.Q(obj);
            ox1 ox1Var = new ox1(i, p40Var, i4);
            lw2Var.k = 1;
            Object objL = b32.l(this.b, ox1Var, lw2Var);
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
    public final Object o(int i, q40 q40Var) {
        mw2 mw2Var;
        if (q40Var instanceof mw2) {
            mw2Var = (mw2) q40Var;
            int i2 = mw2Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mw2Var.k = i2 - Integer.MIN_VALUE;
            } else {
                mw2Var = new mw2(this, q40Var);
            }
        }
        Object obj = mw2Var.i;
        int i3 = mw2Var.k;
        p40 p40Var = null;
        if (i3 == 0) {
            y02.Q(obj);
            ox1 ox1Var = new ox1(i, p40Var, 2);
            mw2Var.k = 1;
            Object objL = b32.l(this.b, ox1Var, mw2Var);
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
    public final Object p(String str, q40 q40Var) {
        nw2 nw2Var;
        String strB;
        if (q40Var instanceof nw2) {
            nw2Var = (nw2) q40Var;
            int i = nw2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                nw2Var.l = i - Integer.MIN_VALUE;
            } else {
                nw2Var = new nw2(this, q40Var);
            }
        }
        Object obj = nw2Var.j;
        int i2 = nw2Var.l;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            strB = qi.b(str);
            jf2 jf2Var = new jf2(strB, p40Var, 2);
            nw2Var.i = strB;
            nw2Var.l = 1;
            Object objL = b32.l(this.b, jf2Var, nw2Var);
            y50 y50Var = y50.f;
            if (objL == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            strB = nw2Var.i;
            y02.Q(obj);
        }
        this.c.edit().putString("language_tag", strB).apply();
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, q40 q40Var) {
        ow2 ow2Var;
        if (q40Var instanceof ow2) {
            ow2Var = (ow2) q40Var;
            int i = ow2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ow2Var.k = i - Integer.MIN_VALUE;
            } else {
                ow2Var = new ow2(this, q40Var);
            }
        }
        Object obj = ow2Var.i;
        int i2 = ow2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            jf2 jf2Var = new jf2(str, p40Var, 3);
            ow2Var.k = 1;
            Object objL = b32.l(this.b, jf2Var, ow2Var);
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
    public final Object r(boolean z2, q40 q40Var) {
        pw2 pw2Var;
        if (q40Var instanceof pw2) {
            pw2Var = (pw2) q40Var;
            int i = pw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pw2Var.k = i - Integer.MIN_VALUE;
            } else {
                pw2Var = new pw2(this, q40Var);
            }
        }
        Object obj = pw2Var.i;
        int i2 = pw2Var.k;
        p40 p40Var = null;
        int i3 = 1;
        if (i2 == 0) {
            y02.Q(obj);
            kw2 kw2Var = new kw2(z2, p40Var, i3);
            pw2Var.k = 1;
            Object objL = b32.l(this.b, kw2Var, pw2Var);
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
    public final Object s(String str, q40 q40Var) {
        qw2 qw2Var;
        if (q40Var instanceof qw2) {
            qw2Var = (qw2) q40Var;
            int i = qw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qw2Var.k = i - Integer.MIN_VALUE;
            } else {
                qw2Var = new qw2(this, q40Var);
            }
        }
        Object obj = qw2Var.i;
        int i2 = qw2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            jf2 jf2Var = new jf2(str, p40Var, 4);
            qw2Var.k = 1;
            Object objL = b32.l(this.b, jf2Var, qw2Var);
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
    public final Object t(qf2 qf2Var, q40 q40Var) {
        rw2 rw2Var;
        if (q40Var instanceof rw2) {
            rw2Var = (rw2) q40Var;
            int i = rw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rw2Var.k = i - Integer.MIN_VALUE;
            } else {
                rw2Var = new rw2(this, q40Var);
            }
        }
        Object obj = rw2Var.i;
        int i2 = rw2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            pw pwVar = new pw(qf2Var, p40Var, 13);
            rw2Var.k = 1;
            Object objL = b32.l(this.b, pwVar, rw2Var);
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
    public final Object u(String str, String str2, q40 q40Var) {
        sw2 sw2Var;
        if (q40Var instanceof sw2) {
            sw2Var = (sw2) q40Var;
            int i = sw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sw2Var.k = i - Integer.MIN_VALUE;
            } else {
                sw2Var = new sw2(this, q40Var);
            }
        }
        Object obj = sw2Var.i;
        int i2 = sw2Var.k;
        dm3 dm3Var = dm3.a;
        if (i2 != 0) {
            if (i2 == 1) {
                y02.Q(obj);
                return dm3Var;
            }
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y02.Q(obj);
        String string = y93.G0(str2).toString();
        if (!y93.q0(str) && !y93.q0(string)) {
            tw2 tw2Var = new tw2(this, str, string, null, 0);
            sw2Var.k = 1;
            Object objL = b32.l(this.b, tw2Var, sw2Var);
            y50 y50Var = y50.f;
            if (objL == y50Var) {
                return y50Var;
            }
        }
        return dm3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(String str, String str2, q40 q40Var) {
        uw2 uw2Var;
        if (q40Var instanceof uw2) {
            uw2Var = (uw2) q40Var;
            int i = uw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                uw2Var.k = i - Integer.MIN_VALUE;
            } else {
                uw2Var = new uw2(this, q40Var);
            }
        }
        Object obj = uw2Var.i;
        int i2 = uw2Var.k;
        if (i2 == 0) {
            y02.Q(obj);
            tw2 tw2Var = new tw2(this, str, str2, null, 1);
            uw2Var.k = 1;
            Object objL = b32.l(this.b, tw2Var, uw2Var);
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
    public final Object w(String str, xy2 xy2Var, q40 q40Var) {
        ww2 ww2Var;
        if (q40Var instanceof ww2) {
            ww2Var = (ww2) q40Var;
            int i = ww2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ww2Var.k = i - Integer.MIN_VALUE;
            } else {
                ww2Var = new ww2(this, q40Var);
            }
        }
        Object obj = ww2Var.i;
        int i2 = ww2Var.k;
        if (i2 == 0) {
            y02.Q(obj);
            f50 f50Var = new f50(this, str, xy2Var, null, 4);
            ww2Var.k = 1;
            Object objL = b32.l(this.b, f50Var, ww2Var);
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
    public final Object x(boolean z2, q40 q40Var) {
        xw2 xw2Var;
        if (q40Var instanceof xw2) {
            xw2Var = (xw2) q40Var;
            int i = xw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xw2Var.k = i - Integer.MIN_VALUE;
            } else {
                xw2Var = new xw2(this, q40Var);
            }
        }
        Object obj = xw2Var.i;
        int i2 = xw2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            kw2 kw2Var = new kw2(z2, p40Var, 2);
            xw2Var.k = 1;
            Object objL = b32.l(this.b, kw2Var, xw2Var);
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
    public final Object y(boolean z2, q40 q40Var) {
        yw2 yw2Var;
        if (q40Var instanceof yw2) {
            yw2Var = (yw2) q40Var;
            int i = yw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yw2Var.k = i - Integer.MIN_VALUE;
            } else {
                yw2Var = new yw2(this, q40Var);
            }
        }
        Object obj = yw2Var.i;
        int i2 = yw2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            kw2 kw2Var = new kw2(z2, p40Var, 3);
            yw2Var.k = 1;
            Object objL = b32.l(this.b, kw2Var, yw2Var);
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
    public final Object z(boolean z2, q40 q40Var) {
        zw2 zw2Var;
        if (q40Var instanceof zw2) {
            zw2Var = (zw2) q40Var;
            int i = zw2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zw2Var.k = i - Integer.MIN_VALUE;
            } else {
                zw2Var = new zw2(this, q40Var);
            }
        }
        Object obj = zw2Var.i;
        int i2 = zw2Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            kw2 kw2Var = new kw2(z2, p40Var, 4);
            zw2Var.k = 1;
            Object objL = b32.l(this.b, kw2Var, zw2Var);
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
}
