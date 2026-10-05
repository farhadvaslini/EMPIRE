package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mf3 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sf3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf3(sf3 sf3Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sf3Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                long j = ((gy1) obj).a;
                return new mf3(this.l, (p40) obj2, 0).o(dm3Var);
            case 1:
                return ((mf3) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((mf3) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        sf3 sf3Var = this.l;
        switch (i) {
            case 0:
                return new mf3(sf3Var, p40Var, 0);
            case 1:
                return new mf3(sf3Var, p40Var, 1);
            default:
                return new mf3(sf3Var, p40Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0117, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        r49 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        int i;
        af afVarA;
        ax axVar;
        Object zwVar;
        hx0 hx0Var;
        Object afVar;
        CharSequence text;
        int i2;
        Spanned spanned;
        Parcel parcel;
        long j;
        af afVar2;
        int i3 = this.j;
        hx0 hx0Var2 = hx0.f;
        y50 y50Var = y50.f;
        sf3 sf3Var = this.l;
        dm3 dm3Var = dm3.a;
        switch (i3) {
            case 0:
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y02.Q(obj);
                    } else if (i4 == 2) {
                        y02.Q(obj);
                    } else {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    y02.Q(obj);
                    this.k = 1;
                    if (sf3Var.s(this) == y50Var) {
                    }
                }
                r32 r32VarA = sf3.a(sf3Var);
                if (r32VarA != null) {
                    String str = (String) r32VarA.f;
                    long j2 = ((yg3) r32VarA.g).a;
                    c72 c72Var = sf3Var.j;
                    if (c72Var != null) {
                        this.k = 2;
                        Object objG = (str.length() == 0 || yg3.c(j2)) ? dm3Var : cl3.G(c72Var.a, new n9(c72Var, new m(j2, null, c72Var, str), (p40) null, 10), this);
                        if (objG != y50Var) {
                            objG = dm3Var;
                        }
                        if (objG == y50Var) {
                        }
                    }
                }
                break;
            case 1:
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y02.Q(obj);
                    }
                    break;
                } else {
                    y02.Q(obj);
                    if (yg3.c(sf3Var.n().b) || !sf3Var.j() || (sf3Var.f instanceof j42)) {
                        i = 1;
                        afVarA = null;
                    } else {
                        afVarA = t22.A(sf3Var.n());
                        af afVarC = t22.C(sf3Var.n(), sf3Var.n().a.g.length());
                        af afVarB = t22.B(sf3Var.n(), sf3Var.n().a.g.length());
                        ye yeVar = new ye(afVarC);
                        yeVar.a(afVarB);
                        af afVarD = yeVar.d();
                        int iF = yg3.f(sf3Var.n().b);
                        sf3Var.c.h(sf3.e(afVarD, d32.f(iF, iF)));
                        sf3Var.q(hx0Var2);
                        i = 1;
                        sf3Var.a.e = true;
                    }
                    if (afVarA != null && (axVar = sf3Var.h) != null) {
                        zw zwVarA0 = lq.a0(afVarA);
                        this.k = i;
                        ((q6) axVar).a(zwVarA0);
                        if (dm3Var == y50Var) {
                        }
                    }
                }
                break;
            default:
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    ax axVar2 = sf3Var.h;
                    if (axVar2 != null) {
                        this.k = 1;
                        ClipData primaryClip = ((q6) axVar2).a.s().getPrimaryClip();
                        zwVar = primaryClip != null ? new zw(primaryClip) : null;
                        if (zwVar == y50Var) {
                        }
                    }
                } else if (i6 == 1) {
                    y02.Q(obj);
                    zwVar = obj;
                } else if (i6 == 2) {
                    y02.Q(obj);
                    afVar = obj;
                    hx0Var = hx0Var2;
                    afVar2 = (af) afVar;
                    if (afVar2 != null && sf3Var.j()) {
                        ye yeVar2 = new ye(t22.C(sf3Var.n(), sf3Var.n().a.g.length()));
                        yeVar2.a(afVar2);
                        af afVarD2 = yeVar2.d();
                        af afVarB2 = t22.B(sf3Var.n(), sf3Var.n().a.g.length());
                        ye yeVar3 = new ye(afVarD2);
                        yeVar3.a(afVarB2);
                        af afVarD3 = yeVar3.d();
                        int length = afVar2.g.length() + yg3.f(sf3Var.n().b);
                        sf3Var.c.h(sf3.e(afVarD3, d32.f(length, length)));
                        sf3Var.q(hx0Var);
                        sf3Var.a.e = true;
                    }
                } else {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                }
                zw zwVar2 = (zw) zwVar;
                if (zwVar2 != null) {
                    this.k = 2;
                    int i7 = 0;
                    ClipData.Item itemAt = zwVar2.a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        hx0Var = hx0Var2;
                        afVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i8];
                                if (s51.n(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel parcelObtain = Parcel.obtain();
                                    byte[] bArrDecode = Base64.decode(value, i7);
                                    parcelObtain.unmarshall(bArrDecode, i7, bArrDecode.length);
                                    parcelObtain.setDataPosition(i7);
                                    long j3 = wx.g;
                                    long j4 = j3;
                                    long jD = jh3.c;
                                    long jD2 = jD;
                                    xq0 xq0Var = null;
                                    vq0 vq0Var = null;
                                    wq0 wq0Var = null;
                                    String string = null;
                                    nl nlVar = null;
                                    eg3 eg3Var = null;
                                    ne3 ne3Var = null;
                                    r13 r13Var = null;
                                    while (true) {
                                        if (parcelObtain.dataAvail() <= 1) {
                                            i2 = i7;
                                        } else {
                                            byte b = parcelObtain.readByte();
                                            i2 = i7;
                                            if (b != 1) {
                                                hx0Var = hx0Var2;
                                                if (b == 2) {
                                                    if (parcelObtain.dataAvail() >= 5) {
                                                        byte b2 = parcelObtain.readByte();
                                                        if (b2 == 1) {
                                                            parcel = parcelObtain;
                                                            spanned = spanned2;
                                                            j = 4294967296L;
                                                        } else if (b2 == 2) {
                                                            parcel = parcelObtain;
                                                            spanned = spanned2;
                                                            j = 8589934592L;
                                                        } else {
                                                            parcel = parcelObtain;
                                                            spanned = spanned2;
                                                            j = 0;
                                                        }
                                                        jD = kh3.a(j, 0L) ? jh3.c : oz2.D(parcel.readFloat(), j);
                                                    }
                                                    break;
                                                } else {
                                                    parcel = parcelObtain;
                                                    spanned = spanned2;
                                                    if (b == 3) {
                                                        if (parcel.dataAvail() >= 4) {
                                                            xq0Var = new xq0(parcel.readInt());
                                                            hx0Var2 = hx0Var;
                                                            parcelObtain = parcel;
                                                            spanned2 = spanned;
                                                        }
                                                    } else if (b == 4) {
                                                        if (parcel.dataAvail() >= 1) {
                                                            byte b3 = parcel.readByte();
                                                            vq0 vq0Var2 = new vq0((b3 != 0 && b3 == 1) ? 1 : i2);
                                                            i7 = i2;
                                                            vq0Var = vq0Var2;
                                                            hx0Var2 = hx0Var;
                                                            parcelObtain = parcel;
                                                            spanned2 = spanned;
                                                        }
                                                    } else if (b == 5) {
                                                        if (parcel.dataAvail() >= 1) {
                                                            byte b4 = parcel.readByte();
                                                            if (b4 != 0) {
                                                                int i9 = b4 == 1 ? 65535 : b4 == 3 ? 2 : b4 == 2 ? 1 : i2;
                                                                wq0 wq0Var2 = new wq0(i9);
                                                                i7 = i2;
                                                                wq0Var = wq0Var2;
                                                                hx0Var2 = hx0Var;
                                                                parcelObtain = parcel;
                                                                spanned2 = spanned;
                                                            }
                                                        }
                                                    } else if (b == 6) {
                                                        string = parcel.readString();
                                                    } else {
                                                        if (b == 7) {
                                                            if (parcel.dataAvail() >= 5) {
                                                                byte b5 = parcel.readByte();
                                                                long j5 = b5 == 1 ? 4294967296L : b5 == 2 ? 8589934592L : 0L;
                                                                jD2 = kh3.a(j5, 0L) ? jh3.c : oz2.D(parcel.readFloat(), j5);
                                                            }
                                                        } else if (b == 8) {
                                                            if (parcel.dataAvail() >= 4) {
                                                                i7 = i2;
                                                                nlVar = new nl(parcel.readFloat());
                                                                hx0Var2 = hx0Var;
                                                                parcelObtain = parcel;
                                                                spanned2 = spanned;
                                                            }
                                                        } else if (b == 9) {
                                                            if (parcel.dataAvail() >= 8) {
                                                                eg3Var = new eg3(parcel.readFloat(), parcel.readFloat());
                                                                hx0Var2 = hx0Var;
                                                                parcelObtain = parcel;
                                                                spanned2 = spanned;
                                                            }
                                                        } else if (b == 10) {
                                                            if (parcel.dataAvail() >= 8) {
                                                                int i10 = wx.h;
                                                                long j6 = parcel.readLong();
                                                                long j7 = j6 & 63;
                                                                if (j7 >= 16) {
                                                                    j6 = (j6 & (-64)) | (j7 + 1);
                                                                }
                                                                j4 = j6;
                                                            }
                                                        } else if (b == 11) {
                                                            if (parcel.dataAvail() >= 4) {
                                                                int i11 = parcel.readInt();
                                                                int i12 = (i11 & 2) != 0 ? 1 : i2;
                                                                int i13 = (i11 & 1) != 0 ? 1 : i2;
                                                                ne3 ne3Var2 = ne3.d;
                                                                ne3 ne3Var3 = ne3.c;
                                                                if (i12 == 0 || i13 == 0) {
                                                                    ne3Var = i12 != 0 ? ne3Var2 : i13 != 0 ? ne3Var3 : ne3.b;
                                                                } else {
                                                                    List listL = vr.L(ne3Var2, ne3Var3);
                                                                    Integer numValueOf = Integer.valueOf(i2);
                                                                    int size = listL.size();
                                                                    for (int i14 = i2; i14 < size; i14++) {
                                                                        numValueOf = Integer.valueOf(numValueOf.intValue() | ((ne3) listL.get(i14)).a);
                                                                    }
                                                                    ne3Var = new ne3(numValueOf.intValue());
                                                                }
                                                            }
                                                        } else if (b == 12) {
                                                            if (parcel.dataAvail() >= 20) {
                                                                int i15 = wx.h;
                                                                long j8 = parcel.readLong();
                                                                long j9 = j8 & 63;
                                                                if (j9 >= 16) {
                                                                    j8 = (j8 & (-64)) | (j9 + 1);
                                                                }
                                                                i7 = i2;
                                                                hx0Var2 = hx0Var;
                                                                parcelObtain = parcel;
                                                                r13Var = new r13(j8, (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                                spanned2 = spanned;
                                                            }
                                                        }
                                                        afVar2 = (af) afVar;
                                                        if (afVar2 != null) {
                                                            ye yeVar22 = new ye(t22.C(sf3Var.n(), sf3Var.n().a.g.length()));
                                                            yeVar22.a(afVar2);
                                                            af afVarD22 = yeVar22.d();
                                                            af afVarB22 = t22.B(sf3Var.n(), sf3Var.n().a.g.length());
                                                            ye yeVar32 = new ye(afVarD22);
                                                            yeVar32.a(afVarB22);
                                                            af afVarD32 = yeVar32.d();
                                                            int length3 = afVar2.g.length() + yg3.f(sf3Var.n().b);
                                                            sf3Var.c.h(sf3.e(afVarD32, d32.f(length3, length3)));
                                                            sf3Var.q(hx0Var);
                                                            sf3Var.a.e = true;
                                                        }
                                                    }
                                                }
                                                i7 = i2;
                                                hx0Var2 = hx0Var;
                                                parcelObtain = parcel;
                                                spanned2 = spanned;
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                int i16 = wx.h;
                                                long j10 = parcelObtain.readLong();
                                                long j11 = j10 & 63;
                                                j3 = j11 < 16 ? j10 : (j10 & (-64)) | (j11 + 1);
                                            }
                                            i7 = i2;
                                        }
                                        break;
                                    }
                                    arrayList.add(new ze(spanStart, spanEnd, new h83(j3, jD, xq0Var, vq0Var, wq0Var, (zb3) null, string, jD2, nlVar, eg3Var, (qj1) null, j4, ne3Var, r13Var, 49152)));
                                } else {
                                    i2 = i7;
                                    hx0Var = hx0Var2;
                                    spanned = spanned2;
                                }
                                if (i8 != length2) {
                                    i8++;
                                    i7 = i2;
                                    hx0Var2 = hx0Var;
                                    spanned2 = spanned;
                                }
                            }
                        } else {
                            hx0Var = hx0Var2;
                        }
                        String string2 = text.toString();
                        af afVar3 = bf.a;
                        afVar = new af(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        afVar = new af(text.toString());
                        hx0Var = hx0Var2;
                    }
                    if (afVar == y50Var) {
                    }
                    afVar2 = (af) afVar;
                    if (afVar2 != null) {
                    }
                }
                break;
        }
        return dm3Var;
    }
}
