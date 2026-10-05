package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jl3 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final pl b;
    public volatile int c = 0;

    public jl3(pl plVar, int i) {
        this.b = plVar;
        this.a = i;
    }

    public final int a(int i) {
        zo1 zo1VarB = b();
        int iA = zo1VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) zo1VarB.i;
        int i2 = iA + zo1VarB.f;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final zo1 b() {
        ThreadLocal threadLocal = d;
        zo1 zo1Var = (zo1) threadLocal.get();
        if (zo1Var == null) {
            zo1Var = new zo1();
            threadLocal.set(zo1Var);
        }
        ap1 ap1Var = (ap1) this.b.g;
        int iA = ap1Var.a(6);
        if (iA != 0) {
            int i = iA + ap1Var.f;
            int i2 = (this.a * 4) + ((ByteBuffer) ap1Var.i).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ap1Var.i).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ap1Var.i;
            zo1Var.i = byteBuffer;
            if (byteBuffer != null) {
                zo1Var.f = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                zo1Var.g = i4;
                zo1Var.h = ((ByteBuffer) zo1Var.i).getShort(i4);
                return zo1Var;
            }
            zo1Var.f = 0;
            zo1Var.g = 0;
            zo1Var.h = 0;
        }
        return zo1Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        zo1 zo1VarB = b();
        int iA = zo1VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) zo1VarB.i).getInt(iA + zo1VarB.f) : 0));
        sb.append(", codepoints:");
        zo1 zo1VarB2 = b();
        int iA2 = zo1VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + zo1VarB2.f;
            i = ((ByteBuffer) zo1VarB2.i).getInt(((ByteBuffer) zo1VarB2.i).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
