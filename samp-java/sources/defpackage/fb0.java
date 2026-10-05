package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fb0 extends RuntimeException {
    public final t10 f;

    public fb0(t10 t10Var) {
        this.f = t10Var;
        if (t10Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = t10Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            v10 v10Var = (v10) list.get(i);
            int i3 = v10Var.a;
            int i4 = 0;
            while (true) {
                if (i4 >= 9) {
                    i4 = -1;
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                if (v10Var.a == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((v10) list.get(i5)).a == 1000) {
                        break;
                    } else {
                        vx.j0(arrayList);
                    }
                } else {
                    arrayList.add(v10Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            stackTraceElementArr[i6] = new StackTraceElement("$$compose", by1.e(((v10) arrayList.get(i6)).a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        t10 t10Var = this.f;
        if (!t10Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        ai1 ai1VarX = vr.x();
        List list = t10Var.a;
        list.getClass();
        qm1 qm1Var = new qm1(list);
        int iA = qm1Var.a();
        for (int i = 0; i < iA; i++) {
            ((v10) qm1Var.get(i)).getClass();
        }
        ai1 ai1VarR = vr.r(ai1VarX);
        ai1VarR.getClass();
        qm1 qm1Var2 = new qm1(ai1VarR);
        int iA2 = qm1Var2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            String str = (String) qm1Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
