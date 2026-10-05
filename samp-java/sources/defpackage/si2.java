package defpackage;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class si2 {
    public static final si2 h;
    public static final si2 i;
    public static final /* synthetic */ si2[] j;
    public static final /* synthetic */ mj0 k;
    public final int f;
    public final w01 g;

    static {
        w01 w01VarB = vr.a;
        if (w01VarB == null) {
            v01 v01Var = new v01("AutoMirrored.Filled.Chat", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
            int i2 = vo3.a;
            w73 w73Var = new w73(wx.b);
            tx0 tx0Var = new tx0(1);
            tx0Var.j(20.0f, 2.0f);
            tx0Var.h(4.0f, 2.0f);
            tx0Var.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            tx0Var.h(2.0f, 22.0f);
            tx0Var.i(4.0f, -4.0f);
            tx0Var.g(14.0f);
            tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            tx0Var.h(22.0f, 4.0f);
            tx0Var.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            tx0Var.c();
            tx0Var.j(6.0f, 9.0f);
            tx0Var.g(12.0f);
            tx0Var.o(2.0f);
            tx0Var.h(6.0f, 11.0f);
            tx0Var.h(6.0f, 9.0f);
            tx0Var.c();
            tx0Var.j(14.0f, 14.0f);
            tx0Var.h(6.0f, 14.0f);
            tx0Var.o(-2.0f);
            tx0Var.g(8.0f);
            tx0Var.o(2.0f);
            tx0Var.c();
            tx0Var.j(18.0f, 8.0f);
            tx0Var.h(6.0f, 8.0f);
            tx0Var.h(6.0f, 6.0f);
            tx0Var.g(12.0f);
            tx0Var.o(2.0f);
            tx0Var.c();
            v01.a(v01Var, tx0Var.a, w73Var);
            w01VarB = v01Var.b();
            vr.a = w01VarB;
        }
        si2 si2Var = new si2(0, 2131624597, w01VarB, "Chat");
        w01 w01VarB2 = gq.c;
        if (w01VarB2 == null) {
            v01 v01Var2 = new v01("Filled.DynamicFeed", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i3 = vo3.a;
            long j2 = wx.b;
            w73 w73Var2 = new w73(j2);
            tx0 tx0Var2 = new tx0(1);
            tx0Var2.j(8.0f, 8.0f);
            tx0Var2.f(6.0f);
            tx0Var2.o(7.0f);
            tx0Var2.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            tx0Var2.g(9.0f);
            tx0Var2.o(-2.0f);
            tx0Var2.f(8.0f);
            tx0Var2.n(8.0f);
            tx0Var2.c();
            v01.a(v01Var2, tx0Var2.a, w73Var2);
            w73 w73Var3 = new w73(j2);
            tx0 tx0Var3 = new tx0(1);
            tx0Var3.j(20.0f, 3.0f);
            tx0Var3.g(-8.0f);
            tx0Var3.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            tx0Var3.o(6.0f);
            tx0Var3.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            tx0Var3.g(8.0f);
            tx0Var3.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            tx0Var3.n(5.0f);
            tx0Var3.d(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
            tx0Var3.c();
            tx0Var3.j(20.0f, 11.0f);
            tx0Var3.g(-8.0f);
            tx0Var3.n(7.0f);
            tx0Var3.g(8.0f);
            tx0Var3.n(11.0f);
            tx0Var3.c();
            v01.a(v01Var2, tx0Var3.a, w73Var3);
            w73 w73Var4 = new w73(j2);
            tx0 tx0Var4 = new tx0(1);
            tx0Var4.j(4.0f, 12.0f);
            tx0Var4.f(2.0f);
            tx0Var4.o(7.0f);
            tx0Var4.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            tx0Var4.g(9.0f);
            tx0Var4.o(-2.0f);
            tx0Var4.f(4.0f);
            tx0Var4.n(12.0f);
            tx0Var4.c();
            v01.a(v01Var2, tx0Var4.a, w73Var4);
            w01VarB2 = v01Var2.b();
            gq.c = w01VarB2;
        }
        si2 si2Var2 = new si2(1, 2131624601, w01VarB2, "TextDraws");
        si2 si2Var3 = new si2(2, 2131624598, lq.E(), "Dialogs");
        w01 w01VarB3 = ur.b;
        if (w01VarB3 == null) {
            v01 v01Var3 = new v01("Filled.Groups", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = vo3.a;
            w73 w73Var5 = new w73(wx.b);
            tx0 tx0Var5 = new tx0(1);
            tx0Var5.j(12.0f, 12.75f);
            tx0Var5.e(1.63f, 0.0f, 3.07f, 0.39f, 4.24f, 0.9f);
            tx0Var5.e(1.08f, 0.48f, 1.76f, 1.56f, 1.76f, 2.73f);
            tx0Var5.h(18.0f, 18.0f);
            tx0Var5.f(6.0f);
            tx0Var5.i(0.0f, -1.61f);
            tx0Var5.e(0.0f, -1.18f, 0.68f, -2.26f, 1.76f, -2.73f);
            tx0Var5.d(8.93f, 13.14f, 10.37f, 12.75f, 12.0f, 12.75f);
            tx0Var5.c();
            tx0Var5.j(4.0f, 13.0f);
            tx0Var5.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            tx0Var5.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            tx0Var5.l(-2.0f, 0.9f, -2.0f, 2.0f);
            tx0Var5.d(2.0f, 12.1f, 2.9f, 13.0f, 4.0f, 13.0f);
            tx0Var5.c();
            tx0Var5.j(5.13f, 14.1f);
            tx0Var5.d(4.76f, 14.04f, 4.39f, 14.0f, 4.0f, 14.0f);
            tx0Var5.e(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
            tx0Var5.d(0.48f, 14.9f, 0.0f, 15.62f, 0.0f, 16.43f);
            tx0Var5.n(18.0f);
            tx0Var5.i(4.5f, 0.0f);
            tx0Var5.o(-1.61f);
            tx0Var5.d(4.5f, 15.56f, 4.73f, 14.78f, 5.13f, 14.1f);
            tx0Var5.c();
            tx0Var5.j(20.0f, 13.0f);
            tx0Var5.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            tx0Var5.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            tx0Var5.l(-2.0f, 0.9f, -2.0f, 2.0f);
            tx0Var5.d(18.0f, 12.1f, 18.9f, 13.0f, 20.0f, 13.0f);
            tx0Var5.c();
            tx0Var5.j(24.0f, 16.43f);
            tx0Var5.e(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
            tx0Var5.d(21.93f, 14.21f, 20.99f, 14.0f, 20.0f, 14.0f);
            tx0Var5.e(-0.39f, 0.0f, -0.76f, 0.04f, -1.13f, 0.1f);
            tx0Var5.e(0.4f, 0.68f, 0.63f, 1.46f, 0.63f, 2.29f);
            tx0Var5.n(18.0f);
            tx0Var5.i(4.5f, 0.0f);
            tx0Var5.n(16.43f);
            tx0Var5.c();
            tx0Var5.j(12.0f, 6.0f);
            tx0Var5.e(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
            tx0Var5.e(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
            tx0Var5.l(-3.0f, -1.34f, -3.0f, -3.0f);
            tx0Var5.d(9.0f, 7.34f, 10.34f, 6.0f, 12.0f, 6.0f);
            tx0Var5.c();
            v01.a(v01Var3, tx0Var5.a, w73Var5);
            w01VarB3 = v01Var3.b();
            ur.b = w01VarB3;
        }
        si2 si2Var4 = new si2(3, 2131624600, w01VarB3, "Players");
        h = si2Var4;
        w01 w01VarB4 = w22.a;
        if (w01VarB4 == null) {
            v01 v01Var4 = new v01("Filled.PersonSearch", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i5 = vo3.a;
            long j3 = wx.b;
            w73 w73Var6 = new w73(j3);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new q42(10.0f, 8.0f));
            arrayList.add(new y42(-4.0f, 0.0f));
            arrayList.add(new u42(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f));
            arrayList.add(new u42(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f));
            v01.a(v01Var4, arrayList, w73Var6);
            w73 w73Var7 = new w73(j3);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new q42(10.35f, 14.01f));
            arrayList2.add(new n42(7.62f, 13.91f, 2.0f, 15.27f, 2.0f, 18.0f));
            arrayList2.add(new c52(2.0f));
            arrayList2.add(new w42(9.54f));
            arrayList2.add(new n42(9.07f, 17.24f, 10.31f, 14.11f, 10.35f, 14.01f));
            arrayList2.add(m42.c);
            v01.a(v01Var4, arrayList2, w73Var7);
            w73 w73Var8 = new w73(j3);
            tx0 tx0Var6 = new tx0(1);
            tx0Var6.j(19.43f, 18.02f);
            tx0Var6.d(19.79f, 17.43f, 20.0f, 16.74f, 20.0f, 16.0f);
            tx0Var6.e(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
            tx0Var6.l(-4.0f, 1.79f, -4.0f, 4.0f);
            tx0Var6.e(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
            tx0Var6.e(0.74f, 0.0f, 1.43f, -0.22f, 2.02f, -0.57f);
            tx0Var6.h(20.59f, 22.0f);
            tx0Var6.h(22.0f, 20.59f);
            tx0Var6.h(19.43f, 18.02f);
            tx0Var6.c();
            tx0Var6.j(16.0f, 18.0f);
            tx0Var6.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
            tx0Var6.e(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
            tx0Var6.l(2.0f, 0.9f, 2.0f, 2.0f);
            tx0Var6.d(18.0f, 17.1f, 17.1f, 18.0f, 16.0f, 18.0f);
            tx0Var6.c();
            v01.a(v01Var4, tx0Var6.a, w73Var8);
            w01VarB4 = v01Var4.b();
            w22.a = w01VarB4;
        }
        si2 si2Var5 = new si2(4, 2131624599, w01VarB4, "Nearby");
        i = si2Var5;
        si2[] si2VarArr = {si2Var, si2Var2, si2Var3, si2Var4, si2Var5};
        j = si2VarArr;
        k = new mj0(si2VarArr);
    }

    public si2(int i2, int i3, w01 w01Var, String str) {
        this.f = i3;
        this.g = w01Var;
    }

    public static si2 valueOf(String str) {
        return (si2) Enum.valueOf(si2.class, str);
    }

    public static si2[] values() {
        return (si2[]) j.clone();
    }
}
