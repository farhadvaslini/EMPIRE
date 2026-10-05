package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ux0 implements Iterable, t61 {
    public static final ux0 g = new ux0(new String[0]);
    public final String[] f;

    public ux0(String[] strArr) {
        strArr.getClass();
        this.f = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.f;
        strArr.getClass();
        int length = strArr.length - 2;
        int iM = g12.M(length, 0, -2);
        if (iM > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iM) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        String str = (String) uj.U(i * 2, this.f);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final tx0 c() {
        tx0 tx0Var = new tx0(0);
        ArrayList arrayList = tx0Var.a;
        arrayList.getClass();
        String[] strArr = this.f;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return tx0Var;
    }

    public final String e(int i) {
        String str = (String) uj.U((i * 2) + 1, this.f);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ux0) {
            return Arrays.equals(this.f, ((ux0) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        r32[] r32VarArr = new r32[size];
        for (int i = 0; i < size; i++) {
            r32VarArr[i] = new r32(b(i), e(i));
        }
        return new a0(1, r32VarArr);
    }

    public final int size() {
        return this.f.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strB = b(i);
            String strE = e(i);
            sb.append(strB);
            sb.append(": ");
            if (jv3.i(strB)) {
                strE = "██";
            }
            sb.append(strE);
            sb.append("\n");
        }
        return sb.toString();
    }
}
