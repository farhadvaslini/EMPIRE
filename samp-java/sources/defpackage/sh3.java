package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.tj0 b(int r9) {
        /*
            r8 = this;
            tj0[] r0 = r8.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.sh3.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            tj0[] r5 = r8.a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.d(r2)
            r9.g = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh3.b(int):tj0");
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
