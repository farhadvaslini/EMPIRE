package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class sh3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(sh3.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public tj0[] a;

    public final void a(tj0 tj0Var) {
        tj0Var.d((uj0) this);
        tj0[] tj0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (tj0VarArr == null) {
            tj0VarArr = new tj0[4];
            this.a = tj0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tj0VarArr.length) {
            tj0VarArr = (tj0[]) Arrays.copyOf(tj0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = tj0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        tj0VarArr[i] = tj0Var;
        tj0Var.g = i;
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tj0 b(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                tj0 tj0Var = objArr[i];
                tj0Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (tj0Var.compareTo(obj) < 0) {
                    d(i, i2);
                    c(i2);
                } else {
                    while (true) {
                        int i3 = i * 2;
                        int i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        Object[] objArr2 = this.a;
                        objArr2.getClass();
                        int i5 = i3 + 2;
                        if (i5 < atomicIntegerFieldUpdater.get(this)) {
                            Comparable comparable = objArr2[i5];
                            comparable.getClass();
                            Object obj2 = objArr2[i4];
                            obj2.getClass();
                            if (comparable.compareTo(obj2) >= 0) {
                                i5 = i4;
                            }
                            Comparable comparable2 = objArr2[i];
                            comparable2.getClass();
                            Comparable comparable3 = objArr2[i5];
                            comparable3.getClass();
                            if (comparable2.compareTo(comparable3) <= 0) {
                                break;
                            }
                            d(i, i5);
                            i = i5;
                        }
                    }
                }
            }
        }
        tj0 tj0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        tj0Var2.getClass();
        tj0Var2.d(null);
        tj0Var2.g = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return tj0Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            tj0[] tj0VarArr = this.a;
            tj0VarArr.getClass();
            int i2 = (i - 1) / 2;
            tj0 tj0Var = tj0VarArr[i2];
            tj0Var.getClass();
            tj0 tj0Var2 = tj0VarArr[i];
            tj0Var2.getClass();
            if (tj0Var.compareTo(tj0Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        tj0[] tj0VarArr = this.a;
        tj0VarArr.getClass();
        tj0 tj0Var = tj0VarArr[i2];
        tj0Var.getClass();
        tj0 tj0Var2 = tj0VarArr[i];
        tj0Var2.getClass();
        tj0VarArr[i] = tj0Var;
        tj0VarArr[i2] = tj0Var2;
        tj0Var.g = i;
        tj0Var2.g = i2;
    }
}
