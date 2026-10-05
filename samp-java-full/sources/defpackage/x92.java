package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x92 extends mb3 implements rs0 {
    public dt1 j;
    public y92 k;
    public String l;
    public boolean m;
    public int n;
    public final /* synthetic */ y92 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x92(y92 y92Var, boolean z, String str, p40 p40Var) {
        super(2, p40Var);
        this.o = y92Var;
        this.p = z;
        this.q = str;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((x92) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new x92(this.o, this.p, this.q, p40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:17:0x004d, B:18:0x005b, B:20:0x0061, B:26:0x0077, B:30:0x007e, B:33:0x0087, B:36:0x0090, B:41:0x009a, B:43:0x00a5, B:45:0x00ab, B:49:0x00b3, B:51:0x00d8, B:53:0x00dc), top: B:59:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:17:0x004d, B:18:0x005b, B:20:0x0061, B:26:0x0077, B:30:0x007e, B:33:0x0087, B:36:0x0090, B:41:0x009a, B:43:0x00a5, B:45:0x00ab, B:49:0x00b3, B:51:0x00d8, B:53:0x00dc), top: B:59:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:17:0x004d, B:18:0x005b, B:20:0x0061, B:26:0x0077, B:30:0x007e, B:33:0x0087, B:36:0x0090, B:41:0x009a, B:43:0x00a5, B:45:0x00ab, B:49:0x00b3, B:51:0x00d8, B:53:0x00dc), top: B:59:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:17:0x004d, B:18:0x005b, B:20:0x0061, B:26:0x0077, B:30:0x007e, B:33:0x0087, B:36:0x0090, B:41:0x009a, B:43:0x00a5, B:45:0x00ab, B:49:0x00b3, B:51:0x00d8, B:53:0x00dc), top: B:59:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0076 A[SYNTHETIC] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        dt1 dt1Var;
        String str;
        boolean z;
        Iterator it;
        Object next;
        y31 y31Var;
        ka2 ka2Var;
        File parentFile;
        int i = this.n;
        y92 y92Var = this.o;
        boolean z2 = true;
        y50 y50Var = y50.f;
        if (i == 0) {
            y02.Q(obj);
            this.n = 1;
            if (y92Var.c(this) != y50Var) {
            }
            return y50Var;
        }
        if (i != 1) {
            if (i != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.m;
            String str2 = this.l;
            y92 y92Var2 = this.k;
            dt1Var = this.j;
            y02.Q(obj);
            str = str2;
            y92Var = y92Var2;
            try {
                i93 i93Var = y92Var.f;
                File file = y92Var.b;
                it = ((Iterable) i93Var.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (s51.n(((y31) next).a.b, str)) {
                        break;
                    }
                }
                y31Var = (y31) next;
                ka2Var = ka2.g;
                if (y31Var != null && (parentFile = y31Var.b.getParentFile()) != null && y92.g(parentFile, y92Var.a) && em0.W(parentFile)) {
                    if (z) {
                        File file2 = new File(file, str);
                        if (y92.g(file2, file) && file2.exists() && !em0.W(file2)) {
                            z2 = false;
                        }
                    }
                    y92Var.s(str, false);
                    SharedPreferences sharedPreferences = y92Var.d;
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.getClass();
                    editorEdit.remove(y92.b(str));
                    editorEdit.remove(y92.r(str));
                    editorEdit.apply();
                    y92Var.k();
                    ka2Var = !z2 ? ka2.f : ka2.h;
                }
                return ka2Var;
            } finally {
                dt1Var.i(null);
            }
        }
        y02.Q(obj);
        dt1 dt1Var2 = y92Var.e;
        this.j = dt1Var2;
        this.k = y92Var;
        String str3 = this.q;
        this.l = str3;
        boolean z3 = this.p;
        this.m = z3;
        this.n = 2;
        if (dt1Var2.f(this) != y50Var) {
            dt1Var = dt1Var2;
            str = str3;
            z = z3;
            i93 i93Var2 = y92Var.f;
            File file3 = y92Var.b;
            it = ((Iterable) i93Var2.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            y31Var = (y31) next;
            ka2Var = ka2.g;
            if (y31Var != null) {
                if (z) {
                }
                y92Var.s(str, false);
                SharedPreferences sharedPreferences2 = y92Var.d;
                sharedPreferences2.getClass();
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.getClass();
                editorEdit2.remove(y92.b(str));
                editorEdit2.remove(y92.r(str));
                editorEdit2.apply();
                y92Var.k();
                ka2Var = !z2 ? ka2.f : ka2.h;
            }
            return ka2Var;
        }
        return y50Var;
    }
}
