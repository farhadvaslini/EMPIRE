package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q20 implements cs0 {
    public final /* synthetic */ int f;

    public /* synthetic */ q20(int i) {
        this.f = i;
    }

    @Override // defpackage.cs0
    public final Object a() {
        switch (this.f) {
            case 0:
                s20.b("LocalAutofillTree");
                throw null;
            case 1:
                s20.b("LocalAutofillManager");
                throw null;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                s20.b("LocalClipboardManager");
                throw null;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                s20.b("LocalClipboard");
                throw null;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                s20.b("LocalGraphicsContext");
                throw null;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                s20.b("LocalDensity");
                throw null;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                s20.b("LocalFocusManager");
                throw null;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                s20.b("LocalFontFamilyResolver");
                throw null;
            case 8:
                s20.b("LocalFontLoader");
                throw null;
            case vr.g /* 9 */:
                s20.b("LocalHapticFeedback");
                throw null;
            case vr.h /* 10 */:
                s20.b("LocalInputManager");
                throw null;
            case 11:
                s20.b("LocalLayoutDirection");
                throw null;
            case vr.i /* 12 */:
                s20.b("LocalProvidableLocaleList");
                throw null;
            case 13:
                s20.b("LocalTextToolbar");
                throw null;
            case 14:
                s20.b("LocalUriHandler");
                throw null;
            case jo3.g /* 15 */:
                s20.b("LocalViewConfiguration");
                throw null;
            case 16:
                s20.b("LocalWindowInfo");
                throw null;
            case 17:
                e20.b("Unexpected call to default provider");
                throw new kz();
            case 18:
                return Float.valueOf(1.0f);
            case 19:
                float f = le0.a;
                return Boolean.TRUE;
            case 20:
                return zx0.e;
            case 21:
                return q13.f;
            case 22:
                return new jd0(0.0f);
            case 23:
                return Boolean.FALSE;
            case 24:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 25:
                t20 t20Var = l11.a;
                return n80.a;
            case 26:
                r93 r93Var = r31.a;
                return Boolean.FALSE;
            case 27:
                r93 r93Var2 = s31.a;
                return null;
            case 28:
                return new jd0(48.0f);
            default:
                r93 r93Var3 = da1.a;
                return dm3.a;
        }
    }
}
