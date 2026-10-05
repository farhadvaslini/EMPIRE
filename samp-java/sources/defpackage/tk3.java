package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tk3 {
    public static final tk3 e = new tk3(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final h01 c;
    public Object[] d;

    public tk3(int i, int i2, Object[] objArr, h01 h01Var) {
        this.a = i;
        this.b = i2;
        this.c = h01Var;
        this.d = objArr;
    }

    public static tk3 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, h01 h01Var) {
        if (i3 > 30) {
            return new tk3(0, 0, new Object[]{obj, obj2, obj3, obj4}, h01Var);
        }
        int iY = oz2.y(i, i3);
        int iY2 = oz2.y(i2, i3);
        if (iY != iY2) {
            return new tk3((1 << iY) | (1 << iY2), 0, iY < iY2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, h01Var);
        }
        return new tk3(0, 1 << iY, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, h01Var)}, h01Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, h01 h01Var) {
        Object obj3 = this.d[i];
        tk3 tk3VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, h01Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        uj.L(objArr, objArr2, 0, i, 6);
        uj.J(objArr, objArr2, i, i + 2, i5);
        objArr2[iT - 1] = tk3VarJ;
        uj.J(objArr, objArr2, iT, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        j41 j41VarN = y02.N(y02.S(0, this.d.length), 2);
        int i = j41VarN.f;
        int i2 = j41VarN.g;
        int i3 = j41VarN.h;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!s51.n(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iY = 1 << oz2.y(i, i2);
        if (h(iY)) {
            return s51.n(obj, this.d[f(iY)]);
        }
        if (!i(iY)) {
            return false;
        }
        tk3 tk3VarS = s(t(iY));
        return i2 == 30 ? tk3VarS.c(obj) : tk3VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(tk3 tk3Var) {
        if (this == tk3Var) {
            return true;
        }
        if (this.b == tk3Var.b && this.a == tk3Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == tk3Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iY = 1 << oz2.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            if (s51.n(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iY)) {
            return null;
        }
        tk3 tk3VarS = s(t(iY));
        if (i2 != 30) {
            return tk3VarS.g(i, i2 + 5, obj);
        }
        j41 j41VarN = y02.N(y02.S(0, tk3VarS.d.length), 2);
        int i3 = j41VarN.f;
        int i4 = j41VarN.g;
        int i5 = j41VarN.h;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!s51.n(obj, tk3VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return tk3VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final tk3 k(int i, q52 q52Var) {
        q52Var.c(q52Var.k - 1);
        q52Var.i = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != q52Var.g) {
            return new tk3(0, 0, oz2.m(i, objArr), q52Var.g);
        }
        this.d = oz2.m(i, objArr);
        return this;
    }

    public final tk3 l(int i, Object obj, Object obj2, int i2, q52 q52Var) {
        q52 q52Var2;
        tk3 tk3VarL;
        int iY = 1 << oz2.y(i, i2);
        boolean zH = h(iY);
        h01 h01Var = this.c;
        if (zH) {
            int iF = f(iY);
            if (!s51.n(obj, this.d[iF])) {
                q52Var.c(q52Var.k + 1);
                h01 h01Var2 = q52Var.g;
                if (h01Var != h01Var2) {
                    return new tk3(this.a ^ iY, this.b | iY, a(iF, iY, i, obj, obj2, i2, h01Var2), h01Var2);
                }
                this.d = a(iF, iY, i, obj, obj2, i2, h01Var2);
                this.a ^= iY;
                this.b |= iY;
                return this;
            }
            q52Var.i = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (h01Var == q52Var.g) {
                this.d[iF + 1] = obj2;
                return this;
            }
            q52Var.j++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new tk3(this.a, this.b, objArrCopyOf, q52Var.g);
        }
        if (!i(iY)) {
            q52Var.c(q52Var.k + 1);
            h01 h01Var3 = q52Var.g;
            int iF2 = f(iY);
            Object[] objArr2 = this.d;
            if (h01Var != h01Var3) {
                return new tk3(this.a | iY, this.b, oz2.k(objArr2, iF2, obj, obj2), h01Var3);
            }
            this.d = oz2.k(objArr2, iF2, obj, obj2);
            this.a |= iY;
            return this;
        }
        int iT = t(iY);
        tk3 tk3VarS = s(iT);
        if (i2 == 30) {
            j41 j41VarN = y02.N(y02.S(0, tk3VarS.d.length), 2);
            int i3 = j41VarN.f;
            int i4 = j41VarN.g;
            int i5 = j41VarN.h;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                q52Var.c(q52Var.k + 1);
                tk3VarL = new tk3(0, 0, oz2.k(tk3VarS.d, 0, obj, obj2), q52Var.g);
                q52Var2 = q52Var;
            } else {
                while (!s51.n(obj, tk3VarS.d[i3])) {
                    if (i3 == i4) {
                        q52Var.c(q52Var.k + 1);
                        tk3VarL = new tk3(0, 0, oz2.k(tk3VarS.d, 0, obj, obj2), q52Var.g);
                        break;
                    }
                    i3 += i5;
                }
                q52Var.i = tk3VarS.x(i3);
                if (tk3VarS.c == q52Var.g) {
                    tk3VarS.d[i3 + 1] = obj2;
                    tk3VarL = tk3VarS;
                } else {
                    q52Var.j++;
                    Object[] objArr3 = tk3VarS.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    tk3VarL = new tk3(0, 0, objArrCopyOf2, q52Var.g);
                }
                q52Var2 = q52Var;
            }
        } else {
            q52Var2 = q52Var;
            tk3VarL = tk3VarS.l(i, obj, obj2, i2 + 5, q52Var2);
        }
        return tk3VarS == tk3VarL ? this : r(iT, tk3VarL, q52Var2.g);
    }

    public final tk3 m(tk3 tk3Var, int i, ta0 ta0Var, q52 q52Var) {
        Object[] objArr;
        tk3 tk3VarJ;
        if (this == tk3Var) {
            ta0Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            h01 h01Var = q52Var.g;
            int i3 = tk3Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + tk3Var.d.length);
            int length = this.d.length;
            j41 j41VarN = y02.N(y02.S(0, tk3Var.d.length), 2);
            int i4 = j41VarN.f;
            int i5 = j41VarN.g;
            int i6 = j41VarN.h;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(tk3Var.d[i4])) {
                        ta0Var.a++;
                    } else {
                        Object[] objArr3 = tk3Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == tk3Var.d.length ? tk3Var : length == objArrCopyOf.length ? new tk3(0, 0, objArrCopyOf, h01Var) : new tk3(0, 0, Arrays.copyOf(objArrCopyOf, length), h01Var);
            }
        } else {
            int i7 = this.b | tk3Var.b;
            int i8 = this.a;
            int i9 = tk3Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (s51.n(this.d[f(iLowestOneBit)], tk3Var.d[tk3Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                yb2.b("Check failed.");
            }
            tk3 tk3Var2 = (s51.n(this.c, q52Var.g) && this.a == i12 && this.b == i7) ? this : new tk3(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = tk3Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    tk3VarJ = s(t(iLowestOneBit2));
                    if (tk3Var.i(iLowestOneBit2)) {
                        tk3VarJ = tk3VarJ.m(tk3Var.s(tk3Var.t(iLowestOneBit2)), i + 5, ta0Var, q52Var);
                        objArr = objArr4;
                    } else if (tk3Var.h(iLowestOneBit2)) {
                        int iF = tk3Var.f(iLowestOneBit2);
                        Object obj = tk3Var.d[iF];
                        Object objX = tk3Var.x(iF);
                        int i15 = q52Var.k;
                        objArr = objArr4;
                        tk3VarJ = tk3VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, q52Var);
                        if (q52Var.k == i15) {
                            ta0Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (tk3Var.i(iLowestOneBit2)) {
                        tk3 tk3VarS = tk3Var.s(tk3Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (tk3VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                ta0Var.a++;
                                tk3VarJ = tk3VarS;
                            } else {
                                tk3VarJ = tk3VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, q52Var);
                            }
                        } else {
                            tk3VarJ = tk3VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = tk3Var.f(iLowestOneBit2);
                        Object obj4 = tk3Var.d[iF4];
                        tk3VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, tk3Var.x(iF4), i + 5, q52Var.g);
                    }
                }
                objArr[length2] = tk3VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (tk3Var.h(iLowestOneBit3)) {
                    int iF5 = tk3Var.f(iLowestOneBit3);
                    Object[] objArr5 = tk3Var2.d;
                    objArr5[i18] = tk3Var.d[iF5];
                    objArr5[i18 + 1] = tk3Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        ta0Var.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = tk3Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(tk3Var2)) {
                return tk3Var.e(tk3Var2) ? tk3Var : tk3Var2;
            }
        }
        return this;
    }

    public final tk3 n(int i, Object obj, int i2, q52 q52Var) {
        tk3 tk3VarN;
        int iY = 1 << oz2.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            if (s51.n(obj, this.d[iF])) {
                return p(iF, iY, q52Var);
            }
        } else if (i(iY)) {
            int iT = t(iY);
            tk3 tk3VarS = s(iT);
            if (i2 == 30) {
                j41 j41VarN = y02.N(y02.S(0, tk3VarS.d.length), 2);
                int i3 = j41VarN.f;
                int i4 = j41VarN.g;
                int i5 = j41VarN.h;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    tk3VarN = tk3VarS;
                    break;
                }
                while (!s51.n(obj, tk3VarS.d[i3])) {
                    if (i3 == i4) {
                        tk3VarN = tk3VarS;
                        break;
                    }
                    i3 += i5;
                }
                tk3VarN = tk3VarS.k(i3, q52Var);
            } else {
                tk3VarN = tk3VarS.n(i, obj, i2 + 5, q52Var);
            }
            return q(tk3VarS, tk3VarN, iT, iY, q52Var.g);
        }
        return this;
    }

    public final tk3 o(int i, Object obj, Object obj2, int i2, q52 q52Var) {
        q52 q52Var2;
        tk3 tk3VarO;
        int iY = 1 << oz2.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            return (s51.n(obj, this.d[iF]) && s51.n(obj2, x(iF))) ? p(iF, iY, q52Var) : this;
        }
        if (!i(iY)) {
            return this;
        }
        int iT = t(iY);
        tk3 tk3VarS = s(iT);
        if (i2 == 30) {
            j41 j41VarN = y02.N(y02.S(0, tk3VarS.d.length), 2);
            int i3 = j41VarN.f;
            int i4 = j41VarN.g;
            int i5 = j41VarN.h;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                tk3VarO = tk3VarS;
                q52Var2 = q52Var;
            } else {
                while (true) {
                    if (!s51.n(obj, tk3VarS.d[i3]) || !s51.n(obj2, tk3VarS.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        tk3VarO = tk3VarS.k(i3, q52Var);
                        break;
                    }
                }
                tk3VarO = tk3VarS;
                q52Var2 = q52Var;
            }
        } else {
            q52Var2 = q52Var;
            tk3VarO = tk3VarS.o(i, obj, obj2, i2 + 5, q52Var2);
        }
        return q(tk3VarS, tk3VarO, iT, iY, q52Var2.g);
    }

    public final tk3 p(int i, int i2, q52 q52Var) {
        q52Var.c(q52Var.k - 1);
        q52Var.i = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != q52Var.g) {
            return new tk3(i2 ^ this.a, this.b, oz2.m(i, objArr), q52Var.g);
        }
        this.d = oz2.m(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final tk3 q(tk3 tk3Var, tk3 tk3Var2, int i, int i2, h01 h01Var) {
        h01 h01Var2 = this.c;
        if (tk3Var2 != null) {
            return (h01Var2 == h01Var || tk3Var != tk3Var2) ? r(i, tk3Var2, h01Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (h01Var2 != h01Var) {
            return new tk3(this.a, this.b ^ i2, oz2.n(i, objArr), h01Var);
        }
        this.d = oz2.n(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final tk3 r(int i, tk3 tk3Var, h01 h01Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && tk3Var.d.length == 2 && tk3Var.b == 0) {
            tk3Var.a = this.b;
            return tk3Var;
        }
        if (this.c == h01Var) {
            objArr[i] = tk3Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = tk3Var;
        return new tk3(this.a, this.b, objArrCopyOf, h01Var);
    }

    public final tk3 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (tk3) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r13.b = w(r11, r4, (defpackage.tk3) r13.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.s4 u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk3.u(int, int, java.lang.Object, java.lang.Object):s4");
    }

    public final tk3 v(int i, int i2, Object obj) {
        tk3 tk3VarV;
        int iY = 1 << oz2.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            if (!s51.n(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new tk3(this.a ^ iY, this.b, oz2.m(iF, objArr), null);
            }
        } else {
            if (!i(iY)) {
                return this;
            }
            int iT = t(iY);
            tk3 tk3VarS = s(iT);
            if (i2 == 30) {
                j41 j41VarN = y02.N(y02.S(0, tk3VarS.d.length), 2);
                int i3 = j41VarN.f;
                int i4 = j41VarN.g;
                int i5 = j41VarN.h;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    tk3VarV = tk3VarS;
                    break;
                }
                while (!s51.n(obj, tk3VarS.d[i3])) {
                    if (i3 == i4) {
                        tk3VarV = tk3VarS;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = tk3VarS.d;
                tk3VarV = objArr2.length == 2 ? null : new tk3(0, 0, oz2.m(i3, objArr2), null);
            } else {
                tk3VarV = tk3VarS.v(i, i2 + 5, obj);
            }
            if (tk3VarV != null) {
                return tk3VarS != tk3VarV ? w(iT, iY, tk3VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new tk3(this.a, this.b ^ iY, oz2.n(iT, objArr3), null);
            }
        }
        return null;
    }

    public final tk3 w(int i, int i2, tk3 tk3Var) {
        Object[] objArr = tk3Var.d;
        if (objArr.length != 2 || tk3Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = tk3Var;
            return new tk3(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            tk3Var.a = this.b;
            return tk3Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        uj.J(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        uj.J(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new tk3(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
