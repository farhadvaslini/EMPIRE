package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pl implements q73, d3, cp3 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public pl(Typeface typeface, ap1 ap1Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f = 5;
        this.j = typeface;
        this.g = ap1Var;
        this.i = new bp1(1024);
        int iA = ap1Var.a(6);
        if (iA != 0) {
            int i5 = iA + ap1Var.f;
            i = ((ByteBuffer) ap1Var.i).getInt(((ByteBuffer) ap1Var.i).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.h = new char[i * 2];
        int iA2 = ap1Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + ap1Var.f;
            i2 = ((ByteBuffer) ap1Var.i).getInt(((ByteBuffer) ap1Var.i).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            jl3 jl3Var = new jl3(this, i7);
            zo1 zo1VarB = jl3Var.b();
            int iA3 = zo1VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) zo1VarB.i).getInt(iA3 + zo1VarB.f) : 0, (char[]) this.h, i7 * 2);
            zo1 zo1VarB2 = jl3Var.b();
            int iA4 = zo1VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + zo1VarB2.f;
                i3 = ((ByteBuffer) zo1VarB2.i).getInt(((ByteBuffer) zo1VarB2.i).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                c.p("invalid metadata codepoint length");
                throw null;
            }
            bp1 bp1Var = (bp1) this.i;
            zo1 zo1VarB3 = jl3Var.b();
            int iA5 = zo1VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + zo1VarB3.f;
                i4 = ((ByteBuffer) zo1VarB3.i).getInt(((ByteBuffer) zo1VarB3.i).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            bp1Var.a(jl3Var, 0, i4 - 1);
        }
    }

    public static void B(pl plVar, fj2 fj2Var, ij2 ij2Var, fj2 fj2Var2, int i) {
        yl1 yl1Var;
        if ((i & 1) != 0) {
            fj2Var = null;
        }
        if ((i & 2) != 0) {
            ij2Var = null;
        }
        if ((i & 4) != 0) {
            fj2Var2 = null;
        }
        plVar.getClass();
        TimeZone timeZone = lv3.a;
        boolean zIsShutdown = ((ThreadPoolExecutor) plVar.j()).isShutdown();
        synchronized (plVar) {
            if (ij2Var != null) {
                try {
                    if (!((ArrayDeque) plVar.j).remove(ij2Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (fj2Var2 != null) {
                fj2Var2.g.decrementAndGet();
                if (!((ArrayDeque) plVar.i).remove(fj2Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (fj2Var != null) {
                ((ArrayDeque) plVar.h).add(fj2Var);
                fj2 fj2VarN = plVar.n(fj2Var.h.g.a.d);
                if (fj2VarN != null) {
                    fj2Var.g = fj2VarN.g;
                }
            }
            if ((ij2Var != null || fj2Var2 != null) && (zIsShutdown || ((ArrayDeque) plVar.i).isEmpty())) {
                ((ArrayDeque) plVar.j).isEmpty();
            }
            int i2 = 22;
            if (zIsShutdown) {
                List listN0 = qx.N0((ArrayDeque) plVar.h);
                ((ArrayDeque) plVar.h).clear();
                yl1Var = new yl1(i2, listN0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) plVar.h).iterator();
                it.getClass();
                while (it.hasNext()) {
                    fj2 fj2Var3 = (fj2) it.next();
                    if (((ArrayDeque) plVar.i).size() >= 64) {
                        break;
                    }
                    if (fj2Var3.g.get() < 5) {
                        it.remove();
                        fj2Var3.g.incrementAndGet();
                        arrayList.add(fj2Var3);
                        ((ArrayDeque) plVar.i).add(fj2Var3);
                    }
                }
                yl1Var = new yl1(i2, arrayList);
            }
        }
        int size = ((List) yl1Var.g).size();
        boolean z = true;
        for (int i3 = 0; i3 < size; i3++) {
            fj2 fj2Var4 = (fj2) ((List) yl1Var.g).get(i3);
            if (fj2Var4 == fj2Var) {
                z = false;
            } else {
                fj2Var4.h.i.getClass();
            }
            if (zIsShutdown) {
                fj2Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                ij2 ij2Var2 = fj2Var4.h;
                ij2Var2.j(interruptedIOException);
                fj2Var4.f.b(ij2Var2, interruptedIOException);
            } else {
                ExecutorService executorServiceJ = plVar.j();
                fj2Var4.getClass();
                ij2 ij2Var3 = fj2Var4.h;
                ij2Var3.f.a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceJ).execute(fj2Var4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        ij2 ij2Var4 = fj2Var4.h;
                        ij2Var4.j(interruptedIOException2);
                        fj2Var4.f.b(ij2Var4, interruptedIOException2);
                        pl plVar2 = ij2Var3.f.a;
                        plVar2.getClass();
                        B(plVar2, null, null, fj2Var4, 3);
                    }
                } catch (Throwable th2) {
                    pl plVar3 = ij2Var3.f.a;
                    plVar3.getClass();
                    B(plVar3, null, null, fj2Var4, 3);
                    throw th2;
                }
            }
        }
        if (!z || fj2Var == null) {
            return;
        }
        fj2Var.h.i.getClass();
    }

    public void A(String str) {
        str.getClass();
        if (str.length() <= 0) {
            c.p("method.isEmpty() == true");
            return;
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
            c.g(nc2.i("method ", str, " must have a request body."));
        } else {
            this.h = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(q40 q40Var) throws Throwable {
        ip2 ip2Var;
        bt1 bt1Var;
        Throwable th;
        bt1 bt1Var2;
        gz gzVar = (gz) this.h;
        if (q40Var instanceof ip2) {
            ip2Var = (ip2) q40Var;
            int i = ip2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ip2Var.l = i - Integer.MIN_VALUE;
            } else {
                ip2Var = new ip2(this, q40Var);
            }
        }
        Object obj = ip2Var.j;
        int i2 = ip2Var.l;
        dm3 dm3Var = dm3.a;
        Object obj2 = y50.f;
        try {
            if (i2 == 0) {
                y02.Q(obj);
                if (!(gzVar.S() instanceof g11)) {
                    return dm3Var;
                }
                dt1 dt1Var = (dt1) this.g;
                ip2Var.i = dt1Var;
                ip2Var.l = 1;
                Object objF = dt1Var.f(ip2Var);
                bt1Var = dt1Var;
                if (objF != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bt1Var2 = ip2Var.i;
                try {
                    y02.Q(obj);
                    bt1Var2 = bt1Var2;
                    gzVar.Y(dm3Var);
                    ((dt1) bt1Var2).i(null);
                    return dm3Var;
                } catch (Throwable th2) {
                    th = th2;
                    ((dt1) bt1Var2).i(null);
                    throw th;
                }
            }
            bt1 bt1Var3 = ip2Var.i;
            y02.Q(obj);
            bt1Var = bt1Var3;
            if (!(gzVar.S() instanceof g11)) {
                ((dt1) bt1Var).i(null);
                return dm3Var;
            }
            ip2Var.i = bt1Var;
            ip2Var.l = 2;
            if (g(ip2Var) != obj2) {
                bt1Var2 = bt1Var;
                gzVar.Y(dm3Var);
                ((dt1) bt1Var2).i(null);
                return dm3Var;
            }
            return obj2;
        } catch (Throwable th3) {
            bt1 bt1Var4 = bt1Var;
            th = th3;
            bt1Var2 = bt1Var4;
            ((dt1) bt1Var2).i(null);
            throw th;
        }
    }

    public void D(za2 za2Var) {
        if (((lb2) this.h) == lb2.g) {
            ab1 ab1Var = (ab1) this.g;
            if (ab1Var == null) {
                c.q("layoutCoordinates not set");
                return;
            } else {
                n32.A(za2Var, ab1Var.k0(0L), new xc1(16, (mb2) this.j), true);
            }
        }
        this.h = lb2.h;
    }

    public void E(String str) {
        str.getClass();
        if (fa3.e0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (fa3.e0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        g01 g01Var = new g01();
        g01Var.c(null, str);
        this.g = g01Var.a();
    }

    @Override // defpackage.zo3
    public long b(ue ueVar, ue ueVar2, ue ueVar3) {
        int iB = ueVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((ve) this.g).get(i).d(ueVar.a(i), ueVar2.a(i), ueVar3.a(i)));
        }
        return jMax;
    }

    @Override // defpackage.q73
    public z73 c() {
        return (s90) this.i;
    }

    @Override // defpackage.d3
    public boolean d(e3 e3Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.g;
        ya3 ya3VarT = t(e3Var);
        w33 w33Var = (w33) this.j;
        Menu to1Var = (Menu) w33Var.get(menu);
        if (to1Var == null) {
            to1Var = new to1((Context) this.h, (nn1) menu);
            w33Var.put(menu, to1Var);
        }
        return callback.onCreateActionMode(ya3VarT, to1Var);
    }

    @Override // defpackage.d3
    public boolean e(e3 e3Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.g).onActionItemClicked(t(e3Var), new ao1((Context) this.h, (cb3) menuItem));
    }

    public void f(za2 za2Var, boolean z) {
        mb2 mb2Var = (mb2) this.j;
        List list = za2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((gb2) list.get(i)).c()) {
                D(za2Var);
                return;
            }
        }
        ab1 ab1Var = (ab1) this.g;
        if (ab1Var == null) {
            c.q("layoutCoordinates not set");
            return;
        }
        n32.A(za2Var, ab1Var.k0(0L), new er1(8, this, mb2Var), false);
        if (((lb2) this.h) == lb2.g) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((gb2) list.get(i2)).a();
                }
            }
            g51 g51Var = za2Var.b;
            if (g51Var != null) {
                g51Var.b = !mb2Var.c;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(q40 q40Var) {
        g70 g70Var;
        a70 a70Var;
        b80 b80Var = (b80) this.j;
        if (q40Var instanceof g70) {
            g70Var = (g70) q40Var;
            int i = g70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                g70Var.k = i - Integer.MIN_VALUE;
            } else {
                g70Var = new g70(this, q40Var);
            }
        }
        Object objH = g70Var.i;
        int i2 = g70Var.k;
        if (i2 == 0) {
            y02.Q(objH);
            List list = (List) this.i;
            y50 y50Var = y50.f;
            if (list == null || list.isEmpty()) {
                g70Var.k = 1;
                objH = b80.h(b80Var, false, g70Var);
            } else {
                c43 c43VarI = b80Var.i();
                j70 j70Var = new j70(b80Var, this, null);
                g70Var.k = 2;
                objH = c43VarI.b(j70Var, g70Var);
            }
            return y50Var;
        }
        if (i2 == 1) {
            y02.Q(objH);
            a70Var = (a70) objH;
        } else {
            if (i2 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objH);
            a70Var = (a70) objH;
        }
        b80Var.g.I(a70Var);
        return dm3.a;
    }

    @Override // defpackage.d3
    public boolean h(e3 e3Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.g;
        ya3 ya3VarT = t(e3Var);
        w33 w33Var = (w33) this.j;
        Menu to1Var = (Menu) w33Var.get(menu);
        if (to1Var == null) {
            to1Var = new to1((Context) this.h, (nn1) menu);
            w33Var.put(menu, to1Var);
        }
        return callback.onPrepareActionMode(ya3VarT, to1Var);
    }

    @Override // defpackage.d3
    public void i(e3 e3Var) {
        ((ActionMode.Callback) this.g).onDestroyActionMode(t(e3Var));
    }

    public synchronized ExecutorService j() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.g) == null) {
                this.g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new kv3(lv3.b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.g;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    @Override // defpackage.zo3
    public ue l(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        if (((ue) this.i) == null) {
            this.i = ueVar3.c();
        }
        ue ueVar4 = (ue) this.i;
        if (ueVar4 == null) {
            s51.F("velocityVector");
            throw null;
        }
        int iB = ueVar4.b();
        int i = 0;
        while (true) {
            ue ueVar5 = (ue) this.i;
            if (i >= iB) {
                if (ueVar5 != null) {
                    return ueVar5;
                }
                s51.F("velocityVector");
                throw null;
            }
            if (ueVar5 == null) {
                s51.F("velocityVector");
                throw null;
            }
            ueVar5.e(((ve) this.g).get(i).c(j, ueVar.a(i), ueVar2.a(i), ueVar3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.q73
    public g43 m() {
        return (r90) this.j;
    }

    public fj2 n(String str) {
        Iterator it = ((ArrayDeque) this.i).iterator();
        it.getClass();
        while (it.hasNext()) {
            fj2 fj2Var = (fj2) it.next();
            if (s51.n(fj2Var.h.g.a.d, str)) {
                return fj2Var;
            }
        }
        Iterator it2 = ((ArrayDeque) this.h).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            fj2 fj2Var2 = (fj2) it2.next();
            if (s51.n(fj2Var2.h.g.a.d, str)) {
                return fj2Var2;
            }
        }
        return null;
    }

    @Override // defpackage.zo3
    public ue p(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        if (((ue) this.h) == null) {
            this.h = ueVar.c();
        }
        ue ueVar4 = (ue) this.h;
        if (ueVar4 == null) {
            s51.F("valueVector");
            throw null;
        }
        int iB = ueVar4.b();
        int i = 0;
        while (true) {
            ue ueVar5 = (ue) this.h;
            if (i >= iB) {
                if (ueVar5 != null) {
                    return ueVar5;
                }
                s51.F("valueVector");
                throw null;
            }
            if (ueVar5 == null) {
                s51.F("valueVector");
                throw null;
            }
            ueVar5.e(((ve) this.g).get(i).b(j, ueVar.a(i), ueVar2.a(i), ueVar3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.zo3
    public ue q(ue ueVar, ue ueVar2, ue ueVar3) {
        if (((ue) this.j) == null) {
            this.j = ueVar3.c();
        }
        ue ueVar4 = (ue) this.j;
        if (ueVar4 == null) {
            s51.F("endVelocityVector");
            throw null;
        }
        int iB = ueVar4.b();
        int i = 0;
        while (true) {
            ue ueVar5 = (ue) this.j;
            if (i >= iB) {
                if (ueVar5 != null) {
                    return ueVar5;
                }
                s51.F("endVelocityVector");
                throw null;
            }
            if (ueVar5 == null) {
                s51.F("endVelocityVector");
                throw null;
            }
            ueVar5.e(((ve) this.g).get(i).e(ueVar.a(i), ueVar2.a(i), ueVar3.a(i)), i);
            i++;
        }
    }

    public void r() {
        Iterator it = ((HashMap) this.h).values().iterator();
        while (it.hasNext()) {
            nc2.u(it.next());
        }
    }

    public void s() {
        A("GET");
    }

    public ya3 t(e3 e3Var) {
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ya3 ya3Var = (ya3) arrayList.get(i);
            if (ya3Var != null && ya3Var.b == e3Var) {
                return ya3Var;
            }
        }
        ya3 ya3Var2 = new ya3((Context) this.h, e3Var);
        arrayList.add(ya3Var2);
        return ya3Var2;
    }

    public String toString() {
        switch (this.f) {
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                String string = ((Socket) this.g).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    public ArrayList u() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashMap) this.h).values().iterator();
        while (it.hasNext()) {
            nc2.u(it.next());
        }
        return arrayList;
    }

    public List v() {
        ArrayList arrayList;
        if (((ArrayList) this.g).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.g)) {
            arrayList = new ArrayList((ArrayList) this.g);
        }
        return arrayList;
    }

    public ue w(ue ueVar, ue ueVar2) {
        pl plVar = this;
        if (((ue) plVar.j) == null) {
            plVar.j = ueVar.c();
        }
        ue ueVar3 = (ue) plVar.j;
        if (ueVar3 == null) {
            s51.F("targetVector");
            throw null;
        }
        int iB = ueVar3.b();
        int i = 0;
        while (true) {
            ue ueVar4 = (ue) plVar.j;
            if (i >= iB) {
                if (ueVar4 != null) {
                    return ueVar4;
                }
                s51.F("targetVector");
                throw null;
            }
            if (ueVar4 == null) {
                s51.F("targetVector");
                throw null;
            }
            k71 k71Var = (k71) plVar.g;
            float fA = ueVar.a(i);
            float fA2 = ueVar2.a(i);
            wj wjVar = (wj) k71Var.g;
            double dB = wjVar.b(fA2);
            double d = tm0.a;
            float f = wjVar.a * wjVar.b;
            ueVar4.e((Math.signum(fA2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) f)))) + fA, i);
            i++;
            plVar = this;
            iB = iB;
        }
    }

    public ue x(long j, ue ueVar, ue ueVar2) {
        if (((ue) this.i) == null) {
            this.i = ueVar.c();
        }
        ue ueVar3 = (ue) this.i;
        if (ueVar3 == null) {
            s51.F("velocityVector");
            throw null;
        }
        int iB = ueVar3.b();
        int i = 0;
        while (true) {
            ue ueVar4 = (ue) this.i;
            if (i >= iB) {
                if (ueVar4 != null) {
                    return ueVar4;
                }
                s51.F("velocityVector");
                throw null;
            }
            if (ueVar4 == null) {
                s51.F("velocityVector");
                throw null;
            }
            k71 k71Var = (k71) this.g;
            ueVar.getClass();
            long j2 = j / 1000000;
            sm0 sm0VarA = ((wj) k71Var.g).a(ueVar2.a(i));
            long j3 = sm0VarA.c;
            ueVar4.e((((Math.signum(sm0VarA.a) * b9.a(j3 > 0 ? j2 / j3 : 1.0f).b) * sm0VarA.b) / j3) * 1000.0f, i);
            i++;
        }
    }

    public vq3 y(lu luVar, String str) {
        vq3 vq3Var;
        boolean zIsInstance;
        vq3 vq3VarA;
        synchronized (((ak2) this.j)) {
            try {
                vq3Var = (vq3) ((br3) this.g).a.get(str);
                Class clsU = luVar.a;
                clsU.getClass();
                Map map = lu.b;
                map.getClass();
                Integer num = (Integer) map.get(clsU);
                if (num != null) {
                    zIsInstance = cl3.q(num.intValue(), vq3Var);
                } else {
                    if (clsU.isPrimitive()) {
                        clsU = uq.u(rk2.a(clsU));
                    }
                    zIsInstance = clsU.isInstance(vq3Var);
                }
                if (zIsInstance) {
                    zq3 zq3Var = (zq3) this.h;
                    if (zq3Var instanceof xq2) {
                        xq2 xq2Var = (xq2) zq3Var;
                        vq3Var.getClass();
                        gf1 gf1Var = xq2Var.d;
                        if (gf1Var != null) {
                            tq2 tq2Var = xq2Var.e;
                            tq2Var.getClass();
                            vp.q(vq3Var, tq2Var, gf1Var);
                        }
                    }
                    vq3Var.getClass();
                } else {
                    lr1 lr1Var = new lr1((e60) this.i);
                    lr1Var.a.put(r51.O1, str);
                    zq3 zq3Var2 = (zq3) this.h;
                    try {
                        try {
                            vq3VarA = zq3Var2.c(luVar, lr1Var);
                        } catch (AbstractMethodError unused) {
                            vq3VarA = zq3Var2.b(uq.t(luVar), lr1Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        vq3VarA = zq3Var2.a(uq.t(luVar));
                    }
                    vq3Var = vq3VarA;
                    br3 br3Var = (br3) this.g;
                    br3Var.getClass();
                    vq3Var.getClass();
                    vq3 vq3Var2 = (vq3) br3Var.a.put(str, vq3Var);
                    if (vq3Var2 != null) {
                        vq3Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vq3Var;
    }

    public void z(String str, String str2) {
        str2.getClass();
        tx0 tx0Var = (tx0) this.i;
        tx0Var.getClass();
        d32.r(str);
        d32.s(str2, str);
        tx0Var.m(str);
        d32.j(tx0Var, str, str2);
    }

    public /* synthetic */ pl(boolean z) {
        this.f = 7;
    }

    public pl(x50 x50Var, s sVar, z00 z00Var, j jVar) {
        this.f = 8;
        this.g = x50Var;
        this.h = jVar;
        this.i = lr.a(Integer.MAX_VALUE, 6, null);
        this.j = new yl1(8);
        j61 j61Var = (j61) x50Var.h().m(f5.b0);
        if (j61Var != null) {
            j61Var.r(new v1(sVar, this, z00Var, 26));
        }
    }

    public pl(br3 br3Var, zq3 zq3Var, e60 e60Var) {
        this.f = 13;
        br3Var.getClass();
        e60Var.getClass();
        this.g = br3Var;
        this.h = zq3Var;
        this.i = e60Var;
        this.j = new ak2(12);
    }

    public pl(Socket socket) {
        this.f = 2;
        this.g = socket;
        this.h = new AtomicInteger();
        this.i = new s90(this);
        this.j = new r90(this);
    }

    public pl(mb2 mb2Var) {
        this.f = 6;
        this.j = mb2Var;
        this.h = lb2.f;
    }

    public pl(int i) {
        this.f = i;
        switch (i) {
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                this.g = new ArrayList();
                this.h = new HashMap();
                this.i = new HashMap();
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                this.j = f5.U;
                this.h = "GET";
                this.i = new tx0(0);
                break;
            default:
                this.h = new ArrayDeque();
                this.i = new ArrayDeque();
                this.j = new ArrayDeque();
                break;
        }
    }

    public /* synthetic */ pl(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public pl(Context context, ActionMode.Callback callback) {
        this.f = 9;
        this.h = context;
        this.g = callback;
        this.i = new ArrayList();
        this.j = new w33(0);
    }

    public pl(cs0 cs0Var, bq1 bq1Var, nb0 nb0Var, d00 d00Var) {
        this.f = 0;
        this.g = cs0Var;
        this.h = bq1Var;
        this.i = nb0Var;
        this.j = d00Var;
    }

    public pl(b80 b80Var, List list) {
        this.f = 1;
        this.j = b80Var;
        this.g = new dt1();
        this.h = vr.b();
        this.i = qx.N0(list);
    }

    public pl(long j, long j2, long j3) {
        this.f = 10;
        this.g = b32.w(new h43(j));
        this.h = b32.w(new gy1(j2));
        this.i = b32.w(new gy1(j3));
        this.j = b32.w(new gy1(j2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pl(wm0 wm0Var) {
        this(11, new k71(28, wm0Var));
        this.f = 11;
    }
}
