package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 {
    public final Context a;
    public final wt1 b;
    public final qh0 c;
    public final Activity d;
    public boolean e;
    public final tk f;
    public final boolean g;

    public nu1(Context context) {
        Object next;
        context.getClass();
        this.a = context;
        this.b = new wt1(this, new q91(this, 22));
        this.c = new qh0(context, 1);
        Iterator it = pv2.H(context, new fi1(14)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) next;
        this.f = new tk(2, this);
        this.g = true;
        zv1 zv1Var = this.b.s;
        zv1Var.a(new mu1(zv1Var));
        this.b.s.a(new j3(this.a));
    }

    public static void b(nu1 nu1Var, String str) {
        nu1Var.getClass();
        nu1Var.b.l(str, null);
    }

    public final int a() {
        mj mjVar = this.b.f;
        int i = 0;
        if (mjVar != null && mjVar.isEmpty()) {
            return 0;
        }
        Iterator it = mjVar.iterator();
        while (it.hasNext()) {
            if (!(((qt1) it.next()).g instanceof iu1) && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public final void c() {
        Bundle bundleA;
        Intent intent;
        if (a() != 1) {
            d();
            return;
        }
        Activity activity = this.d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        wt1 wt1Var = this.b;
        int i = 0;
        if (intArray == null) {
            fu1 fu1VarF = wt1Var.f();
            fu1VarF.getClass();
            int i2 = fu1VarF.g.a;
            for (iu1 iu1Var = fu1VarF.h; iu1Var != null; iu1Var = iu1Var.h) {
                yf yfVar = iu1Var.g;
                if (iu1Var.k.c != i2) {
                    Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        intent2.getClass();
                        bundleU.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                        iu1 iu1VarI = wt1Var.i();
                        Intent intent3 = activity.getIntent();
                        intent3.getClass();
                        eu1 eu1VarF = iu1VarI.f(new pi(intent3.getData(), intent3.getAction(), intent3.getType(), 12), iu1VarI);
                        if ((eu1VarF != null ? eu1VarF.g : null) != null && (bundleA = eu1VarF.f.a(eu1VarF.g)) != null) {
                            bundleU.putAll(bundleA);
                        }
                    }
                    qk qkVar = new qk(this);
                    int i3 = yfVar.a;
                    ArrayList arrayList = (ArrayList) qkVar.e;
                    arrayList.clear();
                    arrayList.add(new du1(i3, null));
                    if (((iu1) qkVar.d) != null) {
                        qkVar.o();
                    }
                    ((Intent) qkVar.c).putExtra("android-support-nav:controller:deepLinkExtras", bundleU);
                    qkVar.f().b();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                i2 = yfVar.a;
            }
            return;
        }
        if (this.e) {
            activity.getClass();
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            extras2.getClass();
            int[] intArray2 = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            intArray2.getClass();
            ArrayList arrayList2 = new ArrayList(intArray2.length);
            for (int i4 : intArray2) {
                arrayList2.add(Integer.valueOf(i4));
            }
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayList2.size() < 2) {
                return;
            }
            int iIntValue = ((Number) vx.i0(arrayList2)).intValue();
            if (parcelableArrayList != null) {
            }
            fu1 fu1VarD = wt1.d(iIntValue, wt1Var.g(), null, false);
            if (fu1VarD instanceof iu1) {
                int i5 = iu1.l;
                iIntValue = uq.o((iu1) fu1VarD).g.a;
            }
            fu1 fu1VarF2 = wt1Var.f();
            if (fu1VarF2 == null || iIntValue != fu1VarF2.g.a) {
                return;
            }
            qk qkVar2 = new qk(this);
            Bundle bundleU2 = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
            bundleU2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
            Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
            if (bundle != null) {
                bundleU2.putAll(bundle);
            }
            ((Intent) qkVar2.c).putExtra("android-support-nav:controller:deepLinkExtras", bundleU2);
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                int i7 = i + 1;
                if (i < 0) {
                    vr.b0();
                    throw null;
                }
                ((ArrayList) qkVar2.e).add(new du1(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
                if (((iu1) qkVar2.d) != null) {
                    qkVar2.o();
                }
                i = i7;
            }
            qkVar2.f().b();
            activity.finish();
        }
    }

    public final boolean d() {
        wt1 wt1Var = this.b;
        if (!wt1Var.f.isEmpty()) {
            fu1 fu1VarF = wt1Var.f();
            fu1VarF.getClass();
            if (wt1Var.m(fu1VarF.g.a, true, false) && wt1Var.b()) {
                return true;
            }
        }
        return false;
    }
}
