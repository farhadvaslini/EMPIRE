package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nb3 extends gq1 {
    public final Object a;
    public final Object b;
    public final Object[] c;
    public final PointerInputEventHandler d;

    public nb3(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.d = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb3)) {
            return false;
        }
        nb3 nb3Var = (nb3) obj;
        if (!s51.n(this.a, nb3Var.a) || !s51.n(this.b, nb3Var.b)) {
            return false;
        }
        Object[] objArr = nb3Var.c;
        Object[] objArr2 = this.c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.d == nb3Var.d;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new sb3(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        sb3 sb3Var = (sb3) aq1Var;
        Object obj = sb3Var.t;
        Object obj2 = this.a;
        boolean z = !s51.n(obj, obj2);
        sb3Var.t = obj2;
        Object obj3 = sb3Var.u;
        Object obj4 = this.b;
        if (!s51.n(obj3, obj4)) {
            z = true;
        }
        sb3Var.u = obj4;
        Object[] objArr = sb3Var.v;
        Object[] objArr2 = this.c;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        sb3Var.v = objArr2;
        Class<?> cls = sb3Var.w.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            sb3Var.r1();
        }
        sb3Var.w = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.c;
        return this.d.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
