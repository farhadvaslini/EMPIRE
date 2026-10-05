package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a40 implements z30, b40 {
    public final /* synthetic */ int f = 0;
    public ClipData g;
    public int h;
    public int i;
    public Uri j;
    public Bundle k;

    public a40(a40 a40Var) {
        ClipData clipData = a40Var.g;
        clipData.getClass();
        this.g = clipData;
        int i = a40Var.h;
        if (i < 0) {
            Locale locale = Locale.US;
            c.p("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            c.p("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.h = i;
        int i2 = a40Var.i;
        if ((i2 & 1) == i2) {
            this.i = i2;
            this.j = a40Var.j;
            this.k = a40Var.k;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.z30
    public c40 build() {
        return new c40(new a40(this));
    }

    @Override // defpackage.b40
    public int c() {
        return this.h;
    }

    @Override // defpackage.b40
    public ClipData e() {
        return this.g;
    }

    @Override // defpackage.b40
    public int i() {
        return this.i;
    }

    @Override // defpackage.b40
    public ContentInfo k() {
        return null;
    }

    @Override // defpackage.z30
    public void n(Uri uri) {
        this.j = uri;
    }

    @Override // defpackage.z30
    public void q(int i) {
        this.i = i;
    }

    @Override // defpackage.z30
    public void setExtras(Bundle bundle) {
        this.k = bundle;
    }

    public String toString() {
        String str;
        switch (this.f) {
            case 1:
                Uri uri = this.j;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.g.getDescription());
                sb.append(", source=");
                int i = this.h;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.i;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return nc2.j(sb, this.k != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a40() {
    }
}
