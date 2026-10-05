package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class kq implements Serializable, Comparable {
    public static final kq i = new kq(new byte[0]);
    public final byte[] f;
    public transient int g;
    public transient String h;

    public kq(byte[] bArr) {
        bArr.getClass();
        this.f = bArr;
    }

    public String a() {
        byte[] bArr = a.a;
        byte[] bArr2 = this.f;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b = bArr2[i2];
            int i4 = i2 + 2;
            byte b2 = bArr2[i2 + 1];
            i2 += 3;
            byte b3 = bArr2[i4];
            bArr3[i3] = bArr[(b & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr3[i3 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr3[i5] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i2];
            bArr3[i3] = bArr[(b4 & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        } else if (length2 == 2) {
            int i6 = i2 + 1;
            byte b5 = bArr2[i2];
            byte b6 = bArr2[i6];
            bArr3[i3] = bArr[(b5 & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i3 + 3] = 61;
        }
        return new String(bArr3, ys.a);
    }

    public int b() {
        return this.f.length;
    }

    public String c() {
        byte[] bArr = this.f;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = w7.a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kq kqVar = (kq) obj;
        kqVar.getClass();
        int iB = b();
        int iB2 = kqVar.b();
        int iMin = Math.min(iB, iB2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iE = e(i2) & 255;
            int iE2 = kqVar.e(i2) & 255;
            if (iE != iE2) {
                return iE < iE2 ? -1 : 1;
            }
        }
        if (iB == iB2) {
            return 0;
        }
        return iB < iB2 ? -1 : 1;
    }

    public byte[] d() {
        return this.f;
    }

    public byte e(int i2) {
        return this.f[i2];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kq) {
            kq kqVar = (kq) obj;
            int iB = kqVar.b();
            byte[] bArr = this.f;
            if (iB == bArr.length && kqVar.f(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i2, int i3, int i4, byte[] bArr) {
        bArr.getClass();
        if (i2 >= 0) {
            byte[] bArr2 = this.f;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (bArr2[i5 + i2] == bArr[i5 + i3]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean g(kq kqVar, int i2) {
        kqVar.getClass();
        return kqVar.f(0, 0, i2, this.f);
    }

    public String h(Charset charset) {
        charset.getClass();
        return new String(this.f, charset);
    }

    public int hashCode() {
        int i2 = this.g;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f);
        this.g = iHashCode;
        return iHashCode;
    }

    public kq i(int i2, int i3) {
        if (i2 < 0) {
            c.p("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f;
        if (i3 > bArr.length) {
            c.e(bArr.length, 41, "endIndex > length(");
            return null;
        }
        if (i3 - i2 >= 0) {
            return (i2 == 0 && i3 == bArr.length) ? this : new kq(uj.M(bArr, i2, i3));
        }
        c.p("endIndex < beginIndex");
        return null;
    }

    public kq j() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b = bArr[i2];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i2] = (byte) (b + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b2 = bArrCopyOf[i3];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i3] = (byte) (b2 + 32);
                    }
                }
                return new kq(bArrCopyOf);
            }
            i2++;
        }
    }

    public byte[] k() {
        byte[] bArr = this.f;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String l() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        byte[] bArrD = d();
        bArrD.getClass();
        String str2 = new String(bArrD, ys.a);
        this.h = str2;
        return str2;
    }

    public void m(hp hpVar, int i2) {
        hpVar.r(this.f, i2);
    }

    public String toString() {
        byte b;
        int i2;
        kq kqVar = this;
        byte[] bArr = kqVar.f;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                int i6 = i5 + 1;
                if (i5 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i4 += b2 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 < length && (b = bArr[i3]) >= 0) {
                        i3++;
                        i6 = i5 + 1;
                        if (i5 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i4 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length > i7) {
                    byte b3 = bArr[i7];
                    if ((b3 & 192) == 128) {
                        int i8 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i8 >= 128) {
                            i2 = i5 + 1;
                            if (i5 == 64) {
                                break;
                            }
                            if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                break;
                            }
                            i4 += i8 < 65536 ? 1 : 2;
                            i3 += 2;
                            i5 = i2;
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i9 = i3 + 2;
                if (length > i9) {
                    byte b4 = bArr[i3 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i9];
                        if ((b5 & 192) == 128) {
                            int i10 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i10 < 2048) {
                                if (i5 != 64) {
                                    break;
                                }
                            } else if (55296 > i10 || i10 >= 57344) {
                                i2 = i5 + 1;
                                if (i5 == 64) {
                                    break;
                                }
                                if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                    break;
                                }
                                i4 += i10 < 65536 ? 1 : 2;
                                i3 += 3;
                                i5 = i2;
                            } else if (i5 != 64) {
                                break;
                            }
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i11 = i3 + 3;
                if (length > i11) {
                    byte b6 = bArr[i3 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i3 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i11];
                            if ((b8 & 192) == 128) {
                                int i12 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i12 > 1114111) {
                                    if (i5 != 64) {
                                        break;
                                    }
                                } else if (55296 > i12 || i12 >= 57344) {
                                    if (i12 >= 65536) {
                                        i2 = i5 + 1;
                                        if (i5 == 64) {
                                            break;
                                        }
                                        if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                            break;
                                        }
                                        i4 += i12 < 65536 ? 1 : 2;
                                        i3 += 4;
                                        i5 = i2;
                                    } else if (i5 != 64) {
                                        break;
                                    }
                                } else if (i5 != 64) {
                                    break;
                                }
                            } else if (i5 != 64) {
                                break;
                            }
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if (i5 != 64) {
                break;
            }
        }
        i4 = -1;
        if (i4 != -1) {
            String strL = kqVar.l();
            String strC0 = fa3.c0(fa3.c0(fa3.c0(strL.substring(0, i4), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i4 >= strL.length()) {
                return "[text=" + strC0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strC0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + kqVar.c() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            c.e(bArr.length, 41, "endIndex > length(");
            return null;
        }
        if (64 != bArr.length) {
            kqVar = new kq(uj.M(bArr, 0, 64));
        }
        sb.append(kqVar.c());
        sb.append("…]");
        return sb.toString();
    }
}
